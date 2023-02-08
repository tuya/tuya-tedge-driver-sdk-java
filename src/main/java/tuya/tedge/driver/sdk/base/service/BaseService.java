package tuya.tedge.driver.sdk.base.service;

import com.alibaba.fastjson.JSONObject;
import tuya.tedge.driver.sdk.base.config.MqttConfig;
import tuya.tedge.driver.sdk.base.convert.BaseConvert;
import tuya.tedge.driver.sdk.base.convert.DriverStorageConvert;
import tuya.tedge.driver.sdk.base.dto.alert.AlertReportReqDto;
import tuya.tedge.driver.sdk.base.dto.device.AddDeviceRequestDto;
import tuya.tedge.driver.sdk.base.model.ActiveDeviceResponse;
import tuya.tedge.driver.sdk.base.dto.device.DeleteDeviceByIdRequestDto;
import tuya.tedge.driver.sdk.base.dto.device.DeviceActiveDto;
import tuya.tedge.driver.sdk.base.model.AlertLevel;
import tuya.tedge.driver.sdk.base.model.DeviceMetadata;
import tuya.tedge.driver.sdk.base.model.DeviceStatus;
import tuya.tedge.driver.sdk.base.model.GatewayInfo;
import tuya.tedge.driver.sdk.base.rpcclient.DeviceServiceClient;
import tuya.tedge.driver.sdk.base.utils.UUID;
import tuya.tedge.driver.sdk.base.rpcclient.ResourceClient;
import tuya.tedge.driver.sdk.base.config.ClientConfig;
import tuya.tedge.driver.sdk.base.mqtt.MqttClient;
import tuya.tedge.driver.sdk.base.mqttitf.MqttDriver;
import tuya.tedge.driver.sdk.base.oss.OssClient;
import tuya.tedge.driver.sdk.grpc.alert.AlertType;

import lombok.extern.slf4j.Slf4j;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class BaseService {
    protected ClientConfig clientConfig;
    protected ResourceClient resClient;
    public MqttClient mqttClient;
    protected GatewayInfo gatewayInfo;
    protected SecretKey secretKey;
    protected String serviceName;
    protected String serviceId;
    protected OssClient ossClient;
    protected final Integer contentLength = 0xFF;
    protected final BaseConvert baseConvert = new BaseConvert();
    protected final DriverStorageConvert storageConvert = new DriverStorageConvert();

    public BaseService(ClientConfig clientConfig) {
        this.clientConfig = clientConfig;
        this.resClient = new ResourceClient();
        this.resClient.init();
    }

    public void init() {
        this.gatewayInfo = resClient.getGatewayClient().GateGatewayInfo();
        this.serviceName = clientConfig.serviceConfig().getName();
        this.serviceId = clientConfig.serviceConfig().getId();

        this.ossClient = new OssClient(resClient);
    }

    public SecretKey getSecretKey() {
        if (secretKey != null) {
            return secretKey;
        }

        if (gatewayInfo != null) {
            String localKey = gatewayInfo.getLocalKey();
            secretKey = new SecretKeySpec(localKey.getBytes(StandardCharsets.UTF_8), "AES");
        }

        return secretKey;
    }

    //TODO: OnConnectHandler
    public void setMqttDriverImpl(MqttDriver mqttDriverImpl, String username) {
        MqttConfig mqttConfig =  clientConfig.mqttConfig();
        mqttConfig.updateUsername(username);

        mqttClient = new MqttClient(mqttConfig);
        mqttClient.setMqttDriverImpl(mqttDriverImpl);
    }

    protected void baseReportAlert(AlertLevel alertLevel, String content) {
        if (alertLevel == null) {
            log.error("alertLevel is nil");
        }
        if (content.length() > contentLength) {
            log.error("alert.Content length is too long, max length is {} bytes", contentLength.intValue());
        }
        resClient.getAlertClient().AlertReport(new AlertReportReqDto(
                UUID.genUuid(),
                "v1",
                serviceName,
                AlertType.DRIVER_ALERT,
                alertLevel,
                System.currentTimeMillis() / 1000,
                content
        ));
    }

    protected boolean addDevice(DeviceMetadata deviceMetadata, String serviceId, Boolean isIpc) {
        if (deviceMetadata == null) {
            log.error("addDevice deviceMetadata is null");
            return false;
        }

        if (deviceMetadata.getCid() == null || deviceMetadata.getProductId() == null) {
            log.error("addDevice cid or productId is nil");
            return false;
        }

        //添加设备
        AddDeviceRequestDto requestDto = baseConvert.deviceMetadataModel2Dto(deviceMetadata, serviceId, isIpc);
        this.resClient.getDeviceClient().AddDevice(requestDto);
        return true;
    }

    protected ActiveDeviceResponse activeDevice(DeviceMetadata deviceMetadata, String serviceId, Boolean isIpc) {
        if (!addDevice(deviceMetadata, serviceId, isIpc)) {
            log.error("activeDevice add device failed");
            return null;
        }

        List<String> l = new ArrayList<>();
        l.add(deviceMetadata.getCid());
        ActiveDeviceResponse responseDto = this.resClient.getDeviceClient().ActivateDevice(new DeviceActiveDto(l, true));
        return responseDto;
    }

    protected void baseDeleteDevice(String cid) {
        if (cid == null) {
            log.error("cid is null");
            return;
        }
        this.resClient.getDeviceClient().DeleteDeviceById(new DeleteDeviceByIdRequestDto(cid));
    }

    protected JSONObject baseGetCustomConfig() {
        String jsonStr = clientConfig.customConfig().toJson();
        return JSONObject.parseObject(jsonStr);
    }

    protected void baseReportDeviceStatus(DeviceStatus deviceStatus) {
        resClient.getDeviceClient().ReportDevicesOnlineAndOffline(deviceStatus);
    }

    protected void baseDriverProxyRegist(String id, String name, String host, String port) {
        DeviceServiceClient devServiceClient = resClient.getDeviceServiceClient();
        devServiceClient.driverProxyRegist(id, name, host, port);
    }

    protected String getNewServiceId() {
        return gatewayInfo.getGwId() + "/" + serviceId;
    }
}

package tuya.tedge.driver.sdk.dpmodel.service;

import tuya.tedge.driver.sdk.base.dto.common.*;
import tuya.tedge.driver.sdk.base.dto.product.ProductDto;
import tuya.tedge.driver.sdk.base.service.BaseServiceCallback;
import tuya.tedge.driver.sdk.base.config.*;
import tuya.tedge.driver.sdk.base.dto.device.*;
import tuya.tedge.driver.sdk.base.model.*;
import tuya.tedge.driver.sdk.base.signal.SignalExit;
import tuya.tedge.driver.sdk.dpmodel.model.*;
import tuya.tedge.driver.sdk.dpmodel.DPModelDriver;
import tuya.tedge.driver.sdk.dpmodel.dto.product.DpDto;
import tuya.tedge.driver.sdk.dpmodel.dto.command.CmdRequestDto;
import tuya.tedge.driver.sdk.grpc.device.EnumDeviceSource;

import lombok.extern.slf4j.Slf4j;

//import sun.misc.*;
import ch.qos.logback.classic.Level;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class DpModelService extends DpDriverApiImpl implements BaseServiceCallback, DpModelServiceCallback {
    private DPModelDriver dpDriverImpl;

    public DpModelService(ClientConfig config) {
        super(config);
    }

    public void setDpDriverImpl(DPModelDriver dpDriverImpl) {
        this.dpDriverImpl = dpDriverImpl;
    }

//    public void registerSignal() {
//        SignalExit handler = new SignalExit();
//        Signal.handle(new Signal("TERM"), handler);
//        Signal.handle(new Signal("INT"), handler);
//        Signal.handle(new Signal("USR1"), handler);
//        Signal.handle(new Signal("USR2"), handler);
//    }

    @Override
    public void addDeviceCallback(DeviceAddInfoDto request) {
        DeviceInfoDto deviceInfoDto = deviceConvert.deviceInfoAddDto2Dto(request);
        if (deviceInfoDto == null) {
            log.error("addDeviceCallback deviceInfoDto null, cid:{}", request.getId());
            return;
        }
        deviceCache.addDeviceInfoDto(deviceInfoDto);
        log.info("addDeviceCallback deviceCid:{}, deviceName:{}, source:{}",
                request.getId(), request.getName(), request.getSource().name());

        //设备添加请求来源不是驱动才通知驱动，否则不通知
        if (request.getSource() == EnumDeviceSource.ENUM_DEVICE_SOURCE_DRIVER) {
            return;
        }
        dpDriverImpl.deviceNotify(DeviceNotifyType.DeviceAddNotify, modelConvert.deviceInfoDto2Model(deviceInfoDto));
    }

    @Override
    public void updateDeviceCallback(DeviceUpdateInfoDto request) {
        DeviceInfoDto deviceInfoDto = deviceCache.getDeviceInfoDtoById(request.getId());
        if (deviceInfoDto == null) {
            log.error("updateDeviceCallback get deviceInfoDto null, cid:{}", request.getId());
            return;
        }
        String oldActiveStatus = deviceInfoDto.getActiveStatus();
        deviceInfoDto = deviceConvert.deviceInfoUpdateDto2Dto(deviceInfoDto, request);
        deviceCache.addDeviceInfoDto(deviceInfoDto);

        log.info("updateDeviceCallback deviceCid:{}, deviceName:{}, source:{}",
                request.getId(), request.getName(), request.getSource().name());

        //1. 来自驱动，如果是激活消息才通知。
        if (request.getSource() == EnumDeviceSource.ENUM_DEVICE_SOURCE_DRIVER) {
            if (oldActiveStatus.equals(deviceInfoDto.getActiveStatus())) {
                return;
            }
        }

        //2. 更新不是来自驱动的直接通知
        dpDriverImpl.deviceNotify(DeviceNotifyType.DeviceUpdateNotify, modelConvert.deviceInfoDto2Model(deviceInfoDto));
    }

    @Override
    public void deleteDeviceCallback(DeleteDeviceByIdRequestDto request) {
        DeviceInfoDto deviceInfoDto = deviceCache.getDeviceInfoDtoById(request.getId());
        if (deviceInfoDto != null) {
            deviceCache.removeDeviceInfoDtoById(request.getId());
            dpDriverImpl.deviceNotify(DeviceNotifyType.DeviceDeleteNotify, modelConvert.deviceInfoDto2Model(deviceInfoDto));
        }
    }

    @Override
    public void changeLogLevel(LogLevelRequestDto request) {
        Level level;
        switch (request.getLogLevel()) {
            case ENUM_LOG_LEVEL_DEBUG:
                level = Level.DEBUG;
                break;
            case ENUM_LOG_LEVEL_INFO:
                level = Level.INFO;
                break;
            case ENUM_LOG_LEVEL_WARNING:
                level = Level.WARN;
                break;
            case ENUM_LOG_LEVEL_ERROR:
                level = Level.ERROR;
                break;
            default:
                log.error("changeLogLevel Invalid LogLevel:{}", request.getLogLevel().getValue());
                return;
        }

        LoggerConfig.dynamicUpdateLoggerLevel(level);
    }

    @Override
    public void updateProductCallback(ProductDto request) {
        if (request == null) {
            return;
        }
        productCache.updateProduct(request);
        dpDriverImpl.productNotify(ProductNotifyType.ProductUpdateNotify, modelConvert.productDto2Model(request));
    }

    @Override
    public void issueCommand(CmdRequestDto request) {
        if (request == null) {
            return;
        }

        String cid = request.getCid();
        Map<String, ProtocolProperties> protocolsMap = null;
        Map<String, DpExtend> dpExtendMap = new HashMap<>();
        CommandRequest req = modelConvert.cmdRequestDto2Model(request);
        switch (request.getProtocol()) {
            case PROTOCOL_5:
                DeviceInfoDto dev = deviceCache.getDeviceInfoDtoById(request.getCid());
                if (dev == null) {
                    log.error("can't find device ,cid{}", cid);
                    return;
                }
                protocolsMap = dev.getProtocolsMap();
                Object dps = req.getData().get("dps");
                if (dps == null) {
                    log.error("dps not found");
                    break;
                }
                Map<String, Object> dpsMap;
                if (dps instanceof Map) {
                    dpsMap = (Map<String, Object>) dps;
                } else {
                    log.error("dps isn't Map type");
                    return;
                }
                for (Map.Entry<String, Object> e : dpsMap.entrySet()) {
                    DpDto dp = productCache.getDpDtoByPIdAndDpId(dev.getProductId(), e.getKey());
                    if (dp == null) {
                        continue;
                    }
                    if ("ro".equals(dp.getProperties().getReadWrite())) {
                        log.error("dp:{} not support issue", dp.getId());
                        continue;
                    }
                    dpExtendMap.put(e.getKey(), new DpExtend(dp.getProperties(), dp.getAttributes()));
                }

                break;
            case PROTOCOL_64:
            case PROTOCOL_302:
            case PROTOCOL_312:
                if (cid == null || "".equals(cid)) {
                    break;
                }
                dev = deviceCache.getDeviceInfoDtoById(request.getCid());
                if (dev == null) {
                    log.error("can't find device ,cid{}", cid);
                    return;
                }
                protocolsMap = dev.getProtocolsMap();
                break;
            default:
                log.error("Invalid protocol type:{}", request.getProtocol());
                return;
        }

        this.dpDriverImpl.handleCommands(cid, req, modelConvert.propertiesMapDto2Model(protocolsMap), dpExtendMap);
    }

    @Override
    public void gatewayStateCallback(GatewayStateDto request) {
        this.gatewayInfo.setCloudState(request.getState());
    }
}

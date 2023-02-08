package tuya.tedge.driver.sdk.dpmodel.service;

import tuya.tedge.driver.sdk.base.model.*;
import tuya.tedge.driver.sdk.base.cache.DeviceCache;
import tuya.tedge.driver.sdk.base.utils.PrintException;
import tuya.tedge.driver.sdk.base.config.ClientConfig;
import tuya.tedge.driver.sdk.base.convert.DeviceConvert;
import tuya.tedge.driver.sdk.base.dto.device.DeviceInfoDto;
import tuya.tedge.driver.sdk.base.dto.product.ProductDto;
import tuya.tedge.driver.sdk.base.utils.UUID;
import tuya.tedge.driver.sdk.base.utils.ByteConvert;
import tuya.tedge.driver.sdk.base.oss.OssInterface;
import tuya.tedge.driver.sdk.base.service.BaseService;
import tuya.tedge.driver.sdk.dpmodel.dto.UploadImageResp;
import tuya.tedge.driver.sdk.dpmodel.cache.DpProductCache;
import tuya.tedge.driver.sdk.dpmodel.convert.ModelConvert;
import tuya.tedge.driver.sdk.dpmodel.DpDriverApi;
import tuya.tedge.driver.sdk.dpmodel.dto.event.*;
import tuya.tedge.driver.sdk.dpmodel.dto.product.DpDto;
import tuya.tedge.driver.sdk.dpmodel.model.*;
import tuya.tedge.driver.sdk.grpc.device.DeviceUpdateInfo;
import tuya.tedge.driver.sdk.grpc.device.EnumDeviceSource;
import tuya.tedge.driver.sdk.grpc.device.UpdateDeviceRequest;
import tuya.tedge.driver.sdk.grpc.driverstorage.*;

import org.eclipse.paho.client.mqttv3.IMqttMessageListener;
import org.eclipse.paho.client.mqttv3.MqttException;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.protobuf.ByteString;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.content.ByteArrayBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import lombok.extern.slf4j.Slf4j;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

@Slf4j
public class DpDriverApiImpl extends BaseService implements DpDriverApi {
    protected DeviceCache deviceCache;
    protected DpProductCache productCache;
    protected final Integer FaultMask = 0x3FFFFFFF;
    protected final DeviceConvert deviceConvert;
    protected final ModelConvert modelConvert = new ModelConvert();

    public DpDriverApiImpl(ClientConfig config) {
        super(config);
        this.deviceCache = new DeviceCache(this.resClient, this.clientConfig);
        this.productCache = new DpProductCache(this.resClient, this.clientConfig);
        this.deviceConvert = new DeviceConvert();
    }

    @Override
    public void init() {
        super.init();
    }

    public void initCache() {
        this.deviceCache.initCache();
        this.productCache.initCache();
    }

    @Override
    public JSONObject getCustomConfig() {
        return baseGetCustomConfig();
    }

    @Override
    public ActiveDeviceResponse activeDevice(DeviceMetadata deviceMetadata) {
        if (!paramsCheck(deviceMetadata)) {
            return null;
        }

        String cid = deviceMetadata.getCid();
        DeviceInfoDto devDto = deviceCache.getDeviceInfoDtoById(cid);
        if (devDto != null) {
            log.warn("activeDevice cid:{} already exist, do nothing!", cid);
            return null;
        }

        return activeDevice(deviceMetadata, deviceCache.getDeviceServiceInfo().getId(), false);
    }

    @Override
    public Boolean setDeviceProperty(String cid, DeviceUpdateProperty property) {
        if (!paramsCheck(cid, property)) {
            return false;
        }
        final DeviceInfoDto dto = deviceCache.getDeviceInfoDtoById(cid);
        if (dto == null) {
            log.error("device({}) can't found", cid);
            return false;
        }

        final DeviceUpdateInfo.Builder builder = DeviceUpdateInfo.newBuilder();
        if (property.getInstallLocation() != null) {
            builder.setInstallLocation(property.getInstallLocation());
            dto.setInstallLocation(property.getInstallLocation());
        }
        if (property.getExtendData() != null) {
            builder.setExtendData(JSON.toJSONString(property.getExtendData()));
            dto.setExtendData(property.getExtendData());
        }
        builder.setSource(EnumDeviceSource.ENUM_DEVICE_SOURCE_DRIVER);

        resClient.getDeviceClient().UpdateDevice(
                UpdateDeviceRequest.newBuilder()
                        .setUpdateDevice(builder.setId(cid).build()).build());

        deviceCache.updateDeviceInfoDto(dto);
        return true;
    }

    @Override
    public Boolean setDeviceBaseAttr(String cid, DeviceUpdateProperty property) {
        final DeviceInfoDto dto = deviceCache.getDeviceInfoDtoById(cid);
        if (dto == null) {
            log.error("device({}) can't found", cid);
            return false;
        }

        final DeviceUpdateInfo.Builder builder = DeviceUpdateInfo.newBuilder();
        if (property.getName() != null) {
            builder.setName(property.getName());
            dto.setName(property.getName());
        }
        if (property.getIp() != null) {
            builder.setIp(property.getIp());
            dto.setIp(property.getIp());
        }
        if (property.getLat() != null) {
            builder.setLat(property.getLat());
            dto.setLat(property.getLat());
        }
        if (property.getLon() != null) {
            builder.setLon(property.getLon());
            dto.setLon(property.getLon());
        }
        builder.setSource(EnumDeviceSource.ENUM_DEVICE_SOURCE_DRIVER);

        resClient.getDeviceClient().UpdateDevice(
                UpdateDeviceRequest.newBuilder()
                        .setUpdateDevice(builder.setId(cid).build()).build());
        deviceCache.updateDeviceInfoDto(dto);
        return true;
    }

    @Override
    public Boolean addDevice(DeviceMetadata deviceMetadata) {
        if (!paramsCheck(deviceMetadata)) {
            return false;
        }
        return addDevice(deviceMetadata, deviceCache.getDeviceServiceInfo().getId(), false);
    }

    @Override
    public void deleteDevice(String cid) {
        if (!paramsCheck(cid)) {
            return;
        }
        baseDeleteDevice(cid);
        deviceCache.removeDeviceInfoDtoById(cid);
    }

    @Override
    public void reportDeviceStatus(DeviceStatus deviceStatus) {
        if (!paramsCheck(deviceStatus)) {
            return;
        }
        baseReportDeviceStatus(deviceStatus);

        if (deviceStatus.getOnline() != null) {
            for (String onlineCid : deviceStatus.getOnline()) {
                DeviceInfoDto dto = deviceCache.getDeviceInfoDtoById(onlineCid);
                if (dto != null) {
                    dto.setOnlineStatus(DeviceOnlineStatus.Online.getValue());
                    deviceCache.updateDeviceInfoDto(dto);
                }
            }
        }

        if (deviceStatus.getOffline() != null) {
            for (String offlineCid : deviceStatus.getOffline()) {
                DeviceInfoDto dto = deviceCache.getDeviceInfoDtoById(offlineCid);
                if (dto != null) {
                    dto.setOnlineStatus(DeviceOnlineStatus.Offline.getValue());
                    deviceCache.updateDeviceInfoDto(dto);
                }
            }
        }
    }

    @Override
    public void reportWithDPData(String cid, List<DpData> dpDataList) {
        if (!paramsCheck(cid, dpDataList)) {
            return;
        }

        DeviceInfoDto deviceInfoDto = deviceCache.getDeviceInfoDtoById(cid);
        if (deviceInfoDto == null) {
            log.warn("reportWithDPData device:{} can't found in device cache", cid);
            return;
        }
        String pid = deviceInfoDto.getProductId();

        List<BaseReadingDto> baseReadingDtoList = new ArrayList<>();
        for (DpData withDpData : dpDataList) {
            if (withDpData == null) {
                log.error("reportWithDPData withDpDate is null");
                return;
            }

            //比较dp点类型
            String dpId = withDpData.getDpId();
            DpDto dpDto = productCache.getDpDtoByPIdAndDpId(pid, dpId);
            if ("".equals(dpDto.getId())) {
                log.error("reportWithDPData can't found pid:{}, dpId:{}", pid, dpId);
                return;
            }

            DataType dpType = withDpData.getDpType();
            DataType dtoType = dpDto.getProperties().getType();
            if (!dpType.equals(dtoType)) {
                log.error("reportWithDPData DpId:{}, dpType:{} error, want:{}", dpId, dpType, dtoType);
                return;
            }

            byte[] binaryValue = null;
            switch (dpType) {
                case TypeValue:
                    Object dpValue = withDpData.getDpValue();
                    if (dpValue instanceof Long) {
                        Long finalValue = (Long) withDpData.getDpValue();
                        if (!checkNumber(dpDto, finalValue)) {
                            return;
                        }
                    } else {
                        log.error("reportWithDPData DpId: " + dpId + ",does not supported type：" + dpValue.getClass().getTypeName() +
                                ",this dp only supported Long");
                        return;
                    }
                    break;
                case TypeBool:
                    if (!(withDpData.getDpValue().toString().equals("false")) && !(withDpData.getDpValue().toString().equals("true"))) {
                        log.error("reportWithDPData DpId: " + dpDto.getId() + " should be 'false' or 'true'");
                        return;
                    }
                    break;
                case TypeString:
                case TypeEnum:
                    break;
                case TypeBitmap:
                case TypeFault:
                    dpValue = withDpData.getDpValue();
                    //判断类型
                    if (dpValue instanceof Integer) {
                    } else if (dpValue instanceof String[]) {
                        String[] v = (String[]) withDpData.getDpValue();
                        //将数据转换一下
                        Integer result = 0;
                        List<String> faultList = dpDto.getProperties().getFault();
                        for (String s : v) {
                            if (s.length() == 0) {
                                continue;
                            }
                            for (int i = 0; i < faultList.size(); i++) {
                                if (s.equals(faultList.get(i))) {
                                    result |= 1 << i;
                                    break;
                                }
                            }
                        }
                        result = result & FaultMask;
                        if (result <= 0) {
                            log.error("reportWithDPData DpId: " + dpDto.getId() + ",string[] value not in fault list");
                            continue;
                        }
                        withDpData.setDpValue(result);
                    } else {
                        log.error("reportWithDPData DpId: " + dpDto.getId() + ",does not supported type：" + dpValue.getClass().getTypeName() +
                                ",this dp only supported: Byte Short Integer String[]");
                    }
                    break;
                case TypeRaw:
                    dpValue = withDpData.getDpValue();
                    if (dpValue instanceof Byte[]) {
                        Byte[] a = (Byte[]) withDpData.getDpValue();
                        binaryValue = new byte[a.length];
                        for (int i = 0; i < binaryValue.length; i++) {
                            binaryValue[i] = a[i];
                        }
                    } else if (dpValue instanceof byte[]) {
                        binaryValue = (byte[]) withDpData.getDpValue();
                    } else {
                        binaryValue = ByteConvert.toByteArray(withDpData.getDpValue());
                    }
                    break;
                default:
                    log.error("reportWithDPData dpId:{}, Invalid Type:{}", dpId, dpDto.getProperties().getType());
                    return;
            }

            //初始化reading
            BinaryReadingDto binaryR = null;
            SimpleReadingDto simpleR = null;
            if (dpType.equals(DataType.TypeRaw)) {
                binaryR = new BinaryReadingDto("", binaryValue);
            } else {
                simpleR = new SimpleReadingDto(withDpData.getDpValue().toString());
            }

            Long t = System.currentTimeMillis() / 1000;
            baseReadingDtoList.add(new
                    BaseReadingDto(tuya.tedge.driver.sdk.base.utils.UUID.genUuid(),
                    t,
                    t,
                    cid,
                    dpDto.getId(),
                    deviceInfoDto.getProductId(),
                    dpDto.getProperties().getType().getValue(),
                    binaryR,
                    simpleR
            ));
        }

        if (baseReadingDtoList.size() == 0) {
            return;
        }

        Long t = System.currentTimeMillis() / 1000;
        EventDto eventDto = new EventDto(
                UUID.genUuid(),
                cid,
                deviceInfoDto.getProductId(),
                t,
                t,
                baseReadingDtoList
        );

        List<EventDto> eventDtoList = new ArrayList<>();
        eventDtoList.add(eventDto);
        resClient.getEventClient().Adds(eventDtoList);
    }

    @Override
    public void reportWithoutDPData(NonDpData data) {
        if (!paramsCheck(data)) {
            return;
        }
        String topic = "smart/device/out/" + gatewayInfo.getGwId();
        WithoutDpReportDto dpReport = new WithoutDpReportDto(topic, data.getProtocol(), data.getS(), data.getT(), JSON.toJSONBytes(data.getData()));
        this.resClient.getEventClient().WithoutDpReportDto(dpReport);
    }

    @Override
    public void reportWithoutDPDataWithTopic(String topic, NonDpData data) {
        if (!paramsCheck(topic, data)) {
            return;
        }
        WithoutDpReportDto dpReport = new WithoutDpReportDto(topic, data.getProtocol(), data.getS(), data.getT(), JSON.toJSONBytes(data.getData()));
        this.resClient.getEventClient().WithoutDpReportDto(dpReport);
    }

    @Override
    public Map<String, DeviceInfo> allDevices() {
        Map<String, DeviceInfo> deviceInfo = new HashMap<>();
        Map<String, DeviceInfoDto> dtoMap = deviceCache.getDeviceInfoDtoMap();
        if (dtoMap == null) {
            return deviceInfo;
        }
        dtoMap.forEach((k, v) -> deviceInfo.put(k, modelConvert.deviceInfoDto2Model(v)));
        return deviceInfo;
    }

    @Override
    public Map<String, DeviceInfo> getActiveDevices() {
        Map<String, DeviceInfo> deviceInfo = new HashMap<>();
        Map<String, DeviceInfoDto> dtoMap = deviceCache.getDeviceInfoDtoMap();
        if (dtoMap == null) {
            return deviceInfo;
        }
        dtoMap.forEach((k, v) -> {
            if (v.getActiveStatus().equals(DeviceStatus.DeviceActiveStatusActivated)) {
                deviceInfo.put(k, modelConvert.deviceInfoDto2Model(v));
            }
        });
        return deviceInfo;
    }

    @Override
    public DeviceInfo getDeviceById(String cid) {
        if (!paramsCheck(cid)) {
            return null;
        }
        DeviceInfoDto deviceInfoDto = deviceCache.getDeviceInfoDtoById(cid);
        return modelConvert.deviceInfoDto2Model(deviceInfoDto);
    }

    @Override
    public Boolean addProduct(ProductMetadata productMetadata) {
        if (!paramsCheck(productMetadata)) {
            return false;
        }
        if (productMetadata.getId() == null) {
            log.error("addProduct productId is null");
            return false;
        }
        final ProductDto p = productCache.getProductDtoById(productMetadata.getId());
        if (p != null) {
            log.warn("addProduct productId:{} already exist", p.getId());
            return false;
        }

        ProductDto productDto = baseConvert.productMetadataModel2Dto(productMetadata, deviceCache.getDeviceServiceInfo().getDeviceLibraryId());
        if (productDto == null) {
            return false;
        }
        resClient.getProductClient().ProductAdd(productDto);

        productCache.addProductDto(productDto);
        return true;
    }

    @Override
    public Map<String, ProductInfo> allProducts() {
        Map<String, ProductInfo> ret = new HashMap<>();

        Map<String, ProductDto> dtoMap = productCache.getProductMap();
        if (dtoMap == null) {
            return ret;
        }
        dtoMap.forEach((k, v) -> ret.put(k, modelConvert.productDto2Model(v)));
        return ret;
    }

    @Override
    public ProductInfo getProductById(String productId) {
        if (!paramsCheck(productId)) {
            return null;
        }
        ProductDto productDto = productCache.getProductDtoById(productId);
        return modelConvert.productDto2Model(productDto);
    }

    @Override
    public void reportAlert(AlertLevel alertLevel, String content) {
        if (!paramsCheck(alertLevel, content)) {
            return;
        }
        super.baseReportAlert(alertLevel, content);
    }

    @Override
    public GatewayInfo getGatewayInfo() {
        return gatewayInfo;
    }

    @Override
    public String getServiceId() {
        return serviceId;
    }

    @Override
    public String reportThroughHttp(String api, String version, Map<String, Object> payload) {
        return resClient.getEventClient().HttpReportData(api, version, payload);
    }

    private void cmdResultUpload(Long sn, Integer success, String message) {
        Map<String, Object> requestMap = new HashMap<>();
        requestMap.put("sn", sn);
        requestMap.put("success", success);
        requestMap.put("message", message);

        String api = ReportHttpType.HTTP_API_EG_SYNCDATA_RESULT.getValue();
        String msg = reportThroughHttp(api, "1.0", requestMap);
        log.info("type:{}, cmdResultUpload result:{}", api, msg);
    }

    @Override
    public void cmdRespSuccess(Long sn) {
        if (!paramsCheck(sn)) {
            return;
        }
        cmdResultUpload(sn, 1, "ok");
    }

    @Override
    public void cmdRespFail(Long sn, String message) {
        if (!paramsCheck(sn, message)) {
            return;
        }
        cmdResultUpload(sn, 0, message);
    }

    //////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public String uploadFile(byte[] content, String fileName, String subjectType, Integer timeout) {
        if (!paramsCheck(fileName, content, subjectType, timeout)) {
            return null;
        }
        //获取token
        Map<String, Object> reqBodyMap = new HashMap<>();
        if ("".equals(subjectType)) {
            reqBodyMap.put("subjectType", "edgegateway_alarmImg");
        } else {
            reqBodyMap.put("subjectType", subjectType);
        }
        String resp = resClient.getEventClient().HttpReportData(ReportHttpType.HTTP_API_EDGE_UPLOAD_TOKEN.getValue(), "1.0", reqBodyMap);
        if (resp == null) {
            log.error("can't get token");
            return null;
        }
        UploadTokenResp token = JSON.parseObject(resp, UploadTokenResp.class);
        if (token == null) {
            log.error("can't parseObject UploadTokenResp");
            return null;
        }
        //预发环境则重新组装url
        UploadTokenInfo result = token.getResult();
        if ("pre".equals(gatewayInfo.getEnv())) {
            try {
                URL u = new URL(result.getUploadUrl());
                if (u.getPort() != 7799) {
                    String preUrl = u.getHost() + "://" + u.getHost() + ":7799" + u.getPath();
                    result.setUploadUrl(preUrl);
                }
            } catch (MalformedURLException e) {
                log.error(e.getMessage());
                return null;
            }
        }
        //上传文件
        String respJsonData = uploadFileData(
                result.getUploadUrl(),
                content,
                result.getToken(),
                fileName,
                timeout
        );
        //解析responseData
        UploadImageResp imageResp = null;
        if (!"".equals(respJsonData)) {
            imageResp = JSON.parseObject(respJsonData, UploadImageResp.class);
        }
        String imageID = "";
        if (imageResp != null && imageResp.getResult() != null) {
            imageID = imageResp.getResult().getTmpFileId();
        }
        log.info("UploadFile Result: {imageID:{}}, {resp:{}}", imageID, imageResp);
        return imageID;
    }

    @Override
    public OssResult uploadFileV2(String cid, String fileName, byte[] content, Integer timeout) {
        final OssInterface ossClient = this.ossClient.getOssClient(cid, timeout);
        return ossClient.uploadFile(fileName, content);
    }

    //////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public Map<String, byte[]> GetKV(String[] keys) {
        if (!paramsCheck((Object) keys) || keys.length == 0) {
            return null;
        }

        String gServiceId = getNewServiceId();
        //log.info("GetKV gServiceId:{}", gServiceId);
        final GetReq.Builder getReq = GetReq.newBuilder();
        getReq.setDriverServiceId(gServiceId);
        for (String key : keys) {
            getReq.addKeys(key);
        }

        KVs kvs = resClient.getDriverStorageClient().get(getReq.build());
        return storageConvert.convertKVs2Map(kvs);
    }

    @Override
    public Boolean PutKv(Map<String, byte[]> kvs) {
        if (!paramsCheck(kvs)) {
            return false;
        }

        String gServiceId = getNewServiceId();
        //log.info("PutKv gServiceId:{}", gServiceId);
        final PutReq.Builder putReq = PutReq.newBuilder();
        putReq.setDriverServiceId(gServiceId);

        for (String key : kvs.keySet()) {
            byte[] value = kvs.get(key);
            if (value.length == 0) {
                continue;
            }

            KV.Builder kvBuilder = KV.newBuilder();
            kvBuilder.setKey(key);
            kvBuilder.setValue(ByteString.copyFrom(value));
            putReq.addData(kvBuilder.build());
        }

        return resClient.getDriverStorageClient().put(putReq.build());
    }

    @Override
    public Boolean DeleteKV(String[] keys) {
        if (!paramsCheck((Object) keys) || keys.length == 0) {
            return false;
        }

        String gServiceId = getNewServiceId();
        final DeleteReq.Builder deleteReq = DeleteReq.newBuilder();
        deleteReq.setDriverServiceId(gServiceId);
        for (String k : keys) {
            deleteReq.addKeys(k);
        }
        return resClient.getDriverStorageClient().delete(deleteReq.build());
    }

    @Override
    public String[] GetKVKeys(String prefix) {
        String gServiceId = getNewServiceId();
        GetPrefixReq.Builder prefixReq = GetPrefixReq.newBuilder();
        prefixReq.setDriverServiceId(gServiceId);
        prefixReq.setPrefix(prefix);

        Keys keys = resClient.getDriverStorageClient().getKeys(prefixReq.build());
        if (keys == null) {
            return null;
        }

        String[] result = new String[keys.getKeyCount()];
        for (int i = 0; i < keys.getKeyCount(); i++) {
            result[i] = keys.getKey(i);
        }
        return result;
    }

    @Override
    public Map<String, byte[]> QueryKV(String prefix) {
        String[] keys = GetKVKeys(prefix);
        if (keys == null) {
            return null;
        }

        return GetKV(keys);
    }

    @Override
    public byte[] GetKVOne(String key) {
        String[] keys = {key};
        Map<String, byte[]> result = GetKV(keys);
        if (result != null) {
            return result.get(key);
        }
        return null;
    }

    // PutKVOne 存储驱动的自定义内容，不支持云端备份
    @Override
    public Boolean PutKVOne(String key, byte[] value) {
        Map<String, byte[]> kvs = new HashMap<>();
        kvs.put(key, value);
        return PutKv(kvs);
    }

    @Override
    public Map<String, byte[]> GetBackupKV(String[] keys) {
        if (!paramsCheck((Object) keys) || keys.length == 0) {
            return null;
        }

        String gServiceId = getNewServiceId();
        final GetReq.Builder getReq = GetReq.newBuilder();
        getReq.setDriverServiceId(gServiceId);
        for (String key : keys) {
            getReq.addKeys(key);
        }

        KVs kvs = resClient.getDriverStorageClient().getV2(getReq.build());
        return storageConvert.convertKVs2Map(kvs);
    }

    // GetBackupKV 根据key获取KV存储，支持云端备份
    @Override
    public byte[] GetBackupKVOne(String key) {
        String[] keys = {key};
        Map<String, byte[]> result = GetBackupKV(keys);
        if (result != null) {
            return result.get(key);
        }

        return null;
    }

    // GetBackupKVKeys 根据前缀获取keys，传空返回所有的结果，支持云端备份
    @Override
    public String[] GetBackupKVKeys(String prefix) {
        String gServiceId = getNewServiceId();
        GetPrefixReq.Builder prefixReq = GetPrefixReq.newBuilder();
        prefixReq.setDriverServiceId(gServiceId);
        prefixReq.setPrefix(prefix);

        Keys keys = resClient.getDriverStorageClient().getKeysV2(prefixReq.build());
        if (keys == null) {
            return null;
        }

        String[] result = new String[keys.getKeyCount()];
        for (int i = 0; i < keys.getKeyCount(); i++) {
            result[i] = keys.getKey(i);
        }
        return result;
    }

    // PutBackupKV 更新KV存储，支持云端备份
    @Override
    public Boolean PutBackupKV(Map<String, byte[]> kvs) {
        if (!paramsCheck(kvs)) {
            return false;
        }

        String gServiceId = getNewServiceId();
        final PutReq.Builder putReq = PutReq.newBuilder();
        putReq.setDriverServiceId(gServiceId);

        for (String key : kvs.keySet()) {
            byte[] value = kvs.get(key);
            if (value.length == 0) {
                continue;
            }

            KV.Builder kvBuilder = KV.newBuilder();
            kvBuilder.setKey(key);
            kvBuilder.setValue(ByteString.copyFrom(value));
            putReq.addData(kvBuilder.build());
        }
        return resClient.getDriverStorageClient().putV2(putReq.build());
    }

    // PutBackupKVOne 更新KV存储，支持云端备份
    @Override
    public Boolean PutBackupKVOne(String key, byte[] value) {
        if (value.length == 0) {
            return false;
        }

        Map<String, byte[]> kvs = new HashMap<>();
        kvs.put(key, value);
        return PutBackupKV(kvs);
    }

    // QueryBackupKV 根据前缀搜索KV存储，传空返回所有的结果，支持云端备份
    @Override
    public Map<String, byte[]> QueryBackupKV(String prefix) {
        String[] keys = GetBackupKVKeys(prefix);
        if (keys == null) {
            return null;
        }

        return GetBackupKV(keys);
    }

    // DelBackupKV 删除KV存储，支持云端备份
    @Override
    public Boolean DelBackupKV(String[] keys) {
        if (!paramsCheck((Object) keys) || keys.length == 0) {
            return false;
        }

        String gServiceId = getNewServiceId();
        final DeleteReq.Builder deleteReq = DeleteReq.newBuilder();
        deleteReq.setDriverServiceId(gServiceId);
        for (String k : keys) {
            deleteReq.addKeys(k);
        }
        return resClient.getDriverStorageClient().deleteV2(deleteReq.build());
    }

    //////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public Boolean Publish(String topic, byte[] payload, Byte qos, Boolean retained) {
        return mqttClient.Publish(topic, payload, qos, retained);
    }

    @Override
    public Boolean SubScribe(String topic, Byte qos, IMqttMessageListener listener) throws MqttException {
        return mqttClient.Subscribe(topic, qos, listener);
    }

    @Override
    public Boolean UnSubscribe(String topic) {
        String[] topics = {topic};
        return mqttClient.UnSubscribe(topics);
    }

    private Boolean paramsCheck(Object... o) {
        for (Object v : o) {
            if (v != null) {
                continue;
            }
            log.error("params is null");
            return false;
        }
        return true;
    }

    private String uploadFileData(String urlStr, byte[] data, String token, String fileName, Integer timeout) {
        try {
            CloseableHttpClient context = HttpClients.createDefault();
            HttpPost post = new HttpPost(urlStr);
            if (timeout > 0) {
                RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(timeout).setSocketTimeout(timeout).build();
                post.setConfig(requestConfig);
            }
            post.addHeader("file_upload_token", token);
            HttpEntity reqEntity = MultipartEntityBuilder.create()
                    .addPart("file", new ByteArrayBody(data, fileName))
                    .build();
            post.setEntity(reqEntity);
            HttpResponse response = context.execute(post);
            String res = "";
            //获取参数
            if (response != null) {
                res = EntityUtils.toString(response.getEntity());
            }
            return res;
        } catch (Exception e) {
            PrintException.printStack(e);
        }
        return "";
    }

    @Override
    public void RegistDriverProxy(ProxyInfo proxyInfo) {
        String serviceId = super.serviceId;
        String serviceName = super.serviceName;
        super.baseDriverProxyRegist(serviceId, serviceName, proxyInfo.getHost(), Integer.toString(proxyInfo.getPort()));
        log.info("RegistDriverProxy serviceId:{}, serviceName:{}, host:{}, port:{}",
                serviceId, serviceName, proxyInfo.getHost(), proxyInfo.getPort());
    }

    private Boolean checkNumber(DpDto dpDto, Long dpValue) {
        //检查值大小
        if ((dpDto.getProperties().getMinimum() > dpValue) || (dpDto.getProperties().getMaximum() < dpValue)) {
            log.error("checkNumber DpId: " + dpDto.getId() + ",dpValue:" + dpValue +
                    ",Ranges:" + dpDto.getProperties().getMinimum() + " <= " + "dpValue" + " <= " + dpDto.getProperties().getMaximum());
            return false;
        }
        return true;
    }
}

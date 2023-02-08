#常用 SDK API(DP模型)

####创建驱动服务
```java
public class DpDriverService {
    //创建驱动服务
    public DpDriverService(String[] args) throws Exception {
        //...
    }

    //获取TEdge边缘网关运行模式
    public GatewayDataModel getTEdgeModel() {
        //...
    }

    //设置MqttDriver接口
    public DpDriverService setMqttDriverImpl(MqttDriver mqttDriverImpl, String username) {
        //...
    }

    //启动驱动服务
    public DpDriverService start(DPModelDriver dpDriverImpl) {
        //...
    }

    //获取SDK API 接口
    public DpDriverApi getDpDriverApi() {
        //...
    }
}
```

###SDK 核心 API 列表
```java
public interface DpDriverApi {
    /**
     * 获取专家模式中的自定义配置项
     *
     * @return JSONObject
     */
    JSONObject getCustomConfig();

    /**
     * 新增并激活一个设备
     *
     * @param deviceMetadata
     * @return
     */
    ActiveDeviceResponse activeDevice(DeviceMetadata deviceMetadata);

    /**
     * SetDeviceExtendProperty 更新子设备附加属性，重复调用会覆盖之前的值
     *
     * @param cid
     * @param deviceUpdateProperty
     */
    Boolean setDeviceProperty(String cid, DeviceUpdateProperty deviceUpdateProperty);

    /**
     * setDeviceBaseAttr 更新子设备名，activeDevice 接口激活子设备成功后，应当调用该接口更新子设备名
     *
     * @param cid
     * @param deviceUpdateProperty
     */
    Boolean setDeviceBaseAttr(String cid, DeviceUpdateProperty deviceUpdateProperty);

    /**
     * 删除一个子设备
     *
     * @param cid
     */
    void deleteDevice(String cid);

    /**
     * 上报子设备在线状态
     *
     * @param deviceStatus
     */
    void reportDeviceStatus(DeviceStatus deviceStatus);

    /**
     * 上报设备dp点的数据
     *
     * @param cid
     * @param dpDataList
     */
    void reportWithDPData(String cid, List<DpData> dpDataList);
    
    /**
     * 获取该驱动下的所有设备
     *
     * @return
     */
    Map<String, DeviceInfo> allDevices();

    /**
     * 获取该驱动下的所有已激活的子设备
     *
     * @return
     */
    Map<String, DeviceInfo> getActiveDevices();

    /**
     * 通过设备id获取设备信息
     *
     * @param cid
     * @return
     */
    DeviceInfo getDeviceById(String cid);

    /**
     * 新增一个产品
     *
     * @param productMetadata
     */
    Boolean addProduct(ProductMetadata productMetadata);

    /**
     * 获取该驱动下所有产品
     * @return
     */
    Map<String, ProductInfo> allProducts();

    /**
     * 通过产品id获取产品
     *
     * @param productId
     * @return
     */
    ProductInfo getProductById(String productId);

    /**
     * reportAlert 驱动上报告警信息
     *
     * @param alertLevel
     * @param content
     */
    void reportAlert(AlertLevel alertLevel, String content);

    /**
     * getServiceId 获取驱动实例编号
     */
    String getServiceId();

    /**
     * getGatewayInfo 获取网关信息
     */
    GatewayInfo getGatewayInfo();

    ////////////////////////////////////////////////////////////////////////////////////////
    /**
     * ReportThroughHttp 通过http接口上报自定义消息
     *
     * @param api
     * @param version
     * @param payload
     * @return
     */
    String reportThroughHttp(String api, String version, Map<String, Object> payload);

    /**
     * CmdRespSuccess 上报指令执行结果：成功，具体使用请询问相应业务同学
     *
     * @param sn
     */
    void cmdRespSuccess(Long sn);

    /**
     * cmdRespFail 上报指令执行结果：失败，具体使用请询问相应业务同学
     *
     * @param sn
     * @param message
     */
    void cmdRespFail(Long sn, String message);

    /**
     * uploadFile 图片或文件上传
     *
     * @param content
     * @param fileName
     * @param subjectType
     * @param timeout
     * @return
     */
    String uploadFile(byte[] content, String fileName, String subjectType, Integer timeout);
    
    ////////////////////////////////////////////////////////////////////////////////////////////////
    //Mqtt driver api
    Boolean Publish(String topic, byte[] payload, Byte qos, Boolean retained);

    Boolean SubScribe(String topic, Byte qos, IMqttMessageListener listener) throws MqttException;
    
    Boolean UnSubscribe(String topic);

    ////////////////////////////////////////////////////////////////////////////////////////////////
    // GetKV 根据key值获取驱动存储的自定义内容
    Map<String, byte[]> GetKV(String[] keys);

    // PutKv 存储驱动的自定义内容
    Boolean PutKv(Map<String, byte[]> kvs);

    // DeleteKV 根据key值删除驱动存储的自定义内容
    Boolean DeleteKV(String[] keys);

    // GetKVKeys 根据前缀筛选key，传空则返回所有key
    String[] GetKVKeys(String prefix);

    // QueryKV 根据前缀搜索KV存储，传空返回所有的结果
    Map<String, byte[]> QueryKV(String prefix);

    // GetKVOne 根据key获取内容，不支持云端备份
    byte[] GetKVOne(String key);

    // PutKVOne 存储驱动的自定义内容，不支持云端备份
    Boolean PutKVOne(String key, byte[] value);

    // GetBackupKV 根据key获取KV存储，支持云端备份
    Map<String, byte[]> GetBackupKV(String[] keys);

    // GetBackupKV 根据key获取KV存储，支持云端备份
    byte[] GetBackupKVOne(String key);

    // GetBackupKVKeys 根据前缀获取keys，传空返回所有的结果，支持云端备份
    String[] GetBackupKVKeys(String prefix);

    // PutBackupKV 更新KV存储，支持云端备份
    Boolean PutBackupKV(Map<String, byte[]> kvs);

    // PutBackupKVOne 更新KV存储，支持云端备份
    Boolean PutBackupKVOne(String key, byte[] value);

    // DelBackupKV 删除KV存储，支持云端备份
    Boolean DelBackupKV(String[] keys);

    // QueryBackupKV 根据前缀搜索KV存储，传空返回所有的结果，支持云端备份
    Map<String, byte[]> QueryBackupKV(String prefix);
    
    /**
     * 驱动Web服务注册
     *
     * @param proxyInfo
     */
    void RegistDriverProxy(ProxyInfo proxyInfo);
}
```

上一章：[驱动本地调试指南](./driverdebug.md)

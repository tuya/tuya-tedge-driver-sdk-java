[English](README.md) | [中文版](README_CN.md)
# tuya-tedge-driver-sdk-java：涂鸦边缘网关 Tedge 南向驱动开发 Java SDK

## 名词简介
* Tedge: 涂鸦边缘网关，主要用于将第三方设备接入涂鸦云。
* tedge-driver-sdk-java: Java驱动开发SDK，连接南向设备和Tedge。
* 驱动：Tedge南向插件，用来对接第三方设备。

## Tedge 架构
![Tedge架构图.png](./docs/images/Tedge架构图1.png)

## 快速开始

#### 依赖当前最新版本:1.0.0
```xml
<dependency>
    <groupId>com.tuya</groupId>
    <artifactId>tuya-tedge-driver-sdk-java</artifactId>
    <version>1.0.0</version>
</dependency>

<!-- 添加maven仓库地址 -->
<repository>
    <id>tuya-maven</id>
    <url>https://maven-other.tuya.com/repository/maven-public/</url>
</repository>
```

### 驱动开发步骤
1. 参考"驱动开发示例"，实现驱动接口 `DPModelDriver`
2. 将驱动打包成一个 docker 容器即可
3. 完整的示例请参考：[驱动程序Demo](https://github.com/tuya/tuya-tedge-driver-java-example)
4. 完整驱动开发指南请阅读：[驱动开发指南](./docs/summary.md)

### DPModelDriver interface
```java
public interface DPModelDriver {
	// 在Tedge Web新增/激活/更新/删除一个子设备时，回调该接口
    void deviceNotify(DeviceNotifyType deviceNotifyType, DeviceInfo deviceInfo);

	// 在Tedge Web新增/更新/删除一个产品时，回调该接口
    void productNotify(ProductNotifyType productNotifyType, ProductInfo productInfo);

	// Tedge收到云端发往子设备的指令时(mqtt 消息)，回调该接口：tuya cloud-->Tedge-->device
    void handleCommands(String cid, CommandRequest request, Map<String, ProtocolProperties> propertiesMap, Map<String, DpExtend> dpExtendMap);

    // 在Tedge Web停止驱动实例运行时，回调该接口，驱动程序可以进行资源回收
    void stop();
}
```

### 驱动开发示例
```java
package dpdemo;

import dpdemo.dpdriver.DpDriverImpl;
//import dpdemo.mqttdriver.MqttDriverImpl;
//import tuya.tedge.driver.sdk.base.mqttitf.MqttDriver;
import tuya.tedge.driver.sdk.base.utils.PrintException;
import tuya.tedge.driver.sdk.dpmodel.DPModelDriver;
import tuya.tedge.driver.sdk.dpmodel.DpDriverService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        try {
            //Step1: DP 模型，创建 DpDriverService
            DpDriverService driver = new DpDriverService(args);

            //Step2: 实现 DPModelDriver 接口，并调用 setDpDriverImpl
            DpDriverImpl driverImpl = new DpDriverImpl(driver.getDpDriverApi());
            DPModelDriver dpDriver = driverImpl;
            log.info("main set dpDriverImpl, start service!");

            //对接MQTT协议设备时，需另外实现MqttDriver接口，并调用相应接口设置回调
            //get mqtt username from customConfig
            //String username = "xxxx";
            //MqttDriver mqttDriver = new MqttDriverImpl();
            //driver.setMqttDriverImpl(mqttDriver, username);

            //Step3: 调用 start
            driver.start(dpDriver);

            //Step4: 基本功能示例: 获取配置文件，获取已激活的子设备，新增产品、子设备、上报子设备状态、上报DP
            driverImpl.run();
        } catch (Exception e) {
            PrintException.printStack(e);
        }
    }
}
```

```java
//DpDriverImpl: 实现接口 `public interface DPModelDriver`
package dpdemo.dpdriver;

import tuya.tedge.driver.sdk.base.model.*;
import tuya.tedge.driver.sdk.dpmodel.DPModelDriver;
import tuya.tedge.driver.sdk.dpmodel.DpDriverApi;
import tuya.tedge.driver.sdk.dpmodel.model.CommandRequest;
import tuya.tedge.driver.sdk.dpmodel.model.DeviceInfo;
import tuya.tedge.driver.sdk.dpmodel.model.DpExtend;
import tuya.tedge.driver.sdk.dpmodel.model.ProductInfo;

import lombok.extern.slf4j.Slf4j;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// DpDriverImpl 必须实现接口 `public interface DPModelDriver`
// 接口定义在sdk：`tuya.tedge.driver.sdk.dpmodel.DPModelDriver`
@Slf4j
public class DpDriverImpl implements DPModelDriver {
    private Map<String, DeviceShadow> deviceMap;
    private DpDriverApi sdk;

    public DpDriverImpl(DpDriverApi sdk) {
        this.sdk = sdk;
        this.deviceMap = new ConcurrentHashMap<>();
    }

    //启动后，先初始化已经存在的子设备列表
    public void run() {
        //......
        //TODO: implement me
    }

    /**
     * 在TEdge控制台页面，新增、激活、更新子设备属性、删除子设备时，回调该接口
     * 如果接入的设备不需要在Tedge控制台页面手动新增子设备，则该接口实现为空即可
     * 注意：不要在该接口做阻塞性操作
     */
    @Override
    public void deviceNotify(DeviceNotifyType deviceNotifyType, DeviceInfo device) {
        log.info("deviceNotify type:{},device:{}", deviceNotifyType.getValue(), device.toString());
        //......
        //TODO: implement me
    }

    /**
     * ProductNotify 产品增删改通知,删除产品时product参数为空
     * 不要在该接口做阻塞性操作
     */
    @Override
    public void productNotify(ProductNotifyType productNotifyType, ProductInfo productInfo) {
        log.info("productNotify type:{}, product:{}", productNotifyType.getValue(), productInfo.toString());
    }

    /**
     * 在TEdge页面，更新驱动实例，或停止驱动实例时，回调该接口，驱动程序进行资源清理
     */
    @Override
    public void stop() {
        //......
        //TODO: implement me
    }

    /**
     * TEdge/云端 下发的MQTT消息
     * 注意：不要在该接口做阻塞性操作
     */
    @Override
    public void handleCommands(String cid, CommandRequest commandRequest, Map<String, ProtocolProperties> map, Map<String, DpExtend> map1) {
        log.info("handleCommands cid：{}, handleCommands:{}", cid, commandRequest);
        //......
        //TODO: implement me
    }
}
```

### MqttDriver interface
* 当驱动程序对接MQTT协议设备时，无需自己实现MQTT Broker，Tedge平台和SDK已经提供相应能力
* 开发者需要实现MQTTDriver接口：`public interface MqttDriver`
* MqttDriver接口定义： `import tuya.tedge.driver.sdk.base.mqttitf.MqttDriver`

```java
public interface MqttDriver {
    //Auth mqtt 鉴权事件，鉴权成功返回true
    Boolean auth(String clientId, String username, String password);

    //Sub mqtt subscribe 订阅事件，鉴权成功返回true
    Boolean subscribe(String clientId, String username, String topic, Byte qos);

    //Pub mqtt publish 事件，鉴权成功返回true
    Boolean publish(String clientId, String username, String topic, Byte qos, Boolean retained);

    // UnSub mqtt unsubscribe 取消订阅事件
    void unSubscribe(String clientId, String username, String[] topics);

    // Connected
    void connected(String clientId, String username);

    // Closed
    void closed(String clientId, String username);
}
```

### Implementation driver with mqtt

```java
//实现MqttDriver接口

package dpdemo.mqttdriver;

import tuya.tedge.driver.sdk.base.mqttitf.MqttDriver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MqttDriverImpl implements MqttDriver {
    @Override
    public Boolean auth(String clientId, String username, String password) {
        log.info("mqtt auth clientId:{},username:{},password{}", clientId, username, password);
        //TODO: implement me
        return true;
    }

    @Override
    public Boolean subscribe(String clientId, String username, String topic, Byte qos) {
        log.info("mqtt Subscribe clientId:{},,username:{},topic:{},qos:{}", clientId, username, topic, qos);
        //TODO: implement me
        return true;
    }

    @Override
    public Boolean publish(String clientId, String username, String topic, Byte qos, Boolean retained) {
        log.info("mqtt publish clientId:{},,username:{},topic:{},qos:{},retained:{}", clientId, username, topic, qos, retained);
        //TODO: implement me
        return true;
    }

    @Override
    public void unSubscribe(String clientId, String username, String[] topics) {
        log.info("mqtt unSubscribe clientId:{},,username:{},topics:{}", clientId, username, topics);
        //TODO: implement me
    }

    @Override
    public void connected(String clientId, String username) {
        log.info("mqtt connected clientId:{},,username:{}", clientId, username);
        //TODO: implement me
    }

    @Override
    public void closed(String clientId, String username) {
        log.info("mqtt closed clientId:{},,username:{}", clientId, username);
        //TODO: implement me
    }
}
```

## SDK API
* SDK中定义的API：`import tuya.tedge.driver.sdk.dpmodel.DpDriverApi;`
* SDK定义的主要数据结构：`import tuya.tedge.driver.sdk.base.model.*;` 和 `import tuya.tedge.driver.sdk.dpmodel.model.*;`

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

## 技术支持
Tuya IoT Developer Platform: https://developer.tuya.com/en/

Tuya Developer Help Center: https://support.tuya.com/en/help

Tuya Work Order System: https://service.console.tuya.com/
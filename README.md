[English](README.md) | [中文版](README_CN.md)
# `tuya-edge-driver-sdk-java`: TEdge Southbound Driver Java SDK

## Terms
* TEdge: the Tuya IoT Edge Gateway, used to connect third-party devices to Tuya IoT Cloud.
* tedge-driver-sdk-java: the driver Java SDK, used to connect devices to TEdge through southbound interfaces.
* Driver: the southbound plug-in of TEdge, used to interface with third-party devices.

## Architecture of TEdge
![Image](./docs/images/Tedge架构图1.png)

## Get started

#### Dependency CurrentEdition：1.0.0
```xml
<dependency>
    <groupId>com.tuya</groupId>
    <artifactId>tuya-tedge-driver-sdk-java</artifactId>
    <version>1.0.0</version>
</dependency>

<!-- Specify the Maven repository URL -->
<repository>
    <id>tuya-maven</id>
    <url>https://maven-other.tuya.com/repository/maven-public/</url>
</repository>
```

### Procedure
1. Follow the example and implement the driver interface `DPModelDriver`.
2. Package the driver into a Docker container.

- For more information about the sample, see [TEdge Driver Demo](https://github.com/tuya/tuya-tedge-driver-java-example).
- For more information about the guidelines on driver development, see [Documents on driver development](./docs/summary.md).

### DPModelDriver interface
```java
public interface DPModelDriver {
    // The callback to invoke when a sub-device is added, activated, updated, or deleted in the TEdge console.
    void deviceNotify(DeviceNotifyType deviceNotifyType, DeviceInfo deviceInfo);

    // The callback to invoke when a product is added, updated, or deleted in the TEdge console.
    void productNotify(ProductNotifyType productNotifyType, ProductInfo productInfo);

    // The callback to invoke when a command is received and forwarded over MQTT in the following direction: Tuya IoT Cloud > TEdge > Sub-device
    void handleCommands(String cid, CommandRequest request, Map<String, ProtocolProperties> propertiesMap, Map<String, DpExtend> dpExtendMap);

    // The callback to invoke when a driver instance is stopped from running in the TEdge console. The driver program can be recycled.
    void stop();
}
```

### Example
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
            //Step1: DP model, new DpDriverService
            DpDriverService driver = new DpDriverService(args);

            //Step2: implement interface DPModelDriver, and call setDpDriverImpl
            DpDriverImpl driverImpl = new DpDriverImpl(driver.getDpDriverApi());
            DPModelDriver dpDriver = driverImpl;
            log.info("main set dpDriverImpl, start service!");

            //When connecting MQTT protocol devices, it is necessary to implement the MqttDriver interface 
            //and call the setMqttDriverImpl
            //get mqtt username from customConfig
            //String username = "xxxx";
            //MqttDriver mqttDriver = new MqttDriverImpl();
            //driver.setMqttDriverImpl(mqttDriver, username);

            //Step3: call start
            driver.start(dpDriver);

            //Examples of basic functions: get configuration, get all activated sub-devices, 
            // add new product, add new sub-device, report sub-device status, and report DP
            driverImpl.run();
        } catch (Exception e) {
            PrintException.printStack(e);
        }
    }
}
```

```java
//DpDriverImpl: implementation the interface `type DPModelDriver interface`.
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


// `DpDriverImpl` requires the implementation of the interface `public interface DPModelDriver`.
// The interface is defined in the SDK `tuya.tedge.driver.sdk.dpmodel.DPModelDriver`.
@Slf4j
public class DpDriverImpl implements DPModelDriver {
    private Map<String, DeviceShadow> deviceMap;
    private DpDriverApi sdk;

    public DpDriverImpl(DpDriverApi sdk) {
        this.sdk = sdk;
        this.deviceMap = new ConcurrentHashMap<>();
    }

    //run the custom logic
    public void run() {
        //......
        //TODO: implement me
    }

    // Implementation of the interface `public interface DPModelDriver`.
    // 1. The callback to invoke when a sub-device is added, activated, updated, or deleted in the TEdge console.
    // 2. Note: Do not perform blocking operations with the interface.
    // 3. Set the implementation of the interface to nil if you do not need to manually add sub-devices to the target gateway in the TEdge console.
    @Override
    public void deviceNotify(DeviceNotifyType deviceNotifyType, DeviceInfo device) {
        //......
        //TODO: implement me
    }

    // Implementation of the interface `public interface DPModelDriver`.
    // 1. ProductNotify: the callback to invoke when a product is added, updated, or deleted.
    // 2. Note: Do not perform blocking operations with the interface.
    @Override
    public void productNotify(ProductNotifyType productNotifyType, ProductInfo productInfo) {
        log.info("productNotify type:{}, product:{}", productNotifyType.getValue(), productInfo.toString());
    }

    // Implementation of the interface `public interface DPModelDriver`.
    // The callback to invoke when a driver instance is updated or stopped from running on TEdge. The driver program can be recycled.
    @Override
    public void stop() {
        //......
        //TODO: implement me
    }

    // Implementation of the interface `public interface DPModelDriver`.
    // 1. Receive messages sent by TEdge or Tuya IoT Cloud over MQTT.
    // 2. Note: Do not perform blocking operations with the interface.
    @Override
    public void handleCommands(String cid, CommandRequest commandRequest, Map<String, ProtocolProperties> map, Map<String, DpExtend> map1) {
        //......
        //TODO: implement me
    }
}
```

### Implementation driver with MQTT
### MqttDriver interface
```java
public interface MqttDriver {
    // auth: the MQTT authentication event. A value of `true` indicates successful authentication.
    Boolean auth(String clientId, String username, String password);

    // subscribe: the MQTT subscription event. A value of `true` indicates a successful subscription.
    Boolean subscribe(String clientId, String username, String topic, Byte qos);

    // publish: the MQTT authentication event. A value of `true` indicates successful publishing.
    Boolean publish(String clientId, String username, String topic, Byte qos, Boolean retained);

    // unSubscribe: unsubscribe from an MQTT topic
    void unSubscribe(String clientId, String username, String[] topics);

    // Connected
    void connected(String clientId, String username);

    //closed
    void closed(String clientId, String username);
}
```

```java
//implement the interface `public interface MqttDriver`;

package dpdemo.mqttdriver;

import tuya.tedge.driver.sdk.base.mqttitf.MqttDriver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MqttDriverImpl implements MqttDriver {
    // Auth: the MQTT authentication event. A value of `true` indicates successful authentication.
    @Override
    public Boolean auth(String clientId, String username, String password) {
        log.info("mqtt auth clientId:{},username:{},password{}", clientId, username, password);
        //TODO: implement me
        return true;
    }

    // subscribe: the MQTT subscription event. A value of `true` indicates a successful subscription.
    @Override
    public Boolean subscribe(String clientId, String username, String topic, Byte qos) {
        log.info("mqtt Subscribe clientId:{},,username:{},topic:{},qos:{}", clientId, username, topic, qos);
        //TODO: implement me
        return true;
    }

    // publish: the MQTT authentication event. A value of `true` indicates successful publishing.
    @Override
    public Boolean publish(String clientId, String username, String topic, Byte qos, Boolean retained) {
        log.info("mqtt publish clientId:{},,username:{},topic:{},qos:{},retained:{}", clientId, username, topic, qos, retained);
        //TODO: implement me
        return true;
    }

    //unSubscribe: unsubscribe from an MQTT topic
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
* API defined in the SDK：`import tuya.tedge.driver.sdk.dpmodel.DpDriverApi;`
* Data structures defined by the SDK：`import tuya.tedge.driver.sdk.base.model.*;` and `import tuya.tedge.driver.sdk.dpmodel.model.*;`

###SDK core API list
```java
public interface DpDriverApi {
    /**
     * getCustomConfig Get custom configuration in expert mode
     *
     * @return JSONObject
     */
    JSONObject getCustomConfig();

    /**
     * activeDevice Add and activate one sub-device
     *
     * @param deviceMetadata
     * @return
     */
    ActiveDeviceResponse activeDevice(DeviceMetadata deviceMetadata);

    /**
     * SetDeviceExtendProperty Update the additional attributes of the sub device. 
     * Repeated calls will overwrite the previous values
     * @param cid
     * @param deviceUpdateProperty
     */
    Boolean setDeviceProperty(String cid, DeviceUpdateProperty deviceUpdateProperty);

    /**
     * setDeviceBaseAttr Update the sub-device name. 
     *  After call the activeDevice interface successfully, it should be called to update the sub-device name
     * @param cid
     * @param deviceUpdateProperty
     */
    Boolean setDeviceBaseAttr(String cid, DeviceUpdateProperty deviceUpdateProperty);

    /**
     * deleteDevice delete one sub-device by cid
     *
     * @param cid
     */
    void deleteDevice(String cid);

    /**
     * reportDeviceStatus Report the online status of sub-device
     *
     * @param deviceStatus
     */
    void reportDeviceStatus(DeviceStatus deviceStatus);

    /**
     * reportWithDPData Report the data of device dp point
     *
     * @param cid
     * @param dpDataList
     */
    void reportWithDPData(String cid, List<DpData> dpDataList);
    
    /**
     * allDevices Get all sub-devices in the driver
     *
     * @return
     */
    Map<String, DeviceInfo> allDevices();

    /**
     * getActiveDevices Get all activated sub-devices in the driver
     *
     * @return
     */
    Map<String, DeviceInfo> getActiveDevices();

    /**
     * getDeviceById get DeviceInfo by cid of device
     *
     * @param cid
     * @return
     */
    DeviceInfo getDeviceById(String cid);

    /**
     * addProduct Add a new product
     *
     * @param productMetadata
     */
    Boolean addProduct(ProductMetadata productMetadata);

    /**
     * allProducts get all product in this driver
     * @return
     */
    Map<String, ProductInfo> allProducts();

    /**
     * getProductById get ProductInfo by pid
     *
     * @param productId
     * @return
     */
    ProductInfo getProductById(String productId);

    /**
     * reportAlert reports alarm information
     *
     * @param alertLevel
     * @param content
     */
    void reportAlert(AlertLevel alertLevel, String content);

    /**
     * getServiceId Get drive service Id
     */
    String getServiceId();

    /**
     * getGatewayInfo get gateway meta info
     */
    GatewayInfo getGatewayInfo();

    ////////////////////////////////////////////////////////////////////////////////////////
    /**
     * ReportThroughHttp Report customized messages through http 
     * @param api
     * @param version
     * @param payload
     * @return
     */
    String reportThroughHttp(String api, String version, Map<String, Object> payload);

    /**
     * cmdRespSuccess Report the command execution result: success, please ask the corresponding business students for specific use
     * @param sn
     */
    void cmdRespSuccess(Long sn);

    /**
     * cmdRespFail Report the command execution result: failed, please ask the corresponding business students for specific use
     * @param sn
     * @param message
     */
    void cmdRespFail(Long sn, String message);

    /**
     * uploadFile upload picture or file to cloud
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
    // GetKV Get value by keys
    Map<String, byte[]> GetKV(String[] keys);

    // PutKv Save keys/values
    Boolean PutKv(Map<String, byte[]> kvs);

    // DeleteKV Remove the specified keys.
    Boolean DeleteKV(String[] keys);

    // GetKVKeys Filter keys with prefix, and return all keys if prefix is null
    String[] GetKVKeys(String prefix);

    // QueryKV Search KV by prefix, and return all results if prefix is null
    Map<String, byte[]> QueryKV(String prefix);

    // GetKVOne Get value by key
    byte[] GetKVOne(String key);

    // PutKVOne Save one key/value, support cloud backup
    Boolean PutKVOne(String key, byte[] value);

    // GetBackupKV Get KV by key, support cloud backup
    Map<String, byte[]> GetBackupKV(String[] keys);

    // GetBackupKV Get keys by prefix, and return all results. support cloud backup
    byte[] GetBackupKVOne(String key);

    // GetBackupKVKeys Get keys by prefix, and return all results. support cloud backup
    String[] GetBackupKVKeys(String prefix);

    // PutBackupKV Update KVs, support cloud backup
    Boolean PutBackupKV(Map<String, byte[]> kvs);

    // PutBackupKVOne Update KV, support cloud backup
    Boolean PutBackupKVOne(String key, byte[] value);

    // DelBackupKV Delete KV, support cloud backup
    Boolean DelBackupKV(String[] keys);

    // QueryBackupKV Search KV by prefix, and return all results, support cloud backup
    Map<String, byte[]> QueryBackupKV(String prefix);
    
    /**
     * Drive web service registration
     *
     * @param proxyInfo
     */
    void RegistDriverProxy(ProxyInfo proxyInfo);
}
```

## Technical support
Tuya IoT Developer Platform: https://developer.tuya.com/en/

Tuya Developer Help Center: https://support.tuya.com/en/help

Tuya Service Ticket System: https://service.console.tuya.com/


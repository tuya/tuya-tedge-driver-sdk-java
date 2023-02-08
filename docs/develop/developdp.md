# DP模型设备驱动开发指南

## 一、驱动程序的职责
- 发现真实的子设备，并将真实设备上报给Tedge：激活子设备
- 定时获取子设备的状态，并上报子设备状态：在线或离线
- 根据实际情况，获取子设备各项功能数据，并上报：DP点值
- 接收云端的设备指令，转化后将指令发送到真实子设备

## 二、设备驱动开发范式
- 1.创建驱动服务，并实现SDK中定义的驱动接口 `DPModelDriver`
- 2.将驱动打包成一个 docker 镜像
- 3.在Tedge Web通过自定义方式，将开发好的驱动程序安装到Tedge中

### 1.设备驱动开发Demo([驱动程序完整Demo](https://github.com/tuya/tuya-tedge-driver-java-example))
#### a.通过SDK创建驱动服务
- step1: 创建驱动服务
- step2: 实现驱动接口 `DPModelDriver`
- step3: 启动驱动服务

```java
package dpdemo;

import dpdemo.dpdriver.DpDriverImpl;
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

#### b.实现驱动接口 `DPModelDriver`
- 接口定义：[DP驱动接口](https://github.com/tuya/tuya-tedge-driver-sdk-java/blob/main/src/main/java/tuya/tedge/driver/sdk/dpmodel/DPModelDriver.java)
- 实现示例：[完整示例代码](https://github.com/tuya/tuya-tedge-driver-java-example/tree/main/src/main/java/dpdemo)

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

### 2.驱动打包成镜像
- Dockerfile 示例：[驱动程序Dockerfile示例](https://github.com/tuya/tuya-tedge-driver-java-example/blob/main/Dockerfile)
- 将驱动打包成镜像：[镜像打包脚本示例](https://github.com/tuya/tuya-tedge-driver-java-example/blob/main/script/dockerbuild.sh)

### 3.安装并启动驱动实例
默认情况下，我们的驱动程序是存储在阿里云镜像仓库中的，若驱动存储在其它仓库，参考如下步骤1新增镜像仓库；
- 1.新增镜像仓库：[新增镜像仓库](../tedgeweb.md) 中第三节 `三、安装自定义驱动`
- 2.新增驱动程序：[新增镜像仓库](../tedgeweb.md) 中第三节 `三、安装自定义驱动`
- 3.下载并启动驱动程序：[启动驱动](../tedgeweb.md) 中第二节 `二、安装和管理驱动`
- 4.驱动启动失败怎么办
    - 在Web控制台查看驱动日志，查看驱动日志的方式请参考：[查看驱动日志](../tedgeweb.md) 中第五节 `五、Tedge服务管理`
    - 登录Linux机器查看驱动日志，请参考：[查看驱动日志](./driverdebug.md) 中第五节 `五、Tedge服务管理`
    - 查看容器日志 `docker logs ${container_id}`

## 二、驱动程序与真实设备
### 1.发现并激活子设备
- 驱动程序负责发现并激活子设备，不同设备需要根据实际情况进行处理
- 子设备激活接口`activeDevice`，具体调用示例参考 [addNewDevice](https://github.com/tuya/tuya-tedge-driver-java-example/blob/main/src/main/java/dpdemo/dpdriver/DpDriverImpl.java)
- 关键参数说明：
    - Cid：子设备Cid，必填字段，网关下必须唯一
	- ProductId: Pid，设备所属于产品Id，必填字段
	- Name: 子设备名，必填字段
- 关于Cid的补充说明：
    - 子设备Cid是确定子设备身份的唯一信息，在整个网关下必须唯一
    - 如果设备提供的协议中有唯一的Id字段，那么我们一般直接使用
    - 如果无法获取到确定设备身份的唯一字段，那么驱动程序也必须创造一个唯一的Cid字段，并保证该Cid和真实设备对应

### 2.上报子设备状态
- 驱动程序负责上报子设备状态，建议一般情况下每隔一分钟上报一次
- 如何判定子设备在线还是离线：
    - 通过设备提供的协议或SDK，能够成功连接设备，那么认为设备在线
    - 设备、或设备网关、或设备云主动推送设备状态
    - 若真实设备永远无法判断在线或离线，可假定设备在线
- 子设备状态上报接口非常简单，参考驱动Demo中的使用方法

### 3.上报子设备信息
- 上报子设备信息是驱动程序最核心的功能，驱动程序负责将设备信息转化成DP消息并上报
- 驱动Demo中展示了4种基本DP点类型的上报，bool、整数、字符串、枚举：`public void reportDPS()`[ReportDp](https://github.com/tuya/tuya-tedge-driver-java-example/blob/main/src/main/java/dpdemo/dpdriver/DeviceShadow.java)
- SDK关键API：`reportWithDPData` 向涂鸦云上报设备DP消息

### 4.处理子设备指令
- 云端下发的设备指令，一般用于控制设备，比如开、关、设置属性等
- 驱动程序接收到的设备指令是涂鸦标准的MQTT消息，消息格式为接口 `HandleCommands` 中的参数 `CommandRequest`
- 驱动程序需要解析 `CommandRequest` 中的 Data 字段，并进行处理
- Data 字段的格式如下：
    - Cid 字段就是子设备激活时所填唯一编号；
    - dps 为 dp 点的值，其中 "46" 表示 dp 点 46，100 表示该 dp 点的值；
    - dps 中可以包含多个 dp 点
    - 驱动程序要负责将该消息转化成设备识别的信息，并发送到设备
```json
{
    "Protocol":5,
    "T":1672036365,
    "Data":{
        "cid":"test_cid_0001",
        "dps":{
            "46":100
        }
    }
}
```

###5.驱动上报告警
- 驱动程序可以向Tedge上报告警，方便管理人员发现问题：`testAlarmReport()` [reportAlarm](https://github.com/tuya/tuya-tedge-driver-java-example/blob/main/src/main/java/dpdemo/dpdriver/DpDriverImpl.java)

###6.获取网关信息
- 驱动程序有时候需要获取网关信息：`getGatewayInfo()` [getGatewayInfo](https://github.com/tuya/tuya-tedge-driver-java-example/blob/main/src/main/java/dpdemo/dpdriver/DpDriverImpl.java)

###7.key/value存储
- 驱动程序可通过k/v接口存储数据：`testGetPutKV` [testKVAPI](https://github.com/tuya/tuya-tedge-driver-java-example/blob/main/src/main/java/dpdemo/dpdriver/DpDriverImpl.java)


下一章：[驱动本地调试指南](./driverdebug.md)

上一章：[边缘网关操作介绍](../tedgeweb.md)

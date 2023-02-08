package tuya.tedge.driver.sdk.dpmodel;

import tuya.tedge.driver.sdk.base.model.DeviceNotifyType;
import tuya.tedge.driver.sdk.base.model.ProductNotifyType;
import tuya.tedge.driver.sdk.base.model.ProtocolProperties;
import tuya.tedge.driver.sdk.dpmodel.model.CommandRequest;
import tuya.tedge.driver.sdk.dpmodel.model.DeviceInfo;
import tuya.tedge.driver.sdk.dpmodel.model.DpExtend;
import tuya.tedge.driver.sdk.dpmodel.model.ProductInfo;

import java.util.Map;

public interface DPModelDriver {
    /**
     * 设备添加，设备删除，设备更新回调接口。
     *
     * @param deviceNotifyType
     * @param deviceInfo
     */
    void deviceNotify(DeviceNotifyType deviceNotifyType, DeviceInfo deviceInfo);

    /**
     * 产品添加，产品更新，产品删除回调接口。
     *
     * @param productNotifyType
     * @param productInfo
     */
    void productNotify(ProductNotifyType productNotifyType, ProductInfo productInfo);

    /**
     * 下发指令接口。
     *
     * @param cid
     * @param request
     * @param propertiesMap
     * @param dpExtendMap
     */
    void handleCommands(String cid, CommandRequest request, Map<String, ProtocolProperties> propertiesMap, Map<String, DpExtend> dpExtendMap);

    /**
     * 网关关闭回调接口
     */
    void stop();
}

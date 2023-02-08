package tuya.tedge.driver.sdk.base.model;
public enum DeviceSourceType {
    /**
     * 未知类型
     */
    DeviceFromUnknown(0),
    /**
     * 网关上添加的设备
     */
    DeviceFromWeb(1),
    /**
     * 驱动添加的设备
     */
    DeviceFromDriver(2),
    /**
     * 当设备被激活时
     */
    DeviceActive(3);

    private Integer value;

    DeviceSourceType(Integer s) {
        this.value = s;
    }

    public Integer getValue() {
        return this.value;
    }


}

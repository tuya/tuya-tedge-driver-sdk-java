package tuya.tedge.driver.sdk.base.model;

public enum DeviceNotifyType {
    /**
     * 添加设备
     */
    DeviceAddNotify("add"),
    /**
     * 更新设备
     */
    DeviceUpdateNotify("update"),
    /**
     * 删除设备
     */
    DeviceDeleteNotify("delete"),
    /**
     * 激活设备
     */
    DeviceActiveNotify("active");
    /**
     * 没卵用，枚举类型必须有构造方法
     */
    private String value;

    DeviceNotifyType(String s) {
        this.value = s;
    }

    public String getValue() {
        return value;
    }
}

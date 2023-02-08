package tuya.tedge.driver.sdk.base.model;

public enum DeviceOnlineStatus {
    /**
     * 设备在线状态
     */
    Online("online"),

    /**
     * 设备离线状态
     */
    Offline("offline");

    private String value;

    DeviceOnlineStatus(String s) {
        this.value = s;
    }

    public String getValue() {
        return value;
    }
}

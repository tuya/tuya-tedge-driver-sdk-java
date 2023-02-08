package tuya.tedge.driver.sdk.base.model;

public enum AlertLevel {
    /**
     * 告警级别
     */
    Error(1),
    Warn(2),
    Notify(3);

    private Integer value;

    AlertLevel(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}


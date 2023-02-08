package tuya.tedge.driver.sdk.dpmodel.model;

public enum RWType {
    /**
     * dp点的属性，表示只能上报数据
     */
    ReadOnly("ro"),
    /**
     * dp点的属性，表示只能下发数据
     */
    WriteOnly("wo"),
    /**
     * 既能上发也能上报
     */
    ReadWrite("rw");
    private String value;

    RWType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}

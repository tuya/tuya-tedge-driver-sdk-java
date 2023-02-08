package tuya.tedge.driver.sdk.base.model;

public enum ProductNotifyType {
    /**
     * tedge 增加产品时通知类型
     */
    ProductAddNotify("add"),
    /**
     * tedge 更改产品时通知类型
     */
    ProductUpdateNotify("update"),
    /**
     * tedge 删除产品时通知类型
     */
    ProductDeleteNotify("delete");
    private String value;

    ProductNotifyType(String type) {
        this.value = type;
    }

    public String getValue() {
        return value;
    }
}

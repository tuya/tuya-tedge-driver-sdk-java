package tuya.tedge.driver.sdk.base.model;

public enum GatewayModel {
    /**
     * DpModel dp模型
     */
    DpModel("dp_model"),

    /**
     * ThingModel 物模型
     */
    ThingModel("thing_model");

    private String value;

    GatewayModel(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

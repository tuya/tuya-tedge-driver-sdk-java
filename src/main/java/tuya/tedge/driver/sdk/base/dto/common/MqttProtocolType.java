package tuya.tedge.driver.sdk.base.dto.common;

public enum MqttProtocolType {
    /**
     * 协议号
     */
    PROTOCOL_UNSPECIFIED(0),
    PROTOCOL_5(5),
    PROTOCOL_64(64),
    PROTOCOL_302(302),
    PROTOCOL_312(312);

    private Integer protocol;

    MqttProtocolType(int i) {
        protocol = i;
    }

    public Integer getValue() {
        return protocol;
    }

    public static MqttProtocolType typeOfValue(Integer value) {
        for (MqttProtocolType e : MqttProtocolType.values()) {
            if (e.getValue().equals(value)) {
                return e;
            }
        }
        return PROTOCOL_UNSPECIFIED;
    }
}

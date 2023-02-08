package tuya.tedge.driver.sdk.base.model;

import lombok.Data;

@Data
public class TyDeviceExtend {
    private String localKey;
    private String mac;

    public TyDeviceExtend() {
    }

    public TyDeviceExtend(String localKey, String mac) {
        this.localKey = localKey;
        this.mac = mac;
    }
}

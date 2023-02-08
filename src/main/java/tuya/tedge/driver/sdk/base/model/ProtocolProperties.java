package tuya.tedge.driver.sdk.base.model;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class ProtocolProperties {
    private Map<String, String> customMap;

    public ProtocolProperties() {
        customMap = new HashMap<>();
    }

    public ProtocolProperties(Map<String, String> customMap) {
        this.customMap = customMap;
    }
}

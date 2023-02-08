package tuya.tedge.driver.sdk.dpmodel.model;

import lombok.Data;

import java.util.Map;

@Data
public class DpExtend {
    private PropertyValue propertyValue;
    private Map<String, String> attributeMap;

    public DpExtend() {
    }

    public DpExtend(PropertyValue propertyValue, Map<String, String> attributeMap) {
        this.propertyValue = propertyValue;
        this.attributeMap = attributeMap;
    }
}

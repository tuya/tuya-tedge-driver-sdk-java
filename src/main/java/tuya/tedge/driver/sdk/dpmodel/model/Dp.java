package tuya.tedge.driver.sdk.dpmodel.model;

import lombok.Data;

import java.util.Map;

@Data
public class Dp {
    private String id;
    private String description;
    private PropertyValue propertyValue;
    private Map<String, String> attributes;

    public Dp() {
    }

    public Dp(String id, String description, PropertyValue propertyValue, Map<String, String> attributes) {
        this.id = id;
        this.description = description;
        this.propertyValue = propertyValue;
        this.attributes = attributes;
    }
}

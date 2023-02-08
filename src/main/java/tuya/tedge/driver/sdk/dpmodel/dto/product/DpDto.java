package tuya.tedge.driver.sdk.dpmodel.dto.product;

import tuya.tedge.driver.sdk.dpmodel.model.PropertyValue;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class DpDto {
    private String description;
    private String id;
    private PropertyValue properties;
    private Map<String, String> attributes;

    public DpDto(){
        description = "";
        id = "";
        properties = new PropertyValue();
        attributes = new HashMap<>();
    }

    public DpDto(String description, String id, PropertyValue properties, Map<String, String> attributes) {
        this.description = description;
        this.id = id;
        this.properties = properties;
        this.attributes = attributes;

    }
}

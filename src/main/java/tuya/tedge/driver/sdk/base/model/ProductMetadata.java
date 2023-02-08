package tuya.tedge.driver.sdk.base.model;

import lombok.Data;
@Data
public class ProductMetadata {
    private String id;
    private String name;
    private String description;

    public ProductMetadata() {
    }

    public ProductMetadata(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}

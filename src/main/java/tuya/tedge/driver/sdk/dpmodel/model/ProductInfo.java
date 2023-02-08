package tuya.tedge.driver.sdk.dpmodel.model;

import lombok.Data;

import java.util.List;

@Data
public class ProductInfo {
    private String id;
    private String name;
    private String description;
    private List<Dp> dps;
    private String deviceLibraryId;

    public ProductInfo() {
    }

    public ProductInfo(String id, String name, String description, List<Dp> dps, String deviceLibraryId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.dps = dps;
        this.deviceLibraryId = deviceLibraryId;
    }
}

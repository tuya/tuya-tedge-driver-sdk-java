package tuya.tedge.driver.sdk.base.dto.product;

import tuya.tedge.driver.sdk.dpmodel.dto.product.DpDto;
import lombok.Data;

import java.util.List;
@Data
public class ProductDto {
    private String id;
    private String name;
    private String description;
    private List<DpDto> dps;
    private String deviceLibraryId;

    public ProductDto() {
    }

    public ProductDto(String id, String name, String description, List<DpDto> dps, String deviceLibraryId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.dps = dps;
        this.deviceLibraryId = deviceLibraryId;
    }
}

package tuya.tedge.driver.sdk.dpmodel.dto.product;

import lombok.Data;


@Data
public class ProductByIdRequestDto {
    private String id ;

    public ProductByIdRequestDto(){
        id = "";
    }

    public ProductByIdRequestDto(String id) {
        this.id = id;
    }

}

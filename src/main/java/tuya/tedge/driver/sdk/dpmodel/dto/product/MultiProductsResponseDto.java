package tuya.tedge.driver.sdk.dpmodel.dto.product;

import tuya.tedge.driver.sdk.base.dto.product.ProductDto;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.List;


@Slf4j
@Data
public class MultiProductsResponseDto {
    private Integer total;
    private List<ProductDto> products;

    public MultiProductsResponseDto() {
    }

    public MultiProductsResponseDto(Integer total,  List<ProductDto> products) {
        this.total = total;
        this.products = products;
    }

}

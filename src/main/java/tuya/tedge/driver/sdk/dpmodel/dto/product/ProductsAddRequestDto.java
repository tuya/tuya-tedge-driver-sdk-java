package tuya.tedge.driver.sdk.dpmodel.dto.product;

import tuya.tedge.driver.sdk.grpc.product.Product;
import lombok.Data;

import java.util.List;

@Data
public class ProductsAddRequestDto {
    private List<Product> products;

    public ProductsAddRequestDto() {
    }

    public ProductsAddRequestDto(List<Product> products) {
        this.products = products;
    }

}

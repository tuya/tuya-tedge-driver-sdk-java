package tuya.tedge.driver.sdk.base.rpcclient;

import tuya.tedge.driver.sdk.base.dto.product.ProductDto;
import tuya.tedge.driver.sdk.base.utils.TimeConst;
import tuya.tedge.driver.sdk.dpmodel.convert.ProductConvert;
import tuya.tedge.driver.sdk.grpc.product.MultiProductsResponse;
import tuya.tedge.driver.sdk.grpc.product.Product;
import tuya.tedge.driver.sdk.grpc.product.ProductSearchQueryRequest;
import tuya.tedge.driver.sdk.grpc.product.RpcProductGrpc;
import tuya.tedge.driver.sdk.dpmodel.dto.product.MultiProductsResponseDto;
import tuya.tedge.driver.sdk.dpmodel.dto.product.ProductByIdRequestDto;
import tuya.tedge.driver.sdk.dpmodel.dto.product.ProductSearchQueryRequestDto;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

@Slf4j
public class ProductClient {
    private RpcProductGrpc.RpcProductBlockingStub blockingStub;
    private ProductConvert convert;

    public ProductClient(ManagedChannel channel) {
        this.blockingStub = RpcProductGrpc.newBlockingStub(channel);
        this.convert = new ProductConvert();
    }

    public ProductDto ProductById(ProductByIdRequestDto dto) {
        Product product = null;
        try {
            product = this.blockingStub.withDeadlineAfter(TimeConst.rpcTimeout, TimeUnit.SECONDS).productById(this.convert.productByIdRequestDto2Rpc(dto));
        } catch (StatusRuntimeException e) {
            log.error(e.getMessage());
        }
        return this.convert.productRpc2Dto(product);
    }

    public MultiProductsResponseDto ProductsSearch(ProductSearchQueryRequestDto dto) {
        MultiProductsResponseDto multiProductsResponseDto = null;
        try {
            ProductSearchQueryRequest request = this.convert.productSearchQueryRequestDto2Rpc(dto);
            MultiProductsResponse resp = this.blockingStub.withDeadlineAfter(TimeConst.rpcTimeout, TimeUnit.SECONDS).productsSearch(request);

            multiProductsResponseDto = this.convert.multiProductsResponseRpc2Dto(resp);
        } catch (StatusRuntimeException e) {
            log.error(e.getMessage());
        }
        return multiProductsResponseDto;
    }

    public void ProductAdd(ProductDto productDto) {
        try {
            this.blockingStub.withDeadlineAfter(TimeConst.rpcTimeout, TimeUnit.SECONDS).productAdd(this.convert.productDto2Rpc(productDto));
        } catch (StatusRuntimeException e) {
            log.error(e.getMessage());
        }
    }
}

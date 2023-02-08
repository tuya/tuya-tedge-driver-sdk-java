package tuya.tedge.driver.sdk.dpmodel.cache;

import tuya.tedge.driver.sdk.base.config.ClientConfig;
import tuya.tedge.driver.sdk.base.rpcclient.DeviceServiceClient;
import tuya.tedge.driver.sdk.base.rpcclient.ProductClient;
import tuya.tedge.driver.sdk.base.rpcclient.ResourceClient;
import tuya.tedge.driver.sdk.base.dto.common.BaseSearchConditionQueryDto;
import tuya.tedge.driver.sdk.base.dto.product.ProductDto;
import tuya.tedge.driver.sdk.dpmodel.dto.deviceservice.DeviceServiceDto;
import tuya.tedge.driver.sdk.dpmodel.dto.product.DpDto;
import tuya.tedge.driver.sdk.dpmodel.dto.product.MultiProductsResponseDto;
import tuya.tedge.driver.sdk.dpmodel.dto.product.ProductByIdRequestDto;
import tuya.tedge.driver.sdk.dpmodel.dto.product.ProductSearchQueryRequestDto;

import io.grpc.StatusRuntimeException;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
public class DpProductCache {
    private Map<String, ProductDto> productMap;
    private Map<String, Map<String, DpDto>> dpDtoMapMap;
    protected DeviceServiceDto serviceDto;
    protected ResourceClient resourceClient;
    protected ClientConfig clientConfig;
    private Timer timer;

    public DpProductCache(ResourceClient client, ClientConfig config) {
        this.resourceClient = client;
        this.clientConfig = config;
        this.timer = new Timer();

        productMap = new ConcurrentHashMap<>();
        dpDtoMapMap = new ConcurrentHashMap<>();
    }

    public void initCache() {
        try {
            DeviceServiceClient devServiceClient = resourceClient.getDeviceServiceClient();
            serviceDto = devServiceClient.deviceServiceById(clientConfig.serviceConfig().getId());
        } catch (StatusRuntimeException e) {
            log.error("initCache device cache, exception:{}", e.getMessage());
            throw e;
        }

        if (serviceDto == null) {
            return;
        }

        //this.initProductCache();
        timer.schedule(timerTask, 0, 60 * 1000);
    }

    private void initProductCache() {
        log.info("initProductCache in...");

        MultiProductsResponseDto productsSearch;
        try {
            String deviceLibraryId = serviceDto.getDeviceLibraryId();
            ProductClient productClient = resourceClient.getProductClient();
            productsSearch = productClient.ProductsSearch(new ProductSearchQueryRequestDto(new BaseSearchConditionQueryDto(), deviceLibraryId));
        } catch (Exception e) {
            log.error("initCache Product exception:{}", e.getMessage());
            return;
        }

        if (productsSearch == null) {
            log.error("initCache Product fail, productsSearch is nil");
            return;
        }

        //添加 并 找出被删除的产品
        Map<String, String> thisProductIdMap = new HashMap<>();
        productsSearch.getProducts().forEach(productDto -> {
            thisProductIdMap.put(productDto.getId(), "");
            addProductDto(productDto);
        });
        //遍历已有产品，如果不在本次所有产品中，就删除这个产品。
        productMap.forEach((k, v) -> {
            if (thisProductIdMap.get(k) == null) {
                removeProductDtoById(k);
            }
        });
    }

    //定时更新产品信息
    TimerTask timerTask = new TimerTask() {
        @Override
        public void run() {
            initProductCache();
        }
    };

    /**
     * 操作dp模型 产品信息
     */
    public ProductDto getProductDtoById(String productId) {
        ProductDto productDto = productMap.get(productId);
        if (productDto == null) {
            if (!updateProductShadowInfo(productId)) {
                log.error("productId:" + productId + "can't find product info");
                return null;
            }
            productDto = productMap.get(productId);
        }
        return productDto;
    }

    private Boolean updateProductShadowInfo(String productId) {
        if (productId == null) {
            return false;
        }
        ProductDto productDto = resourceClient.getProductClient().ProductById(new ProductByIdRequestDto(productId));
        if (productDto == null) {
            return false;
        }
        addProductDto(productDto);
        return true;
    }

    public Map<String, ProductDto> getProductMap() {
        return productMap;
    }

    public void addProductDto(ProductDto productDto) {
        if (productDto == null) {
            return;
        }
        productMap.put(productDto.getId(), productDto);

        Map<String, DpDto> dpDtoMap = new ConcurrentHashMap<>();

        productDto.getDps().forEach(action -> {
            dpDtoMap.put(action.getId(), action);
        });

        dpDtoMapMap.put(productDto.getId(), dpDtoMap);
    }

    public void updateProduct(ProductDto productDto) {
        if (!productMap.containsKey(productDto.getId())) {
            return;
        }
        productMap.put(productDto.getId(), productDto);

        if (dpDtoMapMap.containsKey(productDto)) {
            Map<String, DpDto> dpDtoMap = dpDtoMapMap.get(productDto.getId());
            productDto.getDps().forEach(action -> {
                dpDtoMap.put(action.getId(), action);
            });
            return;
        }

        Map<String, DpDto> dpDtoMap = new ConcurrentHashMap<>();
        productDto.getDps().forEach(action -> {
            dpDtoMap.put(action.getId(), action);
        });
        dpDtoMapMap.put(productDto.getId(), dpDtoMap);
    }

    public void removeProductDtoById(String productId) {
        productMap.remove(productId);
        dpDtoMapMap.remove(productId);
    }

    /**
     * 操作dp模型 产品下的dp信息
     */
    public Map<String, DpDto> getDpDtoMapByProductId(String productId) {
        return dpDtoMapMap.get(productId);
    }

    public DpDto getDpDtoByPIdAndDpId(String productId, String dpId) {
        if (!dpDtoMapMap.containsKey(productId)) {
            if (!updateProductShadowInfo(productId)) {
                log.error("productId:" + productId + ",dpId:" + dpId + ", can't find dp info");
                return null;
            }
        }
        return dpDtoMapMap.get(productId).get(dpId);
    }
}

package tuya.tedge.driver.sdk.dpmodel.convert;

import tuya.tedge.driver.sdk.base.convert.CommonConvert;
import tuya.tedge.driver.sdk.base.dto.product.ProductDto;
import tuya.tedge.driver.sdk.dpmodel.dto.product.DpDto;
import tuya.tedge.driver.sdk.dpmodel.dto.product.MultiProductsResponseDto;
import tuya.tedge.driver.sdk.dpmodel.dto.product.ProductByIdRequestDto;
import tuya.tedge.driver.sdk.dpmodel.dto.product.ProductSearchQueryRequestDto;
import tuya.tedge.driver.sdk.dpmodel.model.DataType;
import tuya.tedge.driver.sdk.grpc.common.BaseSearchConditionQuery;
import tuya.tedge.driver.sdk.grpc.product.*;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Slf4j
public class ProductConvert {

    private static CommonConvert commonConvert = new CommonConvert();

    public ProductByIdRequest productByIdRequestDto2Rpc(ProductByIdRequestDto dto) {
        if (dto == null) {
            return null;
        }
        return ProductByIdRequest.newBuilder()
                .setId(dto.getId())
                .build();
    }

    public ProductSearchQueryRequest productSearchQueryRequestDto2Rpc(ProductSearchQueryRequestDto dto) {
        if (dto == null) {
            return null;
        }
        BaseSearchConditionQuery query = commonConvert.baseSearchConditionQueryDto2Rpc(dto.getBaseSearchConditionQuery());
        return ProductSearchQueryRequest.newBuilder()
                .setBaseSearchConditionQuery(query)
                .setDeviceLibraryId(dto.getDeviceLibraryId())
                .build();
    }

    public MultiProductsResponseDto multiProductsResponseRpc2Dto(MultiProductsResponse resp) {
        if (resp == null) {
            return null;
        }
        List<ProductDto> productDtoList = new ArrayList<>();
        resp.getProductsList().forEach(product -> {
            productDtoList.add(productRpc2Dto(product));
        });
        return new MultiProductsResponseDto(
                resp.getTotal(),
                productDtoList
        );
    }

    public ProductDto productRpc2Dto(Product product) {
        if (product == null) {
            return null;
        }
        return new ProductDto(
                product.getId(),
                product.getName(),
                product.getDescription(),
                dpsRpc2Dto(product.getDpsList()),
                product.getDeviceLibraryId()
        );
    }

    public Product productDto2Rpc(ProductDto dto) {
        if (dto == null) {
            return null;
        }
        Product.Builder builder = Product.newBuilder();
        builder.setId(dto.getId())
                .setName(dto.getName())
                .setDescription(dto.getDescription())
                .setDeviceLibraryId(dto.getDeviceLibraryId());
        if (dto.getDps() != null) {
            builder.addAllDps(dpsDto2Rpc(dto.getDps()));
        }
        return builder.build();
    }

    private List<DpDto> dpsRpc2Dto(List<DP> dpList) {
        if (dpList == null) {
            return null;
        }
        ArrayList<DpDto> dps = new ArrayList();
        for (DP dp : dpList) {
            dps.add(dpRpc2Dto(dp));
        }
        return dps;
    }

    private List<DP> dpsDto2Rpc(List<DpDto> dtoList) {
        if (dtoList == null) {
            return null;
        }
        List<DP> dps = new ArrayList<>();
        for (DpDto dpDto : dtoList) {
            dps.add(dpDto2Rpc(dpDto));
        }
        return dps;
    }

    private DpDto dpRpc2Dto(DP dp) {
        if (dp == null) {
            return new DpDto();
        }
        return new DpDto(
                dp.getDescription(),
                dp.getId(),
                propertyValueRpc2Dto(dp.getProperties()),
                new HashMap<>(dp.getAttributesMap())
        );
    }

    private DP dpDto2Rpc(DpDto dpDto) {
        if (dpDto == null) {
            return DP.newBuilder().build();
        }
        return DP.newBuilder()
                .setDescription(dpDto.getDescription())
                .setId(dpDto.getId())
                .setProperties(propertyValueDto2Rpc(dpDto.getProperties()))
                .putAllAttributes(dpDto.getAttributes())
                .build();
    }

    private tuya.tedge.driver.sdk.grpc.product.PropertyValue propertyValueDto2Rpc(tuya.tedge.driver.sdk.dpmodel.model.PropertyValue dto) {
        if (dto == null) {
            return tuya.tedge.driver.sdk.grpc.product.PropertyValue.newBuilder().build();
        }
        return tuya.tedge.driver.sdk.grpc.product.PropertyValue.newBuilder()
                .setDefaultValue(dto.getDefaultValue())
                .setReadWrite(dto.getReadWrite())
                .setUnits(dto.getUnits())
                .setMinimum(dto.getMinimum())
                .setMaximum(dto.getMaximum())
                .setDefaultValue(dto.getDefaultValue())
                .setShift(dto.getShift())
                .setScale(dto.getScale())
                .addAllEnum(dto.getEnums())
                .addAllFault(dto.getFault())
                .build();
    }

    private tuya.tedge.driver.sdk.dpmodel.model.PropertyValue propertyValueRpc2Dto(tuya.tedge.driver.sdk.grpc.product.PropertyValue pro) {
        if (pro == null) {
            return new tuya.tedge.driver.sdk.dpmodel.model.PropertyValue();
        }
        return new tuya.tedge.driver.sdk.dpmodel.model.PropertyValue(
                DataType.typeOfValue(pro.getType()),
                pro.getReadWrite(),
                pro.getUnits(),
                pro.getMinimum(),
                pro.getMaximum(),
                pro.getDefaultValue(),
                pro.getShift(),
                pro.getScale(),
                pro.getEnumList(),
                pro.getFaultList()
        );
    }
}

package tuya.tedge.driver.sdk.dpmodel.dto.product;

import tuya.tedge.driver.sdk.base.dto.common.BaseSearchConditionQueryDto;
import lombok.Data;

@Data
public class ProductSearchQueryRequestDto {
    private BaseSearchConditionQueryDto baseSearchConditionQuery;
    private String deviceLibraryId;

    public ProductSearchQueryRequestDto(){
        baseSearchConditionQuery = new BaseSearchConditionQueryDto();
        deviceLibraryId = "";
    }
    public ProductSearchQueryRequestDto(BaseSearchConditionQueryDto baseSearchConditionQuery, String deviceLibraryId) {
        this.baseSearchConditionQuery = baseSearchConditionQuery;
        this.deviceLibraryId = deviceLibraryId;
    }

}

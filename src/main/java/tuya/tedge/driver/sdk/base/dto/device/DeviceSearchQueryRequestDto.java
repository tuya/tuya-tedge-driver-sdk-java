package tuya.tedge.driver.sdk.base.dto.device;

import tuya.tedge.driver.sdk.base.dto.common.BaseSearchConditionQueryDto;
import lombok.Data;

@Data
public class DeviceSearchQueryRequestDto {
    private BaseSearchConditionQueryDto baseSearchConditionQuery;
    private String activeStatuses;
    private String serviceId;
    private String productId;
    private String status;
    private String activeStatus;
    private String cloudDeviceIds;
    private String idOrNameLike;

    public DeviceSearchQueryRequestDto() {
        this.baseSearchConditionQuery = new BaseSearchConditionQueryDto();
        this.serviceId = "";
        this.activeStatuses = "";
        this.productId = "";
        this.status = "";
        this.activeStatus = "";
        this.cloudDeviceIds = "";
        this.idOrNameLike = "";
    }

    public DeviceSearchQueryRequestDto(BaseSearchConditionQueryDto baseSearchConditionQuery, String serviceId) {
        this.baseSearchConditionQuery = baseSearchConditionQuery;
        this.serviceId = serviceId;

        this.activeStatuses = "";
        this.productId = "";
        this.status = "";
        this.activeStatus = "";
        this.cloudDeviceIds = "";
        this.idOrNameLike = "";
    }

    public DeviceSearchQueryRequestDto(BaseSearchConditionQueryDto baseSearchConditionQuery, String activeStatuses, String serviceId, String productId, String status, String activeStatus, String cloudDeviceIds, String idOrNameLike) {
        this.baseSearchConditionQuery = baseSearchConditionQuery;
        this.activeStatuses = activeStatuses;
        this.serviceId = serviceId;
        this.productId = productId;
        this.status = status;
        this.activeStatus = activeStatus;
        this.cloudDeviceIds = cloudDeviceIds;
        this.idOrNameLike = idOrNameLike;
    }


}

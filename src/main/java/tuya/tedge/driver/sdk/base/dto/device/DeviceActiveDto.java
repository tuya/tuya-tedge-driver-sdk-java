package tuya.tedge.driver.sdk.base.dto.device;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class DeviceActiveDto {
    private List<String> idList;
    private Boolean isAll;

    public DeviceActiveDto() {
        idList = new ArrayList<>();
        isAll = false;
    }

    public DeviceActiveDto(List<String> idList, Boolean isAll) {
        this.idList = idList;
        this.isAll = isAll;
    }
}

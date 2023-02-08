package tuya.tedge.driver.sdk.base.dto.device;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@Data
public class MultiDeviceResponseDto {
    private Integer total;
    private List<DeviceInfoDto> deviceList;

    public MultiDeviceResponseDto() {
    }

    public MultiDeviceResponseDto(Integer total, List<DeviceInfoDto> deviceList) {
        this.total = total;
        this.deviceList = deviceList;
    }
}

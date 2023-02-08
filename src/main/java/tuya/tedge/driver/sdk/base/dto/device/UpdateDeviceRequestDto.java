package tuya.tedge.driver.sdk.base.dto.device;

import lombok.Data;

@Data
public class UpdateDeviceRequestDto {
    private DeviceUpdateInfoDto updateDevice;

    public UpdateDeviceRequestDto() {
        updateDevice = new DeviceUpdateInfoDto();
    }

    public UpdateDeviceRequestDto(DeviceUpdateInfoDto updateDevice) {
        this.updateDevice = updateDevice;
    }

}

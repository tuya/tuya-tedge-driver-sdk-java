package tuya.tedge.driver.sdk.base.dto.device;

import lombok.Data;

@Data
public class AddDeviceRequestDto {
    private DeviceAddInfoDto device;

    public AddDeviceRequestDto() {
        device = new DeviceAddInfoDto();
    }

    public AddDeviceRequestDto(DeviceAddInfoDto device) {
        this.device = device;
    }
}


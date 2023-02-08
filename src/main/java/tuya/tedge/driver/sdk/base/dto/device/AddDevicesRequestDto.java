package tuya.tedge.driver.sdk.base.dto.device;

import lombok.Data;

import java.util.List;

@Data
public class AddDevicesRequestDto {
    private List<DeviceAddInfoDto> deviceList;

    public  AddDevicesRequestDto(){
    }

    public AddDevicesRequestDto(List<DeviceAddInfoDto> deviceList) {
        this.deviceList = deviceList;
    }

}

package tuya.tedge.driver.sdk.base.dto.device;

import lombok.Data;

@Data
public class DeviceByIdRequestDto {
    private  String id;

    public DeviceByIdRequestDto(){
        id = "";
    }

    public DeviceByIdRequestDto(String id) {
        this.id = id;
    }

}

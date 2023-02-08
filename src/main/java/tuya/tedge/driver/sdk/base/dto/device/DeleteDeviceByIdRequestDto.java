package tuya.tedge.driver.sdk.base.dto.device;

import lombok.Data;

@Data
public class DeleteDeviceByIdRequestDto {
    private String id;

    public DeleteDeviceByIdRequestDto() {
        id = "";
    }

    public DeleteDeviceByIdRequestDto(String id) {
        this.id = id;
    }

}

package tuya.tedge.driver.sdk.base.dto.common;

import lombok.Data;
@Data
public class BaseExistResponseDto {
    private Boolean exist = false;


    public BaseExistResponseDto() {
    }

    public BaseExistResponseDto(Boolean exist) {
        this.exist = exist;
    }
}

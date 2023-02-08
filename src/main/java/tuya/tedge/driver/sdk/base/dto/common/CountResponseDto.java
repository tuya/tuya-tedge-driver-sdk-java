package tuya.tedge.driver.sdk.base.dto.common;

import lombok.Data;

@Data
public class CountResponseDto {
    private Integer count;

    public CountResponseDto() {
    }

    public CountResponseDto(Integer count) {
        this.count = count;
    }

}

package tuya.tedge.driver.sdk.base.dto.common;


import lombok.Data;

@Data
public class BaseWithIdResponseDto {
    private String[] id;

    public BaseWithIdResponseDto() {
    }

    public BaseWithIdResponseDto(String[] id) {
        this.id = id;
    }

}

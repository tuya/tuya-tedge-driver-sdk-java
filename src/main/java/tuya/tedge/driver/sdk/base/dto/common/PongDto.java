package tuya.tedge.driver.sdk.base.dto.common;

import lombok.Data;

@Data
public class PongDto {
    private String timestamp;

    public PongDto() {
    }

    public PongDto(String timestamp) {
        this.timestamp = timestamp;
    }

}

package tuya.tedge.driver.sdk.base.dto.common;

import lombok.Data;

@Data
public class GatewayStateDto {
    private Boolean state;

    public GatewayStateDto(Boolean state) {
        this.state = state;
    }

    public GatewayStateDto() {
    }
}

package tuya.tedge.driver.sdk.base.dto.common;

import lombok.Data;

@Data
public class VersionResponseDto {
    private String version;

    public VersionResponseDto() {
    }

    public VersionResponseDto(String version) {
        this.version = version;
    }

}

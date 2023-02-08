package tuya.tedge.driver.sdk.base.dto.common;

import lombok.Data;

@Data
public class VersionSdkResponseDto {
    private String sdkVersion;

    public VersionSdkResponseDto() {
    }

    public VersionSdkResponseDto(String sdkVersion) {
        this.sdkVersion = sdkVersion;
    }
}

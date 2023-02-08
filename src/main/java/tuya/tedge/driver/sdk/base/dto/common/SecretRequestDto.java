package tuya.tedge.driver.sdk.base.dto.common;

import lombok.Data;

@Data
public class SecretRequestDto {
    private String path;
    private SecretDataKeyValueDto[] secretData;

    public SecretRequestDto() {

    }

    public SecretRequestDto(String path, SecretDataKeyValueDto[] secretData) {
        this.path = path;
        this.secretData = secretData;
    }


}

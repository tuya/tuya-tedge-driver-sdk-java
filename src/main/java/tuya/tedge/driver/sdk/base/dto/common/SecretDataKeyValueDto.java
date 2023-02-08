package tuya.tedge.driver.sdk.base.dto.common;

import lombok.Data;

@Data
public class SecretDataKeyValueDto {
    private String key;
    private String value;

    public SecretDataKeyValueDto() {
    }

    public SecretDataKeyValueDto(String key, String value) {
        this.key = key;
        this.value = value;
    }

}

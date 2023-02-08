package tuya.tedge.driver.sdk.dpmodel.dto.event;

import lombok.Data;

@Data
public class BinaryReadingDto {
    private String mediaType;
    private byte[] binaryValue;

    public BinaryReadingDto(String mediaType, byte[] binaryValue) {
        this.mediaType = mediaType;
        this.binaryValue = binaryValue;
    }

}

package tuya.tedge.driver.sdk.dpmodel.dto.event;


import lombok.Data;

@Data
public class BaseReadingDto {
    private String id;
    private Long created;
    private Long origin;
    private String deviceId;
    private String dpId;
    private String productId;
    private String valueType;
    /**
     * binaryReading & simpleReadingDto 只允许其中一个有值。
     */
    private BinaryReadingDto binaryReadingDto;
    private SimpleReadingDto simpleReadingDto;

    public BaseReadingDto(String id, Long created, Long origin, String deviceId, String dpId, String productId, String valueType, BinaryReadingDto binaryReadingDto, SimpleReadingDto simpleReadingDto) {
        this.id = id;
        this.created = created;
        this.origin = origin;
        this.deviceId = deviceId;
        this.dpId = dpId;
        this.productId = productId;
        this.valueType = valueType;
        this.binaryReadingDto = binaryReadingDto;
        this.simpleReadingDto = simpleReadingDto;
    }
}

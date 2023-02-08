package tuya.tedge.driver.sdk.dpmodel.dto.event;

import lombok.Data;

import java.util.List;

@Data
public class EventDto {
    private String id;
    private String deviceId;
    private String productId;
    private Long created;
    private Long origin;
    private List<BaseReadingDto> baseReadingDtoList;

    public EventDto(String id, String deviceId, String productId, Long created, Long origin, List<BaseReadingDto> baseReadingDtoList) {
        this.id = id;
        this.deviceId = deviceId;
        this.productId = productId;
        this.created = created;
        this.origin = origin;
        this.baseReadingDtoList = baseReadingDtoList;
    }

}

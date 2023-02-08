package tuya.tedge.driver.sdk.dpmodel.dto.event;

import lombok.Data;

@Data
public class WithoutDpReportDto {


    private String topic;
    private Integer protocol;
    private Long s;
    private Long t;
    private byte[] data;

    public WithoutDpReportDto() {
        this.topic = "";
        this.protocol = 0;
        this.s = 0L;
        this.t = 0L;
        this.data = new byte[]{};
    }

    public WithoutDpReportDto(String topic, Integer protocol, Long s, Long t, byte[] data) {
        this.topic = topic;
        this.protocol = protocol;
        this.s = s;
        this.t = t;
        this.data = data;
    }
}

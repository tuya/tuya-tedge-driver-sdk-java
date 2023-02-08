package tuya.tedge.driver.sdk.dpmodel.dto.event;

import lombok.Data;

@Data
public class HttpReportDto {
    private String httpApi;
    private String version;
    private byte[] payload;

    public HttpReportDto() {
        this.httpApi = "";
        this.version = "";
        this.payload = new byte[]{};
    }

    public HttpReportDto(String httpApi, String version, byte[] payload) {
        this.httpApi = httpApi;
        this.version = version;
        this.payload = payload;
    }

}

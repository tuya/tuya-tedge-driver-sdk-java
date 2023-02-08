package tuya.tedge.driver.sdk.dpmodel.model;

import lombok.Data;


@Data
public class OssResult {
    private String id;
    private String info;

    public OssResult() {
    }

    public OssResult(String id, String info) {
        this.id = id;
        this.info = info;
    }
}

package tuya.tedge.driver.sdk.base.oss;

import lombok.Data;
@Data
public class PathConfig {
    private String log;
    private String detect;

    public PathConfig() {
    }

    public PathConfig(String log, String detect) {
        this.log = log;
        this.detect = detect;
    }
}

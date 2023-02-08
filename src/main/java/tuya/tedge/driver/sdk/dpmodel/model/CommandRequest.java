package tuya.tedge.driver.sdk.dpmodel.model;

import lombok.Data;

import java.util.Map;

@Data
public class CommandRequest {
    Integer protocol;
    Long t;
    Long s;
    Map<String, Object> data;

    public CommandRequest() {
    }

    public CommandRequest(Integer protocol, Long t, Long s, Map<String, Object> data) {
        this.protocol = protocol;
        this.t = t;
        this.s = s;
        this.data = data;
    }
}

package tuya.tedge.driver.sdk.base.mqtt;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ClosedNotify {
    @JSONField(name = "ClientId")
    private String ClientId;
    @JSONField(name = "Username")
    private String Username;

    public ClosedNotify() {
    }

    public ClosedNotify(String clientId, String username) {
        ClientId = clientId;
        Username = username;
    }
}

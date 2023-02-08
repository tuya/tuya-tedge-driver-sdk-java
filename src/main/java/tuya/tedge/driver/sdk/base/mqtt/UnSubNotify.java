package tuya.tedge.driver.sdk.base.mqtt;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UnSubNotify {
    @JSONField(name = "ClientId")
    private String ClientId;
    @JSONField(name = "Username")
    private String Username;
    @JSONField(name = "Topics")
    private String[] Topics;

    public UnSubNotify() {
    }

    public UnSubNotify(String clientId, String username, String[] topics) {
        ClientId = clientId;
        Username = username;
        Topics = topics;
    }
}

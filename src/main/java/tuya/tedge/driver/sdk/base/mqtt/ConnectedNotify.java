package tuya.tedge.driver.sdk.base.mqtt;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ConnectedNotify {
    @JSONField(name = "ClientId")
    private String ClientId;
    @JSONField(name = "Username")
    private String Username;

   public ConnectedNotify(){}

    public ConnectedNotify(String clientId, String username) {
        ClientId = clientId;
        Username = username;
    }
}

package tuya.tedge.driver.sdk.base.mqtt;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class AuthCheck {
    @JSONField(name = "ClientId")
    private String ClientId;
    @JSONField(name = "UserName")
    private String UserName;
    @JSONField(name = "Password")
    private String Password;
    @JSONField(name = "Pass")
    private Boolean Pass;
    @JSONField(name = "Msg")
    private String Msg;

    public AuthCheck() {
    }

    public AuthCheck(String clientId, String userName, String password, Boolean pass, String msg) {
        ClientId = clientId;
        UserName = userName;
        Password = password;
        Pass = pass;
        Msg = msg;
    }
}
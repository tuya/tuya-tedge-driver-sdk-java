package tuya.tedge.driver.sdk.base.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GatewayInfo {
    @JSONField(name = "gwId")
    private String gwId;
    @JSONField(name = "localKey")
    private String localKey;
    @JSONField(name = "env")
    private String env;
    @JSONField(name = "region")
    private String region;
    private GatewayModel dataModel;
    @JSONField(name = "cloudState")
    private boolean cloudState;
    @JSONField(name = "gatewayName")
    private String gatewayName;

    public GatewayInfo() {
    }

    public GatewayInfo(
            String gwId,
            String localKey,
            String env,
            String region,
            GatewayModel dataModel,
            Boolean cloudState,
            String gatewayName) {
        this.gwId = gwId;
        this.localKey = localKey;
        this.env = env;
        this.region = region;
        this.dataModel = dataModel;
        this.cloudState = cloudState;
        this.gatewayName = gatewayName;
    }
}

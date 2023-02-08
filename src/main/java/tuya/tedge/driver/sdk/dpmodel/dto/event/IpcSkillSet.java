package tuya.tedge.driver.sdk.dpmodel.dto.event;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class IpcSkillSet {
    @JSONField(name = "cloudGW")
    private Integer cloudGW;
    @JSONField(name = "webrtc")
    private Integer webRtc;
    @JSONField(name = "p2p")
    private Integer p2p;
    @JSONField(name = "sdk_version")
    private String sdkVersion;

    public IpcSkillSet() {
    }

    public IpcSkillSet(Integer cloudGW, Integer webRtc, Integer p2p, String sdkVersion) {
        this.cloudGW = cloudGW;
        this.webRtc = webRtc;
        this.p2p = p2p;
        this.sdkVersion = sdkVersion;
    }
}

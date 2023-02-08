package tuya.tedge.driver.sdk.base.oss;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
@Data
public class ResultNode {
    private PathConfig pathConfig;
    private String ak;
    private String sk;
    private String token;
    private String bucket;
    private String endpoint;
    private String provider;
    private String region;
    @JSONField(name = "id")
    private String cid;
    private String expiration;
    private Long lifeCycle;

    public ResultNode() {
    }

}
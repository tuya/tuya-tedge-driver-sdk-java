package tuya.tedge.driver.sdk.dpmodel.dto.event;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UploadTokenResp {
    @JSONField(name = "result")
    private UploadTokenInfo result;
    @JSONField(name = "t")
    private Long t;
    @JSONField(name = "success")
    private Boolean success;
    @JSONField(name = "status")
    private String status;

    public UploadTokenResp() {
    }

    public UploadTokenResp(UploadTokenInfo result, Long t, Boolean success, String status) {
        this.result = result;
        this.t = t;
        this.success = success;
        this.status = status;
    }
}

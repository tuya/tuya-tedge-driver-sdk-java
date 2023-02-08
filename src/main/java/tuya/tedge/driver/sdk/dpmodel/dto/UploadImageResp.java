package tuya.tedge.driver.sdk.dpmodel.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UploadImageResp {
    @JSONField(name = "success")
    private Boolean success;
    @JSONField(name = "code")
    private Long code;
    @JSONField(name = "msg")
    private String msg;
    @JSONField(name = "t")
    private Long t;
    @JSONField(name = "result")
    private ImageFileInfo result;

    public UploadImageResp() {
    }

    public UploadImageResp(Boolean success, Long code, String msg, Long t, ImageFileInfo result) {
        this.success = success;
        this.code = code;
        this.msg = msg;
        this.t = t;
        this.result = result;
    }
}

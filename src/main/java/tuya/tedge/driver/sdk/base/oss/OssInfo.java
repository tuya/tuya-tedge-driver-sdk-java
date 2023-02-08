package tuya.tedge.driver.sdk.base.oss;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
@Data
public class OssInfo {
    @JSONField(name = "result")
    private List<ResultNode> resultNodeList;
    private Boolean success;
    private Boolean e;
    private Long t;
    private String errorCode;
    private String errorMsg;

    public OssInfo() {
    }

    public OssInfo(List<ResultNode> resultNodeList, Boolean success, Boolean e, Long t, String errorCode, String errorMsg) {
        this.resultNodeList = resultNodeList;
        this.success = success;
        this.e = e;
        this.t = t;
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }
}
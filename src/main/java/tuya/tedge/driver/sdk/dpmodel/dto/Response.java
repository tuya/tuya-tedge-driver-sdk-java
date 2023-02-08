package tuya.tedge.driver.sdk.dpmodel.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {
    @JsonProperty("result_code")
    private Integer resultCode;
    @JsonProperty("response_name")
    private String responseName;
    private Object paras;

    public Response() {
    }

    public Response(Integer resultCode, String responseName, Object paras) {
        this.resultCode = resultCode;
        this.responseName = responseName;
        this.paras = paras;
    }

    public Integer getResultCode() {
        return this.resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public String getResponseName() {
        return this.responseName;
    }

    public void setResponseName(String responseName) {
        this.responseName = responseName;
    }

    public Object getParas() {
        return this.paras;
    }

    public void setParas(Object paras) {
        this.paras = paras;
    }
}

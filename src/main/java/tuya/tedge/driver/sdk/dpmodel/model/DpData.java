package tuya.tedge.driver.sdk.dpmodel.model;

import lombok.Data;

@Data
public class DpData<T> {
    private String dpId;
    private DataType dpType;
    private T dpValue;

    public DpData(String dpId, DataType dpType, T value) {
        this.dpId = dpId;
        this.dpType = dpType;
        this.dpValue = value;
    }
}

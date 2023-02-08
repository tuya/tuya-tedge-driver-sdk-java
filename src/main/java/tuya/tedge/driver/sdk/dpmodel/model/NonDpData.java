package tuya.tedge.driver.sdk.dpmodel.model;

import lombok.Data;

@Data
public class NonDpData<T> {
    private Integer protocol;
    private Long s;
    private Long t;
    private T data;

    public NonDpData() {
    }

    public NonDpData(Integer protocol, Long s, Long t, T data) {
        this.protocol = protocol;
        this.s = s;
        this.t = t;
        this.data = data;
    }
}

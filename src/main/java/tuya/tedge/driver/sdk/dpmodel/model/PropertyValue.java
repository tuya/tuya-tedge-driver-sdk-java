package tuya.tedge.driver.sdk.dpmodel.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class PropertyValue {
    private DataType type;
    private String readWrite;
    private String units;
    private Long minimum;
    private Long maximum;
    private String defaultValue;
    private String shift;
    private String scale;
    private List<String> enums;
    private List<String> fault;

    public PropertyValue() {
        this.readWrite = "";
        this.units = "";
        this.minimum = 0L;
        this.maximum = 0L;
        this.defaultValue = "";
        this.shift = "";
        this.scale = "";
        this.enums = new ArrayList<>();
        this.fault = new ArrayList<>();
    }

    public PropertyValue(DataType type, String readWrite, String units, Long minimum, Long maximum, String defaultValue, String shift, String scale, List<String> enums, List<String> fault) {
        this.type = type;
        this.readWrite = readWrite;
        this.units = units;
        this.minimum = minimum;
        this.maximum = maximum;
        this.defaultValue = defaultValue;
        this.shift = shift;
        this.scale = scale;
        this.enums = enums;
        this.fault = fault;
    }
}

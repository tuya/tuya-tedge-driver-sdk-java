package tuya.tedge.driver.sdk.dpmodel.model;

public enum DataType {
    TypeNotSupport("notSupport"),
    TypeValue("value"),
    TypeBool("bool"),
    TypeString("string"),
    TypeRaw("raw"),
    TypeEnum("enum"),
    TypeFault("fault"),
    TypeBitmap("bitmap"),
    TypeData("date"),
    TypeStruct("struct"),
    TypeArray("array");

    private final String dpType;

    DataType(String value) {
        this.dpType = value;
    }

    public String getValue() {
        return dpType;
    }

    public static DataType typeOfValue(String value) {
        for (DataType e : DataType.values()) {
            if (e.getValue().equals(value)) {
                return e;
            }
        }
        return TypeNotSupport;
    }
}

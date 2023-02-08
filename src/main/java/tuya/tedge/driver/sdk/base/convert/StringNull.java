package tuya.tedge.driver.sdk.base.convert;

public class StringNull {
    public static String getRealString(String originStr) {
        if (originStr == null) {
            return "";
        }
        return originStr;
    }
}

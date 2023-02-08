package tuya.tedge.driver.sdk.dpmodel.dto.event;

import lombok.Data;

@Data
public class SimpleReadingDto {

    private String value;

    public SimpleReadingDto(){
        value = "";
    }

    public SimpleReadingDto(String value) {
        this.value = value;
    }

}

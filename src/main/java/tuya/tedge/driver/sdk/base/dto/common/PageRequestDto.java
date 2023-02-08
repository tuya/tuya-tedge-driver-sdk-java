package tuya.tedge.driver.sdk.base.dto.common;

import lombok.Data;

@Data
public class PageRequestDto {
    private String nameLike;
    private Integer page;
    private Integer pageSize;

    public PageRequestDto() {
    }

    public PageRequestDto(String nameLike, Integer page, Integer pageSize) {
        this.nameLike = nameLike;
        this.page = page;
        this.pageSize = pageSize;

    }

}

package tuya.tedge.driver.sdk.base.dto.common;

import lombok.Data;

@Data
public class BaseSearchConditionQueryDto {
    private Integer page;
    private Integer pageSize;
    private String id;
    private String ids;
    private String likeId;
    private String name;
    private String nameLike;
    private Boolean isAll;

    public BaseSearchConditionQueryDto() {
//        this.page = 0;
//        this.pageSize = 0;
//        this.id = "";
//        this.ids = "";
//        this.likeId = "";
//        this.name = "";
//        this.nameLike = "";
//        this.isAll = false;
    }

    public BaseSearchConditionQueryDto(Integer page, Integer pageSize, String id, String ids, String likeId, String name, String nameLike, Boolean isAll) {
        this.page = page;
        this.pageSize = pageSize;
        this.id = id;
        this.ids = ids;
        this.likeId = likeId;
        this.name = name;
        this.nameLike = nameLike;
        this.isAll = isAll;
    }

}

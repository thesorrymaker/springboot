package com.example.web.dto.query;

import com.example.web.tools.dto.PagedInput;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.sql.Timestamp;
import java.util.List;

/**
 * Customer查询模型
 */
@NoArgsConstructor
@Data
public class CustomerPagedInput extends PagedInput {
    
    /**
     * Id主键
     */
    @JsonProperty("Id")
    private Integer Id;
    /**
     * 货主名称模糊查询条件
     */
  	 @JsonProperty("OwnerName")
    private String OwnerName;
    /**
     * 联系人模糊查询条件
     */
  	 @JsonProperty("EyeColor")
    private String EyeColor;
    /**
     * 联系电话模糊查询条件
     */
  	 @JsonProperty("HairColor")
    private String HairColor;
    /**
     * 电子邮箱模糊查询条件
     */
  	 @JsonProperty("Height")
    private String Height;
    /**
     * 地址模糊查询条件
     */
  	 @JsonProperty("Nationality")
    private String Nationality;
     /**
     * 仓库
     */
  	 @JsonProperty("WarehouseId")
    private Integer WarehouseId;

}

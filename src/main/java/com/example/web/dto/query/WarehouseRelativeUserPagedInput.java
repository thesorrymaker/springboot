package com.example.web.dto.query;

import com.example.web.tools.dto.PagedInput;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * WarehouseRelativeUser查询模型
 */
@NoArgsConstructor
@Data
public class WarehouseRelativeUserPagedInput extends PagedInput {
    
    /**
     * Id主键
     */
    @JsonProperty("id")
    private Integer Id;
     /**
     * 用户
     */
  	 @JsonProperty("UserId")
    private Integer UserId;
     /**
     * 仓库
     */
  	 @JsonProperty("WarehouseId")
    private Integer WarehouseId;

}

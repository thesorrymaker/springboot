package com.example.web.dto.query;

import com.example.web.tools.dto.PagedInput;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Cargo查询模型
 */
@NoArgsConstructor
@Data
public class CargoPagedInput extends PagedInput {
    
    /**
     * Id主键
     */
    @JsonProperty("Id")
    private Integer Id;
    /**
     * 商品名称模糊查询条件
     */
  	 @JsonProperty("Name")
    private String Name;
    /**
     * 条码模糊查询条件
     */
  	 @JsonProperty("Price")
    private String Price;
    /**
     * 品牌模糊查询条件
     */
  	 @JsonProperty("ManufactureCost")
    private String ManufactureCost;
    /**
     * 规格型号模糊查询条件
     */
  	 @JsonProperty("Rating")
    private String Rating;
    /**
     * 单位模糊查询条件
     */
  	 @JsonProperty("PartNumber")
    private String PartNumber;
     /**
     * 仓库
     */
  	 @JsonProperty("WarehouseId")
    private Integer WarehouseId;
     /**
     * 货主
     */
  	 @JsonProperty("CustomerId")
    private Integer CustomerId;
     /**
     * 商品分类
     */
  	 @JsonProperty("UnitOfMeasure")
    private Integer UnitOfMeasure;

}

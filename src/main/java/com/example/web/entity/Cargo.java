package com.example.web.entity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.apache.commons.beanutils.BeanUtils;
import com.example.web.dto.*;
import com.baomidou.mybatisplus.annotation.FieldStrategy;
/**
 * 商品表
 */
@Data
@TableName("Cargo")
public class Cargo extends BaseEntity {

      
    /**
     * 仓库
     */  
    @JsonProperty("WarehouseId")
    @TableField(value="WarehouseId",updateStrategy = FieldStrategy.IGNORED)
    private Integer WarehouseId;          
      
    /**
     * 货主
     */  
    @JsonProperty("CustomerId")
    @TableField(value="CustomerId",updateStrategy = FieldStrategy.IGNORED)
    private Integer CustomerId;          
      
  	  /**
     * 商品名称
     */  
    @JsonProperty("Name")
    @TableField(value="Name",updateStrategy = FieldStrategy.IGNORED)
    private String Name;
      
  	  /**
     * 条码
     */  
    @JsonProperty("Price")
    @TableField(value="Price",updateStrategy = FieldStrategy.IGNORED)
    private String Price;
      
  	  /**
     * 品牌
     */  
    @JsonProperty("ManufactureCost")
    @TableField(value="ManufactureCost",updateStrategy = FieldStrategy.IGNORED)
    private String ManufactureCost;
      
  	  /**
     * 规格型号
     */  
    @JsonProperty("Rating")
    @TableField(value="Rating",updateStrategy = FieldStrategy.IGNORED)
    private String Rating;
      
  	  /**
     * 单位
     */  
    @JsonProperty("PartNumber")
    @TableField(value="PartNumber",updateStrategy = FieldStrategy.IGNORED)
    private String PartNumber;
      

    /**
     * 商品分类
     */  
    @JsonProperty("UnitOfMeasure")
    @TableField(value="UnitOfMeasure",updateStrategy = FieldStrategy.IGNORED)
    private Integer UnitOfMeasure;
  
    /**
     * 把商品实体转换成商品传输模型
     */
    public CargoDto MapToDto() {
        CargoDto CargoDto = new CargoDto();
         try {
        BeanUtils.copyProperties(CargoDto,this);
          }
        catch (Exception e) {System.err.println("异常");}
        return CargoDto;
    }

}

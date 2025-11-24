package com.example.web.entity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.apache.commons.beanutils.BeanUtils;
import com.example.web.dto.*;
import com.baomidou.mybatisplus.annotation.FieldStrategy;
/**
 * 商品分类表
 */
@Data
@TableName("CargoType")
public class CargoType extends BaseEntity {


    /**
     * 名称
     */  
    @JsonProperty("Name")
    @TableField(value="Name",updateStrategy = FieldStrategy.IGNORED)
    private String Name;
      
    /**
     * 仓库
     */  
    @JsonProperty("WarehouseId")
    @TableField(value="WarehouseId",updateStrategy = FieldStrategy.IGNORED)
    private Integer WarehouseId;          
  
    /**
     * 把商品分类实体转换成商品分类传输模型
     */
    public CargoTypeDto MapToDto() {
        CargoTypeDto CargoTypeDto = new CargoTypeDto();
         try {
        BeanUtils.copyProperties(CargoTypeDto,this);
          }
        catch (Exception e) {System.err.println("异常");}
        return CargoTypeDto;
    }

}

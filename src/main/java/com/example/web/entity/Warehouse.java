package com.example.web.entity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.apache.commons.beanutils.BeanUtils;
import com.example.web.dto.*;
import com.baomidou.mybatisplus.annotation.FieldStrategy;
/**
 * 仓库表
 */
@Data
@TableName("Warehouse")
public class Warehouse extends BaseEntity {

      
  	  /**
     * 仓库名称
     */  
    @JsonProperty("Name")
    @TableField(value="Name",updateStrategy = FieldStrategy.IGNORED)
    private String Name;
      
  	  /**
     * 地址
     */  
    @JsonProperty("Address")
    @TableField(value="Address",updateStrategy = FieldStrategy.IGNORED)
    private String Address;
      
  	  /**
     * 城市
     */  
    @JsonProperty("City")
    @TableField(value="City",updateStrategy = FieldStrategy.IGNORED)
    private String City;
      
  	  /**
     * 国家
     */  
    @JsonProperty("Country")
    @TableField(value="Country",updateStrategy = FieldStrategy.IGNORED)
    private String Country;
      
  	  /**
     * 联系人
     */  
    @JsonProperty("AnnualTurnover")
    @TableField(value="AnnualTurnover",updateStrategy = FieldStrategy.IGNORED)
    private String AnnualTurnover;
      
    /**
     * 面积
     */  
    @JsonProperty("Area")
    @TableField(value="Area",updateStrategy = FieldStrategy.IGNORED)
    private Double Area;      
      
  	  /**
     * 仓库类型
     */  
    @JsonProperty("Type")
    @TableField(value="Type",updateStrategy = FieldStrategy.IGNORED)
    private String Type;
      
  	  /**
     * 环境条件
     */  
    @JsonProperty("Rating")
    @TableField(value="Rating",updateStrategy = FieldStrategy.IGNORED)
    private String Rating;
      
  	  /**
     * 联系电话
     */  
    @JsonProperty("EmployeesCount")
    @TableField(value="EmployeesCount",updateStrategy = FieldStrategy.IGNORED)
    private String EmployeesCount;
  
    /**
     * 把仓库实体转换成仓库传输模型
     */
    public WarehouseDto MapToDto() {
        WarehouseDto WarehouseDto = new WarehouseDto();
         try {
        BeanUtils.copyProperties(WarehouseDto,this);
          }
        catch (Exception e) {System.err.println("异常");}
        return WarehouseDto;
    }

}

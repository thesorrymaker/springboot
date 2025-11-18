package com.example.web.dto;
import com.example.web.enums.*;
import com.example.web.tools.dto.BaseDto;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.sql.Date;
import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.example.web.entity.*;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;
/**
 * 商品类
 */
@Data
public class CargoDto extends BaseDto
{

    
     
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
     * 商品名称
     */ 
    @JsonProperty("Name")
    private String Name;
    
     
    /**
     * 条码
     */ 
    @JsonProperty("Price")
    private String Price;
    
     
    /**
     * 品牌
     */ 
    @JsonProperty("ManufactureCost")
    private String ManufactureCost;
    
     
    /**
     * 规格型号
     */ 
    @JsonProperty("Rating")
    private String Rating;
    
     
    /**
     * 单位
     */ 
    @JsonProperty("PartNumber")
    private String PartNumber;
    

     
    /**
     * 商品分类
     */ 
    @JsonProperty("UnitOfMeasure")
    private Integer UnitOfMeasure;

     @JsonProperty("CargoTypeDto") 
    private CargoTypeDto CargoTypeDto;                        
   
     @JsonProperty("CustomerDto") 
    private CustomerDto CustomerDto;                        
   
     @JsonProperty("WarehouseDto") 
    private WarehouseDto WarehouseDto;                        
   
 	 /**
     * 把商品传输模型转换成商品实体
     */
    public Cargo MapToEntity(){
        Cargo Cargo= new Cargo();
        try {
         BeanUtils.copyProperties(Cargo,this);
          }
        catch (Exception e) {
            System.err.println("异常");
         }
        return Cargo;
    }

}

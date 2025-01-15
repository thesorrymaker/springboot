package com.example.web.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.web.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 商品表对应的Mapper
 */
@Mapper
public interface CargoMapper  extends BaseMapper<Cargo> {
    @Select("SELECT AVG(CAST(rating AS DECIMAL(10,2))) FROM cargo WHERE rating IS NOT NULL")
    Double getAverageRating();
}

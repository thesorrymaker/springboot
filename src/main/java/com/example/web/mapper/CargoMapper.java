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
}

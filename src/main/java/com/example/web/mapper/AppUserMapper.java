package com.example.web.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.web.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * 用户表对应的Mapper
 */
@Mapper
public interface AppUserMapper  extends BaseMapper<AppUser> {
    void importExcel(MultipartFile file) throws IOException;
}

package com.example.web.mapper;

import com.example.web.entity.ImportHistory;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface ImportHistoryMapper {

    @Insert("INSERT INTO import_history (file_name, upload_time, status) VALUES (#{fileName}, NOW(), #{status})")
    void insertHistory(ImportHistory history);

    @Select("SELECT * FROM import_history")
    List<ImportHistory> getImportHistory();
}

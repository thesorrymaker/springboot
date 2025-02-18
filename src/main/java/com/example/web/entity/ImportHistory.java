package com.example.web.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class ImportHistory {
    private Integer id;


    private String fileName;

    private LocalDateTime upload_time;
    private String status;
}

package com.example.web.tools;

import com.example.web.dto.AppUserDto;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelUtils {

    /**
     * 解析 Excel 文件并将其转化为 AppUserDto 列表
     * @param filePath Excel 文件路径
     * @return List<AppUserDto> 用户数据列表
     */
    public static List<AppUserDto> parseExcel(String filePath) throws IOException {
        List<AppUserDto> userDtos = new ArrayList<>();
        FileInputStream fis = new FileInputStream(new File(filePath));

        // 通过 Apache POI 读取 Excel 文件
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0); // 获取第一个工作表

        // 获取表头
        Iterator<Row> rowIterator = sheet.iterator();
        rowIterator.next(); // 跳过表头

        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            AppUserDto userDto = new AppUserDto();

            // 从 Excel 中提取数据并填充到 AppUserDto 对象
            userDto.setUserName(row.getCell(0).getStringCellValue());
            userDto.setPassword(row.getCell(1).getStringCellValue());
            userDto.setEmail(row.getCell(2).getStringCellValue());
            userDto.setImageUrls(row.getCell(3).getStringCellValue());
            userDto.setName(row.getCell(4).getStringCellValue());
            userDto.setPhoneNumber(row.getCell(5).getStringCellValue());

            // 处理日期格式
            if (row.getCell(6) != null) {
                userDto.setBirth(row.getCell(6).getDateCellValue().toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDateTime());
            }

            // 处理整数类型角色
            if (row.getCell(7) != null) {
                userDto.setRoleType((int) row.getCell(7).getNumericCellValue());
            }

            // 添加到列表
            userDtos.add(userDto);
        }

        workbook.close();
        fis.close();

        return userDtos;
    }
}


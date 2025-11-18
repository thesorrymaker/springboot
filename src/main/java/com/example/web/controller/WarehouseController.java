package com.example.web.controller;
import com.example.web.dto.*;
import com.example.web.dto.query.*;
import com.example.web.mapper.*;
import com.example.web.service.*;
import com.example.web.tools.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import lombok.SneakyThrows;
/**
 * 仓库控制器
 */
@RestController()
@RequestMapping("/Warehouse")
public class WarehouseController {
    @Autowired()
    private  WarehouseService WarehouseService;
    @Autowired()
    private WarehouseMapper WarehouseMapper;
    /**
     * 仓库分页查询
     */
    @RequestMapping(value = "/List", method = RequestMethod.POST)
    @SneakyThrows
    public PagedResult<WarehouseDto> List(@RequestBody WarehousePagedInput input)  {
        return WarehouseService.List(input);
    }
     /**
     * 单个仓库查询接口
     */
    @RequestMapping(value = "/Get", method = RequestMethod.POST)
    @SneakyThrows
    public WarehouseDto Get(@RequestBody WarehousePagedInput input) {

        return WarehouseService.Get(input);
    }
  
    /**
     * 仓库创建或则修改
     */
    @RequestMapping(value = "/CreateOrEdit", method = RequestMethod.POST)
    public WarehouseDto CreateOrEdit(@RequestBody WarehouseDto input) throws Exception {
        return WarehouseService.CreateOrEdit(input);
    }
    /**
     * 仓库删除
     */
    @RequestMapping(value = "/Delete", method = RequestMethod.POST)
    public void Delete(@RequestBody IdInput input)
    {
        WarehouseService.Delete(input);
    }

    /**
     * 仓库批量删除
     */
    @RequestMapping(value = "/BatchDelete", method = RequestMethod.POST)
    public void BatchDelete(@RequestBody IdsInput input)
    {
        WarehouseService.BatchDelete(input);
    }
  

 
}

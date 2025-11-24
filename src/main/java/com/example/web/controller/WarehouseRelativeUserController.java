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
 * 仓库用户控制器
 */
@RestController()
@RequestMapping("/WarehouseRelativeUser")
public class WarehouseRelativeUserController {
    @Autowired()
    private  WarehouseRelativeUserService WarehouseRelativeUserService;
    @Autowired()
    private WarehouseRelativeUserMapper WarehouseRelativeUserMapper;
    /**
     * 仓库用户分页查询
     */
    @RequestMapping(value = "/List", method = RequestMethod.POST)
    @SneakyThrows
    public PagedResult<WarehouseRelativeUserDto> List(@RequestBody WarehouseRelativeUserPagedInput input)  {
        return WarehouseRelativeUserService.List(input);
    }
     /**
     * 单个仓库用户查询接口
     */
    @RequestMapping(value = "/Get", method = RequestMethod.POST)
    @SneakyThrows
    public WarehouseRelativeUserDto Get(@RequestBody WarehouseRelativeUserPagedInput input) {

        return WarehouseRelativeUserService.Get(input);
    }
  
    /**
     * 仓库用户创建或则修改
     */
    @RequestMapping(value = "/CreateOrEdit", method = RequestMethod.POST)
    public WarehouseRelativeUserDto CreateOrEdit(@RequestBody WarehouseRelativeUserDto input) throws Exception {
        return WarehouseRelativeUserService.CreateOrEdit(input);
    }
    /**
     * 仓库用户删除
     */
    @RequestMapping(value = "/Delete", method = RequestMethod.POST)
    public void Delete(@RequestBody IdInput input)
    {
        WarehouseRelativeUserService.Delete(input);
    }

    /**
     * 仓库用户批量删除
     */
    @RequestMapping(value = "/BatchDelete", method = RequestMethod.POST)
    public void BatchDelete(@RequestBody IdsInput input)
    {
        WarehouseRelativeUserService.BatchDelete(input);
    }
  

 
}

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
 * 货主控制器
 */
@RestController()
@RequestMapping("/Customer")
public class CustomerController {
    @Autowired()
    private  CustomerService CustomerService;
    @Autowired()
    private CustomerMapper CustomerMapper;
    /**
     * 货主分页查询
     */
    @RequestMapping(value = "/List", method = RequestMethod.POST)
    @SneakyThrows
    public PagedResult<CustomerDto> List(@RequestBody CustomerPagedInput input)  {
        return CustomerService.List(input);
    }
     /**
     * 单个货主查询接口
     */
    @RequestMapping(value = "/Get", method = RequestMethod.POST)
    @SneakyThrows
    public CustomerDto Get(@RequestBody CustomerPagedInput input) {

        return CustomerService.Get(input);
    }
  
    /**
     * 货主创建或则修改
     */
    @RequestMapping(value = "/CreateOrEdit", method = RequestMethod.POST)
    public CustomerDto CreateOrEdit(@RequestBody CustomerDto input) throws Exception {
        return CustomerService.CreateOrEdit(input);
    }
    /**
     * 货主删除
     */
    @RequestMapping(value = "/Delete", method = RequestMethod.POST)
    public void Delete(@RequestBody IdInput input)
    {
        CustomerService.Delete(input);
    }

    /**
     * 货主批量删除
     */
    @RequestMapping(value = "/BatchDelete", method = RequestMethod.POST)
    public void BatchDelete(@RequestBody IdsInput input)
    {
        CustomerService.BatchDelete(input);
    }
  

 
}

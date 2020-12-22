package com.example.frameworkstudy.web.customer.controller;

import com.example.frameworkstudy.common.Response;
import com.example.frameworkstudy.handler.ErrorHandler;

import com.example.frameworkstudy.util.Helper;
import com.example.frameworkstudy.util.RedisUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 客户表 前端控制器
 * </p>
 *
 * @author Caratacus
 */
@Api(tags = {"Customer客户表相关接口"})
@RestController
@RequestMapping(value = "/customer")
@Validated
@Controller
public class CustomerRestController extends ErrorHandler {


    @GetMapping("/query")
    @ApiOperation("从redis里面查询出响应可以信息")
    public Response getCustomer(@RequestParam(value = "id",required = true)Long id){
         return Helper.packing(new RedisUtil().hget("customer",id+""));
    }

}

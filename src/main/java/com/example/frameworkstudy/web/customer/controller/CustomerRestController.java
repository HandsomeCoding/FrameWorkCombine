package com.example.frameworkstudy.web.customer.controller;

import com.example.frameworkstudy.common.Response;
import com.example.frameworkstudy.handler.ErrorHandler;

import com.example.frameworkstudy.service.CustomerService;
import com.example.frameworkstudy.util.Helper;
import com.example.frameworkstudy.util.RedisUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
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
    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private CustomerService customerService;


    private static ApplicationContext myApplicationContext;

    @Value("${server.port}")
    private String port;

    @GetMapping("/query")
    @ApiOperation("从redis里面查询出响应可以信息")
//    @ResponseBody
    public Response getCustomer(@RequestParam(value = "id",required = true)Long id){
        System.out.println(myApplicationContext);

//        return Helper.packing("port is" + port+"sssss"+customerService.query1(id));

         return Helper.packing(redisUtil.hget("customer",id+""));
    }

    public static ApplicationContext getMyApplicationContext() {
        return myApplicationContext;
    }

    public static void setMyApplicationContext(ApplicationContext myApplicationContext) {
        CustomerRestController.myApplicationContext = myApplicationContext;
    }
}

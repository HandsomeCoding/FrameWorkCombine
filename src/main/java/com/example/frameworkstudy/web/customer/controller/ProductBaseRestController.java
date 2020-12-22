package com.example.frameworkstudy.web.customer.controller;

import com.store.tianmao.handler.ErrorHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.validation.annotation.Validated;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 产品表 前端控制器
 * </p>
 *
 * @author Caratacus
 */
@Api(tags = {"ProductBase产品表相关接口"})
@RestController
@RequestMapping(value = "/productBase")
@Validated
public class ProductBaseRestController extends ErrorHandler {

}

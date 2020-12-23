package com.example.frameworkstudy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.frameworkstudy.entity.Customer;
import com.example.frameworkstudy.web.customer.vo.CustomerVo;

/**
 * <p>
 * 客户表 服务类
 * </p>
 *
 * @author Caratacus
 */
public interface CustomerService extends IService<Customer> {

    CustomerVo query(Long id);

     String query1(Long id);

}

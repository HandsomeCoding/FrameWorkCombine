package com.example.frameworkstudy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.frameworkstudy.entity.Customer;
import com.example.frameworkstudy.mapper.CustomerMapper;
import com.example.frameworkstudy.service.CustomerService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 客户表 服务实现类
 * </p>
 *
 * @author Caratacus
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements CustomerService {

}

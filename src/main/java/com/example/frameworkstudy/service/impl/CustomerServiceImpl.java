package com.example.frameworkstudy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.frameworkstudy.entity.Customer;
import com.example.frameworkstudy.exception.ServiceException;
import com.example.frameworkstudy.mapper.CustomerMapper;
import com.example.frameworkstudy.service.CustomerService;
import com.example.frameworkstudy.web.customer.vo.CustomerVo;
import org.springframework.beans.factory.annotation.Value;
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

    @Value("${server.port}")
    private String port;

    @Override
    public CustomerVo query(Long id) {
        if(id==null){
            throw new ServiceException("请传入id");
        }
        Customer one = this.lambdaQuery().eq(Customer::getId, id).one();
        if(one ==null) return new CustomerVo();
        return one.convert(CustomerVo.class);
    }


    @Override
    public String query1(Long id) {

        return port;
    }
}

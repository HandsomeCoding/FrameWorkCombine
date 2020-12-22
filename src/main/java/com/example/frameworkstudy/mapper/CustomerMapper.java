package com.example.frameworkstudy.mapper;

import com.store.tianmao.entity.Customer;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 客户表 Mapper 接口
 * </p>
 *
 * @author Caratacus
 */
@Mapper
public interface CustomerMapper extends BaseMapper<Customer> {

}

package com.example.frameworkstudy.mapper;

import com.store.tianmao.entity.ProductBase;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 产品表 Mapper 接口
 * </p>
 *
 * @author Caratacus
 */
@Mapper
public interface ProductBaseMapper extends BaseMapper<ProductBase> {

}

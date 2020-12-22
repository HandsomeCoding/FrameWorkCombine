package com.example.frameworkstudy.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.frameworkstudy.entity.ProductBase;
import com.example.frameworkstudy.mapper.ProductBaseMapper;
import com.example.frameworkstudy.service.ProductBaseService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品表 服务实现类
 * </p>
 *
 * @author Caratacus
 */
@Service
public class ProductBaseServiceImpl extends ServiceImpl<ProductBaseMapper, ProductBase> implements ProductBaseService {

}

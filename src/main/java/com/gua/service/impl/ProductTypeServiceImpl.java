package com.gua.service.impl;


import com.gua.mapper.ProductTypeMapper;
import com.gua.pojo.ProductType;
import com.gua.pojo.ProductTypeExample;
import com.gua.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Auther: zar
 * @Date: 2020/8/31 0031 14:12
 * version: 1.0
 */
@Service("ProductTypeServiceImpl")
public class ProductTypeServiceImpl implements ProductTypeService {
    //必有数据访问层的mapper对象

    @Autowired
    private ProductTypeMapper typeMapper;

    @Override
    public List<ProductType> getAllType() {
        return typeMapper.selectByExample(new ProductTypeExample());
    }
}

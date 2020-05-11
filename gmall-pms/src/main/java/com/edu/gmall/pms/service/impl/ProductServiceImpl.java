package com.edu.gmall.pms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.edu.gmall.pms.entity.Product;
import com.edu.gmall.pms.mapper.ProductMapper;
import com.edu.gmall.pms.service.ProductService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author qqq
 * @since 2020-05-10
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}

package com.edu.gmall.pms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.edu.gmall.pms.entity.ProductFullReduction;
import com.edu.gmall.pms.mapper.ProductFullReductionMapper;
import com.edu.gmall.pms.service.ProductFullReductionService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品满减表(只针对同商品) 服务实现类
 * </p>
 *
 * @author qqq
 * @since 2020-05-10
 */
@Service
public class ProductFullReductionServiceImpl extends ServiceImpl<ProductFullReductionMapper, ProductFullReduction> implements ProductFullReductionService {

}

package com.edu.gmall.pms.service.impl;

import com.edu.gmall.pms.entity.ProductLadder;
import com.edu.gmall.pms.mapper.ProductLadderMapper;
import com.edu.gmall.pms.service.ProductLadderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品阶梯价格表(只针对同商品) 服务实现类
 * </p>
 *
 * @author qqq
 * @since 2020-05-10
 */
@Service
public class ProductLadderServiceImpl extends ServiceImpl<ProductLadderMapper, ProductLadder> implements ProductLadderService {

}

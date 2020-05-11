package com.edu.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.edu.gmall.pms.entity.Brand;
import com.edu.gmall.pms.mapper.BrandMapper;
import com.edu.gmall.pms.service.BrandService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author qqq
 * @since 2020-05-10
 */
@Component
@Service

public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {

}

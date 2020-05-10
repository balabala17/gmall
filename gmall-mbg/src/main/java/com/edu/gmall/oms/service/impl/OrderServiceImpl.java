package com.edu.gmall.oms.service.impl;

import com.edu.gmall.oms.entity.Order;
import com.edu.gmall.oms.mapper.OrderMapper;
import com.edu.gmall.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author qqq
 * @since 2020-05-10
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}

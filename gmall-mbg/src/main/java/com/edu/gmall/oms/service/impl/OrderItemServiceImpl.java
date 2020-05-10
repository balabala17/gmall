package com.edu.gmall.oms.service.impl;

import com.edu.gmall.oms.entity.OrderItem;
import com.edu.gmall.oms.mapper.OrderItemMapper;
import com.edu.gmall.oms.service.OrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author qqq
 * @since 2020-05-10
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}

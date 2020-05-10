package com.edu.gmall.oms.service.impl;

import com.edu.gmall.oms.entity.CartItem;
import com.edu.gmall.oms.mapper.CartItemMapper;
import com.edu.gmall.oms.service.CartItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 购物车表 服务实现类
 * </p>
 *
 * @author qqq
 * @since 2020-05-10
 */
@Service
public class CartItemServiceImpl extends ServiceImpl<CartItemMapper, CartItem> implements CartItemService {

}

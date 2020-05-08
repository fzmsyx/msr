package com.msr.shop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.msr.shop.entity.Order;
import com.msr.shop.mapper.OrderMapper;
import com.msr.shop.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tom
 * @since 2020-05-07
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {
    @Override
    public List<Order> getOrdersByUserId(String userId) {
        return this.baseMapper.getOrdersByUserId(userId);
    }
}

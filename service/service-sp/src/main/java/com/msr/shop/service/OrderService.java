package com.msr.shop.service;

import com.msr.shop.entity.Order;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author tom
 * @since 2020-05-07
 */
public interface OrderService extends IService<Order> {

    List<Order> getOrdersByUserId(String userId);

}

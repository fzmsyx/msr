package com.msr.shop.controller;


import com.msr.commonutils.R;
import com.msr.shop.entity.Address;
import com.msr.shop.entity.Order;
import com.msr.shop.service.AddressService;
import com.msr.shop.service.OrderService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author tom
 * @since 2020-05-07
 */
@RestController
@RequestMapping("/shop/order")
public class OrderController {

 /*   @Autowired
    private OrderService orderService;

    @ApiOperation(value = "根据ID查询用户订单")
    @GetMapping("{id}")
    public R tOrdersByUserId(
            @ApiParam(name = "id", value = "用户ID", required = true)
            @PathVariable String id){
        System.out.println(id);

        List<Order> orders= orderService.getOrdersByUserId(id);
        return R.ok().data("item", orders);
    }*/


}


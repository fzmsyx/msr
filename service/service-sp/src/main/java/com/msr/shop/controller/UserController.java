package com.msr.shop.controller;


import com.msr.commonutils.R;
import com.msr.shop.entity.Address;
import com.msr.shop.entity.User;
import com.msr.shop.service.AddressService;
import com.msr.shop.service.OrderService;
import com.msr.shop.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/shopservice/user")
@Api(description="用户地址")
@CrossOrigin //跨域
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取所有用户地址与订单信息")
    @GetMapping()
    public R getUserAndAddressAndOrder() {
        List<User> users = userService.getUserAndAddressAndOrder();
        return R.ok().data("users", users);
    }

}


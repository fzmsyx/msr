package com.msr.shop.controller;


import com.msr.commonutils.R;
import com.msr.shop.entity.Address;
import com.msr.shop.service.AddressService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author tom
 * @since 2020-05-07
 */
@RestController
@RequestMapping("/shopservice/address")
@Api(description="用户地址")
@CrossOrigin //跨域
public class AddressController {

/*    @Autowired
    private AddressService addressService;

    @ApiOperation(value = "根据ID查询用户地址")
    @GetMapping("{id}")
    public R getAddressByUserId(
            @ApiParam(name = "id", value = "用户ID", required = true)
            @PathVariable String id){
        System.out.println(id);

        Address address = addressService.getAddressByUserId(id);
        return R.ok().data("item", address);
    }*/

}


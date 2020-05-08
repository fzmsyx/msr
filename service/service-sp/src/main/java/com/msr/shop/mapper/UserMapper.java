package com.msr.shop.mapper;

import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.msr.shop.entity.Order;
import com.msr.shop.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.sql.Wrapper;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author tom
 * @since 2020-05-07
 */

public interface UserMapper extends BaseMapper<User> {
        @Results({
                @Result( id=true,column = "id",property = "id"),
                @Result(column = "username",property = "username"),
                @Result(column = "birthday",property = "birthday"),
                @Result(column = "sex",property = "sex"),
                @Result(column = "is_deleted",property = "isDeleted"),
                @Result(column = "gmt_create",property = "gmt_create"),
                @Result(column = "gmt_modified",property = "gmt_modified"),
                @Result(column = "id",property = "address",one=@One(select="som.msr.shop.AddressMapper.getAddressByUserId")),
                @Result(column = "id",property = "orders",many=@Many(select="com.msr.shop.OrderMapper.getOrderByUserId"))

        })
        @Select("select*from shop_user")
        public List<User> getUserAndAddressAndOrder();

}

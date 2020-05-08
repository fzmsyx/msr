package com.msr.shop.mapper;

import com.msr.shop.entity.Address;
import com.msr.shop.entity.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author tom
 * @since 2020-05-07
 */
public interface OrderMapper extends BaseMapper<Order> {
    //根据用过户id查询地址
    @Select("select * from shop_order where user_id = #{userId}")
    public List<Order> getOrdersByUserId(String userId);
}

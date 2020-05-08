package com.msr.shop.service.impl;

import com.msr.shop.entity.Address;
import com.msr.shop.mapper.AddressMapper;
import com.msr.shop.service.AddressService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tom
 * @since 2020-05-07
 */
@Service
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements AddressService {

    @Override
    public Address getAddressByUserId(String userId) {
        return this.baseMapper.getAddressByUserId(userId);
    }
}

package com.msr.shop.service;

import com.msr.shop.entity.Address;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author tom
 * @since 2020-05-07
 */
public interface AddressService extends IService<Address> {

    //根据id查询用户地址
    Address getAddressByUserId(String userId);


}

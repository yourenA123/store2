package com.helper.store.service;

import com.helper.store.domain.Address;
import com.helper.store.domain.JsonMessage;

import java.util.Map;

/**
 * @author yanghao
 * @create 2019-08-05 12:14
 * @Description:
 */
public interface AddressService {
    /**
     * 查询所有地址
     * @param userId
     * @return
     */
    JsonMessage listAddress(Map<String, Object> param);

    /**
     * 增加收货地址
     * @param param
     */
    JsonMessage insertAddress(Map<String, Object> param);

    /**
     * 根据id删除收货地址
     * @param id
     */
    JsonMessage deleteAddress(Integer id);

    /**
     * 修改收货地址
     * @param address
     */
    JsonMessage updateAddress(Address address);
}

package com.helper.store.dao;

import com.helper.store.domain.Address;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author yanghao
 * @create 2019-08-05 11:53
 * @Description:
 */
@Mapper
@Repository
public interface AddressMapper {
    /**
     * 查询所有地址
     * @param param
     * @return
     */
    List<Map<String,Object>> listAddress(Map<String, Object> param);

    /**
     * 增加收货地址
     * @param param
     */
    void insertAddress(Map<String, Object> param);

    /**
     * 根据id删除收货地址
     * @param id
     */
    void deleteAddress(Integer id);

    /**
     * 修改收货地址
     * @param address
     */
    void updateAddress(Address address);
}

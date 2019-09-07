package com.helper.store.dao;

import com.helper.store.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author sheamus
 * @date 2019.7.3
 */
@Mapper
@Repository
public interface UserDao {
    /**
     * 获取商铺详情
     * @param param
     * @return
     */
    Map<String,Object> getUserInfoById(Map<String,Object> param);

    /**
     * 修改商铺昵称
     * @param param
     * @return
     */
    void updateStoreName(Map<String,Object> param);

    /**
     * 修改常住地
     * @param param
     * @return
     */
    void updateAddress(Map<String,Object> param);

    /**
     * 修改图片
     * @param param
     * @return
     */
    void updateImg(Map<String,Object> param);

    /**
     * 获取用户余额
     * @param param
     * @return
     */
    Double getBalanceByUser(Map<String,Object> param);

    /**
     * 修改用户余额
     * @param param
     */
    void updateUserBalance(Map<String,Object> param);
}

package com.helper.store.service;

import com.helper.store.domain.User;

import java.util.List;
import java.util.Map;

/**
 * @author sheamus
 * @date 2019.7.3
 */
public interface UserService {
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
     * 获取用户信息
     * @param param
     * @return
     */
    Map<String,Object> getUserInfo(Map<String,Object> param);

    /**
     * 获取用户余额
     * @param param
     * @return
     */
    List<Map<String,Object>> getBalanceByUser(Map<String,Object> param);

    /**
     *绑定用户支付宝
     * @param param
     * @return
     */
    void updateUserAliPay(Map<String,Object> param);


    /**
     * 用户提现
     * @param param
     */
    void withdrawal(Map<String,Object> param);

    /**
     * 提现记录
     * @param param
     */
    void saveWithdrawalrecord(Map<String,Object> param);



}

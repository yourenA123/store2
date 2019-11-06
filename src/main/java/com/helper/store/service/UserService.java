package com.helper.store.service;

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
     * 用户充值
     * @param param
     */
    void charge(Map<String,Object> param);

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

    /**
     * 增加用户邀请积分
     * @param param
     */
    void addIntegral(Map<String,Object> param);

    /**
     * 验证邀请码
     * @param param
     * @return
     */
    Map<String,Object> selectInvitationCode(Map<String,Object> param);

    /**
     * 积分换红包
     * @param param
     */
    Map<String, Object> redPacket(Map<String,Object> param);

    /**
     * 查看积分
     * @param param
     * @return
     */
    Map<String,Object> selectIntegral(Map<String,Object> param);





}

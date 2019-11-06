package com.helper.store.service.impl;


import com.helper.store.dao.UserDao;
import com.helper.store.service.UserService;
import com.helper.store.util.ParamsUtils;
import com.helper.store.util.SmsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sheamus
 * @date 2019.7.3
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public Map<String, Object> getUserInfoById(Map<String, Object> param) {
        ParamsUtils.getUser("userId",param);
        return userDao.getUserInfoById(param);
    }

    @Override
    public void updateStoreName(Map<String, Object> param) {
        ParamsUtils.getUser("userId",param);
        userDao.updateStoreName(param);
    }

    @Override
    public void updateAddress(Map<String, Object> param) {
        ParamsUtils.getUser("userId",param);
        userDao.updateAddress(param);
    }

    @Override
    public void updateImg(Map<String, Object> param) {
        ParamsUtils.getUser("userId",param);
        userDao.updateImg(param);
    }

    @Override
    public Map<String, Object> getUserInfo(Map<String, Object> param) {
        ParamsUtils.getUser("userId",param);
        return userDao.getUserInfo(param);
    }

    @Override
    public void charge(Map<String, Object> param) {
        ParamsUtils.getUser("userId",param);
         userDao.charge(param);
    }


    @Override
    public void updateUserAliPay(Map<String, Object> param) {
        ParamsUtils.getUser("userId",param);
        userDao.updateUserAliPay(param);
    }


    @Override
    public void withdrawal(Map<String, Object> param) {
        ParamsUtils.getUser("userId",param);
        userDao.withdrawal(param);
    }

    @Override
    public void saveWithdrawalrecord(Map<String, Object> param) {
        ParamsUtils.getUser("userId",param);
        userDao.saveWithdrawalrecord(param);
    }

    @Override
    public void addIntegral(Map<String, Object> param) {
        userDao.addIntegral(param);
    }

    /**
     * 查找邀请码
     * @param param
     * @return
     */
    @Override
    public Map<String, Object> selectInvitationCode(Map<String, Object> param) {
        return userDao.selectInvitationCode(param);
    }

    @Override
    public Map<String, Object> redPacket(Map<String, Object> param) {
        ParamsUtils.getUser("userId",param);
        String money = SmsUtil.rCode();
        param.put("money",money);
        return userDao.redPacket(param);
    }

    @Override
    public Map<String, Object> selectIntegral(Map<String, Object> param) {
        ParamsUtils.getUser("userId",param);
        return userDao.selectIntegral(param);
    }


}

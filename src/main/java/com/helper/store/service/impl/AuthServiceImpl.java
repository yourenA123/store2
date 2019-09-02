package com.helper.store.service.impl;

import com.helper.store.dao.AuthDao;
import com.helper.store.domain.User;
import com.helper.store.service.AuthService;
import com.helper.store.util.SmsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author sheamus
 * @date 2019.7.3
 */
@Service
public class AuthServiceImpl implements AuthService {
    @Autowired
    private AuthDao authDao;
    @Override
    public int countPhone(String phone) {
        return authDao.countPhone(phone);
    }

    @Override
    public void saveUser(Map<String, Object> param) {
        String nickName = "用户" + SmsUtil.vCode();
        String invitationCode ="SS" + SmsUtil.vCode();
        param.put("nickName",nickName);
        param.put("invitationCode",invitationCode);
        authDao.saveUser(param);
    }

    @Override
    public List<User> getUserByUserName(Map<String, Object> param) {
        return authDao.getUserByUserName(param);
    }
}

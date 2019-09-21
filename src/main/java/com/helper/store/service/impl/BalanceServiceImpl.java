package com.helper.store.service.impl;

import com.helper.store.dao.BalanceMapper;
import com.helper.store.domain.JsonMessage;
import com.helper.store.service.BalanceService;
import com.helper.store.util.Constants;
import com.helper.store.util.ParamsUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Service
public class BalanceServiceImpl implements BalanceService {
    @Autowired
    BalanceMapper balanceMapper;


    @Override
    public JsonMessage saveBalance(Map<String, Object> param) {
        JsonMessage jsonMessage = new JsonMessage();
        try {
            param.put("sum",param);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            param.put("createTime",sdf.format(new Date()));
            ParamsUtils.getUser("userId",param);
            balanceMapper.saveBalance(param);
            jsonMessage.setResponseCode(Constants.RES_CODE_0);
            jsonMessage.setErrorMessage(Constants.RES_MESSAGE_0);
        }catch (Exception e){
            e.printStackTrace();
            jsonMessage.setResponseCode(Constants.RES_CODE_101);
            jsonMessage.setErrorMessage(Constants.RES_MESSAGE_101);
        }
        return jsonMessage;
    }
}

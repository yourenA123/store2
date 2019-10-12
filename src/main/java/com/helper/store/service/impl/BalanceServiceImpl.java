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
import java.util.List;
import java.util.Map;

@Service
public class BalanceServiceImpl implements BalanceService {
    @Autowired
    BalanceMapper balanceMapper;


    @Override
    public List<Map<String, Object>> getBalanceInfo(Map<String, Object> param) {
        ParamsUtils.getUser("userId",param);
        return balanceMapper.getBalanceInfo(param);
    }
}

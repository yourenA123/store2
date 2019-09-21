package com.helper.store.service;

import com.helper.store.domain.JsonMessage;

import java.util.Map;

public interface BalanceService {
    /**
     * 生成余额明细
     * @param param
     * @return
     */
    JsonMessage saveBalance(Map<String,Object> param);
}

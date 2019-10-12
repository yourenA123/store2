package com.helper.store.service;

import com.helper.store.domain.JsonMessage;

import java.util.List;
import java.util.Map;

public interface BalanceService {
    /**
     * 获取余额明细
     * @param param
     * @return
     */
    List<Map<String,Object>> getBalanceInfo (Map<String,Object> param);
}

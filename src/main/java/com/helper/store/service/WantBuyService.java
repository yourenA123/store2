package com.helper.store.service;

import com.helper.store.domain.JsonMessage;
import com.helper.store.domain.WantBuy;

import java.util.Map;

/**
 * @author yanghao
 * @create 2019-07-02 15:28
 * @Description:
 */
public interface WantBuyService {
    /**
     * 求购
     * @return
     */
    JsonMessage saveShoe(Integer id);


    /**
     * 获取用户所有想要求购的鞋
     * @param param
     * @return
     */
    Map<String,Object> getUserWantBuy(Map<String,Object> param);


}

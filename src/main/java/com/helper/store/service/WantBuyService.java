package com.helper.store.service;

import com.helper.store.domain.JsonMessage;
import com.helper.store.domain.WantBuy;

import java.util.List;
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
    List<Map<String,Object>> getUserWantBuy (Map<String,Object> param);

    /**
     * 获取求购的最低价
     * @param param
     * @return
     */
    Map<String,Object> getMinPrice(Map<String,Object>param);

    /**
     * 获取求购的最高价
     * @param param
     * @return
     */
    Map<String,Object> getMaxPrice(Map<String,Object>param);
    /**
     * 保存求购订单
     * @param param
     */
    void saveWantBuy(Map<String,Object> param);


}

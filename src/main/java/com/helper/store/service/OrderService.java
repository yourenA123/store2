package com.helper.store.service;

import com.helper.store.domain.JsonMessage;

import java.util.Map;

/**
 * @author yanghao
 * @create 2019-08-08 15:32
 * @Description:
 */
public interface OrderService {

    /**
     * 生成订单
     * @param param
     * @return
     */
    JsonMessage saveOrder(Map<String,Object> param);
    /**
     * 取消订单
     * @param param
     * @return
     */
    JsonMessage cancelOrder(Map<String, Object> param);
    /**
     * 立即付款
     * @param param
     * @return
     */
    JsonMessage payOrder(Map<String, Object> param);

    /**
     * 删除订单
     * @param param
     * @return
     */
    JsonMessage deleteOrder(Map<String, Object> param);

}

package com.helper.store.service;

import com.helper.store.domain.JsonMessage;
import org.apache.ibatis.annotations.Param;

import java.util.List;
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
     * 填写快递单号
     * @param param
     * @return
     */
    void inputTrackingNumber(Map<String,Object> param);

    /**
     * 获取快递单号
     * @param param
     * @return
     */
    Map<String,Object> getTrackingNumber(Map<String,Object> param);

    /**
     * 根据buysellID获取订单信息
     * @param param
     * @return
     */
    List<Map<String,Object>> getOrderByBuyorsellId(Map<String,Object> param);

    /**
     * 删除订单
     * @param param
     * @return
     */
    JsonMessage deleteOrder(Map<String, Object> param);

    /**
     * 完成订单
     * @param param
     * @return
     */
    void orderFinish(Map<String,Object> param);

}

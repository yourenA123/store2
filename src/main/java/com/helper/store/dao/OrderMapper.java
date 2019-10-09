package com.helper.store.dao;

import com.helper.store.domain.JsonMessage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author yanghao
 * @create 2019-08-05 12:10
 * @Description:
 */
@Mapper
@Repository
public interface OrderMapper {

    /**
     * 提交订单
     * @param param
     */
    void saveOrder(Map<String,Object> param);



    /**
     * 取消订单
     * @param param
     * @return
     */
    void cancelOrder(Map<String, Object> param);

    /**
     * 取消订单还原鞋子订单
     * @param param
     */
    void restoreSell(Map<String,Object> param);

    /**
     * 取消订单还原鞋子订单2
     * @param param
     */
    void restoreSell2(Map<String,Object> param);

    /**
     * 生成订单鞋子卖出
     * @param param
     */
    void shoeSell(Map<String,Object> param);

    /**
     * 生成订单鞋子卖出2
     * @param param
     */
    void shoeSell2(Map<String,Object> param);

    /**
     * 立即付款
     * @param param
     * @return
     */
    void payOrder(Map<String, Object> param);
    /**
     * 填写快递单号
     * @param param
     * @return
     *
     */
    void inputTrackingNumber(Map<String,Object> param);

    /**
     * 获取快递单号
     * @param param
     * @return
     */
    Map<String,Object> getTrackingNumber(Map<String,Object> param);

    /**
     * 根据buyorsellID获取订单信息
     * @param param
     * @return
     */
    List<Map<String,Object>> getOrderByBuyorsellId(Map<String,Object> param);

    /**
     * 删除订单
     * @param param
     * @return
     */
    void deleteOrder(Map<String, Object> param);

    /**
     * 获得订单
     * @param param
     * @return
     */
    Map<String,Object> getOrderByNo(Map<String,Object> param);
    /**
     * 完成订单
     * @param param
     * @return
     */
    void orderFinish(Map<String,Object> param);
}

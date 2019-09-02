package com.helper.store.dao;

import com.helper.store.domain.JsonMessage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

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
     * 立即付款
     * @param param
     * @return
     */
    void payOrder(Map<String, Object> param);

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
}

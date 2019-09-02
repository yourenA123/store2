package com.helper.store.dao;

import com.helper.store.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author sheamus
 * @date 2019.7.3
 */
@Mapper
@Repository
public interface BulkDao {
    /**
     * 获取所有鞋（批发）
     * @param
     * @return
     */
    List<Map<String,Object>> listShoe();

    /**
     * 获取商店
     * @param param
     * @return
     */
    List<Map<String,Object>> listStore(Map<String,Object> param);

    /**
     * 获取商铺详情
     * @param param
     * @return
     */
    Map<String,Object> getStoreInfoById(Map<String,Object> param);

    /**
     * 获取出售的鞋（批发）
     * @param param
     * @return
     */
    List<Map<String,Object>> listgoodsBulk(Map<String,Object> param);

    /**
     * 生成订单
     * @param
     * @return
     */
    void saveOrder(Map<String,Object> param);

    /**
     * 根据订单号获取订单
     * @param param
     * @return
     */
    Map<String,Object> getOrderBulkByNo(Map<String,Object> param);

    /**
     * 修改订单
     * @param
     * @return
     */
    void updateOrder(Map<String,Object> param);

}

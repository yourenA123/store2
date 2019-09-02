package com.helper.store.service;

import java.util.List;
import java.util.Map;

/**
 * @author sheamus
 * @date 2019.7.3
 */
public interface BulkService {
    /**
     * 获取所有鞋（批发）
     * @param
     * @return
     */
    List<Map<String,Object>> listShoe();

    /**
     * 获取所有商铺
     * @param
     * @return
     */
    List<Map<String,Object>> listStore(Map<String,Object> param);

    /**
     * 获取商铺信息
     * @param
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
    Map<String,Object> saveOrder(Map<String,Object> param);

    /**
     * 修改订单
     * @param
     * @return
     */
    void updateOrder(Map<String,Object> param);
}

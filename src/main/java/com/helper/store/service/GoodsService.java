package com.helper.store.service;

import com.helper.store.domain.JsonMessage;

import java.util.List;
import java.util.Map;

/**
 * @author yanghao
 * @create 2019-07-15 13:57
 * @Description:
 */
public interface GoodsService {
    /**
     * 所有尺码
     * @param shoeId
     * @return
     */
    JsonMessage selectSize(Integer shoeId);

    /**
     * 根据shoeId查找鞋子内容
     * @param shoeId
     * @return
     */
    JsonMessage selectShoeByShoeId(Integer shoeId);

    /**
     * 查找交易记录
     * @param shoeId
     * @return
     */
    JsonMessage selectOrderByGoodsId(Integer shoeId);

    /**
     * 我正在出售的鞋子
     * @param param
     * @return
     */
    List<Map<String,Object>> shoesOnSale(Map<String,Object> param);


    /**
     * 上架鞋子
     * @param param
     */
    void sellingShoes(Map<String,Object> param);

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
}

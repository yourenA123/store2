package com.helper.store.service;

import com.helper.store.domain.JsonMessage;

import java.util.List;
import java.util.Map;

/**
 * @author yanghao
 * @create 2019-07-02 15:28
 * @Description:
 */
public interface ShoeService {
    /**
     * 查找全部的鞋子
     * @return
     */
    JsonMessage selectShoe();

    /**
     * 模糊查找鞋子
     * @param param
     * @return
     */
    List<Map<String,Object>> selectShoeByKeyword(Map<String, Object> param);

    /**
     * 销量排序
     * @return
     */
    JsonMessage selectShoeByNum();

    /**
     * 时间排序
     * @return
     */
    JsonMessage selectShoeByTime();
    /**
     * 价格排序 高到低
     * @return
     */
    JsonMessage selectShoeByPriceDesc();
    /**
     * 价格排序 低到高
     * @return
     */
    JsonMessage selectShoeByPriceAsc();

    /**
     * 遍历品牌
     * @return
     */
    JsonMessage selectBrand();

    /**
     * 商品筛选
     * @param type
     * @param priceRange
     * @param brand
     * @param size
     * @return
     */
    JsonMessage selectByTypeAndPriceRangeAndBrandAndSize(Integer type,String priceRange,String brand,Double size);

    /**
     * 相关推荐
     * @param type
     * @return
     */
    JsonMessage recommended(Integer type);

}

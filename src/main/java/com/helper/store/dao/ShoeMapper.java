package com.helper.store.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface ShoeMapper {
    /**
     * 查找全部的鞋子
     * @return
     */
    List<Map<String,Object>> selectShoe();
    /**
     * 关键字查找鞋子
     * @param param
     * @return
     */
    List<Map<String,Object>> selectShoeByKeyword(Map<String, Object> param);
    /**
     * 销量排序
     * @return
     */
    List<Map<String,Object>> selectShoeByNum();

    /**
     * 时间排序
     * @return
     */
    List<Map<String,Object>> selectShoeByTime();
    /**
     * 价格排序 高到低
     * @return
     */
    List<Map<String,Object>> selectShoeByPriceDesc();
    /**
     * 价格排序 低到高
     * @return
     */
    List<Map<String,Object>> selectShoeByPriceAsc();

    /**
     * 遍历品牌
     * @return
     */
    List<Map<String,Object>> selectBrand();

    /**
     * 商品筛选
     * @param type
     * @param minPrice
     * @param maxPrice
     * @param brand
     * @param size
     * @return
     */
    List<Map<String,Object>> selectByTypeAndPriceRangeAndBrandAndSize(@Param("type") Integer type,@Param("minPrice") Double minPrice,@Param("maxPrice") Double maxPrice,@Param("brand") String brand,@Param("size") Double size);

    /**
     * 相关推荐
     * @param type
     * @return
     */
    List<Map<String,Object>> recommended(Integer type);

}
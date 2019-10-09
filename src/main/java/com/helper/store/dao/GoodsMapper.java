package com.helper.store.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface GoodsMapper {
    /**
     * 所有尺码
     * @param shoeId
     * @return
     */
    List<Map<String,Object>> selectSize(Integer shoeId);

    /**
     * 根据shoeId查找鞋子内容
     * @param shoeId
     * @return
     */
    Map<String,Object> selectShoeByShoeId(Integer shoeId);

    /**
     * 查找交易记录
     * @param shoeId
     * @return
     */
    List<Map<String,Object>> selectOrderByGoodsId(Integer shoeId);

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
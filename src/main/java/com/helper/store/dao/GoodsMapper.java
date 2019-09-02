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
}
package com.helper.store.dao;

import com.helper.store.domain.WantBuy;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author hzq
 * @date 2019-9-26 15:37:19
 *
 */
@Mapper
@Repository
public interface WantBuyMapper {

    void saveShoe(Integer id);

    /**
     * 获取用户所有想要求购的鞋
     * @param param
     * @return
     */
    List<Map<String,Object>> getUserWantBuy (Map<String,Object> param);

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

    /**
     * 保存求购订单
     * @param param
     */
    void saveWantBuy(Map<String,Object> param);

    /**
     *查鞋子尺码
     * @param param
     * @return
     */
    List<Map<String,Object>> selectSize(Map<String,Object> param);
}
package com.helper.store.dao;

import com.helper.store.domain.WantBuy;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

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
    Map<String,Object> getUserWantBuy(Map<String,Object> param);
}
package com.helper.store.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface BalanceMapper {
    /**
     * 获取余额明细
     * @param param
     * @return
     */
    List<Map<String,Object>> getBalanceInfo (Map<String,Object> param);

}

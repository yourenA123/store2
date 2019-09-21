package com.helper.store.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Mapper
@Repository
public interface BalanceMapper {
    /**
     * 生成余额明细
     * @param param
     * @return
     */
    void saveBalance(Map<String,Object> param);

}

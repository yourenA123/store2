package com.helper.store.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author yanghao
 * @create 2019-08-05 12:08
 * @Description:
 */
@Mapper
@Repository
public interface DisCountMapper {
    /**
     * 查找优惠券
     */
    List<Map<String,Object>> listDisCounts(Map<String,Object> param);

    /**
     * 修改优惠券状态
     * @param id
     */
    void updateDisCounts(Integer id);
}

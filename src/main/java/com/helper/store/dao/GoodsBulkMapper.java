package com.helper.store.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author yanghao
 * @create 2019-07-15 16:10
 * @Description:
 */
@Mapper
@Repository
public interface GoodsBulkMapper {

    List<Map<String, Object>> selectSize(Integer shoeId);
}

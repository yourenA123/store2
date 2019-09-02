package com.helper.store.service;

import com.helper.store.domain.JsonMessage;
import org.omg.CORBA.OBJECT_NOT_EXIST;

import java.util.Map;

/**
 * @author yanghao
 * @create 2019-08-05 12:15
 * @Description:
 */
public interface DisCountsService {
    /**
     * 查找优惠券
     */
    JsonMessage listDisCounts(Map<String,Object> param);

    /**
     * 修改优惠券状态
     * @param id
     * @return
     */
    JsonMessage updateDisCounts(Integer id);
}

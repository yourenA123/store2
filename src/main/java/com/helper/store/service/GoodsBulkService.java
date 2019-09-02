package com.helper.store.service;

import com.helper.store.domain.JsonMessage;

/**
 * @author yanghao
 * @create 2019-07-15 13:57
 * @Description:
 */
public interface GoodsBulkService {

    JsonMessage selectSize(Integer shoeId);
}

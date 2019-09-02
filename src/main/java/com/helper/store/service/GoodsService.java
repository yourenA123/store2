package com.helper.store.service;

import com.helper.store.domain.JsonMessage;

/**
 * @author yanghao
 * @create 2019-07-15 13:57
 * @Description:
 */
public interface GoodsService {
    /**
     * 所有尺码
     * @param shoeId
     * @return
     */
    JsonMessage selectSize(Integer shoeId);

    /**
     * 根据shoeId查找鞋子内容
     * @param shoeId
     * @return
     */
    JsonMessage selectShoeByShoeId(Integer shoeId);

    /**
     * 查找交易记录
     * @param shoeId
     * @return
     */
    JsonMessage selectOrderByGoodsId(Integer shoeId);
}

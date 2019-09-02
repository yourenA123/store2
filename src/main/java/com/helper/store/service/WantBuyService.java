package com.helper.store.service;

import com.helper.store.domain.JsonMessage;
import com.helper.store.domain.WantBuy;

/**
 * @author yanghao
 * @create 2019-07-02 15:28
 * @Description:
 */
public interface WantBuyService {
    /**
     * 求购
     * @return
     */
    JsonMessage saveShoe(Integer id);


}

package com.helper.store.service.impl;

import com.helper.store.dao.WantBuyMapper;
import com.helper.store.domain.JsonMessage;
import com.helper.store.domain.WantBuy;
import com.helper.store.service.WantBuyService;
import com.helper.store.util.Constants;
import com.helper.store.util.ParamsUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yanghao
 * @create 2019-07-02 15:29
 * @Description:
 */
@Service
@Slf4j
public class WantBuyServiceImpl implements WantBuyService {

    @Autowired
    WantBuyMapper wantBuyMapper;

    @Override
    public JsonMessage saveShoe(Integer id) {
        JsonMessage result = new JsonMessage();
        Map<String,Object> map = new HashMap<>(16);
        try {
            wantBuyMapper.saveShoe(id);
            result.setResponseCode(Constants.RES_CODE_0);
            result.setErrorMessage(Constants.RES_MESSAGE_0);
            result.setData(map);
        }catch (Exception e) {
            log.info(e.toString());
            result.setResponseCode(Constants.RES_CODE_101);
            result.setErrorMessage(Constants.RES_MESSAGE_101);
        }
        return result;

    }

    @Override
    public List<Map<String, Object>> getUserWantBuy(Map<String, Object> param) {
        ParamsUtils.getUser("userId",param);
        return wantBuyMapper.getUserWantBuy(param);
    }

    @Override
    public Map<String, Object> getMinPrice(Map<String, Object> param) {
        ParamsUtils.getUser("userId",param);
        return wantBuyMapper.getMinPrice(param);
    }

    @Override
    public Map<String, Object> getMaxPrice(Map<String, Object> param) {
        ParamsUtils.getUser("userId",param);
        return wantBuyMapper.getMaxPrice(param);
    }

    @Override
    public void saveWantBuy(Map<String, Object> param) {
        ParamsUtils.getUser("userId",param);
       wantBuyMapper.saveWantBuy(param);
    }


}

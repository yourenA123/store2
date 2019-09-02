package com.helper.store.service.impl;

import com.helper.store.dao.DisCountMapper;
import com.helper.store.domain.JsonMessage;
import com.helper.store.service.DisCountsService;
import com.helper.store.util.Constants;
import com.helper.store.util.ParamsUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yanghao
 * @create 2019-08-05 12:15
 * @Description:
 */
@Service
public class DisCountsServiceImpl implements DisCountsService {

    @Autowired
    DisCountMapper disCountMapper;
    @Override
    public JsonMessage listDisCounts(Map<String,Object> param) {
        JsonMessage jsonMessage = new JsonMessage();
        Map<String,Object> map = new HashMap<>(16);
        try {
            ParamsUtils.getUser("userId",param);
            List<Map<String,Object>> list = disCountMapper.listDisCounts(param);
            map.put("discounts",list);
            jsonMessage.setResponseCode(Constants.RES_CODE_0);
            jsonMessage.setErrorMessage(Constants.RES_MESSAGE_0);
            jsonMessage.setData(map);
        }catch (Exception e){
            e.printStackTrace();
            jsonMessage.setResponseCode(Constants.RES_CODE_101);
            jsonMessage.setErrorMessage(Constants.RES_MESSAGE_101);
        }
        return jsonMessage;
    }

    @Override
    public JsonMessage updateDisCounts(Integer id) {
        JsonMessage jsonMessage = new JsonMessage();
        try {
            disCountMapper.updateDisCounts(id);
            jsonMessage.setResponseCode(Constants.RES_CODE_0);
            jsonMessage.setErrorMessage(Constants.RES_MESSAGE_0);
        }catch (Exception e){
            e.printStackTrace();
            jsonMessage.setResponseCode(Constants.RES_CODE_101);
            jsonMessage.setErrorMessage(Constants.RES_MESSAGE_101);
        }
        return jsonMessage;
    }
}

package com.helper.store.service.impl;

import com.helper.store.dao.GoodsMapper;
import com.helper.store.domain.JsonMessage;
import com.helper.store.service.GoodsService;
import com.helper.store.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yanghao
 * @create 2019-07-15 13:58
 * @Description:
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    GoodsMapper goodsMapper;

    @Override
    public JsonMessage selectSize(Integer shoeId) {
        JsonMessage result =new JsonMessage();
        Map<String,Object> map = new HashMap<>(16);
        try {
            List<Map<String,Object>> sizeList= goodsMapper.selectSize(shoeId);
            map.put("sizeList",sizeList);
            result.setResponseCode(Constants.RES_CODE_0);
            result.setErrorMessage(Constants.RES_MESSAGE_0);
            result.setData(map);
        }catch (Exception e){
            result.setResponseCode(Constants.RES_CODE_101);
            result.setErrorMessage(Constants.RES_MESSAGE_101);
        }
        return result;
    }

    @Override
    public JsonMessage selectShoeByShoeId(Integer shoeId) {
        JsonMessage result = new JsonMessage();
        Map<String,Object> map = new HashMap<>(16);
        try {
            Map<String, Object> shoes = goodsMapper.selectShoeByShoeId(shoeId);
            map.put("shoes",shoes);
            result.setResponseCode(Constants.RES_CODE_0);
            result.setErrorMessage(Constants.RES_MESSAGE_0);
            result.setData(map);
        }catch (Exception e) {
            e.printStackTrace();
            result.setResponseCode(Constants.RES_CODE_101);
            result.setErrorMessage(Constants.RES_MESSAGE_101);
        }
        return result;
    }

    @Override
    public JsonMessage selectOrderByGoodsId(Integer shoeId) {
        JsonMessage result = new JsonMessage();
        Map<String,Object> map = new HashMap<>(16);
        try {
            List<Map<String, Object>> orders = goodsMapper.selectOrderByGoodsId(shoeId);
            map.put("orders",orders);
            result.setResponseCode(Constants.RES_CODE_0);
            result.setErrorMessage(Constants.RES_MESSAGE_0);
            result.setData(map);
        }catch (Exception e) {
            result.setResponseCode(Constants.RES_CODE_101);
            result.setErrorMessage(Constants.RES_MESSAGE_101);
        }
        return result;
    }
}

package com.helper.store.service.impl;

import com.helper.store.dao.OrderMapper;
import com.helper.store.domain.JsonMessage;
import com.helper.store.service.OrderService;
import com.helper.store.util.Constants;
import com.helper.store.util.ParamsUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yanghao
 * @create 2019-08-08 15:32
 * @Description:
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper orderMapper;
    @Override
    public JsonMessage saveOrder(Map<String, Object> param) {
        JsonMessage jsonMessage = new JsonMessage();
        try {
            long orderNo = System.currentTimeMillis();
            param.put("orderNo",orderNo);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            param.put("createTime",sdf.format(new Date()));
            param.put("status",0);
            ParamsUtils.getUser("buyUserId",param);
            orderMapper.saveOrder(param);
            Map<String,Object> map = orderMapper.getOrderByNo(param);
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
    public JsonMessage cancelOrder(Map<String, Object> param) {

        JsonMessage result = new JsonMessage();
        try {
            orderMapper.cancelOrder(param);
            result.setResponseCode(Constants.RES_CODE_0);
            result.setErrorMessage(Constants.RES_MESSAGE_0);
        }catch (Exception e) {
            result.setResponseCode(Constants.RES_CODE_101);
            result.setErrorMessage(Constants.RES_MESSAGE_101);
        }
        return result;
    }

    @Override
    public JsonMessage payOrder(Map<String, Object> param) {
        JsonMessage result = new JsonMessage();
        try {
            orderMapper.payOrder(param);
            result.setResponseCode(Constants.RES_CODE_0);
            result.setErrorMessage(Constants.RES_MESSAGE_0);
        }catch (Exception e) {
            result.setResponseCode(Constants.RES_CODE_101);
            result.setErrorMessage(Constants.RES_MESSAGE_101);
        }
        return result;
    }

    @Override
    public void inputTrackingNumber(Map<String, Object> param) {
        ParamsUtils.getUser("userId",param);
        orderMapper.inputTrackingNumber(param);
    }

    @Override
    public Map<String, Object> getTrackingNumber(Map<String, Object> param) {
        return orderMapper.getTrackingNumber(param);
    }


    @Override
    public List<Map<String, Object>> getOrderByBuyorsellId(Map<String, Object> param) {
        ParamsUtils.getUser("userId",param);
        return orderMapper.getOrderByBuyorsellId(param);
    }


    @Override
    public JsonMessage deleteOrder(Map<String, Object> param) {
        JsonMessage result = new JsonMessage();
        try {
            orderMapper.deleteOrder(param);
            result.setResponseCode(Constants.RES_CODE_0);
            result.setErrorMessage(Constants.RES_MESSAGE_0);
        }catch (Exception e) {
            e.printStackTrace();
            result.setResponseCode(Constants.RES_CODE_101);
            result.setErrorMessage(Constants.RES_MESSAGE_101);
        }
        return result;
    }

    @Override
    public void orderFinish(Map<String, Object> param) {
        orderMapper.orderFinish(param);
    }

}

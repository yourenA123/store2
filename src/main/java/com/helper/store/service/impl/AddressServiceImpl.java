package com.helper.store.service.impl;

import com.helper.store.dao.AddressMapper;
import com.helper.store.domain.Address;
import com.helper.store.domain.JsonMessage;
import com.helper.store.service.AddressService;
import com.helper.store.util.Constants;
import com.helper.store.util.ParamsUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yanghao
 * @create 2019-08-05 12:14
 * @Description:
 */
@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressMapper addressMapper;
    @Override
    public JsonMessage listAddress(Map<String, Object> param) {
        JsonMessage jsonMessage = new JsonMessage();
        Map<String,Object> map = new HashMap<>(16);
        try {
            ParamsUtils.getUser("userId",param);
            List<Map<String,Object>> list = addressMapper.listAddress(param);
            map.put("listAddress",list);
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
    public JsonMessage insertAddress(Map<String, Object> param) {
        JsonMessage jsonMessage = new JsonMessage();
        try {
            ParamsUtils.getUser("userId",param);
            addressMapper.insertAddress(param);
            jsonMessage.setResponseCode(Constants.RES_CODE_0);
            jsonMessage.setErrorMessage(Constants.RES_MESSAGE_0);
        }catch (Exception e){
            e.printStackTrace();
            jsonMessage.setResponseCode(Constants.RES_CODE_101);
            jsonMessage.setErrorMessage(Constants.RES_MESSAGE_101);
        }
        return jsonMessage;
    }

    @Override
    public JsonMessage deleteAddress(Integer id) {
        JsonMessage jsonMessage = new JsonMessage();
        try {
            addressMapper.deleteAddress(id);
            jsonMessage.setResponseCode(Constants.RES_CODE_0);
            jsonMessage.setErrorMessage(Constants.RES_MESSAGE_0);
        }catch (Exception e){
            e.printStackTrace();
            jsonMessage.setResponseCode(Constants.RES_CODE_101);
            jsonMessage.setErrorMessage(Constants.RES_MESSAGE_101);
        }
        return jsonMessage;
    }

    @Override
    public JsonMessage updateAddress(Address address) {
        JsonMessage jsonMessage = new JsonMessage();
        try {
            addressMapper.updateAddress(address);
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

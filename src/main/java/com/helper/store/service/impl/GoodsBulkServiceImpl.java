package com.helper.store.service.impl;

import com.helper.store.dao.GoodsBulkMapper;
import com.helper.store.domain.JsonMessage;
import com.helper.store.service.GoodsBulkService;
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
public class GoodsBulkServiceImpl implements GoodsBulkService {

    @Autowired
    GoodsBulkMapper goodsBulkMapper;

    @Override
    public JsonMessage selectSize(Integer shoeId) {
        JsonMessage result =new JsonMessage();
        Map<String,Object> map = new HashMap<>(16);
        try {
            List<Map<String,Object>> sizeList= goodsBulkMapper.selectSize(shoeId);
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

}

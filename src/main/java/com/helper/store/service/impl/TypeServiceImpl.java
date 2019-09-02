package com.helper.store.service.impl;

import com.helper.store.dao.TypeMapper;
import com.helper.store.domain.JsonMessage;
import com.helper.store.domain.Type;
import com.helper.store.service.TypeService;
import com.helper.store.util.Constants;
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
public class TypeServiceImpl implements TypeService {

    @Autowired
    TypeMapper typeMapper;

    @Override
    public JsonMessage selectType() {
        JsonMessage result = new JsonMessage();
        Map<String,Object> map = new HashMap<>(16);
        try {
            List<Type> list = typeMapper.selectType();
            map.put("list",list);
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
}

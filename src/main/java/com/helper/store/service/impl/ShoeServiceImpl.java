package com.helper.store.service.impl;

import com.helper.store.dao.ShoeMapper;
import com.helper.store.domain.JsonMessage;
import com.helper.store.service.ShoeService;
import com.helper.store.util.Constants;
import com.helper.store.util.ParamsUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author yanghao
 * @create 2019-07-02 15:29
 * @Description:
 */
@Service
@Slf4j
public class ShoeServiceImpl implements ShoeService {
    @Autowired
    ShoeMapper shoeMapper;
    @Override
    public JsonMessage selectShoe() {
        JsonMessage result = new JsonMessage();
        Map<String,Object> map = new HashMap<>(16);
        try {
            List<Map<String,Object>> list = shoeMapper.selectShoe();
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

    @Override
    public List<Map<String, Object>> selectShoeByKeyword(Map<String, Object> param) {
        return shoeMapper.selectShoeByKeyword(param);
    }


    @Override
    public JsonMessage selectShoeByNum() {
        JsonMessage result = new JsonMessage();
        Map<String,Object> map = new HashMap<>(16);
        try {
            List<Map<String,Object>> list = shoeMapper.selectShoeByNum();
            map.put("list",list);
            result.setResponseCode(Constants.RES_CODE_0);
            result.setErrorMessage(Constants.RES_MESSAGE_0);
            result.setData(map);
        }catch (Exception e) {
            result.setResponseCode(Constants.RES_CODE_101);
            result.setErrorMessage(Constants.RES_MESSAGE_101);
        }
        return result;
    }

    @Override
    public JsonMessage selectShoeByTime() {
        JsonMessage result = new JsonMessage();
        Map<String,Object> map = new HashMap<>(16);
        try {
            List<Map<String,Object>> list = shoeMapper.selectShoeByTime();
            map.put("list",list);
            result.setResponseCode(Constants.RES_CODE_0);
            result.setErrorMessage(Constants.RES_MESSAGE_0);
            result.setData(map);
        }catch (Exception e) {
            result.setResponseCode(Constants.RES_CODE_101);
            result.setErrorMessage(Constants.RES_MESSAGE_101);
        }
        return result;
    }


    @Override
    public JsonMessage selectShoeByPriceDesc() {
        JsonMessage result = new JsonMessage();
        Map<String,Object> map = new HashMap<>(16);
        try {
            List<Map<String,Object>> list = shoeMapper.selectShoeByPriceDesc();
            map.put("list",list);
            result.setResponseCode(Constants.RES_CODE_0);
            result.setErrorMessage(Constants.RES_MESSAGE_0);
            result.setData(map);
        }catch (Exception e) {
            result.setResponseCode(Constants.RES_CODE_101);
            result.setErrorMessage(Constants.RES_MESSAGE_101);
        }
        return result;
    }

    @Override
    public JsonMessage selectShoeByPriceAsc() {
        JsonMessage result = new JsonMessage();
        Map<String,Object> map = new HashMap<>(16);
        try {
            List<Map<String,Object>> list = shoeMapper.selectShoeByPriceAsc();
            map.put("list",list);
            result.setResponseCode(Constants.RES_CODE_0);
            result.setErrorMessage(Constants.RES_MESSAGE_0);
            result.setData(map);
        }catch (Exception e) {
            result.setResponseCode(Constants.RES_CODE_101);
            result.setErrorMessage(Constants.RES_MESSAGE_101);
        }
        return result;
    }

    @Override
    public JsonMessage selectBrand() {
        JsonMessage result = new JsonMessage();
        Map<String,Object> map = new HashMap<>(16);
        try {
            List<Map<String, Object>> list = shoeMapper.selectBrand();
            map.put("list",list);
            result.setResponseCode(Constants.RES_CODE_0);
            result.setErrorMessage(Constants.RES_MESSAGE_0);
            result.setData(map);
        }catch (Exception e) {
            result.setResponseCode(Constants.RES_CODE_101);
            result.setErrorMessage(Constants.RES_MESSAGE_101);
        }
        return result;
    }

    @Override
    public JsonMessage selectByTypeAndPriceRangeAndBrandAndSize(Integer type, String priceRange, String brand, Double size) {
        JsonMessage result = new JsonMessage();
        Map<String,Object> map = new HashMap<>(16);

        try {
            Double minPrice = null;
            Double maxPrice = null;
            if(priceRange != null){
                String[] price = priceRange.split("-");
                List list = Arrays.asList(price);
                minPrice = Double.valueOf((price[0]));
                //Double minPrice = (Double) list.get(0);
                maxPrice = Double.valueOf(price[1]);
                //Double maxPrice = (Double) list.get(1);
            }
            List<Map<String, Object>> shoeList = shoeMapper.selectByTypeAndPriceRangeAndBrandAndSize(type,minPrice,maxPrice,brand,size);
            map.put("shoeList",shoeList);
            result.setResponseCode(Constants.RES_CODE_0);
            result.setErrorMessage(Constants.RES_MESSAGE_0);
            result.setData(map);
        }catch (Exception e) {
            result.setResponseCode(Constants.RES_CODE_101);
            result.setErrorMessage(Constants.RES_MESSAGE_101);
        }
        return result;
    }

    @Override
    public JsonMessage recommended(Integer type) {
        JsonMessage result = new JsonMessage();
        Map<String,Object> map = new HashMap<>(16);
        try {
            List<Map<String, Object>> shoeList = shoeMapper.recommended(type);
            map.put("shoeList",shoeList);
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

package com.helper.store.web;

import com.helper.store.domain.JsonMessage;
import com.helper.store.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanghao
 * @create 2019-07-15 14:06
 * @Description:
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    GoodsService goodsService;

    /**
     * 所有尺码
     * @param shoeId
     * @return
     */
    @GetMapping("/selectSize")
    public JsonMessage selectSize(Integer shoeId){
        return goodsService.selectSize(shoeId);
    }

    /**
     * 查找鞋子信息
     * @param shoeId
     * @return
     */
    @GetMapping("/selectShoeByShoeId")
    public JsonMessage selectShoeByShoeId(Integer shoeId){
        return goodsService.selectShoeByShoeId(shoeId);
    }

    /**
     * 查找交易记录
     * @param shoeId
     * @return
     */
    @GetMapping("/selectOrderByGoodsId")
    public JsonMessage selectOrderByGoodsId(Integer shoeId){
        return goodsService.selectOrderByGoodsId(shoeId);
    }
}

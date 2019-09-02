package com.helper.store.web;

import com.helper.store.domain.JsonMessage;
import com.helper.store.service.ShoeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanghao
 * @create 2019-07-02 15:51
 * @Description:
 */
@RestController
@RequestMapping(value = "/shoe")
public class ShoeController {
    @Autowired
    ShoeService shoeService;

    /**
     * 查询所有鞋子
     * @return
     */
    @GetMapping("/selectShoe")
    public JsonMessage selectShoe(){
        return shoeService.selectShoe();
    }

    /**
     * 销量排序
     * @return
     */
    @GetMapping("/selectShoeByNum")
    public JsonMessage selectShoeByNum(){
        return shoeService.selectShoeByNum();
    }

    /**
     * 时间排序
     * @return
     */
    @GetMapping("/selectShoeByTime")
    public JsonMessage selectShoeByTime(){
        return shoeService.selectShoeByTime();
    }

    /**
     * 价格排序 高到低
     * @return
     */
    @GetMapping("/selectShoeByPriceDesc")
    public JsonMessage selectShoeByPriceDesc(){
        return shoeService.selectShoeByPriceDesc();
    }

    /**
     * 价格排序 低到高
     * @return
     */
    @GetMapping("/selectShoeByPriceAsc")
    public JsonMessage selectShoeByPriceAsc(){
        return shoeService.selectShoeByPriceAsc();
    }

    /**
     * 遍历品牌
     * @return
     */
    @GetMapping("/selectBrand")
    public JsonMessage selectBrand(){
        return shoeService.selectBrand();
    }

    /**
     * 商品筛选
     * @param type
     * @param priceRange
     * @param brand
     * @param size
     * @return
     */
    @PostMapping("/selectByTypeAndPriceRangeAndBrandAndSize")
    public JsonMessage selectByTypeAndPriceRangeAndBrandAndSize(Integer type,String priceRange,String brand,Double size){
        return shoeService.selectByTypeAndPriceRangeAndBrandAndSize(type,priceRange,brand,size);
    }

    /**
     * 相关推荐
     * @param type
     * @return
     */
    @GetMapping("/recommended")
    public JsonMessage recommended(Integer type){
        return shoeService.recommended(type);
    }

}

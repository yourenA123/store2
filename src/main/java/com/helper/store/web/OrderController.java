package com.helper.store.web;

import com.helper.store.domain.JsonMessage;
import com.helper.store.service.OrderService;
import com.helper.store.util.ParamsUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author yanghao
 * @create 2019-08-08 16:22
 * @Description:
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;
    /**
     * 生成订单
     * @param request
     * @return
     */
    @PostMapping("/saveOrder")
    public JsonMessage saveOrder(HttpServletRequest request){
        Map<String,Object> param = ParamsUtils.getParmas(request);
        return orderService.saveOrder(param);
    }

    /**
     * 取消订单
     * @param request
     * @return
     */
    @PostMapping("/cancelOrder")
    public JsonMessage cancelOrder(HttpServletRequest request){
        Map<String,Object> param = ParamsUtils.getParmas(request);
        return orderService.cancelOrder(param);
    }

    /**
     * 立即付款
     * @param request
     * @return
     */
    @PostMapping("/payOrder")
    public JsonMessage payOrder(HttpServletRequest request){
        Map<String,Object> param = ParamsUtils.getParmas(request);
        return orderService.payOrder(param);
    }

    /**
     * 删除订单
     * @param request
     * @return
     */
    @PostMapping("/deleteOrder")
    public JsonMessage deleteOrder(HttpServletRequest request){
        Map<String,Object> param = ParamsUtils.getParmas(request);
        return orderService.deleteOrder(param);
    }
}

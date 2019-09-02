package com.helper.store.web;

import com.helper.store.domain.JsonMessage;
import com.helper.store.domain.WantBuy;
import com.helper.store.service.WantBuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author yanghao
 * @create 2019-07-02 15:51
 * @Description:
 */
@RestController
@RequestMapping(value = "/wantBuy")
public class WantBuyController {
    @Autowired
    WantBuyService wantBuyService;
    /**
     * 出售
     * @return
     */
    @PostMapping("/saveShoe")
    public JsonMessage saveShoe(Integer id){
        return wantBuyService.saveShoe(id);
    }
}

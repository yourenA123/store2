package com.helper.store.web;

import com.helper.store.domain.JsonMessage;
import com.helper.store.domain.WantBuy;
import com.helper.store.service.WantBuyService;
import com.helper.store.util.Constants;
import com.helper.store.util.ParamsUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

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

    /**
     * 获取想要鞋子信息
     * @param request
     * @return
     */
    @GetMapping(value = "/getUserWantBuy")
    public JsonMessage getUserWantBuy(HttpServletRequest request){
        JsonMessage result = new JsonMessage();
        Map<String, Object> data = new HashMap<String, Object>(16);
        Map<String, Object> param = ParamsUtils.getParmas(request);
        try {
            Map<String,Object> userWantInfo = wantBuyService.getUserWantBuy(param);
            data.put("userWantInfo", userWantInfo);
            result.setResponseCode(Constants.RES_CODE_0);
            result.setErrorMessage(Constants.RES_MESSAGE_0);
            result.setData(data);
        }catch (Exception e){
            result.setResponseCode(Constants.RES_CODE_101);
            result.setErrorMessage(Constants.RES_MESSAGE_101);
        }
        return result;
    }
}


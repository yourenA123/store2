package com.helper.store.web;


import com.helper.store.dao.BalanceMapper;
import com.helper.store.domain.JsonMessage;
import com.helper.store.service.BalanceService;
import com.helper.store.util.Constants;
import com.helper.store.util.ParamsUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("/withdrawalrecord")
public class BalanceController {
    @Autowired
    BalanceService balanceService;

    @PostMapping("/saveBalance")
    public JsonMessage saveBalance(HttpServletRequest request) {
        Map<String,Object> param = ParamsUtils.getParmas(request);
        return balanceService.saveBalance(param);
    }
}

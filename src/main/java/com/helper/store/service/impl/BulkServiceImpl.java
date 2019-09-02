package com.helper.store.service.impl;

import com.helper.store.dao.AuthDao;
import com.helper.store.dao.BulkDao;
import com.helper.store.domain.User;
import com.helper.store.service.AuthService;
import com.helper.store.service.BulkService;
import com.helper.store.util.ParamsUtils;
import com.helper.store.util.SmsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author sheamus
 * @date 2019.7.3
 */
@Service
public class BulkServiceImpl implements BulkService {
    @Autowired
    private BulkDao bulkDao;

    @Override
    public List<Map<String, Object>> listShoe() {
        return bulkDao.listShoe();
    }

    @Override
    public List<Map<String, Object>> listStore(Map<String,Object> param) {
        return bulkDao.listStore(param);
    }

    @Override
    public Map<String, Object> getStoreInfoById(Map<String,Object> param) {
        return bulkDao.getStoreInfoById(param);
    }

    @Override
    public List<Map<String, Object>> listgoodsBulk(Map<String, Object> param) {
        return bulkDao.listgoodsBulk(param);
    }

    @Override
    public Map<String, Object> saveOrder(Map<String,Object> param) {
        String orderNo = "SOZ" +  SmsUtil.vCode();
        param.put("order_no",orderNo);
        ParamsUtils.getUser("buy_user_id",param);
        bulkDao.saveOrder(param);
        return bulkDao.getOrderBulkByNo(param);
    }

    @Override
    public void updateOrder(Map<String, Object> param) {
        bulkDao.updateOrder(param);
    }
}

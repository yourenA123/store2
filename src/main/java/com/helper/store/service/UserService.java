package com.helper.store.service;

import com.helper.store.domain.User;

import java.util.List;
import java.util.Map;

/**
 * @author sheamus
 * @date 2019.7.3
 */
public interface UserService {
    /**
     * 获取商铺详情
     * @param param
     * @return
     */
    Map<String,Object> getUserInfoById(Map<String,Object> param);

    /**
     * 修改商铺昵称
     * @param param
     * @return
     */
    void updateStoreName(Map<String,Object> param);

    /**
     * 修改常住地
     * @param param
     * @return
     */
    void updateAddress(Map<String,Object> param);

    /**
     * 修改图片
     * @param param
     * @return
     */
    void updateImg(Map<String,Object> param);


}

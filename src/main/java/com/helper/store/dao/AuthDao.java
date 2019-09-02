package com.helper.store.dao;

import com.helper.store.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author sheamus
 * @date 2019.7.3
 */
@Mapper
@Repository
public interface AuthDao {
    /**
     * 验证手机号是否存在
     * @param phone
     */
    int countPhone(String phone);

    /**
     * 保存用户
     * @param param
     */
    void saveUser(Map<String,Object> param);

    /**
     * 根据用户名获取密码
     * @param param
     * @return
     */
    List<User> getUserByUserName(Map<String, Object> param);
}

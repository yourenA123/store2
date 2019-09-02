package com.helper.store.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author sheamus
 * @date 2019.7.3
 */
@Setter
@Getter
@ToString
public class User implements Serializable {
    private Integer id;
    private String phone;
    private String password;
    private String name;
    private String nickName;
    private String storeName;
    private String storeAddress;
    private String address;
    private Integer isAuth;
    private Integer isMerchant;
    private Integer addressId;
    private String invitationCode;
    private Integer isInvitation;
}

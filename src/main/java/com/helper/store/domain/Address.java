package com.helper.store.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author yanghao
 * @create 2019-08-05 11:54
 * @Description:
 */
@Getter
@Setter
@ToString
public class Address implements Serializable {
    private Integer id;

    private String address;

    private String phone;

    private String userName;

    private Integer userId;
}

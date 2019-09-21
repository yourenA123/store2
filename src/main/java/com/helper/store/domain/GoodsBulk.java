package com.helper.store.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yanghao
 * @create 2019-07-15 16:06
 * @Description:
 */
@Data
public class GoodsBulk implements Serializable {

    private Integer gsbId;

    private Integer shoeId;

    private Double size;

    private Integer isSell;

    private Double price;

    private Integer createUser;
}

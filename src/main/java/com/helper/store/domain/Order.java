package com.helper.store.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yanghao
 * @create 2019-08-08 15:07
 * @Description:
 */
@Data
public class Order implements Serializable {
    private Integer id;
    private Integer gsId;
    private String orderNo;
    private String createTime;
    private Integer status;
    private Integer addressId;
    private Integer buyUserId;
    private Integer sellUserId;
    private Double price;
}

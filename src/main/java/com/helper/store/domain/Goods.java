package com.helper.store.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Goods implements Serializable {
    private Integer id;

    private Integer goodsId;

    private Double size;

    private Integer isSell;

    private Double salePrice;

    private String saleCreated;

    private Double price;

    private Integer createUser;

}
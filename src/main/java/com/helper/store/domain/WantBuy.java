package com.helper.store.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class WantBuy implements Serializable {
    private Integer id;

    private Integer goodsId;

    private Double size;

    private Double price;

    private Integer isSell;

    private Integer createUser;

}
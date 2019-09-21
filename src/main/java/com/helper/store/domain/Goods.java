package com.helper.store.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Goods implements Serializable {
    private Integer gsId;

    private Integer shoeId;

    private Double size;

    private Integer isSell;

    private Double salePrice;

    private String saleCreated;

    private Double price;

    private Integer createUser;

}
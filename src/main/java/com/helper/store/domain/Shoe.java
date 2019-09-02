package com.helper.store.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yanghao
 */
@Data
public class Shoe implements Serializable {
    private Integer id;

    private String name;

    private String createTime;

    private Integer type;

    private String brand;

    private Integer sellNum;

    private String number;

}
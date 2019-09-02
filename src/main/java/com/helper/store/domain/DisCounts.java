package com.helper.store.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yanghao
 * @create 2019-08-05 11:55
 * @Description:
 */
@Data
public class DisCounts implements Serializable {
    private Integer id;

    private Integer price;

    private Integer indate;

    private String createTime;

    private Integer limit;

    private Integer userId;
}

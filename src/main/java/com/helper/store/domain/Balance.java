package com.helper.store.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Balance {
    private Integer record_id;
    private Integer user_id;
    private String creat_time;
    private String sum;
}

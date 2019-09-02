package com.helper.store.dao;

import com.helper.store.domain.WantBuy;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface WantBuyMapper {

    void saveShoe(Integer id);
}
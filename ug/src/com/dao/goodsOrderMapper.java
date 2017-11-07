package com.dao;

import com.entity.goodsOrder;

public interface goodsOrderMapper {
    int deleteByPrimaryKey(Integer orderid);

    int insert(goodsOrder record);

    int insertSelective(goodsOrder record);

    goodsOrder selectByPrimaryKey(Integer orderid);

    int updateByPrimaryKeySelective(goodsOrder record);

    int updateByPrimaryKey(goodsOrder record);
}
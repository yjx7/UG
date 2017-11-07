package com.dao;

import com.entity.goods;
import com.entity.goodsWithBLOBs;

public interface goodsMapper {
    int deleteByPrimaryKey(Integer goodsid);

    int insert(goodsWithBLOBs record);

    int insertSelective(goodsWithBLOBs record);

    goodsWithBLOBs selectByPrimaryKey(Integer goodsid);

    int updateByPrimaryKeySelective(goodsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(goodsWithBLOBs record);

    int updateByPrimaryKey(goods record);
}
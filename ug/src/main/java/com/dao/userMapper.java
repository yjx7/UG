package com.dao;

import com.entity.user;

public interface userMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(user record);

    int insertSelective(user record);

    user selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(user record);

    int updateByPrimaryKeyWithBLOBs(user record);

    int updateByPrimaryKey(user record);

	user selectByPhone(String phone);
}
package com.service.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.userMapper;
import com.entity.user;
import com.service.UserService;
@Service("userService")
public class userServiceImpl implements UserService {
		    @Resource  
		    private userMapper userMapper;  
		    @Override
		    public user getUserById(int userId) {  
		        return this.userMapper.selectByPrimaryKey(userId);
		    }

}

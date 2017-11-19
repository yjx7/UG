package com.service.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.userMapper;
import com.dto.MD5;
import com.dto.Result;
import com.entity.user;
import com.service.UserService;
@Service("userService")
public class userServiceImpl implements UserService {
		    @Resource  
		    private userMapper userMapper;  
		    private MD5 md5;
		    @Override
		    public user getUserById(int userId) {  
		        return this.userMapper.selectByPrimaryKey(userId);
		    }
		    @Override
			public void addUser(user user) {		    		
				this.userMapper.insert(user); 			
				}
			@Override
			public Result<user> regist(user user) {
		    	if (getUserByphone(user.getPhonenumber())==null){
		    		user.setPasswordsalt(String.valueOf(System.currentTimeMillis()));
		    		md5=new MD5(user.getPassword(),user.getPasswordsalt());
		    		user.setPassword(md5.getMd5());
		    		addUser(user);
		    		return new Result(true,user);
		    		
		    	}
				return new Result(false,"该手机号已经被注册");
			}
			@Override
			public user getUserByphone(String phone) {
				return this.userMapper.selectByPhone(phone);
			}
			@Override
			public Result<user> login(user user) {
				user s_user=getUserByphone(user.getPhonenumber());
		    	if (s_user!=null){
		    		md5=new MD5(user.getPassword(),s_user.getPasswordsalt());//获取登录，经过md5加密后的密码
		    		if(s_user.getPassword().equals(md5.getMd5()))//数据库的密码与登录的密码对比
		    		{
			    		return new Result(true,s_user);
		    		}
		    		return new Result(false,"密码错误");
		    		}
				
				return new Result(false,"用户不存在");
			}

}

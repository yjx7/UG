package com.service;

import com.dto.Result;
import com.entity.user;

public interface UserService {
  
	    public user getUserById(int userId);
	    
	    public user getUserByphone(String phone);

		public void addUser(user user);
		
		public Result regist(user user);

		public Result<user> login(user user);
}

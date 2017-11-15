package com.service;

import com.entity.user;

public interface UserService {
  
	    public user getUserById(int userId);

		public void addUser(user user);
}

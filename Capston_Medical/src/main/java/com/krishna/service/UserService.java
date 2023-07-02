package com.krishna.service;

import java.util.List;

import com.krishna.dao.UserDao;
import com.krishna.model.User;

public class UserService {
	
	private UserDao udao;
	
	
	public UserService() {
		udao=new UserDao();
	}
	
	public Integer addUser(User user) {
		return udao.addUser(user);
	}
	
	public List<User> getUser(int uid) {
		return udao.getUser(uid);
	}

}

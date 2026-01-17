package com.app.service;

import java.util.List;

import com.app.model.User;

public interface UserServiceInt 
{
	public List<User> addUser(User user);
	
	public List<User> checkLogin(String username,String password);
	
	public List<User> removeUser(int id);
	
	public User editUser(int id);
	
	public List<User> updateUser(User user);
	
	

}

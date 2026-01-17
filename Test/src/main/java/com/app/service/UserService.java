package com.app.service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.app.model.User;
import com.app.repository.UserRepository;

@Service
public class UserService implements UserServiceInt
{
	@Autowired
	UserRepository ur;
	@Override
	public List<User> addUser(User user)
	{
		 ur.save(user);
		List<User> list= ur.findAll();
		return list;
	}
	@Override
	public List<User> checkLogin(String username, String password) 
	{
		if(username.equals("admin")&& password.equals("admin"))
		{
			List<User> list= ur.findAll();
			return list;
		}
		
		else 
		{
			List<User> list= ur.findByUsernameAndPassword(username, password);
			
			return list;
			
		}
		
		
	}
	@Override
	public List<User> removeUser(int id)
	{
		ur.deleteById(id);
		List<User> list= ur.findAll();
		return list;
	}
	@Override
	public User editUser(int id) 
	{
		Optional<User> op= ur.findById(id);
		
		if(op.isPresent())
		{
			User us= op.get();
			return us;
		}
		return null;
	}
	@Override
	public List<User> updateUser(User user)
	{
		 ur.save(user);
		 
		 List<User> list= ur.findAll();
		return list;
	}
	

}

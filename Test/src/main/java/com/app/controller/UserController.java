package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.User;
import com.app.service.UserServiceInt;



@Controller
public class UserController
{
	
	@Autowired
	UserServiceInt si;
	
	
	@RequestMapping("/")
	public String preLogin()
	{
		return "login";
	}
	
	@RequestMapping("/reg")
	public String preRegister()
	{
		return "register";
	}
	
	@RequestMapping("/save")
	public String register(@ModelAttribute User user,Model m)
	{
		List<User> list= si.addUser(user);
		
		m.addAttribute("data", list);
		
		
		return "success";
	}
	
	
	@RequestMapping("login")
	public String login(@RequestParam("username")String username,@RequestParam("password")String password,Model m)
	{
		List<User> list= si.checkLogin(username, password);
		
		if(list!=null)
		{
			m.addAttribute("data", list);
		}
		
		
		return "success";
	}
	
	@RequestMapping("/delete")
	public String deleteUser(@RequestParam("id")int id,Model m)
	{
		List<User> list= si.removeUser(id);
		m.addAttribute("data", list);
		return "success";
	}
	
	@RequestMapping("/edit")
	public String editUser(@RequestParam("id")int id,Model m)
	{
		User user= si.editUser(id);
		m.addAttribute("us", user);
		return "edit";
	}
	
	@RequestMapping("/update")
	public String updateUser(@ModelAttribute User user,Model m)
	{
		
		List<User> list= si.updateUser(user);
		
		m.addAttribute("data", list);
		
		return "success";
		
	}
	

	
	
	
	

}

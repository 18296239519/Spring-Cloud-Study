package com.jt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jt.pojo.User;
import com.jt.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	public UserService userService;
	
	@RequestMapping("findAll")
	public List<User> findObject(){
		return userService.selectObjects();
	}
}

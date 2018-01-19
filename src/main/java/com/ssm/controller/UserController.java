package com.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.service.UserService;

@RequestMapping("/user")
@Controller
public class UserController {
	
	@Autowired
	UserService  userService;
	
	@RequestMapping("hello")
	public String getUser(){
		userService.findByUserId("944560");
		return "hello";
	}

}

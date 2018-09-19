package com.ssm.controller;

import com.ssm.domain.User;
import com.ssm.domain.VZyUserInfo;
import com.ssm.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("user")
@Controller
public class UserController extends BaseController{
    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/info")
    public  Object info(){
        VZyUserInfo user = userService.findByUserId(47);
        return  user;
    }
   
}

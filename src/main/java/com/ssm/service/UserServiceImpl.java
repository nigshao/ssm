package com.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.base.UserMapper;
import com.ssm.domain.User;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;

	public User findByUserId(String userId) {
		// TODO Auto-generated method stub
		User user = userMapper.findByUserId(userId);
		return user;
	}

}

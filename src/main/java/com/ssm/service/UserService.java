package com.ssm.service;

import com.ssm.domain.User;

public interface UserService {
	public User findByUserId(String userId);
}

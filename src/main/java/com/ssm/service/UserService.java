package com.ssm.service;

import com.ssm.domain.User;
import com.ssm.domain.VZyUserInfo;

public interface UserService {
	public VZyUserInfo findByUserId(long userId);
}

package com.ssm.service;

import java.util.Date;

import com.ssm.base.UserMapper;
import com.ssm.dataSource.DataSourceType;
import com.ssm.dataSource.DataSources;
import com.ssm.dataSource.DataSourse;
import com.ssm.domain.VZyUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssm.base.IpRecordMapper;
import com.ssm.domain.IpRecord;
import com.ssm.domain.User;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private IpRecordMapper ipMapper;

	@DataSourse(value = DataSources.DATA_SOURCES_VZY2014)
	//@DataSourse(value = DataSourceType.DATA_SOURCES_VZY2014)
    @Transactional
	public VZyUserInfo findByUserId(long  userId) {
		return userMapper.getUserById(userId);
	}
    
}

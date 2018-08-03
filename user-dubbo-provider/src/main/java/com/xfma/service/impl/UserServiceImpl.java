package com.xfma.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.xfma.mapper.UserMapper;
import com.xfma.pojo.User;
import com.xfma.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private UserMapper mapper;

	public User checkLogin(String name) {
		return mapper.getUserByName(name);
	}
}

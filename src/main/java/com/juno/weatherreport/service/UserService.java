package com.juno.weatherreport.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juno.weatherreport.mapper.UserMapper;
import com.juno.weatherreport.model.User;

@Service
public class UserService implements UserServiceInter {
	@Autowired
	UserMapper userMapper;

	public User Sel(int id) {
		return userMapper.Sel(id);
	}

}

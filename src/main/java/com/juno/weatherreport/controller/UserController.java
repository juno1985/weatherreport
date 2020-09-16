package com.juno.weatherreport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juno.weatherreport.service.UserService;
import com.juno.weatherreport.service.UserServiceInter;

@RestController
@RequestMapping("/testBoot")
public class UserController {

	@Autowired
	private UserServiceInter userService;

	@RequestMapping("getUser/{id}")
	public String GetUser(@PathVariable int id) {
		return userService.Sel(id).toString();
	}
}
package com.xfma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xfma.pojo.User;
import com.xfma.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Reference
	private IUserService service;
	
	@RequestMapping("/login")
	public ModelAndView login(User user) {
		User u = service.checkLogin(user.getName());
		if (u == null) {
			return new ModelAndView("error");
		}
		
		if (user.getPwd().equals(u.getPwd())) {
			return new ModelAndView("success");
		}
		
		return new ModelAndView("error");
	}
	
}

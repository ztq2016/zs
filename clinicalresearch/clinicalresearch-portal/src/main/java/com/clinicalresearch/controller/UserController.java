package com.clinicalresearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping("/register")
	public ModelAndView register() {
		return new ModelAndView("register");
	}
	
	@RequestMapping("addUser")
	public ModelAndView addUser(@RequestParam("userName") String userName,
			@RequestParam("password") String password,
			@RequestParam("captcha") Integer captcha) {
		
		return new ModelAndView("login");
	}
}

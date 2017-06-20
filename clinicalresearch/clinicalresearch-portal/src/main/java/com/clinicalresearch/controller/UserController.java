package com.clinicalresearch.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.clinicalresearch.core.service.UsersService;
import com.octo.captcha.module.servlet.image.SimpleImageCaptchaServlet;

@Controller
public class UserController {
	
	@Autowired
	private UsersService usersService; 
	
	@RequestMapping("/register")
	public ModelAndView register() {
		//test
		return new ModelAndView("register");
	}
	
	@RequestMapping("/addUser")
	public ModelAndView addUser(HttpServletRequest request,HttpServletResponse response,
			@RequestParam("userName") String userName,
			@RequestParam("password") String password,
			@RequestParam("captcha") String captcha,
			@RequestParam("realName") String realName
			) {
		  String captchaId = request.getSession().getId();   
		  boolean validateResponse = SimpleImageCaptchaServlet.validateResponse(request, captcha);
		if (!validateResponse) {
			ModelAndView modelAndView = new ModelAndView("register");
			modelAndView.addObject("errorMsg", "验证码错误.");
			return modelAndView;
		}
		
		if (usersService.userExist(userName)) {
			ModelAndView modelAndView = new ModelAndView("register");
			modelAndView.addObject("errorMsg", "用户已经存在.");
			return modelAndView;
		}
		
		usersService.addUser(userName, password, realName);
		return new ModelAndView("login");
	}
}

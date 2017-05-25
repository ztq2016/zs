package com.clinicalresearch.interceptor;

import java.net.URLEncoder;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.clinicalresearch.core.service.UsersService;
import com.clinicalresearch.dao.entity.Powers;
import com.clinicalresearch.dao.entity.Roles;
import com.clinicalresearch.po.Users;

public class LoginInterceptor extends HandlerInterceptorAdapter {

	@Autowired
	private UsersService usersService;
	private final Logger logger = Logger.getLogger(this.getClass());

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		logger.debug("here is loginInterceptor ...");
		HttpSession session = request.getSession();
		// 获取当前请求路径
		String currentUrl = request.getRequestURL().toString();
		System.out.println("当前请求路径：" + currentUrl);
		// 如果是登录页面的话放行通过
		if (currentUrl.contains("/login") || currentUrl.contains("/entryHome")|| currentUrl.contains("/logout")) {
			return true;
		} else {
			Object attribute = session.getAttribute("user");
			if (attribute != null) {
				System.out.println(request.getServletPath());
				// 根据用户编号查询功能的权限
				List<String> usersReversedPowers = usersService.getUsersReversedPowersByUserId(session.getAttribute("userId").toString());
				//如果没有该权限
				String path=request.getServletPath();
				if(!usersReversedPowers.contains(path)){
					if(!path.equals("/"))
					request.setAttribute("powerTips", "您没有该功能访问权限！");
					request.getRequestDispatcher("/index").forward(request, response);
					return false;
				}else{
					return true;
				}
			}else{
				//session不存在则跳转到登录页面
				request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
			}
			return false;

		}
	}

}

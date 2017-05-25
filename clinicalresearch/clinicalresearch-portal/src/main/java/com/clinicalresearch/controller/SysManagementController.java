package com.clinicalresearch.controller;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.clinicalresearch.core.service.UsersService;
import com.clinicalresearch.dao.entity.Roles;
import com.clinicalresearch.shiro.FilterChainDefinitions;

@Controller
public class SysManagementController {
	@Autowired
	private FilterChainDefinitions filterChainDefinitions;
	@Autowired
	private UsersService usersService;


	
	public  String getRandom() {
		Random ran = new Random();
		StringBuilder bul = new StringBuilder();
		String str = new SimpleDateFormat("ddHHmmss").format(new Date()) + ran.nextInt(9999 - 1000 + 1) + 1000;
		String substring = str.substring(6, 10);
		String string = bul.append(substring).reverse().toString();
		return string + str;
	}


	/**
	 * 系统管理--角色管理--添加角色
	 * 
	 * @param role
	 * @return
	 */
	@RequestMapping("/addRole")
	@ResponseBody
	public String addRole(Roles role) {
		String result = null;
		int status = usersService.addRole(role);
		if (status == 200) {
			result = "角色添加成功！";
		}
		return result;
	}

	/**
	 * 系统管理--角色管理--给用户添加角色
	 * 
	 * @param role
	 * @return
	 */
	@RequestMapping("/addRolesPermission")
	@ResponseBody
	public String addRolesPermission(String userId, String roleId) {
		String result = null;
		if (StringUtils.isBlank(userId)) {
			result = "用户编号不能为空！";
		} else if (StringUtils.isBlank(roleId)) {
			result = "角色编号不能为空！";
		} else {
			int status = usersService.addRolesPermission(userId, roleId);
			if (status == 200) {
				result = "角色添加成功！";
			} else {
				result = "角色添加失败！";
			}
		}
		return result;
	}

	/**
	 * 系统管理--角色管理--给角色添加权限
	 * 
	 * @param role
	 * @return
	 */
	@RequestMapping("/addPowerPermission")
	@ResponseBody
	public String addPowerPermission(String roleId, String powerId) {
		String result = null;
		if (StringUtils.isBlank(roleId)) {
			result = "角色编号不能为空！";
		} else if (StringUtils.isBlank(powerId)) {
			result = "权限编号不能为空！";
		} else {
			int status = usersService.addPowerPermission(roleId, powerId);
			if (status == 200) {
				result = "添加成功！";
				filterChainDefinitions.reloadFilterChains();
			} else {
				result = "添加失败！";
			}
		}
		return result;
	}

	@RequestMapping("/deletePowerPermission")
	@ResponseBody
	public String deletePowerPermission(String roleId, String powerId) {
		String result = null;
		if (StringUtils.isBlank(roleId)) {
			result = "角色编号不能为空！";
		} else if (StringUtils.isBlank(powerId)) {
			result = "权限编号不能为空！";
		} else {
			int status = usersService.deletePowerPermission(roleId, powerId);
			if (status == 200) {
				result = "操作成功！";
				filterChainDefinitions.reloadFilterChains();
			} else {
				result = "操作失败！";
			}
		}
		return result;
	}
}

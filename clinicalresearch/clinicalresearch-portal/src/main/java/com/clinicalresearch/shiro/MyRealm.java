package com.clinicalresearch.shiro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.web.servlet.ShiroHttpSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.clinicalresearch.core.service.UsersService;
import com.clinicalresearch.dao.entity.Roles;
import com.clinicalresearch.dao.entity.Users;
import com.clinicalresearch.po.ActiveUser;

public class MyRealm extends AuthorizingRealm {
	@Autowired
	private UsersService usersService;

	/**
	 * 为当前登录的Subject进行授权
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		// 从当前登录的Subject中取到用户名
		ActiveUser usr = (ActiveUser) principals.getPrimaryPrincipal();
		String username = usr.getUserName();
		List<String> roles = new ArrayList<String>();
		// 根据当前用户查询当前角色
		List<Roles> usersRoles = usersService.getUsersRolesByUserId(username);
		for (Roles rl : usersRoles)
			roles.add(rl.getRolename());

		SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
		// 通过用户名查到当前用户的角色信息放到simpleAuthorizationInfo对象中
		simpleAuthorizationInfo.addRoles(roles);
		/* simpleAuthorizationInfo.addStringPermissions(permissions); */
		return simpleAuthorizationInfo;
	}

	/**
	 * 认证当前登录用户
	 * 
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		// 从token中取到用户名
		String password = new String((char[]) token.getCredentials());
		String username = (String) token.getPrincipal();
		// 通过用户名查询用户信息
		List<Users> user = null;
		try {
			user = usersService.queryLogin(username, password);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		// 如果查询用户信息为空的话直接返回null
		if (user == null || user.size() < 1) {
			return null;
		}
		// 将用户信息设置到ActiveUser
		ActiveUser usr = new ActiveUser();
		usr.setPassword(password);
		usr.setUserName(username);
		usr.setRealname(user.get(0).getUsername());
		if (usr != null) {
			// 当user不为空时将user中的信息封装成AuthenticationInfo对象
			AuthenticationInfo aut = new SimpleAuthenticationInfo(usr, usr.getPassword(), "");
			return aut;
		} else {
			return null;
		}

	}

}

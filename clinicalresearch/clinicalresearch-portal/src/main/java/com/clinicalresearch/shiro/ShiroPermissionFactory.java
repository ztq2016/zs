package com.clinicalresearch.shiro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.Permission;
import org.apache.shiro.config.Ini;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.CollectionUtils;
import org.apache.shiro.web.config.IniFilterChainResolverFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.clinicalresearch.core.service.UsersService;

public class ShiroPermissionFactory extends ShiroFilterFactoryBean {

	@Autowired
	private UsersService usersService;
	/** 记录配置中的过滤链 */
	public static String definition = "";

	/**
	 * 初始化设置过滤链
	 */
	@Override
	public void setFilterChainDefinitions(String definitions) {
		// TODO Auto-generated method stub
		definition = definitions;// 记录配置的静态过滤链
		//查询自定义权限
		HashMap<String, String> otherChains = usersService.findAllPermission();
		// List<Permission> permissions = permissService.findAll();
		// 加载配置默认的过滤链
		List lst=new ArrayList<>();
		Ini ini = new Ini();
		ini.load(definitions);
		Ini.Section section = ini.getSection(IniFilterChainResolverFactory.URLS);
		if (CollectionUtils.isEmpty(section)) {
			section = ini.getSection(Ini.DEFAULT_SECTION_NAME);
		}
		// 加上数据库中过滤链
		section.putAll(otherChains);
		setFilterChainDefinitionMap(section);
	}

}

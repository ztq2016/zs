package com.clinicalresearch.shiro;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authz.AuthorizationFilter;

/**
 * 角色拦截器
 * 
 * @author lizhenjie
 *
 */
public class CustomRolesAuthor extends AuthorizationFilter {

	@Override
	protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue)
			throws Exception {
		// TODO Auto-generated method stub
		Subject subject = getSubject(request, response);
		String[] rolesArray = (String[]) mappedValue;
		if (rolesArray == null || rolesArray.length == 0) {
			return true;
		}
		for (int i = 0; i < rolesArray.length; i++) {
			if (subject.hasRole(rolesArray[i])) {
				return true;
			}
		}
		return false;
	}

}

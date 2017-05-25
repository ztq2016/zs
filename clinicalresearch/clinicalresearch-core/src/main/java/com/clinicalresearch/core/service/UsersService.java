package com.clinicalresearch.core.service;

import java.util.HashMap;
import java.util.List;

import com.clinicalresearch.dao.entity.Powers;
import com.clinicalresearch.dao.entity.Roles;
import com.clinicalresearch.dao.entity.Users;

public interface UsersService {

	List<Roles> getUsersRolesByUserId(String userId);

	List<Powers> getUsersPowersByUserId(String userId,String path);
	public Users getUser(String userid);

	List<String> getUsersReversedPowersByUserId(String userId);

	List<Users> queryLogin(String username, String password);

	int addRolesPermission(String userId, String roleId);

	int addPowerPermission(String roleId, String powerId);

	int addRole(Roles roles);

	HashMap<String, String> findAllPermission();

	int deletePowerPermission(String roleId, String powerId);

	List<Powers> getUserMenus(String userId);

}

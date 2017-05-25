package com.clinicalresearch.dao.manager;

import java.util.HashMap;
import java.util.List;

import com.clinicalresearch.dao.entity.Powers;
import com.clinicalresearch.dao.entity.RolesPowersKey;

public interface RolesPowersExtendMapper {
	int batchInsertRolesPowers(List<RolesPowersKey> list);

	List<Powers> getUserMenus(String userId);
}

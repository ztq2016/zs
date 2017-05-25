package com.clinicalresearch.core.serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinicalresearch.core.service.UsersService;
import com.clinicalresearch.dao.entity.Powers;
import com.clinicalresearch.dao.entity.PowersExample;
import com.clinicalresearch.dao.entity.Roles;
import com.clinicalresearch.dao.entity.RolesExample;
import com.clinicalresearch.dao.entity.RolesPowersExample;
import com.clinicalresearch.dao.entity.RolesPowersKey;
import com.clinicalresearch.dao.entity.Users;
import com.clinicalresearch.dao.entity.UsersExample;
import com.clinicalresearch.dao.entity.UsersRolesExample;
import com.clinicalresearch.dao.entity.UsersRolesKey;
import com.clinicalresearch.dao.manager.PowersMapper;
import com.clinicalresearch.dao.manager.RolesMapper;
import com.clinicalresearch.dao.manager.RolesPowersExtendMapper;
import com.clinicalresearch.dao.manager.RolesPowersMapper;
import com.clinicalresearch.dao.manager.UsersMapper;
import com.clinicalresearch.dao.manager.UsersRolesMapper;
import com.google.gson.Gson;

@Service
public class UsersServiceImpl implements UsersService {
	private static final Logger logger = Logger.getLogger(UsersServiceImpl.class);

	private static final Gson gson = new Gson();

	@Autowired
	private UsersMapper usersMapper;// 用户信息表
	@Autowired
	private UsersRolesMapper usersRolesMapper;// 用户角色关系表
	@Autowired
	private RolesMapper rolesMapper;// 角色表
	@Autowired
	private RolesPowersMapper rolesPowersMapper; // 角色权限关系表
	@Autowired
	private RolesPowersExtendMapper rolesPowersExtendMapper; // 角色权限关系表
	@Autowired
	private PowersMapper powersMapper;// 权限表

	private ArrayList menuList;

	/**
	 * 根据用户编号查询用户权限
	 * 
	 * @param userId
	 * @return
	 */
	@Override
	public List<Powers> getUsersPowersByUserId(String userId, String path) {
		PowersExample powersExample = new PowersExample();
		RolesPowersExample PowersExample = new RolesPowersExample();
		UsersRolesExample usrRolexample = new UsersRolesExample();
		usrRolexample.or().andUseridEqualTo(userId);
		// 存放查询的ID
		List<String> ids = new ArrayList<>();
		// 根据用户ID查询关联roleID
		List<UsersRolesKey> selectByExample = usersRolesMapper.selectByExample(usrRolexample);
		if (selectByExample.size() > 0) {

			for (UsersRolesKey usr : selectByExample) {
				ids.add(usr.getRoleid());
			}
			// 根据roleId查询powerId
			PowersExample.createCriteria().andRoleidIn(ids);
			List<RolesPowersKey> powerIds = rolesPowersMapper.selectByExample(PowersExample);
			if (powerIds.size() > 0) {
				// 清空转存list
				ids.clear();
				for (RolesPowersKey rp : powerIds) {
					ids.add(rp.getPowerid());
				}
				if (!path.equals("") && path != null) {
					powersExample.createCriteria().andPoweridIn(ids).andPageurlEqualTo(path);
				} else {
					powersExample.createCriteria().andPoweridIn(ids);
				}
				List<Powers> powersList = powersMapper.selectByExample(powersExample);
				if (powersList.size() > 0) {
					return powersList;
				} else {
					return null;
				}
			} else {
				return null;
			}
		}
		return null;
	}

	/**
	 * 根据用户ID查询角色信息
	 * 
	 * @param userId
	 * @return
	 */
	@Override
	public List<Roles> getUsersRolesByUserId(String userId) {
		// 存放查询的ID
		List<String> ids = selectUsersRolesIdsByUserId(userId);
		if (ids != null && ids.size() > 0) {
			RolesExample roleExample = new RolesExample();
			roleExample.createCriteria().andRoleidIn(ids);
			List<Roles> roleLst = rolesMapper.selectByExample(roleExample);
			return roleLst;
		}
		return null;
	}

	/**
	 * 根据用户id查询角色编号集合
	 * 
	 * @param userId
	 * @return
	 */
	public List<String> selectUsersRolesIdsByUserId(String userId) {
		UsersRolesExample usrRolexample = new UsersRolesExample();
		usrRolexample.or().andUseridEqualTo(userId);
		// 存放查询的ID
		List<String> ids = new ArrayList<>();
		// 根据用户ID查询关联roleID
		List<UsersRolesKey> selectByExample = usersRolesMapper.selectByExample(usrRolexample);
		for (UsersRolesKey urk : selectByExample) {
			ids.add(urk.getRoleid());
		}
		return ids;
	}

	/**
	 * 根据用户编号查询用户没有的权限
	 * 
	 * @param userId
	 * @return
	 */
	@Override
	public List<String> getUsersReversedPowersByUserId(String userId) {
		List<String> powerUrl = new ArrayList<>();
		PowersExample powersExample = new PowersExample();
		RolesPowersExample PowersExample = new RolesPowersExample();
		UsersRolesExample usrRolexample = new UsersRolesExample();
		usrRolexample.or().andUseridEqualTo(userId);
		// 存放查询的ID
		List<String> ids = new ArrayList<>();
		// 根据用户ID查询关联roleID
		List<UsersRolesKey> selectByExample = usersRolesMapper.selectByExample(usrRolexample);
		if (selectByExample.size() > 0) {

			for (UsersRolesKey usr : selectByExample) {
				ids.add(usr.getRoleid());
			}
			// 根据roleId查询powerId
			PowersExample.createCriteria().andRoleidIn(ids);
			List<RolesPowersKey> powerIds = rolesPowersMapper.selectByExample(PowersExample);
			if (powerIds.size() > 0) {
				// 清空转存list
				ids.clear();
				for (RolesPowersKey rp : powerIds) {
					ids.add(rp.getPowerid());
				}

				powersExample.createCriteria().andPoweridIn(ids);

				List<Powers> powersList = powersMapper.selectByExample(powersExample);
				if (powersList.size() > 0) {
					for (Powers p : powersList) {
						powerUrl.add(p.getPageurl());
					}
					return powerUrl;
				} else {
					return null;
				}
			} else {
				return null;
			}
		}
		return null;
	}

	/**
	 * 更具用户编号查询用户信息
	 * 
	 * @param userid
	 * @return
	 */
	public Users getUser(String userid) {
		Users usr = usersMapper.selectByPrimaryKey(userid);
		return usr;
	}

	/**
	 * 登录查询
	 */
	@Override
	public List<Users> queryLogin(String username, String password) {
		// TODO Auto-generated method stub
		UsersExample usersExample = new UsersExample();
		usersExample.or().andUseridEqualTo(username).andPwdEqualTo(password);
		List<Users> user = usersMapper.selectByExample(usersExample);
		return user;
	}

	/**
	 * 添加用户角色
	 * 
	 * @param userId
	 * @param roleId
	 */
	@Override
	public int addRole(Roles roles) {
		int result = 200;
		try {
			rolesMapper.insert(roles);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			result = 500;
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 给用户分配角色权限
	 * 
	 * @param userId
	 * @param roleId
	 */
	@Override
	public int addRolesPermission(String userId, String roleId) {
		int result = 200;
		try {
			UsersRolesKey rsrRl = new UsersRolesKey();
			rsrRl.setRoleid(roleId);
			rsrRl.setUserid(userId);
			usersRolesMapper.insert(rsrRl);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			result = 500;
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 给角色分配权限
	 * 
	 * @param userId
	 * @param roleId
	 */
	@Override
	public int addPowerPermission(String roleId, String powerId) {
		int result = 200;
		try {
			List<RolesPowersKey> list = new ArrayList<>();
			String[] powerIds = powerId.split(",");
			for (String powrId : powerIds) {
				RolesPowersKey powersKey = new RolesPowersKey();
				powersKey.setPowerid(powrId);
				powersKey.setRoleid(roleId);
				list.add(powersKey);
			}
			rolesPowersExtendMapper.batchInsertRolesPowers(list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = 500;
		}
		return result;
	}

	/**
	 * 删除给用户分配角色权限
	 * 
	 * @param userId
	 * @param roleId
	 */
	@Override
	public int deletePowerPermission(String roleId, String powerId) {
		int result = 200;
		try {
			RolesPowersExample powersKey = new RolesPowersExample();
			powersKey.or().andPoweridEqualTo(powerId).andRoleidEqualTo(roleId);
			rolesPowersMapper.deleteByExample(powersKey);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = 500;
		}
		return result;
	}

	/**
	 * 根据用户编号获取功能菜单
	 */
	@Override
	public List<Powers> getUserMenus(String userId) {
		List<Powers> userMenus = rolesPowersExtendMapper.getUserMenus(userId);
		return userMenus;
	}

	/**
	 * 查询所有的角色权限
	 * 
	 * @param userId
	 * @param roleId
	 */
	@Override
	public HashMap<String, String> findAllPermission() {
		HashMap<String, String> result = new HashMap<>();
		// 查询所有角色
		List<Roles> roles = rolesMapper.selectByExample(null);
		List<RolesPowersKey> rolePower = rolesPowersMapper.selectByExample(null);
		List<Powers> power = powersMapper.selectByExample(null);
		for (Roles r : roles) {
			for (RolesPowersKey rp : rolePower) {
				for (Powers p : power) {
					if (r.getRoleid().equals(rp.getRoleid()) && rp.getPowerid().equals(p.getPowerid())) {
						String role = result.get(p.getPageurl());
						if (p.getPageurl() != null) {
							if (role == null) {
								result.put(p.getPageurl(), r.getRolename());
							} else {
								role = role + "," + r.getRolename();
								result.put(p.getPageurl(), role);
							}
						}

					}
				}
			}
		}
		// 将角色格式化
		for (Entry<String, String> dt : result.entrySet()) {
			String value = "roles[" + dt.getValue() + "]";
			result.put(dt.getKey(), value);
		}
		return result;
	}
}

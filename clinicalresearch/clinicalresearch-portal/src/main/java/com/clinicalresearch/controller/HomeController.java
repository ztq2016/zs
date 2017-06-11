package com.clinicalresearch.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.clinicalresearch.core.bean.STUDYSTYPE;
import com.clinicalresearch.core.bean.StudyInfo;
import com.clinicalresearch.core.service.AddStudysService;
import com.clinicalresearch.core.service.StudysService;
import com.clinicalresearch.core.service.UsersService;
import com.clinicalresearch.dao.entity.Page;
import com.clinicalresearch.dao.entity.Powers;
import com.clinicalresearch.dao.entity.StudyType;
import com.clinicalresearch.dao.entity.Studys;
import com.clinicalresearch.dao.entity.Users;
import com.clinicalresearch.model.SearchResult;
import com.clinicalresearch.po.ActiveUser;
import com.google.gson.Gson;

/**
 * 
 * @author ztq_2016
 *
 */
@Controller
public class HomeController {

	private static final Logger logger = Logger.getLogger(HomeController.class);

	private static final Gson gson = new Gson();

	@Autowired
	private StudysService studysService;

	@Autowired
	private AddStudysService addStudysService;
	@Autowired
	private UsersService usersService;

	/**
	 * 进入登录页面
	 * 
	 * @return
	 */
	@RequestMapping(value = "/login")
	public ModelAndView loginView() {

		return new ModelAndView("login");
	}

	/**
	 * 权限认证失败后走该方法
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/unauthorized")
	public String unauthorized(HttpServletRequest request) {
		request.setAttribute("powerTips", "权限认证失败，您没有该功能权限！");
		return "redirect:/index";
	}

	/**
	 * 登录操作，登录成功后跳转到主页
	 * 
	 * @param attr
	 * @param userId
	 * @param password
	 * @return
	 */
	@RequestMapping("/entryHome")
	@ResponseBody
	public String entryHome(RedirectAttributes attr, String userId, String password, HttpServletRequest request) {
		
		System.out.println("entryHome:" + userId);
		
		if (!StringUtils.isBlank(userId) && !StringUtils.isBlank(password)) {
			System.out.println("登录成功！");
			// new 一个subject对象出来
			ActiveUser usr = new ActiveUser();
			usr.setUserName(userId);
			usr.setPassword(password);
			Subject subject = SecurityUtils.getSubject();
			String exceptionName = null;
			// 创建一个shiro令牌将从前台传过来的用户名和密码放进去
			try {
				UsernamePasswordToken token = new UsernamePasswordToken(usr.getUserName(), usr.getPassword());
				// 调用login方法对比token中的数据和从realm中AuthenticationInfo对象中的数据进行匹配
				subject.login(token);
			} catch (Exception e) {
				exceptionName = e.getClass().getName();
			}
			if (exceptionName != null) {
				if (exceptionName.equals(UnknownAccountException.class.getName())) {
					return "500";
					/*return "redirect:/login";*/
				} else if (IncorrectCredentialsException.class.getName().equals(exceptionName)) {
					return "500";
					/*return "redirect:/login";*/
				}
			}
			List<Powers> userMenus = usersService.getUserMenus(userId);
			HttpSession session = request.getSession();
			session.setAttribute("userId", userId);
			session.setAttribute("userMenus", userMenus);
			session.setAttribute("user", (ActiveUser)subject.getPrincipal());
		}
		return "200";
	}

	/**
	 * 首页查询
	 * 
	 * @param userId
	 * @return
	 */
	@RequestMapping(value = "/index")
	public ModelAndView homeView(HttpServletRequest request) {
		
		String userId = request.getSession().getAttribute("userId").toString();
		System.out.println(userId == null);
		
		ModelAndView modelAndView = new ModelAndView();
		/* 总条数 */
		int allStudyCount = studysService.getAllStudyCount(userId);
		modelAndView.addObject("allcount", allStudyCount);

		Map<String, String> setAllDifferentType = setAllDifferentType(userId);
		/* 查询所有的列表 */
		Page page = new Page<>("1", allStudyCount, "10");
		List<Studys> study = studysService.getStudy(userId, null, null, page);
		List<StudyInfo> convertFromStudys = studysService.convertFromStudys(study);
		modelAndView.addObject("studyList", convertFromStudys);
		// 获取功能菜单列表
		modelAndView.addObject("userMenus", request.getSession().getAttribute("userMenus"));
		modelAndView.setViewName("home");
		modelAndView.addObject("page", page);
		modelAndView.addObject("typeCount", setAllDifferentType);
		return modelAndView;
	}

	/**
	 * 根据不同的类型给出不同的个数
	 * 
	 * @param modelAndView
	 * @param userId
	 */
	private Map<String, String> setAllDifferentType(String userId) {
		Map<String, String> typeCount = new HashMap<>();
		/* 不同类型中的个数与比例 */
		Map<STUDYSTYPE, List<Integer>> studyCountByType = studysService.getStudyCountByType(userId);
		System.out.println(gson.toJson(studyCountByType));
		for (STUDYSTYPE studsytype : studyCountByType.keySet()) {
			switch (studsytype) {
			case NRCT:
				typeCount.put("nrct", studyCountByType.get(studsytype).get(0).toString());
				typeCount.put("nrctper", studyCountByType.get(studsytype).get(1).toString());
				break;
			case RCS:
				typeCount.put("rcs", studyCountByType.get(studsytype).get(0).toString());
				typeCount.put("rcsper", studyCountByType.get(studsytype).get(1).toString());
				break;
			case CCS:
				typeCount.put("ccs", studyCountByType.get(studsytype).get(0).toString());
				typeCount.put("ccsper", studyCountByType.get(studsytype).get(1).toString());
				break;
			case CSS:
				typeCount.put("css", studyCountByType.get(studsytype).get(0).toString());
				typeCount.put("cssper", studyCountByType.get(studsytype).get(1).toString());
				break;
			default:
				break;
			}
		}
		return typeCount;

	}

	/**
	 * 查询接口
	 * 
	 * @param userId
	 * @param keyWord
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("/studysearch")
	@ResponseBody
	public Object searchStudyByKeyWord(@RequestBody Map<String, String> map) {
		String userId = map.get("userId");
		String keyWord = map.get("keyWord");
		String currentPage = map.get("currentPage");
		String pageSize = map.get("pageSize");
		String studyType = map.get("studyType");
		int allStudyCountByKeyWord = studysService.getAllStudyCountByKeyWord(userId, keyWord,
				STUDYSTYPE.getValue(studyType));
		Page page = new Page<>(currentPage, allStudyCountByKeyWord, pageSize);
		List<Studys> allStudysByKeyWord = studysService.getAllStudysByKeyWord(userId, keyWord,
				STUDYSTYPE.getValue(studyType), page);
		List<StudyInfo> convertFromStudys = studysService.convertFromStudys(allStudysByKeyWord);
		SearchResult sResult = new SearchResult();
		sResult.setPage(page);
		sResult.setStudyList(convertFromStudys);
		sResult.setUserId(userId.toString());
		return sResult;
	}

	@RequestMapping("/studydelete")
	@ResponseBody
	public Object deleteStudy(@RequestBody Map<String, String> map) {
		String userId = map.get("userId");
		String studyId = map.get("studyId");
		String keyWord = map.get("keyWord");
		String studyType = map.get("studyType");
		String currentPage = map.get("currentPage");
		String pageSize = map.get("pageSize");
		int deleteStudy = studysService.deleteStudy(userId, studyId);
		boolean isTrue = false;

		if (deleteStudy > 0) {
			isTrue = true;
		}
		int allStudyCountByKeyWord = studysService.getAllStudyCountByKeyWord(userId, keyWord,
				STUDYSTYPE.getValue(studyType));
		logger.info("allStudyCountByKeyWord:" + allStudyCountByKeyWord);
		Integer parseInt = Integer.parseInt(currentPage);
		Page page = new Page(parseInt.toString(), allStudyCountByKeyWord, pageSize);
		List<Studys> allStudysByKeyWord = studysService.getAllStudysByKeyWord(userId, keyWord,
				STUDYSTYPE.getValue(studyType), page);
		List<StudyInfo> convertFromStudys = studysService.convertFromStudys(allStudysByKeyWord);
		SearchResult sResult = new SearchResult();
		Map<String, String> setAllDifferentType = setAllDifferentType(userId);
		sResult.setPage(page);
		sResult.setStudyList(convertFromStudys);
		sResult.setUserId(userId);
		sResult.setTypeCount(setAllDifferentType);
		return sResult;
	}

	@RequestMapping(value = "/studyedit")
	public ModelAndView turnToStudyEdit(String userId, String studyId) {
		StudyInfo studyInfo = studysService.getStudyInfoById(userId, studyId);
		ModelAndView modelAndView = new ModelAndView("addstudy");
		modelAndView.addObject("studyInfo", studyInfo);
		List<StudyType> studyType = addStudysService.getStudyType();
		List<Users> allUsers = addStudysService.getAllUsers();
		modelAndView.addObject("studyTypeAll", studyType);
		modelAndView.addObject("allUser", allUsers);
		return modelAndView;
	}

	@RequestMapping("/queryPatient")
	public Object queryPatientByEntryCriteria(String name) {

		return null;
	}

	@RequestMapping("/queryuserinfo")
	@ResponseBody
	public Object queryUserInfo() {
		List<Users> allUsers = addStudysService.getAllUsers();
		return allUsers;
	}
}

package com.clinicalresearch.core.serviceImpl;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.clinicalresearch.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinicalresearch.core.bean.STUDYSTYPE;
import com.clinicalresearch.core.bean.StudyInfo;
import com.clinicalresearch.core.service.StudysService;
import com.clinicalresearch.dao.entity.InclusionCriteria;
import com.clinicalresearch.dao.entity.InclusionCriteriaExample;
import com.clinicalresearch.dao.entity.Page;
import com.clinicalresearch.dao.entity.StatisticalModel;
import com.clinicalresearch.dao.entity.StatisticalModelExample;
import com.clinicalresearch.dao.entity.StatisticalResult;
import com.clinicalresearch.dao.entity.StatisticalResultExample;
import com.clinicalresearch.dao.entity.StudyType;
import com.clinicalresearch.dao.entity.StudyTypeExample;
import com.clinicalresearch.dao.entity.Studys;
import com.clinicalresearch.dao.entity.StudysExample;
import com.clinicalresearch.dao.entity.StudysExample.Criteria;
import com.clinicalresearch.dao.entity.StudysInf;
import com.clinicalresearch.dao.entity.SubjectGroups;
import com.clinicalresearch.dao.entity.SubjectGroupsExample;
import com.clinicalresearch.dao.entity.Users;
import com.clinicalresearch.dao.entity.UsersExample;
import com.clinicalresearch.dao.manager.InclusionCriteriaMapper;
import com.clinicalresearch.dao.manager.StatisticalModelMapper;
import com.clinicalresearch.dao.manager.StatisticalResultMapper;
import com.clinicalresearch.dao.manager.StudyTypeMapper;
import com.clinicalresearch.dao.manager.StudysExtendsMapper;
import com.clinicalresearch.dao.manager.StudysMapper;
import com.clinicalresearch.dao.manager.SubjectGroupsMapper;
import com.clinicalresearch.dao.manager.UsersMapper;
import com.google.gson.Gson;
@Service("studysService")
public class StudysServiceImpl implements StudysService{

	private static final Logger logger = Logger.getLogger(StudysServiceImpl.class);
	
	private static final Gson gson = new Gson();
	
	@Autowired
	private StudysExtendsMapper studysExtendsMapper;
	
	@Autowired
	private StudysMapper studysMapper;
	
	@Autowired
	private StudyTypeMapper studyTypeMapper;
	
	@Autowired
	private InclusionCriteriaMapper inclusionCriteriaMapper;
	
	@Autowired
	private SubjectGroupsMapper subjectGroupsMapper;
	
	@Autowired
	private StatisticalResultMapper statisticalResultMapper;
	
	@Autowired
	private StatisticalModelMapper statisticalModelMapper;
	
	@Autowired
	private UsersMapper usersMapper;
	
	
	@Override
	public int getStatusByIdCount(StudysInf studys) {
		return studysExtendsMapper.getStatusByIdCount(studys);
	}

	@Override
	public List<StudysInf> selectStudysList(StudysInf studys , Page page) {
		return studysExtendsMapper.selectStudysList(studys, page.getCurrentPage(), page.getPageSize());
	}

	@Override
	public Map<STUDYSTYPE, List<Integer>> getStudyCountByType(String userId) {
		Map<STUDYSTYPE, List<Integer>> resultMap = new LinkedHashMap<>();
		Integer allCount = getAllStudyCount(userId);
		logger.info("allCount" + allCount);
		for (STUDYSTYPE studsytype:STUDYSTYPE.values()) {
			StudysExample studysExample = getStudysExample(userId,studsytype,null,null);
			int count = studysMapper.countByExample(studysExample);
			List<Integer> list = new ArrayList<>();
			list.add(0, count);
			/*此处为向下取整，没有用小数*/
			Integer per = (int)(((count * 1.0)/(allCount * 1.0)) * 100);
			list.add(1,per);
			resultMap.put(studsytype, list);
			
			logger.info("studsytype:" + studsytype);
		}
		return resultMap;
	}
	
	@Override
	public int getAllStudyCount(String userId) {
		if (userId == null || userId.isEmpty()) {
			return 0;
		}
		StudysExample studysExample = getStudysExample(userId, null, null, null);
		int countByExample = studysMapper.countByExample(studysExample);
		return countByExample;
	}

	@Override
	public List<StudysInf> getStudyByName(String userId, String keyWord, String currentPage, String pageSize) {
		
		StudysExample example = new StudysExample();
		example.createCriteria().andUseridEqualTo(userId).andStudyobjectiveLike("%" + keyWord + "%");
		Criteria createCriteria = example.createCriteria();
		example.or(createCriteria);
		createCriteria.andUseridEqualTo(userId).andPrincipalinvestigatorLike("%" + keyWord + "%");
		
		int countByExample = studysMapper.countByExample(example);
		Page page = new Page<>(currentPage, countByExample, pageSize);
		example.setOrderByClause("studycompletiondate desc limit " + page.getStartRecord() + "," + page.getEndRecord());
		List<Studys> studyList = studysMapper.selectByExample(example);
		if (studyList != null && !studyList.isEmpty()) {
			for (Studys study:studyList) {
				
			}
			logger.info(gson.toJson(studyList.size()));
			return null;
		} else {
			return null;
		}
		
	}

	/*构建一个bean转换的方法，将所有的study信息封装成页面需要的信息bean*/
	
	@Override
	public List<StudysInf> getAllStudyByUserId(String userId, Page page) {
		
		return null;
	}

	@Override
	public List<Studys> getStudy(String userId, STUDYSTYPE studyType, String keyWord,Page page) {
		if (userId == null) {
			logger.error("err:user id is null.");
			throw new RuntimeException("err:user id is null.");
		}
		StudysExample example = getStudysExample(userId,studyType,keyWord,null);
		int countByExample = studysMapper.countByExample(example);
		if (page != null) {
			example.setOrderByClause("studycompletiondate desc limit " + page.getStartRecord() + "," + page.getPageSize());
		}
		
		List<Studys> selectByExample = studysMapper.selectByExample(example);
		return selectByExample;
	}
	/**
	 * 根据查询条件生成查询样例
	 * @param userId 用户id
	 * @param studyType 研究类型
	 * @param keyWord 研究关键词
	 * @return
	 */
	//TODO 添加是否删除的判断
	private StudysExample getStudysExample(String userId, STUDYSTYPE studyType, String keyWord,String isdelete) {
		logger.info("getStudysExample :goto here .");
		StudysExample example = new StudysExample();
		String typeId = getStudyTypeId(studyType);
		
		if (keyWord != null && !keyWord.isEmpty()) {
			
			Criteria createCriteria = example.createCriteria();
			Criteria createCriteria2 = example.createCriteria();
			createCriteria.andUseridEqualTo(userId).andStudyobjectiveLike("%" + keyWord + "%");
			createCriteria2.andUseridEqualTo(userId).andPrincipalinvestigatorLike("%" + keyWord + "%");
			if (typeId != null && !typeId.isEmpty()) {
				createCriteria.andStudytypeEqualTo(typeId);
				createCriteria2.andStudytypeEqualTo(typeId);
			}
			if (StringUtils.isEmpty(isdelete)) {
				createCriteria.andIsdeleteEqualTo("0");
				createCriteria2.andIsdeleteEqualTo("0");
			} else {
				createCriteria.andIsdeleteEqualTo(isdelete);
				createCriteria2.andIsdeleteEqualTo(isdelete);
			}
			example.clear();
			example.or(createCriteria);
			example.or(createCriteria2);
		} else {
			Criteria andUseridEqualTo = example.createCriteria().andUseridEqualTo(userId);
			if (typeId != null && !typeId.isEmpty()) {
				andUseridEqualTo.andStudytypeEqualTo(typeId);
			}
			if (StringUtils.isEmpty(isdelete)) {
				andUseridEqualTo.andIsdeleteEqualTo("0");
			} else {
				andUseridEqualTo.andIsdeleteEqualTo(isdelete);
			}
		}
		
		return example;
	}
	
	/**
	 * 根据studyType查询studyid
	 * @param studyType
	 * @return
	 */
	private String getStudyTypeId(STUDYSTYPE studyType) {
		if (studyType == null) {
			return null;
		}
		StudyTypeExample typeExample = new StudyTypeExample();
		typeExample.createCriteria().andTypenameEqualTo(studyType.getValue());
		List<StudyType> selectByExample = studyTypeMapper.selectByExample(typeExample);
		if (selectByExample == null || selectByExample.isEmpty()) {
			return null;
		}
		StudyType studyType2 = selectByExample.get(0);
		String typeid = studyType2.getTypeid();
		return typeid;
	}

	@Override
	public List<StudyInfo> convertFromStudys(List<Studys> list) {
		if (list == null || list.isEmpty()) {
			return null;
		}
		List<StudyType> selectByExample = studyTypeMapper.selectByExample(null);
		Map<String, StudyType> typeMap = new HashMap<>();
		for (StudyType st:selectByExample) {
			typeMap.put(st.getTypeid(), st);
		}
		List<StudyInfo> resultList = new ArrayList<>();
		List<String> studyIdList = new ArrayList<>();
		List<String> userIdList = new ArrayList<>();
		for (Studys stu:list) {
			studyIdList.add(stu.getStudyid());
			StudyInfo studyInfo = new StudyInfo();
			studyInfo.setPi(stu.getPrincipalinvestigator());
			String per = getPer(stu.getState());
			System.out.println(per);
			studyInfo.setSchedule(per);
			studyInfo.setStartTime(DateUtils.formatDate(stu.getStudystartdate(),"YYYY.MM.dd"));
			studyInfo.setStudyId(stu.getStudyid());
			studyInfo.setStudyObjective(stu.getStudyobjective());
			StudyType studyType = typeMap.get(stu.getStudytype());
			studyInfo.setStudyType(studyType);
			studyInfo.setUserId(stu.getUserid());
			userIdList.add(stu.getUserid());
			resultList.add(studyInfo);
		}
		
		/*查询用户信息*/
		UsersExample usersExample = new UsersExample();
		usersExample.createCriteria().andUseridIn(userIdList);
		List<Users> usersList = usersMapper.selectByExample(usersExample);
		Map<String, Users> userMap = new HashMap<>();
		for (Users users:usersList) {
			userMap.put(users.getUserid(), users);
		}
		for (StudyInfo studyInfo:resultList) {
			String userId = studyInfo.getUserId();
			Users users = userMap.get(userId);
			studyInfo.setUserInfo(users);
		}
		
		// 需要查询入排标准 , 分组信息, 结果集合, 统计模型, 研究类型
		InclusionCriteriaExample ICexample = new InclusionCriteriaExample();
		ICexample.createCriteria().andStudyidIn(studyIdList);
		List<InclusionCriteria> inclusionCriteriaList = inclusionCriteriaMapper.selectByExample(ICexample);
		
		SubjectGroupsExample SGexample = new SubjectGroupsExample();
		SGexample.createCriteria().andStudyidIn(studyIdList);
		List<SubjectGroups> subjectGroupList = subjectGroupsMapper.selectByExample(SGexample);
		
		StatisticalResultExample sRexample = new StatisticalResultExample();
		sRexample.createCriteria().andStudyidIn(studyIdList);
		List<StatisticalResult> statisticalResultsList = statisticalResultMapper.selectByExample(sRexample);
		
		StatisticalModelExample SMexample = new StatisticalModelExample();
		SMexample.createCriteria().andStudyidIn(studyIdList);
		List<StatisticalModel> statisticalModels = statisticalModelMapper.selectByExample(SMexample);
		Map<String, List<InclusionCriteria>> icMap = getMapByList(inclusionCriteriaList);
		Map<String, List<SubjectGroups>> sgMap = getMapByList(subjectGroupList);
		Map<String, List<StatisticalResult>> srMap = getMapByList(statisticalResultsList);
		Map<String, List<StatisticalModel>> smMap = getMapByList(statisticalModels);
		for (StudyInfo studyInfo:resultList) {
			String studyId = studyInfo.getStudyId();
			studyInfo.setInclusionCriteria(icMap.get(studyId));
			studyInfo.setGroupInfo(sgMap.get(studyId));
			studyInfo.setResults(srMap.get(studyId));
			studyInfo.setStatisticalModel(smMap.get(studyId));
		}
		String json = gson.toJson(resultList);
		
		logger.info("resultList:" + gson.toJson(resultList));
		return resultList;
	}

	private <T> Map<String, List<T>> getMapByList(List<T> list) {
		Map<String,List<T>> map = new HashMap<>();
		if (list != null && !list.isEmpty()) {
			for (T t:list) {
				try {
					Field declaredField = t.getClass().getDeclaredField("studyid");
					declaredField.setAccessible(true);
					List<T> subList = map.get((String)declaredField.get(t));
					if (subList == null) {
						subList = new ArrayList<T>();
						subList.add(t);
						map.put((String)declaredField.get(t), subList);
					} else {
						subList.add(t);
					}
				} 
				catch (NoSuchFieldException e) {
					e.printStackTrace();
				} 
				catch (SecurityException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} 
				catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}
		return map;
	}

	private String getPer(String state) {
		switch (state) {
		case "0": return "25%";
		case "1": return "50%";	
		case "2": return "75%";
		case "3": return "已完成";
		}
		return "";
	}

	@Override
	public int getAllStudyCountByKeyWord(String userId, String keyWord, STUDYSTYPE studyType) {
		StudysExample studysExample = getStudysExample(userId, studyType, keyWord, null);
		int countByExample = studysMapper.countByExample(studysExample);
		logger.info("getAllStudyCountByKeyWord :" + countByExample);
		return countByExample;
	}

	@Override
	public List<Studys> getAllStudysByKeyWord(String userId, String keyWord, STUDYSTYPE studyType, Page page) {
		StudysExample studysExample = getStudysExample(userId, studyType, keyWord, null);
		studysExample.setOrderByClause(" studystartdate desc limit " + page.getStartRecord() + "," + page.getPageSize());
		List<Studys> selectByExample = studysMapper.selectByExample(studysExample);
		return selectByExample;
	}

	@Override
	public int deleteStudy(String userId, String studyId) {
		Studys record = new Studys();
		record.setStudyid(studyId);
		record.setIsdelete("1");
		int updateByPrimaryKeySelective = studysMapper.updateByPrimaryKeySelective(record);
		return updateByPrimaryKeySelective;
	}

	@Override
	public StudyInfo getStudyInfoById(String userId, String studyId) {
		StudysExample example = new StudysExample();
		example.createCriteria().andUseridEqualTo(userId).andStudyidEqualTo(studyId);
		List<Studys> selectByExample = studysMapper.selectByExample(example);
		List<StudyInfo> convertFromStudys = convertFromStudys(selectByExample);
		if (convertFromStudys != null && !convertFromStudys.isEmpty()) {
			return convertFromStudys.get(0);
		}
		return null;
	}

	/**
	 * 切分入排表达式，转换为json
	 * @param entryCriteria 表达式
	 * @return
	 */
	@Override
	public String getJsonFromEntryCriteria(String entryCriteria) {
		
		if (entryCriteria == null) {
			return null;
		}
		
		Map<String, Object> json = new HashMap<String, Object>();
		
		boolean contains = entryCriteria.contains("&&");
		String[] split = null;
		if (contains) {
			split = entryCriteria.split("&&");
			
		}
		
		for (String string: split) {
			string = string.trim().replace("(", "").replace(")", "");
			if (string.contains("||")) {
				String[] or = string.split("\\|\\|");
				for (String kValue:or) {
					kValue = kValue.trim();
					String[] keyValueArr = kValue.split("=");
					String[] split2 = kValue.split(":");
					for (String  str:keyValueArr) {
						System.out.println(gson.toJson(split2));
					}
					
					Map<String,Object> minx = new HashMap<>();
//					minx.put(key, value);
					
				}
			}
			
		}
		return null;
	}
	
}

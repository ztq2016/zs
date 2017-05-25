package com.clinicalresearch.core.serviceImpl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.clinicalresearch.utils.AcceptPrimaryKeyUtil;
import org.clinicalresearch.utils.CharUtil;
import org.clinicalresearch.utils.HttpClientUtils;
import org.clinicalresearch.utils.StringFormatUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinicalresearch.core.bean.MyThread;
import com.clinicalresearch.core.service.AddStudysService;
import com.clinicalresearch.dao.entity.HierarchicalVariableInfo;
import com.clinicalresearch.dao.entity.InclusionCriteria;
import com.clinicalresearch.dao.entity.InclusionCriteriaExample;
import com.clinicalresearch.dao.entity.IndicatorFields;
import com.clinicalresearch.dao.entity.ModelInf;
import com.clinicalresearch.dao.entity.ModelIstestResult;
import com.clinicalresearch.dao.entity.ModelIstestResultExample;
import com.clinicalresearch.dao.entity.Models;
import com.clinicalresearch.dao.entity.Page;
import com.clinicalresearch.dao.entity.PatientBasic;
import com.clinicalresearch.dao.entity.PatientBasicExample;
import com.clinicalresearch.dao.entity.Rtvtrigers;
import com.clinicalresearch.dao.entity.SaveModel;
import com.clinicalresearch.dao.entity.StatisticalModelResultInfo;
import com.clinicalresearch.dao.entity.StudyType;
import com.clinicalresearch.dao.entity.Studys;
import com.clinicalresearch.dao.entity.StudysExample;
import com.clinicalresearch.dao.entity.SubjectGroups;
import com.clinicalresearch.dao.entity.SubjectGroupsExample;
import com.clinicalresearch.dao.entity.Units;
import com.clinicalresearch.dao.entity.Users;
import com.clinicalresearch.dao.manager.InclusionCriteriaMapper;
import com.clinicalresearch.dao.manager.ModelIstestResultMapper;
import com.clinicalresearch.dao.manager.PatientBasicMapper;
import com.clinicalresearch.dao.manager.RtvtrigersMapper;
import com.clinicalresearch.dao.manager.StudyTypeMapper;
import com.clinicalresearch.dao.manager.StudysExtendsMapper;
import com.clinicalresearch.dao.manager.StudysMapper;
import com.clinicalresearch.dao.manager.SubjectGroupsMapper;
import com.clinicalresearch.dao.manager.UsersMapper;
import com.google.gson.Gson;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Service("addStudysService")
public class AddStudysServiceImpl implements AddStudysService {

	private static final Logger logger = Logger.getLogger(AddStudysServiceImpl.class);

	private static String queryname = "";

	private static final Gson gson = new Gson();

	@Autowired
	private StudyTypeMapper studyTypeMapper;

	@Autowired
	private UsersMapper usersMapper;

	@Autowired
	private StudysMapper studysMapper;

	@Autowired
	private StudysExtendsMapper studysExtendsMapper;

	@Autowired
	private RtvtrigersMapper rtvtrigersMapper;

	@Autowired
	private InclusionCriteriaMapper inclusionCriteriaMapper;

	@Autowired
	private SubjectGroupsMapper subjectGroupsMapper;

	@Autowired
	private PatientBasicMapper patientBasicMapper;

	@Autowired
	private ModelIstestResultMapper modelIstestResultMapper;
	
	/**
	 * 基本信息配置 -- 获取课题研究类型
	 * 
	 * @param
	 * @return
	 */
	@Override
	public List<StudyType> getStudyType() {
		return studyTypeMapper.selectByExample(null);
	}

	/**
	 * 基本信息配置 -- 获取课题PI
	 * 
	 * @param
	 * @return
	 */
	@Override
	public List<Users> getAllUsers() {
		return usersMapper.selectByExample(null);
	}

	/**
	 * 基本信息配置 -- 新增课题信息
	 * 
	 * @param Studys
	 *            studys
	 * @return
	 */
	@Override
	public int insertStudys(Studys studys) {

		int i = 0;

		// 数据默认状态 未锁定 未删除 进度0
		studys.setLockstatus("0");
		studys.setIsdelete("0");
		studys.setState("0");

		// 判断当前有没有课题ID 无则新增
		if (studys.getStudyid() == null || studys.getStudyid() == "") {

			/* 获取最大的ID */
			try {
				String s = studysExtendsMapper.getMaxStudyId();
				if (s == null || s == "") {
					s = "0";
				}
				int id = Integer.parseInt(s) + 1;
				String studyid = StringFormatUtil.FormatNumber(6, id);
				studys.setStudyid(studyid);
				i = studysMapper.insert(studys);
			} catch (NumberFormatException e) {
				logger.info("insertStudys" + e);
				e.printStackTrace();
			}
		}

		// 判断当前有没有课题ID 有则修改
		i = studysMapper.updateByPrimaryKey(studys);

		return i;
	}

	/**
	 * 研究对象筛选 -- 变量信息
	 * 
	 * @param
	 * @return
	 */
	@Override
	public List<HierarchicalVariableInfo> getVariableList() {

		List<HierarchicalVariableInfo> generalIndex = studysExtendsMapper.getListByFatherid("");

		for (HierarchicalVariableInfo h : generalIndex) {

			List<HierarchicalVariableInfo> hierarchicalVariableSurvey = studysExtendsMapper
					.getListByFatherid(h.getVariableid());

			for (HierarchicalVariableInfo hierarchicalVariableInfo : hierarchicalVariableSurvey) {

				List<HierarchicalVariableInfo> hierarchicalVariableDetailed = studysExtendsMapper
						.getListByFatherid(hierarchicalVariableInfo.getVariableid());
				hierarchicalVariableInfo.setHierarchicalVariableDetailed(hierarchicalVariableDetailed);
			}

			h.setHierarchicalVariableSurvey(hierarchicalVariableSurvey);

		}

		return generalIndex;
	}

	/**
	 * 研究对象筛选 -- 根据关键字检索相关 变量
	 * 
	 * @param variablename
	 * @return
	 */
	@Override
	public List<HierarchicalVariableInfo> getListByVariableName(String variablename) {
		String v = "";
		String str = "'";

		boolean con = AcceptPrimaryKeyUtil.isContain(variablename, str);
		if (con == true) {
			v = variablename.replaceAll(str, "");
		} else {
			v = variablename;
		}

		List<HierarchicalVariableInfo> list = null;

		// 判断查询 条件是否为中文or拼音
		if (CharUtil.isChineseChar(v)) {

			list = studysExtendsMapper.getListByVariableName(v);

		} else {

			list = studysExtendsMapper.getListByPY(v);

		}

		List<HierarchicalVariableInfo> returnList = new ArrayList<HierarchicalVariableInfo>();

		for (HierarchicalVariableInfo h : list) {

			List<HierarchicalVariableInfo> getVariableid = studysExtendsMapper.getListByFatherid(h.getVariableid());

			/*
			 * // 搜素条件为一级目录 if (h.getFatherid().equals("")) {
			 * 
			 * // 二级目录 List<HierarchicalVariableInfo>
			 * hierarchicalVariableSurveyList = studysExtendsMapper
			 * .getListByFatherid(h.getVariableid());
			 * 
			 * for (HierarchicalVariableInfo survey :
			 * hierarchicalVariableSurveyList) {
			 * 
			 * // 三级目录 List<HierarchicalVariableInfo>
			 * hierarchicalVariableDetailedList = studysExtendsMapper
			 * .getListByFatherid(survey.getVariableid());
			 * 
			 * survey.setHierarchicalVariableDetailed(
			 * hierarchicalVariableDetailedList); }
			 * 
			 * h.setHierarchicalVariableSurvey(hierarchicalVariableSurveyList);
			 * 
			 * returnList.add(h);
			 * 
			 * }
			 * 
			 * // 搜素条件为二级目录 if (!h.getFatherid().equals("") &&
			 * !getVariableid.isEmpty()) {
			 * 
			 * boolean flag = false;
			 * 
			 * for (HierarchicalVariableInfo re : returnList) {
			 * 
			 * for (HierarchicalVariableInfo two :
			 * re.getHierarchicalVariableSurvey()) {
			 * 
			 * if (two.getVariableid().equals(h.getVariableid())) { flag = true;
			 * } } }
			 * 
			 * if (!flag) {
			 * 
			 * // 第一级目录 HierarchicalVariableInfo father =
			 * studysExtendsMapper.getFatherById(h.getFatherid());
			 * 
			 * // 二级目录 List<HierarchicalVariableInfo>
			 * hierarchicalVariableSurveyList = studysExtendsMapper
			 * .getFatherListById(h.getVariableid());
			 * 
			 * for (HierarchicalVariableInfo survey :
			 * hierarchicalVariableSurveyList) {
			 * 
			 * // 三级目录 List<HierarchicalVariableInfo>
			 * hierarchicalVariableDetailedList = studysExtendsMapper
			 * .getListByFatherid(survey.getVariableid());
			 * 
			 * survey.setHierarchicalVariableDetailed(
			 * hierarchicalVariableDetailedList); }
			 * 
			 * father.setHierarchicalVariableSurvey(
			 * hierarchicalVariableSurveyList);
			 * 
			 * returnList.add(father);
			 * 
			 * }
			 * 
			 * }
			 */

			// 搜素条件为三级目录
			if (getVariableid.isEmpty()) {

				boolean flag = false;

				for (HierarchicalVariableInfo re : returnList) {

					for (HierarchicalVariableInfo two : re.getHierarchicalVariableSurvey()) {

						if (two.getVariableid().equals(h.getFatherid())) {
							flag = true;
						}
					}
				}

				if (!flag) {
					// 二级目录
					HierarchicalVariableInfo fatherById = studysExtendsMapper.getFatherById(h.getFatherid());

					// 一级目录
					HierarchicalVariableInfo father = studysExtendsMapper.getFatherById(fatherById.getFatherid());

					// 二级目录
					List<HierarchicalVariableInfo> hierarchicalVariableSurveyList = studysExtendsMapper
							.getFatherListById(h.getFatherid());

					for (HierarchicalVariableInfo survey : hierarchicalVariableSurveyList) {

						// 三级目录
						List<HierarchicalVariableInfo> hierarchicalVariableDetailedList = studysExtendsMapper
								.getFatherListById(h.getVariableid());

						survey.setHierarchicalVariableDetailed(hierarchicalVariableDetailedList);
					}

					father.setHierarchicalVariableSurvey(hierarchicalVariableSurveyList);

					returnList.add(father);
				}
			}

		}

		return returnList;

	}

	/**
	 * 研究对象筛选 -- 根据变量id 查询出相关的单位
	 * 
	 * @param getUnitsById
	 * @return
	 */
	@Override
	public List<Units> getUnitsById(String variableid) {
		return studysExtendsMapper.getUnitsById(variableid);
	}

	/**
	 * 研究对象筛选 -- 根据变量id 查询出相关的值域
	 * 
	 * @param getFieldById
	 * @return
	 */
	@Override
	public List<IndicatorFields> getFieldById(String variableid, String fieldname,
			@SuppressWarnings("rawtypes") Page page) {

		List<IndicatorFields> list = null;

		if (fieldname == null || fieldname == "") {
			fieldname = "";
		}
		if (CharUtil.isChineseChar(fieldname)) {
			// 查询的字段
			queryname = "fieldname";
		} else {
			queryname = "fpycode";
		}
		list = studysExtendsMapper.getFieldById(variableid, fieldname, queryname, page.getStartRecord(),
				page.getPageSize());
		return list;
	}

	/**
	 * 研究对象筛选 -- 根据变量id、名称 查询出相关的值域个数
	 * 
	 * @param getFieldCount
	 * @return
	 */
	@Override
	public int getFieldCount(String fieldname, String variableid) {

		int i = 0;
		if (fieldname == null || fieldname == "") {
			fieldname = "";
		}
		if (CharUtil.isChineseChar(fieldname)) {
			// 查询的字段
			queryname = "fieldname";
		} else {
			queryname = "fpycode";
		}

		i = studysExtendsMapper.getFieldCount(queryname, fieldname, variableid);
		logger.info("getFieldCount = " + i);
		return i;
	}

	/**
	 * 统计学处理 -- 查询出锁有统计方法
	 * 
	 * @param getCountHandleList
	 * @return
	 */
	@Override
	public List<StatisticalModelResultInfo> getCountHandleList() {
		// 第一层目录
		List<StatisticalModelResultInfo> list = studysExtendsMapper.getStatisticalModelById(null);
		for (StatisticalModelResultInfo sm : list) {
			// 第二层目录
			List<StatisticalModelResultInfo> two = studysExtendsMapper.getStatisticalModelById(sm.getModelid());

			for (StatisticalModelResultInfo s : two) {
				// 第三层目录
				List<StatisticalModelResultInfo> three = studysExtendsMapper.getStatisticalModelById(s.getModelid());
				s.setThree(three);
			}

			sm.setTwo(two);
		}
		return list;
	}

	@Override
	public List<Rtvtrigers> getRtvtrigers() {
		return rtvtrigersMapper.selectByExample(null);
	}

	@Override
	public List<IndicatorFields> getFieldDictByName(String fieldtableid, String fieldname) {
		List<IndicatorFields> list = null;

		if (fieldtableid != null || fieldtableid != "") {
			String fielddesc = "";
			int f = Integer.parseInt(fieldtableid);
			switch (f) {
			case 1:
				fielddesc = "";
				break;

			case 2:
				fielddesc = "";
				break;

			case 3:
				fielddesc = "手术与操作字典";
				break;

			case 4:
				fielddesc = "";
				break;

			case 5:
				fielddesc = "药品字典";
				break;

			case 6:
				fielddesc = "药品字典";
				break;

			case 7:
				fielddesc = "国际疾病分类（ICD）-电子病历";
				break;

			case 8:
				fielddesc = "门诊诊断字典";
				break;

			}

			if (fieldname == null || fieldname == "") {
				fieldname = "";
			}

			if (CharUtil.isChineseChar(fieldname)) {
				// 查询的字段
				queryname = "fieldname";
			} else {
				queryname = "fpycode";
			}

			list = studysExtendsMapper.getFieldDictByName(fielddesc, queryname, fieldname);

		}

		return list;
	}

	/*
	 *
	 *
	 * 
	 * @Override public int savePatients(String patients, String patientids,
	 * String studyid) {
	 * 
	 * int i = 0;
	 * 
	 * // 查看入排表达式是否存在 InclusionCriteria inc =
	 * studysExtendsMapper.getInclusionCriteriaById(studyid);
	 * 
	 * // 获取主键 String c = studysExtendsMapper.getMaxCriteriaId(); if (c == null
	 * || c == "") { c = "0"; } int id = Integer.parseInt(c) + 1; String
	 * criteriaid = StringFormatUtil.FormatNumber(6, id); InclusionCriteria
	 * inclu = new InclusionCriteria(); inclu.setCriteriaexpression(patients);
	 * inclu.setIstrue("true"); inclu.setStudyid(studyid);
	 * inclu.setCriteriaid(criteriaid);
	 * 
	 * // 保存入排表达式 if (inc == null) { inclusionCriteriaMapper.insert(inclu); }
	 * 
	 * // 修改入排表达式 修改 保存结果数据 if (inc != null &&
	 * !inc.getCriteriaexpression().equals(patients)) {
	 * inclu.setCriteriaid(inc.getCriteriaid());
	 * inclusionCriteriaMapper.updateByPrimaryKeySelective(inclu);
	 * 
	 * studysExtendsMapper.deletePatientsById(studyid); }
	 * 
	 * String p = ""; if(inc != null) { p = inc.getCriteriaexpression(); }
	 * 
	 * if (p != patients) {
	 * studysExtendsMapper.savePatients(UUID.randomUUID().toString().replace(
	 * "-", ""),patientids, studyid);
	 * 
	 * 
	 * } return i; }
	 *
	 */

	@Override
	public List<PatientBasic> getPaientBasicList(String studyid) {
		List<PatientBasic> list = studysExtendsMapper.getPaientBasicList(studyid);
		return list;
	}

	@Override
	public PatientBasic getPatienByStudyid(String studyid) {
		PatientBasic pids = studysExtendsMapper.getPatienByStudyid(studyid);
		return pids;
	}



	@Override
	public List<SubjectGroups> getSubjectGroupsList(String studyid) {
		// TODO Auto-generated method stub
		SubjectGroupsExample example = new SubjectGroupsExample();
		example.createCriteria().andStudyidEqualTo(studyid);
		example.setOrderByClause("createtime");
		List<SubjectGroups> selectByExample = subjectGroupsMapper.selectByExample(example);
		return selectByExample;
	}

	@Override
	public void savePatients(String studyId, String exp) {
		MyThread myThread = new MyThread();
		myThread.setExp(exp);
		myThread.setStudyId(studyId);
		myThread.setPatientBasicMapper(patientBasicMapper);
		myThread.start();
	}

	@Override
	public List<SubjectGroups> getPatientSetById(String groupid) {
		SubjectGroupsExample example = new SubjectGroupsExample();
		example.createCriteria().andGroupidEqualTo(groupid);
		return subjectGroupsMapper.selectByExample(example);
	}

	@Override
	public List<Studys> getStudysList(String studyid) {
		return studysExtendsMapper.getStudysList(studyid);
	}

	@Override
	public void savePatients(String studyid, String query, String patients) {

		// 查看入排表达式是否存在
		InclusionCriteria inc = studysExtendsMapper.getInclusionCriteriaById(studyid);

		// 获取主键
		String c = studysExtendsMapper.getMaxCriteriaId();
		if (c == null || c == "") {
			c = "0";
		}

		int id = Integer.parseInt(c) + 1;
		String criteriaid = StringFormatUtil.FormatNumber(6, id);
		InclusionCriteria inclu = new InclusionCriteria();
		inclu.setCriteriaexpression(patients);
		inclu.setIstrue("true");
		inclu.setStudyid(studyid);
		inclu.setCriteriaid(criteriaid);
		inclu.setCriteriaexpression(patients);
		inclu.setExpression(query);
		// 保存入排表达式
		if (inc == null) {
			inclusionCriteriaMapper.insert(inclu);
		}
		// 修改入排表达式
		if (inc != null && !inc.getCriteriaexpression().equals(patients)) {
			inclu.setCriteriaid(inc.getCriteriaid());
			inclusionCriteriaMapper.updateByPrimaryKeySelective(inclu);
		}
		//更新完成进度-- 保存研究对象筛选 进度1
		studysExtendsMapper.updateStatusById(studyid,"1");
	}

	@Override
	public String getByPatients(String studyid) {
		return studysExtendsMapper.getByPatients(studyid);
	}

	@Override
	public void saveGroups(String groupName, String conditions, String patients, String groupnum, String studyid, int j) {
		SubjectGroups groups = new SubjectGroups();
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss:SSS");
		Date date = new Date();
		String now = sdf.format(date);
		groups.setGroupid(System.currentTimeMillis()+"");
		groups.setGroupname(groupName);
		groups.setGroupcondition(conditions);
		groups.setPatientset(patients);
		groups.setGroupnum(groupnum);
		groups.setStudyid(studyid);
		groups.setCreatetime(now);
		groups.setRemark(j+"");
		subjectGroupsMapper.insert(groups);
	}

	@Override
	public String getSubjectGroups(String studyid) {
		return studysExtendsMapper.getSubjectGroups(studyid);
	}

	@Override
	public String getInclusionCriteriaList(String studyid) {
		return studysExtendsMapper.getInclusionCriteriaList(studyid);
	}

	@Override
	public List checkGroupcondition(String studyid ,String condition) {
		//更新完成进度-- 保存对象分组 进度2
		studysExtendsMapper.updateStatusById(studyid,"2");
		return studysExtendsMapper.checkGroupcondition(studyid , condition);
	}

	@Override
	public void deleteGroupcondition(String studyid) {
		studysExtendsMapper.deleteGroupcondition(studyid);
	}

	@Override
	public List<ModelIstestResult> getModelIstest(String studyid) {
		
		ModelIstestResultExample example = new ModelIstestResultExample();
		example.createCriteria().andStudyidEqualTo(studyid);
		return modelIstestResultMapper.selectByExample(example );
	}

	/*保存实验组*/
	@Override
	public void saveExperimentGroup(String studyid) {
		
		InclusionCriteriaExample example = new InclusionCriteriaExample();
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss:SSS");
		Date date = new Date();
		String now = sdf.format(date);
		example.createCriteria().andStudyidEqualTo(studyid);
		List<InclusionCriteria> selectByExample = inclusionCriteriaMapper.selectByExample(example);
		String exp = selectByExample.get(0).getExpression();
		String json = HttpClientUtils.getByPatients(exp);
		JSONObject jsonObject = JSONObject.fromObject(json);
		SubjectGroups sg = new SubjectGroups();
		sg.setGroupid(System.currentTimeMillis()+"");
		sg.setGroupname("实验组");
		sg.setPatientset(exp);
		sg.setGroupnum(jsonObject.get("total").toString());
		sg.setRemark("0");
		sg.setStudyid(studyid);
		sg.setCreatetime(now);
		subjectGroupsMapper.insert(sg);
	}

	@SuppressWarnings("null")
	@Override
	public int deleteStudysById(Map<String, String> map) {
		int i = 0;
		String studyid = map.get("studyid");
		if(studyid != null || !studyid.isEmpty()){
			Studys recordTwo = new Studys();
			recordTwo.setStudyid(studyid);
			recordTwo.setIsdelete("1");
			studysMapper.updateByPrimaryKeySelective(recordTwo);
		}
		return i;
	}

	//保存介入类型、统计方法
	@Override
	public void saveStudysVariableInf(String variablenames,String modelname,String studyid) {
		Studys record = new Studys();
		record.setStudyid(studyid);
		record.setInterventionmodel(variablenames);
		record.setStatisticalmodel(modelname);
		studysMapper.updateByPrimaryKey(record);
	}

	@Override
	public String getDataPreview(Map<String, String> map) {
		if(map.get("groupids") == null || map.get("groupids").isEmpty()){
			return null;
		}
		if(map.get("query") == null || map.get("query").isEmpty()){
			return null;
		}
		if(map.get("studyid") == null || map.get("studyid").isEmpty()){
			return null;
		}
		SubjectGroupsExample example = new SubjectGroupsExample();
		example.createCriteria().andStudyidEqualTo(map.get("studyid"));
		List<SubjectGroups> selectByExample = subjectGroupsMapper.selectByExample(example);
		return null;
	}

	@Override
	public Object savetestModel(String json) {
		String result ="{\"result\":\"202\"}";
		SaveModel m = new SaveModel();
		//将传过来的json 放置Bean
		m = gson.fromJson(json, SaveModel.class);
		System.out.println(gson.toJson(m));
		String modelstr = m.getModelstr();
	
		JSONObject modeljson = JSONObject.fromObject(json);
		modeljson.put("models", modelstr);
		modeljson.remove("modelstr");
		String string = modeljson.toString();
		System.out.println(string);
		m = null;
		//封装成最终的Bean
		m = gson.fromJson(string, SaveModel.class);
		
		//保存暴露因素 介入类型
		Studys s = new Studys();
		s.setStudyid(m.getStudyid());
		s.setInterventionmodel(m.getModelnames());
		s.setStatisticalmodel(m.getVariablenames());
		studysMapper.updateByPrimaryKeySelective(s);
		//获取多个模型信息
		List<Models> models = m.getModels();
		System.out.println(models.size());
		System.out.println(gson.toJson(models));
		for (Models mo : models) {
		System.out.println(mo.getModelid());
			if(Integer.parseInt(mo.getModelid())==10){
				//查看历史记录 有则删除
				ModelIstestResultExample example = new ModelIstestResultExample();
				example.createCriteria().andStudyidEqualTo(m.getStudyid());
				List<ModelIstestResult> selectByExample = modelIstestResultMapper.selectByExample(example);
				if(!selectByExample.isEmpty()){
					modelIstestResultMapper.deleteByExample(example);
				}
				
				List<ModelInf> modelinf = mo.getModelinf();
				for (ModelInf mInf : modelinf) {
					//放组ID
					List<String> ids = new ArrayList<>();
					//放query信息
					List<String> query = new ArrayList<>();
					String str = mInf.getQuery();
					String[] q = str.split("##");
					for (int i = 0; i < q.length; i++) {
						query.add(q[i]);
					}
					
					String groupids = mInf.getGroupids();
					String[] gids = groupids.split(",");
					for (int i = 0; i < gids.length; i++) {
						ids.add(gids[i]);
					}
					//保存传值
				}
			}
			
		}
		return result;
	}

}

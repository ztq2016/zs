package com.clinicalresearch.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.clinicalresearch.utils.DateUtils;
import org.clinicalresearch.utils.DictMessage;
import org.clinicalresearch.utils.HttpClientUtils;
import org.clinicalresearch.utils.StringCodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.clinicalresearch.core.service.AddStudysService;
import com.clinicalresearch.dao.entity.HierarchicalVariableInfo;
import com.clinicalresearch.dao.entity.IndicatorFields;
import com.clinicalresearch.dao.entity.ModelIstestResult;
import com.clinicalresearch.dao.entity.Page;
import com.clinicalresearch.dao.entity.Rtvtrigers;
import com.clinicalresearch.dao.entity.StatisticalModelResultInfo;
import com.clinicalresearch.dao.entity.StudyType;
import com.clinicalresearch.dao.entity.Studys;
import com.clinicalresearch.dao.entity.SubjectGroups;
import com.clinicalresearch.dao.entity.Units;
import com.clinicalresearch.dao.entity.Users;
import com.clinicalresearch.model.SearchFieldResult;
import com.google.gson.Gson;

import net.sf.json.JSONObject;

/**
 * @ClassName: AddStudys
 * @Description: 课题编辑
 * @author A18ccms a18ccms_gmail_com
 * @date 2017年1月6日 上午11:42:26
 * 
 */
@Controller
public class AddStudysController {

	private static final Logger logger = Logger.getLogger(AddStudysController.class);

	private static final Gson gson = new Gson();

	@Autowired
	private AddStudysService addStudysService;
	

	/**
	 * 返回新增课题页面
	 * 
	 * @return
	 */
	@RequestMapping(value = "/addstudy", method = RequestMethod.GET)
	public ModelAndView addStudyView() {

		ModelAndView modelAndView = new ModelAndView();

		List<StudyType> studyType = addStudysService.getStudyType();
		List<Users> users = addStudysService.getAllUsers();

		modelAndView.addObject("studyType", studyType);
		modelAndView.addObject("usersList", users);
		modelAndView.setViewName("addstudy");

		return modelAndView;
	}

	/* 基本信息配置 */
	@RequestMapping(value = "/studyinfoinsert", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
	@ResponseBody
	public Object studyInsert(@RequestBody() Map<String, String> map) throws IOException {
		Studys studys = new Studys();

		// 研究开始日期校验
		if (!map.get("studycompletiondate").equals("") || map.get("studycompletiondate").isEmpty()) {
			studys.setStudystartdate(DateUtils.stringToDate(map.get("studystartdate")));
		}
		// 研究完成日期校验
		if (!map.get("studycompletiondate").equals("") || !map.get("studycompletiondate").isEmpty()) {
			studys.setStudycompletiondate(DateUtils.stringToDate(map.get("studycompletiondate")));
		}

		studys.setUserid(map.get("userid"));
		studys.setStudyobjective(map.get("studyobjective"));
		studys.setStudytype(map.get("studytype"));
		studys.setPrincipalinvestigator(map.get("principalinvestigator"));
		studys.setStudyid(map.get("studyid"));

		// 新增课题信息
		int i = addStudysService.insertStudys(studys);

		if (i > 0) {
			map.put("result", DictMessage.RESULT_SUCCESS);
			map.put("studyid", studys.getStudyid());
			return map;
		}
		return gson.toJson(map);
	}

	/* 研究对象筛选 -- 显示变量列表 */
	@RequestMapping(value = "getVariableList", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
	@ResponseBody
	public Object getVariableList() {
		List<HierarchicalVariableInfo> variablelist = addStudysService.getVariableList();
		return gson.toJson(variablelist);

	}

	/* 研究对象筛选 -- 根据关键字检索 拼音or汉字 */
	@RequestMapping(value = "/searchbyvariablename", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
	@ResponseBody
	public Object searchByVariableName(@RequestBody() Map<String, String> map) {
		List<HierarchicalVariableInfo> searchList = addStudysService.getListByVariableName(map.get("variablename"));
		return gson.toJson(searchList);
	}

	/* 研究对象筛选 -- 值域变量 */
	@RequestMapping(value = "/getfieldbyid", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
	@ResponseBody
	public Object getFieldById(@RequestBody() Map<String, String> map) {
		// 查询总条数
		int count = addStudysService.getFieldCount(map.get("fieldname"), map.get("variableid"));
		String pageSize = map.get("pageSize");
		String index = map.get("index");

		if (pageSize == null || pageSize == "") {
			pageSize = "10";
		}
		if (index == null || index == "") {
			index = "1";
		}
		Page<Object> page = new Page<>(index, count, pageSize);
		List<IndicatorFields> fieldList = addStudysService.getFieldById(map.get("variableid"), map.get("fieldname"),
				page);
		SearchFieldResult rs = new SearchFieldResult();
		rs.setFieldsList(fieldList);
		rs.setPage(page);
		return gson.toJson(rs);
	}

	/* 研究对象筛选 -- 单位变量 */
	@RequestMapping(value = "/getunitsbyid", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
	@ResponseBody
	public Object getUnitsById(@RequestBody() Map<String, String> map) {
		List<Units> unitsList = addStudysService.getUnitsById(map.get("variableid"));
		return gson.toJson(unitsList);
	}

	/* 统计学处理 -- 统计方法 */
	@RequestMapping(value = "/getcounthandle", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
	@ResponseBody
	public Object getCountHandle() {
		List<StatisticalModelResultInfo> countHandle = addStudysService.getCountHandleList();
		return gson.toJson(countHandle);
	}

	/* 统计学处理 -- 获取触发事件 */
	@RequestMapping(value = "gettriggerevent", produces = "application/json;charset=utf-8")
	@ResponseBody
	public Object getTriggerEvent() {
		List<Rtvtrigers> list = addStudysService.getRtvtrigers();
		return gson.toJson(list);
	}

	/* 统计学处理 -- 根据事件获取 相对应的字典 */
	@RequestMapping(value = "getfielddictbyname")
	@ResponseBody
	public Object getFieldDictByName(@RequestBody() Map<String, String> map) {
		List<IndicatorFields> fields = addStudysService.getFieldDictByName(map.get("fieldtableid"), map.get("fieldname"));
		return gson.toJson(fields);
	}
	
	/* 研究对象筛选 -- 调用ES获取统计个数*/
	@RequestMapping(value = "/patientscount", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
	@ResponseBody
	public Object patientscount(){
		String esjson = HttpClientUtils.getByPatientsCount();
		return esjson;
	}
	

	/* 研究对象筛选 -- 调用ES获取初步筛选信息 */
	@SuppressWarnings("unused")
	@RequestMapping(value = "/getbypatients", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
	@ResponseBody
	public Object getByPatients(@RequestBody() Map<String, String> map) {
		String count = map.get("count");
		String str = map.get("query");
		String res = "{\"total\":\"0\"}";
		String page = map.get("page");
		String size = map.get("size");
		if(page == null || size == null){
			page = "0";
			size = "10";
		}
		JSONObject json = JSONObject.fromObject(str);
		json.put("page", page);
		json.put("size", size);
		// 查询数据
		String esjson = "";
		if (str != null) {
			esjson = HttpClientUtils.getByPatients(json.toString());
		}

		// 统计条数
		if (esjson != "{}" && count.equals("1")) {
			JSONObject fromObject = JSONObject.fromObject(esjson);
			Object total = fromObject.get("total");
			if (total != null || total != "") {
				esjson = "{\"total\":\"" + total + "\"}";
			} else {
				esjson = res;
			}
		}
		if(esjson == "{}"){
			esjson = res;
		}
		return esjson;
	}

	/**
	 * 保存筛选出的研究对象
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "savepatients", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
	@ResponseBody
	public Object savePatients(@RequestBody() Map<String, String> map) {
		/*String studyId = map.get("studyid");
		String exp = map.get("query");
		addStudysService.savePatients(studyId, exp);
		System.out.println("yunxingzhong");*/
		String studyid = map.get("studyid");
		String patients = map.get("patients");
		String query = map.get("query");
		addStudysService.savePatients(studyid, query ,patients);
		return "{\"result\":\"200\"}";
	}
	
//	/* 研究对象筛选 -- 调用ES保存研究对象筛选 */ 
//	@RequestMapping(value = "savepatients", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
//	@ResponseBody
//	public Object savePatients(@RequestBody() Map<String, String> map) {
//		String esjson = "";
//		String patients = map.get("patients");
//		String studyid = map.get("studyid");
//		String query = map.get("query");
//		String tota = map.get("total");
//		if (tota == null) {
//			tota = "0";
//		}
//		int total = Integer.parseInt(tota);
//
//		String size = "";
//		String ids = "";
//		String patientids = "";
//		if (query != null && total > 500) {
//			int c = (int) Math.ceil(total / 500d);
//			for (int i = 1; i <= c; i++) {
//				String[] split = query.split("\"page\":");
//				size = "\"page\":" + i + ",\"size\":500,\"resultField\":[\"fieldId\"]}";
//				String str = split[0] + size;
//				esjson = HttpClientUtils.getByPatients(str);
//				JSONArray jsonArray = JSONArray.fromObject("[" + esjson + "]");
//				@SuppressWarnings("rawtypes")
//				Map<String, Class> classMap = new HashMap<String, Class>();
//				classMap.put("hits", EsHits.class);
//				@SuppressWarnings({ "unchecked", "deprecation" })
//				List<EsResult> esResult = (List<EsResult>) JSONArray.toList(jsonArray, EsResult.class, classMap);
//				List<EsHits> hits = esResult.get(0).getHits();
//				for (EsHits e : hits) {
//					ids += ",\"" + e.getFieldId() + "\"";
//				}
//				patientids = ids.substring(1);
//			}
//			addStudysService.savePatients(patients, patientids, studyid);
//		} else if (query != null && total <= 500) {
//			esjson = HttpClientUtils.getByPatients(query);
//			JSONArray jsonArray = JSONArray.fromObject("[" + esjson + "]");
//			@SuppressWarnings("rawtypes")
//			Map<String, Class> classMap = new HashMap<String, Class>();
//			classMap.put("hits", EsHits.class);
//			@SuppressWarnings({ "unchecked", "deprecation" })
//			List<EsResult> esResult = (List<EsResult>) JSONArray.toList(jsonArray, EsResult.class, classMap);
//			List<EsHits> hits = esResult.get(0).getHits();
//			for (EsHits e : hits) {
//				ids += ",\"" + e.getFieldId() + "\"";
//			}
//			patientids = ids.substring(1);
//			addStudysService.savePatients(patients, patientids, studyid);
//		}
//		return "{\"result\":\"200\"}";
//	}
	
	

	/* 研究对象分组 -- 调用ES研究对象筛选信息进行分组 */
	@SuppressWarnings({ "unchecked", "unused" })
	@RequestMapping(value = "getbygroup", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
	@ResponseBody
	public Object getByGroup(@RequestBody Map<String, String> map){
		
		String condition = map.get("groupcondition");
		String savestatus = map.get("savestatus");
		String esjson = "";
		String studyid = map.get("studyid");
		String page = map.get("page");
		String size = map.get("size");
		String str = map.get("query");
		List<SubjectGroups> res = null;
		if(page == null || size == null ){ 
			page = "0";
			size = "10"; 
		}
		if(savestatus != null){
			res = addStudysService.checkGroupcondition(studyid,condition);
		}
		if(savestatus != null && !res.isEmpty()){
			addStudysService.deleteGroupcondition(studyid);
		}
		String json = addStudysService.getByPatients(studyid);
		//String json = inc.get(0).getExpression().toString();
		JSONObject jsonObject = JSONObject.fromObject(json);
		jsonObject.put("page", page);
		jsonObject.put("size", size);
		String[] jsstr = jsonObject.toString().split("],\"page\"");
		Map<Object, String> groupMap = new HashMap<Object, String>();
		String[] groups = str.split("##");
		for (int i = 0; i < groups.length; i++) {
			groupMap.put(i, groups[i]);
		}
		String queryString = "";
		for (int i = 0; i < groupMap.size(); i++) {
			String group = groupMap.get(i);
			String[] subGroups = StringUtils.substringsBetween(group, "<", ">");
			String data = "";
			String groupName = "";
			if (subGroups.length != 0) {
				for (int j = 0; j < subGroups.length; j++) {
					groupName = StringUtils.substringBetween(subGroups[j], "_n", "n_");
					String se = subGroups[j].replace("_n" + groupName + "n_", "");
					String search = jsstr[0] + "," + se + "],\"page\"" + jsstr[1];
					
					if(savestatus != null){
						
						data  = HttpClientUtils.getByPatients(search);
						JSONObject object = JSONObject.fromObject(data);
						
						addStudysService.saveGroups(groupName, condition, search, object.get("total")+"", studyid,j);
						condition = null;
					}else{
						if(savestatus != null){
							logger.info("研究对象分组Es数据查询语句："+search);
							data += "," + "{\"" + groupName + "\":" + HttpClientUtils.getByPatients(search) + "}";
							logger.info("研究对象分组Es数据返回结果："+data);
						}else{
							data += "," + "{\"" + groupName + "\":[" + HttpClientUtils.getByPatients(search) + "," + search + "]}";
						}
					}
					
				}
			}
			if(savestatus == null){
				esjson += ",\"" + StringCodeUtil.changeNumToEnLing(i + "") + "\":[" + data.substring(1) + "]" ;
			}
		}
		if(savestatus ==null){
			esjson = "{" + esjson.substring(1) +"}";
		}else{
			esjson = "";
		}
		//默认保存分组信息--实验组
		if(str == null || str == ""){
			addStudysService.saveExperimentGroup(studyid);
		}
		return esjson;
	}
/*
	 研究对象分组 -- 调用ES保存研究对象分组 
	@RequestMapping(value = "savegroup", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
	@ResponseBody
	public Object saveGroup(@RequestBody() Map<String, String> map){
		String condition = map.get("groupcondition");
		String studyid = map.get("studyid");
		String str = map.get("query");
		String groupName = "";
		String esjson = "";
		String patientids = "";
		String ids = "";
		int j = 0;
		// 获取上一步对象筛选的ID
		PatientBasic pids = addStudysService.getPatienByStudyid(studyid);
		if (pids != null) {
			patientids = pids.getPatientids();
		}
		if (patientids != "" && str != null) {
			// 替换所有的ids
			String query = str.replaceAll("\"_d_\"", patientids);
			String[] conditions = condition.split("##");
			// 拆分 分组信息
			String[] groups = StringUtils.substringsBetween(query, "<", ">");
			for (int i = 0; i < groups.length; i++) {
				// 抽取的组名
				groupName = StringUtils.substringBetween(groups[i], "#|#", "#|#");
				// 新的查询格式
				String search = groups[i].replace("#|#" + groupName + "#|#", "");
				// 拆分表达式查询返回ID
				esjson = HttpClientUtils.getByAllGroup(search).replace("[],", "");
				if(esjson.length() > 50){
					// 遍历集合
					JSONArray jsonArray = JSONArray.fromObject("[" + esjson + "]");
					@SuppressWarnings("rawtypes")
					Map<String, Class> classMap = new HashMap<String, Class>();
					classMap.put("hits", EsHits.class);
					@SuppressWarnings({ "unchecked", "deprecation" })
					List<EsResult> esResult = (List<EsResult>) JSONArray.toList(jsonArray, EsResult.class, classMap);
					@SuppressWarnings("unchecked")
					List<EsHits> hits = (List<EsHits>) esResult.get(0).getHits().get(0);
					for (EsHits e : hits) {
						ids += ",\"" + e.getFieldId() + "\"";
					}
					patientids = ids.substring(1);
					
					// 保存分组信息
					//j = addStudysService.saveGroups(groupName, conditions[i], patientids, esResult.get(0).getTotal(),studyid);
				}
			}
		}

		if (j > 0) {
			esjson = "{\"result\":\"200\"}";
		} else {
			esjson = "{\"result\":\"202\"}";
		}
		return esjson;
	}
	*/
	
	
	/*统计学处理 -- 置信分组信息*/
	@RequestMapping(value = "getconfidence", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
	@ResponseBody
	public Object getConfidence(@RequestBody Map<String, String> map){
		String studyid = map.get("studyid");
		List<SubjectGroups> list = addStudysService.getSubjectGroupsList(studyid);
		return list;
	}
/*	
	统计学处理 -- 调用ES量化处理返回ID
	@RequestMapping(value = "gettimeoffset", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
	@ResponseBody
	public Object getTimeOffset(@RequestBody() Map<String, String> map){
		String studyid = map.get("studyid");
		String str = map.get("query");
		String patientids = "";
		String esjson = "";
		PatientBasic pids = addStudysService.getPatienByStudyid(studyid);
		if (pids != null) {
			patientids = pids.getPatientids();
		} 
		if (patientids != "" && str != null) {
			// 替换所有的ids
			String query = str.replaceAll("[ids]", patientids);
			esjson = HttpClientUtils.gettimeOffset(query);
		}
		return esjson;
	}*/
	
	
    //统计学处理 -- 调用ES数据统计预览
	@RequestMapping(value = "getdatapreview", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
	@ResponseBody
	public Object dataPreview(@RequestBody Map<String, String> map){
		String esjson = "";
		/*String str = "{\"_n实验组n_expressions\":[[{\"field\":\"病历_基本信息_性别\",\"exp\":\"等于\",\"values\":[\"女\"],\"flag\":\"||\",\"unit\":\"\"},{\"field\":\"病历_基本信息_性别\",\"exp\":\"等于\",\"values\":[\"男\"],\"flag\":\"||\",\"unit\":\"\"}]],\"page\":\"1\",\"size\":\"10\"}";
		String con = "[{\"field\":\"症状_现病史_症状\",\"exp\":\"包含\",\"flag\":\"or\",\"unit\":\"\",\"values\":[\"发热\"]}]],\"resultField\":[\"症状_现病史_症状\",\"病历_基本信息_性别\"]";
		String g = str.replaceAll("],\"page\":\"1\",\"size\":\"10\"", ","+con) ;
		String[] groups = g.split("##");
		for (int i = 0; i < groups.length; i++) {
			String[] groupsname = StringUtils.substringsBetween(groups[i], "_n", "n_") ;
			String search = groups[i].replace("_n" + groupsname[i] + "n_", "");
			esjson += ",\"" + groupsname[i] + "\":" + HttpClientUtils.getByStating(search) ;
		}
			esjson = "{" + esjson.substring(1) + "}";*/
		esjson = addStudysService.getDataPreview(map);
		return esjson;
	}
	
	
	/*数据结果展示*/
	@RequestMapping(value = "getresultshow", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
	@ResponseBody
	public Object getresultShow(@RequestBody Map<String, String> map){
		Map<String, Object> resultMap = new HashMap<String,Object>();
		String studyid = map.get("studyid");
		if(studyid != null){
			//根据id查询出相关课题信息
			List<Studys> studysList = addStudysService.getStudysList(studyid);
			//根据id查询出相关入排条件
			String inclu = addStudysService.getInclusionCriteriaList(studyid);
			//根据id查询出相关分组条件
			String groupscondition = addStudysService.getSubjectGroups(studyid);
			//独立样本T检验
			List<ModelIstestResult> modelIstest = addStudysService.getModelIstest(studyid);
			//双变量相关
			
			//配对样本T检验
			
			//两个独立样本检验
			
			//多独立样本检验
			
			//卡方检验
			
			//List<ModelIstestResult> modelIstest = addStudysService.getModelIstest(studyid);
			//List<ModelIstestResult> modelIstest = addStudysService.getModelIstest(studyid);
			//List<ModelIstestResult> modelIstest = addStudysService.getModelIstest(studyid);
			resultMap.put("studysList", studysList);
			resultMap.put("inclu", inclu);
			resultMap.put("groupscondition", groupscondition);
			resultMap.put("modelIstest", modelIstest);
			//resultMap.put("modelPStest", modelPStest);
		}
		return gson.toJson(resultMap);
	}
	
	//查看结果R分析--独立样本T检验
	@RequestMapping(value = "modelistest", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
	@ResponseBody
	public Object independentSampleTTest(@RequestBody Map<String, String> map){
		
		String modelname = map.get("modelname");
		String variablenames = map.get("variablenames");
		String studyid = map.get("studyid");
		String savestatus = map.get("savestatus");
		
		if(savestatus != null){
			addStudysService.saveStudysVariableInf(variablenames,modelname,studyid);
		}
		
		return null;
	}
	
	/**
	 * 生成分组id的数组
	 * @param groupids
	 * @return
	 */
	private List<String> getGroupIdsList(String groupids) {
		
		List<String> groupList = new ArrayList<>();
		if (StringUtils.isEmpty(groupids)) {
			return groupList;
		}
		String[] gids = groupids.split(",");
		for (String groupId : gids) {
			groupList.add(groupId);
		}
		return groupList;
	}

	/**
	 * 获取字符串查询列表
	 * @param queryExpress
	 * @return
	 */
	private List<String> getQueryStringsList(String queryExpress) {
		
		List<String> querys = new ArrayList<>();
		if (StringUtils.isEmpty(queryExpress)) {
			return querys;
		}
		
		String[] queryArr = queryExpress.split("##");
		for (String oneVariableExpress : queryArr) {
			querys.add(oneVariableExpress);
		}
		return querys;
	}

	//配对样本T检验
	@RequestMapping(value = "modelpstest", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
	@ResponseBody
	public Object pairSampleTTest(@RequestBody Map<String, String>map){
		String groupids = map.get("groupids");
		String str = map.get("query");
		//String savestatus = map.get("savestatus");
		List<String> query = new ArrayList<>();
		String[] q = str.split("##");
		for (int i = 0; i < q.length; i++) {
			query.add(q[i]);
		}
		List<String> ids = new ArrayList<>();
		String[] gids = groupids.split(",");
		for (int i = 0; i < gids.length; i++) {
			ids.add(gids[i]);
		}
		
		return null;
		
	}
	
	//双变量相关
	@RequestMapping(value = "modelcorcoetest", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
	@ResponseBody
	public Object correlationCoefficient(){
		return gson.toJson(null);
	}
	//问题挖掘
	@RequestMapping(value = "exploration", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
	public String getExploration(){
		return "/exploration";
	}
	
	//删除课题
	@RequestMapping(value = "deletestudys", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
	@ResponseBody
	public Object deleteStudys(@RequestBody Map<String, String> map){
		int i = addStudysService.deleteStudysById(map);
		if(i>0){
			map.put("result", DictMessage.RESULT_SUCCESS);
		}else{
			map.put("result", DictMessage.RESULT_FAIL);
		}
		return gson.toJson(map);
	}
	
	//保存模型信息
	@RequestMapping(value = "savetestmodel" ,method = RequestMethod.POST , produces = "application/json;charset=utf-8" )
	@ResponseBody
	public Object saveTestModel(@RequestBody String str){
		JSONObject fromObject = JSONObject.fromObject(str);
		String json = fromObject.toString();
		return addStudysService.savetestModel(json);
		
	}
	//描述性统计
		@RequestMapping(value = "descriptivestatistics" ,method = RequestMethod.POST , produces = "application/json;charset=utf-8" )
		@ResponseBody
		public Object descriptiveStatistics(@RequestBody String str){
			String esjson = "";
			JSONObject fromObject = JSONObject.fromObject(str);
			String json = fromObject.toString();
			json  = "{\"expressions\":[[{\"field\":\"症状_现病史_症状\",\"exp\":\"包含\",\"flag\":\"or\",\"unit\":\"\",\"values\":[\"发热\"]}]],\"resultField\":[\"病历_基本信息_性别\",\"病历_基本信息_年龄\",\"用药_医嘱用药_药品名称\",\"诊断_诊断_出院诊断\",\"检查_检查_检查项目\",\"病历_主诉_症状\"]}";
			esjson = HttpClientUtils.getByStating(json);
			return esjson;
			
		}
}

package com.clinicalresearch.core.serviceImpl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.CharUtils;
import org.apache.log4j.Logger;
import org.clinicalresearch.utils.CharUtil;
import org.clinicalresearch.utils.DateUtils;
import org.clinicalresearch.utils.HttpClientUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clinicalresearch.core.bean.CreateExportPlan;
import com.clinicalresearch.core.bean.ExportFile;
import com.clinicalresearch.core.bean.ExportPlanBean;
import com.clinicalresearch.core.bean.ExportPlanSelectVariable;
import com.clinicalresearch.core.bean.ExportPlanView;
import com.clinicalresearch.core.bean.ExportVariable;
import com.clinicalresearch.core.bean.FileMessage;
import com.clinicalresearch.core.bean.VariableTree;
import com.clinicalresearch.core.service.DataExportService;
import com.clinicalresearch.core.thread.ExportThread;
import com.clinicalresearch.dao.entity.ExportFileMeta;
import com.clinicalresearch.dao.entity.ExportFileMetaExample;
import com.clinicalresearch.dao.entity.ExportPlan;
import com.clinicalresearch.dao.entity.ExportPlanExample;
import com.clinicalresearch.dao.entity.ExportPlanVariables;
import com.clinicalresearch.dao.entity.ExportPlanVariablesExample;
import com.clinicalresearch.dao.entity.HierarchicalVariable;
import com.clinicalresearch.dao.entity.HierarchicalVariableExample;
import com.clinicalresearch.dao.entity.HierarchicalVariableExample.Criteria;
import com.clinicalresearch.dao.entity.SystemConf;
import com.clinicalresearch.dao.entity.SystemConfExample;
import com.clinicalresearch.dao.manager.ExportFileMetaMapper;
import com.clinicalresearch.dao.manager.ExportPlanMapper;
import com.clinicalresearch.dao.manager.ExportPlanVariablesExtendsMapper;
import com.clinicalresearch.dao.manager.ExportPlanVariablesMapper;
import com.clinicalresearch.dao.manager.HierarchicalVariableMapper;
import com.clinicalresearch.dao.manager.SystemConfMapper;
import com.google.gson.Gson;

@Service
public class DataExportServiceImpl implements DataExportService {

	private static final Gson gson = new Gson();
	
	private static final Logger logger = Logger.getLogger(DataExportServiceImpl.class);
	
	@Autowired
	private HierarchicalVariableMapper hierarchicalVariableMapper;
	
	@Autowired
	private ExportPlanMapper exportPlanMapper;
	
	@Autowired
	private ExportPlanVariablesMapper exportPlanVariablesMapper;
	
	@Autowired
	private ExportPlanVariablesExtendsMapper exportPlanVariablesExtendsMapper;
	
	@Autowired
	private SystemConfMapper systemCnfMapper;
	
	@Autowired
	private ExportFileMetaMapper exportFileMetaMapper;
	
	@Override
	public ExportPlanBean getExportPlanByUserId(String userId,Integer expId) {
		logger.info("this is getAllExportVariablesByUserId ...");
		
		ExportPlanBean result = new ExportPlanBean();
		
		/*当前导出方案*/
		if (expId != null) {
			ExportPlan selectByPrimaryKey = exportPlanMapper.selectByPrimaryKey(expId);
			ExportPlanView exportPlanView = getExportPlanBeanConvert(selectByPrimaryKey);
			result.setExportPlanView(exportPlanView);
		}
		
		/*查询当前用户的所有的导出方案*/
		ExportPlanExample exportPlaneExample = new ExportPlanExample();
		exportPlaneExample.createCriteria().andUserIdEqualTo(userId);
		exportPlaneExample.setOrderByClause("exp_create_time desc");
		List<ExportPlan> exportPlans = exportPlanMapper.selectByExample(exportPlaneExample);
		if (exportPlans != null) {
			for (ExportPlan ePlan:exportPlans) {
				ExportPlanView exportPlanView = new ExportPlanView();
				exportPlanView.setExpId(ePlan.getExpId());
				exportPlanView.setExpName(ePlan.getExpName());
				exportPlanView.setExpType(ePlan.getExpType());
				result.setExportPlanViews(exportPlanView);
			}
		}
		
		List<ExportPlanSelectVariable> allVarilabesByExpId = getAllVarilabesByExpId(expId);
		List<VariableTree> variableTrees = getVariableTrees(null, allVarilabesByExpId);
		result.setVariableTrees(variableTrees);
		result.setExportPlanSelectVariables(allVarilabesByExpId);
		return result;
	}
	
	/**
	 * bean转换
	 * @param exportPlan
	 * @return
	 */
	private ExportPlanView getExportPlanBeanConvert(ExportPlan exportPlan) {
		ExportPlanView exportPlanView = new ExportPlanView();
		exportPlanView.setExpId(exportPlan.getExpId());
		exportPlanView.setExpName(exportPlan.getExpName());
		exportPlanView.setExpType(exportPlan.getExpType());
		return exportPlanView;
	}

	/**
	 * 从数据库表对应bean转换为树形结构的bean
	 * @param h 数据库表对应的bean
	 * @return
	 */
	private VariableTree fromHieraVariableToVariableTree(VariableTree vTree,HierarchicalVariable h) {
		if (h == null) {
			return vTree;
		}
		if (vTree == null) {
			vTree = new VariableTree();
		} 
		vTree.setFatherId(h.getFatherid());
		vTree.setNow(h.getNow());
		vTree.setSource(h.getSource());
		vTree.setId(h.getVariableid());
		vTree.setVariableLevel(h.getVariableLevel());
		vTree.setText(h.getVariablename());
		vTree.setVariableOrder(h.getVariableOrder());
		vTree.setVariableType(h.getVariabletype());
		vTree.setVpyCode(h.getVpycode());
		if (h.getVariableLevel() == 3) {
			vTree.setIcon(false);
		} else {
			vTree.setIcon(true);
		}
		
		List<VariableTree> children = vTree.getChildren();
		if (children != null && !children.isEmpty()) {
			for (VariableTree variableTree:children) {
				boolean selected = variableTree.isSelected();
				if (selected) {
					vTree.setSelected(true);
					break;
				}
			}
		}
		return vTree;
	}
	
	@Override
	public ExportPlanBean queryByKeyWord(String keyWord,Integer expId) {
		logger.debug("queryByKeyWord ...");
		ExportPlanBean resultBean = new ExportPlanBean();
		
		List<ExportPlanSelectVariable> allVarilabesByExpId = getAllVarilabesByExpId(expId);
		List<VariableTree> variableTrees = getVariableTrees(keyWord, allVarilabesByExpId);
		resultBean.setVariableTrees(variableTrees);
		return resultBean;
	}
	
	/**
	 * 根据导出计划的id查询对应的变量
	 * @param expId
	 * @return
	 */
	private List<ExportPlanSelectVariable> getAllVarilabesByExpId(Integer expId) {
		List<ExportPlanSelectVariable> exportPlanSelectVariables = new ArrayList<>();
		if (expId == null) {
			return exportPlanSelectVariables;
		}
		ExportPlanVariablesExample example = new ExportPlanVariablesExample();
		example.createCriteria().andExpIdEqualTo(expId);
		List<ExportPlanVariables> selectByExample = exportPlanVariablesMapper.selectByExample(example);
		if (selectByExample != null) {
			for (ExportPlanVariables exportPlanVariable:selectByExample) {
				ExportPlanSelectVariable exportPlanSelectVariable = new ExportPlanSelectVariable();
				exportPlanSelectVariable.setLinkId(exportPlanVariable.getLinkId());
				exportPlanSelectVariable.setVariableId(exportPlanVariable.getVariableId());
				exportPlanSelectVariable.setVariableName(exportPlanVariable.getVariableName());
				exportPlanSelectVariable.setVarialbeOtherName(exportPlanVariable.getVariableOtherName());
				exportPlanSelectVariable.setVariableFullName(exportPlanVariable.getVariableFullName());
				exportPlanSelectVariables.add(exportPlanSelectVariable);
			}
		}
		return exportPlanSelectVariables;
	}
	
	/**
	 * 根据关键字和已经选择的变量列表查询树
	 * 当关键字为空时，查询所有的树
	 * 当有查询变量列表时，会对查询出的结果进行标记
	 * @param keyWord
	 * @param selectedList
	 * @return
	 */
	private List<VariableTree> getVariableTrees(String keyWord, List<ExportPlanSelectVariable> selectedList)	{
		
		List<VariableTree> resultlist = new ArrayList<>();
		
		/*基本查询语句拼接*/
		HierarchicalVariableExample example = new HierarchicalVariableExample();
		Criteria criteria = example.createCriteria().andVariableLevelEqualTo(3);
		
		/*关键词为空查询所有三级目录，不为空查询关键词*/
		if (keyWord != null) {
			boolean chineseChar = CharUtil.isChineseChar(keyWord);
			if (chineseChar) {
				criteria.andVariablenameLike("%" + keyWord + "%");
			} else {
				criteria.andVpycodeLike("%" + keyWord.toUpperCase() + "%");
			}
		}
		
		example.setOrderByClause("fatherid,variable_order asc");
		List<HierarchicalVariable> level3 = hierarchicalVariableMapper.selectByExample(example);
		
		/*三级目录为空返回一个空集合*/
		if (level3 == null || level3.isEmpty()) {
			return resultlist;
		}
		
		/*将已经选中的目录做处理*/
		Map<String,ExportPlanSelectVariable> selectedMap = new LinkedHashMap<>();
		if (selectedList != null && !selectedList.isEmpty()) {
			for (ExportPlanSelectVariable ev:selectedList) {
				selectedMap.put(ev.getVariableId(), ev);
			}
		}
		
		/*三级目录处理成二级目录的集合*/
		Map<String, VariableTree>  level2 = new LinkedHashMap<>();
		for (HierarchicalVariable h:level3) {
			VariableTree vTree = fromHieraVariableToVariableTree(null, h);
			String fatherid = h.getFatherid();
			VariableTree variableTree = level2.get(fatherid);
			if (variableTree == null) {
				variableTree = new VariableTree();
				variableTree.setId(fatherid);
				level2.put(fatherid, variableTree);
			}
			
			ExportPlanSelectVariable exportPlanSelectVariable = selectedMap.get(h.getVariableid());
			if (exportPlanSelectVariable != null) {
				vTree.setSelected(true);
			}
			variableTree.setChild(vTree);
		}
		
		
		/*二级目录查询并拼接成1级*/
		/*查询二级目录基本语句拼接*/
		Set<String> keySet = level2.keySet();
		List<String> list = new ArrayList<>(keySet);
		HierarchicalVariableExample exampleLevel2 = new HierarchicalVariableExample();
		exampleLevel2.createCriteria().andVariableLevelEqualTo(2).andVariableidIn(list);
		exampleLevel2.setOrderByClause("variable_order asc");
		List<HierarchicalVariable> selectByExample2 = hierarchicalVariableMapper.selectByExample(exampleLevel2);
		
		/*二级目录拼接为一级目录*/
		Map<String, VariableTree> level1 = new LinkedHashMap<>();
		for (HierarchicalVariable h:selectByExample2) {
			VariableTree variableTree = level2.get(h.getVariableid());
			variableTree = fromHieraVariableToVariableTree(variableTree,h);
			String fatherId = variableTree.getFatherId();
			VariableTree fatherVariableTree = level1.get(fatherId);
			if (fatherVariableTree == null) {
				fatherVariableTree = new VariableTree();
				fatherVariableTree.setId(fatherId);
				level1.put(fatherId, fatherVariableTree);
			}
			fatherVariableTree.setChild(variableTree);
		}
		
		
		/*查询一级目录*/
		Set<String> keySet2 = level1.keySet();
		List<String> levelOneIdList = new ArrayList<>(keySet2);
		HierarchicalVariableExample exampleLevel1 = new HierarchicalVariableExample();
		exampleLevel1.createCriteria().andVariableLevelEqualTo(1).andVariableidIn(levelOneIdList);
		exampleLevel1.setOrderByClause("variable_order asc");
		List<HierarchicalVariable> levelOneList = hierarchicalVariableMapper.selectByExample(exampleLevel1);
		
		/*一级目录封装到结果集中*/
		for (HierarchicalVariable h:levelOneList) {
			VariableTree variableTree = level1.get(h.getVariableid());
			variableTree = fromHieraVariableToVariableTree(variableTree, h);
			resultlist.add(variableTree);
		}
		
		/*目录中二级与一级一致的目录去掉二级目录*/
		for (VariableTree vTree:resultlist) {
			List<VariableTree> children = vTree.getChildren();
			if (children != null && children.size() ==1) {
				List<VariableTree> subTree = children.get(0).getChildren();
				vTree.setChildren(subTree);
			}
		}
		
		return resultlist;
	}
	
	@Transactional
	@Override
	public boolean createExportPlan(CreateExportPlan exportPlan) {
		String userId = exportPlan.getUserId();
		if (exportPlan == null || userId == null) {
			return false;
		}
		
		/*插入数据导出方案*/
		ExportPlan recode = new ExportPlan();
		recode.setExpName(exportPlan.getPlanName());
		recode.setExpType(exportPlan.getExportType());
		recode.setUserId(userId);
		exportPlanMapper.insert(recode);
		Integer expId = recode.getExpId();
		/*插入方案中的变量*/
		List<ExportVariable> variableList = exportPlan.getVariableList();
		if (variableList != null && !variableList.isEmpty()) {
			List<ExportPlanVariables> list = new ArrayList<>();
			for (ExportVariable exportVariable:variableList) {
				ExportPlanVariables exportPlanVariables = new ExportPlanVariables();
				exportPlanVariables.setExpId(expId);
				exportPlanVariables.setVariableId(exportVariable.getVariableId());
				exportPlanVariables.setVariableName(exportVariable.getVariableName());
				exportPlanVariables.setVariableOtherName(exportVariable.getVariableOtherName());
				list.add(exportPlanVariables);
			}
			exportPlanVariablesExtendsMapper.insertBatch(list);
		}
		return true;
	}

	@Override
	public boolean deleteExportPlan(Integer expId) {
		ExportPlanVariablesExample example = new ExportPlanVariablesExample();
		example.createCriteria().andExpIdEqualTo(expId);
		exportPlanVariablesMapper.deleteByExample(example);
		int deleteByPrimaryKey = exportPlanMapper.deleteByPrimaryKey(expId);
		if (deleteByPrimaryKey > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	
	

	@Override
	public void wirteFile(String userId, String exp, String type) {
		logger.debug("wirteFile...");
		
		/*不同操作系统的文件创建路径*/
		String filePath = null; //存储文件的父目录位置
		String property = System.getProperty("os.name").toLowerCase();
		int indexOf = property.indexOf("windows");
		if (indexOf == 0) {
			/*此处为win系统*/
			String userHome = System.getProperty("user.home");
			filePath = userHome + "\\Desktop\\downFile\\";
			createParentFile(filePath);
		} else {
			/*此处为Linux系统处理*/
			SystemConfExample example = new SystemConfExample();
			example.createCriteria().andSysconfNameEqualTo("file_path");
			List<SystemConf> pathList = systemCnfMapper.selectByExample(example);
			if (pathList != null && !pathList.isEmpty()) {
				filePath = pathList.get(0).getSysconfValue();
				createParentFile(filePath);
			}
		}
		
		/*创建一个不存在的文件与文件名*/
		String fileName = getFileName(filePath, userId, type);
		
		/*将文件实例信息插入表中*/
		ExportFileMeta record = new ExportFileMeta();
		record.setFileExp(exp);
		String replace = fileName.replace(filePath, "");
		record.setFileName(replace);
		record.setFilePath(fileName);
		record.setUserId(userId);
		record.setFileStartTime(new Date());
		record.setFileProcessPer("0");
		record.setFileStatus("0");
		exportFileMetaMapper.insert(record);
		
		File file = new File(fileName);
		try {
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(exp);
			bufferedWriter.flush();
			bufferedWriter.close();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
//		/*调用新的线程*/
//		Integer fileId = record.getFileId();
//		ExportThread exportThread = new ExportThread();
//		exportThread.setExp(exp);
//		exportThread.setFilePath(fileName);
//		exportThread.setFileId(fileId);
//		exportThread.setExportFileMetaMapper(exportFileMetaMapper);
//		exportThread.start();
		
	}
	
	/**
	 * 获取一个不存在的文件名称
	 * @param filePath
	 * @param userId
	 * @param type
	 * @return
	 */
	public static String getFileName(String filePath, String userId, String type) {
		String fileName = filePath + "bcrp-" + userId + "-" + DateUtils.format(new Date(), "YYYY-MM-dd_HH-mm-ss-SSS.") + type;
		File file = new File(fileName);
		boolean exists = file.exists();
		if (exists) {
			fileName = getFileName(filePath, userId, type);	
		} else {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return fileName;
		}
		return fileName;
	}
	
	/**
	 * 根据路径判断文件是否存在，如果不存在则创建
	 * @param filePath
	 */
	private void createParentFile(String filePath) {
		File file = new File(filePath);
		boolean exists = file.exists();
		if (exists) {
			boolean directory = file.isDirectory();
			if (directory) {
				file.mkdir();
			}
		} else {
			file.mkdir();
		}
	}


	@Override
	public void createExportPlan(String name, String type, String userId, List<ExportVariable> variables) {
		CreateExportPlan exportPlan = new CreateExportPlan();
		exportPlan.setExportType(type);
		exportPlan.setPlanName(name);
		exportPlan.setUserId(userId);
		exportPlan.setVariableList(variables);
		createExportPlan(exportPlan);
		
	}

	@Override
	public List<ExportFile> queryExportFileList(String userId) {
		List<ExportFile> result = new ArrayList<>();
		ExportFileMetaExample example = new ExportFileMetaExample();
		example.createCriteria().andUserIdEqualTo(userId);
		example.setOrderByClause("file_end_time desc");
		List<ExportFileMeta> selectByExample = exportFileMetaMapper.selectByExample(example);
		if (selectByExample != null) {
			for (ExportFileMeta exportFileMeta:selectByExample) {
				ExportFile exportFile = new ExportFile();
				if (exportFileMeta.getFileStatus().equals("4")) {
					exportFile.setEnd(true);
					Date fileEndTime = exportFileMeta.getFileEndTime();
					exportFile.setTime(DateUtils.date2Str(fileEndTime, "yyyy-MM-dd"));
				}
				exportFile.setExportName(exportFileMeta.getFileName());
				exportFile.setFileId(exportFileMeta.getFileId());
				exportFile.setPer(exportFileMeta.getFileProcessPer());
				result.add(exportFile);
			}
		}
		return result;
	}

	@Override
	public FileMessage getFilePathByFileId(Integer fileId) {
		FileMessage fileMessage = new FileMessage();
		ExportFileMeta selectByPrimaryKey = exportFileMetaMapper.selectByPrimaryKey(fileId);
		if (selectByPrimaryKey != null) {
			fileMessage.setFileName(selectByPrimaryKey.getFileName());
			fileMessage.setFilePath(selectByPrimaryKey.getFilePath());
		}
		return fileMessage;
	}

	
	
	
}

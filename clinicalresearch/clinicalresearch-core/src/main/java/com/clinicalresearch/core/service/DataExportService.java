package com.clinicalresearch.core.service;



import java.util.List;

import com.clinicalresearch.core.bean.CreateExportPlan;
import com.clinicalresearch.core.bean.ExportFile;
import com.clinicalresearch.core.bean.ExportPlanBean;
import com.clinicalresearch.core.bean.ExportVariable;
import com.clinicalresearch.core.bean.FileMessage;

/**
 * 数据导出的服务
 * @author ztq_2016
 *
 */
public interface DataExportService {
	
	/**
	 * 根据用户和导出方案的id查询
	 * @param userId 必须有
	 * @param expId expid为空的时候，只查询导出方案的目录
	 * @return
	 */
	ExportPlanBean getExportPlanByUserId(String userId,Integer expId);
	
	/**
	 * 根据关键字查询目录树
	 * @param keyWord 导出关键字
	 * @param expid 当前选择的导出计划
	 * @return
	 */
	ExportPlanBean queryByKeyWord(String keyWord,Integer expid);
	
	/**
	 * 插入导出方案数据
	 * @param exportPlan
	 * @return
	 */
	boolean createExportPlan(CreateExportPlan exportPlan);
	
	/**
	 * 删除导出方案id
	 * @param expId
	 * @return
	 */
	boolean deleteExportPlan(Integer expId);
	
	/**
	 * 根据文件名称和表达式写出文件
	 * @param fileName
	 * @param exp
	 */
	void wirteFile(String userId, String exp ,String type);
	
	/**
	 * 创建导出计划
	 * @param name
	 * @param type
	 * @param userId
	 * @param variables
	 */
	void createExportPlan(String name, String type, String userId, List<ExportVariable> variables);
	
	/**
	 * 查询用户导出文件列表
	 * @param userId
	 * @return
	 */
	List<ExportFile> queryExportFileList(String userId);
	
	/**
	 * 根究文件id获取文件的信息
	 * @param fileId
	 * @return
	 */
	FileMessage getFilePathByFileId(Integer fileId);
}

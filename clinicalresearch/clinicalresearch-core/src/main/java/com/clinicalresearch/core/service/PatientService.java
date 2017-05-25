package com.clinicalresearch.core.service;

import java.util.List;

import com.clinicalresearch.core.bean.PatientInfo;
import com.clinicalresearch.dao.entity.PatientSet;

/**
 * patient数据的查询与抽取
 * @author ztq_2016
 *
 */

public interface PatientService {
	

	/**
	 * 根据变量列表和组id将数据封装成病人信息列表
	 * @param studyId 研究id
	 * @param itemList 变量列表
	 * @param groupList 组id
	 * @return
	 */
	List<PatientInfo> getPatientBeanList(String studyId, List<String> itemList, List<String> groupList);
	
	
}

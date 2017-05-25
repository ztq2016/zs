package com.clinicalresearch.core.service;

import java.util.List;
import java.util.Map;

import com.clinicalresearch.dao.entity.EsResult;
import com.clinicalresearch.dao.entity.HierarchicalVariableInfo;
import com.clinicalresearch.dao.entity.InclusionCriteria;
import com.clinicalresearch.dao.entity.IndicatorFields;
import com.clinicalresearch.dao.entity.ModelIstestResult;
import com.clinicalresearch.dao.entity.Page;
import com.clinicalresearch.dao.entity.PatientBasic;
import com.clinicalresearch.dao.entity.Rtvtrigers;
import com.clinicalresearch.dao.entity.StatisticalModelResultInfo;
import com.clinicalresearch.dao.entity.StudyType;
import com.clinicalresearch.dao.entity.Studys;
import com.clinicalresearch.dao.entity.SubjectGroups;
import com.clinicalresearch.dao.entity.Units;
import com.clinicalresearch.dao.entity.Users;

public interface AddStudysService {

	List<StudyType> getStudyType();

	List<Users> getAllUsers();

	int insertStudys(Studys studys);

	List<HierarchicalVariableInfo> getListByVariableName(String variablename);

	List<Units> getUnitsById(String variableid);

	List<IndicatorFields> getFieldById(String variableid, String fieldname, Page page);

	int getFieldCount(String fieldname, String variableid);

	List<StatisticalModelResultInfo> getCountHandleList();

	List<Rtvtrigers> getRtvtrigers();

	List<IndicatorFields> getFieldDictByName(String fieldtableid, String fieldname);

	List<PatientBasic> getPaientBasicList(String studyid);

	List<HierarchicalVariableInfo> getVariableList();

	PatientBasic getPatienByStudyid(String studyid);

	List<SubjectGroups> getSubjectGroupsList(String studyid);
	/**
	 * 根据studyid与表达式对对象进行保存
	 * @param studyId
	 * @param exp
	 */
	void savePatients(String studyId,String exp);

	List<SubjectGroups> getPatientSetById(String groupid);

	List<Studys> getStudysList(String studyid);

	void savePatients(String studyid, String query, String patients);

	String getByPatients(String studyid);

	void saveGroups(String groupName, String conditions, String patients, String groupnum, String studyid, int j);

	String getSubjectGroups(String studyid);

	String getInclusionCriteriaList(String studyid);

	List checkGroupcondition(String studyid, String condition);

	void deleteGroupcondition(String studyid);

	List<ModelIstestResult> getModelIstest(String studyid);

	void saveExperimentGroup(String studyid);

	int deleteStudysById(Map<String, String> map);

	void saveStudysVariableInf(String variablenames, String modelname, String studyid);

	String getDataPreview(Map<String, String> map);

	Object savetestModel(String json);

}

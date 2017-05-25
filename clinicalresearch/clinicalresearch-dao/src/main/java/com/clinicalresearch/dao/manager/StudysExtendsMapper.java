package com.clinicalresearch.dao.manager;

import com.clinicalresearch.dao.entity.HierarchicalVariableInfo;
import com.clinicalresearch.dao.entity.InclusionCriteria;
import com.clinicalresearch.dao.entity.IndicatorFields;
import com.clinicalresearch.dao.entity.PatientBasic;
import com.clinicalresearch.dao.entity.StatisticalModel;
import com.clinicalresearch.dao.entity.StatisticalModelResultInfo;
import com.clinicalresearch.dao.entity.Studys;
import com.clinicalresearch.dao.entity.StudysInf;
import com.clinicalresearch.dao.entity.SubjectGroups;
import com.clinicalresearch.dao.entity.TempDataInfo;
import com.clinicalresearch.dao.entity.Units;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface StudysExtendsMapper {

	int getStatusByIdCount(StudysInf studys);

	List<StudysInf> selectStudysList(StudysInf studys, @Param("index")int currentPage, @Param("pageSize")int pageSize);

	String getMaxStudyId();

	List<HierarchicalVariableInfo> getListByFatherid(String fatherid);

	List<HierarchicalVariableInfo> getFatherListById(String fatherid);

	List<Units> getUnitsById(@Param("variableid")String variableid);

	List<HierarchicalVariableInfo> getListByVariableName(@Param("variablename")String variablename);

	HierarchicalVariableInfo getFatherById(@Param("fatherid")String fatherid);

	List<IndicatorFields> getFieldById(@Param("variableid")String variableid, @Param("fieldname")String fieldname, @Param("queryname")String queryname, @Param("index")int startRecord, @Param("pageSize")int pageSize);

	List<HierarchicalVariableInfo> getListByPY(@Param("variablename")String variablename);

	int getFieldCount(@Param("queryname")String queryname, @Param("fieldname")String fieldname, @Param("variableid")String variableid);

	List<StatisticalModelResultInfo> getStatisticalModelById(@Param("fatherid")String fatherid);

	List<TempDataInfo> getDatabyFormula(@Param("index")int startRecord, @Param("pageSize")int pageSize);

	List<IndicatorFields> getFieldDictByName(@Param("fielddesc")String fielddesc, @Param("queryname")String queryname, @Param("fieldname")String fieldname);

	//int savePatients(@Param("studyid")String studyid, @Param("patientid")String patientid, @Param("age")String age, @Param("gender")String gender, @Param("disease")String disease, @Param("visitnum")String visitNum);

	List<PatientBasic> getPaientBasicList(@Param("studyid")String studyid);

	InclusionCriteria getInclusionCriteriaById(@Param("studyid")String studyid);

	String getMaxCriteriaId();

	void deletePatientsById(@Param("studyid")String studyid);

	void savePatients(@Param("patientid")String replace, @Param("patientids")String patientids, @Param("studyid")String studyid);

	PatientBasic getPatienByStudyid(@Param("studyid")String studyid);

	String getMaxGroupId();

	String getByPatients(@Param("studyid")String studyid);

	String getInclusionCriteriaList(@Param("studyid")String studyid);

	String getSubjectGroups(@Param("studyid")String studyid);

	List<Studys> getStudysList(@Param("studyid")String studyid);

	List checkGroupcondition(@Param("studyid")String studyid, @Param("condition")String condition);

	void deleteGroupcondition(@Param("studyid")String studyid);

	String getInclusionExp(@Param("studyid")String studyid);

	void updateStatusById(@Param("studyid")String studyid, @Param("state")String state);

}
package com.clinicalresearch.dao.entity;

public class StudysInf {
	//课题id
	private String studyId;
	//研究目的
	private String studyObjective;
	//研究时间
	private String timesTamp;
	//研究类型 
	private String typeName;
	//统计模型名称
	private String modelName;
	//统计模型描述
	private String modelBrief;
	//分组名称
	private String groupName;
	//分组条件
	private String groupCondition;
	//分组集合
	private String patientSet;
	//研究状态
	private String studyStatus;
	//锁定状态
	private String lockStatus;
	//用户id
	private String userId;
	//当前页
	private String current;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCurrent() {
		return current;
	}
	public void setCurrent(String current) {
		this.current = current;
	}
	public String getPatientSet() {
		return patientSet;
	}
	public void setPatientSet(String patientSet) {
		this.patientSet = patientSet;
	}
	public String getLockStatus() {
		return lockStatus;
	}
	public void setLockStatus(String lockStatus) {
		this.lockStatus = lockStatus;
	}
	public String getStudyId() {
		return studyId;
	}
	public void setStudyId(String studyId) {
		this.studyId = studyId;
	}
	public String getStudyObjective() {
		return studyObjective;
	}
	public void setStudyObjective(String studyObjective) {
		this.studyObjective = studyObjective;
	}
	public String getTimesTamp() {
		return timesTamp;
	}
	public void setTimesTamp(String timesTamp) {
		this.timesTamp = timesTamp;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getModelBrief() {
		return modelBrief;
	}
	public void setModelBrief(String modelBrief) {
		this.modelBrief = modelBrief;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getGroupCondition() {
		return groupCondition;
	}
	public void setGroupCondition(String groupCondition) {
		this.groupCondition = groupCondition;
	}
	public String getPatienTset() {
		return patientSet;
	}
	public void setPatienTset(String patienTset) {
		this.patientSet = patienTset;
	}
	public String getStudyStatus() {
		return studyStatus;
	}
	public void setStudyStatus(String studyStatus) {
		this.studyStatus = studyStatus;
	}
	
	
}

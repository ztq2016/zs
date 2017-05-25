package com.clinicalresearch.core.bean;

import java.util.List;

import com.clinicalresearch.dao.entity.InclusionCriteria;
import com.clinicalresearch.dao.entity.StatisticalModel;
import com.clinicalresearch.dao.entity.StatisticalResult;
import com.clinicalresearch.dao.entity.StudyType;
import com.clinicalresearch.dao.entity.SubjectGroups;
import com.clinicalresearch.dao.entity.Users;

public class StudyInfo {
	
	private String studyId;
	
	private String startTime;
	//目的
	private String studyObjective;
	
	private StudyType studyType;
	//项目PI
	private String pi;
	
	private Users userInfo;
	//项目进度
	private String schedule;
	//分组信息
	private List<SubjectGroups> groupInfo;
	//入排标准
	private List<InclusionCriteria> inclusionCriteria;
	//统计方法
	private List<StatisticalModel> statisticalModel;
	//研究结果
	private List<StatisticalResult> results;
	
	private String userId;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getStudyId() {
		return studyId;
	}
	public void setStudyId(String studyId) {
		this.studyId = studyId;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getStudyObjective() {
		return studyObjective;
	}
	public void setStudyObjective(String studyObjective) {
		this.studyObjective = studyObjective;
	}
	
	public StudyType getStudyType() {
		return studyType;
	}
	public void setStudyType(StudyType studyType) {
		this.studyType = studyType;
	}
	public String getPi() {
		return pi;
	}
	public void setPi(String pi) {
		this.pi = pi;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	
	public List<SubjectGroups> getGroupInfo() {
		return groupInfo;
	}
	public void setGroupInfo(List<SubjectGroups> groupInfo) {
		this.groupInfo = groupInfo;
	}
	
	public List<InclusionCriteria> getInclusionCriteria() {
		return inclusionCriteria;
	}
	public void setInclusionCriteria(List<InclusionCriteria> inclusionCriteria) {
		this.inclusionCriteria = inclusionCriteria;
	}
	
	public List<StatisticalModel> getStatisticalModel() {
		return statisticalModel;
	}
	public void setStatisticalModel(List<StatisticalModel> statisticalModel) {
		this.statisticalModel = statisticalModel;
	}
	public List<StatisticalResult> getResults() {
		return results;
	}
	public void setResults(List<StatisticalResult> results) {
		this.results = results;
	}
	public Users getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(Users userInfo) {
		this.userInfo = userInfo;
	}
	
}

package com.clinicalresearch.core.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * 新增导出方案
 * @author ztq_2016
 *
 */
public class CreateExportPlan {
	
	private String userId;
	
	private String planName;
	
	private String exportType;
	
	private Boolean needCreate;
	
	private List<ExportVariable> variableList;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getExportType() {
		return exportType;
	}

	public void setExportType(String exportType) {
		this.exportType = exportType;
	}

	public Boolean getNeedCreate() {
		return needCreate;
	}

	public void setNeedCreate(Boolean needCreate) {
		this.needCreate = needCreate;
	}

	public List<ExportVariable> getVariableList() {
		return variableList;
	}

	public void setVariableList(List<ExportVariable> variableList) {
		this.variableList = variableList;
	}
	
}

package com.clinicalresearch.model;

import java.util.List;

import com.clinicalresearch.core.bean.ExportVariable;
/**
 * 用于接受创建数据导出计划的参数列表
 * @author ztq_2016
 *
 */
public class CreateExportPlanRequest {
	
	/*计划名称*/
	private String planName;
	
	/*导出类型*/
	private String exportType;
	
	/*是否保存*/
	private Boolean needCreate;
	
	/*导出变量列表*/
	private List<ExportVariable> variableList;
	
	/*表达式*/
	private Object exp;
	
	public Object getExp() {
		return exp;
	}

	public void setExp(Object exp) {
		this.exp = exp;
	}

	public Boolean getNeedCreate() {
		return needCreate;
	}

	public void setNeedCreate(Boolean needCreate) {
		this.needCreate = needCreate;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public List<ExportVariable> getVariableList() {
		return variableList;
	}

	public void setVariableList(List<ExportVariable> variableList) {
		this.variableList = variableList;
	}

	public String getExportType() {
		return exportType;
	}

	public void setExportType(String exportType) {
		this.exportType = exportType;
	}
	
}


package com.clinicalresearch.core.bean;
/**
 * 已选导出变量
 * @author ztq_2016
 *
 */
public class ExportPlanSelectVariable {
	
	/*关联表中的id*/
	private Integer linkId;
	
	private String variableId;
	
	/*变量的名称*/
	private String variableName;
	
	/*变量别名，如果没有别名，那么名称与别名一致*/
	private String varialbeOtherName;
	
	/*变量的全称，带父类的名称*/
	private String variableFullName;
	
	public String getVariableFullName() {
		return variableFullName;
	}

	public void setVariableFullName(String variableFullName) {
		this.variableFullName = variableFullName;
	}

	public Integer getLinkId() {
		return linkId;
	}

	public void setLinkId(Integer linkId) {
		this.linkId = linkId;
	}

	public String getVariableId() {
		return variableId;
	}

	public void setVariableId(String variableId) {
		this.variableId = variableId;
	}

	public String getVariableName() {
		return variableName;
	}

	public void setVariableName(String variableName) {
		this.variableName = variableName;
	}

	public String getVarialbeOtherName() {
		return varialbeOtherName;
	}

	public void setVarialbeOtherName(String varialbeOtherName) {
		this.varialbeOtherName = varialbeOtherName;
	}
	
}

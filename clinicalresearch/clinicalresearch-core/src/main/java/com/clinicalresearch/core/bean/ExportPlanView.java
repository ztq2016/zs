package com.clinicalresearch.core.bean;
/**
 * 每个导出方案的展示结构
 * @author ztq_2016
 *
 */
public class ExportPlanView {
	
	/*导出变量的id*/
	private Integer expId;
	
	/*导出变量的名字*/
	private String expName;
	
	/*导出变量的类型*/
	private String expType;

	public Integer getExpId() {
		return expId;
	}

	public void setExpId(Integer expId) {
		this.expId = expId;
	}

	public String getExpName() {
		return expName;
	}

	public void setExpName(String expName) {
		this.expName = expName;
	}

	public String getExpType() {
		return expType;
	}

	public void setExpType(String expType) {
		this.expType = expType;
	}
	
}

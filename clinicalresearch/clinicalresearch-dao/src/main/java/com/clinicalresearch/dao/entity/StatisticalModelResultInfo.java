package com.clinicalresearch.dao.entity;

import java.util.List;

public class StatisticalModelResultInfo {

	private String modelid;

    private String studyid;

    private String modelname;

    private String fatherid;

    private String modelbrief;

    private String modelclasspath;

    private String remark;
    
    private List<StatisticalModelResultInfo> two;
    
    private List<StatisticalModelResultInfo> three;

	public String getModelid() {
		return modelid;
	}

	public void setModelid(String modelid) {
		this.modelid = modelid;
	}

	public String getStudyid() {
		return studyid;
	}

	public void setStudyid(String studyid) {
		this.studyid = studyid;
	}

	public String getModelname() {
		return modelname;
	}

	public void setModelname(String modelname) {
		this.modelname = modelname;
	}

	public String getFatherid() {
		return fatherid;
	}

	public void setFatherid(String fatherid) {
		this.fatherid = fatherid;
	}

	public String getModelbrief() {
		return modelbrief;
	}

	public void setModelbrief(String modelbrief) {
		this.modelbrief = modelbrief;
	}

	public String getModelclasspath() {
		return modelclasspath;
	}

	public void setModelclasspath(String modelclasspath) {
		this.modelclasspath = modelclasspath;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<StatisticalModelResultInfo> getTwo() {
		return two;
	}

	public void setTwo(List<StatisticalModelResultInfo> two) {
		this.two = two;
	}

	public List<StatisticalModelResultInfo> getThree() {
		return three;
	}

	public void setThree(List<StatisticalModelResultInfo> three) {
		this.three = three;
	}
    
	
}

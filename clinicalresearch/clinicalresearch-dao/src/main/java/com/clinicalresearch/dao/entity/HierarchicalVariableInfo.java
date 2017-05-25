package com.clinicalresearch.dao.entity;

import java.util.List;
import java.util.Map;

public class HierarchicalVariableInfo {

	//变量编号
	private String variableid;
	
	//变量名称
	private String variablename;

	//变量类型
	private String variabletype;
	
	//父级变量编号
	private String fatherid;

	//字段映射编码
	private String keycode;
	
	//变量出处
	private String source;
	
	//值域表号
	private String fieldtableid;
	
	//单位表号
	private String unittableid;
	
	//时间变量
	private String now;
	
	//二级目录信息
	List<HierarchicalVariableInfo>  hierarchicalVariableSurvey;
	
	//三级目录信息
	List<HierarchicalVariableInfo>  hierarchicalVariableDetailed;
	
	//描述信息
	private String content;
	
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getVariableid() {
		return variableid;
	}

	public void setVariableid(String variableid) {
		this.variableid = variableid;
	}

	public String getVariablename() {
		return variablename;
	}

	public void setVariablename(String variablename) {
		this.variablename = variablename;
	}

	public String getVariabletype() {
		return variabletype;
	}

	public void setVariabletype(String variabletype) {
		this.variabletype = variabletype;
	}

	public String getFatherid() {
		return fatherid;
	}

	public void setFatherid(String fatherid) {
		this.fatherid = fatherid;
	}

	public String getKeycode() {
		return keycode;
	}

	public void setKeycode(String keycode) {
		this.keycode = keycode;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getFieldtableid() {
		return fieldtableid;
	}

	public void setFieldtableid(String fieldtableid) {
		this.fieldtableid = fieldtableid;
	}

	public String getUnittableid() {
		return unittableid;
	}

	public void setUnittableid(String unittableid) {
		this.unittableid = unittableid;
	}

	public String getNow() {
		return now;
	}

	public void setNow(String now) {
		this.now = now;
	}

	public List<HierarchicalVariableInfo> getHierarchicalVariableSurvey() {
		return hierarchicalVariableSurvey;
	}

	public void setHierarchicalVariableSurvey(List<HierarchicalVariableInfo> hierarchicalVariableSurvey) {
		this.hierarchicalVariableSurvey = hierarchicalVariableSurvey;
	}

	public List<HierarchicalVariableInfo> getHierarchicalVariableDetailed() {
		return hierarchicalVariableDetailed;
	}

	public void setHierarchicalVariableDetailed(List<HierarchicalVariableInfo> hierarchicalVariableDetailed) {
		this.hierarchicalVariableDetailed = hierarchicalVariableDetailed;
	}

	
	
}

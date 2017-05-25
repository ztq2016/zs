package com.clinicalresearch.dao.entity;

import java.util.List;

public class SaveModel {

	private String modelstr;
	private String studyid;
	private String variablenames;
	private String modelnames;
	private List<Models> models;
	public String getModelstr() {
		return modelstr;
	}
	public void setModelstr(String modelstr) {
		this.modelstr = modelstr;
	}
	public String getStudyid() {
		return studyid;
	}
	public void setStudyid(String studyid) {
		this.studyid = studyid;
	}
	public String getVariablenames() {
		return variablenames;
	}
	public void setVariablenames(String variablenames) {
		this.variablenames = variablenames;
	}
	public String getModelnames() {
		return modelnames;
	}
	public void setModelnames(String modelnames) {
		this.modelnames = modelnames;
	}
	public List<Models> getModels() {
		return models;
	}
	public void setModels(List<Models> models) {
		this.models = models;
	}
	
	
	
}

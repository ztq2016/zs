package com.clinicalresearch.dao.entity;

import java.util.List;

public class Models {

	private String modelid;
	private List<ModelInf> modelinf;
	public String getModelid() {
		return modelid;
	}
	public void setModelid(String modelid) {
		this.modelid = modelid;
	}
	public List<ModelInf> getModelinf() {
		return modelinf;
	}
	public void setModelinf(List<ModelInf> modelinf) {
		this.modelinf = modelinf;
	}
	
}

package com.clinicalresearch.model;

import java.util.List;

import com.clinicalresearch.dao.entity.Page;
import com.clinicalresearch.dao.entity.TempDataInfo;

public class TempDataResult {

	private Page page;
	private List<TempDataInfo> temp;
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	public List<TempDataInfo> getTemp() {
		return temp;
	}
	public void setTemp(List<TempDataInfo> temp) {
		this.temp = temp;
	}
	
}

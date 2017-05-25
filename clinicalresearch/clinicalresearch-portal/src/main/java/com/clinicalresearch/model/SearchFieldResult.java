package com.clinicalresearch.model;

import java.util.List;

import com.clinicalresearch.dao.entity.IndicatorFields;
import com.clinicalresearch.dao.entity.Page;

public class SearchFieldResult {

	private Page page;
	private List<IndicatorFields> fieldsList;
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	public List<IndicatorFields> getFieldsList() {
		return fieldsList;
	}
	public void setFieldsList(List<IndicatorFields> fieldsList) {
		this.fieldsList = fieldsList;
	}
	
}

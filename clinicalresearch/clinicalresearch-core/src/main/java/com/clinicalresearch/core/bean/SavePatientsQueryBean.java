package com.clinicalresearch.core.bean;

import java.util.ArrayList;
import java.util.List;

public class SavePatientsQueryBean {
	
	private Object expressions;
	
	private Integer page;
	
	private Integer size;

	private List<String> resultField;
	
	public List<String> getResultField() {
		return resultField;
	}

	public void setResultField(List<String> resultField) {
		this.resultField = resultField;
	}
	
	public void setResultField(String fieldName) {
		if (resultField == null) {
			resultField = new ArrayList<>();
		}
		resultField.add(fieldName);
	}

	public Object getExpressions() {
		return expressions;
	}

	public void setExpressions(Object expressions) {
		this.expressions = expressions;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	
	
}

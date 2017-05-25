package com.clinicalresearch.core.bean;

import java.util.List;

public class PatientsId {
	private Integer total;
	
	private List<FieldId> hits;

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<FieldId> getHits() {
		return hits;
	}

	public void setHits(List<FieldId> hits) {
		this.hits = hits;
	}
}

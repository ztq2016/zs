package com.clinicalresearch.dao.entity;

import java.util.List;

public class EsResult {

	private String total;
	private List<EsHits> hits;
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public List<EsHits> getHits() {
		return hits;
	}
	public void setHits(List<EsHits> hits) {
		this.hits = hits;
	}
	
}

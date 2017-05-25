package com.clinicalresearch.model;

import java.util.List;
import java.util.Map;

import com.clinicalresearch.core.bean.StudyInfo;
import com.clinicalresearch.dao.entity.Page;

public class SearchResult {
	private String userId;
	
	private Page page;
	
	private List<StudyInfo> studyList;
	
	private Map<String, String> typeCount;

	public Map<String, String> getTypeCount() {
		return typeCount;
	}

	public void setTypeCount(Map<String, String> typeCount) {
		this.typeCount = typeCount;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public List<StudyInfo> getStudyList() {
		return studyList;
	}

	public void setStudyList(List<StudyInfo> studyList) {
		this.studyList = studyList;
	}
	
}

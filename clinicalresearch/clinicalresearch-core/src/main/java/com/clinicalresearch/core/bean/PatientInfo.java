package com.clinicalresearch.core.bean;



import java.util.HashMap;
import java.util.Map;

public class PatientInfo {
	
	private String patientId;
	private String visitidId;
	/**
	 * 不同的键值对
	 */
	private Map<String, String> item;
	
	private String studyId;
	private String groupId;
	
	public Map<String, String> getItem() {
		return item;
	}
	public void setItem(Map<String, String> item) {
		this.item = item;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getVisitidId() {
		return visitidId;
	}
	public void setVisitidId(String visitidId) {
		this.visitidId = visitidId;
	}

	public String getStudyId() {
		return studyId;
	}
	public void setStudyId(String studyId) {
		this.studyId = studyId;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	
	public void setItemKeyAndValue(String key,String value) {
		if (item == null) {
			item = new HashMap<>();
		}
		item.put(key, value);
	}
	
	public String getItemValueByKey(String key) {
		String value = null;
		if (item == null) {
			return value;
		}
		value = item.get(key);
		return value;
	}
}

package com.clinicalresearch.dao.entity;

public class EsHits {

	private String patientid;
	private String fieldId;
	private String age;
	private String gender;
	private String disease;
	private String visitNum;
	
	
	public String getFieldId() {
		return fieldId;
	}
	public void setFieldId(String fieldId) {
		this.fieldId = fieldId;
	}
	public String getPatientid() {
		return patientid;
	}
	public void setPatientid(String patientid) {
		this.patientid = patientid;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getVisitNum() {
		return visitNum;
	}
	public void setVisitNum(String visitNum) {
		this.visitNum = visitNum;
	}
	
}

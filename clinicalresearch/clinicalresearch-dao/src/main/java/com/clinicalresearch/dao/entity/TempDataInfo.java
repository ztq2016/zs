package com.clinicalresearch.dao.entity;

public class TempDataInfo {

	private String id;
	private String sex;
	private String age;
	private String diagnosis;
	private String otherdiagnosis;
	private String diagnosisnum;
	private String isdelete;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	public String getOtherdiagnosis() {
		return otherdiagnosis;
	}
	public void setOtherdiagnosis(String otherdiagnosis) {
		this.otherdiagnosis = otherdiagnosis;
	}
	public String getDiagnosisnum() {
		return diagnosisnum;
	}
	public void setDiagnosisnum(String diagnosisnum) {
		this.diagnosisnum = diagnosisnum;
	}
	public String getIsdelete() {
		return isdelete;
	}
	public void setIsdelete(String isdelete) {
		this.isdelete = isdelete;
	}
	
}

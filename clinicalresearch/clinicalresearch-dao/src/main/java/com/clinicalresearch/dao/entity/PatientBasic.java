package com.clinicalresearch.dao.entity;

public class PatientBasic {
    private String patientid;

    private String age;

    private String gender;

    private String disease;

    private Integer visitnum;

    private String studyid;

    private String patientids;

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid == null ? null : patientid.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease == null ? null : disease.trim();
    }

    public Integer getVisitnum() {
        return visitnum;
    }

    public void setVisitnum(Integer visitnum) {
        this.visitnum = visitnum;
    }

    public String getStudyid() {
        return studyid;
    }

    public void setStudyid(String studyid) {
        this.studyid = studyid == null ? null : studyid.trim();
    }

    public String getPatientids() {
        return patientids;
    }

    public void setPatientids(String patientids) {
        this.patientids = patientids == null ? null : patientids.trim();
    }
}
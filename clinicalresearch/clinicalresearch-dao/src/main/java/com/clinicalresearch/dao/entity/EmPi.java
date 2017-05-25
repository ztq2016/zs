package com.clinicalresearch.dao.entity;

public class EmPi {
    private String masterid;

    private String patientid;

    private String visitid;

    private String sex;

    private String age;

    private String principaldiagnosis;

    private String otherdiagnosis;

    private String studyid;

    private String groupid;

    public String getMasterid() {
        return masterid;
    }

    public void setMasterid(String masterid) {
        this.masterid = masterid == null ? null : masterid.trim();
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid == null ? null : patientid.trim();
    }

    public String getVisitid() {
        return visitid;
    }

    public void setVisitid(String visitid) {
        this.visitid = visitid == null ? null : visitid.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getPrincipaldiagnosis() {
        return principaldiagnosis;
    }

    public void setPrincipaldiagnosis(String principaldiagnosis) {
        this.principaldiagnosis = principaldiagnosis == null ? null : principaldiagnosis.trim();
    }

    public String getOtherdiagnosis() {
        return otherdiagnosis;
    }

    public void setOtherdiagnosis(String otherdiagnosis) {
        this.otherdiagnosis = otherdiagnosis == null ? null : otherdiagnosis.trim();
    }

    public String getStudyid() {
        return studyid;
    }

    public void setStudyid(String studyid) {
        this.studyid = studyid == null ? null : studyid.trim();
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }
}
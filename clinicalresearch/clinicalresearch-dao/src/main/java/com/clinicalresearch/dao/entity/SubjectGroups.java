package com.clinicalresearch.dao.entity;

public class SubjectGroups {
    private String groupid;

    private String groupname;

    private String groupcondition;

    private String patientset;

    private String groupnum;

    private String studyid;

    private String criteriaid;

    private String fatherId;

    private String createtime;

    private String remark;

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname == null ? null : groupname.trim();
    }

    public String getGroupcondition() {
        return groupcondition;
    }

    public void setGroupcondition(String groupcondition) {
        this.groupcondition = groupcondition == null ? null : groupcondition.trim();
    }

    public String getPatientset() {
        return patientset;
    }

    public void setPatientset(String patientset) {
        this.patientset = patientset == null ? null : patientset.trim();
    }

    public String getGroupnum() {
        return groupnum;
    }

    public void setGroupnum(String groupnum) {
        this.groupnum = groupnum == null ? null : groupnum.trim();
    }

    public String getStudyid() {
        return studyid;
    }

    public void setStudyid(String studyid) {
        this.studyid = studyid == null ? null : studyid.trim();
    }

    public String getCriteriaid() {
        return criteriaid;
    }

    public void setCriteriaid(String criteriaid) {
        this.criteriaid = criteriaid == null ? null : criteriaid.trim();
    }

    public String getFatherId() {
        return fatherId;
    }

    public void setFatherId(String fatherId) {
        this.fatherId = fatherId == null ? null : fatherId.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}
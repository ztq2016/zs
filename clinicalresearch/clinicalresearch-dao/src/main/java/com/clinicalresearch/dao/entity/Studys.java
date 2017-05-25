package com.clinicalresearch.dao.entity;

import java.util.Date;

public class Studys {
    private String studyid;

    private String studytname;

    private String studytype;

    private String studyobjective;

    private String principalinvestigator;

    private String briefsummary;

    private String collaborators;

    private String allocation;

    private String masking;

    private String interventionmodel;

    private String control;

    private String studystatus;

    private Date studystartdate;

    private Date studycompletiondate;

    private String sponsor;

    private String statisticalmodel;

    private String userid;

    private Date timestamp;

    private String lockstatus;

    private String state;

    private String isdelete;

    public String getStudyid() {
        return studyid;
    }

    public void setStudyid(String studyid) {
        this.studyid = studyid == null ? null : studyid.trim();
    }

    public String getStudytname() {
        return studytname;
    }

    public void setStudytname(String studytname) {
        this.studytname = studytname == null ? null : studytname.trim();
    }

    public String getStudytype() {
        return studytype;
    }

    public void setStudytype(String studytype) {
        this.studytype = studytype == null ? null : studytype.trim();
    }

    public String getStudyobjective() {
        return studyobjective;
    }

    public void setStudyobjective(String studyobjective) {
        this.studyobjective = studyobjective == null ? null : studyobjective.trim();
    }

    public String getPrincipalinvestigator() {
        return principalinvestigator;
    }

    public void setPrincipalinvestigator(String principalinvestigator) {
        this.principalinvestigator = principalinvestigator == null ? null : principalinvestigator.trim();
    }

    public String getBriefsummary() {
        return briefsummary;
    }

    public void setBriefsummary(String briefsummary) {
        this.briefsummary = briefsummary == null ? null : briefsummary.trim();
    }

    public String getCollaborators() {
        return collaborators;
    }

    public void setCollaborators(String collaborators) {
        this.collaborators = collaborators == null ? null : collaborators.trim();
    }

    public String getAllocation() {
        return allocation;
    }

    public void setAllocation(String allocation) {
        this.allocation = allocation == null ? null : allocation.trim();
    }

    public String getMasking() {
        return masking;
    }

    public void setMasking(String masking) {
        this.masking = masking == null ? null : masking.trim();
    }

    public String getInterventionmodel() {
        return interventionmodel;
    }

    public void setInterventionmodel(String interventionmodel) {
        this.interventionmodel = interventionmodel == null ? null : interventionmodel.trim();
    }

    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control == null ? null : control.trim();
    }

    public String getStudystatus() {
        return studystatus;
    }

    public void setStudystatus(String studystatus) {
        this.studystatus = studystatus == null ? null : studystatus.trim();
    }

    public Date getStudystartdate() {
        return studystartdate;
    }

    public void setStudystartdate(Date studystartdate) {
        this.studystartdate = studystartdate;
    }

    public Date getStudycompletiondate() {
        return studycompletiondate;
    }

    public void setStudycompletiondate(Date studycompletiondate) {
        this.studycompletiondate = studycompletiondate;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor == null ? null : sponsor.trim();
    }

    public String getStatisticalmodel() {
        return statisticalmodel;
    }

    public void setStatisticalmodel(String statisticalmodel) {
        this.statisticalmodel = statisticalmodel == null ? null : statisticalmodel.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getLockstatus() {
        return lockstatus;
    }

    public void setLockstatus(String lockstatus) {
        this.lockstatus = lockstatus == null ? null : lockstatus.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete == null ? null : isdelete.trim();
    }
}
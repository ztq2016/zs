package com.clinicalresearch.dao.entity;

public class StudyinDicators {
    private String indicatorid;

    private String indicatorname;

    private String classificationid;

    private String fieldtableid;

    private String indicatorexpression;

    private String studyid;

    public String getIndicatorid() {
        return indicatorid;
    }

    public void setIndicatorid(String indicatorid) {
        this.indicatorid = indicatorid == null ? null : indicatorid.trim();
    }

    public String getIndicatorname() {
        return indicatorname;
    }

    public void setIndicatorname(String indicatorname) {
        this.indicatorname = indicatorname == null ? null : indicatorname.trim();
    }

    public String getClassificationid() {
        return classificationid;
    }

    public void setClassificationid(String classificationid) {
        this.classificationid = classificationid == null ? null : classificationid.trim();
    }

    public String getFieldtableid() {
        return fieldtableid;
    }

    public void setFieldtableid(String fieldtableid) {
        this.fieldtableid = fieldtableid == null ? null : fieldtableid.trim();
    }

    public String getIndicatorexpression() {
        return indicatorexpression;
    }

    public void setIndicatorexpression(String indicatorexpression) {
        this.indicatorexpression = indicatorexpression == null ? null : indicatorexpression.trim();
    }

    public String getStudyid() {
        return studyid;
    }

    public void setStudyid(String studyid) {
        this.studyid = studyid == null ? null : studyid.trim();
    }
}
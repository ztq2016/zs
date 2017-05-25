package com.clinicalresearch.dao.entity;

public class StatisticalModel {
    private String modelid;

    private String studyid;

    private String modelname;

    private String modelbrief;

    private String modelclasspath;

    private String remark;

    public String getModelid() {
        return modelid;
    }

    public void setModelid(String modelid) {
        this.modelid = modelid == null ? null : modelid.trim();
    }

    public String getStudyid() {
        return studyid;
    }

    public void setStudyid(String studyid) {
        this.studyid = studyid == null ? null : studyid.trim();
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname == null ? null : modelname.trim();
    }

    public String getModelbrief() {
        return modelbrief;
    }

    public void setModelbrief(String modelbrief) {
        this.modelbrief = modelbrief == null ? null : modelbrief.trim();
    }

    public String getModelclasspath() {
        return modelclasspath;
    }

    public void setModelclasspath(String modelclasspath) {
        this.modelclasspath = modelclasspath == null ? null : modelclasspath.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}
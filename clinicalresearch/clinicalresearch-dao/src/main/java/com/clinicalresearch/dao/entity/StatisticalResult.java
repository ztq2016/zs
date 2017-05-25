package com.clinicalresearch.dao.entity;

public class StatisticalResult {
    private String modelid;

    private String resultid;

    private String itemname;

    private String itemvalue;

    private String indicatorid;

    private String resulttype;

    private String studyid;

    public String getModelid() {
        return modelid;
    }

    public void setModelid(String modelid) {
        this.modelid = modelid == null ? null : modelid.trim();
    }

    public String getResultid() {
        return resultid;
    }

    public void setResultid(String resultid) {
        this.resultid = resultid == null ? null : resultid.trim();
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname == null ? null : itemname.trim();
    }

    public String getItemvalue() {
        return itemvalue;
    }

    public void setItemvalue(String itemvalue) {
        this.itemvalue = itemvalue == null ? null : itemvalue.trim();
    }

    public String getIndicatorid() {
        return indicatorid;
    }

    public void setIndicatorid(String indicatorid) {
        this.indicatorid = indicatorid == null ? null : indicatorid.trim();
    }

    public String getResulttype() {
        return resulttype;
    }

    public void setResulttype(String resulttype) {
        this.resulttype = resulttype == null ? null : resulttype.trim();
    }

    public String getStudyid() {
        return studyid;
    }

    public void setStudyid(String studyid) {
        this.studyid = studyid == null ? null : studyid.trim();
    }
}
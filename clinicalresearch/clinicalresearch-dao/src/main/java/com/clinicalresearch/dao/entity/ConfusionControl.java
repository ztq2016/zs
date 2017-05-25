package com.clinicalresearch.dao.entity;

public class ConfusionControl {
    private String controlid;

    private String indicatorid;

    private String itemname;

    private String itemvalue;

    private String studyid;

    public String getControlid() {
        return controlid;
    }

    public void setControlid(String controlid) {
        this.controlid = controlid == null ? null : controlid.trim();
    }

    public String getIndicatorid() {
        return indicatorid;
    }

    public void setIndicatorid(String indicatorid) {
        this.indicatorid = indicatorid == null ? null : indicatorid.trim();
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

    public String getStudyid() {
        return studyid;
    }

    public void setStudyid(String studyid) {
        this.studyid = studyid == null ? null : studyid.trim();
    }
}
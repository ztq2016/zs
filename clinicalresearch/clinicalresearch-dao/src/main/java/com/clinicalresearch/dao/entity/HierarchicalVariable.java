package com.clinicalresearch.dao.entity;

public class HierarchicalVariable {
    private String variableid;

    private String variablename;

    private String variabletype;

    private String fatherid;

    private String vpycode;

    private String source;

    private String keycode;

    private String now;

    private Integer variableOrder;

    private Integer variableLevel;

    public String getVariableid() {
        return variableid;
    }

    public void setVariableid(String variableid) {
        this.variableid = variableid == null ? null : variableid.trim();
    }

    public String getVariablename() {
        return variablename;
    }

    public void setVariablename(String variablename) {
        this.variablename = variablename == null ? null : variablename.trim();
    }

    public String getVariabletype() {
        return variabletype;
    }

    public void setVariabletype(String variabletype) {
        this.variabletype = variabletype == null ? null : variabletype.trim();
    }

    public String getFatherid() {
        return fatherid;
    }

    public void setFatherid(String fatherid) {
        this.fatherid = fatherid == null ? null : fatherid.trim();
    }

    public String getVpycode() {
        return vpycode;
    }

    public void setVpycode(String vpycode) {
        this.vpycode = vpycode == null ? null : vpycode.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getKeycode() {
        return keycode;
    }

    public void setKeycode(String keycode) {
        this.keycode = keycode == null ? null : keycode.trim();
    }

    public String getNow() {
        return now;
    }

    public void setNow(String now) {
        this.now = now == null ? null : now.trim();
    }

    public Integer getVariableOrder() {
        return variableOrder;
    }

    public void setVariableOrder(Integer variableOrder) {
        this.variableOrder = variableOrder;
    }

    public Integer getVariableLevel() {
        return variableLevel;
    }

    public void setVariableLevel(Integer variableLevel) {
        this.variableLevel = variableLevel;
    }
}
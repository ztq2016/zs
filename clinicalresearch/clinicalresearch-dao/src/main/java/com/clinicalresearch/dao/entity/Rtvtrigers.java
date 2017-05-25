package com.clinicalresearch.dao.entity;

public class Rtvtrigers {
    private String trigerid;

    private String trigername;

    private String trigertype;

    private String fieldtableid;

    private String timefiled;

    public String getTrigerid() {
        return trigerid;
    }

    public void setTrigerid(String trigerid) {
        this.trigerid = trigerid == null ? null : trigerid.trim();
    }

    public String getTrigername() {
        return trigername;
    }

    public void setTrigername(String trigername) {
        this.trigername = trigername == null ? null : trigername.trim();
    }

    public String getTrigertype() {
        return trigertype;
    }

    public void setTrigertype(String trigertype) {
        this.trigertype = trigertype == null ? null : trigertype.trim();
    }

    public String getFieldtableid() {
        return fieldtableid;
    }

    public void setFieldtableid(String fieldtableid) {
        this.fieldtableid = fieldtableid == null ? null : fieldtableid.trim();
    }

    public String getTimefiled() {
        return timefiled;
    }

    public void setTimefiled(String timefiled) {
        this.timefiled = timefiled == null ? null : timefiled.trim();
    }
}
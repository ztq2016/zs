package com.clinicalresearch.dao.entity;

public class IndicatorFields {
    private String fieldtableid;

    private String fieldid;

    private String fieldname;

    private String fieldtype;

    private String fieldvalue;

    private String fieldversion;

    private String fielddesc;

    private String fpycode;

    private String fieldorder;

    private String fatherid;

    public String getFieldtableid() {
        return fieldtableid;
    }

    public void setFieldtableid(String fieldtableid) {
        this.fieldtableid = fieldtableid == null ? null : fieldtableid.trim();
    }

    public String getFieldid() {
        return fieldid;
    }

    public void setFieldid(String fieldid) {
        this.fieldid = fieldid == null ? null : fieldid.trim();
    }

    public String getFieldname() {
        return fieldname;
    }

    public void setFieldname(String fieldname) {
        this.fieldname = fieldname == null ? null : fieldname.trim();
    }

    public String getFieldtype() {
        return fieldtype;
    }

    public void setFieldtype(String fieldtype) {
        this.fieldtype = fieldtype == null ? null : fieldtype.trim();
    }

    public String getFieldvalue() {
        return fieldvalue;
    }

    public void setFieldvalue(String fieldvalue) {
        this.fieldvalue = fieldvalue == null ? null : fieldvalue.trim();
    }

    public String getFieldversion() {
        return fieldversion;
    }

    public void setFieldversion(String fieldversion) {
        this.fieldversion = fieldversion == null ? null : fieldversion.trim();
    }

    public String getFielddesc() {
        return fielddesc;
    }

    public void setFielddesc(String fielddesc) {
        this.fielddesc = fielddesc == null ? null : fielddesc.trim();
    }

    public String getFpycode() {
        return fpycode;
    }

    public void setFpycode(String fpycode) {
        this.fpycode = fpycode == null ? null : fpycode.trim();
    }

    public String getFieldorder() {
        return fieldorder;
    }

    public void setFieldorder(String fieldorder) {
        this.fieldorder = fieldorder == null ? null : fieldorder.trim();
    }

    public String getFatherid() {
        return fatherid;
    }

    public void setFatherid(String fatherid) {
        this.fatherid = fatherid == null ? null : fatherid.trim();
    }
}
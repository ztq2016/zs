package com.clinicalresearch.dao.entity;

public class Units {
    private String unittableid;

    private String unitid;

    private String unitname;

    private String unittype;

    private String isdefault;

    public String getUnittableid() {
        return unittableid;
    }

    public void setUnittableid(String unittableid) {
        this.unittableid = unittableid == null ? null : unittableid.trim();
    }

    public String getUnitid() {
        return unitid;
    }

    public void setUnitid(String unitid) {
        this.unitid = unitid == null ? null : unitid.trim();
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname == null ? null : unitname.trim();
    }

    public String getUnittype() {
        return unittype;
    }

    public void setUnittype(String unittype) {
        this.unittype = unittype == null ? null : unittype.trim();
    }

    public String getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(String isdefault) {
        this.isdefault = isdefault == null ? null : isdefault.trim();
    }
}
package com.clinicalresearch.dao.entity;

public class RolesPowersKey {
    private String roleid;

    private String powerid;

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public String getPowerid() {
        return powerid;
    }

    public void setPowerid(String powerid) {
        this.powerid = powerid == null ? null : powerid.trim();
    }
}
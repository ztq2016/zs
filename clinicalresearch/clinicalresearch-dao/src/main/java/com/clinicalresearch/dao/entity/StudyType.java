package com.clinicalresearch.dao.entity;

public class StudyType {
    private String typeid;

    private String typename;

    private String higherlevelid;

    private String typedesc;

    public String getTypeid() {
        return typeid;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid == null ? null : typeid.trim();
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public String getHigherlevelid() {
        return higherlevelid;
    }

    public void setHigherlevelid(String higherlevelid) {
        this.higherlevelid = higherlevelid == null ? null : higherlevelid.trim();
    }

    public String getTypedesc() {
        return typedesc;
    }

    public void setTypedesc(String typedesc) {
        this.typedesc = typedesc == null ? null : typedesc.trim();
    }
}
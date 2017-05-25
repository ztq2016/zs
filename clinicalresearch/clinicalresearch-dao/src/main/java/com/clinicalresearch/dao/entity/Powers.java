package com.clinicalresearch.dao.entity;

public class Powers {
    private String powerid;

    private String powername;

    private String powertype;

    private String pageurl;

    private String menuname;

    private String buttonname;

    private String studynum;

    private String datascope;

    private String parentId;

    private String parentIds;

    private Integer available;

    public String getPowerid() {
        return powerid;
    }

    public void setPowerid(String powerid) {
        this.powerid = powerid == null ? null : powerid.trim();
    }

    public String getPowername() {
        return powername;
    }

    public void setPowername(String powername) {
        this.powername = powername == null ? null : powername.trim();
    }

    public String getPowertype() {
        return powertype;
    }

    public void setPowertype(String powertype) {
        this.powertype = powertype == null ? null : powertype.trim();
    }

    public String getPageurl() {
        return pageurl;
    }

    public void setPageurl(String pageurl) {
        this.pageurl = pageurl == null ? null : pageurl.trim();
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }

    public String getButtonname() {
        return buttonname;
    }

    public void setButtonname(String buttonname) {
        this.buttonname = buttonname == null ? null : buttonname.trim();
    }

    public String getStudynum() {
        return studynum;
    }

    public void setStudynum(String studynum) {
        this.studynum = studynum == null ? null : studynum.trim();
    }

    public String getDatascope() {
        return datascope;
    }

    public void setDatascope(String datascope) {
        this.datascope = datascope == null ? null : datascope.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds == null ? null : parentIds.trim();
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }
}
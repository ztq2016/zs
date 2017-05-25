package com.clinicalresearch.dao.entity;

import java.util.Date;

public class SystemConf {
    private Integer sysconfId;

    private String sysconfName;

    private String sysconfValue;

    private Date sysconfUpdateTime;

    private String sysconfDesc;

    public Integer getSysconfId() {
        return sysconfId;
    }

    public void setSysconfId(Integer sysconfId) {
        this.sysconfId = sysconfId;
    }

    public String getSysconfName() {
        return sysconfName;
    }

    public void setSysconfName(String sysconfName) {
        this.sysconfName = sysconfName == null ? null : sysconfName.trim();
    }

    public String getSysconfValue() {
        return sysconfValue;
    }

    public void setSysconfValue(String sysconfValue) {
        this.sysconfValue = sysconfValue == null ? null : sysconfValue.trim();
    }

    public Date getSysconfUpdateTime() {
        return sysconfUpdateTime;
    }

    public void setSysconfUpdateTime(Date sysconfUpdateTime) {
        this.sysconfUpdateTime = sysconfUpdateTime;
    }

    public String getSysconfDesc() {
        return sysconfDesc;
    }

    public void setSysconfDesc(String sysconfDesc) {
        this.sysconfDesc = sysconfDesc == null ? null : sysconfDesc.trim();
    }
}
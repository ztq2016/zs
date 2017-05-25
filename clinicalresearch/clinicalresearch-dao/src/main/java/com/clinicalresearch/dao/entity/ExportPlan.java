package com.clinicalresearch.dao.entity;

import java.util.Date;

public class ExportPlan {
    private Integer expId;

    private String expName;

    private String userId;

    private String expType;

    private Date expCreateTime;

    public Integer getExpId() {
        return expId;
    }

    public void setExpId(Integer expId) {
        this.expId = expId;
    }

    public String getExpName() {
        return expName;
    }

    public void setExpName(String expName) {
        this.expName = expName == null ? null : expName.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getExpType() {
        return expType;
    }

    public void setExpType(String expType) {
        this.expType = expType == null ? null : expType.trim();
    }

    public Date getExpCreateTime() {
        return expCreateTime;
    }

    public void setExpCreateTime(Date expCreateTime) {
        this.expCreateTime = expCreateTime;
    }
}
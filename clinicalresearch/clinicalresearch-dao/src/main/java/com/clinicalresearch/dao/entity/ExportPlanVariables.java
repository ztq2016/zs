package com.clinicalresearch.dao.entity;

public class ExportPlanVariables {
    private Integer linkId;

    private Integer expId;

    private String variableId;

    private String variableOtherName;

    private String variableName;

    private String variableFullName;

    public Integer getLinkId() {
        return linkId;
    }

    public void setLinkId(Integer linkId) {
        this.linkId = linkId;
    }

    public Integer getExpId() {
        return expId;
    }

    public void setExpId(Integer expId) {
        this.expId = expId;
    }

    public String getVariableId() {
        return variableId;
    }

    public void setVariableId(String variableId) {
        this.variableId = variableId == null ? null : variableId.trim();
    }

    public String getVariableOtherName() {
        return variableOtherName;
    }

    public void setVariableOtherName(String variableOtherName) {
        this.variableOtherName = variableOtherName == null ? null : variableOtherName.trim();
    }

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName == null ? null : variableName.trim();
    }

    public String getVariableFullName() {
        return variableFullName;
    }

    public void setVariableFullName(String variableFullName) {
        this.variableFullName = variableFullName == null ? null : variableFullName.trim();
    }
}
package com.clinicalresearch.dao.entity;

public class ModelIstestResult {
    private Integer isttId;

    private String studyid;

    private String varEqualT;

    private String varEqualSig;

    private String varEqualInf;

    private String varEqualSup;

    private String varUnequalT;

    private String varUnequalSig;

    private String varUnequalInf;

    private String varUnequalSup;

    private String confLevel;

    private String variableId;

    public Integer getIsttId() {
        return isttId;
    }

    public void setIsttId(Integer isttId) {
        this.isttId = isttId;
    }

    public String getStudyid() {
        return studyid;
    }

    public void setStudyid(String studyid) {
        this.studyid = studyid == null ? null : studyid.trim();
    }

    public String getVarEqualT() {
        return varEqualT;
    }

    public void setVarEqualT(String varEqualT) {
        this.varEqualT = varEqualT == null ? null : varEqualT.trim();
    }

    public String getVarEqualSig() {
        return varEqualSig;
    }

    public void setVarEqualSig(String varEqualSig) {
        this.varEqualSig = varEqualSig == null ? null : varEqualSig.trim();
    }

    public String getVarEqualInf() {
        return varEqualInf;
    }

    public void setVarEqualInf(String varEqualInf) {
        this.varEqualInf = varEqualInf == null ? null : varEqualInf.trim();
    }

    public String getVarEqualSup() {
        return varEqualSup;
    }

    public void setVarEqualSup(String varEqualSup) {
        this.varEqualSup = varEqualSup == null ? null : varEqualSup.trim();
    }

    public String getVarUnequalT() {
        return varUnequalT;
    }

    public void setVarUnequalT(String varUnequalT) {
        this.varUnequalT = varUnequalT == null ? null : varUnequalT.trim();
    }

    public String getVarUnequalSig() {
        return varUnequalSig;
    }

    public void setVarUnequalSig(String varUnequalSig) {
        this.varUnequalSig = varUnequalSig == null ? null : varUnequalSig.trim();
    }

    public String getVarUnequalInf() {
        return varUnequalInf;
    }

    public void setVarUnequalInf(String varUnequalInf) {
        this.varUnequalInf = varUnequalInf == null ? null : varUnequalInf.trim();
    }

    public String getVarUnequalSup() {
        return varUnequalSup;
    }

    public void setVarUnequalSup(String varUnequalSup) {
        this.varUnequalSup = varUnequalSup == null ? null : varUnequalSup.trim();
    }

    public String getConfLevel() {
        return confLevel;
    }

    public void setConfLevel(String confLevel) {
        this.confLevel = confLevel == null ? null : confLevel.trim();
    }

    public String getVariableId() {
        return variableId;
    }

    public void setVariableId(String variableId) {
        this.variableId = variableId == null ? null : variableId.trim();
    }
}
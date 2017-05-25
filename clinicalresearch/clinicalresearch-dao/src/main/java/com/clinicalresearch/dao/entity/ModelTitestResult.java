package com.clinicalresearch.dao.entity;

public class ModelTitestResult {
    private Integer titId;

    private String studyId;

    private String variableId;

    private String groupA;

    private String aRankMean;

    private String aRankSum;

    private String aSampleSum;

    private String groupB;

    private String bRankMean;

    private String bRankSum;

    private String bSampleSum;

    private String sumAll;

    private String mwu;

    private String z;

    private String pValue;

    public Integer getTitId() {
        return titId;
    }

    public void setTitId(Integer titId) {
        this.titId = titId;
    }

    public String getStudyId() {
        return studyId;
    }

    public void setStudyId(String studyId) {
        this.studyId = studyId == null ? null : studyId.trim();
    }

    public String getVariableId() {
        return variableId;
    }

    public void setVariableId(String variableId) {
        this.variableId = variableId == null ? null : variableId.trim();
    }

    public String getGroupA() {
        return groupA;
    }

    public void setGroupA(String groupA) {
        this.groupA = groupA == null ? null : groupA.trim();
    }

    public String getaRankMean() {
        return aRankMean;
    }

    public void setaRankMean(String aRankMean) {
        this.aRankMean = aRankMean == null ? null : aRankMean.trim();
    }

    public String getaRankSum() {
        return aRankSum;
    }

    public void setaRankSum(String aRankSum) {
        this.aRankSum = aRankSum == null ? null : aRankSum.trim();
    }

    public String getaSampleSum() {
        return aSampleSum;
    }

    public void setaSampleSum(String aSampleSum) {
        this.aSampleSum = aSampleSum == null ? null : aSampleSum.trim();
    }

    public String getGroupB() {
        return groupB;
    }

    public void setGroupB(String groupB) {
        this.groupB = groupB == null ? null : groupB.trim();
    }

    public String getbRankMean() {
        return bRankMean;
    }

    public void setbRankMean(String bRankMean) {
        this.bRankMean = bRankMean == null ? null : bRankMean.trim();
    }

    public String getbRankSum() {
        return bRankSum;
    }

    public void setbRankSum(String bRankSum) {
        this.bRankSum = bRankSum == null ? null : bRankSum.trim();
    }

    public String getbSampleSum() {
        return bSampleSum;
    }

    public void setbSampleSum(String bSampleSum) {
        this.bSampleSum = bSampleSum == null ? null : bSampleSum.trim();
    }

    public String getSumAll() {
        return sumAll;
    }

    public void setSumAll(String sumAll) {
        this.sumAll = sumAll == null ? null : sumAll.trim();
    }

    public String getMwu() {
        return mwu;
    }

    public void setMwu(String mwu) {
        this.mwu = mwu == null ? null : mwu.trim();
    }

    public String getZ() {
        return z;
    }

    public void setZ(String z) {
        this.z = z == null ? null : z.trim();
    }

    public String getpValue() {
        return pValue;
    }

    public void setpValue(String pValue) {
        this.pValue = pValue == null ? null : pValue.trim();
    }
}
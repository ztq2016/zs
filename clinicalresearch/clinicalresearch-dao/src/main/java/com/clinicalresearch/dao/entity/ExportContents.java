package com.clinicalresearch.dao.entity;

public class ExportContents {
    private Integer ecId;

    private String ecName;

    private String ecEsCode;

    private Integer ecFatherId;

    private String ecLevel;

    private Integer ecOrder;

    private String ecPycode;

    private String ecOther;

    public Integer getEcId() {
        return ecId;
    }

    public void setEcId(Integer ecId) {
        this.ecId = ecId;
    }

    public String getEcName() {
        return ecName;
    }

    public void setEcName(String ecName) {
        this.ecName = ecName == null ? null : ecName.trim();
    }

    public String getEcEsCode() {
        return ecEsCode;
    }

    public void setEcEsCode(String ecEsCode) {
        this.ecEsCode = ecEsCode == null ? null : ecEsCode.trim();
    }

    public Integer getEcFatherId() {
        return ecFatherId;
    }

    public void setEcFatherId(Integer ecFatherId) {
        this.ecFatherId = ecFatherId;
    }

    public String getEcLevel() {
        return ecLevel;
    }

    public void setEcLevel(String ecLevel) {
        this.ecLevel = ecLevel == null ? null : ecLevel.trim();
    }

    public Integer getEcOrder() {
        return ecOrder;
    }

    public void setEcOrder(Integer ecOrder) {
        this.ecOrder = ecOrder;
    }

    public String getEcPycode() {
        return ecPycode;
    }

    public void setEcPycode(String ecPycode) {
        this.ecPycode = ecPycode == null ? null : ecPycode.trim();
    }

    public String getEcOther() {
        return ecOther;
    }

    public void setEcOther(String ecOther) {
        this.ecOther = ecOther == null ? null : ecOther.trim();
    }
}
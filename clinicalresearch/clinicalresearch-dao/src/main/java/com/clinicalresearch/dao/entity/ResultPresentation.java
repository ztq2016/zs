package com.clinicalresearch.dao.entity;

public class ResultPresentation {
    private String presentationid;

    private String presentationtype;

    private String presentationmodal;

    private String statisticalmodelid;

    public String getPresentationid() {
        return presentationid;
    }

    public void setPresentationid(String presentationid) {
        this.presentationid = presentationid == null ? null : presentationid.trim();
    }

    public String getPresentationtype() {
        return presentationtype;
    }

    public void setPresentationtype(String presentationtype) {
        this.presentationtype = presentationtype == null ? null : presentationtype.trim();
    }

    public String getPresentationmodal() {
        return presentationmodal;
    }

    public void setPresentationmodal(String presentationmodal) {
        this.presentationmodal = presentationmodal == null ? null : presentationmodal.trim();
    }

    public String getStatisticalmodelid() {
        return statisticalmodelid;
    }

    public void setStatisticalmodelid(String statisticalmodelid) {
        this.statisticalmodelid = statisticalmodelid == null ? null : statisticalmodelid.trim();
    }
}
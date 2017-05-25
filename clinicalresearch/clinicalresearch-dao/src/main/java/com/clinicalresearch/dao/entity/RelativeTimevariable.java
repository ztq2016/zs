package com.clinicalresearch.dao.entity;

public class RelativeTimevariable {
    private String indicatorid;

    private String indicatorname;

    private String trigerevent;

    private String trigereventba;

    private String finalevent;

    private String finaleventtime;

    private String finaleventtimeunit;

    private String finaleventtimeio;

    private String finaleventencounter;

    public String getIndicatorid() {
        return indicatorid;
    }

    public void setIndicatorid(String indicatorid) {
        this.indicatorid = indicatorid == null ? null : indicatorid.trim();
    }

    public String getIndicatorname() {
        return indicatorname;
    }

    public void setIndicatorname(String indicatorname) {
        this.indicatorname = indicatorname == null ? null : indicatorname.trim();
    }

    public String getTrigerevent() {
        return trigerevent;
    }

    public void setTrigerevent(String trigerevent) {
        this.trigerevent = trigerevent == null ? null : trigerevent.trim();
    }

    public String getTrigereventba() {
        return trigereventba;
    }

    public void setTrigereventba(String trigereventba) {
        this.trigereventba = trigereventba == null ? null : trigereventba.trim();
    }

    public String getFinalevent() {
        return finalevent;
    }

    public void setFinalevent(String finalevent) {
        this.finalevent = finalevent == null ? null : finalevent.trim();
    }

    public String getFinaleventtime() {
        return finaleventtime;
    }

    public void setFinaleventtime(String finaleventtime) {
        this.finaleventtime = finaleventtime == null ? null : finaleventtime.trim();
    }

    public String getFinaleventtimeunit() {
        return finaleventtimeunit;
    }

    public void setFinaleventtimeunit(String finaleventtimeunit) {
        this.finaleventtimeunit = finaleventtimeunit == null ? null : finaleventtimeunit.trim();
    }

    public String getFinaleventtimeio() {
        return finaleventtimeio;
    }

    public void setFinaleventtimeio(String finaleventtimeio) {
        this.finaleventtimeio = finaleventtimeio == null ? null : finaleventtimeio.trim();
    }

    public String getFinaleventencounter() {
        return finaleventencounter;
    }

    public void setFinaleventencounter(String finaleventencounter) {
        this.finaleventencounter = finaleventencounter == null ? null : finaleventencounter.trim();
    }
}
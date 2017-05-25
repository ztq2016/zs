package com.clinicalresearch.dao.entity;

public class OuterInterface {
    private String interfaceid;

    private String interfacetype;

    private String interfaceaddr;

    private String interfaceapi;

    private String interfacecontent;

    public String getInterfaceid() {
        return interfaceid;
    }

    public void setInterfaceid(String interfaceid) {
        this.interfaceid = interfaceid == null ? null : interfaceid.trim();
    }

    public String getInterfacetype() {
        return interfacetype;
    }

    public void setInterfacetype(String interfacetype) {
        this.interfacetype = interfacetype == null ? null : interfacetype.trim();
    }

    public String getInterfaceaddr() {
        return interfaceaddr;
    }

    public void setInterfaceaddr(String interfaceaddr) {
        this.interfaceaddr = interfaceaddr == null ? null : interfaceaddr.trim();
    }

    public String getInterfaceapi() {
        return interfaceapi;
    }

    public void setInterfaceapi(String interfaceapi) {
        this.interfaceapi = interfaceapi == null ? null : interfaceapi.trim();
    }

    public String getInterfacecontent() {
        return interfacecontent;
    }

    public void setInterfacecontent(String interfacecontent) {
        this.interfacecontent = interfacecontent == null ? null : interfacecontent.trim();
    }
}
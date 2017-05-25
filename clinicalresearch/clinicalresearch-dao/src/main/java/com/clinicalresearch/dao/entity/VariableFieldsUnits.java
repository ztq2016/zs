package com.clinicalresearch.dao.entity;


public class VariableFieldsUnits {
    private String variableid;

    private String relationid;

    private String relationtype;

    public String getVariableid() {
        return variableid;
    }

    public void setVariableid(String variableid) {
        this.variableid = variableid == null ? null : variableid.trim();
    }

    public String getRelationid() {
        return relationid;
    }

    public void setRelationid(String relationid) {
        this.relationid = relationid == null ? null : relationid.trim();
    }

    public String getRelationtype() {
        return relationtype;
    }

    public void setRelationtype(String relationtype) {
        this.relationtype = relationtype == null ? null : relationtype.trim();
    }

    @Override
    public boolean equals(Object obj) {
    	
    	if (obj == null) {
    		return false;
    	}
    	
    	if (!( obj instanceof VariableFieldsUnits)) {
    		return false;
    	}
    	
    	VariableFieldsUnits temp = (VariableFieldsUnits)obj;
    	if (this.variableid.equals(temp.variableid) && this.relationid.equals(temp.relationid)) {
    		return true;
    	}
    	
    	return false;
    }
    
    @Override
    public int hashCode() {
    	return this.variableid.hashCode() + this.relationid.hashCode() + this.relationtype.hashCode();
    }
}
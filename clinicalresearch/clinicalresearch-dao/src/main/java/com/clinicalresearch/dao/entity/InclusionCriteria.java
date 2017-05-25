package com.clinicalresearch.dao.entity;

public class InclusionCriteria {
    private String criteriaid;

    private String criteriaexpression;

    private String expression;

    private String istrue;

    private String studyid;

    public String getCriteriaid() {
        return criteriaid;
    }

    public void setCriteriaid(String criteriaid) {
        this.criteriaid = criteriaid == null ? null : criteriaid.trim();
    }

    public String getCriteriaexpression() {
        return criteriaexpression;
    }

    public void setCriteriaexpression(String criteriaexpression) {
        this.criteriaexpression = criteriaexpression == null ? null : criteriaexpression.trim();
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression == null ? null : expression.trim();
    }

    public String getIstrue() {
        return istrue;
    }

    public void setIstrue(String istrue) {
        this.istrue = istrue == null ? null : istrue.trim();
    }

    public String getStudyid() {
        return studyid;
    }

    public void setStudyid(String studyid) {
        this.studyid = studyid == null ? null : studyid.trim();
    }
}
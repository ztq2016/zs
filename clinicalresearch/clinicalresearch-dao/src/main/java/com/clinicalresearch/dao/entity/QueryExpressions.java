package com.clinicalresearch.dao.entity;

import java.util.Date;

public class QueryExpressions {
    private String queryid;

    private String criteriaid;

    private String expression;

    private Date createdate;

    public String getQueryid() {
        return queryid;
    }

    public void setQueryid(String queryid) {
        this.queryid = queryid == null ? null : queryid.trim();
    }

    public String getCriteriaid() {
        return criteriaid;
    }

    public void setCriteriaid(String criteriaid) {
        this.criteriaid = criteriaid == null ? null : criteriaid.trim();
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression == null ? null : expression.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}
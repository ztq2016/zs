package com.clinicalresearch.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QueryExpressionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QueryExpressionsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andQueryidIsNull() {
            addCriterion("queryid is null");
            return (Criteria) this;
        }

        public Criteria andQueryidIsNotNull() {
            addCriterion("queryid is not null");
            return (Criteria) this;
        }

        public Criteria andQueryidEqualTo(String value) {
            addCriterion("queryid =", value, "queryid");
            return (Criteria) this;
        }

        public Criteria andQueryidNotEqualTo(String value) {
            addCriterion("queryid <>", value, "queryid");
            return (Criteria) this;
        }

        public Criteria andQueryidGreaterThan(String value) {
            addCriterion("queryid >", value, "queryid");
            return (Criteria) this;
        }

        public Criteria andQueryidGreaterThanOrEqualTo(String value) {
            addCriterion("queryid >=", value, "queryid");
            return (Criteria) this;
        }

        public Criteria andQueryidLessThan(String value) {
            addCriterion("queryid <", value, "queryid");
            return (Criteria) this;
        }

        public Criteria andQueryidLessThanOrEqualTo(String value) {
            addCriterion("queryid <=", value, "queryid");
            return (Criteria) this;
        }

        public Criteria andQueryidLike(String value) {
            addCriterion("queryid like", value, "queryid");
            return (Criteria) this;
        }

        public Criteria andQueryidNotLike(String value) {
            addCriterion("queryid not like", value, "queryid");
            return (Criteria) this;
        }

        public Criteria andQueryidIn(List<String> values) {
            addCriterion("queryid in", values, "queryid");
            return (Criteria) this;
        }

        public Criteria andQueryidNotIn(List<String> values) {
            addCriterion("queryid not in", values, "queryid");
            return (Criteria) this;
        }

        public Criteria andQueryidBetween(String value1, String value2) {
            addCriterion("queryid between", value1, value2, "queryid");
            return (Criteria) this;
        }

        public Criteria andQueryidNotBetween(String value1, String value2) {
            addCriterion("queryid not between", value1, value2, "queryid");
            return (Criteria) this;
        }

        public Criteria andCriteriaidIsNull() {
            addCriterion("criteriaid is null");
            return (Criteria) this;
        }

        public Criteria andCriteriaidIsNotNull() {
            addCriterion("criteriaid is not null");
            return (Criteria) this;
        }

        public Criteria andCriteriaidEqualTo(String value) {
            addCriterion("criteriaid =", value, "criteriaid");
            return (Criteria) this;
        }

        public Criteria andCriteriaidNotEqualTo(String value) {
            addCriterion("criteriaid <>", value, "criteriaid");
            return (Criteria) this;
        }

        public Criteria andCriteriaidGreaterThan(String value) {
            addCriterion("criteriaid >", value, "criteriaid");
            return (Criteria) this;
        }

        public Criteria andCriteriaidGreaterThanOrEqualTo(String value) {
            addCriterion("criteriaid >=", value, "criteriaid");
            return (Criteria) this;
        }

        public Criteria andCriteriaidLessThan(String value) {
            addCriterion("criteriaid <", value, "criteriaid");
            return (Criteria) this;
        }

        public Criteria andCriteriaidLessThanOrEqualTo(String value) {
            addCriterion("criteriaid <=", value, "criteriaid");
            return (Criteria) this;
        }

        public Criteria andCriteriaidLike(String value) {
            addCriterion("criteriaid like", value, "criteriaid");
            return (Criteria) this;
        }

        public Criteria andCriteriaidNotLike(String value) {
            addCriterion("criteriaid not like", value, "criteriaid");
            return (Criteria) this;
        }

        public Criteria andCriteriaidIn(List<String> values) {
            addCriterion("criteriaid in", values, "criteriaid");
            return (Criteria) this;
        }

        public Criteria andCriteriaidNotIn(List<String> values) {
            addCriterion("criteriaid not in", values, "criteriaid");
            return (Criteria) this;
        }

        public Criteria andCriteriaidBetween(String value1, String value2) {
            addCriterion("criteriaid between", value1, value2, "criteriaid");
            return (Criteria) this;
        }

        public Criteria andCriteriaidNotBetween(String value1, String value2) {
            addCriterion("criteriaid not between", value1, value2, "criteriaid");
            return (Criteria) this;
        }

        public Criteria andExpressionIsNull() {
            addCriterion("expression is null");
            return (Criteria) this;
        }

        public Criteria andExpressionIsNotNull() {
            addCriterion("expression is not null");
            return (Criteria) this;
        }

        public Criteria andExpressionEqualTo(String value) {
            addCriterion("expression =", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionNotEqualTo(String value) {
            addCriterion("expression <>", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionGreaterThan(String value) {
            addCriterion("expression >", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionGreaterThanOrEqualTo(String value) {
            addCriterion("expression >=", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionLessThan(String value) {
            addCriterion("expression <", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionLessThanOrEqualTo(String value) {
            addCriterion("expression <=", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionLike(String value) {
            addCriterion("expression like", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionNotLike(String value) {
            addCriterion("expression not like", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionIn(List<String> values) {
            addCriterion("expression in", values, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionNotIn(List<String> values) {
            addCriterion("expression not in", values, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionBetween(String value1, String value2) {
            addCriterion("expression between", value1, value2, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionNotBetween(String value1, String value2) {
            addCriterion("expression not between", value1, value2, "expression");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createdate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createdate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("createdate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("createdate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("createdate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("createdate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("createdate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("createdate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("createdate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("createdate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("createdate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("createdate not between", value1, value2, "createdate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
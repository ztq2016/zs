package com.clinicalresearch.dao.entity;

import java.util.ArrayList;
import java.util.List;

public class ResultPresentationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResultPresentationExample() {
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

        public Criteria andPresentationidIsNull() {
            addCriterion("presentationid is null");
            return (Criteria) this;
        }

        public Criteria andPresentationidIsNotNull() {
            addCriterion("presentationid is not null");
            return (Criteria) this;
        }

        public Criteria andPresentationidEqualTo(String value) {
            addCriterion("presentationid =", value, "presentationid");
            return (Criteria) this;
        }

        public Criteria andPresentationidNotEqualTo(String value) {
            addCriterion("presentationid <>", value, "presentationid");
            return (Criteria) this;
        }

        public Criteria andPresentationidGreaterThan(String value) {
            addCriterion("presentationid >", value, "presentationid");
            return (Criteria) this;
        }

        public Criteria andPresentationidGreaterThanOrEqualTo(String value) {
            addCriterion("presentationid >=", value, "presentationid");
            return (Criteria) this;
        }

        public Criteria andPresentationidLessThan(String value) {
            addCriterion("presentationid <", value, "presentationid");
            return (Criteria) this;
        }

        public Criteria andPresentationidLessThanOrEqualTo(String value) {
            addCriterion("presentationid <=", value, "presentationid");
            return (Criteria) this;
        }

        public Criteria andPresentationidLike(String value) {
            addCriterion("presentationid like", value, "presentationid");
            return (Criteria) this;
        }

        public Criteria andPresentationidNotLike(String value) {
            addCriterion("presentationid not like", value, "presentationid");
            return (Criteria) this;
        }

        public Criteria andPresentationidIn(List<String> values) {
            addCriterion("presentationid in", values, "presentationid");
            return (Criteria) this;
        }

        public Criteria andPresentationidNotIn(List<String> values) {
            addCriterion("presentationid not in", values, "presentationid");
            return (Criteria) this;
        }

        public Criteria andPresentationidBetween(String value1, String value2) {
            addCriterion("presentationid between", value1, value2, "presentationid");
            return (Criteria) this;
        }

        public Criteria andPresentationidNotBetween(String value1, String value2) {
            addCriterion("presentationid not between", value1, value2, "presentationid");
            return (Criteria) this;
        }

        public Criteria andPresentationtypeIsNull() {
            addCriterion("presentationtype is null");
            return (Criteria) this;
        }

        public Criteria andPresentationtypeIsNotNull() {
            addCriterion("presentationtype is not null");
            return (Criteria) this;
        }

        public Criteria andPresentationtypeEqualTo(String value) {
            addCriterion("presentationtype =", value, "presentationtype");
            return (Criteria) this;
        }

        public Criteria andPresentationtypeNotEqualTo(String value) {
            addCriterion("presentationtype <>", value, "presentationtype");
            return (Criteria) this;
        }

        public Criteria andPresentationtypeGreaterThan(String value) {
            addCriterion("presentationtype >", value, "presentationtype");
            return (Criteria) this;
        }

        public Criteria andPresentationtypeGreaterThanOrEqualTo(String value) {
            addCriterion("presentationtype >=", value, "presentationtype");
            return (Criteria) this;
        }

        public Criteria andPresentationtypeLessThan(String value) {
            addCriterion("presentationtype <", value, "presentationtype");
            return (Criteria) this;
        }

        public Criteria andPresentationtypeLessThanOrEqualTo(String value) {
            addCriterion("presentationtype <=", value, "presentationtype");
            return (Criteria) this;
        }

        public Criteria andPresentationtypeLike(String value) {
            addCriterion("presentationtype like", value, "presentationtype");
            return (Criteria) this;
        }

        public Criteria andPresentationtypeNotLike(String value) {
            addCriterion("presentationtype not like", value, "presentationtype");
            return (Criteria) this;
        }

        public Criteria andPresentationtypeIn(List<String> values) {
            addCriterion("presentationtype in", values, "presentationtype");
            return (Criteria) this;
        }

        public Criteria andPresentationtypeNotIn(List<String> values) {
            addCriterion("presentationtype not in", values, "presentationtype");
            return (Criteria) this;
        }

        public Criteria andPresentationtypeBetween(String value1, String value2) {
            addCriterion("presentationtype between", value1, value2, "presentationtype");
            return (Criteria) this;
        }

        public Criteria andPresentationtypeNotBetween(String value1, String value2) {
            addCriterion("presentationtype not between", value1, value2, "presentationtype");
            return (Criteria) this;
        }

        public Criteria andPresentationmodalIsNull() {
            addCriterion("presentationmodal is null");
            return (Criteria) this;
        }

        public Criteria andPresentationmodalIsNotNull() {
            addCriterion("presentationmodal is not null");
            return (Criteria) this;
        }

        public Criteria andPresentationmodalEqualTo(String value) {
            addCriterion("presentationmodal =", value, "presentationmodal");
            return (Criteria) this;
        }

        public Criteria andPresentationmodalNotEqualTo(String value) {
            addCriterion("presentationmodal <>", value, "presentationmodal");
            return (Criteria) this;
        }

        public Criteria andPresentationmodalGreaterThan(String value) {
            addCriterion("presentationmodal >", value, "presentationmodal");
            return (Criteria) this;
        }

        public Criteria andPresentationmodalGreaterThanOrEqualTo(String value) {
            addCriterion("presentationmodal >=", value, "presentationmodal");
            return (Criteria) this;
        }

        public Criteria andPresentationmodalLessThan(String value) {
            addCriterion("presentationmodal <", value, "presentationmodal");
            return (Criteria) this;
        }

        public Criteria andPresentationmodalLessThanOrEqualTo(String value) {
            addCriterion("presentationmodal <=", value, "presentationmodal");
            return (Criteria) this;
        }

        public Criteria andPresentationmodalLike(String value) {
            addCriterion("presentationmodal like", value, "presentationmodal");
            return (Criteria) this;
        }

        public Criteria andPresentationmodalNotLike(String value) {
            addCriterion("presentationmodal not like", value, "presentationmodal");
            return (Criteria) this;
        }

        public Criteria andPresentationmodalIn(List<String> values) {
            addCriterion("presentationmodal in", values, "presentationmodal");
            return (Criteria) this;
        }

        public Criteria andPresentationmodalNotIn(List<String> values) {
            addCriterion("presentationmodal not in", values, "presentationmodal");
            return (Criteria) this;
        }

        public Criteria andPresentationmodalBetween(String value1, String value2) {
            addCriterion("presentationmodal between", value1, value2, "presentationmodal");
            return (Criteria) this;
        }

        public Criteria andPresentationmodalNotBetween(String value1, String value2) {
            addCriterion("presentationmodal not between", value1, value2, "presentationmodal");
            return (Criteria) this;
        }

        public Criteria andStatisticalmodelidIsNull() {
            addCriterion("statisticalmodelid is null");
            return (Criteria) this;
        }

        public Criteria andStatisticalmodelidIsNotNull() {
            addCriterion("statisticalmodelid is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticalmodelidEqualTo(String value) {
            addCriterion("statisticalmodelid =", value, "statisticalmodelid");
            return (Criteria) this;
        }

        public Criteria andStatisticalmodelidNotEqualTo(String value) {
            addCriterion("statisticalmodelid <>", value, "statisticalmodelid");
            return (Criteria) this;
        }

        public Criteria andStatisticalmodelidGreaterThan(String value) {
            addCriterion("statisticalmodelid >", value, "statisticalmodelid");
            return (Criteria) this;
        }

        public Criteria andStatisticalmodelidGreaterThanOrEqualTo(String value) {
            addCriterion("statisticalmodelid >=", value, "statisticalmodelid");
            return (Criteria) this;
        }

        public Criteria andStatisticalmodelidLessThan(String value) {
            addCriterion("statisticalmodelid <", value, "statisticalmodelid");
            return (Criteria) this;
        }

        public Criteria andStatisticalmodelidLessThanOrEqualTo(String value) {
            addCriterion("statisticalmodelid <=", value, "statisticalmodelid");
            return (Criteria) this;
        }

        public Criteria andStatisticalmodelidLike(String value) {
            addCriterion("statisticalmodelid like", value, "statisticalmodelid");
            return (Criteria) this;
        }

        public Criteria andStatisticalmodelidNotLike(String value) {
            addCriterion("statisticalmodelid not like", value, "statisticalmodelid");
            return (Criteria) this;
        }

        public Criteria andStatisticalmodelidIn(List<String> values) {
            addCriterion("statisticalmodelid in", values, "statisticalmodelid");
            return (Criteria) this;
        }

        public Criteria andStatisticalmodelidNotIn(List<String> values) {
            addCriterion("statisticalmodelid not in", values, "statisticalmodelid");
            return (Criteria) this;
        }

        public Criteria andStatisticalmodelidBetween(String value1, String value2) {
            addCriterion("statisticalmodelid between", value1, value2, "statisticalmodelid");
            return (Criteria) this;
        }

        public Criteria andStatisticalmodelidNotBetween(String value1, String value2) {
            addCriterion("statisticalmodelid not between", value1, value2, "statisticalmodelid");
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
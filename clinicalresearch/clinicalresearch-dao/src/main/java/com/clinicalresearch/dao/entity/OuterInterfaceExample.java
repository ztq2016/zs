package com.clinicalresearch.dao.entity;

import java.util.ArrayList;
import java.util.List;

public class OuterInterfaceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OuterInterfaceExample() {
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

        public Criteria andInterfaceidIsNull() {
            addCriterion("interfaceid is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceidIsNotNull() {
            addCriterion("interfaceid is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceidEqualTo(String value) {
            addCriterion("interfaceid =", value, "interfaceid");
            return (Criteria) this;
        }

        public Criteria andInterfaceidNotEqualTo(String value) {
            addCriterion("interfaceid <>", value, "interfaceid");
            return (Criteria) this;
        }

        public Criteria andInterfaceidGreaterThan(String value) {
            addCriterion("interfaceid >", value, "interfaceid");
            return (Criteria) this;
        }

        public Criteria andInterfaceidGreaterThanOrEqualTo(String value) {
            addCriterion("interfaceid >=", value, "interfaceid");
            return (Criteria) this;
        }

        public Criteria andInterfaceidLessThan(String value) {
            addCriterion("interfaceid <", value, "interfaceid");
            return (Criteria) this;
        }

        public Criteria andInterfaceidLessThanOrEqualTo(String value) {
            addCriterion("interfaceid <=", value, "interfaceid");
            return (Criteria) this;
        }

        public Criteria andInterfaceidLike(String value) {
            addCriterion("interfaceid like", value, "interfaceid");
            return (Criteria) this;
        }

        public Criteria andInterfaceidNotLike(String value) {
            addCriterion("interfaceid not like", value, "interfaceid");
            return (Criteria) this;
        }

        public Criteria andInterfaceidIn(List<String> values) {
            addCriterion("interfaceid in", values, "interfaceid");
            return (Criteria) this;
        }

        public Criteria andInterfaceidNotIn(List<String> values) {
            addCriterion("interfaceid not in", values, "interfaceid");
            return (Criteria) this;
        }

        public Criteria andInterfaceidBetween(String value1, String value2) {
            addCriterion("interfaceid between", value1, value2, "interfaceid");
            return (Criteria) this;
        }

        public Criteria andInterfaceidNotBetween(String value1, String value2) {
            addCriterion("interfaceid not between", value1, value2, "interfaceid");
            return (Criteria) this;
        }

        public Criteria andInterfacetypeIsNull() {
            addCriterion("interfacetype is null");
            return (Criteria) this;
        }

        public Criteria andInterfacetypeIsNotNull() {
            addCriterion("interfacetype is not null");
            return (Criteria) this;
        }

        public Criteria andInterfacetypeEqualTo(String value) {
            addCriterion("interfacetype =", value, "interfacetype");
            return (Criteria) this;
        }

        public Criteria andInterfacetypeNotEqualTo(String value) {
            addCriterion("interfacetype <>", value, "interfacetype");
            return (Criteria) this;
        }

        public Criteria andInterfacetypeGreaterThan(String value) {
            addCriterion("interfacetype >", value, "interfacetype");
            return (Criteria) this;
        }

        public Criteria andInterfacetypeGreaterThanOrEqualTo(String value) {
            addCriterion("interfacetype >=", value, "interfacetype");
            return (Criteria) this;
        }

        public Criteria andInterfacetypeLessThan(String value) {
            addCriterion("interfacetype <", value, "interfacetype");
            return (Criteria) this;
        }

        public Criteria andInterfacetypeLessThanOrEqualTo(String value) {
            addCriterion("interfacetype <=", value, "interfacetype");
            return (Criteria) this;
        }

        public Criteria andInterfacetypeLike(String value) {
            addCriterion("interfacetype like", value, "interfacetype");
            return (Criteria) this;
        }

        public Criteria andInterfacetypeNotLike(String value) {
            addCriterion("interfacetype not like", value, "interfacetype");
            return (Criteria) this;
        }

        public Criteria andInterfacetypeIn(List<String> values) {
            addCriterion("interfacetype in", values, "interfacetype");
            return (Criteria) this;
        }

        public Criteria andInterfacetypeNotIn(List<String> values) {
            addCriterion("interfacetype not in", values, "interfacetype");
            return (Criteria) this;
        }

        public Criteria andInterfacetypeBetween(String value1, String value2) {
            addCriterion("interfacetype between", value1, value2, "interfacetype");
            return (Criteria) this;
        }

        public Criteria andInterfacetypeNotBetween(String value1, String value2) {
            addCriterion("interfacetype not between", value1, value2, "interfacetype");
            return (Criteria) this;
        }

        public Criteria andInterfaceaddrIsNull() {
            addCriterion("interfaceaddr is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceaddrIsNotNull() {
            addCriterion("interfaceaddr is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceaddrEqualTo(String value) {
            addCriterion("interfaceaddr =", value, "interfaceaddr");
            return (Criteria) this;
        }

        public Criteria andInterfaceaddrNotEqualTo(String value) {
            addCriterion("interfaceaddr <>", value, "interfaceaddr");
            return (Criteria) this;
        }

        public Criteria andInterfaceaddrGreaterThan(String value) {
            addCriterion("interfaceaddr >", value, "interfaceaddr");
            return (Criteria) this;
        }

        public Criteria andInterfaceaddrGreaterThanOrEqualTo(String value) {
            addCriterion("interfaceaddr >=", value, "interfaceaddr");
            return (Criteria) this;
        }

        public Criteria andInterfaceaddrLessThan(String value) {
            addCriterion("interfaceaddr <", value, "interfaceaddr");
            return (Criteria) this;
        }

        public Criteria andInterfaceaddrLessThanOrEqualTo(String value) {
            addCriterion("interfaceaddr <=", value, "interfaceaddr");
            return (Criteria) this;
        }

        public Criteria andInterfaceaddrLike(String value) {
            addCriterion("interfaceaddr like", value, "interfaceaddr");
            return (Criteria) this;
        }

        public Criteria andInterfaceaddrNotLike(String value) {
            addCriterion("interfaceaddr not like", value, "interfaceaddr");
            return (Criteria) this;
        }

        public Criteria andInterfaceaddrIn(List<String> values) {
            addCriterion("interfaceaddr in", values, "interfaceaddr");
            return (Criteria) this;
        }

        public Criteria andInterfaceaddrNotIn(List<String> values) {
            addCriterion("interfaceaddr not in", values, "interfaceaddr");
            return (Criteria) this;
        }

        public Criteria andInterfaceaddrBetween(String value1, String value2) {
            addCriterion("interfaceaddr between", value1, value2, "interfaceaddr");
            return (Criteria) this;
        }

        public Criteria andInterfaceaddrNotBetween(String value1, String value2) {
            addCriterion("interfaceaddr not between", value1, value2, "interfaceaddr");
            return (Criteria) this;
        }

        public Criteria andInterfaceapiIsNull() {
            addCriterion("interfaceapi is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceapiIsNotNull() {
            addCriterion("interfaceapi is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceapiEqualTo(String value) {
            addCriterion("interfaceapi =", value, "interfaceapi");
            return (Criteria) this;
        }

        public Criteria andInterfaceapiNotEqualTo(String value) {
            addCriterion("interfaceapi <>", value, "interfaceapi");
            return (Criteria) this;
        }

        public Criteria andInterfaceapiGreaterThan(String value) {
            addCriterion("interfaceapi >", value, "interfaceapi");
            return (Criteria) this;
        }

        public Criteria andInterfaceapiGreaterThanOrEqualTo(String value) {
            addCriterion("interfaceapi >=", value, "interfaceapi");
            return (Criteria) this;
        }

        public Criteria andInterfaceapiLessThan(String value) {
            addCriterion("interfaceapi <", value, "interfaceapi");
            return (Criteria) this;
        }

        public Criteria andInterfaceapiLessThanOrEqualTo(String value) {
            addCriterion("interfaceapi <=", value, "interfaceapi");
            return (Criteria) this;
        }

        public Criteria andInterfaceapiLike(String value) {
            addCriterion("interfaceapi like", value, "interfaceapi");
            return (Criteria) this;
        }

        public Criteria andInterfaceapiNotLike(String value) {
            addCriterion("interfaceapi not like", value, "interfaceapi");
            return (Criteria) this;
        }

        public Criteria andInterfaceapiIn(List<String> values) {
            addCriterion("interfaceapi in", values, "interfaceapi");
            return (Criteria) this;
        }

        public Criteria andInterfaceapiNotIn(List<String> values) {
            addCriterion("interfaceapi not in", values, "interfaceapi");
            return (Criteria) this;
        }

        public Criteria andInterfaceapiBetween(String value1, String value2) {
            addCriterion("interfaceapi between", value1, value2, "interfaceapi");
            return (Criteria) this;
        }

        public Criteria andInterfaceapiNotBetween(String value1, String value2) {
            addCriterion("interfaceapi not between", value1, value2, "interfaceapi");
            return (Criteria) this;
        }

        public Criteria andInterfacecontentIsNull() {
            addCriterion("interfacecontent is null");
            return (Criteria) this;
        }

        public Criteria andInterfacecontentIsNotNull() {
            addCriterion("interfacecontent is not null");
            return (Criteria) this;
        }

        public Criteria andInterfacecontentEqualTo(String value) {
            addCriterion("interfacecontent =", value, "interfacecontent");
            return (Criteria) this;
        }

        public Criteria andInterfacecontentNotEqualTo(String value) {
            addCriterion("interfacecontent <>", value, "interfacecontent");
            return (Criteria) this;
        }

        public Criteria andInterfacecontentGreaterThan(String value) {
            addCriterion("interfacecontent >", value, "interfacecontent");
            return (Criteria) this;
        }

        public Criteria andInterfacecontentGreaterThanOrEqualTo(String value) {
            addCriterion("interfacecontent >=", value, "interfacecontent");
            return (Criteria) this;
        }

        public Criteria andInterfacecontentLessThan(String value) {
            addCriterion("interfacecontent <", value, "interfacecontent");
            return (Criteria) this;
        }

        public Criteria andInterfacecontentLessThanOrEqualTo(String value) {
            addCriterion("interfacecontent <=", value, "interfacecontent");
            return (Criteria) this;
        }

        public Criteria andInterfacecontentLike(String value) {
            addCriterion("interfacecontent like", value, "interfacecontent");
            return (Criteria) this;
        }

        public Criteria andInterfacecontentNotLike(String value) {
            addCriterion("interfacecontent not like", value, "interfacecontent");
            return (Criteria) this;
        }

        public Criteria andInterfacecontentIn(List<String> values) {
            addCriterion("interfacecontent in", values, "interfacecontent");
            return (Criteria) this;
        }

        public Criteria andInterfacecontentNotIn(List<String> values) {
            addCriterion("interfacecontent not in", values, "interfacecontent");
            return (Criteria) this;
        }

        public Criteria andInterfacecontentBetween(String value1, String value2) {
            addCriterion("interfacecontent between", value1, value2, "interfacecontent");
            return (Criteria) this;
        }

        public Criteria andInterfacecontentNotBetween(String value1, String value2) {
            addCriterion("interfacecontent not between", value1, value2, "interfacecontent");
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
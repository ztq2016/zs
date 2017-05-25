package com.clinicalresearch.dao.entity;

import java.util.ArrayList;
import java.util.List;

public class ExportPlanVariablesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExportPlanVariablesExample() {
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

        public Criteria andLinkIdIsNull() {
            addCriterion("link_id is null");
            return (Criteria) this;
        }

        public Criteria andLinkIdIsNotNull() {
            addCriterion("link_id is not null");
            return (Criteria) this;
        }

        public Criteria andLinkIdEqualTo(Integer value) {
            addCriterion("link_id =", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdNotEqualTo(Integer value) {
            addCriterion("link_id <>", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdGreaterThan(Integer value) {
            addCriterion("link_id >", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("link_id >=", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdLessThan(Integer value) {
            addCriterion("link_id <", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdLessThanOrEqualTo(Integer value) {
            addCriterion("link_id <=", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdIn(List<Integer> values) {
            addCriterion("link_id in", values, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdNotIn(List<Integer> values) {
            addCriterion("link_id not in", values, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdBetween(Integer value1, Integer value2) {
            addCriterion("link_id between", value1, value2, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("link_id not between", value1, value2, "linkId");
            return (Criteria) this;
        }

        public Criteria andExpIdIsNull() {
            addCriterion("exp_id is null");
            return (Criteria) this;
        }

        public Criteria andExpIdIsNotNull() {
            addCriterion("exp_id is not null");
            return (Criteria) this;
        }

        public Criteria andExpIdEqualTo(Integer value) {
            addCriterion("exp_id =", value, "expId");
            return (Criteria) this;
        }

        public Criteria andExpIdNotEqualTo(Integer value) {
            addCriterion("exp_id <>", value, "expId");
            return (Criteria) this;
        }

        public Criteria andExpIdGreaterThan(Integer value) {
            addCriterion("exp_id >", value, "expId");
            return (Criteria) this;
        }

        public Criteria andExpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exp_id >=", value, "expId");
            return (Criteria) this;
        }

        public Criteria andExpIdLessThan(Integer value) {
            addCriterion("exp_id <", value, "expId");
            return (Criteria) this;
        }

        public Criteria andExpIdLessThanOrEqualTo(Integer value) {
            addCriterion("exp_id <=", value, "expId");
            return (Criteria) this;
        }

        public Criteria andExpIdIn(List<Integer> values) {
            addCriterion("exp_id in", values, "expId");
            return (Criteria) this;
        }

        public Criteria andExpIdNotIn(List<Integer> values) {
            addCriterion("exp_id not in", values, "expId");
            return (Criteria) this;
        }

        public Criteria andExpIdBetween(Integer value1, Integer value2) {
            addCriterion("exp_id between", value1, value2, "expId");
            return (Criteria) this;
        }

        public Criteria andExpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exp_id not between", value1, value2, "expId");
            return (Criteria) this;
        }

        public Criteria andVariableIdIsNull() {
            addCriterion("variable_id is null");
            return (Criteria) this;
        }

        public Criteria andVariableIdIsNotNull() {
            addCriterion("variable_id is not null");
            return (Criteria) this;
        }

        public Criteria andVariableIdEqualTo(String value) {
            addCriterion("variable_id =", value, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableIdNotEqualTo(String value) {
            addCriterion("variable_id <>", value, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableIdGreaterThan(String value) {
            addCriterion("variable_id >", value, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableIdGreaterThanOrEqualTo(String value) {
            addCriterion("variable_id >=", value, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableIdLessThan(String value) {
            addCriterion("variable_id <", value, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableIdLessThanOrEqualTo(String value) {
            addCriterion("variable_id <=", value, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableIdLike(String value) {
            addCriterion("variable_id like", value, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableIdNotLike(String value) {
            addCriterion("variable_id not like", value, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableIdIn(List<String> values) {
            addCriterion("variable_id in", values, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableIdNotIn(List<String> values) {
            addCriterion("variable_id not in", values, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableIdBetween(String value1, String value2) {
            addCriterion("variable_id between", value1, value2, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableIdNotBetween(String value1, String value2) {
            addCriterion("variable_id not between", value1, value2, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableOtherNameIsNull() {
            addCriterion("variable_other_name is null");
            return (Criteria) this;
        }

        public Criteria andVariableOtherNameIsNotNull() {
            addCriterion("variable_other_name is not null");
            return (Criteria) this;
        }

        public Criteria andVariableOtherNameEqualTo(String value) {
            addCriterion("variable_other_name =", value, "variableOtherName");
            return (Criteria) this;
        }

        public Criteria andVariableOtherNameNotEqualTo(String value) {
            addCriterion("variable_other_name <>", value, "variableOtherName");
            return (Criteria) this;
        }

        public Criteria andVariableOtherNameGreaterThan(String value) {
            addCriterion("variable_other_name >", value, "variableOtherName");
            return (Criteria) this;
        }

        public Criteria andVariableOtherNameGreaterThanOrEqualTo(String value) {
            addCriterion("variable_other_name >=", value, "variableOtherName");
            return (Criteria) this;
        }

        public Criteria andVariableOtherNameLessThan(String value) {
            addCriterion("variable_other_name <", value, "variableOtherName");
            return (Criteria) this;
        }

        public Criteria andVariableOtherNameLessThanOrEqualTo(String value) {
            addCriterion("variable_other_name <=", value, "variableOtherName");
            return (Criteria) this;
        }

        public Criteria andVariableOtherNameLike(String value) {
            addCriterion("variable_other_name like", value, "variableOtherName");
            return (Criteria) this;
        }

        public Criteria andVariableOtherNameNotLike(String value) {
            addCriterion("variable_other_name not like", value, "variableOtherName");
            return (Criteria) this;
        }

        public Criteria andVariableOtherNameIn(List<String> values) {
            addCriterion("variable_other_name in", values, "variableOtherName");
            return (Criteria) this;
        }

        public Criteria andVariableOtherNameNotIn(List<String> values) {
            addCriterion("variable_other_name not in", values, "variableOtherName");
            return (Criteria) this;
        }

        public Criteria andVariableOtherNameBetween(String value1, String value2) {
            addCriterion("variable_other_name between", value1, value2, "variableOtherName");
            return (Criteria) this;
        }

        public Criteria andVariableOtherNameNotBetween(String value1, String value2) {
            addCriterion("variable_other_name not between", value1, value2, "variableOtherName");
            return (Criteria) this;
        }

        public Criteria andVariableNameIsNull() {
            addCriterion("variable_name is null");
            return (Criteria) this;
        }

        public Criteria andVariableNameIsNotNull() {
            addCriterion("variable_name is not null");
            return (Criteria) this;
        }

        public Criteria andVariableNameEqualTo(String value) {
            addCriterion("variable_name =", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameNotEqualTo(String value) {
            addCriterion("variable_name <>", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameGreaterThan(String value) {
            addCriterion("variable_name >", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameGreaterThanOrEqualTo(String value) {
            addCriterion("variable_name >=", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameLessThan(String value) {
            addCriterion("variable_name <", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameLessThanOrEqualTo(String value) {
            addCriterion("variable_name <=", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameLike(String value) {
            addCriterion("variable_name like", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameNotLike(String value) {
            addCriterion("variable_name not like", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameIn(List<String> values) {
            addCriterion("variable_name in", values, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameNotIn(List<String> values) {
            addCriterion("variable_name not in", values, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameBetween(String value1, String value2) {
            addCriterion("variable_name between", value1, value2, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameNotBetween(String value1, String value2) {
            addCriterion("variable_name not between", value1, value2, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableFullNameIsNull() {
            addCriterion("variable_full_name is null");
            return (Criteria) this;
        }

        public Criteria andVariableFullNameIsNotNull() {
            addCriterion("variable_full_name is not null");
            return (Criteria) this;
        }

        public Criteria andVariableFullNameEqualTo(String value) {
            addCriterion("variable_full_name =", value, "variableFullName");
            return (Criteria) this;
        }

        public Criteria andVariableFullNameNotEqualTo(String value) {
            addCriterion("variable_full_name <>", value, "variableFullName");
            return (Criteria) this;
        }

        public Criteria andVariableFullNameGreaterThan(String value) {
            addCriterion("variable_full_name >", value, "variableFullName");
            return (Criteria) this;
        }

        public Criteria andVariableFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("variable_full_name >=", value, "variableFullName");
            return (Criteria) this;
        }

        public Criteria andVariableFullNameLessThan(String value) {
            addCriterion("variable_full_name <", value, "variableFullName");
            return (Criteria) this;
        }

        public Criteria andVariableFullNameLessThanOrEqualTo(String value) {
            addCriterion("variable_full_name <=", value, "variableFullName");
            return (Criteria) this;
        }

        public Criteria andVariableFullNameLike(String value) {
            addCriterion("variable_full_name like", value, "variableFullName");
            return (Criteria) this;
        }

        public Criteria andVariableFullNameNotLike(String value) {
            addCriterion("variable_full_name not like", value, "variableFullName");
            return (Criteria) this;
        }

        public Criteria andVariableFullNameIn(List<String> values) {
            addCriterion("variable_full_name in", values, "variableFullName");
            return (Criteria) this;
        }

        public Criteria andVariableFullNameNotIn(List<String> values) {
            addCriterion("variable_full_name not in", values, "variableFullName");
            return (Criteria) this;
        }

        public Criteria andVariableFullNameBetween(String value1, String value2) {
            addCriterion("variable_full_name between", value1, value2, "variableFullName");
            return (Criteria) this;
        }

        public Criteria andVariableFullNameNotBetween(String value1, String value2) {
            addCriterion("variable_full_name not between", value1, value2, "variableFullName");
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
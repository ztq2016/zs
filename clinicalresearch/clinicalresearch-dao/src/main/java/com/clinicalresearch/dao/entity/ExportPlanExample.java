package com.clinicalresearch.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExportPlanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExportPlanExample() {
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

        public Criteria andExpNameIsNull() {
            addCriterion("exp_name is null");
            return (Criteria) this;
        }

        public Criteria andExpNameIsNotNull() {
            addCriterion("exp_name is not null");
            return (Criteria) this;
        }

        public Criteria andExpNameEqualTo(String value) {
            addCriterion("exp_name =", value, "expName");
            return (Criteria) this;
        }

        public Criteria andExpNameNotEqualTo(String value) {
            addCriterion("exp_name <>", value, "expName");
            return (Criteria) this;
        }

        public Criteria andExpNameGreaterThan(String value) {
            addCriterion("exp_name >", value, "expName");
            return (Criteria) this;
        }

        public Criteria andExpNameGreaterThanOrEqualTo(String value) {
            addCriterion("exp_name >=", value, "expName");
            return (Criteria) this;
        }

        public Criteria andExpNameLessThan(String value) {
            addCriterion("exp_name <", value, "expName");
            return (Criteria) this;
        }

        public Criteria andExpNameLessThanOrEqualTo(String value) {
            addCriterion("exp_name <=", value, "expName");
            return (Criteria) this;
        }

        public Criteria andExpNameLike(String value) {
            addCriterion("exp_name like", value, "expName");
            return (Criteria) this;
        }

        public Criteria andExpNameNotLike(String value) {
            addCriterion("exp_name not like", value, "expName");
            return (Criteria) this;
        }

        public Criteria andExpNameIn(List<String> values) {
            addCriterion("exp_name in", values, "expName");
            return (Criteria) this;
        }

        public Criteria andExpNameNotIn(List<String> values) {
            addCriterion("exp_name not in", values, "expName");
            return (Criteria) this;
        }

        public Criteria andExpNameBetween(String value1, String value2) {
            addCriterion("exp_name between", value1, value2, "expName");
            return (Criteria) this;
        }

        public Criteria andExpNameNotBetween(String value1, String value2) {
            addCriterion("exp_name not between", value1, value2, "expName");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andExpTypeIsNull() {
            addCriterion("exp_type is null");
            return (Criteria) this;
        }

        public Criteria andExpTypeIsNotNull() {
            addCriterion("exp_type is not null");
            return (Criteria) this;
        }

        public Criteria andExpTypeEqualTo(String value) {
            addCriterion("exp_type =", value, "expType");
            return (Criteria) this;
        }

        public Criteria andExpTypeNotEqualTo(String value) {
            addCriterion("exp_type <>", value, "expType");
            return (Criteria) this;
        }

        public Criteria andExpTypeGreaterThan(String value) {
            addCriterion("exp_type >", value, "expType");
            return (Criteria) this;
        }

        public Criteria andExpTypeGreaterThanOrEqualTo(String value) {
            addCriterion("exp_type >=", value, "expType");
            return (Criteria) this;
        }

        public Criteria andExpTypeLessThan(String value) {
            addCriterion("exp_type <", value, "expType");
            return (Criteria) this;
        }

        public Criteria andExpTypeLessThanOrEqualTo(String value) {
            addCriterion("exp_type <=", value, "expType");
            return (Criteria) this;
        }

        public Criteria andExpTypeLike(String value) {
            addCriterion("exp_type like", value, "expType");
            return (Criteria) this;
        }

        public Criteria andExpTypeNotLike(String value) {
            addCriterion("exp_type not like", value, "expType");
            return (Criteria) this;
        }

        public Criteria andExpTypeIn(List<String> values) {
            addCriterion("exp_type in", values, "expType");
            return (Criteria) this;
        }

        public Criteria andExpTypeNotIn(List<String> values) {
            addCriterion("exp_type not in", values, "expType");
            return (Criteria) this;
        }

        public Criteria andExpTypeBetween(String value1, String value2) {
            addCriterion("exp_type between", value1, value2, "expType");
            return (Criteria) this;
        }

        public Criteria andExpTypeNotBetween(String value1, String value2) {
            addCriterion("exp_type not between", value1, value2, "expType");
            return (Criteria) this;
        }

        public Criteria andExpCreateTimeIsNull() {
            addCriterion("exp_create_time is null");
            return (Criteria) this;
        }

        public Criteria andExpCreateTimeIsNotNull() {
            addCriterion("exp_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpCreateTimeEqualTo(Date value) {
            addCriterion("exp_create_time =", value, "expCreateTime");
            return (Criteria) this;
        }

        public Criteria andExpCreateTimeNotEqualTo(Date value) {
            addCriterion("exp_create_time <>", value, "expCreateTime");
            return (Criteria) this;
        }

        public Criteria andExpCreateTimeGreaterThan(Date value) {
            addCriterion("exp_create_time >", value, "expCreateTime");
            return (Criteria) this;
        }

        public Criteria andExpCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exp_create_time >=", value, "expCreateTime");
            return (Criteria) this;
        }

        public Criteria andExpCreateTimeLessThan(Date value) {
            addCriterion("exp_create_time <", value, "expCreateTime");
            return (Criteria) this;
        }

        public Criteria andExpCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("exp_create_time <=", value, "expCreateTime");
            return (Criteria) this;
        }

        public Criteria andExpCreateTimeIn(List<Date> values) {
            addCriterion("exp_create_time in", values, "expCreateTime");
            return (Criteria) this;
        }

        public Criteria andExpCreateTimeNotIn(List<Date> values) {
            addCriterion("exp_create_time not in", values, "expCreateTime");
            return (Criteria) this;
        }

        public Criteria andExpCreateTimeBetween(Date value1, Date value2) {
            addCriterion("exp_create_time between", value1, value2, "expCreateTime");
            return (Criteria) this;
        }

        public Criteria andExpCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("exp_create_time not between", value1, value2, "expCreateTime");
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
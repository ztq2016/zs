package com.clinicalresearch.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SystemConfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SystemConfExample() {
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

        public Criteria andSysconfIdIsNull() {
            addCriterion("sysconf_id is null");
            return (Criteria) this;
        }

        public Criteria andSysconfIdIsNotNull() {
            addCriterion("sysconf_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysconfIdEqualTo(Integer value) {
            addCriterion("sysconf_id =", value, "sysconfId");
            return (Criteria) this;
        }

        public Criteria andSysconfIdNotEqualTo(Integer value) {
            addCriterion("sysconf_id <>", value, "sysconfId");
            return (Criteria) this;
        }

        public Criteria andSysconfIdGreaterThan(Integer value) {
            addCriterion("sysconf_id >", value, "sysconfId");
            return (Criteria) this;
        }

        public Criteria andSysconfIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sysconf_id >=", value, "sysconfId");
            return (Criteria) this;
        }

        public Criteria andSysconfIdLessThan(Integer value) {
            addCriterion("sysconf_id <", value, "sysconfId");
            return (Criteria) this;
        }

        public Criteria andSysconfIdLessThanOrEqualTo(Integer value) {
            addCriterion("sysconf_id <=", value, "sysconfId");
            return (Criteria) this;
        }

        public Criteria andSysconfIdIn(List<Integer> values) {
            addCriterion("sysconf_id in", values, "sysconfId");
            return (Criteria) this;
        }

        public Criteria andSysconfIdNotIn(List<Integer> values) {
            addCriterion("sysconf_id not in", values, "sysconfId");
            return (Criteria) this;
        }

        public Criteria andSysconfIdBetween(Integer value1, Integer value2) {
            addCriterion("sysconf_id between", value1, value2, "sysconfId");
            return (Criteria) this;
        }

        public Criteria andSysconfIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sysconf_id not between", value1, value2, "sysconfId");
            return (Criteria) this;
        }

        public Criteria andSysconfNameIsNull() {
            addCriterion("sysconf_name is null");
            return (Criteria) this;
        }

        public Criteria andSysconfNameIsNotNull() {
            addCriterion("sysconf_name is not null");
            return (Criteria) this;
        }

        public Criteria andSysconfNameEqualTo(String value) {
            addCriterion("sysconf_name =", value, "sysconfName");
            return (Criteria) this;
        }

        public Criteria andSysconfNameNotEqualTo(String value) {
            addCriterion("sysconf_name <>", value, "sysconfName");
            return (Criteria) this;
        }

        public Criteria andSysconfNameGreaterThan(String value) {
            addCriterion("sysconf_name >", value, "sysconfName");
            return (Criteria) this;
        }

        public Criteria andSysconfNameGreaterThanOrEqualTo(String value) {
            addCriterion("sysconf_name >=", value, "sysconfName");
            return (Criteria) this;
        }

        public Criteria andSysconfNameLessThan(String value) {
            addCriterion("sysconf_name <", value, "sysconfName");
            return (Criteria) this;
        }

        public Criteria andSysconfNameLessThanOrEqualTo(String value) {
            addCriterion("sysconf_name <=", value, "sysconfName");
            return (Criteria) this;
        }

        public Criteria andSysconfNameLike(String value) {
            addCriterion("sysconf_name like", value, "sysconfName");
            return (Criteria) this;
        }

        public Criteria andSysconfNameNotLike(String value) {
            addCriterion("sysconf_name not like", value, "sysconfName");
            return (Criteria) this;
        }

        public Criteria andSysconfNameIn(List<String> values) {
            addCriterion("sysconf_name in", values, "sysconfName");
            return (Criteria) this;
        }

        public Criteria andSysconfNameNotIn(List<String> values) {
            addCriterion("sysconf_name not in", values, "sysconfName");
            return (Criteria) this;
        }

        public Criteria andSysconfNameBetween(String value1, String value2) {
            addCriterion("sysconf_name between", value1, value2, "sysconfName");
            return (Criteria) this;
        }

        public Criteria andSysconfNameNotBetween(String value1, String value2) {
            addCriterion("sysconf_name not between", value1, value2, "sysconfName");
            return (Criteria) this;
        }

        public Criteria andSysconfValueIsNull() {
            addCriterion("sysconf_value is null");
            return (Criteria) this;
        }

        public Criteria andSysconfValueIsNotNull() {
            addCriterion("sysconf_value is not null");
            return (Criteria) this;
        }

        public Criteria andSysconfValueEqualTo(String value) {
            addCriterion("sysconf_value =", value, "sysconfValue");
            return (Criteria) this;
        }

        public Criteria andSysconfValueNotEqualTo(String value) {
            addCriterion("sysconf_value <>", value, "sysconfValue");
            return (Criteria) this;
        }

        public Criteria andSysconfValueGreaterThan(String value) {
            addCriterion("sysconf_value >", value, "sysconfValue");
            return (Criteria) this;
        }

        public Criteria andSysconfValueGreaterThanOrEqualTo(String value) {
            addCriterion("sysconf_value >=", value, "sysconfValue");
            return (Criteria) this;
        }

        public Criteria andSysconfValueLessThan(String value) {
            addCriterion("sysconf_value <", value, "sysconfValue");
            return (Criteria) this;
        }

        public Criteria andSysconfValueLessThanOrEqualTo(String value) {
            addCriterion("sysconf_value <=", value, "sysconfValue");
            return (Criteria) this;
        }

        public Criteria andSysconfValueLike(String value) {
            addCriterion("sysconf_value like", value, "sysconfValue");
            return (Criteria) this;
        }

        public Criteria andSysconfValueNotLike(String value) {
            addCriterion("sysconf_value not like", value, "sysconfValue");
            return (Criteria) this;
        }

        public Criteria andSysconfValueIn(List<String> values) {
            addCriterion("sysconf_value in", values, "sysconfValue");
            return (Criteria) this;
        }

        public Criteria andSysconfValueNotIn(List<String> values) {
            addCriterion("sysconf_value not in", values, "sysconfValue");
            return (Criteria) this;
        }

        public Criteria andSysconfValueBetween(String value1, String value2) {
            addCriterion("sysconf_value between", value1, value2, "sysconfValue");
            return (Criteria) this;
        }

        public Criteria andSysconfValueNotBetween(String value1, String value2) {
            addCriterion("sysconf_value not between", value1, value2, "sysconfValue");
            return (Criteria) this;
        }

        public Criteria andSysconfUpdateTimeIsNull() {
            addCriterion("sysconf_update_time is null");
            return (Criteria) this;
        }

        public Criteria andSysconfUpdateTimeIsNotNull() {
            addCriterion("sysconf_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andSysconfUpdateTimeEqualTo(Date value) {
            addCriterion("sysconf_update_time =", value, "sysconfUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysconfUpdateTimeNotEqualTo(Date value) {
            addCriterion("sysconf_update_time <>", value, "sysconfUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysconfUpdateTimeGreaterThan(Date value) {
            addCriterion("sysconf_update_time >", value, "sysconfUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysconfUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sysconf_update_time >=", value, "sysconfUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysconfUpdateTimeLessThan(Date value) {
            addCriterion("sysconf_update_time <", value, "sysconfUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysconfUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("sysconf_update_time <=", value, "sysconfUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysconfUpdateTimeIn(List<Date> values) {
            addCriterion("sysconf_update_time in", values, "sysconfUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysconfUpdateTimeNotIn(List<Date> values) {
            addCriterion("sysconf_update_time not in", values, "sysconfUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysconfUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("sysconf_update_time between", value1, value2, "sysconfUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysconfUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("sysconf_update_time not between", value1, value2, "sysconfUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysconfDescIsNull() {
            addCriterion("sysconf_desc is null");
            return (Criteria) this;
        }

        public Criteria andSysconfDescIsNotNull() {
            addCriterion("sysconf_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSysconfDescEqualTo(String value) {
            addCriterion("sysconf_desc =", value, "sysconfDesc");
            return (Criteria) this;
        }

        public Criteria andSysconfDescNotEqualTo(String value) {
            addCriterion("sysconf_desc <>", value, "sysconfDesc");
            return (Criteria) this;
        }

        public Criteria andSysconfDescGreaterThan(String value) {
            addCriterion("sysconf_desc >", value, "sysconfDesc");
            return (Criteria) this;
        }

        public Criteria andSysconfDescGreaterThanOrEqualTo(String value) {
            addCriterion("sysconf_desc >=", value, "sysconfDesc");
            return (Criteria) this;
        }

        public Criteria andSysconfDescLessThan(String value) {
            addCriterion("sysconf_desc <", value, "sysconfDesc");
            return (Criteria) this;
        }

        public Criteria andSysconfDescLessThanOrEqualTo(String value) {
            addCriterion("sysconf_desc <=", value, "sysconfDesc");
            return (Criteria) this;
        }

        public Criteria andSysconfDescLike(String value) {
            addCriterion("sysconf_desc like", value, "sysconfDesc");
            return (Criteria) this;
        }

        public Criteria andSysconfDescNotLike(String value) {
            addCriterion("sysconf_desc not like", value, "sysconfDesc");
            return (Criteria) this;
        }

        public Criteria andSysconfDescIn(List<String> values) {
            addCriterion("sysconf_desc in", values, "sysconfDesc");
            return (Criteria) this;
        }

        public Criteria andSysconfDescNotIn(List<String> values) {
            addCriterion("sysconf_desc not in", values, "sysconfDesc");
            return (Criteria) this;
        }

        public Criteria andSysconfDescBetween(String value1, String value2) {
            addCriterion("sysconf_desc between", value1, value2, "sysconfDesc");
            return (Criteria) this;
        }

        public Criteria andSysconfDescNotBetween(String value1, String value2) {
            addCriterion("sysconf_desc not between", value1, value2, "sysconfDesc");
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
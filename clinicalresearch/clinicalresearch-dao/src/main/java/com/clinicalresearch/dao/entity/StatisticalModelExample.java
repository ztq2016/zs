package com.clinicalresearch.dao.entity;

import java.util.ArrayList;
import java.util.List;

public class StatisticalModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StatisticalModelExample() {
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

        public Criteria andModelidIsNull() {
            addCriterion("modelid is null");
            return (Criteria) this;
        }

        public Criteria andModelidIsNotNull() {
            addCriterion("modelid is not null");
            return (Criteria) this;
        }

        public Criteria andModelidEqualTo(String value) {
            addCriterion("modelid =", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidNotEqualTo(String value) {
            addCriterion("modelid <>", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidGreaterThan(String value) {
            addCriterion("modelid >", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidGreaterThanOrEqualTo(String value) {
            addCriterion("modelid >=", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidLessThan(String value) {
            addCriterion("modelid <", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidLessThanOrEqualTo(String value) {
            addCriterion("modelid <=", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidLike(String value) {
            addCriterion("modelid like", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidNotLike(String value) {
            addCriterion("modelid not like", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidIn(List<String> values) {
            addCriterion("modelid in", values, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidNotIn(List<String> values) {
            addCriterion("modelid not in", values, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidBetween(String value1, String value2) {
            addCriterion("modelid between", value1, value2, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidNotBetween(String value1, String value2) {
            addCriterion("modelid not between", value1, value2, "modelid");
            return (Criteria) this;
        }

        public Criteria andStudyidIsNull() {
            addCriterion("studyid is null");
            return (Criteria) this;
        }

        public Criteria andStudyidIsNotNull() {
            addCriterion("studyid is not null");
            return (Criteria) this;
        }

        public Criteria andStudyidEqualTo(String value) {
            addCriterion("studyid =", value, "studyid");
            return (Criteria) this;
        }

        public Criteria andStudyidNotEqualTo(String value) {
            addCriterion("studyid <>", value, "studyid");
            return (Criteria) this;
        }

        public Criteria andStudyidGreaterThan(String value) {
            addCriterion("studyid >", value, "studyid");
            return (Criteria) this;
        }

        public Criteria andStudyidGreaterThanOrEqualTo(String value) {
            addCriterion("studyid >=", value, "studyid");
            return (Criteria) this;
        }

        public Criteria andStudyidLessThan(String value) {
            addCriterion("studyid <", value, "studyid");
            return (Criteria) this;
        }

        public Criteria andStudyidLessThanOrEqualTo(String value) {
            addCriterion("studyid <=", value, "studyid");
            return (Criteria) this;
        }

        public Criteria andStudyidLike(String value) {
            addCriterion("studyid like", value, "studyid");
            return (Criteria) this;
        }

        public Criteria andStudyidNotLike(String value) {
            addCriterion("studyid not like", value, "studyid");
            return (Criteria) this;
        }

        public Criteria andStudyidIn(List<String> values) {
            addCriterion("studyid in", values, "studyid");
            return (Criteria) this;
        }

        public Criteria andStudyidNotIn(List<String> values) {
            addCriterion("studyid not in", values, "studyid");
            return (Criteria) this;
        }

        public Criteria andStudyidBetween(String value1, String value2) {
            addCriterion("studyid between", value1, value2, "studyid");
            return (Criteria) this;
        }

        public Criteria andStudyidNotBetween(String value1, String value2) {
            addCriterion("studyid not between", value1, value2, "studyid");
            return (Criteria) this;
        }

        public Criteria andModelnameIsNull() {
            addCriterion("modelname is null");
            return (Criteria) this;
        }

        public Criteria andModelnameIsNotNull() {
            addCriterion("modelname is not null");
            return (Criteria) this;
        }

        public Criteria andModelnameEqualTo(String value) {
            addCriterion("modelname =", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameNotEqualTo(String value) {
            addCriterion("modelname <>", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameGreaterThan(String value) {
            addCriterion("modelname >", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameGreaterThanOrEqualTo(String value) {
            addCriterion("modelname >=", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameLessThan(String value) {
            addCriterion("modelname <", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameLessThanOrEqualTo(String value) {
            addCriterion("modelname <=", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameLike(String value) {
            addCriterion("modelname like", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameNotLike(String value) {
            addCriterion("modelname not like", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameIn(List<String> values) {
            addCriterion("modelname in", values, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameNotIn(List<String> values) {
            addCriterion("modelname not in", values, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameBetween(String value1, String value2) {
            addCriterion("modelname between", value1, value2, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameNotBetween(String value1, String value2) {
            addCriterion("modelname not between", value1, value2, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelbriefIsNull() {
            addCriterion("modelbrief is null");
            return (Criteria) this;
        }

        public Criteria andModelbriefIsNotNull() {
            addCriterion("modelbrief is not null");
            return (Criteria) this;
        }

        public Criteria andModelbriefEqualTo(String value) {
            addCriterion("modelbrief =", value, "modelbrief");
            return (Criteria) this;
        }

        public Criteria andModelbriefNotEqualTo(String value) {
            addCriterion("modelbrief <>", value, "modelbrief");
            return (Criteria) this;
        }

        public Criteria andModelbriefGreaterThan(String value) {
            addCriterion("modelbrief >", value, "modelbrief");
            return (Criteria) this;
        }

        public Criteria andModelbriefGreaterThanOrEqualTo(String value) {
            addCriterion("modelbrief >=", value, "modelbrief");
            return (Criteria) this;
        }

        public Criteria andModelbriefLessThan(String value) {
            addCriterion("modelbrief <", value, "modelbrief");
            return (Criteria) this;
        }

        public Criteria andModelbriefLessThanOrEqualTo(String value) {
            addCriterion("modelbrief <=", value, "modelbrief");
            return (Criteria) this;
        }

        public Criteria andModelbriefLike(String value) {
            addCriterion("modelbrief like", value, "modelbrief");
            return (Criteria) this;
        }

        public Criteria andModelbriefNotLike(String value) {
            addCriterion("modelbrief not like", value, "modelbrief");
            return (Criteria) this;
        }

        public Criteria andModelbriefIn(List<String> values) {
            addCriterion("modelbrief in", values, "modelbrief");
            return (Criteria) this;
        }

        public Criteria andModelbriefNotIn(List<String> values) {
            addCriterion("modelbrief not in", values, "modelbrief");
            return (Criteria) this;
        }

        public Criteria andModelbriefBetween(String value1, String value2) {
            addCriterion("modelbrief between", value1, value2, "modelbrief");
            return (Criteria) this;
        }

        public Criteria andModelbriefNotBetween(String value1, String value2) {
            addCriterion("modelbrief not between", value1, value2, "modelbrief");
            return (Criteria) this;
        }

        public Criteria andModelclasspathIsNull() {
            addCriterion("modelclasspath is null");
            return (Criteria) this;
        }

        public Criteria andModelclasspathIsNotNull() {
            addCriterion("modelclasspath is not null");
            return (Criteria) this;
        }

        public Criteria andModelclasspathEqualTo(String value) {
            addCriterion("modelclasspath =", value, "modelclasspath");
            return (Criteria) this;
        }

        public Criteria andModelclasspathNotEqualTo(String value) {
            addCriterion("modelclasspath <>", value, "modelclasspath");
            return (Criteria) this;
        }

        public Criteria andModelclasspathGreaterThan(String value) {
            addCriterion("modelclasspath >", value, "modelclasspath");
            return (Criteria) this;
        }

        public Criteria andModelclasspathGreaterThanOrEqualTo(String value) {
            addCriterion("modelclasspath >=", value, "modelclasspath");
            return (Criteria) this;
        }

        public Criteria andModelclasspathLessThan(String value) {
            addCriterion("modelclasspath <", value, "modelclasspath");
            return (Criteria) this;
        }

        public Criteria andModelclasspathLessThanOrEqualTo(String value) {
            addCriterion("modelclasspath <=", value, "modelclasspath");
            return (Criteria) this;
        }

        public Criteria andModelclasspathLike(String value) {
            addCriterion("modelclasspath like", value, "modelclasspath");
            return (Criteria) this;
        }

        public Criteria andModelclasspathNotLike(String value) {
            addCriterion("modelclasspath not like", value, "modelclasspath");
            return (Criteria) this;
        }

        public Criteria andModelclasspathIn(List<String> values) {
            addCriterion("modelclasspath in", values, "modelclasspath");
            return (Criteria) this;
        }

        public Criteria andModelclasspathNotIn(List<String> values) {
            addCriterion("modelclasspath not in", values, "modelclasspath");
            return (Criteria) this;
        }

        public Criteria andModelclasspathBetween(String value1, String value2) {
            addCriterion("modelclasspath between", value1, value2, "modelclasspath");
            return (Criteria) this;
        }

        public Criteria andModelclasspathNotBetween(String value1, String value2) {
            addCriterion("modelclasspath not between", value1, value2, "modelclasspath");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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
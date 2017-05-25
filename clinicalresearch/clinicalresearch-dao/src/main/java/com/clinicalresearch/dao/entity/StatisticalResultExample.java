package com.clinicalresearch.dao.entity;

import java.util.ArrayList;
import java.util.List;

public class StatisticalResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StatisticalResultExample() {
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

        public Criteria andResultidIsNull() {
            addCriterion("resultid is null");
            return (Criteria) this;
        }

        public Criteria andResultidIsNotNull() {
            addCriterion("resultid is not null");
            return (Criteria) this;
        }

        public Criteria andResultidEqualTo(String value) {
            addCriterion("resultid =", value, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidNotEqualTo(String value) {
            addCriterion("resultid <>", value, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidGreaterThan(String value) {
            addCriterion("resultid >", value, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidGreaterThanOrEqualTo(String value) {
            addCriterion("resultid >=", value, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidLessThan(String value) {
            addCriterion("resultid <", value, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidLessThanOrEqualTo(String value) {
            addCriterion("resultid <=", value, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidLike(String value) {
            addCriterion("resultid like", value, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidNotLike(String value) {
            addCriterion("resultid not like", value, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidIn(List<String> values) {
            addCriterion("resultid in", values, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidNotIn(List<String> values) {
            addCriterion("resultid not in", values, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidBetween(String value1, String value2) {
            addCriterion("resultid between", value1, value2, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidNotBetween(String value1, String value2) {
            addCriterion("resultid not between", value1, value2, "resultid");
            return (Criteria) this;
        }

        public Criteria andItemnameIsNull() {
            addCriterion("itemname is null");
            return (Criteria) this;
        }

        public Criteria andItemnameIsNotNull() {
            addCriterion("itemname is not null");
            return (Criteria) this;
        }

        public Criteria andItemnameEqualTo(String value) {
            addCriterion("itemname =", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotEqualTo(String value) {
            addCriterion("itemname <>", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameGreaterThan(String value) {
            addCriterion("itemname >", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameGreaterThanOrEqualTo(String value) {
            addCriterion("itemname >=", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLessThan(String value) {
            addCriterion("itemname <", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLessThanOrEqualTo(String value) {
            addCriterion("itemname <=", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLike(String value) {
            addCriterion("itemname like", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotLike(String value) {
            addCriterion("itemname not like", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameIn(List<String> values) {
            addCriterion("itemname in", values, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotIn(List<String> values) {
            addCriterion("itemname not in", values, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameBetween(String value1, String value2) {
            addCriterion("itemname between", value1, value2, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotBetween(String value1, String value2) {
            addCriterion("itemname not between", value1, value2, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemvalueIsNull() {
            addCriterion("itemvalue is null");
            return (Criteria) this;
        }

        public Criteria andItemvalueIsNotNull() {
            addCriterion("itemvalue is not null");
            return (Criteria) this;
        }

        public Criteria andItemvalueEqualTo(String value) {
            addCriterion("itemvalue =", value, "itemvalue");
            return (Criteria) this;
        }

        public Criteria andItemvalueNotEqualTo(String value) {
            addCriterion("itemvalue <>", value, "itemvalue");
            return (Criteria) this;
        }

        public Criteria andItemvalueGreaterThan(String value) {
            addCriterion("itemvalue >", value, "itemvalue");
            return (Criteria) this;
        }

        public Criteria andItemvalueGreaterThanOrEqualTo(String value) {
            addCriterion("itemvalue >=", value, "itemvalue");
            return (Criteria) this;
        }

        public Criteria andItemvalueLessThan(String value) {
            addCriterion("itemvalue <", value, "itemvalue");
            return (Criteria) this;
        }

        public Criteria andItemvalueLessThanOrEqualTo(String value) {
            addCriterion("itemvalue <=", value, "itemvalue");
            return (Criteria) this;
        }

        public Criteria andItemvalueLike(String value) {
            addCriterion("itemvalue like", value, "itemvalue");
            return (Criteria) this;
        }

        public Criteria andItemvalueNotLike(String value) {
            addCriterion("itemvalue not like", value, "itemvalue");
            return (Criteria) this;
        }

        public Criteria andItemvalueIn(List<String> values) {
            addCriterion("itemvalue in", values, "itemvalue");
            return (Criteria) this;
        }

        public Criteria andItemvalueNotIn(List<String> values) {
            addCriterion("itemvalue not in", values, "itemvalue");
            return (Criteria) this;
        }

        public Criteria andItemvalueBetween(String value1, String value2) {
            addCriterion("itemvalue between", value1, value2, "itemvalue");
            return (Criteria) this;
        }

        public Criteria andItemvalueNotBetween(String value1, String value2) {
            addCriterion("itemvalue not between", value1, value2, "itemvalue");
            return (Criteria) this;
        }

        public Criteria andIndicatoridIsNull() {
            addCriterion("indicatorid is null");
            return (Criteria) this;
        }

        public Criteria andIndicatoridIsNotNull() {
            addCriterion("indicatorid is not null");
            return (Criteria) this;
        }

        public Criteria andIndicatoridEqualTo(String value) {
            addCriterion("indicatorid =", value, "indicatorid");
            return (Criteria) this;
        }

        public Criteria andIndicatoridNotEqualTo(String value) {
            addCriterion("indicatorid <>", value, "indicatorid");
            return (Criteria) this;
        }

        public Criteria andIndicatoridGreaterThan(String value) {
            addCriterion("indicatorid >", value, "indicatorid");
            return (Criteria) this;
        }

        public Criteria andIndicatoridGreaterThanOrEqualTo(String value) {
            addCriterion("indicatorid >=", value, "indicatorid");
            return (Criteria) this;
        }

        public Criteria andIndicatoridLessThan(String value) {
            addCriterion("indicatorid <", value, "indicatorid");
            return (Criteria) this;
        }

        public Criteria andIndicatoridLessThanOrEqualTo(String value) {
            addCriterion("indicatorid <=", value, "indicatorid");
            return (Criteria) this;
        }

        public Criteria andIndicatoridLike(String value) {
            addCriterion("indicatorid like", value, "indicatorid");
            return (Criteria) this;
        }

        public Criteria andIndicatoridNotLike(String value) {
            addCriterion("indicatorid not like", value, "indicatorid");
            return (Criteria) this;
        }

        public Criteria andIndicatoridIn(List<String> values) {
            addCriterion("indicatorid in", values, "indicatorid");
            return (Criteria) this;
        }

        public Criteria andIndicatoridNotIn(List<String> values) {
            addCriterion("indicatorid not in", values, "indicatorid");
            return (Criteria) this;
        }

        public Criteria andIndicatoridBetween(String value1, String value2) {
            addCriterion("indicatorid between", value1, value2, "indicatorid");
            return (Criteria) this;
        }

        public Criteria andIndicatoridNotBetween(String value1, String value2) {
            addCriterion("indicatorid not between", value1, value2, "indicatorid");
            return (Criteria) this;
        }

        public Criteria andResulttypeIsNull() {
            addCriterion("resulttype is null");
            return (Criteria) this;
        }

        public Criteria andResulttypeIsNotNull() {
            addCriterion("resulttype is not null");
            return (Criteria) this;
        }

        public Criteria andResulttypeEqualTo(String value) {
            addCriterion("resulttype =", value, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeNotEqualTo(String value) {
            addCriterion("resulttype <>", value, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeGreaterThan(String value) {
            addCriterion("resulttype >", value, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeGreaterThanOrEqualTo(String value) {
            addCriterion("resulttype >=", value, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeLessThan(String value) {
            addCriterion("resulttype <", value, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeLessThanOrEqualTo(String value) {
            addCriterion("resulttype <=", value, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeLike(String value) {
            addCriterion("resulttype like", value, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeNotLike(String value) {
            addCriterion("resulttype not like", value, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeIn(List<String> values) {
            addCriterion("resulttype in", values, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeNotIn(List<String> values) {
            addCriterion("resulttype not in", values, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeBetween(String value1, String value2) {
            addCriterion("resulttype between", value1, value2, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeNotBetween(String value1, String value2) {
            addCriterion("resulttype not between", value1, value2, "resulttype");
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
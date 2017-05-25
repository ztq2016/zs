package com.clinicalresearch.dao.entity;

import java.util.ArrayList;
import java.util.List;

public class StudyinDicatorsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudyinDicatorsExample() {
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

        public Criteria andIndicatornameIsNull() {
            addCriterion("indicatorname is null");
            return (Criteria) this;
        }

        public Criteria andIndicatornameIsNotNull() {
            addCriterion("indicatorname is not null");
            return (Criteria) this;
        }

        public Criteria andIndicatornameEqualTo(String value) {
            addCriterion("indicatorname =", value, "indicatorname");
            return (Criteria) this;
        }

        public Criteria andIndicatornameNotEqualTo(String value) {
            addCriterion("indicatorname <>", value, "indicatorname");
            return (Criteria) this;
        }

        public Criteria andIndicatornameGreaterThan(String value) {
            addCriterion("indicatorname >", value, "indicatorname");
            return (Criteria) this;
        }

        public Criteria andIndicatornameGreaterThanOrEqualTo(String value) {
            addCriterion("indicatorname >=", value, "indicatorname");
            return (Criteria) this;
        }

        public Criteria andIndicatornameLessThan(String value) {
            addCriterion("indicatorname <", value, "indicatorname");
            return (Criteria) this;
        }

        public Criteria andIndicatornameLessThanOrEqualTo(String value) {
            addCriterion("indicatorname <=", value, "indicatorname");
            return (Criteria) this;
        }

        public Criteria andIndicatornameLike(String value) {
            addCriterion("indicatorname like", value, "indicatorname");
            return (Criteria) this;
        }

        public Criteria andIndicatornameNotLike(String value) {
            addCriterion("indicatorname not like", value, "indicatorname");
            return (Criteria) this;
        }

        public Criteria andIndicatornameIn(List<String> values) {
            addCriterion("indicatorname in", values, "indicatorname");
            return (Criteria) this;
        }

        public Criteria andIndicatornameNotIn(List<String> values) {
            addCriterion("indicatorname not in", values, "indicatorname");
            return (Criteria) this;
        }

        public Criteria andIndicatornameBetween(String value1, String value2) {
            addCriterion("indicatorname between", value1, value2, "indicatorname");
            return (Criteria) this;
        }

        public Criteria andIndicatornameNotBetween(String value1, String value2) {
            addCriterion("indicatorname not between", value1, value2, "indicatorname");
            return (Criteria) this;
        }

        public Criteria andClassificationidIsNull() {
            addCriterion("classificationid is null");
            return (Criteria) this;
        }

        public Criteria andClassificationidIsNotNull() {
            addCriterion("classificationid is not null");
            return (Criteria) this;
        }

        public Criteria andClassificationidEqualTo(String value) {
            addCriterion("classificationid =", value, "classificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationidNotEqualTo(String value) {
            addCriterion("classificationid <>", value, "classificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationidGreaterThan(String value) {
            addCriterion("classificationid >", value, "classificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationidGreaterThanOrEqualTo(String value) {
            addCriterion("classificationid >=", value, "classificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationidLessThan(String value) {
            addCriterion("classificationid <", value, "classificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationidLessThanOrEqualTo(String value) {
            addCriterion("classificationid <=", value, "classificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationidLike(String value) {
            addCriterion("classificationid like", value, "classificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationidNotLike(String value) {
            addCriterion("classificationid not like", value, "classificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationidIn(List<String> values) {
            addCriterion("classificationid in", values, "classificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationidNotIn(List<String> values) {
            addCriterion("classificationid not in", values, "classificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationidBetween(String value1, String value2) {
            addCriterion("classificationid between", value1, value2, "classificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationidNotBetween(String value1, String value2) {
            addCriterion("classificationid not between", value1, value2, "classificationid");
            return (Criteria) this;
        }

        public Criteria andFieldtableidIsNull() {
            addCriterion("fieldtableid is null");
            return (Criteria) this;
        }

        public Criteria andFieldtableidIsNotNull() {
            addCriterion("fieldtableid is not null");
            return (Criteria) this;
        }

        public Criteria andFieldtableidEqualTo(String value) {
            addCriterion("fieldtableid =", value, "fieldtableid");
            return (Criteria) this;
        }

        public Criteria andFieldtableidNotEqualTo(String value) {
            addCriterion("fieldtableid <>", value, "fieldtableid");
            return (Criteria) this;
        }

        public Criteria andFieldtableidGreaterThan(String value) {
            addCriterion("fieldtableid >", value, "fieldtableid");
            return (Criteria) this;
        }

        public Criteria andFieldtableidGreaterThanOrEqualTo(String value) {
            addCriterion("fieldtableid >=", value, "fieldtableid");
            return (Criteria) this;
        }

        public Criteria andFieldtableidLessThan(String value) {
            addCriterion("fieldtableid <", value, "fieldtableid");
            return (Criteria) this;
        }

        public Criteria andFieldtableidLessThanOrEqualTo(String value) {
            addCriterion("fieldtableid <=", value, "fieldtableid");
            return (Criteria) this;
        }

        public Criteria andFieldtableidLike(String value) {
            addCriterion("fieldtableid like", value, "fieldtableid");
            return (Criteria) this;
        }

        public Criteria andFieldtableidNotLike(String value) {
            addCriterion("fieldtableid not like", value, "fieldtableid");
            return (Criteria) this;
        }

        public Criteria andFieldtableidIn(List<String> values) {
            addCriterion("fieldtableid in", values, "fieldtableid");
            return (Criteria) this;
        }

        public Criteria andFieldtableidNotIn(List<String> values) {
            addCriterion("fieldtableid not in", values, "fieldtableid");
            return (Criteria) this;
        }

        public Criteria andFieldtableidBetween(String value1, String value2) {
            addCriterion("fieldtableid between", value1, value2, "fieldtableid");
            return (Criteria) this;
        }

        public Criteria andFieldtableidNotBetween(String value1, String value2) {
            addCriterion("fieldtableid not between", value1, value2, "fieldtableid");
            return (Criteria) this;
        }

        public Criteria andIndicatorexpressionIsNull() {
            addCriterion("indicatorexpression is null");
            return (Criteria) this;
        }

        public Criteria andIndicatorexpressionIsNotNull() {
            addCriterion("indicatorexpression is not null");
            return (Criteria) this;
        }

        public Criteria andIndicatorexpressionEqualTo(String value) {
            addCriterion("indicatorexpression =", value, "indicatorexpression");
            return (Criteria) this;
        }

        public Criteria andIndicatorexpressionNotEqualTo(String value) {
            addCriterion("indicatorexpression <>", value, "indicatorexpression");
            return (Criteria) this;
        }

        public Criteria andIndicatorexpressionGreaterThan(String value) {
            addCriterion("indicatorexpression >", value, "indicatorexpression");
            return (Criteria) this;
        }

        public Criteria andIndicatorexpressionGreaterThanOrEqualTo(String value) {
            addCriterion("indicatorexpression >=", value, "indicatorexpression");
            return (Criteria) this;
        }

        public Criteria andIndicatorexpressionLessThan(String value) {
            addCriterion("indicatorexpression <", value, "indicatorexpression");
            return (Criteria) this;
        }

        public Criteria andIndicatorexpressionLessThanOrEqualTo(String value) {
            addCriterion("indicatorexpression <=", value, "indicatorexpression");
            return (Criteria) this;
        }

        public Criteria andIndicatorexpressionLike(String value) {
            addCriterion("indicatorexpression like", value, "indicatorexpression");
            return (Criteria) this;
        }

        public Criteria andIndicatorexpressionNotLike(String value) {
            addCriterion("indicatorexpression not like", value, "indicatorexpression");
            return (Criteria) this;
        }

        public Criteria andIndicatorexpressionIn(List<String> values) {
            addCriterion("indicatorexpression in", values, "indicatorexpression");
            return (Criteria) this;
        }

        public Criteria andIndicatorexpressionNotIn(List<String> values) {
            addCriterion("indicatorexpression not in", values, "indicatorexpression");
            return (Criteria) this;
        }

        public Criteria andIndicatorexpressionBetween(String value1, String value2) {
            addCriterion("indicatorexpression between", value1, value2, "indicatorexpression");
            return (Criteria) this;
        }

        public Criteria andIndicatorexpressionNotBetween(String value1, String value2) {
            addCriterion("indicatorexpression not between", value1, value2, "indicatorexpression");
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
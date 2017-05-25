package com.clinicalresearch.dao.entity;

import java.util.ArrayList;
import java.util.List;

public class EmPiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmPiExample() {
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

        public Criteria andMasteridIsNull() {
            addCriterion("masterid is null");
            return (Criteria) this;
        }

        public Criteria andMasteridIsNotNull() {
            addCriterion("masterid is not null");
            return (Criteria) this;
        }

        public Criteria andMasteridEqualTo(String value) {
            addCriterion("masterid =", value, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridNotEqualTo(String value) {
            addCriterion("masterid <>", value, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridGreaterThan(String value) {
            addCriterion("masterid >", value, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridGreaterThanOrEqualTo(String value) {
            addCriterion("masterid >=", value, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridLessThan(String value) {
            addCriterion("masterid <", value, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridLessThanOrEqualTo(String value) {
            addCriterion("masterid <=", value, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridLike(String value) {
            addCriterion("masterid like", value, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridNotLike(String value) {
            addCriterion("masterid not like", value, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridIn(List<String> values) {
            addCriterion("masterid in", values, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridNotIn(List<String> values) {
            addCriterion("masterid not in", values, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridBetween(String value1, String value2) {
            addCriterion("masterid between", value1, value2, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridNotBetween(String value1, String value2) {
            addCriterion("masterid not between", value1, value2, "masterid");
            return (Criteria) this;
        }

        public Criteria andPatientidIsNull() {
            addCriterion("patientid is null");
            return (Criteria) this;
        }

        public Criteria andPatientidIsNotNull() {
            addCriterion("patientid is not null");
            return (Criteria) this;
        }

        public Criteria andPatientidEqualTo(String value) {
            addCriterion("patientid =", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidNotEqualTo(String value) {
            addCriterion("patientid <>", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidGreaterThan(String value) {
            addCriterion("patientid >", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidGreaterThanOrEqualTo(String value) {
            addCriterion("patientid >=", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidLessThan(String value) {
            addCriterion("patientid <", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidLessThanOrEqualTo(String value) {
            addCriterion("patientid <=", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidLike(String value) {
            addCriterion("patientid like", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidNotLike(String value) {
            addCriterion("patientid not like", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidIn(List<String> values) {
            addCriterion("patientid in", values, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidNotIn(List<String> values) {
            addCriterion("patientid not in", values, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidBetween(String value1, String value2) {
            addCriterion("patientid between", value1, value2, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidNotBetween(String value1, String value2) {
            addCriterion("patientid not between", value1, value2, "patientid");
            return (Criteria) this;
        }

        public Criteria andVisitidIsNull() {
            addCriterion("visitid is null");
            return (Criteria) this;
        }

        public Criteria andVisitidIsNotNull() {
            addCriterion("visitid is not null");
            return (Criteria) this;
        }

        public Criteria andVisitidEqualTo(String value) {
            addCriterion("visitid =", value, "visitid");
            return (Criteria) this;
        }

        public Criteria andVisitidNotEqualTo(String value) {
            addCriterion("visitid <>", value, "visitid");
            return (Criteria) this;
        }

        public Criteria andVisitidGreaterThan(String value) {
            addCriterion("visitid >", value, "visitid");
            return (Criteria) this;
        }

        public Criteria andVisitidGreaterThanOrEqualTo(String value) {
            addCriterion("visitid >=", value, "visitid");
            return (Criteria) this;
        }

        public Criteria andVisitidLessThan(String value) {
            addCriterion("visitid <", value, "visitid");
            return (Criteria) this;
        }

        public Criteria andVisitidLessThanOrEqualTo(String value) {
            addCriterion("visitid <=", value, "visitid");
            return (Criteria) this;
        }

        public Criteria andVisitidLike(String value) {
            addCriterion("visitid like", value, "visitid");
            return (Criteria) this;
        }

        public Criteria andVisitidNotLike(String value) {
            addCriterion("visitid not like", value, "visitid");
            return (Criteria) this;
        }

        public Criteria andVisitidIn(List<String> values) {
            addCriterion("visitid in", values, "visitid");
            return (Criteria) this;
        }

        public Criteria andVisitidNotIn(List<String> values) {
            addCriterion("visitid not in", values, "visitid");
            return (Criteria) this;
        }

        public Criteria andVisitidBetween(String value1, String value2) {
            addCriterion("visitid between", value1, value2, "visitid");
            return (Criteria) this;
        }

        public Criteria andVisitidNotBetween(String value1, String value2) {
            addCriterion("visitid not between", value1, value2, "visitid");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(String value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(String value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(String value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(String value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(String value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(String value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLike(String value) {
            addCriterion("age like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotLike(String value) {
            addCriterion("age not like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<String> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<String> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(String value1, String value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(String value1, String value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andPrincipaldiagnosisIsNull() {
            addCriterion("principaldiagnosis is null");
            return (Criteria) this;
        }

        public Criteria andPrincipaldiagnosisIsNotNull() {
            addCriterion("principaldiagnosis is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipaldiagnosisEqualTo(String value) {
            addCriterion("principaldiagnosis =", value, "principaldiagnosis");
            return (Criteria) this;
        }

        public Criteria andPrincipaldiagnosisNotEqualTo(String value) {
            addCriterion("principaldiagnosis <>", value, "principaldiagnosis");
            return (Criteria) this;
        }

        public Criteria andPrincipaldiagnosisGreaterThan(String value) {
            addCriterion("principaldiagnosis >", value, "principaldiagnosis");
            return (Criteria) this;
        }

        public Criteria andPrincipaldiagnosisGreaterThanOrEqualTo(String value) {
            addCriterion("principaldiagnosis >=", value, "principaldiagnosis");
            return (Criteria) this;
        }

        public Criteria andPrincipaldiagnosisLessThan(String value) {
            addCriterion("principaldiagnosis <", value, "principaldiagnosis");
            return (Criteria) this;
        }

        public Criteria andPrincipaldiagnosisLessThanOrEqualTo(String value) {
            addCriterion("principaldiagnosis <=", value, "principaldiagnosis");
            return (Criteria) this;
        }

        public Criteria andPrincipaldiagnosisLike(String value) {
            addCriterion("principaldiagnosis like", value, "principaldiagnosis");
            return (Criteria) this;
        }

        public Criteria andPrincipaldiagnosisNotLike(String value) {
            addCriterion("principaldiagnosis not like", value, "principaldiagnosis");
            return (Criteria) this;
        }

        public Criteria andPrincipaldiagnosisIn(List<String> values) {
            addCriterion("principaldiagnosis in", values, "principaldiagnosis");
            return (Criteria) this;
        }

        public Criteria andPrincipaldiagnosisNotIn(List<String> values) {
            addCriterion("principaldiagnosis not in", values, "principaldiagnosis");
            return (Criteria) this;
        }

        public Criteria andPrincipaldiagnosisBetween(String value1, String value2) {
            addCriterion("principaldiagnosis between", value1, value2, "principaldiagnosis");
            return (Criteria) this;
        }

        public Criteria andPrincipaldiagnosisNotBetween(String value1, String value2) {
            addCriterion("principaldiagnosis not between", value1, value2, "principaldiagnosis");
            return (Criteria) this;
        }

        public Criteria andOtherdiagnosisIsNull() {
            addCriterion("otherdiagnosis is null");
            return (Criteria) this;
        }

        public Criteria andOtherdiagnosisIsNotNull() {
            addCriterion("otherdiagnosis is not null");
            return (Criteria) this;
        }

        public Criteria andOtherdiagnosisEqualTo(String value) {
            addCriterion("otherdiagnosis =", value, "otherdiagnosis");
            return (Criteria) this;
        }

        public Criteria andOtherdiagnosisNotEqualTo(String value) {
            addCriterion("otherdiagnosis <>", value, "otherdiagnosis");
            return (Criteria) this;
        }

        public Criteria andOtherdiagnosisGreaterThan(String value) {
            addCriterion("otherdiagnosis >", value, "otherdiagnosis");
            return (Criteria) this;
        }

        public Criteria andOtherdiagnosisGreaterThanOrEqualTo(String value) {
            addCriterion("otherdiagnosis >=", value, "otherdiagnosis");
            return (Criteria) this;
        }

        public Criteria andOtherdiagnosisLessThan(String value) {
            addCriterion("otherdiagnosis <", value, "otherdiagnosis");
            return (Criteria) this;
        }

        public Criteria andOtherdiagnosisLessThanOrEqualTo(String value) {
            addCriterion("otherdiagnosis <=", value, "otherdiagnosis");
            return (Criteria) this;
        }

        public Criteria andOtherdiagnosisLike(String value) {
            addCriterion("otherdiagnosis like", value, "otherdiagnosis");
            return (Criteria) this;
        }

        public Criteria andOtherdiagnosisNotLike(String value) {
            addCriterion("otherdiagnosis not like", value, "otherdiagnosis");
            return (Criteria) this;
        }

        public Criteria andOtherdiagnosisIn(List<String> values) {
            addCriterion("otherdiagnosis in", values, "otherdiagnosis");
            return (Criteria) this;
        }

        public Criteria andOtherdiagnosisNotIn(List<String> values) {
            addCriterion("otherdiagnosis not in", values, "otherdiagnosis");
            return (Criteria) this;
        }

        public Criteria andOtherdiagnosisBetween(String value1, String value2) {
            addCriterion("otherdiagnosis between", value1, value2, "otherdiagnosis");
            return (Criteria) this;
        }

        public Criteria andOtherdiagnosisNotBetween(String value1, String value2) {
            addCriterion("otherdiagnosis not between", value1, value2, "otherdiagnosis");
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

        public Criteria andGroupidIsNull() {
            addCriterion("groupid is null");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNotNull() {
            addCriterion("groupid is not null");
            return (Criteria) this;
        }

        public Criteria andGroupidEqualTo(String value) {
            addCriterion("groupid =", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotEqualTo(String value) {
            addCriterion("groupid <>", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThan(String value) {
            addCriterion("groupid >", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThanOrEqualTo(String value) {
            addCriterion("groupid >=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThan(String value) {
            addCriterion("groupid <", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThanOrEqualTo(String value) {
            addCriterion("groupid <=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLike(String value) {
            addCriterion("groupid like", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotLike(String value) {
            addCriterion("groupid not like", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidIn(List<String> values) {
            addCriterion("groupid in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotIn(List<String> values) {
            addCriterion("groupid not in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidBetween(String value1, String value2) {
            addCriterion("groupid between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotBetween(String value1, String value2) {
            addCriterion("groupid not between", value1, value2, "groupid");
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
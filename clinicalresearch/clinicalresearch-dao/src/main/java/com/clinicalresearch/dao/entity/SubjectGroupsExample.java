package com.clinicalresearch.dao.entity;

import java.util.ArrayList;
import java.util.List;

public class SubjectGroupsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubjectGroupsExample() {
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

        public Criteria andGroupnameIsNull() {
            addCriterion("groupname is null");
            return (Criteria) this;
        }

        public Criteria andGroupnameIsNotNull() {
            addCriterion("groupname is not null");
            return (Criteria) this;
        }

        public Criteria andGroupnameEqualTo(String value) {
            addCriterion("groupname =", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotEqualTo(String value) {
            addCriterion("groupname <>", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameGreaterThan(String value) {
            addCriterion("groupname >", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameGreaterThanOrEqualTo(String value) {
            addCriterion("groupname >=", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLessThan(String value) {
            addCriterion("groupname <", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLessThanOrEqualTo(String value) {
            addCriterion("groupname <=", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLike(String value) {
            addCriterion("groupname like", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotLike(String value) {
            addCriterion("groupname not like", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameIn(List<String> values) {
            addCriterion("groupname in", values, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotIn(List<String> values) {
            addCriterion("groupname not in", values, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameBetween(String value1, String value2) {
            addCriterion("groupname between", value1, value2, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotBetween(String value1, String value2) {
            addCriterion("groupname not between", value1, value2, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupconditionIsNull() {
            addCriterion("groupcondition is null");
            return (Criteria) this;
        }

        public Criteria andGroupconditionIsNotNull() {
            addCriterion("groupcondition is not null");
            return (Criteria) this;
        }

        public Criteria andGroupconditionEqualTo(String value) {
            addCriterion("groupcondition =", value, "groupcondition");
            return (Criteria) this;
        }

        public Criteria andGroupconditionNotEqualTo(String value) {
            addCriterion("groupcondition <>", value, "groupcondition");
            return (Criteria) this;
        }

        public Criteria andGroupconditionGreaterThan(String value) {
            addCriterion("groupcondition >", value, "groupcondition");
            return (Criteria) this;
        }

        public Criteria andGroupconditionGreaterThanOrEqualTo(String value) {
            addCriterion("groupcondition >=", value, "groupcondition");
            return (Criteria) this;
        }

        public Criteria andGroupconditionLessThan(String value) {
            addCriterion("groupcondition <", value, "groupcondition");
            return (Criteria) this;
        }

        public Criteria andGroupconditionLessThanOrEqualTo(String value) {
            addCriterion("groupcondition <=", value, "groupcondition");
            return (Criteria) this;
        }

        public Criteria andGroupconditionLike(String value) {
            addCriterion("groupcondition like", value, "groupcondition");
            return (Criteria) this;
        }

        public Criteria andGroupconditionNotLike(String value) {
            addCriterion("groupcondition not like", value, "groupcondition");
            return (Criteria) this;
        }

        public Criteria andGroupconditionIn(List<String> values) {
            addCriterion("groupcondition in", values, "groupcondition");
            return (Criteria) this;
        }

        public Criteria andGroupconditionNotIn(List<String> values) {
            addCriterion("groupcondition not in", values, "groupcondition");
            return (Criteria) this;
        }

        public Criteria andGroupconditionBetween(String value1, String value2) {
            addCriterion("groupcondition between", value1, value2, "groupcondition");
            return (Criteria) this;
        }

        public Criteria andGroupconditionNotBetween(String value1, String value2) {
            addCriterion("groupcondition not between", value1, value2, "groupcondition");
            return (Criteria) this;
        }

        public Criteria andPatientsetIsNull() {
            addCriterion("patientset is null");
            return (Criteria) this;
        }

        public Criteria andPatientsetIsNotNull() {
            addCriterion("patientset is not null");
            return (Criteria) this;
        }

        public Criteria andPatientsetEqualTo(String value) {
            addCriterion("patientset =", value, "patientset");
            return (Criteria) this;
        }

        public Criteria andPatientsetNotEqualTo(String value) {
            addCriterion("patientset <>", value, "patientset");
            return (Criteria) this;
        }

        public Criteria andPatientsetGreaterThan(String value) {
            addCriterion("patientset >", value, "patientset");
            return (Criteria) this;
        }

        public Criteria andPatientsetGreaterThanOrEqualTo(String value) {
            addCriterion("patientset >=", value, "patientset");
            return (Criteria) this;
        }

        public Criteria andPatientsetLessThan(String value) {
            addCriterion("patientset <", value, "patientset");
            return (Criteria) this;
        }

        public Criteria andPatientsetLessThanOrEqualTo(String value) {
            addCriterion("patientset <=", value, "patientset");
            return (Criteria) this;
        }

        public Criteria andPatientsetLike(String value) {
            addCriterion("patientset like", value, "patientset");
            return (Criteria) this;
        }

        public Criteria andPatientsetNotLike(String value) {
            addCriterion("patientset not like", value, "patientset");
            return (Criteria) this;
        }

        public Criteria andPatientsetIn(List<String> values) {
            addCriterion("patientset in", values, "patientset");
            return (Criteria) this;
        }

        public Criteria andPatientsetNotIn(List<String> values) {
            addCriterion("patientset not in", values, "patientset");
            return (Criteria) this;
        }

        public Criteria andPatientsetBetween(String value1, String value2) {
            addCriterion("patientset between", value1, value2, "patientset");
            return (Criteria) this;
        }

        public Criteria andPatientsetNotBetween(String value1, String value2) {
            addCriterion("patientset not between", value1, value2, "patientset");
            return (Criteria) this;
        }

        public Criteria andGroupnumIsNull() {
            addCriterion("groupnum is null");
            return (Criteria) this;
        }

        public Criteria andGroupnumIsNotNull() {
            addCriterion("groupnum is not null");
            return (Criteria) this;
        }

        public Criteria andGroupnumEqualTo(String value) {
            addCriterion("groupnum =", value, "groupnum");
            return (Criteria) this;
        }

        public Criteria andGroupnumNotEqualTo(String value) {
            addCriterion("groupnum <>", value, "groupnum");
            return (Criteria) this;
        }

        public Criteria andGroupnumGreaterThan(String value) {
            addCriterion("groupnum >", value, "groupnum");
            return (Criteria) this;
        }

        public Criteria andGroupnumGreaterThanOrEqualTo(String value) {
            addCriterion("groupnum >=", value, "groupnum");
            return (Criteria) this;
        }

        public Criteria andGroupnumLessThan(String value) {
            addCriterion("groupnum <", value, "groupnum");
            return (Criteria) this;
        }

        public Criteria andGroupnumLessThanOrEqualTo(String value) {
            addCriterion("groupnum <=", value, "groupnum");
            return (Criteria) this;
        }

        public Criteria andGroupnumLike(String value) {
            addCriterion("groupnum like", value, "groupnum");
            return (Criteria) this;
        }

        public Criteria andGroupnumNotLike(String value) {
            addCriterion("groupnum not like", value, "groupnum");
            return (Criteria) this;
        }

        public Criteria andGroupnumIn(List<String> values) {
            addCriterion("groupnum in", values, "groupnum");
            return (Criteria) this;
        }

        public Criteria andGroupnumNotIn(List<String> values) {
            addCriterion("groupnum not in", values, "groupnum");
            return (Criteria) this;
        }

        public Criteria andGroupnumBetween(String value1, String value2) {
            addCriterion("groupnum between", value1, value2, "groupnum");
            return (Criteria) this;
        }

        public Criteria andGroupnumNotBetween(String value1, String value2) {
            addCriterion("groupnum not between", value1, value2, "groupnum");
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

        public Criteria andFatherIdIsNull() {
            addCriterion("father_id is null");
            return (Criteria) this;
        }

        public Criteria andFatherIdIsNotNull() {
            addCriterion("father_id is not null");
            return (Criteria) this;
        }

        public Criteria andFatherIdEqualTo(String value) {
            addCriterion("father_id =", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdNotEqualTo(String value) {
            addCriterion("father_id <>", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdGreaterThan(String value) {
            addCriterion("father_id >", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdGreaterThanOrEqualTo(String value) {
            addCriterion("father_id >=", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdLessThan(String value) {
            addCriterion("father_id <", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdLessThanOrEqualTo(String value) {
            addCriterion("father_id <=", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdLike(String value) {
            addCriterion("father_id like", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdNotLike(String value) {
            addCriterion("father_id not like", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdIn(List<String> values) {
            addCriterion("father_id in", values, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdNotIn(List<String> values) {
            addCriterion("father_id not in", values, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdBetween(String value1, String value2) {
            addCriterion("father_id between", value1, value2, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdNotBetween(String value1, String value2) {
            addCriterion("father_id not between", value1, value2, "fatherId");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("createtime like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("createtime not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
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
package com.clinicalresearch.dao.entity;

import java.util.ArrayList;
import java.util.List;

public class PatientSetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatientSetExample() {
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

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(Long value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(Long value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(Long value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(Long value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(Long value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(Long value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<Long> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<Long> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(Long value1, Long value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(Long value1, Long value2) {
            addCriterion("p_id not between", value1, value2, "pId");
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

        public Criteria andItemtypeIsNull() {
            addCriterion("itemtype is null");
            return (Criteria) this;
        }

        public Criteria andItemtypeIsNotNull() {
            addCriterion("itemtype is not null");
            return (Criteria) this;
        }

        public Criteria andItemtypeEqualTo(String value) {
            addCriterion("itemtype =", value, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeNotEqualTo(String value) {
            addCriterion("itemtype <>", value, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeGreaterThan(String value) {
            addCriterion("itemtype >", value, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeGreaterThanOrEqualTo(String value) {
            addCriterion("itemtype >=", value, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeLessThan(String value) {
            addCriterion("itemtype <", value, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeLessThanOrEqualTo(String value) {
            addCriterion("itemtype <=", value, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeLike(String value) {
            addCriterion("itemtype like", value, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeNotLike(String value) {
            addCriterion("itemtype not like", value, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeIn(List<String> values) {
            addCriterion("itemtype in", values, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeNotIn(List<String> values) {
            addCriterion("itemtype not in", values, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeBetween(String value1, String value2) {
            addCriterion("itemtype between", value1, value2, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeNotBetween(String value1, String value2) {
            addCriterion("itemtype not between", value1, value2, "itemtype");
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
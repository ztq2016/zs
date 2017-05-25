package com.clinicalresearch.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StudysExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudysExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andStudytnameIsNull() {
            addCriterion("studytname is null");
            return (Criteria) this;
        }

        public Criteria andStudytnameIsNotNull() {
            addCriterion("studytname is not null");
            return (Criteria) this;
        }

        public Criteria andStudytnameEqualTo(String value) {
            addCriterion("studytname =", value, "studytname");
            return (Criteria) this;
        }

        public Criteria andStudytnameNotEqualTo(String value) {
            addCriterion("studytname <>", value, "studytname");
            return (Criteria) this;
        }

        public Criteria andStudytnameGreaterThan(String value) {
            addCriterion("studytname >", value, "studytname");
            return (Criteria) this;
        }

        public Criteria andStudytnameGreaterThanOrEqualTo(String value) {
            addCriterion("studytname >=", value, "studytname");
            return (Criteria) this;
        }

        public Criteria andStudytnameLessThan(String value) {
            addCriterion("studytname <", value, "studytname");
            return (Criteria) this;
        }

        public Criteria andStudytnameLessThanOrEqualTo(String value) {
            addCriterion("studytname <=", value, "studytname");
            return (Criteria) this;
        }

        public Criteria andStudytnameLike(String value) {
            addCriterion("studytname like", value, "studytname");
            return (Criteria) this;
        }

        public Criteria andStudytnameNotLike(String value) {
            addCriterion("studytname not like", value, "studytname");
            return (Criteria) this;
        }

        public Criteria andStudytnameIn(List<String> values) {
            addCriterion("studytname in", values, "studytname");
            return (Criteria) this;
        }

        public Criteria andStudytnameNotIn(List<String> values) {
            addCriterion("studytname not in", values, "studytname");
            return (Criteria) this;
        }

        public Criteria andStudytnameBetween(String value1, String value2) {
            addCriterion("studytname between", value1, value2, "studytname");
            return (Criteria) this;
        }

        public Criteria andStudytnameNotBetween(String value1, String value2) {
            addCriterion("studytname not between", value1, value2, "studytname");
            return (Criteria) this;
        }

        public Criteria andStudytypeIsNull() {
            addCriterion("studytype is null");
            return (Criteria) this;
        }

        public Criteria andStudytypeIsNotNull() {
            addCriterion("studytype is not null");
            return (Criteria) this;
        }

        public Criteria andStudytypeEqualTo(String value) {
            addCriterion("studytype =", value, "studytype");
            return (Criteria) this;
        }

        public Criteria andStudytypeNotEqualTo(String value) {
            addCriterion("studytype <>", value, "studytype");
            return (Criteria) this;
        }

        public Criteria andStudytypeGreaterThan(String value) {
            addCriterion("studytype >", value, "studytype");
            return (Criteria) this;
        }

        public Criteria andStudytypeGreaterThanOrEqualTo(String value) {
            addCriterion("studytype >=", value, "studytype");
            return (Criteria) this;
        }

        public Criteria andStudytypeLessThan(String value) {
            addCriterion("studytype <", value, "studytype");
            return (Criteria) this;
        }

        public Criteria andStudytypeLessThanOrEqualTo(String value) {
            addCriterion("studytype <=", value, "studytype");
            return (Criteria) this;
        }

        public Criteria andStudytypeLike(String value) {
            addCriterion("studytype like", value, "studytype");
            return (Criteria) this;
        }

        public Criteria andStudytypeNotLike(String value) {
            addCriterion("studytype not like", value, "studytype");
            return (Criteria) this;
        }

        public Criteria andStudytypeIn(List<String> values) {
            addCriterion("studytype in", values, "studytype");
            return (Criteria) this;
        }

        public Criteria andStudytypeNotIn(List<String> values) {
            addCriterion("studytype not in", values, "studytype");
            return (Criteria) this;
        }

        public Criteria andStudytypeBetween(String value1, String value2) {
            addCriterion("studytype between", value1, value2, "studytype");
            return (Criteria) this;
        }

        public Criteria andStudytypeNotBetween(String value1, String value2) {
            addCriterion("studytype not between", value1, value2, "studytype");
            return (Criteria) this;
        }

        public Criteria andStudyobjectiveIsNull() {
            addCriterion("studyobjective is null");
            return (Criteria) this;
        }

        public Criteria andStudyobjectiveIsNotNull() {
            addCriterion("studyobjective is not null");
            return (Criteria) this;
        }

        public Criteria andStudyobjectiveEqualTo(String value) {
            addCriterion("studyobjective =", value, "studyobjective");
            return (Criteria) this;
        }

        public Criteria andStudyobjectiveNotEqualTo(String value) {
            addCriterion("studyobjective <>", value, "studyobjective");
            return (Criteria) this;
        }

        public Criteria andStudyobjectiveGreaterThan(String value) {
            addCriterion("studyobjective >", value, "studyobjective");
            return (Criteria) this;
        }

        public Criteria andStudyobjectiveGreaterThanOrEqualTo(String value) {
            addCriterion("studyobjective >=", value, "studyobjective");
            return (Criteria) this;
        }

        public Criteria andStudyobjectiveLessThan(String value) {
            addCriterion("studyobjective <", value, "studyobjective");
            return (Criteria) this;
        }

        public Criteria andStudyobjectiveLessThanOrEqualTo(String value) {
            addCriterion("studyobjective <=", value, "studyobjective");
            return (Criteria) this;
        }

        public Criteria andStudyobjectiveLike(String value) {
            addCriterion("studyobjective like", value, "studyobjective");
            return (Criteria) this;
        }

        public Criteria andStudyobjectiveNotLike(String value) {
            addCriterion("studyobjective not like", value, "studyobjective");
            return (Criteria) this;
        }

        public Criteria andStudyobjectiveIn(List<String> values) {
            addCriterion("studyobjective in", values, "studyobjective");
            return (Criteria) this;
        }

        public Criteria andStudyobjectiveNotIn(List<String> values) {
            addCriterion("studyobjective not in", values, "studyobjective");
            return (Criteria) this;
        }

        public Criteria andStudyobjectiveBetween(String value1, String value2) {
            addCriterion("studyobjective between", value1, value2, "studyobjective");
            return (Criteria) this;
        }

        public Criteria andStudyobjectiveNotBetween(String value1, String value2) {
            addCriterion("studyobjective not between", value1, value2, "studyobjective");
            return (Criteria) this;
        }

        public Criteria andPrincipalinvestigatorIsNull() {
            addCriterion("principalinvestigator is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalinvestigatorIsNotNull() {
            addCriterion("principalinvestigator is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalinvestigatorEqualTo(String value) {
            addCriterion("principalinvestigator =", value, "principalinvestigator");
            return (Criteria) this;
        }

        public Criteria andPrincipalinvestigatorNotEqualTo(String value) {
            addCriterion("principalinvestigator <>", value, "principalinvestigator");
            return (Criteria) this;
        }

        public Criteria andPrincipalinvestigatorGreaterThan(String value) {
            addCriterion("principalinvestigator >", value, "principalinvestigator");
            return (Criteria) this;
        }

        public Criteria andPrincipalinvestigatorGreaterThanOrEqualTo(String value) {
            addCriterion("principalinvestigator >=", value, "principalinvestigator");
            return (Criteria) this;
        }

        public Criteria andPrincipalinvestigatorLessThan(String value) {
            addCriterion("principalinvestigator <", value, "principalinvestigator");
            return (Criteria) this;
        }

        public Criteria andPrincipalinvestigatorLessThanOrEqualTo(String value) {
            addCriterion("principalinvestigator <=", value, "principalinvestigator");
            return (Criteria) this;
        }

        public Criteria andPrincipalinvestigatorLike(String value) {
            addCriterion("principalinvestigator like", value, "principalinvestigator");
            return (Criteria) this;
        }

        public Criteria andPrincipalinvestigatorNotLike(String value) {
            addCriterion("principalinvestigator not like", value, "principalinvestigator");
            return (Criteria) this;
        }

        public Criteria andPrincipalinvestigatorIn(List<String> values) {
            addCriterion("principalinvestigator in", values, "principalinvestigator");
            return (Criteria) this;
        }

        public Criteria andPrincipalinvestigatorNotIn(List<String> values) {
            addCriterion("principalinvestigator not in", values, "principalinvestigator");
            return (Criteria) this;
        }

        public Criteria andPrincipalinvestigatorBetween(String value1, String value2) {
            addCriterion("principalinvestigator between", value1, value2, "principalinvestigator");
            return (Criteria) this;
        }

        public Criteria andPrincipalinvestigatorNotBetween(String value1, String value2) {
            addCriterion("principalinvestigator not between", value1, value2, "principalinvestigator");
            return (Criteria) this;
        }

        public Criteria andBriefsummaryIsNull() {
            addCriterion("briefsummary is null");
            return (Criteria) this;
        }

        public Criteria andBriefsummaryIsNotNull() {
            addCriterion("briefsummary is not null");
            return (Criteria) this;
        }

        public Criteria andBriefsummaryEqualTo(String value) {
            addCriterion("briefsummary =", value, "briefsummary");
            return (Criteria) this;
        }

        public Criteria andBriefsummaryNotEqualTo(String value) {
            addCriterion("briefsummary <>", value, "briefsummary");
            return (Criteria) this;
        }

        public Criteria andBriefsummaryGreaterThan(String value) {
            addCriterion("briefsummary >", value, "briefsummary");
            return (Criteria) this;
        }

        public Criteria andBriefsummaryGreaterThanOrEqualTo(String value) {
            addCriterion("briefsummary >=", value, "briefsummary");
            return (Criteria) this;
        }

        public Criteria andBriefsummaryLessThan(String value) {
            addCriterion("briefsummary <", value, "briefsummary");
            return (Criteria) this;
        }

        public Criteria andBriefsummaryLessThanOrEqualTo(String value) {
            addCriterion("briefsummary <=", value, "briefsummary");
            return (Criteria) this;
        }

        public Criteria andBriefsummaryLike(String value) {
            addCriterion("briefsummary like", value, "briefsummary");
            return (Criteria) this;
        }

        public Criteria andBriefsummaryNotLike(String value) {
            addCriterion("briefsummary not like", value, "briefsummary");
            return (Criteria) this;
        }

        public Criteria andBriefsummaryIn(List<String> values) {
            addCriterion("briefsummary in", values, "briefsummary");
            return (Criteria) this;
        }

        public Criteria andBriefsummaryNotIn(List<String> values) {
            addCriterion("briefsummary not in", values, "briefsummary");
            return (Criteria) this;
        }

        public Criteria andBriefsummaryBetween(String value1, String value2) {
            addCriterion("briefsummary between", value1, value2, "briefsummary");
            return (Criteria) this;
        }

        public Criteria andBriefsummaryNotBetween(String value1, String value2) {
            addCriterion("briefsummary not between", value1, value2, "briefsummary");
            return (Criteria) this;
        }

        public Criteria andCollaboratorsIsNull() {
            addCriterion("collaborators is null");
            return (Criteria) this;
        }

        public Criteria andCollaboratorsIsNotNull() {
            addCriterion("collaborators is not null");
            return (Criteria) this;
        }

        public Criteria andCollaboratorsEqualTo(String value) {
            addCriterion("collaborators =", value, "collaborators");
            return (Criteria) this;
        }

        public Criteria andCollaboratorsNotEqualTo(String value) {
            addCriterion("collaborators <>", value, "collaborators");
            return (Criteria) this;
        }

        public Criteria andCollaboratorsGreaterThan(String value) {
            addCriterion("collaborators >", value, "collaborators");
            return (Criteria) this;
        }

        public Criteria andCollaboratorsGreaterThanOrEqualTo(String value) {
            addCriterion("collaborators >=", value, "collaborators");
            return (Criteria) this;
        }

        public Criteria andCollaboratorsLessThan(String value) {
            addCriterion("collaborators <", value, "collaborators");
            return (Criteria) this;
        }

        public Criteria andCollaboratorsLessThanOrEqualTo(String value) {
            addCriterion("collaborators <=", value, "collaborators");
            return (Criteria) this;
        }

        public Criteria andCollaboratorsLike(String value) {
            addCriterion("collaborators like", value, "collaborators");
            return (Criteria) this;
        }

        public Criteria andCollaboratorsNotLike(String value) {
            addCriterion("collaborators not like", value, "collaborators");
            return (Criteria) this;
        }

        public Criteria andCollaboratorsIn(List<String> values) {
            addCriterion("collaborators in", values, "collaborators");
            return (Criteria) this;
        }

        public Criteria andCollaboratorsNotIn(List<String> values) {
            addCriterion("collaborators not in", values, "collaborators");
            return (Criteria) this;
        }

        public Criteria andCollaboratorsBetween(String value1, String value2) {
            addCriterion("collaborators between", value1, value2, "collaborators");
            return (Criteria) this;
        }

        public Criteria andCollaboratorsNotBetween(String value1, String value2) {
            addCriterion("collaborators not between", value1, value2, "collaborators");
            return (Criteria) this;
        }

        public Criteria andAllocationIsNull() {
            addCriterion("allocation is null");
            return (Criteria) this;
        }

        public Criteria andAllocationIsNotNull() {
            addCriterion("allocation is not null");
            return (Criteria) this;
        }

        public Criteria andAllocationEqualTo(String value) {
            addCriterion("allocation =", value, "allocation");
            return (Criteria) this;
        }

        public Criteria andAllocationNotEqualTo(String value) {
            addCriterion("allocation <>", value, "allocation");
            return (Criteria) this;
        }

        public Criteria andAllocationGreaterThan(String value) {
            addCriterion("allocation >", value, "allocation");
            return (Criteria) this;
        }

        public Criteria andAllocationGreaterThanOrEqualTo(String value) {
            addCriterion("allocation >=", value, "allocation");
            return (Criteria) this;
        }

        public Criteria andAllocationLessThan(String value) {
            addCriterion("allocation <", value, "allocation");
            return (Criteria) this;
        }

        public Criteria andAllocationLessThanOrEqualTo(String value) {
            addCriterion("allocation <=", value, "allocation");
            return (Criteria) this;
        }

        public Criteria andAllocationLike(String value) {
            addCriterion("allocation like", value, "allocation");
            return (Criteria) this;
        }

        public Criteria andAllocationNotLike(String value) {
            addCriterion("allocation not like", value, "allocation");
            return (Criteria) this;
        }

        public Criteria andAllocationIn(List<String> values) {
            addCriterion("allocation in", values, "allocation");
            return (Criteria) this;
        }

        public Criteria andAllocationNotIn(List<String> values) {
            addCriterion("allocation not in", values, "allocation");
            return (Criteria) this;
        }

        public Criteria andAllocationBetween(String value1, String value2) {
            addCriterion("allocation between", value1, value2, "allocation");
            return (Criteria) this;
        }

        public Criteria andAllocationNotBetween(String value1, String value2) {
            addCriterion("allocation not between", value1, value2, "allocation");
            return (Criteria) this;
        }

        public Criteria andMaskingIsNull() {
            addCriterion("masking is null");
            return (Criteria) this;
        }

        public Criteria andMaskingIsNotNull() {
            addCriterion("masking is not null");
            return (Criteria) this;
        }

        public Criteria andMaskingEqualTo(String value) {
            addCriterion("masking =", value, "masking");
            return (Criteria) this;
        }

        public Criteria andMaskingNotEqualTo(String value) {
            addCriterion("masking <>", value, "masking");
            return (Criteria) this;
        }

        public Criteria andMaskingGreaterThan(String value) {
            addCriterion("masking >", value, "masking");
            return (Criteria) this;
        }

        public Criteria andMaskingGreaterThanOrEqualTo(String value) {
            addCriterion("masking >=", value, "masking");
            return (Criteria) this;
        }

        public Criteria andMaskingLessThan(String value) {
            addCriterion("masking <", value, "masking");
            return (Criteria) this;
        }

        public Criteria andMaskingLessThanOrEqualTo(String value) {
            addCriterion("masking <=", value, "masking");
            return (Criteria) this;
        }

        public Criteria andMaskingLike(String value) {
            addCriterion("masking like", value, "masking");
            return (Criteria) this;
        }

        public Criteria andMaskingNotLike(String value) {
            addCriterion("masking not like", value, "masking");
            return (Criteria) this;
        }

        public Criteria andMaskingIn(List<String> values) {
            addCriterion("masking in", values, "masking");
            return (Criteria) this;
        }

        public Criteria andMaskingNotIn(List<String> values) {
            addCriterion("masking not in", values, "masking");
            return (Criteria) this;
        }

        public Criteria andMaskingBetween(String value1, String value2) {
            addCriterion("masking between", value1, value2, "masking");
            return (Criteria) this;
        }

        public Criteria andMaskingNotBetween(String value1, String value2) {
            addCriterion("masking not between", value1, value2, "masking");
            return (Criteria) this;
        }

        public Criteria andInterventionmodelIsNull() {
            addCriterion("interventionmodel is null");
            return (Criteria) this;
        }

        public Criteria andInterventionmodelIsNotNull() {
            addCriterion("interventionmodel is not null");
            return (Criteria) this;
        }

        public Criteria andInterventionmodelEqualTo(String value) {
            addCriterion("interventionmodel =", value, "interventionmodel");
            return (Criteria) this;
        }

        public Criteria andInterventionmodelNotEqualTo(String value) {
            addCriterion("interventionmodel <>", value, "interventionmodel");
            return (Criteria) this;
        }

        public Criteria andInterventionmodelGreaterThan(String value) {
            addCriterion("interventionmodel >", value, "interventionmodel");
            return (Criteria) this;
        }

        public Criteria andInterventionmodelGreaterThanOrEqualTo(String value) {
            addCriterion("interventionmodel >=", value, "interventionmodel");
            return (Criteria) this;
        }

        public Criteria andInterventionmodelLessThan(String value) {
            addCriterion("interventionmodel <", value, "interventionmodel");
            return (Criteria) this;
        }

        public Criteria andInterventionmodelLessThanOrEqualTo(String value) {
            addCriterion("interventionmodel <=", value, "interventionmodel");
            return (Criteria) this;
        }

        public Criteria andInterventionmodelLike(String value) {
            addCriterion("interventionmodel like", value, "interventionmodel");
            return (Criteria) this;
        }

        public Criteria andInterventionmodelNotLike(String value) {
            addCriterion("interventionmodel not like", value, "interventionmodel");
            return (Criteria) this;
        }

        public Criteria andInterventionmodelIn(List<String> values) {
            addCriterion("interventionmodel in", values, "interventionmodel");
            return (Criteria) this;
        }

        public Criteria andInterventionmodelNotIn(List<String> values) {
            addCriterion("interventionmodel not in", values, "interventionmodel");
            return (Criteria) this;
        }

        public Criteria andInterventionmodelBetween(String value1, String value2) {
            addCriterion("interventionmodel between", value1, value2, "interventionmodel");
            return (Criteria) this;
        }

        public Criteria andInterventionmodelNotBetween(String value1, String value2) {
            addCriterion("interventionmodel not between", value1, value2, "interventionmodel");
            return (Criteria) this;
        }

        public Criteria andControlIsNull() {
            addCriterion("control is null");
            return (Criteria) this;
        }

        public Criteria andControlIsNotNull() {
            addCriterion("control is not null");
            return (Criteria) this;
        }

        public Criteria andControlEqualTo(String value) {
            addCriterion("control =", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlNotEqualTo(String value) {
            addCriterion("control <>", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlGreaterThan(String value) {
            addCriterion("control >", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlGreaterThanOrEqualTo(String value) {
            addCriterion("control >=", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlLessThan(String value) {
            addCriterion("control <", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlLessThanOrEqualTo(String value) {
            addCriterion("control <=", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlLike(String value) {
            addCriterion("control like", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlNotLike(String value) {
            addCriterion("control not like", value, "control");
            return (Criteria) this;
        }

        public Criteria andControlIn(List<String> values) {
            addCriterion("control in", values, "control");
            return (Criteria) this;
        }

        public Criteria andControlNotIn(List<String> values) {
            addCriterion("control not in", values, "control");
            return (Criteria) this;
        }

        public Criteria andControlBetween(String value1, String value2) {
            addCriterion("control between", value1, value2, "control");
            return (Criteria) this;
        }

        public Criteria andControlNotBetween(String value1, String value2) {
            addCriterion("control not between", value1, value2, "control");
            return (Criteria) this;
        }

        public Criteria andStudystatusIsNull() {
            addCriterion("studystatus is null");
            return (Criteria) this;
        }

        public Criteria andStudystatusIsNotNull() {
            addCriterion("studystatus is not null");
            return (Criteria) this;
        }

        public Criteria andStudystatusEqualTo(String value) {
            addCriterion("studystatus =", value, "studystatus");
            return (Criteria) this;
        }

        public Criteria andStudystatusNotEqualTo(String value) {
            addCriterion("studystatus <>", value, "studystatus");
            return (Criteria) this;
        }

        public Criteria andStudystatusGreaterThan(String value) {
            addCriterion("studystatus >", value, "studystatus");
            return (Criteria) this;
        }

        public Criteria andStudystatusGreaterThanOrEqualTo(String value) {
            addCriterion("studystatus >=", value, "studystatus");
            return (Criteria) this;
        }

        public Criteria andStudystatusLessThan(String value) {
            addCriterion("studystatus <", value, "studystatus");
            return (Criteria) this;
        }

        public Criteria andStudystatusLessThanOrEqualTo(String value) {
            addCriterion("studystatus <=", value, "studystatus");
            return (Criteria) this;
        }

        public Criteria andStudystatusLike(String value) {
            addCriterion("studystatus like", value, "studystatus");
            return (Criteria) this;
        }

        public Criteria andStudystatusNotLike(String value) {
            addCriterion("studystatus not like", value, "studystatus");
            return (Criteria) this;
        }

        public Criteria andStudystatusIn(List<String> values) {
            addCriterion("studystatus in", values, "studystatus");
            return (Criteria) this;
        }

        public Criteria andStudystatusNotIn(List<String> values) {
            addCriterion("studystatus not in", values, "studystatus");
            return (Criteria) this;
        }

        public Criteria andStudystatusBetween(String value1, String value2) {
            addCriterion("studystatus between", value1, value2, "studystatus");
            return (Criteria) this;
        }

        public Criteria andStudystatusNotBetween(String value1, String value2) {
            addCriterion("studystatus not between", value1, value2, "studystatus");
            return (Criteria) this;
        }

        public Criteria andStudystartdateIsNull() {
            addCriterion("studystartdate is null");
            return (Criteria) this;
        }

        public Criteria andStudystartdateIsNotNull() {
            addCriterion("studystartdate is not null");
            return (Criteria) this;
        }

        public Criteria andStudystartdateEqualTo(Date value) {
            addCriterionForJDBCDate("studystartdate =", value, "studystartdate");
            return (Criteria) this;
        }

        public Criteria andStudystartdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("studystartdate <>", value, "studystartdate");
            return (Criteria) this;
        }

        public Criteria andStudystartdateGreaterThan(Date value) {
            addCriterionForJDBCDate("studystartdate >", value, "studystartdate");
            return (Criteria) this;
        }

        public Criteria andStudystartdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("studystartdate >=", value, "studystartdate");
            return (Criteria) this;
        }

        public Criteria andStudystartdateLessThan(Date value) {
            addCriterionForJDBCDate("studystartdate <", value, "studystartdate");
            return (Criteria) this;
        }

        public Criteria andStudystartdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("studystartdate <=", value, "studystartdate");
            return (Criteria) this;
        }

        public Criteria andStudystartdateIn(List<Date> values) {
            addCriterionForJDBCDate("studystartdate in", values, "studystartdate");
            return (Criteria) this;
        }

        public Criteria andStudystartdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("studystartdate not in", values, "studystartdate");
            return (Criteria) this;
        }

        public Criteria andStudystartdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("studystartdate between", value1, value2, "studystartdate");
            return (Criteria) this;
        }

        public Criteria andStudystartdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("studystartdate not between", value1, value2, "studystartdate");
            return (Criteria) this;
        }

        public Criteria andStudycompletiondateIsNull() {
            addCriterion("studycompletiondate is null");
            return (Criteria) this;
        }

        public Criteria andStudycompletiondateIsNotNull() {
            addCriterion("studycompletiondate is not null");
            return (Criteria) this;
        }

        public Criteria andStudycompletiondateEqualTo(Date value) {
            addCriterionForJDBCDate("studycompletiondate =", value, "studycompletiondate");
            return (Criteria) this;
        }

        public Criteria andStudycompletiondateNotEqualTo(Date value) {
            addCriterionForJDBCDate("studycompletiondate <>", value, "studycompletiondate");
            return (Criteria) this;
        }

        public Criteria andStudycompletiondateGreaterThan(Date value) {
            addCriterionForJDBCDate("studycompletiondate >", value, "studycompletiondate");
            return (Criteria) this;
        }

        public Criteria andStudycompletiondateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("studycompletiondate >=", value, "studycompletiondate");
            return (Criteria) this;
        }

        public Criteria andStudycompletiondateLessThan(Date value) {
            addCriterionForJDBCDate("studycompletiondate <", value, "studycompletiondate");
            return (Criteria) this;
        }

        public Criteria andStudycompletiondateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("studycompletiondate <=", value, "studycompletiondate");
            return (Criteria) this;
        }

        public Criteria andStudycompletiondateIn(List<Date> values) {
            addCriterionForJDBCDate("studycompletiondate in", values, "studycompletiondate");
            return (Criteria) this;
        }

        public Criteria andStudycompletiondateNotIn(List<Date> values) {
            addCriterionForJDBCDate("studycompletiondate not in", values, "studycompletiondate");
            return (Criteria) this;
        }

        public Criteria andStudycompletiondateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("studycompletiondate between", value1, value2, "studycompletiondate");
            return (Criteria) this;
        }

        public Criteria andStudycompletiondateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("studycompletiondate not between", value1, value2, "studycompletiondate");
            return (Criteria) this;
        }

        public Criteria andSponsorIsNull() {
            addCriterion("sponsor is null");
            return (Criteria) this;
        }

        public Criteria andSponsorIsNotNull() {
            addCriterion("sponsor is not null");
            return (Criteria) this;
        }

        public Criteria andSponsorEqualTo(String value) {
            addCriterion("sponsor =", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorNotEqualTo(String value) {
            addCriterion("sponsor <>", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorGreaterThan(String value) {
            addCriterion("sponsor >", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorGreaterThanOrEqualTo(String value) {
            addCriterion("sponsor >=", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorLessThan(String value) {
            addCriterion("sponsor <", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorLessThanOrEqualTo(String value) {
            addCriterion("sponsor <=", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorLike(String value) {
            addCriterion("sponsor like", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorNotLike(String value) {
            addCriterion("sponsor not like", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorIn(List<String> values) {
            addCriterion("sponsor in", values, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorNotIn(List<String> values) {
            addCriterion("sponsor not in", values, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorBetween(String value1, String value2) {
            addCriterion("sponsor between", value1, value2, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorNotBetween(String value1, String value2) {
            addCriterion("sponsor not between", value1, value2, "sponsor");
            return (Criteria) this;
        }

        public Criteria andStatisticalmodelIsNull() {
            addCriterion("statisticalmodel is null");
            return (Criteria) this;
        }

        public Criteria andStatisticalmodelIsNotNull() {
            addCriterion("statisticalmodel is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticalmodelEqualTo(String value) {
            addCriterion("statisticalmodel =", value, "statisticalmodel");
            return (Criteria) this;
        }

        public Criteria andStatisticalmodelNotEqualTo(String value) {
            addCriterion("statisticalmodel <>", value, "statisticalmodel");
            return (Criteria) this;
        }

        public Criteria andStatisticalmodelGreaterThan(String value) {
            addCriterion("statisticalmodel >", value, "statisticalmodel");
            return (Criteria) this;
        }

        public Criteria andStatisticalmodelGreaterThanOrEqualTo(String value) {
            addCriterion("statisticalmodel >=", value, "statisticalmodel");
            return (Criteria) this;
        }

        public Criteria andStatisticalmodelLessThan(String value) {
            addCriterion("statisticalmodel <", value, "statisticalmodel");
            return (Criteria) this;
        }

        public Criteria andStatisticalmodelLessThanOrEqualTo(String value) {
            addCriterion("statisticalmodel <=", value, "statisticalmodel");
            return (Criteria) this;
        }

        public Criteria andStatisticalmodelLike(String value) {
            addCriterion("statisticalmodel like", value, "statisticalmodel");
            return (Criteria) this;
        }

        public Criteria andStatisticalmodelNotLike(String value) {
            addCriterion("statisticalmodel not like", value, "statisticalmodel");
            return (Criteria) this;
        }

        public Criteria andStatisticalmodelIn(List<String> values) {
            addCriterion("statisticalmodel in", values, "statisticalmodel");
            return (Criteria) this;
        }

        public Criteria andStatisticalmodelNotIn(List<String> values) {
            addCriterion("statisticalmodel not in", values, "statisticalmodel");
            return (Criteria) this;
        }

        public Criteria andStatisticalmodelBetween(String value1, String value2) {
            addCriterion("statisticalmodel between", value1, value2, "statisticalmodel");
            return (Criteria) this;
        }

        public Criteria andStatisticalmodelNotBetween(String value1, String value2) {
            addCriterion("statisticalmodel not between", value1, value2, "statisticalmodel");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNull() {
            addCriterion("timestamp is null");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNotNull() {
            addCriterion("timestamp is not null");
            return (Criteria) this;
        }

        public Criteria andTimestampEqualTo(Date value) {
            addCriterion("timestamp =", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotEqualTo(Date value) {
            addCriterion("timestamp <>", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThan(Date value) {
            addCriterion("timestamp >", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("timestamp >=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThan(Date value) {
            addCriterion("timestamp <", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThanOrEqualTo(Date value) {
            addCriterion("timestamp <=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampIn(List<Date> values) {
            addCriterion("timestamp in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotIn(List<Date> values) {
            addCriterion("timestamp not in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampBetween(Date value1, Date value2) {
            addCriterion("timestamp between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotBetween(Date value1, Date value2) {
            addCriterion("timestamp not between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andLockstatusIsNull() {
            addCriterion("lockstatus is null");
            return (Criteria) this;
        }

        public Criteria andLockstatusIsNotNull() {
            addCriterion("lockstatus is not null");
            return (Criteria) this;
        }

        public Criteria andLockstatusEqualTo(String value) {
            addCriterion("lockstatus =", value, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusNotEqualTo(String value) {
            addCriterion("lockstatus <>", value, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusGreaterThan(String value) {
            addCriterion("lockstatus >", value, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusGreaterThanOrEqualTo(String value) {
            addCriterion("lockstatus >=", value, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusLessThan(String value) {
            addCriterion("lockstatus <", value, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusLessThanOrEqualTo(String value) {
            addCriterion("lockstatus <=", value, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusLike(String value) {
            addCriterion("lockstatus like", value, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusNotLike(String value) {
            addCriterion("lockstatus not like", value, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusIn(List<String> values) {
            addCriterion("lockstatus in", values, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusNotIn(List<String> values) {
            addCriterion("lockstatus not in", values, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusBetween(String value1, String value2) {
            addCriterion("lockstatus between", value1, value2, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andLockstatusNotBetween(String value1, String value2) {
            addCriterion("lockstatus not between", value1, value2, "lockstatus");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("isdelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("isdelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(String value) {
            addCriterion("isdelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(String value) {
            addCriterion("isdelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(String value) {
            addCriterion("isdelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(String value) {
            addCriterion("isdelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(String value) {
            addCriterion("isdelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(String value) {
            addCriterion("isdelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLike(String value) {
            addCriterion("isdelete like", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotLike(String value) {
            addCriterion("isdelete not like", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<String> values) {
            addCriterion("isdelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<String> values) {
            addCriterion("isdelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(String value1, String value2) {
            addCriterion("isdelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(String value1, String value2) {
            addCriterion("isdelete not between", value1, value2, "isdelete");
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
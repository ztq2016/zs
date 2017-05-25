package com.clinicalresearch.dao.entity;

import java.util.ArrayList;
import java.util.List;

public class ModelTitestResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ModelTitestResultExample() {
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

        public Criteria andTitIdIsNull() {
            addCriterion("tit_id is null");
            return (Criteria) this;
        }

        public Criteria andTitIdIsNotNull() {
            addCriterion("tit_id is not null");
            return (Criteria) this;
        }

        public Criteria andTitIdEqualTo(Integer value) {
            addCriterion("tit_id =", value, "titId");
            return (Criteria) this;
        }

        public Criteria andTitIdNotEqualTo(Integer value) {
            addCriterion("tit_id <>", value, "titId");
            return (Criteria) this;
        }

        public Criteria andTitIdGreaterThan(Integer value) {
            addCriterion("tit_id >", value, "titId");
            return (Criteria) this;
        }

        public Criteria andTitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tit_id >=", value, "titId");
            return (Criteria) this;
        }

        public Criteria andTitIdLessThan(Integer value) {
            addCriterion("tit_id <", value, "titId");
            return (Criteria) this;
        }

        public Criteria andTitIdLessThanOrEqualTo(Integer value) {
            addCriterion("tit_id <=", value, "titId");
            return (Criteria) this;
        }

        public Criteria andTitIdIn(List<Integer> values) {
            addCriterion("tit_id in", values, "titId");
            return (Criteria) this;
        }

        public Criteria andTitIdNotIn(List<Integer> values) {
            addCriterion("tit_id not in", values, "titId");
            return (Criteria) this;
        }

        public Criteria andTitIdBetween(Integer value1, Integer value2) {
            addCriterion("tit_id between", value1, value2, "titId");
            return (Criteria) this;
        }

        public Criteria andTitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tit_id not between", value1, value2, "titId");
            return (Criteria) this;
        }

        public Criteria andStudyIdIsNull() {
            addCriterion("study_id is null");
            return (Criteria) this;
        }

        public Criteria andStudyIdIsNotNull() {
            addCriterion("study_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudyIdEqualTo(String value) {
            addCriterion("study_id =", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdNotEqualTo(String value) {
            addCriterion("study_id <>", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdGreaterThan(String value) {
            addCriterion("study_id >", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdGreaterThanOrEqualTo(String value) {
            addCriterion("study_id >=", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdLessThan(String value) {
            addCriterion("study_id <", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdLessThanOrEqualTo(String value) {
            addCriterion("study_id <=", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdLike(String value) {
            addCriterion("study_id like", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdNotLike(String value) {
            addCriterion("study_id not like", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdIn(List<String> values) {
            addCriterion("study_id in", values, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdNotIn(List<String> values) {
            addCriterion("study_id not in", values, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdBetween(String value1, String value2) {
            addCriterion("study_id between", value1, value2, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdNotBetween(String value1, String value2) {
            addCriterion("study_id not between", value1, value2, "studyId");
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

        public Criteria andGroupAIsNull() {
            addCriterion("group_a is null");
            return (Criteria) this;
        }

        public Criteria andGroupAIsNotNull() {
            addCriterion("group_a is not null");
            return (Criteria) this;
        }

        public Criteria andGroupAEqualTo(String value) {
            addCriterion("group_a =", value, "groupA");
            return (Criteria) this;
        }

        public Criteria andGroupANotEqualTo(String value) {
            addCriterion("group_a <>", value, "groupA");
            return (Criteria) this;
        }

        public Criteria andGroupAGreaterThan(String value) {
            addCriterion("group_a >", value, "groupA");
            return (Criteria) this;
        }

        public Criteria andGroupAGreaterThanOrEqualTo(String value) {
            addCriterion("group_a >=", value, "groupA");
            return (Criteria) this;
        }

        public Criteria andGroupALessThan(String value) {
            addCriterion("group_a <", value, "groupA");
            return (Criteria) this;
        }

        public Criteria andGroupALessThanOrEqualTo(String value) {
            addCriterion("group_a <=", value, "groupA");
            return (Criteria) this;
        }

        public Criteria andGroupALike(String value) {
            addCriterion("group_a like", value, "groupA");
            return (Criteria) this;
        }

        public Criteria andGroupANotLike(String value) {
            addCriterion("group_a not like", value, "groupA");
            return (Criteria) this;
        }

        public Criteria andGroupAIn(List<String> values) {
            addCriterion("group_a in", values, "groupA");
            return (Criteria) this;
        }

        public Criteria andGroupANotIn(List<String> values) {
            addCriterion("group_a not in", values, "groupA");
            return (Criteria) this;
        }

        public Criteria andGroupABetween(String value1, String value2) {
            addCriterion("group_a between", value1, value2, "groupA");
            return (Criteria) this;
        }

        public Criteria andGroupANotBetween(String value1, String value2) {
            addCriterion("group_a not between", value1, value2, "groupA");
            return (Criteria) this;
        }

        public Criteria andARankMeanIsNull() {
            addCriterion("a_rank_mean is null");
            return (Criteria) this;
        }

        public Criteria andARankMeanIsNotNull() {
            addCriterion("a_rank_mean is not null");
            return (Criteria) this;
        }

        public Criteria andARankMeanEqualTo(String value) {
            addCriterion("a_rank_mean =", value, "aRankMean");
            return (Criteria) this;
        }

        public Criteria andARankMeanNotEqualTo(String value) {
            addCriterion("a_rank_mean <>", value, "aRankMean");
            return (Criteria) this;
        }

        public Criteria andARankMeanGreaterThan(String value) {
            addCriterion("a_rank_mean >", value, "aRankMean");
            return (Criteria) this;
        }

        public Criteria andARankMeanGreaterThanOrEqualTo(String value) {
            addCriterion("a_rank_mean >=", value, "aRankMean");
            return (Criteria) this;
        }

        public Criteria andARankMeanLessThan(String value) {
            addCriterion("a_rank_mean <", value, "aRankMean");
            return (Criteria) this;
        }

        public Criteria andARankMeanLessThanOrEqualTo(String value) {
            addCriterion("a_rank_mean <=", value, "aRankMean");
            return (Criteria) this;
        }

        public Criteria andARankMeanLike(String value) {
            addCriterion("a_rank_mean like", value, "aRankMean");
            return (Criteria) this;
        }

        public Criteria andARankMeanNotLike(String value) {
            addCriterion("a_rank_mean not like", value, "aRankMean");
            return (Criteria) this;
        }

        public Criteria andARankMeanIn(List<String> values) {
            addCriterion("a_rank_mean in", values, "aRankMean");
            return (Criteria) this;
        }

        public Criteria andARankMeanNotIn(List<String> values) {
            addCriterion("a_rank_mean not in", values, "aRankMean");
            return (Criteria) this;
        }

        public Criteria andARankMeanBetween(String value1, String value2) {
            addCriterion("a_rank_mean between", value1, value2, "aRankMean");
            return (Criteria) this;
        }

        public Criteria andARankMeanNotBetween(String value1, String value2) {
            addCriterion("a_rank_mean not between", value1, value2, "aRankMean");
            return (Criteria) this;
        }

        public Criteria andARankSumIsNull() {
            addCriterion("a_rank_sum is null");
            return (Criteria) this;
        }

        public Criteria andARankSumIsNotNull() {
            addCriterion("a_rank_sum is not null");
            return (Criteria) this;
        }

        public Criteria andARankSumEqualTo(String value) {
            addCriterion("a_rank_sum =", value, "aRankSum");
            return (Criteria) this;
        }

        public Criteria andARankSumNotEqualTo(String value) {
            addCriterion("a_rank_sum <>", value, "aRankSum");
            return (Criteria) this;
        }

        public Criteria andARankSumGreaterThan(String value) {
            addCriterion("a_rank_sum >", value, "aRankSum");
            return (Criteria) this;
        }

        public Criteria andARankSumGreaterThanOrEqualTo(String value) {
            addCriterion("a_rank_sum >=", value, "aRankSum");
            return (Criteria) this;
        }

        public Criteria andARankSumLessThan(String value) {
            addCriterion("a_rank_sum <", value, "aRankSum");
            return (Criteria) this;
        }

        public Criteria andARankSumLessThanOrEqualTo(String value) {
            addCriterion("a_rank_sum <=", value, "aRankSum");
            return (Criteria) this;
        }

        public Criteria andARankSumLike(String value) {
            addCriterion("a_rank_sum like", value, "aRankSum");
            return (Criteria) this;
        }

        public Criteria andARankSumNotLike(String value) {
            addCriterion("a_rank_sum not like", value, "aRankSum");
            return (Criteria) this;
        }

        public Criteria andARankSumIn(List<String> values) {
            addCriterion("a_rank_sum in", values, "aRankSum");
            return (Criteria) this;
        }

        public Criteria andARankSumNotIn(List<String> values) {
            addCriterion("a_rank_sum not in", values, "aRankSum");
            return (Criteria) this;
        }

        public Criteria andARankSumBetween(String value1, String value2) {
            addCriterion("a_rank_sum between", value1, value2, "aRankSum");
            return (Criteria) this;
        }

        public Criteria andARankSumNotBetween(String value1, String value2) {
            addCriterion("a_rank_sum not between", value1, value2, "aRankSum");
            return (Criteria) this;
        }

        public Criteria andASampleSumIsNull() {
            addCriterion("a_sample_sum is null");
            return (Criteria) this;
        }

        public Criteria andASampleSumIsNotNull() {
            addCriterion("a_sample_sum is not null");
            return (Criteria) this;
        }

        public Criteria andASampleSumEqualTo(String value) {
            addCriterion("a_sample_sum =", value, "aSampleSum");
            return (Criteria) this;
        }

        public Criteria andASampleSumNotEqualTo(String value) {
            addCriterion("a_sample_sum <>", value, "aSampleSum");
            return (Criteria) this;
        }

        public Criteria andASampleSumGreaterThan(String value) {
            addCriterion("a_sample_sum >", value, "aSampleSum");
            return (Criteria) this;
        }

        public Criteria andASampleSumGreaterThanOrEqualTo(String value) {
            addCriterion("a_sample_sum >=", value, "aSampleSum");
            return (Criteria) this;
        }

        public Criteria andASampleSumLessThan(String value) {
            addCriterion("a_sample_sum <", value, "aSampleSum");
            return (Criteria) this;
        }

        public Criteria andASampleSumLessThanOrEqualTo(String value) {
            addCriterion("a_sample_sum <=", value, "aSampleSum");
            return (Criteria) this;
        }

        public Criteria andASampleSumLike(String value) {
            addCriterion("a_sample_sum like", value, "aSampleSum");
            return (Criteria) this;
        }

        public Criteria andASampleSumNotLike(String value) {
            addCriterion("a_sample_sum not like", value, "aSampleSum");
            return (Criteria) this;
        }

        public Criteria andASampleSumIn(List<String> values) {
            addCriterion("a_sample_sum in", values, "aSampleSum");
            return (Criteria) this;
        }

        public Criteria andASampleSumNotIn(List<String> values) {
            addCriterion("a_sample_sum not in", values, "aSampleSum");
            return (Criteria) this;
        }

        public Criteria andASampleSumBetween(String value1, String value2) {
            addCriterion("a_sample_sum between", value1, value2, "aSampleSum");
            return (Criteria) this;
        }

        public Criteria andASampleSumNotBetween(String value1, String value2) {
            addCriterion("a_sample_sum not between", value1, value2, "aSampleSum");
            return (Criteria) this;
        }

        public Criteria andGroupBIsNull() {
            addCriterion("group_b is null");
            return (Criteria) this;
        }

        public Criteria andGroupBIsNotNull() {
            addCriterion("group_b is not null");
            return (Criteria) this;
        }

        public Criteria andGroupBEqualTo(String value) {
            addCriterion("group_b =", value, "groupB");
            return (Criteria) this;
        }

        public Criteria andGroupBNotEqualTo(String value) {
            addCriterion("group_b <>", value, "groupB");
            return (Criteria) this;
        }

        public Criteria andGroupBGreaterThan(String value) {
            addCriterion("group_b >", value, "groupB");
            return (Criteria) this;
        }

        public Criteria andGroupBGreaterThanOrEqualTo(String value) {
            addCriterion("group_b >=", value, "groupB");
            return (Criteria) this;
        }

        public Criteria andGroupBLessThan(String value) {
            addCriterion("group_b <", value, "groupB");
            return (Criteria) this;
        }

        public Criteria andGroupBLessThanOrEqualTo(String value) {
            addCriterion("group_b <=", value, "groupB");
            return (Criteria) this;
        }

        public Criteria andGroupBLike(String value) {
            addCriterion("group_b like", value, "groupB");
            return (Criteria) this;
        }

        public Criteria andGroupBNotLike(String value) {
            addCriterion("group_b not like", value, "groupB");
            return (Criteria) this;
        }

        public Criteria andGroupBIn(List<String> values) {
            addCriterion("group_b in", values, "groupB");
            return (Criteria) this;
        }

        public Criteria andGroupBNotIn(List<String> values) {
            addCriterion("group_b not in", values, "groupB");
            return (Criteria) this;
        }

        public Criteria andGroupBBetween(String value1, String value2) {
            addCriterion("group_b between", value1, value2, "groupB");
            return (Criteria) this;
        }

        public Criteria andGroupBNotBetween(String value1, String value2) {
            addCriterion("group_b not between", value1, value2, "groupB");
            return (Criteria) this;
        }

        public Criteria andBRankMeanIsNull() {
            addCriterion("b_rank_mean is null");
            return (Criteria) this;
        }

        public Criteria andBRankMeanIsNotNull() {
            addCriterion("b_rank_mean is not null");
            return (Criteria) this;
        }

        public Criteria andBRankMeanEqualTo(String value) {
            addCriterion("b_rank_mean =", value, "bRankMean");
            return (Criteria) this;
        }

        public Criteria andBRankMeanNotEqualTo(String value) {
            addCriterion("b_rank_mean <>", value, "bRankMean");
            return (Criteria) this;
        }

        public Criteria andBRankMeanGreaterThan(String value) {
            addCriterion("b_rank_mean >", value, "bRankMean");
            return (Criteria) this;
        }

        public Criteria andBRankMeanGreaterThanOrEqualTo(String value) {
            addCriterion("b_rank_mean >=", value, "bRankMean");
            return (Criteria) this;
        }

        public Criteria andBRankMeanLessThan(String value) {
            addCriterion("b_rank_mean <", value, "bRankMean");
            return (Criteria) this;
        }

        public Criteria andBRankMeanLessThanOrEqualTo(String value) {
            addCriterion("b_rank_mean <=", value, "bRankMean");
            return (Criteria) this;
        }

        public Criteria andBRankMeanLike(String value) {
            addCriterion("b_rank_mean like", value, "bRankMean");
            return (Criteria) this;
        }

        public Criteria andBRankMeanNotLike(String value) {
            addCriterion("b_rank_mean not like", value, "bRankMean");
            return (Criteria) this;
        }

        public Criteria andBRankMeanIn(List<String> values) {
            addCriterion("b_rank_mean in", values, "bRankMean");
            return (Criteria) this;
        }

        public Criteria andBRankMeanNotIn(List<String> values) {
            addCriterion("b_rank_mean not in", values, "bRankMean");
            return (Criteria) this;
        }

        public Criteria andBRankMeanBetween(String value1, String value2) {
            addCriterion("b_rank_mean between", value1, value2, "bRankMean");
            return (Criteria) this;
        }

        public Criteria andBRankMeanNotBetween(String value1, String value2) {
            addCriterion("b_rank_mean not between", value1, value2, "bRankMean");
            return (Criteria) this;
        }

        public Criteria andBRankSumIsNull() {
            addCriterion("b_rank_sum is null");
            return (Criteria) this;
        }

        public Criteria andBRankSumIsNotNull() {
            addCriterion("b_rank_sum is not null");
            return (Criteria) this;
        }

        public Criteria andBRankSumEqualTo(String value) {
            addCriterion("b_rank_sum =", value, "bRankSum");
            return (Criteria) this;
        }

        public Criteria andBRankSumNotEqualTo(String value) {
            addCriterion("b_rank_sum <>", value, "bRankSum");
            return (Criteria) this;
        }

        public Criteria andBRankSumGreaterThan(String value) {
            addCriterion("b_rank_sum >", value, "bRankSum");
            return (Criteria) this;
        }

        public Criteria andBRankSumGreaterThanOrEqualTo(String value) {
            addCriterion("b_rank_sum >=", value, "bRankSum");
            return (Criteria) this;
        }

        public Criteria andBRankSumLessThan(String value) {
            addCriterion("b_rank_sum <", value, "bRankSum");
            return (Criteria) this;
        }

        public Criteria andBRankSumLessThanOrEqualTo(String value) {
            addCriterion("b_rank_sum <=", value, "bRankSum");
            return (Criteria) this;
        }

        public Criteria andBRankSumLike(String value) {
            addCriterion("b_rank_sum like", value, "bRankSum");
            return (Criteria) this;
        }

        public Criteria andBRankSumNotLike(String value) {
            addCriterion("b_rank_sum not like", value, "bRankSum");
            return (Criteria) this;
        }

        public Criteria andBRankSumIn(List<String> values) {
            addCriterion("b_rank_sum in", values, "bRankSum");
            return (Criteria) this;
        }

        public Criteria andBRankSumNotIn(List<String> values) {
            addCriterion("b_rank_sum not in", values, "bRankSum");
            return (Criteria) this;
        }

        public Criteria andBRankSumBetween(String value1, String value2) {
            addCriterion("b_rank_sum between", value1, value2, "bRankSum");
            return (Criteria) this;
        }

        public Criteria andBRankSumNotBetween(String value1, String value2) {
            addCriterion("b_rank_sum not between", value1, value2, "bRankSum");
            return (Criteria) this;
        }

        public Criteria andBSampleSumIsNull() {
            addCriterion("b_sample_sum is null");
            return (Criteria) this;
        }

        public Criteria andBSampleSumIsNotNull() {
            addCriterion("b_sample_sum is not null");
            return (Criteria) this;
        }

        public Criteria andBSampleSumEqualTo(String value) {
            addCriterion("b_sample_sum =", value, "bSampleSum");
            return (Criteria) this;
        }

        public Criteria andBSampleSumNotEqualTo(String value) {
            addCriterion("b_sample_sum <>", value, "bSampleSum");
            return (Criteria) this;
        }

        public Criteria andBSampleSumGreaterThan(String value) {
            addCriterion("b_sample_sum >", value, "bSampleSum");
            return (Criteria) this;
        }

        public Criteria andBSampleSumGreaterThanOrEqualTo(String value) {
            addCriterion("b_sample_sum >=", value, "bSampleSum");
            return (Criteria) this;
        }

        public Criteria andBSampleSumLessThan(String value) {
            addCriterion("b_sample_sum <", value, "bSampleSum");
            return (Criteria) this;
        }

        public Criteria andBSampleSumLessThanOrEqualTo(String value) {
            addCriterion("b_sample_sum <=", value, "bSampleSum");
            return (Criteria) this;
        }

        public Criteria andBSampleSumLike(String value) {
            addCriterion("b_sample_sum like", value, "bSampleSum");
            return (Criteria) this;
        }

        public Criteria andBSampleSumNotLike(String value) {
            addCriterion("b_sample_sum not like", value, "bSampleSum");
            return (Criteria) this;
        }

        public Criteria andBSampleSumIn(List<String> values) {
            addCriterion("b_sample_sum in", values, "bSampleSum");
            return (Criteria) this;
        }

        public Criteria andBSampleSumNotIn(List<String> values) {
            addCriterion("b_sample_sum not in", values, "bSampleSum");
            return (Criteria) this;
        }

        public Criteria andBSampleSumBetween(String value1, String value2) {
            addCriterion("b_sample_sum between", value1, value2, "bSampleSum");
            return (Criteria) this;
        }

        public Criteria andBSampleSumNotBetween(String value1, String value2) {
            addCriterion("b_sample_sum not between", value1, value2, "bSampleSum");
            return (Criteria) this;
        }

        public Criteria andSumAllIsNull() {
            addCriterion("sum_all is null");
            return (Criteria) this;
        }

        public Criteria andSumAllIsNotNull() {
            addCriterion("sum_all is not null");
            return (Criteria) this;
        }

        public Criteria andSumAllEqualTo(String value) {
            addCriterion("sum_all =", value, "sumAll");
            return (Criteria) this;
        }

        public Criteria andSumAllNotEqualTo(String value) {
            addCriterion("sum_all <>", value, "sumAll");
            return (Criteria) this;
        }

        public Criteria andSumAllGreaterThan(String value) {
            addCriterion("sum_all >", value, "sumAll");
            return (Criteria) this;
        }

        public Criteria andSumAllGreaterThanOrEqualTo(String value) {
            addCriterion("sum_all >=", value, "sumAll");
            return (Criteria) this;
        }

        public Criteria andSumAllLessThan(String value) {
            addCriterion("sum_all <", value, "sumAll");
            return (Criteria) this;
        }

        public Criteria andSumAllLessThanOrEqualTo(String value) {
            addCriterion("sum_all <=", value, "sumAll");
            return (Criteria) this;
        }

        public Criteria andSumAllLike(String value) {
            addCriterion("sum_all like", value, "sumAll");
            return (Criteria) this;
        }

        public Criteria andSumAllNotLike(String value) {
            addCriterion("sum_all not like", value, "sumAll");
            return (Criteria) this;
        }

        public Criteria andSumAllIn(List<String> values) {
            addCriterion("sum_all in", values, "sumAll");
            return (Criteria) this;
        }

        public Criteria andSumAllNotIn(List<String> values) {
            addCriterion("sum_all not in", values, "sumAll");
            return (Criteria) this;
        }

        public Criteria andSumAllBetween(String value1, String value2) {
            addCriterion("sum_all between", value1, value2, "sumAll");
            return (Criteria) this;
        }

        public Criteria andSumAllNotBetween(String value1, String value2) {
            addCriterion("sum_all not between", value1, value2, "sumAll");
            return (Criteria) this;
        }

        public Criteria andMwuIsNull() {
            addCriterion("mwu is null");
            return (Criteria) this;
        }

        public Criteria andMwuIsNotNull() {
            addCriterion("mwu is not null");
            return (Criteria) this;
        }

        public Criteria andMwuEqualTo(String value) {
            addCriterion("mwu =", value, "mwu");
            return (Criteria) this;
        }

        public Criteria andMwuNotEqualTo(String value) {
            addCriterion("mwu <>", value, "mwu");
            return (Criteria) this;
        }

        public Criteria andMwuGreaterThan(String value) {
            addCriterion("mwu >", value, "mwu");
            return (Criteria) this;
        }

        public Criteria andMwuGreaterThanOrEqualTo(String value) {
            addCriterion("mwu >=", value, "mwu");
            return (Criteria) this;
        }

        public Criteria andMwuLessThan(String value) {
            addCriterion("mwu <", value, "mwu");
            return (Criteria) this;
        }

        public Criteria andMwuLessThanOrEqualTo(String value) {
            addCriterion("mwu <=", value, "mwu");
            return (Criteria) this;
        }

        public Criteria andMwuLike(String value) {
            addCriterion("mwu like", value, "mwu");
            return (Criteria) this;
        }

        public Criteria andMwuNotLike(String value) {
            addCriterion("mwu not like", value, "mwu");
            return (Criteria) this;
        }

        public Criteria andMwuIn(List<String> values) {
            addCriterion("mwu in", values, "mwu");
            return (Criteria) this;
        }

        public Criteria andMwuNotIn(List<String> values) {
            addCriterion("mwu not in", values, "mwu");
            return (Criteria) this;
        }

        public Criteria andMwuBetween(String value1, String value2) {
            addCriterion("mwu between", value1, value2, "mwu");
            return (Criteria) this;
        }

        public Criteria andMwuNotBetween(String value1, String value2) {
            addCriterion("mwu not between", value1, value2, "mwu");
            return (Criteria) this;
        }

        public Criteria andZIsNull() {
            addCriterion("z is null");
            return (Criteria) this;
        }

        public Criteria andZIsNotNull() {
            addCriterion("z is not null");
            return (Criteria) this;
        }

        public Criteria andZEqualTo(String value) {
            addCriterion("z =", value, "z");
            return (Criteria) this;
        }

        public Criteria andZNotEqualTo(String value) {
            addCriterion("z <>", value, "z");
            return (Criteria) this;
        }

        public Criteria andZGreaterThan(String value) {
            addCriterion("z >", value, "z");
            return (Criteria) this;
        }

        public Criteria andZGreaterThanOrEqualTo(String value) {
            addCriterion("z >=", value, "z");
            return (Criteria) this;
        }

        public Criteria andZLessThan(String value) {
            addCriterion("z <", value, "z");
            return (Criteria) this;
        }

        public Criteria andZLessThanOrEqualTo(String value) {
            addCriterion("z <=", value, "z");
            return (Criteria) this;
        }

        public Criteria andZLike(String value) {
            addCriterion("z like", value, "z");
            return (Criteria) this;
        }

        public Criteria andZNotLike(String value) {
            addCriterion("z not like", value, "z");
            return (Criteria) this;
        }

        public Criteria andZIn(List<String> values) {
            addCriterion("z in", values, "z");
            return (Criteria) this;
        }

        public Criteria andZNotIn(List<String> values) {
            addCriterion("z not in", values, "z");
            return (Criteria) this;
        }

        public Criteria andZBetween(String value1, String value2) {
            addCriterion("z between", value1, value2, "z");
            return (Criteria) this;
        }

        public Criteria andZNotBetween(String value1, String value2) {
            addCriterion("z not between", value1, value2, "z");
            return (Criteria) this;
        }

        public Criteria andPValueIsNull() {
            addCriterion("p_value is null");
            return (Criteria) this;
        }

        public Criteria andPValueIsNotNull() {
            addCriterion("p_value is not null");
            return (Criteria) this;
        }

        public Criteria andPValueEqualTo(String value) {
            addCriterion("p_value =", value, "pValue");
            return (Criteria) this;
        }

        public Criteria andPValueNotEqualTo(String value) {
            addCriterion("p_value <>", value, "pValue");
            return (Criteria) this;
        }

        public Criteria andPValueGreaterThan(String value) {
            addCriterion("p_value >", value, "pValue");
            return (Criteria) this;
        }

        public Criteria andPValueGreaterThanOrEqualTo(String value) {
            addCriterion("p_value >=", value, "pValue");
            return (Criteria) this;
        }

        public Criteria andPValueLessThan(String value) {
            addCriterion("p_value <", value, "pValue");
            return (Criteria) this;
        }

        public Criteria andPValueLessThanOrEqualTo(String value) {
            addCriterion("p_value <=", value, "pValue");
            return (Criteria) this;
        }

        public Criteria andPValueLike(String value) {
            addCriterion("p_value like", value, "pValue");
            return (Criteria) this;
        }

        public Criteria andPValueNotLike(String value) {
            addCriterion("p_value not like", value, "pValue");
            return (Criteria) this;
        }

        public Criteria andPValueIn(List<String> values) {
            addCriterion("p_value in", values, "pValue");
            return (Criteria) this;
        }

        public Criteria andPValueNotIn(List<String> values) {
            addCriterion("p_value not in", values, "pValue");
            return (Criteria) this;
        }

        public Criteria andPValueBetween(String value1, String value2) {
            addCriterion("p_value between", value1, value2, "pValue");
            return (Criteria) this;
        }

        public Criteria andPValueNotBetween(String value1, String value2) {
            addCriterion("p_value not between", value1, value2, "pValue");
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
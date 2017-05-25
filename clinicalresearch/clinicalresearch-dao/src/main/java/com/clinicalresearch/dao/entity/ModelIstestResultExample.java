package com.clinicalresearch.dao.entity;

import java.util.ArrayList;
import java.util.List;

public class ModelIstestResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ModelIstestResultExample() {
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

        public Criteria andIsttIdIsNull() {
            addCriterion("istt_id is null");
            return (Criteria) this;
        }

        public Criteria andIsttIdIsNotNull() {
            addCriterion("istt_id is not null");
            return (Criteria) this;
        }

        public Criteria andIsttIdEqualTo(Integer value) {
            addCriterion("istt_id =", value, "isttId");
            return (Criteria) this;
        }

        public Criteria andIsttIdNotEqualTo(Integer value) {
            addCriterion("istt_id <>", value, "isttId");
            return (Criteria) this;
        }

        public Criteria andIsttIdGreaterThan(Integer value) {
            addCriterion("istt_id >", value, "isttId");
            return (Criteria) this;
        }

        public Criteria andIsttIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("istt_id >=", value, "isttId");
            return (Criteria) this;
        }

        public Criteria andIsttIdLessThan(Integer value) {
            addCriterion("istt_id <", value, "isttId");
            return (Criteria) this;
        }

        public Criteria andIsttIdLessThanOrEqualTo(Integer value) {
            addCriterion("istt_id <=", value, "isttId");
            return (Criteria) this;
        }

        public Criteria andIsttIdIn(List<Integer> values) {
            addCriterion("istt_id in", values, "isttId");
            return (Criteria) this;
        }

        public Criteria andIsttIdNotIn(List<Integer> values) {
            addCriterion("istt_id not in", values, "isttId");
            return (Criteria) this;
        }

        public Criteria andIsttIdBetween(Integer value1, Integer value2) {
            addCriterion("istt_id between", value1, value2, "isttId");
            return (Criteria) this;
        }

        public Criteria andIsttIdNotBetween(Integer value1, Integer value2) {
            addCriterion("istt_id not between", value1, value2, "isttId");
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

        public Criteria andVarEqualTIsNull() {
            addCriterion("var_equal_t is null");
            return (Criteria) this;
        }

        public Criteria andVarEqualTIsNotNull() {
            addCriterion("var_equal_t is not null");
            return (Criteria) this;
        }

        public Criteria andVarEqualTEqualTo(String value) {
            addCriterion("var_equal_t =", value, "varEqualT");
            return (Criteria) this;
        }

        public Criteria andVarEqualTNotEqualTo(String value) {
            addCriterion("var_equal_t <>", value, "varEqualT");
            return (Criteria) this;
        }

        public Criteria andVarEqualTGreaterThan(String value) {
            addCriterion("var_equal_t >", value, "varEqualT");
            return (Criteria) this;
        }

        public Criteria andVarEqualTGreaterThanOrEqualTo(String value) {
            addCriterion("var_equal_t >=", value, "varEqualT");
            return (Criteria) this;
        }

        public Criteria andVarEqualTLessThan(String value) {
            addCriterion("var_equal_t <", value, "varEqualT");
            return (Criteria) this;
        }

        public Criteria andVarEqualTLessThanOrEqualTo(String value) {
            addCriterion("var_equal_t <=", value, "varEqualT");
            return (Criteria) this;
        }

        public Criteria andVarEqualTLike(String value) {
            addCriterion("var_equal_t like", value, "varEqualT");
            return (Criteria) this;
        }

        public Criteria andVarEqualTNotLike(String value) {
            addCriterion("var_equal_t not like", value, "varEqualT");
            return (Criteria) this;
        }

        public Criteria andVarEqualTIn(List<String> values) {
            addCriterion("var_equal_t in", values, "varEqualT");
            return (Criteria) this;
        }

        public Criteria andVarEqualTNotIn(List<String> values) {
            addCriterion("var_equal_t not in", values, "varEqualT");
            return (Criteria) this;
        }

        public Criteria andVarEqualTBetween(String value1, String value2) {
            addCriterion("var_equal_t between", value1, value2, "varEqualT");
            return (Criteria) this;
        }

        public Criteria andVarEqualTNotBetween(String value1, String value2) {
            addCriterion("var_equal_t not between", value1, value2, "varEqualT");
            return (Criteria) this;
        }

        public Criteria andVarEqualSigIsNull() {
            addCriterion("var_equal_sig is null");
            return (Criteria) this;
        }

        public Criteria andVarEqualSigIsNotNull() {
            addCriterion("var_equal_sig is not null");
            return (Criteria) this;
        }

        public Criteria andVarEqualSigEqualTo(String value) {
            addCriterion("var_equal_sig =", value, "varEqualSig");
            return (Criteria) this;
        }

        public Criteria andVarEqualSigNotEqualTo(String value) {
            addCriterion("var_equal_sig <>", value, "varEqualSig");
            return (Criteria) this;
        }

        public Criteria andVarEqualSigGreaterThan(String value) {
            addCriterion("var_equal_sig >", value, "varEqualSig");
            return (Criteria) this;
        }

        public Criteria andVarEqualSigGreaterThanOrEqualTo(String value) {
            addCriterion("var_equal_sig >=", value, "varEqualSig");
            return (Criteria) this;
        }

        public Criteria andVarEqualSigLessThan(String value) {
            addCriterion("var_equal_sig <", value, "varEqualSig");
            return (Criteria) this;
        }

        public Criteria andVarEqualSigLessThanOrEqualTo(String value) {
            addCriterion("var_equal_sig <=", value, "varEqualSig");
            return (Criteria) this;
        }

        public Criteria andVarEqualSigLike(String value) {
            addCriterion("var_equal_sig like", value, "varEqualSig");
            return (Criteria) this;
        }

        public Criteria andVarEqualSigNotLike(String value) {
            addCriterion("var_equal_sig not like", value, "varEqualSig");
            return (Criteria) this;
        }

        public Criteria andVarEqualSigIn(List<String> values) {
            addCriterion("var_equal_sig in", values, "varEqualSig");
            return (Criteria) this;
        }

        public Criteria andVarEqualSigNotIn(List<String> values) {
            addCriterion("var_equal_sig not in", values, "varEqualSig");
            return (Criteria) this;
        }

        public Criteria andVarEqualSigBetween(String value1, String value2) {
            addCriterion("var_equal_sig between", value1, value2, "varEqualSig");
            return (Criteria) this;
        }

        public Criteria andVarEqualSigNotBetween(String value1, String value2) {
            addCriterion("var_equal_sig not between", value1, value2, "varEqualSig");
            return (Criteria) this;
        }

        public Criteria andVarEqualInfIsNull() {
            addCriterion("var_equal_inf is null");
            return (Criteria) this;
        }

        public Criteria andVarEqualInfIsNotNull() {
            addCriterion("var_equal_inf is not null");
            return (Criteria) this;
        }

        public Criteria andVarEqualInfEqualTo(String value) {
            addCriterion("var_equal_inf =", value, "varEqualInf");
            return (Criteria) this;
        }

        public Criteria andVarEqualInfNotEqualTo(String value) {
            addCriterion("var_equal_inf <>", value, "varEqualInf");
            return (Criteria) this;
        }

        public Criteria andVarEqualInfGreaterThan(String value) {
            addCriterion("var_equal_inf >", value, "varEqualInf");
            return (Criteria) this;
        }

        public Criteria andVarEqualInfGreaterThanOrEqualTo(String value) {
            addCriterion("var_equal_inf >=", value, "varEqualInf");
            return (Criteria) this;
        }

        public Criteria andVarEqualInfLessThan(String value) {
            addCriterion("var_equal_inf <", value, "varEqualInf");
            return (Criteria) this;
        }

        public Criteria andVarEqualInfLessThanOrEqualTo(String value) {
            addCriterion("var_equal_inf <=", value, "varEqualInf");
            return (Criteria) this;
        }

        public Criteria andVarEqualInfLike(String value) {
            addCriterion("var_equal_inf like", value, "varEqualInf");
            return (Criteria) this;
        }

        public Criteria andVarEqualInfNotLike(String value) {
            addCriterion("var_equal_inf not like", value, "varEqualInf");
            return (Criteria) this;
        }

        public Criteria andVarEqualInfIn(List<String> values) {
            addCriterion("var_equal_inf in", values, "varEqualInf");
            return (Criteria) this;
        }

        public Criteria andVarEqualInfNotIn(List<String> values) {
            addCriterion("var_equal_inf not in", values, "varEqualInf");
            return (Criteria) this;
        }

        public Criteria andVarEqualInfBetween(String value1, String value2) {
            addCriterion("var_equal_inf between", value1, value2, "varEqualInf");
            return (Criteria) this;
        }

        public Criteria andVarEqualInfNotBetween(String value1, String value2) {
            addCriterion("var_equal_inf not between", value1, value2, "varEqualInf");
            return (Criteria) this;
        }

        public Criteria andVarEqualSupIsNull() {
            addCriterion("var_equal_sup is null");
            return (Criteria) this;
        }

        public Criteria andVarEqualSupIsNotNull() {
            addCriterion("var_equal_sup is not null");
            return (Criteria) this;
        }

        public Criteria andVarEqualSupEqualTo(String value) {
            addCriterion("var_equal_sup =", value, "varEqualSup");
            return (Criteria) this;
        }

        public Criteria andVarEqualSupNotEqualTo(String value) {
            addCriterion("var_equal_sup <>", value, "varEqualSup");
            return (Criteria) this;
        }

        public Criteria andVarEqualSupGreaterThan(String value) {
            addCriterion("var_equal_sup >", value, "varEqualSup");
            return (Criteria) this;
        }

        public Criteria andVarEqualSupGreaterThanOrEqualTo(String value) {
            addCriterion("var_equal_sup >=", value, "varEqualSup");
            return (Criteria) this;
        }

        public Criteria andVarEqualSupLessThan(String value) {
            addCriterion("var_equal_sup <", value, "varEqualSup");
            return (Criteria) this;
        }

        public Criteria andVarEqualSupLessThanOrEqualTo(String value) {
            addCriterion("var_equal_sup <=", value, "varEqualSup");
            return (Criteria) this;
        }

        public Criteria andVarEqualSupLike(String value) {
            addCriterion("var_equal_sup like", value, "varEqualSup");
            return (Criteria) this;
        }

        public Criteria andVarEqualSupNotLike(String value) {
            addCriterion("var_equal_sup not like", value, "varEqualSup");
            return (Criteria) this;
        }

        public Criteria andVarEqualSupIn(List<String> values) {
            addCriterion("var_equal_sup in", values, "varEqualSup");
            return (Criteria) this;
        }

        public Criteria andVarEqualSupNotIn(List<String> values) {
            addCriterion("var_equal_sup not in", values, "varEqualSup");
            return (Criteria) this;
        }

        public Criteria andVarEqualSupBetween(String value1, String value2) {
            addCriterion("var_equal_sup between", value1, value2, "varEqualSup");
            return (Criteria) this;
        }

        public Criteria andVarEqualSupNotBetween(String value1, String value2) {
            addCriterion("var_equal_sup not between", value1, value2, "varEqualSup");
            return (Criteria) this;
        }

        public Criteria andVarUnequalTIsNull() {
            addCriterion("var_unequal_t is null");
            return (Criteria) this;
        }

        public Criteria andVarUnequalTIsNotNull() {
            addCriterion("var_unequal_t is not null");
            return (Criteria) this;
        }

        public Criteria andVarUnequalTEqualTo(String value) {
            addCriterion("var_unequal_t =", value, "varUnequalT");
            return (Criteria) this;
        }

        public Criteria andVarUnequalTNotEqualTo(String value) {
            addCriterion("var_unequal_t <>", value, "varUnequalT");
            return (Criteria) this;
        }

        public Criteria andVarUnequalTGreaterThan(String value) {
            addCriterion("var_unequal_t >", value, "varUnequalT");
            return (Criteria) this;
        }

        public Criteria andVarUnequalTGreaterThanOrEqualTo(String value) {
            addCriterion("var_unequal_t >=", value, "varUnequalT");
            return (Criteria) this;
        }

        public Criteria andVarUnequalTLessThan(String value) {
            addCriterion("var_unequal_t <", value, "varUnequalT");
            return (Criteria) this;
        }

        public Criteria andVarUnequalTLessThanOrEqualTo(String value) {
            addCriterion("var_unequal_t <=", value, "varUnequalT");
            return (Criteria) this;
        }

        public Criteria andVarUnequalTLike(String value) {
            addCriterion("var_unequal_t like", value, "varUnequalT");
            return (Criteria) this;
        }

        public Criteria andVarUnequalTNotLike(String value) {
            addCriterion("var_unequal_t not like", value, "varUnequalT");
            return (Criteria) this;
        }

        public Criteria andVarUnequalTIn(List<String> values) {
            addCriterion("var_unequal_t in", values, "varUnequalT");
            return (Criteria) this;
        }

        public Criteria andVarUnequalTNotIn(List<String> values) {
            addCriterion("var_unequal_t not in", values, "varUnequalT");
            return (Criteria) this;
        }

        public Criteria andVarUnequalTBetween(String value1, String value2) {
            addCriterion("var_unequal_t between", value1, value2, "varUnequalT");
            return (Criteria) this;
        }

        public Criteria andVarUnequalTNotBetween(String value1, String value2) {
            addCriterion("var_unequal_t not between", value1, value2, "varUnequalT");
            return (Criteria) this;
        }

        public Criteria andVarUnequalSigIsNull() {
            addCriterion("var_unequal_sig is null");
            return (Criteria) this;
        }

        public Criteria andVarUnequalSigIsNotNull() {
            addCriterion("var_unequal_sig is not null");
            return (Criteria) this;
        }

        public Criteria andVarUnequalSigEqualTo(String value) {
            addCriterion("var_unequal_sig =", value, "varUnequalSig");
            return (Criteria) this;
        }

        public Criteria andVarUnequalSigNotEqualTo(String value) {
            addCriterion("var_unequal_sig <>", value, "varUnequalSig");
            return (Criteria) this;
        }

        public Criteria andVarUnequalSigGreaterThan(String value) {
            addCriterion("var_unequal_sig >", value, "varUnequalSig");
            return (Criteria) this;
        }

        public Criteria andVarUnequalSigGreaterThanOrEqualTo(String value) {
            addCriterion("var_unequal_sig >=", value, "varUnequalSig");
            return (Criteria) this;
        }

        public Criteria andVarUnequalSigLessThan(String value) {
            addCriterion("var_unequal_sig <", value, "varUnequalSig");
            return (Criteria) this;
        }

        public Criteria andVarUnequalSigLessThanOrEqualTo(String value) {
            addCriterion("var_unequal_sig <=", value, "varUnequalSig");
            return (Criteria) this;
        }

        public Criteria andVarUnequalSigLike(String value) {
            addCriterion("var_unequal_sig like", value, "varUnequalSig");
            return (Criteria) this;
        }

        public Criteria andVarUnequalSigNotLike(String value) {
            addCriterion("var_unequal_sig not like", value, "varUnequalSig");
            return (Criteria) this;
        }

        public Criteria andVarUnequalSigIn(List<String> values) {
            addCriterion("var_unequal_sig in", values, "varUnequalSig");
            return (Criteria) this;
        }

        public Criteria andVarUnequalSigNotIn(List<String> values) {
            addCriterion("var_unequal_sig not in", values, "varUnequalSig");
            return (Criteria) this;
        }

        public Criteria andVarUnequalSigBetween(String value1, String value2) {
            addCriterion("var_unequal_sig between", value1, value2, "varUnequalSig");
            return (Criteria) this;
        }

        public Criteria andVarUnequalSigNotBetween(String value1, String value2) {
            addCriterion("var_unequal_sig not between", value1, value2, "varUnequalSig");
            return (Criteria) this;
        }

        public Criteria andVarUnequalInfIsNull() {
            addCriterion("var_unequal_inf is null");
            return (Criteria) this;
        }

        public Criteria andVarUnequalInfIsNotNull() {
            addCriterion("var_unequal_inf is not null");
            return (Criteria) this;
        }

        public Criteria andVarUnequalInfEqualTo(String value) {
            addCriterion("var_unequal_inf =", value, "varUnequalInf");
            return (Criteria) this;
        }

        public Criteria andVarUnequalInfNotEqualTo(String value) {
            addCriterion("var_unequal_inf <>", value, "varUnequalInf");
            return (Criteria) this;
        }

        public Criteria andVarUnequalInfGreaterThan(String value) {
            addCriterion("var_unequal_inf >", value, "varUnequalInf");
            return (Criteria) this;
        }

        public Criteria andVarUnequalInfGreaterThanOrEqualTo(String value) {
            addCriterion("var_unequal_inf >=", value, "varUnequalInf");
            return (Criteria) this;
        }

        public Criteria andVarUnequalInfLessThan(String value) {
            addCriterion("var_unequal_inf <", value, "varUnequalInf");
            return (Criteria) this;
        }

        public Criteria andVarUnequalInfLessThanOrEqualTo(String value) {
            addCriterion("var_unequal_inf <=", value, "varUnequalInf");
            return (Criteria) this;
        }

        public Criteria andVarUnequalInfLike(String value) {
            addCriterion("var_unequal_inf like", value, "varUnequalInf");
            return (Criteria) this;
        }

        public Criteria andVarUnequalInfNotLike(String value) {
            addCriterion("var_unequal_inf not like", value, "varUnequalInf");
            return (Criteria) this;
        }

        public Criteria andVarUnequalInfIn(List<String> values) {
            addCriterion("var_unequal_inf in", values, "varUnequalInf");
            return (Criteria) this;
        }

        public Criteria andVarUnequalInfNotIn(List<String> values) {
            addCriterion("var_unequal_inf not in", values, "varUnequalInf");
            return (Criteria) this;
        }

        public Criteria andVarUnequalInfBetween(String value1, String value2) {
            addCriterion("var_unequal_inf between", value1, value2, "varUnequalInf");
            return (Criteria) this;
        }

        public Criteria andVarUnequalInfNotBetween(String value1, String value2) {
            addCriterion("var_unequal_inf not between", value1, value2, "varUnequalInf");
            return (Criteria) this;
        }

        public Criteria andVarUnequalSupIsNull() {
            addCriterion("var_unequal_sup is null");
            return (Criteria) this;
        }

        public Criteria andVarUnequalSupIsNotNull() {
            addCriterion("var_unequal_sup is not null");
            return (Criteria) this;
        }

        public Criteria andVarUnequalSupEqualTo(String value) {
            addCriterion("var_unequal_sup =", value, "varUnequalSup");
            return (Criteria) this;
        }

        public Criteria andVarUnequalSupNotEqualTo(String value) {
            addCriterion("var_unequal_sup <>", value, "varUnequalSup");
            return (Criteria) this;
        }

        public Criteria andVarUnequalSupGreaterThan(String value) {
            addCriterion("var_unequal_sup >", value, "varUnequalSup");
            return (Criteria) this;
        }

        public Criteria andVarUnequalSupGreaterThanOrEqualTo(String value) {
            addCriterion("var_unequal_sup >=", value, "varUnequalSup");
            return (Criteria) this;
        }

        public Criteria andVarUnequalSupLessThan(String value) {
            addCriterion("var_unequal_sup <", value, "varUnequalSup");
            return (Criteria) this;
        }

        public Criteria andVarUnequalSupLessThanOrEqualTo(String value) {
            addCriterion("var_unequal_sup <=", value, "varUnequalSup");
            return (Criteria) this;
        }

        public Criteria andVarUnequalSupLike(String value) {
            addCriterion("var_unequal_sup like", value, "varUnequalSup");
            return (Criteria) this;
        }

        public Criteria andVarUnequalSupNotLike(String value) {
            addCriterion("var_unequal_sup not like", value, "varUnequalSup");
            return (Criteria) this;
        }

        public Criteria andVarUnequalSupIn(List<String> values) {
            addCriterion("var_unequal_sup in", values, "varUnequalSup");
            return (Criteria) this;
        }

        public Criteria andVarUnequalSupNotIn(List<String> values) {
            addCriterion("var_unequal_sup not in", values, "varUnequalSup");
            return (Criteria) this;
        }

        public Criteria andVarUnequalSupBetween(String value1, String value2) {
            addCriterion("var_unequal_sup between", value1, value2, "varUnequalSup");
            return (Criteria) this;
        }

        public Criteria andVarUnequalSupNotBetween(String value1, String value2) {
            addCriterion("var_unequal_sup not between", value1, value2, "varUnequalSup");
            return (Criteria) this;
        }

        public Criteria andConfLevelIsNull() {
            addCriterion("conf_level is null");
            return (Criteria) this;
        }

        public Criteria andConfLevelIsNotNull() {
            addCriterion("conf_level is not null");
            return (Criteria) this;
        }

        public Criteria andConfLevelEqualTo(String value) {
            addCriterion("conf_level =", value, "confLevel");
            return (Criteria) this;
        }

        public Criteria andConfLevelNotEqualTo(String value) {
            addCriterion("conf_level <>", value, "confLevel");
            return (Criteria) this;
        }

        public Criteria andConfLevelGreaterThan(String value) {
            addCriterion("conf_level >", value, "confLevel");
            return (Criteria) this;
        }

        public Criteria andConfLevelGreaterThanOrEqualTo(String value) {
            addCriterion("conf_level >=", value, "confLevel");
            return (Criteria) this;
        }

        public Criteria andConfLevelLessThan(String value) {
            addCriterion("conf_level <", value, "confLevel");
            return (Criteria) this;
        }

        public Criteria andConfLevelLessThanOrEqualTo(String value) {
            addCriterion("conf_level <=", value, "confLevel");
            return (Criteria) this;
        }

        public Criteria andConfLevelLike(String value) {
            addCriterion("conf_level like", value, "confLevel");
            return (Criteria) this;
        }

        public Criteria andConfLevelNotLike(String value) {
            addCriterion("conf_level not like", value, "confLevel");
            return (Criteria) this;
        }

        public Criteria andConfLevelIn(List<String> values) {
            addCriterion("conf_level in", values, "confLevel");
            return (Criteria) this;
        }

        public Criteria andConfLevelNotIn(List<String> values) {
            addCriterion("conf_level not in", values, "confLevel");
            return (Criteria) this;
        }

        public Criteria andConfLevelBetween(String value1, String value2) {
            addCriterion("conf_level between", value1, value2, "confLevel");
            return (Criteria) this;
        }

        public Criteria andConfLevelNotBetween(String value1, String value2) {
            addCriterion("conf_level not between", value1, value2, "confLevel");
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
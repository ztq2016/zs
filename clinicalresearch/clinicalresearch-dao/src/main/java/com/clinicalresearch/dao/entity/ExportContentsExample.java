package com.clinicalresearch.dao.entity;

import java.util.ArrayList;
import java.util.List;

public class ExportContentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExportContentsExample() {
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

        public Criteria andEcIdIsNull() {
            addCriterion("ec_id is null");
            return (Criteria) this;
        }

        public Criteria andEcIdIsNotNull() {
            addCriterion("ec_id is not null");
            return (Criteria) this;
        }

        public Criteria andEcIdEqualTo(Integer value) {
            addCriterion("ec_id =", value, "ecId");
            return (Criteria) this;
        }

        public Criteria andEcIdNotEqualTo(Integer value) {
            addCriterion("ec_id <>", value, "ecId");
            return (Criteria) this;
        }

        public Criteria andEcIdGreaterThan(Integer value) {
            addCriterion("ec_id >", value, "ecId");
            return (Criteria) this;
        }

        public Criteria andEcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ec_id >=", value, "ecId");
            return (Criteria) this;
        }

        public Criteria andEcIdLessThan(Integer value) {
            addCriterion("ec_id <", value, "ecId");
            return (Criteria) this;
        }

        public Criteria andEcIdLessThanOrEqualTo(Integer value) {
            addCriterion("ec_id <=", value, "ecId");
            return (Criteria) this;
        }

        public Criteria andEcIdIn(List<Integer> values) {
            addCriterion("ec_id in", values, "ecId");
            return (Criteria) this;
        }

        public Criteria andEcIdNotIn(List<Integer> values) {
            addCriterion("ec_id not in", values, "ecId");
            return (Criteria) this;
        }

        public Criteria andEcIdBetween(Integer value1, Integer value2) {
            addCriterion("ec_id between", value1, value2, "ecId");
            return (Criteria) this;
        }

        public Criteria andEcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ec_id not between", value1, value2, "ecId");
            return (Criteria) this;
        }

        public Criteria andEcNameIsNull() {
            addCriterion("ec_name is null");
            return (Criteria) this;
        }

        public Criteria andEcNameIsNotNull() {
            addCriterion("ec_name is not null");
            return (Criteria) this;
        }

        public Criteria andEcNameEqualTo(String value) {
            addCriterion("ec_name =", value, "ecName");
            return (Criteria) this;
        }

        public Criteria andEcNameNotEqualTo(String value) {
            addCriterion("ec_name <>", value, "ecName");
            return (Criteria) this;
        }

        public Criteria andEcNameGreaterThan(String value) {
            addCriterion("ec_name >", value, "ecName");
            return (Criteria) this;
        }

        public Criteria andEcNameGreaterThanOrEqualTo(String value) {
            addCriterion("ec_name >=", value, "ecName");
            return (Criteria) this;
        }

        public Criteria andEcNameLessThan(String value) {
            addCriterion("ec_name <", value, "ecName");
            return (Criteria) this;
        }

        public Criteria andEcNameLessThanOrEqualTo(String value) {
            addCriterion("ec_name <=", value, "ecName");
            return (Criteria) this;
        }

        public Criteria andEcNameLike(String value) {
            addCriterion("ec_name like", value, "ecName");
            return (Criteria) this;
        }

        public Criteria andEcNameNotLike(String value) {
            addCriterion("ec_name not like", value, "ecName");
            return (Criteria) this;
        }

        public Criteria andEcNameIn(List<String> values) {
            addCriterion("ec_name in", values, "ecName");
            return (Criteria) this;
        }

        public Criteria andEcNameNotIn(List<String> values) {
            addCriterion("ec_name not in", values, "ecName");
            return (Criteria) this;
        }

        public Criteria andEcNameBetween(String value1, String value2) {
            addCriterion("ec_name between", value1, value2, "ecName");
            return (Criteria) this;
        }

        public Criteria andEcNameNotBetween(String value1, String value2) {
            addCriterion("ec_name not between", value1, value2, "ecName");
            return (Criteria) this;
        }

        public Criteria andEcEsCodeIsNull() {
            addCriterion("ec_es_code is null");
            return (Criteria) this;
        }

        public Criteria andEcEsCodeIsNotNull() {
            addCriterion("ec_es_code is not null");
            return (Criteria) this;
        }

        public Criteria andEcEsCodeEqualTo(String value) {
            addCriterion("ec_es_code =", value, "ecEsCode");
            return (Criteria) this;
        }

        public Criteria andEcEsCodeNotEqualTo(String value) {
            addCriterion("ec_es_code <>", value, "ecEsCode");
            return (Criteria) this;
        }

        public Criteria andEcEsCodeGreaterThan(String value) {
            addCriterion("ec_es_code >", value, "ecEsCode");
            return (Criteria) this;
        }

        public Criteria andEcEsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ec_es_code >=", value, "ecEsCode");
            return (Criteria) this;
        }

        public Criteria andEcEsCodeLessThan(String value) {
            addCriterion("ec_es_code <", value, "ecEsCode");
            return (Criteria) this;
        }

        public Criteria andEcEsCodeLessThanOrEqualTo(String value) {
            addCriterion("ec_es_code <=", value, "ecEsCode");
            return (Criteria) this;
        }

        public Criteria andEcEsCodeLike(String value) {
            addCriterion("ec_es_code like", value, "ecEsCode");
            return (Criteria) this;
        }

        public Criteria andEcEsCodeNotLike(String value) {
            addCriterion("ec_es_code not like", value, "ecEsCode");
            return (Criteria) this;
        }

        public Criteria andEcEsCodeIn(List<String> values) {
            addCriterion("ec_es_code in", values, "ecEsCode");
            return (Criteria) this;
        }

        public Criteria andEcEsCodeNotIn(List<String> values) {
            addCriterion("ec_es_code not in", values, "ecEsCode");
            return (Criteria) this;
        }

        public Criteria andEcEsCodeBetween(String value1, String value2) {
            addCriterion("ec_es_code between", value1, value2, "ecEsCode");
            return (Criteria) this;
        }

        public Criteria andEcEsCodeNotBetween(String value1, String value2) {
            addCriterion("ec_es_code not between", value1, value2, "ecEsCode");
            return (Criteria) this;
        }

        public Criteria andEcFatherIdIsNull() {
            addCriterion("ec_father_id is null");
            return (Criteria) this;
        }

        public Criteria andEcFatherIdIsNotNull() {
            addCriterion("ec_father_id is not null");
            return (Criteria) this;
        }

        public Criteria andEcFatherIdEqualTo(Integer value) {
            addCriterion("ec_father_id =", value, "ecFatherId");
            return (Criteria) this;
        }

        public Criteria andEcFatherIdNotEqualTo(Integer value) {
            addCriterion("ec_father_id <>", value, "ecFatherId");
            return (Criteria) this;
        }

        public Criteria andEcFatherIdGreaterThan(Integer value) {
            addCriterion("ec_father_id >", value, "ecFatherId");
            return (Criteria) this;
        }

        public Criteria andEcFatherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ec_father_id >=", value, "ecFatherId");
            return (Criteria) this;
        }

        public Criteria andEcFatherIdLessThan(Integer value) {
            addCriterion("ec_father_id <", value, "ecFatherId");
            return (Criteria) this;
        }

        public Criteria andEcFatherIdLessThanOrEqualTo(Integer value) {
            addCriterion("ec_father_id <=", value, "ecFatherId");
            return (Criteria) this;
        }

        public Criteria andEcFatherIdIn(List<Integer> values) {
            addCriterion("ec_father_id in", values, "ecFatherId");
            return (Criteria) this;
        }

        public Criteria andEcFatherIdNotIn(List<Integer> values) {
            addCriterion("ec_father_id not in", values, "ecFatherId");
            return (Criteria) this;
        }

        public Criteria andEcFatherIdBetween(Integer value1, Integer value2) {
            addCriterion("ec_father_id between", value1, value2, "ecFatherId");
            return (Criteria) this;
        }

        public Criteria andEcFatherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ec_father_id not between", value1, value2, "ecFatherId");
            return (Criteria) this;
        }

        public Criteria andEcLevelIsNull() {
            addCriterion("ec_level is null");
            return (Criteria) this;
        }

        public Criteria andEcLevelIsNotNull() {
            addCriterion("ec_level is not null");
            return (Criteria) this;
        }

        public Criteria andEcLevelEqualTo(String value) {
            addCriterion("ec_level =", value, "ecLevel");
            return (Criteria) this;
        }

        public Criteria andEcLevelNotEqualTo(String value) {
            addCriterion("ec_level <>", value, "ecLevel");
            return (Criteria) this;
        }

        public Criteria andEcLevelGreaterThan(String value) {
            addCriterion("ec_level >", value, "ecLevel");
            return (Criteria) this;
        }

        public Criteria andEcLevelGreaterThanOrEqualTo(String value) {
            addCriterion("ec_level >=", value, "ecLevel");
            return (Criteria) this;
        }

        public Criteria andEcLevelLessThan(String value) {
            addCriterion("ec_level <", value, "ecLevel");
            return (Criteria) this;
        }

        public Criteria andEcLevelLessThanOrEqualTo(String value) {
            addCriterion("ec_level <=", value, "ecLevel");
            return (Criteria) this;
        }

        public Criteria andEcLevelLike(String value) {
            addCriterion("ec_level like", value, "ecLevel");
            return (Criteria) this;
        }

        public Criteria andEcLevelNotLike(String value) {
            addCriterion("ec_level not like", value, "ecLevel");
            return (Criteria) this;
        }

        public Criteria andEcLevelIn(List<String> values) {
            addCriterion("ec_level in", values, "ecLevel");
            return (Criteria) this;
        }

        public Criteria andEcLevelNotIn(List<String> values) {
            addCriterion("ec_level not in", values, "ecLevel");
            return (Criteria) this;
        }

        public Criteria andEcLevelBetween(String value1, String value2) {
            addCriterion("ec_level between", value1, value2, "ecLevel");
            return (Criteria) this;
        }

        public Criteria andEcLevelNotBetween(String value1, String value2) {
            addCriterion("ec_level not between", value1, value2, "ecLevel");
            return (Criteria) this;
        }

        public Criteria andEcOrderIsNull() {
            addCriterion("ec_order is null");
            return (Criteria) this;
        }

        public Criteria andEcOrderIsNotNull() {
            addCriterion("ec_order is not null");
            return (Criteria) this;
        }

        public Criteria andEcOrderEqualTo(Integer value) {
            addCriterion("ec_order =", value, "ecOrder");
            return (Criteria) this;
        }

        public Criteria andEcOrderNotEqualTo(Integer value) {
            addCriterion("ec_order <>", value, "ecOrder");
            return (Criteria) this;
        }

        public Criteria andEcOrderGreaterThan(Integer value) {
            addCriterion("ec_order >", value, "ecOrder");
            return (Criteria) this;
        }

        public Criteria andEcOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("ec_order >=", value, "ecOrder");
            return (Criteria) this;
        }

        public Criteria andEcOrderLessThan(Integer value) {
            addCriterion("ec_order <", value, "ecOrder");
            return (Criteria) this;
        }

        public Criteria andEcOrderLessThanOrEqualTo(Integer value) {
            addCriterion("ec_order <=", value, "ecOrder");
            return (Criteria) this;
        }

        public Criteria andEcOrderIn(List<Integer> values) {
            addCriterion("ec_order in", values, "ecOrder");
            return (Criteria) this;
        }

        public Criteria andEcOrderNotIn(List<Integer> values) {
            addCriterion("ec_order not in", values, "ecOrder");
            return (Criteria) this;
        }

        public Criteria andEcOrderBetween(Integer value1, Integer value2) {
            addCriterion("ec_order between", value1, value2, "ecOrder");
            return (Criteria) this;
        }

        public Criteria andEcOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("ec_order not between", value1, value2, "ecOrder");
            return (Criteria) this;
        }

        public Criteria andEcPycodeIsNull() {
            addCriterion("ec_pycode is null");
            return (Criteria) this;
        }

        public Criteria andEcPycodeIsNotNull() {
            addCriterion("ec_pycode is not null");
            return (Criteria) this;
        }

        public Criteria andEcPycodeEqualTo(String value) {
            addCriterion("ec_pycode =", value, "ecPycode");
            return (Criteria) this;
        }

        public Criteria andEcPycodeNotEqualTo(String value) {
            addCriterion("ec_pycode <>", value, "ecPycode");
            return (Criteria) this;
        }

        public Criteria andEcPycodeGreaterThan(String value) {
            addCriterion("ec_pycode >", value, "ecPycode");
            return (Criteria) this;
        }

        public Criteria andEcPycodeGreaterThanOrEqualTo(String value) {
            addCriterion("ec_pycode >=", value, "ecPycode");
            return (Criteria) this;
        }

        public Criteria andEcPycodeLessThan(String value) {
            addCriterion("ec_pycode <", value, "ecPycode");
            return (Criteria) this;
        }

        public Criteria andEcPycodeLessThanOrEqualTo(String value) {
            addCriterion("ec_pycode <=", value, "ecPycode");
            return (Criteria) this;
        }

        public Criteria andEcPycodeLike(String value) {
            addCriterion("ec_pycode like", value, "ecPycode");
            return (Criteria) this;
        }

        public Criteria andEcPycodeNotLike(String value) {
            addCriterion("ec_pycode not like", value, "ecPycode");
            return (Criteria) this;
        }

        public Criteria andEcPycodeIn(List<String> values) {
            addCriterion("ec_pycode in", values, "ecPycode");
            return (Criteria) this;
        }

        public Criteria andEcPycodeNotIn(List<String> values) {
            addCriterion("ec_pycode not in", values, "ecPycode");
            return (Criteria) this;
        }

        public Criteria andEcPycodeBetween(String value1, String value2) {
            addCriterion("ec_pycode between", value1, value2, "ecPycode");
            return (Criteria) this;
        }

        public Criteria andEcPycodeNotBetween(String value1, String value2) {
            addCriterion("ec_pycode not between", value1, value2, "ecPycode");
            return (Criteria) this;
        }

        public Criteria andEcOtherIsNull() {
            addCriterion("ec_other is null");
            return (Criteria) this;
        }

        public Criteria andEcOtherIsNotNull() {
            addCriterion("ec_other is not null");
            return (Criteria) this;
        }

        public Criteria andEcOtherEqualTo(String value) {
            addCriterion("ec_other =", value, "ecOther");
            return (Criteria) this;
        }

        public Criteria andEcOtherNotEqualTo(String value) {
            addCriterion("ec_other <>", value, "ecOther");
            return (Criteria) this;
        }

        public Criteria andEcOtherGreaterThan(String value) {
            addCriterion("ec_other >", value, "ecOther");
            return (Criteria) this;
        }

        public Criteria andEcOtherGreaterThanOrEqualTo(String value) {
            addCriterion("ec_other >=", value, "ecOther");
            return (Criteria) this;
        }

        public Criteria andEcOtherLessThan(String value) {
            addCriterion("ec_other <", value, "ecOther");
            return (Criteria) this;
        }

        public Criteria andEcOtherLessThanOrEqualTo(String value) {
            addCriterion("ec_other <=", value, "ecOther");
            return (Criteria) this;
        }

        public Criteria andEcOtherLike(String value) {
            addCriterion("ec_other like", value, "ecOther");
            return (Criteria) this;
        }

        public Criteria andEcOtherNotLike(String value) {
            addCriterion("ec_other not like", value, "ecOther");
            return (Criteria) this;
        }

        public Criteria andEcOtherIn(List<String> values) {
            addCriterion("ec_other in", values, "ecOther");
            return (Criteria) this;
        }

        public Criteria andEcOtherNotIn(List<String> values) {
            addCriterion("ec_other not in", values, "ecOther");
            return (Criteria) this;
        }

        public Criteria andEcOtherBetween(String value1, String value2) {
            addCriterion("ec_other between", value1, value2, "ecOther");
            return (Criteria) this;
        }

        public Criteria andEcOtherNotBetween(String value1, String value2) {
            addCriterion("ec_other not between", value1, value2, "ecOther");
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
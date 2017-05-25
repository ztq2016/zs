package com.clinicalresearch.dao.entity;

import java.util.ArrayList;
import java.util.List;

public class HierarchicalVariableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HierarchicalVariableExample() {
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

        public Criteria andVariableidIsNull() {
            addCriterion("variableid is null");
            return (Criteria) this;
        }

        public Criteria andVariableidIsNotNull() {
            addCriterion("variableid is not null");
            return (Criteria) this;
        }

        public Criteria andVariableidEqualTo(String value) {
            addCriterion("variableid =", value, "variableid");
            return (Criteria) this;
        }

        public Criteria andVariableidNotEqualTo(String value) {
            addCriterion("variableid <>", value, "variableid");
            return (Criteria) this;
        }

        public Criteria andVariableidGreaterThan(String value) {
            addCriterion("variableid >", value, "variableid");
            return (Criteria) this;
        }

        public Criteria andVariableidGreaterThanOrEqualTo(String value) {
            addCriterion("variableid >=", value, "variableid");
            return (Criteria) this;
        }

        public Criteria andVariableidLessThan(String value) {
            addCriterion("variableid <", value, "variableid");
            return (Criteria) this;
        }

        public Criteria andVariableidLessThanOrEqualTo(String value) {
            addCriterion("variableid <=", value, "variableid");
            return (Criteria) this;
        }

        public Criteria andVariableidLike(String value) {
            addCriterion("variableid like", value, "variableid");
            return (Criteria) this;
        }

        public Criteria andVariableidNotLike(String value) {
            addCriterion("variableid not like", value, "variableid");
            return (Criteria) this;
        }

        public Criteria andVariableidIn(List<String> values) {
            addCriterion("variableid in", values, "variableid");
            return (Criteria) this;
        }

        public Criteria andVariableidNotIn(List<String> values) {
            addCriterion("variableid not in", values, "variableid");
            return (Criteria) this;
        }

        public Criteria andVariableidBetween(String value1, String value2) {
            addCriterion("variableid between", value1, value2, "variableid");
            return (Criteria) this;
        }

        public Criteria andVariableidNotBetween(String value1, String value2) {
            addCriterion("variableid not between", value1, value2, "variableid");
            return (Criteria) this;
        }

        public Criteria andVariablenameIsNull() {
            addCriterion("variablename is null");
            return (Criteria) this;
        }

        public Criteria andVariablenameIsNotNull() {
            addCriterion("variablename is not null");
            return (Criteria) this;
        }

        public Criteria andVariablenameEqualTo(String value) {
            addCriterion("variablename =", value, "variablename");
            return (Criteria) this;
        }

        public Criteria andVariablenameNotEqualTo(String value) {
            addCriterion("variablename <>", value, "variablename");
            return (Criteria) this;
        }

        public Criteria andVariablenameGreaterThan(String value) {
            addCriterion("variablename >", value, "variablename");
            return (Criteria) this;
        }

        public Criteria andVariablenameGreaterThanOrEqualTo(String value) {
            addCriterion("variablename >=", value, "variablename");
            return (Criteria) this;
        }

        public Criteria andVariablenameLessThan(String value) {
            addCriterion("variablename <", value, "variablename");
            return (Criteria) this;
        }

        public Criteria andVariablenameLessThanOrEqualTo(String value) {
            addCriterion("variablename <=", value, "variablename");
            return (Criteria) this;
        }

        public Criteria andVariablenameLike(String value) {
            addCriterion("variablename like", value, "variablename");
            return (Criteria) this;
        }

        public Criteria andVariablenameNotLike(String value) {
            addCriterion("variablename not like", value, "variablename");
            return (Criteria) this;
        }

        public Criteria andVariablenameIn(List<String> values) {
            addCriterion("variablename in", values, "variablename");
            return (Criteria) this;
        }

        public Criteria andVariablenameNotIn(List<String> values) {
            addCriterion("variablename not in", values, "variablename");
            return (Criteria) this;
        }

        public Criteria andVariablenameBetween(String value1, String value2) {
            addCriterion("variablename between", value1, value2, "variablename");
            return (Criteria) this;
        }

        public Criteria andVariablenameNotBetween(String value1, String value2) {
            addCriterion("variablename not between", value1, value2, "variablename");
            return (Criteria) this;
        }

        public Criteria andVariabletypeIsNull() {
            addCriterion("variabletype is null");
            return (Criteria) this;
        }

        public Criteria andVariabletypeIsNotNull() {
            addCriterion("variabletype is not null");
            return (Criteria) this;
        }

        public Criteria andVariabletypeEqualTo(String value) {
            addCriterion("variabletype =", value, "variabletype");
            return (Criteria) this;
        }

        public Criteria andVariabletypeNotEqualTo(String value) {
            addCriterion("variabletype <>", value, "variabletype");
            return (Criteria) this;
        }

        public Criteria andVariabletypeGreaterThan(String value) {
            addCriterion("variabletype >", value, "variabletype");
            return (Criteria) this;
        }

        public Criteria andVariabletypeGreaterThanOrEqualTo(String value) {
            addCriterion("variabletype >=", value, "variabletype");
            return (Criteria) this;
        }

        public Criteria andVariabletypeLessThan(String value) {
            addCriterion("variabletype <", value, "variabletype");
            return (Criteria) this;
        }

        public Criteria andVariabletypeLessThanOrEqualTo(String value) {
            addCriterion("variabletype <=", value, "variabletype");
            return (Criteria) this;
        }

        public Criteria andVariabletypeLike(String value) {
            addCriterion("variabletype like", value, "variabletype");
            return (Criteria) this;
        }

        public Criteria andVariabletypeNotLike(String value) {
            addCriterion("variabletype not like", value, "variabletype");
            return (Criteria) this;
        }

        public Criteria andVariabletypeIn(List<String> values) {
            addCriterion("variabletype in", values, "variabletype");
            return (Criteria) this;
        }

        public Criteria andVariabletypeNotIn(List<String> values) {
            addCriterion("variabletype not in", values, "variabletype");
            return (Criteria) this;
        }

        public Criteria andVariabletypeBetween(String value1, String value2) {
            addCriterion("variabletype between", value1, value2, "variabletype");
            return (Criteria) this;
        }

        public Criteria andVariabletypeNotBetween(String value1, String value2) {
            addCriterion("variabletype not between", value1, value2, "variabletype");
            return (Criteria) this;
        }

        public Criteria andFatheridIsNull() {
            addCriterion("fatherid is null");
            return (Criteria) this;
        }

        public Criteria andFatheridIsNotNull() {
            addCriterion("fatherid is not null");
            return (Criteria) this;
        }

        public Criteria andFatheridEqualTo(String value) {
            addCriterion("fatherid =", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridNotEqualTo(String value) {
            addCriterion("fatherid <>", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridGreaterThan(String value) {
            addCriterion("fatherid >", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridGreaterThanOrEqualTo(String value) {
            addCriterion("fatherid >=", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridLessThan(String value) {
            addCriterion("fatherid <", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridLessThanOrEqualTo(String value) {
            addCriterion("fatherid <=", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridLike(String value) {
            addCriterion("fatherid like", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridNotLike(String value) {
            addCriterion("fatherid not like", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridIn(List<String> values) {
            addCriterion("fatherid in", values, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridNotIn(List<String> values) {
            addCriterion("fatherid not in", values, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridBetween(String value1, String value2) {
            addCriterion("fatherid between", value1, value2, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridNotBetween(String value1, String value2) {
            addCriterion("fatherid not between", value1, value2, "fatherid");
            return (Criteria) this;
        }

        public Criteria andVpycodeIsNull() {
            addCriterion("vpycode is null");
            return (Criteria) this;
        }

        public Criteria andVpycodeIsNotNull() {
            addCriterion("vpycode is not null");
            return (Criteria) this;
        }

        public Criteria andVpycodeEqualTo(String value) {
            addCriterion("vpycode =", value, "vpycode");
            return (Criteria) this;
        }

        public Criteria andVpycodeNotEqualTo(String value) {
            addCriterion("vpycode <>", value, "vpycode");
            return (Criteria) this;
        }

        public Criteria andVpycodeGreaterThan(String value) {
            addCriterion("vpycode >", value, "vpycode");
            return (Criteria) this;
        }

        public Criteria andVpycodeGreaterThanOrEqualTo(String value) {
            addCriterion("vpycode >=", value, "vpycode");
            return (Criteria) this;
        }

        public Criteria andVpycodeLessThan(String value) {
            addCriterion("vpycode <", value, "vpycode");
            return (Criteria) this;
        }

        public Criteria andVpycodeLessThanOrEqualTo(String value) {
            addCriterion("vpycode <=", value, "vpycode");
            return (Criteria) this;
        }

        public Criteria andVpycodeLike(String value) {
            addCriterion("vpycode like", value, "vpycode");
            return (Criteria) this;
        }

        public Criteria andVpycodeNotLike(String value) {
            addCriterion("vpycode not like", value, "vpycode");
            return (Criteria) this;
        }

        public Criteria andVpycodeIn(List<String> values) {
            addCriterion("vpycode in", values, "vpycode");
            return (Criteria) this;
        }

        public Criteria andVpycodeNotIn(List<String> values) {
            addCriterion("vpycode not in", values, "vpycode");
            return (Criteria) this;
        }

        public Criteria andVpycodeBetween(String value1, String value2) {
            addCriterion("vpycode between", value1, value2, "vpycode");
            return (Criteria) this;
        }

        public Criteria andVpycodeNotBetween(String value1, String value2) {
            addCriterion("vpycode not between", value1, value2, "vpycode");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andKeycodeIsNull() {
            addCriterion("keycode is null");
            return (Criteria) this;
        }

        public Criteria andKeycodeIsNotNull() {
            addCriterion("keycode is not null");
            return (Criteria) this;
        }

        public Criteria andKeycodeEqualTo(String value) {
            addCriterion("keycode =", value, "keycode");
            return (Criteria) this;
        }

        public Criteria andKeycodeNotEqualTo(String value) {
            addCriterion("keycode <>", value, "keycode");
            return (Criteria) this;
        }

        public Criteria andKeycodeGreaterThan(String value) {
            addCriterion("keycode >", value, "keycode");
            return (Criteria) this;
        }

        public Criteria andKeycodeGreaterThanOrEqualTo(String value) {
            addCriterion("keycode >=", value, "keycode");
            return (Criteria) this;
        }

        public Criteria andKeycodeLessThan(String value) {
            addCriterion("keycode <", value, "keycode");
            return (Criteria) this;
        }

        public Criteria andKeycodeLessThanOrEqualTo(String value) {
            addCriterion("keycode <=", value, "keycode");
            return (Criteria) this;
        }

        public Criteria andKeycodeLike(String value) {
            addCriterion("keycode like", value, "keycode");
            return (Criteria) this;
        }

        public Criteria andKeycodeNotLike(String value) {
            addCriterion("keycode not like", value, "keycode");
            return (Criteria) this;
        }

        public Criteria andKeycodeIn(List<String> values) {
            addCriterion("keycode in", values, "keycode");
            return (Criteria) this;
        }

        public Criteria andKeycodeNotIn(List<String> values) {
            addCriterion("keycode not in", values, "keycode");
            return (Criteria) this;
        }

        public Criteria andKeycodeBetween(String value1, String value2) {
            addCriterion("keycode between", value1, value2, "keycode");
            return (Criteria) this;
        }

        public Criteria andKeycodeNotBetween(String value1, String value2) {
            addCriterion("keycode not between", value1, value2, "keycode");
            return (Criteria) this;
        }

        public Criteria andNowIsNull() {
            addCriterion("now is null");
            return (Criteria) this;
        }

        public Criteria andNowIsNotNull() {
            addCriterion("now is not null");
            return (Criteria) this;
        }

        public Criteria andNowEqualTo(String value) {
            addCriterion("now =", value, "now");
            return (Criteria) this;
        }

        public Criteria andNowNotEqualTo(String value) {
            addCriterion("now <>", value, "now");
            return (Criteria) this;
        }

        public Criteria andNowGreaterThan(String value) {
            addCriterion("now >", value, "now");
            return (Criteria) this;
        }

        public Criteria andNowGreaterThanOrEqualTo(String value) {
            addCriterion("now >=", value, "now");
            return (Criteria) this;
        }

        public Criteria andNowLessThan(String value) {
            addCriterion("now <", value, "now");
            return (Criteria) this;
        }

        public Criteria andNowLessThanOrEqualTo(String value) {
            addCriterion("now <=", value, "now");
            return (Criteria) this;
        }

        public Criteria andNowLike(String value) {
            addCriterion("now like", value, "now");
            return (Criteria) this;
        }

        public Criteria andNowNotLike(String value) {
            addCriterion("now not like", value, "now");
            return (Criteria) this;
        }

        public Criteria andNowIn(List<String> values) {
            addCriterion("now in", values, "now");
            return (Criteria) this;
        }

        public Criteria andNowNotIn(List<String> values) {
            addCriterion("now not in", values, "now");
            return (Criteria) this;
        }

        public Criteria andNowBetween(String value1, String value2) {
            addCriterion("now between", value1, value2, "now");
            return (Criteria) this;
        }

        public Criteria andNowNotBetween(String value1, String value2) {
            addCriterion("now not between", value1, value2, "now");
            return (Criteria) this;
        }

        public Criteria andVariableOrderIsNull() {
            addCriterion("variable_order is null");
            return (Criteria) this;
        }

        public Criteria andVariableOrderIsNotNull() {
            addCriterion("variable_order is not null");
            return (Criteria) this;
        }

        public Criteria andVariableOrderEqualTo(Integer value) {
            addCriterion("variable_order =", value, "variableOrder");
            return (Criteria) this;
        }

        public Criteria andVariableOrderNotEqualTo(Integer value) {
            addCriterion("variable_order <>", value, "variableOrder");
            return (Criteria) this;
        }

        public Criteria andVariableOrderGreaterThan(Integer value) {
            addCriterion("variable_order >", value, "variableOrder");
            return (Criteria) this;
        }

        public Criteria andVariableOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("variable_order >=", value, "variableOrder");
            return (Criteria) this;
        }

        public Criteria andVariableOrderLessThan(Integer value) {
            addCriterion("variable_order <", value, "variableOrder");
            return (Criteria) this;
        }

        public Criteria andVariableOrderLessThanOrEqualTo(Integer value) {
            addCriterion("variable_order <=", value, "variableOrder");
            return (Criteria) this;
        }

        public Criteria andVariableOrderIn(List<Integer> values) {
            addCriterion("variable_order in", values, "variableOrder");
            return (Criteria) this;
        }

        public Criteria andVariableOrderNotIn(List<Integer> values) {
            addCriterion("variable_order not in", values, "variableOrder");
            return (Criteria) this;
        }

        public Criteria andVariableOrderBetween(Integer value1, Integer value2) {
            addCriterion("variable_order between", value1, value2, "variableOrder");
            return (Criteria) this;
        }

        public Criteria andVariableOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("variable_order not between", value1, value2, "variableOrder");
            return (Criteria) this;
        }

        public Criteria andVariableLevelIsNull() {
            addCriterion("variable_level is null");
            return (Criteria) this;
        }

        public Criteria andVariableLevelIsNotNull() {
            addCriterion("variable_level is not null");
            return (Criteria) this;
        }

        public Criteria andVariableLevelEqualTo(Integer value) {
            addCriterion("variable_level =", value, "variableLevel");
            return (Criteria) this;
        }

        public Criteria andVariableLevelNotEqualTo(Integer value) {
            addCriterion("variable_level <>", value, "variableLevel");
            return (Criteria) this;
        }

        public Criteria andVariableLevelGreaterThan(Integer value) {
            addCriterion("variable_level >", value, "variableLevel");
            return (Criteria) this;
        }

        public Criteria andVariableLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("variable_level >=", value, "variableLevel");
            return (Criteria) this;
        }

        public Criteria andVariableLevelLessThan(Integer value) {
            addCriterion("variable_level <", value, "variableLevel");
            return (Criteria) this;
        }

        public Criteria andVariableLevelLessThanOrEqualTo(Integer value) {
            addCriterion("variable_level <=", value, "variableLevel");
            return (Criteria) this;
        }

        public Criteria andVariableLevelIn(List<Integer> values) {
            addCriterion("variable_level in", values, "variableLevel");
            return (Criteria) this;
        }

        public Criteria andVariableLevelNotIn(List<Integer> values) {
            addCriterion("variable_level not in", values, "variableLevel");
            return (Criteria) this;
        }

        public Criteria andVariableLevelBetween(Integer value1, Integer value2) {
            addCriterion("variable_level between", value1, value2, "variableLevel");
            return (Criteria) this;
        }

        public Criteria andVariableLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("variable_level not between", value1, value2, "variableLevel");
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
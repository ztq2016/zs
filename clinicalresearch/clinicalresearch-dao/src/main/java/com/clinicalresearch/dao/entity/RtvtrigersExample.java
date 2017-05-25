package com.clinicalresearch.dao.entity;

import java.util.ArrayList;
import java.util.List;

public class RtvtrigersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RtvtrigersExample() {
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

        public Criteria andTrigeridIsNull() {
            addCriterion("trigerid is null");
            return (Criteria) this;
        }

        public Criteria andTrigeridIsNotNull() {
            addCriterion("trigerid is not null");
            return (Criteria) this;
        }

        public Criteria andTrigeridEqualTo(String value) {
            addCriterion("trigerid =", value, "trigerid");
            return (Criteria) this;
        }

        public Criteria andTrigeridNotEqualTo(String value) {
            addCriterion("trigerid <>", value, "trigerid");
            return (Criteria) this;
        }

        public Criteria andTrigeridGreaterThan(String value) {
            addCriterion("trigerid >", value, "trigerid");
            return (Criteria) this;
        }

        public Criteria andTrigeridGreaterThanOrEqualTo(String value) {
            addCriterion("trigerid >=", value, "trigerid");
            return (Criteria) this;
        }

        public Criteria andTrigeridLessThan(String value) {
            addCriterion("trigerid <", value, "trigerid");
            return (Criteria) this;
        }

        public Criteria andTrigeridLessThanOrEqualTo(String value) {
            addCriterion("trigerid <=", value, "trigerid");
            return (Criteria) this;
        }

        public Criteria andTrigeridLike(String value) {
            addCriterion("trigerid like", value, "trigerid");
            return (Criteria) this;
        }

        public Criteria andTrigeridNotLike(String value) {
            addCriterion("trigerid not like", value, "trigerid");
            return (Criteria) this;
        }

        public Criteria andTrigeridIn(List<String> values) {
            addCriterion("trigerid in", values, "trigerid");
            return (Criteria) this;
        }

        public Criteria andTrigeridNotIn(List<String> values) {
            addCriterion("trigerid not in", values, "trigerid");
            return (Criteria) this;
        }

        public Criteria andTrigeridBetween(String value1, String value2) {
            addCriterion("trigerid between", value1, value2, "trigerid");
            return (Criteria) this;
        }

        public Criteria andTrigeridNotBetween(String value1, String value2) {
            addCriterion("trigerid not between", value1, value2, "trigerid");
            return (Criteria) this;
        }

        public Criteria andTrigernameIsNull() {
            addCriterion("trigername is null");
            return (Criteria) this;
        }

        public Criteria andTrigernameIsNotNull() {
            addCriterion("trigername is not null");
            return (Criteria) this;
        }

        public Criteria andTrigernameEqualTo(String value) {
            addCriterion("trigername =", value, "trigername");
            return (Criteria) this;
        }

        public Criteria andTrigernameNotEqualTo(String value) {
            addCriterion("trigername <>", value, "trigername");
            return (Criteria) this;
        }

        public Criteria andTrigernameGreaterThan(String value) {
            addCriterion("trigername >", value, "trigername");
            return (Criteria) this;
        }

        public Criteria andTrigernameGreaterThanOrEqualTo(String value) {
            addCriterion("trigername >=", value, "trigername");
            return (Criteria) this;
        }

        public Criteria andTrigernameLessThan(String value) {
            addCriterion("trigername <", value, "trigername");
            return (Criteria) this;
        }

        public Criteria andTrigernameLessThanOrEqualTo(String value) {
            addCriterion("trigername <=", value, "trigername");
            return (Criteria) this;
        }

        public Criteria andTrigernameLike(String value) {
            addCriterion("trigername like", value, "trigername");
            return (Criteria) this;
        }

        public Criteria andTrigernameNotLike(String value) {
            addCriterion("trigername not like", value, "trigername");
            return (Criteria) this;
        }

        public Criteria andTrigernameIn(List<String> values) {
            addCriterion("trigername in", values, "trigername");
            return (Criteria) this;
        }

        public Criteria andTrigernameNotIn(List<String> values) {
            addCriterion("trigername not in", values, "trigername");
            return (Criteria) this;
        }

        public Criteria andTrigernameBetween(String value1, String value2) {
            addCriterion("trigername between", value1, value2, "trigername");
            return (Criteria) this;
        }

        public Criteria andTrigernameNotBetween(String value1, String value2) {
            addCriterion("trigername not between", value1, value2, "trigername");
            return (Criteria) this;
        }

        public Criteria andTrigertypeIsNull() {
            addCriterion("trigertype is null");
            return (Criteria) this;
        }

        public Criteria andTrigertypeIsNotNull() {
            addCriterion("trigertype is not null");
            return (Criteria) this;
        }

        public Criteria andTrigertypeEqualTo(String value) {
            addCriterion("trigertype =", value, "trigertype");
            return (Criteria) this;
        }

        public Criteria andTrigertypeNotEqualTo(String value) {
            addCriterion("trigertype <>", value, "trigertype");
            return (Criteria) this;
        }

        public Criteria andTrigertypeGreaterThan(String value) {
            addCriterion("trigertype >", value, "trigertype");
            return (Criteria) this;
        }

        public Criteria andTrigertypeGreaterThanOrEqualTo(String value) {
            addCriterion("trigertype >=", value, "trigertype");
            return (Criteria) this;
        }

        public Criteria andTrigertypeLessThan(String value) {
            addCriterion("trigertype <", value, "trigertype");
            return (Criteria) this;
        }

        public Criteria andTrigertypeLessThanOrEqualTo(String value) {
            addCriterion("trigertype <=", value, "trigertype");
            return (Criteria) this;
        }

        public Criteria andTrigertypeLike(String value) {
            addCriterion("trigertype like", value, "trigertype");
            return (Criteria) this;
        }

        public Criteria andTrigertypeNotLike(String value) {
            addCriterion("trigertype not like", value, "trigertype");
            return (Criteria) this;
        }

        public Criteria andTrigertypeIn(List<String> values) {
            addCriterion("trigertype in", values, "trigertype");
            return (Criteria) this;
        }

        public Criteria andTrigertypeNotIn(List<String> values) {
            addCriterion("trigertype not in", values, "trigertype");
            return (Criteria) this;
        }

        public Criteria andTrigertypeBetween(String value1, String value2) {
            addCriterion("trigertype between", value1, value2, "trigertype");
            return (Criteria) this;
        }

        public Criteria andTrigertypeNotBetween(String value1, String value2) {
            addCriterion("trigertype not between", value1, value2, "trigertype");
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

        public Criteria andTimefiledIsNull() {
            addCriterion("timefiled is null");
            return (Criteria) this;
        }

        public Criteria andTimefiledIsNotNull() {
            addCriterion("timefiled is not null");
            return (Criteria) this;
        }

        public Criteria andTimefiledEqualTo(String value) {
            addCriterion("timefiled =", value, "timefiled");
            return (Criteria) this;
        }

        public Criteria andTimefiledNotEqualTo(String value) {
            addCriterion("timefiled <>", value, "timefiled");
            return (Criteria) this;
        }

        public Criteria andTimefiledGreaterThan(String value) {
            addCriterion("timefiled >", value, "timefiled");
            return (Criteria) this;
        }

        public Criteria andTimefiledGreaterThanOrEqualTo(String value) {
            addCriterion("timefiled >=", value, "timefiled");
            return (Criteria) this;
        }

        public Criteria andTimefiledLessThan(String value) {
            addCriterion("timefiled <", value, "timefiled");
            return (Criteria) this;
        }

        public Criteria andTimefiledLessThanOrEqualTo(String value) {
            addCriterion("timefiled <=", value, "timefiled");
            return (Criteria) this;
        }

        public Criteria andTimefiledLike(String value) {
            addCriterion("timefiled like", value, "timefiled");
            return (Criteria) this;
        }

        public Criteria andTimefiledNotLike(String value) {
            addCriterion("timefiled not like", value, "timefiled");
            return (Criteria) this;
        }

        public Criteria andTimefiledIn(List<String> values) {
            addCriterion("timefiled in", values, "timefiled");
            return (Criteria) this;
        }

        public Criteria andTimefiledNotIn(List<String> values) {
            addCriterion("timefiled not in", values, "timefiled");
            return (Criteria) this;
        }

        public Criteria andTimefiledBetween(String value1, String value2) {
            addCriterion("timefiled between", value1, value2, "timefiled");
            return (Criteria) this;
        }

        public Criteria andTimefiledNotBetween(String value1, String value2) {
            addCriterion("timefiled not between", value1, value2, "timefiled");
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
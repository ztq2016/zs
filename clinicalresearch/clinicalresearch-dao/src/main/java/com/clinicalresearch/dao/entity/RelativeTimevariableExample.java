package com.clinicalresearch.dao.entity;

import java.util.ArrayList;
import java.util.List;

public class RelativeTimevariableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RelativeTimevariableExample() {
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

        public Criteria andTrigereventIsNull() {
            addCriterion("trigerevent is null");
            return (Criteria) this;
        }

        public Criteria andTrigereventIsNotNull() {
            addCriterion("trigerevent is not null");
            return (Criteria) this;
        }

        public Criteria andTrigereventEqualTo(String value) {
            addCriterion("trigerevent =", value, "trigerevent");
            return (Criteria) this;
        }

        public Criteria andTrigereventNotEqualTo(String value) {
            addCriterion("trigerevent <>", value, "trigerevent");
            return (Criteria) this;
        }

        public Criteria andTrigereventGreaterThan(String value) {
            addCriterion("trigerevent >", value, "trigerevent");
            return (Criteria) this;
        }

        public Criteria andTrigereventGreaterThanOrEqualTo(String value) {
            addCriterion("trigerevent >=", value, "trigerevent");
            return (Criteria) this;
        }

        public Criteria andTrigereventLessThan(String value) {
            addCriterion("trigerevent <", value, "trigerevent");
            return (Criteria) this;
        }

        public Criteria andTrigereventLessThanOrEqualTo(String value) {
            addCriterion("trigerevent <=", value, "trigerevent");
            return (Criteria) this;
        }

        public Criteria andTrigereventLike(String value) {
            addCriterion("trigerevent like", value, "trigerevent");
            return (Criteria) this;
        }

        public Criteria andTrigereventNotLike(String value) {
            addCriterion("trigerevent not like", value, "trigerevent");
            return (Criteria) this;
        }

        public Criteria andTrigereventIn(List<String> values) {
            addCriterion("trigerevent in", values, "trigerevent");
            return (Criteria) this;
        }

        public Criteria andTrigereventNotIn(List<String> values) {
            addCriterion("trigerevent not in", values, "trigerevent");
            return (Criteria) this;
        }

        public Criteria andTrigereventBetween(String value1, String value2) {
            addCriterion("trigerevent between", value1, value2, "trigerevent");
            return (Criteria) this;
        }

        public Criteria andTrigereventNotBetween(String value1, String value2) {
            addCriterion("trigerevent not between", value1, value2, "trigerevent");
            return (Criteria) this;
        }

        public Criteria andTrigereventbaIsNull() {
            addCriterion("trigereventba is null");
            return (Criteria) this;
        }

        public Criteria andTrigereventbaIsNotNull() {
            addCriterion("trigereventba is not null");
            return (Criteria) this;
        }

        public Criteria andTrigereventbaEqualTo(String value) {
            addCriterion("trigereventba =", value, "trigereventba");
            return (Criteria) this;
        }

        public Criteria andTrigereventbaNotEqualTo(String value) {
            addCriterion("trigereventba <>", value, "trigereventba");
            return (Criteria) this;
        }

        public Criteria andTrigereventbaGreaterThan(String value) {
            addCriterion("trigereventba >", value, "trigereventba");
            return (Criteria) this;
        }

        public Criteria andTrigereventbaGreaterThanOrEqualTo(String value) {
            addCriterion("trigereventba >=", value, "trigereventba");
            return (Criteria) this;
        }

        public Criteria andTrigereventbaLessThan(String value) {
            addCriterion("trigereventba <", value, "trigereventba");
            return (Criteria) this;
        }

        public Criteria andTrigereventbaLessThanOrEqualTo(String value) {
            addCriterion("trigereventba <=", value, "trigereventba");
            return (Criteria) this;
        }

        public Criteria andTrigereventbaLike(String value) {
            addCriterion("trigereventba like", value, "trigereventba");
            return (Criteria) this;
        }

        public Criteria andTrigereventbaNotLike(String value) {
            addCriterion("trigereventba not like", value, "trigereventba");
            return (Criteria) this;
        }

        public Criteria andTrigereventbaIn(List<String> values) {
            addCriterion("trigereventba in", values, "trigereventba");
            return (Criteria) this;
        }

        public Criteria andTrigereventbaNotIn(List<String> values) {
            addCriterion("trigereventba not in", values, "trigereventba");
            return (Criteria) this;
        }

        public Criteria andTrigereventbaBetween(String value1, String value2) {
            addCriterion("trigereventba between", value1, value2, "trigereventba");
            return (Criteria) this;
        }

        public Criteria andTrigereventbaNotBetween(String value1, String value2) {
            addCriterion("trigereventba not between", value1, value2, "trigereventba");
            return (Criteria) this;
        }

        public Criteria andFinaleventIsNull() {
            addCriterion("finalevent is null");
            return (Criteria) this;
        }

        public Criteria andFinaleventIsNotNull() {
            addCriterion("finalevent is not null");
            return (Criteria) this;
        }

        public Criteria andFinaleventEqualTo(String value) {
            addCriterion("finalevent =", value, "finalevent");
            return (Criteria) this;
        }

        public Criteria andFinaleventNotEqualTo(String value) {
            addCriterion("finalevent <>", value, "finalevent");
            return (Criteria) this;
        }

        public Criteria andFinaleventGreaterThan(String value) {
            addCriterion("finalevent >", value, "finalevent");
            return (Criteria) this;
        }

        public Criteria andFinaleventGreaterThanOrEqualTo(String value) {
            addCriterion("finalevent >=", value, "finalevent");
            return (Criteria) this;
        }

        public Criteria andFinaleventLessThan(String value) {
            addCriterion("finalevent <", value, "finalevent");
            return (Criteria) this;
        }

        public Criteria andFinaleventLessThanOrEqualTo(String value) {
            addCriterion("finalevent <=", value, "finalevent");
            return (Criteria) this;
        }

        public Criteria andFinaleventLike(String value) {
            addCriterion("finalevent like", value, "finalevent");
            return (Criteria) this;
        }

        public Criteria andFinaleventNotLike(String value) {
            addCriterion("finalevent not like", value, "finalevent");
            return (Criteria) this;
        }

        public Criteria andFinaleventIn(List<String> values) {
            addCriterion("finalevent in", values, "finalevent");
            return (Criteria) this;
        }

        public Criteria andFinaleventNotIn(List<String> values) {
            addCriterion("finalevent not in", values, "finalevent");
            return (Criteria) this;
        }

        public Criteria andFinaleventBetween(String value1, String value2) {
            addCriterion("finalevent between", value1, value2, "finalevent");
            return (Criteria) this;
        }

        public Criteria andFinaleventNotBetween(String value1, String value2) {
            addCriterion("finalevent not between", value1, value2, "finalevent");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeIsNull() {
            addCriterion("finaleventtime is null");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeIsNotNull() {
            addCriterion("finaleventtime is not null");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeEqualTo(String value) {
            addCriterion("finaleventtime =", value, "finaleventtime");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeNotEqualTo(String value) {
            addCriterion("finaleventtime <>", value, "finaleventtime");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeGreaterThan(String value) {
            addCriterion("finaleventtime >", value, "finaleventtime");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeGreaterThanOrEqualTo(String value) {
            addCriterion("finaleventtime >=", value, "finaleventtime");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeLessThan(String value) {
            addCriterion("finaleventtime <", value, "finaleventtime");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeLessThanOrEqualTo(String value) {
            addCriterion("finaleventtime <=", value, "finaleventtime");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeLike(String value) {
            addCriterion("finaleventtime like", value, "finaleventtime");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeNotLike(String value) {
            addCriterion("finaleventtime not like", value, "finaleventtime");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeIn(List<String> values) {
            addCriterion("finaleventtime in", values, "finaleventtime");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeNotIn(List<String> values) {
            addCriterion("finaleventtime not in", values, "finaleventtime");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeBetween(String value1, String value2) {
            addCriterion("finaleventtime between", value1, value2, "finaleventtime");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeNotBetween(String value1, String value2) {
            addCriterion("finaleventtime not between", value1, value2, "finaleventtime");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeunitIsNull() {
            addCriterion("finaleventtimeunit is null");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeunitIsNotNull() {
            addCriterion("finaleventtimeunit is not null");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeunitEqualTo(String value) {
            addCriterion("finaleventtimeunit =", value, "finaleventtimeunit");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeunitNotEqualTo(String value) {
            addCriterion("finaleventtimeunit <>", value, "finaleventtimeunit");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeunitGreaterThan(String value) {
            addCriterion("finaleventtimeunit >", value, "finaleventtimeunit");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeunitGreaterThanOrEqualTo(String value) {
            addCriterion("finaleventtimeunit >=", value, "finaleventtimeunit");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeunitLessThan(String value) {
            addCriterion("finaleventtimeunit <", value, "finaleventtimeunit");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeunitLessThanOrEqualTo(String value) {
            addCriterion("finaleventtimeunit <=", value, "finaleventtimeunit");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeunitLike(String value) {
            addCriterion("finaleventtimeunit like", value, "finaleventtimeunit");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeunitNotLike(String value) {
            addCriterion("finaleventtimeunit not like", value, "finaleventtimeunit");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeunitIn(List<String> values) {
            addCriterion("finaleventtimeunit in", values, "finaleventtimeunit");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeunitNotIn(List<String> values) {
            addCriterion("finaleventtimeunit not in", values, "finaleventtimeunit");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeunitBetween(String value1, String value2) {
            addCriterion("finaleventtimeunit between", value1, value2, "finaleventtimeunit");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeunitNotBetween(String value1, String value2) {
            addCriterion("finaleventtimeunit not between", value1, value2, "finaleventtimeunit");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeioIsNull() {
            addCriterion("finaleventtimeio is null");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeioIsNotNull() {
            addCriterion("finaleventtimeio is not null");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeioEqualTo(String value) {
            addCriterion("finaleventtimeio =", value, "finaleventtimeio");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeioNotEqualTo(String value) {
            addCriterion("finaleventtimeio <>", value, "finaleventtimeio");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeioGreaterThan(String value) {
            addCriterion("finaleventtimeio >", value, "finaleventtimeio");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeioGreaterThanOrEqualTo(String value) {
            addCriterion("finaleventtimeio >=", value, "finaleventtimeio");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeioLessThan(String value) {
            addCriterion("finaleventtimeio <", value, "finaleventtimeio");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeioLessThanOrEqualTo(String value) {
            addCriterion("finaleventtimeio <=", value, "finaleventtimeio");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeioLike(String value) {
            addCriterion("finaleventtimeio like", value, "finaleventtimeio");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeioNotLike(String value) {
            addCriterion("finaleventtimeio not like", value, "finaleventtimeio");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeioIn(List<String> values) {
            addCriterion("finaleventtimeio in", values, "finaleventtimeio");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeioNotIn(List<String> values) {
            addCriterion("finaleventtimeio not in", values, "finaleventtimeio");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeioBetween(String value1, String value2) {
            addCriterion("finaleventtimeio between", value1, value2, "finaleventtimeio");
            return (Criteria) this;
        }

        public Criteria andFinaleventtimeioNotBetween(String value1, String value2) {
            addCriterion("finaleventtimeio not between", value1, value2, "finaleventtimeio");
            return (Criteria) this;
        }

        public Criteria andFinaleventencounterIsNull() {
            addCriterion("finaleventencounter is null");
            return (Criteria) this;
        }

        public Criteria andFinaleventencounterIsNotNull() {
            addCriterion("finaleventencounter is not null");
            return (Criteria) this;
        }

        public Criteria andFinaleventencounterEqualTo(String value) {
            addCriterion("finaleventencounter =", value, "finaleventencounter");
            return (Criteria) this;
        }

        public Criteria andFinaleventencounterNotEqualTo(String value) {
            addCriterion("finaleventencounter <>", value, "finaleventencounter");
            return (Criteria) this;
        }

        public Criteria andFinaleventencounterGreaterThan(String value) {
            addCriterion("finaleventencounter >", value, "finaleventencounter");
            return (Criteria) this;
        }

        public Criteria andFinaleventencounterGreaterThanOrEqualTo(String value) {
            addCriterion("finaleventencounter >=", value, "finaleventencounter");
            return (Criteria) this;
        }

        public Criteria andFinaleventencounterLessThan(String value) {
            addCriterion("finaleventencounter <", value, "finaleventencounter");
            return (Criteria) this;
        }

        public Criteria andFinaleventencounterLessThanOrEqualTo(String value) {
            addCriterion("finaleventencounter <=", value, "finaleventencounter");
            return (Criteria) this;
        }

        public Criteria andFinaleventencounterLike(String value) {
            addCriterion("finaleventencounter like", value, "finaleventencounter");
            return (Criteria) this;
        }

        public Criteria andFinaleventencounterNotLike(String value) {
            addCriterion("finaleventencounter not like", value, "finaleventencounter");
            return (Criteria) this;
        }

        public Criteria andFinaleventencounterIn(List<String> values) {
            addCriterion("finaleventencounter in", values, "finaleventencounter");
            return (Criteria) this;
        }

        public Criteria andFinaleventencounterNotIn(List<String> values) {
            addCriterion("finaleventencounter not in", values, "finaleventencounter");
            return (Criteria) this;
        }

        public Criteria andFinaleventencounterBetween(String value1, String value2) {
            addCriterion("finaleventencounter between", value1, value2, "finaleventencounter");
            return (Criteria) this;
        }

        public Criteria andFinaleventencounterNotBetween(String value1, String value2) {
            addCriterion("finaleventencounter not between", value1, value2, "finaleventencounter");
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
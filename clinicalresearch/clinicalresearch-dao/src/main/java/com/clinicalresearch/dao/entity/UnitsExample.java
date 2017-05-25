package com.clinicalresearch.dao.entity;

import java.util.ArrayList;
import java.util.List;

public class UnitsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UnitsExample() {
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

        public Criteria andUnittableidIsNull() {
            addCriterion("unittableid is null");
            return (Criteria) this;
        }

        public Criteria andUnittableidIsNotNull() {
            addCriterion("unittableid is not null");
            return (Criteria) this;
        }

        public Criteria andUnittableidEqualTo(String value) {
            addCriterion("unittableid =", value, "unittableid");
            return (Criteria) this;
        }

        public Criteria andUnittableidNotEqualTo(String value) {
            addCriterion("unittableid <>", value, "unittableid");
            return (Criteria) this;
        }

        public Criteria andUnittableidGreaterThan(String value) {
            addCriterion("unittableid >", value, "unittableid");
            return (Criteria) this;
        }

        public Criteria andUnittableidGreaterThanOrEqualTo(String value) {
            addCriterion("unittableid >=", value, "unittableid");
            return (Criteria) this;
        }

        public Criteria andUnittableidLessThan(String value) {
            addCriterion("unittableid <", value, "unittableid");
            return (Criteria) this;
        }

        public Criteria andUnittableidLessThanOrEqualTo(String value) {
            addCriterion("unittableid <=", value, "unittableid");
            return (Criteria) this;
        }

        public Criteria andUnittableidLike(String value) {
            addCriterion("unittableid like", value, "unittableid");
            return (Criteria) this;
        }

        public Criteria andUnittableidNotLike(String value) {
            addCriterion("unittableid not like", value, "unittableid");
            return (Criteria) this;
        }

        public Criteria andUnittableidIn(List<String> values) {
            addCriterion("unittableid in", values, "unittableid");
            return (Criteria) this;
        }

        public Criteria andUnittableidNotIn(List<String> values) {
            addCriterion("unittableid not in", values, "unittableid");
            return (Criteria) this;
        }

        public Criteria andUnittableidBetween(String value1, String value2) {
            addCriterion("unittableid between", value1, value2, "unittableid");
            return (Criteria) this;
        }

        public Criteria andUnittableidNotBetween(String value1, String value2) {
            addCriterion("unittableid not between", value1, value2, "unittableid");
            return (Criteria) this;
        }

        public Criteria andUnitidIsNull() {
            addCriterion("unitid is null");
            return (Criteria) this;
        }

        public Criteria andUnitidIsNotNull() {
            addCriterion("unitid is not null");
            return (Criteria) this;
        }

        public Criteria andUnitidEqualTo(String value) {
            addCriterion("unitid =", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotEqualTo(String value) {
            addCriterion("unitid <>", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidGreaterThan(String value) {
            addCriterion("unitid >", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidGreaterThanOrEqualTo(String value) {
            addCriterion("unitid >=", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidLessThan(String value) {
            addCriterion("unitid <", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidLessThanOrEqualTo(String value) {
            addCriterion("unitid <=", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidLike(String value) {
            addCriterion("unitid like", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotLike(String value) {
            addCriterion("unitid not like", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidIn(List<String> values) {
            addCriterion("unitid in", values, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotIn(List<String> values) {
            addCriterion("unitid not in", values, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidBetween(String value1, String value2) {
            addCriterion("unitid between", value1, value2, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotBetween(String value1, String value2) {
            addCriterion("unitid not between", value1, value2, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitnameIsNull() {
            addCriterion("unitname is null");
            return (Criteria) this;
        }

        public Criteria andUnitnameIsNotNull() {
            addCriterion("unitname is not null");
            return (Criteria) this;
        }

        public Criteria andUnitnameEqualTo(String value) {
            addCriterion("unitname =", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotEqualTo(String value) {
            addCriterion("unitname <>", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameGreaterThan(String value) {
            addCriterion("unitname >", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameGreaterThanOrEqualTo(String value) {
            addCriterion("unitname >=", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLessThan(String value) {
            addCriterion("unitname <", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLessThanOrEqualTo(String value) {
            addCriterion("unitname <=", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLike(String value) {
            addCriterion("unitname like", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotLike(String value) {
            addCriterion("unitname not like", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameIn(List<String> values) {
            addCriterion("unitname in", values, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotIn(List<String> values) {
            addCriterion("unitname not in", values, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameBetween(String value1, String value2) {
            addCriterion("unitname between", value1, value2, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotBetween(String value1, String value2) {
            addCriterion("unitname not between", value1, value2, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnittypeIsNull() {
            addCriterion("unittype is null");
            return (Criteria) this;
        }

        public Criteria andUnittypeIsNotNull() {
            addCriterion("unittype is not null");
            return (Criteria) this;
        }

        public Criteria andUnittypeEqualTo(String value) {
            addCriterion("unittype =", value, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeNotEqualTo(String value) {
            addCriterion("unittype <>", value, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeGreaterThan(String value) {
            addCriterion("unittype >", value, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeGreaterThanOrEqualTo(String value) {
            addCriterion("unittype >=", value, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeLessThan(String value) {
            addCriterion("unittype <", value, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeLessThanOrEqualTo(String value) {
            addCriterion("unittype <=", value, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeLike(String value) {
            addCriterion("unittype like", value, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeNotLike(String value) {
            addCriterion("unittype not like", value, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeIn(List<String> values) {
            addCriterion("unittype in", values, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeNotIn(List<String> values) {
            addCriterion("unittype not in", values, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeBetween(String value1, String value2) {
            addCriterion("unittype between", value1, value2, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeNotBetween(String value1, String value2) {
            addCriterion("unittype not between", value1, value2, "unittype");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIsNull() {
            addCriterion("isdefault is null");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIsNotNull() {
            addCriterion("isdefault is not null");
            return (Criteria) this;
        }

        public Criteria andIsdefaultEqualTo(String value) {
            addCriterion("isdefault =", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotEqualTo(String value) {
            addCriterion("isdefault <>", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultGreaterThan(String value) {
            addCriterion("isdefault >", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultGreaterThanOrEqualTo(String value) {
            addCriterion("isdefault >=", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultLessThan(String value) {
            addCriterion("isdefault <", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultLessThanOrEqualTo(String value) {
            addCriterion("isdefault <=", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultLike(String value) {
            addCriterion("isdefault like", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotLike(String value) {
            addCriterion("isdefault not like", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIn(List<String> values) {
            addCriterion("isdefault in", values, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotIn(List<String> values) {
            addCriterion("isdefault not in", values, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultBetween(String value1, String value2) {
            addCriterion("isdefault between", value1, value2, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotBetween(String value1, String value2) {
            addCriterion("isdefault not between", value1, value2, "isdefault");
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
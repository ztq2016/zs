package com.clinicalresearch.dao.entity;

import java.util.ArrayList;
import java.util.List;

public class IndicatorFieldsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IndicatorFieldsExample() {
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

        public Criteria andFieldidIsNull() {
            addCriterion("fieldid is null");
            return (Criteria) this;
        }

        public Criteria andFieldidIsNotNull() {
            addCriterion("fieldid is not null");
            return (Criteria) this;
        }

        public Criteria andFieldidEqualTo(String value) {
            addCriterion("fieldid =", value, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldidNotEqualTo(String value) {
            addCriterion("fieldid <>", value, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldidGreaterThan(String value) {
            addCriterion("fieldid >", value, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldidGreaterThanOrEqualTo(String value) {
            addCriterion("fieldid >=", value, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldidLessThan(String value) {
            addCriterion("fieldid <", value, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldidLessThanOrEqualTo(String value) {
            addCriterion("fieldid <=", value, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldidLike(String value) {
            addCriterion("fieldid like", value, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldidNotLike(String value) {
            addCriterion("fieldid not like", value, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldidIn(List<String> values) {
            addCriterion("fieldid in", values, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldidNotIn(List<String> values) {
            addCriterion("fieldid not in", values, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldidBetween(String value1, String value2) {
            addCriterion("fieldid between", value1, value2, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldidNotBetween(String value1, String value2) {
            addCriterion("fieldid not between", value1, value2, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldnameIsNull() {
            addCriterion("fieldname is null");
            return (Criteria) this;
        }

        public Criteria andFieldnameIsNotNull() {
            addCriterion("fieldname is not null");
            return (Criteria) this;
        }

        public Criteria andFieldnameEqualTo(String value) {
            addCriterion("fieldname =", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameNotEqualTo(String value) {
            addCriterion("fieldname <>", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameGreaterThan(String value) {
            addCriterion("fieldname >", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameGreaterThanOrEqualTo(String value) {
            addCriterion("fieldname >=", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameLessThan(String value) {
            addCriterion("fieldname <", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameLessThanOrEqualTo(String value) {
            addCriterion("fieldname <=", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameLike(String value) {
            addCriterion("fieldname like", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameNotLike(String value) {
            addCriterion("fieldname not like", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameIn(List<String> values) {
            addCriterion("fieldname in", values, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameNotIn(List<String> values) {
            addCriterion("fieldname not in", values, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameBetween(String value1, String value2) {
            addCriterion("fieldname between", value1, value2, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameNotBetween(String value1, String value2) {
            addCriterion("fieldname not between", value1, value2, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldtypeIsNull() {
            addCriterion("fieldtype is null");
            return (Criteria) this;
        }

        public Criteria andFieldtypeIsNotNull() {
            addCriterion("fieldtype is not null");
            return (Criteria) this;
        }

        public Criteria andFieldtypeEqualTo(String value) {
            addCriterion("fieldtype =", value, "fieldtype");
            return (Criteria) this;
        }

        public Criteria andFieldtypeNotEqualTo(String value) {
            addCriterion("fieldtype <>", value, "fieldtype");
            return (Criteria) this;
        }

        public Criteria andFieldtypeGreaterThan(String value) {
            addCriterion("fieldtype >", value, "fieldtype");
            return (Criteria) this;
        }

        public Criteria andFieldtypeGreaterThanOrEqualTo(String value) {
            addCriterion("fieldtype >=", value, "fieldtype");
            return (Criteria) this;
        }

        public Criteria andFieldtypeLessThan(String value) {
            addCriterion("fieldtype <", value, "fieldtype");
            return (Criteria) this;
        }

        public Criteria andFieldtypeLessThanOrEqualTo(String value) {
            addCriterion("fieldtype <=", value, "fieldtype");
            return (Criteria) this;
        }

        public Criteria andFieldtypeLike(String value) {
            addCriterion("fieldtype like", value, "fieldtype");
            return (Criteria) this;
        }

        public Criteria andFieldtypeNotLike(String value) {
            addCriterion("fieldtype not like", value, "fieldtype");
            return (Criteria) this;
        }

        public Criteria andFieldtypeIn(List<String> values) {
            addCriterion("fieldtype in", values, "fieldtype");
            return (Criteria) this;
        }

        public Criteria andFieldtypeNotIn(List<String> values) {
            addCriterion("fieldtype not in", values, "fieldtype");
            return (Criteria) this;
        }

        public Criteria andFieldtypeBetween(String value1, String value2) {
            addCriterion("fieldtype between", value1, value2, "fieldtype");
            return (Criteria) this;
        }

        public Criteria andFieldtypeNotBetween(String value1, String value2) {
            addCriterion("fieldtype not between", value1, value2, "fieldtype");
            return (Criteria) this;
        }

        public Criteria andFieldvalueIsNull() {
            addCriterion("fieldvalue is null");
            return (Criteria) this;
        }

        public Criteria andFieldvalueIsNotNull() {
            addCriterion("fieldvalue is not null");
            return (Criteria) this;
        }

        public Criteria andFieldvalueEqualTo(String value) {
            addCriterion("fieldvalue =", value, "fieldvalue");
            return (Criteria) this;
        }

        public Criteria andFieldvalueNotEqualTo(String value) {
            addCriterion("fieldvalue <>", value, "fieldvalue");
            return (Criteria) this;
        }

        public Criteria andFieldvalueGreaterThan(String value) {
            addCriterion("fieldvalue >", value, "fieldvalue");
            return (Criteria) this;
        }

        public Criteria andFieldvalueGreaterThanOrEqualTo(String value) {
            addCriterion("fieldvalue >=", value, "fieldvalue");
            return (Criteria) this;
        }

        public Criteria andFieldvalueLessThan(String value) {
            addCriterion("fieldvalue <", value, "fieldvalue");
            return (Criteria) this;
        }

        public Criteria andFieldvalueLessThanOrEqualTo(String value) {
            addCriterion("fieldvalue <=", value, "fieldvalue");
            return (Criteria) this;
        }

        public Criteria andFieldvalueLike(String value) {
            addCriterion("fieldvalue like", value, "fieldvalue");
            return (Criteria) this;
        }

        public Criteria andFieldvalueNotLike(String value) {
            addCriterion("fieldvalue not like", value, "fieldvalue");
            return (Criteria) this;
        }

        public Criteria andFieldvalueIn(List<String> values) {
            addCriterion("fieldvalue in", values, "fieldvalue");
            return (Criteria) this;
        }

        public Criteria andFieldvalueNotIn(List<String> values) {
            addCriterion("fieldvalue not in", values, "fieldvalue");
            return (Criteria) this;
        }

        public Criteria andFieldvalueBetween(String value1, String value2) {
            addCriterion("fieldvalue between", value1, value2, "fieldvalue");
            return (Criteria) this;
        }

        public Criteria andFieldvalueNotBetween(String value1, String value2) {
            addCriterion("fieldvalue not between", value1, value2, "fieldvalue");
            return (Criteria) this;
        }

        public Criteria andFieldversionIsNull() {
            addCriterion("fieldversion is null");
            return (Criteria) this;
        }

        public Criteria andFieldversionIsNotNull() {
            addCriterion("fieldversion is not null");
            return (Criteria) this;
        }

        public Criteria andFieldversionEqualTo(String value) {
            addCriterion("fieldversion =", value, "fieldversion");
            return (Criteria) this;
        }

        public Criteria andFieldversionNotEqualTo(String value) {
            addCriterion("fieldversion <>", value, "fieldversion");
            return (Criteria) this;
        }

        public Criteria andFieldversionGreaterThan(String value) {
            addCriterion("fieldversion >", value, "fieldversion");
            return (Criteria) this;
        }

        public Criteria andFieldversionGreaterThanOrEqualTo(String value) {
            addCriterion("fieldversion >=", value, "fieldversion");
            return (Criteria) this;
        }

        public Criteria andFieldversionLessThan(String value) {
            addCriterion("fieldversion <", value, "fieldversion");
            return (Criteria) this;
        }

        public Criteria andFieldversionLessThanOrEqualTo(String value) {
            addCriterion("fieldversion <=", value, "fieldversion");
            return (Criteria) this;
        }

        public Criteria andFieldversionLike(String value) {
            addCriterion("fieldversion like", value, "fieldversion");
            return (Criteria) this;
        }

        public Criteria andFieldversionNotLike(String value) {
            addCriterion("fieldversion not like", value, "fieldversion");
            return (Criteria) this;
        }

        public Criteria andFieldversionIn(List<String> values) {
            addCriterion("fieldversion in", values, "fieldversion");
            return (Criteria) this;
        }

        public Criteria andFieldversionNotIn(List<String> values) {
            addCriterion("fieldversion not in", values, "fieldversion");
            return (Criteria) this;
        }

        public Criteria andFieldversionBetween(String value1, String value2) {
            addCriterion("fieldversion between", value1, value2, "fieldversion");
            return (Criteria) this;
        }

        public Criteria andFieldversionNotBetween(String value1, String value2) {
            addCriterion("fieldversion not between", value1, value2, "fieldversion");
            return (Criteria) this;
        }

        public Criteria andFielddescIsNull() {
            addCriterion("fielddesc is null");
            return (Criteria) this;
        }

        public Criteria andFielddescIsNotNull() {
            addCriterion("fielddesc is not null");
            return (Criteria) this;
        }

        public Criteria andFielddescEqualTo(String value) {
            addCriterion("fielddesc =", value, "fielddesc");
            return (Criteria) this;
        }

        public Criteria andFielddescNotEqualTo(String value) {
            addCriterion("fielddesc <>", value, "fielddesc");
            return (Criteria) this;
        }

        public Criteria andFielddescGreaterThan(String value) {
            addCriterion("fielddesc >", value, "fielddesc");
            return (Criteria) this;
        }

        public Criteria andFielddescGreaterThanOrEqualTo(String value) {
            addCriterion("fielddesc >=", value, "fielddesc");
            return (Criteria) this;
        }

        public Criteria andFielddescLessThan(String value) {
            addCriterion("fielddesc <", value, "fielddesc");
            return (Criteria) this;
        }

        public Criteria andFielddescLessThanOrEqualTo(String value) {
            addCriterion("fielddesc <=", value, "fielddesc");
            return (Criteria) this;
        }

        public Criteria andFielddescLike(String value) {
            addCriterion("fielddesc like", value, "fielddesc");
            return (Criteria) this;
        }

        public Criteria andFielddescNotLike(String value) {
            addCriterion("fielddesc not like", value, "fielddesc");
            return (Criteria) this;
        }

        public Criteria andFielddescIn(List<String> values) {
            addCriterion("fielddesc in", values, "fielddesc");
            return (Criteria) this;
        }

        public Criteria andFielddescNotIn(List<String> values) {
            addCriterion("fielddesc not in", values, "fielddesc");
            return (Criteria) this;
        }

        public Criteria andFielddescBetween(String value1, String value2) {
            addCriterion("fielddesc between", value1, value2, "fielddesc");
            return (Criteria) this;
        }

        public Criteria andFielddescNotBetween(String value1, String value2) {
            addCriterion("fielddesc not between", value1, value2, "fielddesc");
            return (Criteria) this;
        }

        public Criteria andFpycodeIsNull() {
            addCriterion("fpycode is null");
            return (Criteria) this;
        }

        public Criteria andFpycodeIsNotNull() {
            addCriterion("fpycode is not null");
            return (Criteria) this;
        }

        public Criteria andFpycodeEqualTo(String value) {
            addCriterion("fpycode =", value, "fpycode");
            return (Criteria) this;
        }

        public Criteria andFpycodeNotEqualTo(String value) {
            addCriterion("fpycode <>", value, "fpycode");
            return (Criteria) this;
        }

        public Criteria andFpycodeGreaterThan(String value) {
            addCriterion("fpycode >", value, "fpycode");
            return (Criteria) this;
        }

        public Criteria andFpycodeGreaterThanOrEqualTo(String value) {
            addCriterion("fpycode >=", value, "fpycode");
            return (Criteria) this;
        }

        public Criteria andFpycodeLessThan(String value) {
            addCriterion("fpycode <", value, "fpycode");
            return (Criteria) this;
        }

        public Criteria andFpycodeLessThanOrEqualTo(String value) {
            addCriterion("fpycode <=", value, "fpycode");
            return (Criteria) this;
        }

        public Criteria andFpycodeLike(String value) {
            addCriterion("fpycode like", value, "fpycode");
            return (Criteria) this;
        }

        public Criteria andFpycodeNotLike(String value) {
            addCriterion("fpycode not like", value, "fpycode");
            return (Criteria) this;
        }

        public Criteria andFpycodeIn(List<String> values) {
            addCriterion("fpycode in", values, "fpycode");
            return (Criteria) this;
        }

        public Criteria andFpycodeNotIn(List<String> values) {
            addCriterion("fpycode not in", values, "fpycode");
            return (Criteria) this;
        }

        public Criteria andFpycodeBetween(String value1, String value2) {
            addCriterion("fpycode between", value1, value2, "fpycode");
            return (Criteria) this;
        }

        public Criteria andFpycodeNotBetween(String value1, String value2) {
            addCriterion("fpycode not between", value1, value2, "fpycode");
            return (Criteria) this;
        }

        public Criteria andFieldorderIsNull() {
            addCriterion("fieldorder is null");
            return (Criteria) this;
        }

        public Criteria andFieldorderIsNotNull() {
            addCriterion("fieldorder is not null");
            return (Criteria) this;
        }

        public Criteria andFieldorderEqualTo(String value) {
            addCriterion("fieldorder =", value, "fieldorder");
            return (Criteria) this;
        }

        public Criteria andFieldorderNotEqualTo(String value) {
            addCriterion("fieldorder <>", value, "fieldorder");
            return (Criteria) this;
        }

        public Criteria andFieldorderGreaterThan(String value) {
            addCriterion("fieldorder >", value, "fieldorder");
            return (Criteria) this;
        }

        public Criteria andFieldorderGreaterThanOrEqualTo(String value) {
            addCriterion("fieldorder >=", value, "fieldorder");
            return (Criteria) this;
        }

        public Criteria andFieldorderLessThan(String value) {
            addCriterion("fieldorder <", value, "fieldorder");
            return (Criteria) this;
        }

        public Criteria andFieldorderLessThanOrEqualTo(String value) {
            addCriterion("fieldorder <=", value, "fieldorder");
            return (Criteria) this;
        }

        public Criteria andFieldorderLike(String value) {
            addCriterion("fieldorder like", value, "fieldorder");
            return (Criteria) this;
        }

        public Criteria andFieldorderNotLike(String value) {
            addCriterion("fieldorder not like", value, "fieldorder");
            return (Criteria) this;
        }

        public Criteria andFieldorderIn(List<String> values) {
            addCriterion("fieldorder in", values, "fieldorder");
            return (Criteria) this;
        }

        public Criteria andFieldorderNotIn(List<String> values) {
            addCriterion("fieldorder not in", values, "fieldorder");
            return (Criteria) this;
        }

        public Criteria andFieldorderBetween(String value1, String value2) {
            addCriterion("fieldorder between", value1, value2, "fieldorder");
            return (Criteria) this;
        }

        public Criteria andFieldorderNotBetween(String value1, String value2) {
            addCriterion("fieldorder not between", value1, value2, "fieldorder");
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
package com.clinicalresearch.dao.entity;

import java.util.ArrayList;
import java.util.List;

public class PowersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PowersExample() {
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

        public Criteria andPoweridIsNull() {
            addCriterion("powerid is null");
            return (Criteria) this;
        }

        public Criteria andPoweridIsNotNull() {
            addCriterion("powerid is not null");
            return (Criteria) this;
        }

        public Criteria andPoweridEqualTo(String value) {
            addCriterion("powerid =", value, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridNotEqualTo(String value) {
            addCriterion("powerid <>", value, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridGreaterThan(String value) {
            addCriterion("powerid >", value, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridGreaterThanOrEqualTo(String value) {
            addCriterion("powerid >=", value, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridLessThan(String value) {
            addCriterion("powerid <", value, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridLessThanOrEqualTo(String value) {
            addCriterion("powerid <=", value, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridLike(String value) {
            addCriterion("powerid like", value, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridNotLike(String value) {
            addCriterion("powerid not like", value, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridIn(List<String> values) {
            addCriterion("powerid in", values, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridNotIn(List<String> values) {
            addCriterion("powerid not in", values, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridBetween(String value1, String value2) {
            addCriterion("powerid between", value1, value2, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridNotBetween(String value1, String value2) {
            addCriterion("powerid not between", value1, value2, "powerid");
            return (Criteria) this;
        }

        public Criteria andPowernameIsNull() {
            addCriterion("powername is null");
            return (Criteria) this;
        }

        public Criteria andPowernameIsNotNull() {
            addCriterion("powername is not null");
            return (Criteria) this;
        }

        public Criteria andPowernameEqualTo(String value) {
            addCriterion("powername =", value, "powername");
            return (Criteria) this;
        }

        public Criteria andPowernameNotEqualTo(String value) {
            addCriterion("powername <>", value, "powername");
            return (Criteria) this;
        }

        public Criteria andPowernameGreaterThan(String value) {
            addCriterion("powername >", value, "powername");
            return (Criteria) this;
        }

        public Criteria andPowernameGreaterThanOrEqualTo(String value) {
            addCriterion("powername >=", value, "powername");
            return (Criteria) this;
        }

        public Criteria andPowernameLessThan(String value) {
            addCriterion("powername <", value, "powername");
            return (Criteria) this;
        }

        public Criteria andPowernameLessThanOrEqualTo(String value) {
            addCriterion("powername <=", value, "powername");
            return (Criteria) this;
        }

        public Criteria andPowernameLike(String value) {
            addCriterion("powername like", value, "powername");
            return (Criteria) this;
        }

        public Criteria andPowernameNotLike(String value) {
            addCriterion("powername not like", value, "powername");
            return (Criteria) this;
        }

        public Criteria andPowernameIn(List<String> values) {
            addCriterion("powername in", values, "powername");
            return (Criteria) this;
        }

        public Criteria andPowernameNotIn(List<String> values) {
            addCriterion("powername not in", values, "powername");
            return (Criteria) this;
        }

        public Criteria andPowernameBetween(String value1, String value2) {
            addCriterion("powername between", value1, value2, "powername");
            return (Criteria) this;
        }

        public Criteria andPowernameNotBetween(String value1, String value2) {
            addCriterion("powername not between", value1, value2, "powername");
            return (Criteria) this;
        }

        public Criteria andPowertypeIsNull() {
            addCriterion("powertype is null");
            return (Criteria) this;
        }

        public Criteria andPowertypeIsNotNull() {
            addCriterion("powertype is not null");
            return (Criteria) this;
        }

        public Criteria andPowertypeEqualTo(String value) {
            addCriterion("powertype =", value, "powertype");
            return (Criteria) this;
        }

        public Criteria andPowertypeNotEqualTo(String value) {
            addCriterion("powertype <>", value, "powertype");
            return (Criteria) this;
        }

        public Criteria andPowertypeGreaterThan(String value) {
            addCriterion("powertype >", value, "powertype");
            return (Criteria) this;
        }

        public Criteria andPowertypeGreaterThanOrEqualTo(String value) {
            addCriterion("powertype >=", value, "powertype");
            return (Criteria) this;
        }

        public Criteria andPowertypeLessThan(String value) {
            addCriterion("powertype <", value, "powertype");
            return (Criteria) this;
        }

        public Criteria andPowertypeLessThanOrEqualTo(String value) {
            addCriterion("powertype <=", value, "powertype");
            return (Criteria) this;
        }

        public Criteria andPowertypeLike(String value) {
            addCriterion("powertype like", value, "powertype");
            return (Criteria) this;
        }

        public Criteria andPowertypeNotLike(String value) {
            addCriterion("powertype not like", value, "powertype");
            return (Criteria) this;
        }

        public Criteria andPowertypeIn(List<String> values) {
            addCriterion("powertype in", values, "powertype");
            return (Criteria) this;
        }

        public Criteria andPowertypeNotIn(List<String> values) {
            addCriterion("powertype not in", values, "powertype");
            return (Criteria) this;
        }

        public Criteria andPowertypeBetween(String value1, String value2) {
            addCriterion("powertype between", value1, value2, "powertype");
            return (Criteria) this;
        }

        public Criteria andPowertypeNotBetween(String value1, String value2) {
            addCriterion("powertype not between", value1, value2, "powertype");
            return (Criteria) this;
        }

        public Criteria andPageurlIsNull() {
            addCriterion("pageurl is null");
            return (Criteria) this;
        }

        public Criteria andPageurlIsNotNull() {
            addCriterion("pageurl is not null");
            return (Criteria) this;
        }

        public Criteria andPageurlEqualTo(String value) {
            addCriterion("pageurl =", value, "pageurl");
            return (Criteria) this;
        }

        public Criteria andPageurlNotEqualTo(String value) {
            addCriterion("pageurl <>", value, "pageurl");
            return (Criteria) this;
        }

        public Criteria andPageurlGreaterThan(String value) {
            addCriterion("pageurl >", value, "pageurl");
            return (Criteria) this;
        }

        public Criteria andPageurlGreaterThanOrEqualTo(String value) {
            addCriterion("pageurl >=", value, "pageurl");
            return (Criteria) this;
        }

        public Criteria andPageurlLessThan(String value) {
            addCriterion("pageurl <", value, "pageurl");
            return (Criteria) this;
        }

        public Criteria andPageurlLessThanOrEqualTo(String value) {
            addCriterion("pageurl <=", value, "pageurl");
            return (Criteria) this;
        }

        public Criteria andPageurlLike(String value) {
            addCriterion("pageurl like", value, "pageurl");
            return (Criteria) this;
        }

        public Criteria andPageurlNotLike(String value) {
            addCriterion("pageurl not like", value, "pageurl");
            return (Criteria) this;
        }

        public Criteria andPageurlIn(List<String> values) {
            addCriterion("pageurl in", values, "pageurl");
            return (Criteria) this;
        }

        public Criteria andPageurlNotIn(List<String> values) {
            addCriterion("pageurl not in", values, "pageurl");
            return (Criteria) this;
        }

        public Criteria andPageurlBetween(String value1, String value2) {
            addCriterion("pageurl between", value1, value2, "pageurl");
            return (Criteria) this;
        }

        public Criteria andPageurlNotBetween(String value1, String value2) {
            addCriterion("pageurl not between", value1, value2, "pageurl");
            return (Criteria) this;
        }

        public Criteria andMenunameIsNull() {
            addCriterion("menuname is null");
            return (Criteria) this;
        }

        public Criteria andMenunameIsNotNull() {
            addCriterion("menuname is not null");
            return (Criteria) this;
        }

        public Criteria andMenunameEqualTo(String value) {
            addCriterion("menuname =", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotEqualTo(String value) {
            addCriterion("menuname <>", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameGreaterThan(String value) {
            addCriterion("menuname >", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameGreaterThanOrEqualTo(String value) {
            addCriterion("menuname >=", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLessThan(String value) {
            addCriterion("menuname <", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLessThanOrEqualTo(String value) {
            addCriterion("menuname <=", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLike(String value) {
            addCriterion("menuname like", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotLike(String value) {
            addCriterion("menuname not like", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameIn(List<String> values) {
            addCriterion("menuname in", values, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotIn(List<String> values) {
            addCriterion("menuname not in", values, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameBetween(String value1, String value2) {
            addCriterion("menuname between", value1, value2, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotBetween(String value1, String value2) {
            addCriterion("menuname not between", value1, value2, "menuname");
            return (Criteria) this;
        }

        public Criteria andButtonnameIsNull() {
            addCriterion("buttonname is null");
            return (Criteria) this;
        }

        public Criteria andButtonnameIsNotNull() {
            addCriterion("buttonname is not null");
            return (Criteria) this;
        }

        public Criteria andButtonnameEqualTo(String value) {
            addCriterion("buttonname =", value, "buttonname");
            return (Criteria) this;
        }

        public Criteria andButtonnameNotEqualTo(String value) {
            addCriterion("buttonname <>", value, "buttonname");
            return (Criteria) this;
        }

        public Criteria andButtonnameGreaterThan(String value) {
            addCriterion("buttonname >", value, "buttonname");
            return (Criteria) this;
        }

        public Criteria andButtonnameGreaterThanOrEqualTo(String value) {
            addCriterion("buttonname >=", value, "buttonname");
            return (Criteria) this;
        }

        public Criteria andButtonnameLessThan(String value) {
            addCriterion("buttonname <", value, "buttonname");
            return (Criteria) this;
        }

        public Criteria andButtonnameLessThanOrEqualTo(String value) {
            addCriterion("buttonname <=", value, "buttonname");
            return (Criteria) this;
        }

        public Criteria andButtonnameLike(String value) {
            addCriterion("buttonname like", value, "buttonname");
            return (Criteria) this;
        }

        public Criteria andButtonnameNotLike(String value) {
            addCriterion("buttonname not like", value, "buttonname");
            return (Criteria) this;
        }

        public Criteria andButtonnameIn(List<String> values) {
            addCriterion("buttonname in", values, "buttonname");
            return (Criteria) this;
        }

        public Criteria andButtonnameNotIn(List<String> values) {
            addCriterion("buttonname not in", values, "buttonname");
            return (Criteria) this;
        }

        public Criteria andButtonnameBetween(String value1, String value2) {
            addCriterion("buttonname between", value1, value2, "buttonname");
            return (Criteria) this;
        }

        public Criteria andButtonnameNotBetween(String value1, String value2) {
            addCriterion("buttonname not between", value1, value2, "buttonname");
            return (Criteria) this;
        }

        public Criteria andStudynumIsNull() {
            addCriterion("studynum is null");
            return (Criteria) this;
        }

        public Criteria andStudynumIsNotNull() {
            addCriterion("studynum is not null");
            return (Criteria) this;
        }

        public Criteria andStudynumEqualTo(String value) {
            addCriterion("studynum =", value, "studynum");
            return (Criteria) this;
        }

        public Criteria andStudynumNotEqualTo(String value) {
            addCriterion("studynum <>", value, "studynum");
            return (Criteria) this;
        }

        public Criteria andStudynumGreaterThan(String value) {
            addCriterion("studynum >", value, "studynum");
            return (Criteria) this;
        }

        public Criteria andStudynumGreaterThanOrEqualTo(String value) {
            addCriterion("studynum >=", value, "studynum");
            return (Criteria) this;
        }

        public Criteria andStudynumLessThan(String value) {
            addCriterion("studynum <", value, "studynum");
            return (Criteria) this;
        }

        public Criteria andStudynumLessThanOrEqualTo(String value) {
            addCriterion("studynum <=", value, "studynum");
            return (Criteria) this;
        }

        public Criteria andStudynumLike(String value) {
            addCriterion("studynum like", value, "studynum");
            return (Criteria) this;
        }

        public Criteria andStudynumNotLike(String value) {
            addCriterion("studynum not like", value, "studynum");
            return (Criteria) this;
        }

        public Criteria andStudynumIn(List<String> values) {
            addCriterion("studynum in", values, "studynum");
            return (Criteria) this;
        }

        public Criteria andStudynumNotIn(List<String> values) {
            addCriterion("studynum not in", values, "studynum");
            return (Criteria) this;
        }

        public Criteria andStudynumBetween(String value1, String value2) {
            addCriterion("studynum between", value1, value2, "studynum");
            return (Criteria) this;
        }

        public Criteria andStudynumNotBetween(String value1, String value2) {
            addCriterion("studynum not between", value1, value2, "studynum");
            return (Criteria) this;
        }

        public Criteria andDatascopeIsNull() {
            addCriterion("datascope is null");
            return (Criteria) this;
        }

        public Criteria andDatascopeIsNotNull() {
            addCriterion("datascope is not null");
            return (Criteria) this;
        }

        public Criteria andDatascopeEqualTo(String value) {
            addCriterion("datascope =", value, "datascope");
            return (Criteria) this;
        }

        public Criteria andDatascopeNotEqualTo(String value) {
            addCriterion("datascope <>", value, "datascope");
            return (Criteria) this;
        }

        public Criteria andDatascopeGreaterThan(String value) {
            addCriterion("datascope >", value, "datascope");
            return (Criteria) this;
        }

        public Criteria andDatascopeGreaterThanOrEqualTo(String value) {
            addCriterion("datascope >=", value, "datascope");
            return (Criteria) this;
        }

        public Criteria andDatascopeLessThan(String value) {
            addCriterion("datascope <", value, "datascope");
            return (Criteria) this;
        }

        public Criteria andDatascopeLessThanOrEqualTo(String value) {
            addCriterion("datascope <=", value, "datascope");
            return (Criteria) this;
        }

        public Criteria andDatascopeLike(String value) {
            addCriterion("datascope like", value, "datascope");
            return (Criteria) this;
        }

        public Criteria andDatascopeNotLike(String value) {
            addCriterion("datascope not like", value, "datascope");
            return (Criteria) this;
        }

        public Criteria andDatascopeIn(List<String> values) {
            addCriterion("datascope in", values, "datascope");
            return (Criteria) this;
        }

        public Criteria andDatascopeNotIn(List<String> values) {
            addCriterion("datascope not in", values, "datascope");
            return (Criteria) this;
        }

        public Criteria andDatascopeBetween(String value1, String value2) {
            addCriterion("datascope between", value1, value2, "datascope");
            return (Criteria) this;
        }

        public Criteria andDatascopeNotBetween(String value1, String value2) {
            addCriterion("datascope not between", value1, value2, "datascope");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(String value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(String value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(String value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(String value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(String value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLike(String value) {
            addCriterion("parent_id like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotLike(String value) {
            addCriterion("parent_id not like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<String> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<String> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(String value1, String value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(String value1, String value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdsIsNull() {
            addCriterion("parent_ids is null");
            return (Criteria) this;
        }

        public Criteria andParentIdsIsNotNull() {
            addCriterion("parent_ids is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdsEqualTo(String value) {
            addCriterion("parent_ids =", value, "parentIds");
            return (Criteria) this;
        }

        public Criteria andParentIdsNotEqualTo(String value) {
            addCriterion("parent_ids <>", value, "parentIds");
            return (Criteria) this;
        }

        public Criteria andParentIdsGreaterThan(String value) {
            addCriterion("parent_ids >", value, "parentIds");
            return (Criteria) this;
        }

        public Criteria andParentIdsGreaterThanOrEqualTo(String value) {
            addCriterion("parent_ids >=", value, "parentIds");
            return (Criteria) this;
        }

        public Criteria andParentIdsLessThan(String value) {
            addCriterion("parent_ids <", value, "parentIds");
            return (Criteria) this;
        }

        public Criteria andParentIdsLessThanOrEqualTo(String value) {
            addCriterion("parent_ids <=", value, "parentIds");
            return (Criteria) this;
        }

        public Criteria andParentIdsLike(String value) {
            addCriterion("parent_ids like", value, "parentIds");
            return (Criteria) this;
        }

        public Criteria andParentIdsNotLike(String value) {
            addCriterion("parent_ids not like", value, "parentIds");
            return (Criteria) this;
        }

        public Criteria andParentIdsIn(List<String> values) {
            addCriterion("parent_ids in", values, "parentIds");
            return (Criteria) this;
        }

        public Criteria andParentIdsNotIn(List<String> values) {
            addCriterion("parent_ids not in", values, "parentIds");
            return (Criteria) this;
        }

        public Criteria andParentIdsBetween(String value1, String value2) {
            addCriterion("parent_ids between", value1, value2, "parentIds");
            return (Criteria) this;
        }

        public Criteria andParentIdsNotBetween(String value1, String value2) {
            addCriterion("parent_ids not between", value1, value2, "parentIds");
            return (Criteria) this;
        }

        public Criteria andAvailableIsNull() {
            addCriterion("available is null");
            return (Criteria) this;
        }

        public Criteria andAvailableIsNotNull() {
            addCriterion("available is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableEqualTo(Integer value) {
            addCriterion("available =", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableNotEqualTo(Integer value) {
            addCriterion("available <>", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableGreaterThan(Integer value) {
            addCriterion("available >", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableGreaterThanOrEqualTo(Integer value) {
            addCriterion("available >=", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableLessThan(Integer value) {
            addCriterion("available <", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableLessThanOrEqualTo(Integer value) {
            addCriterion("available <=", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableIn(List<Integer> values) {
            addCriterion("available in", values, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableNotIn(List<Integer> values) {
            addCriterion("available not in", values, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableBetween(Integer value1, Integer value2) {
            addCriterion("available between", value1, value2, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableNotBetween(Integer value1, Integer value2) {
            addCriterion("available not between", value1, value2, "available");
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
package com.lnsoft.po;

import java.util.ArrayList;
import java.util.List;

public class IABExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IABExample() {
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

        public Criteria andObjidIsNull() {
            addCriterion("OBJID is null");
            return (Criteria) this;
        }

        public Criteria andObjidIsNotNull() {
            addCriterion("OBJID is not null");
            return (Criteria) this;
        }

        public Criteria andObjidEqualTo(String value) {
            addCriterion("OBJID =", value, "objid");
            return (Criteria) this;
        }

        public Criteria andObjidNotEqualTo(String value) {
            addCriterion("OBJID <>", value, "objid");
            return (Criteria) this;
        }

        public Criteria andObjidGreaterThan(String value) {
            addCriterion("OBJID >", value, "objid");
            return (Criteria) this;
        }

        public Criteria andObjidGreaterThanOrEqualTo(String value) {
            addCriterion("OBJID >=", value, "objid");
            return (Criteria) this;
        }

        public Criteria andObjidLessThan(String value) {
            addCriterion("OBJID <", value, "objid");
            return (Criteria) this;
        }

        public Criteria andObjidLessThanOrEqualTo(String value) {
            addCriterion("OBJID <=", value, "objid");
            return (Criteria) this;
        }

        public Criteria andObjidLike(String value) {
            addCriterion("OBJID like", value, "objid");
            return (Criteria) this;
        }

        public Criteria andObjidNotLike(String value) {
            addCriterion("OBJID not like", value, "objid");
            return (Criteria) this;
        }

        public Criteria andObjidIn(List<String> values) {
            addCriterion("OBJID in", values, "objid");
            return (Criteria) this;
        }

        public Criteria andObjidNotIn(List<String> values) {
            addCriterion("OBJID not in", values, "objid");
            return (Criteria) this;
        }

        public Criteria andObjidBetween(String value1, String value2) {
            addCriterion("OBJID between", value1, value2, "objid");
            return (Criteria) this;
        }

        public Criteria andObjidNotBetween(String value1, String value2) {
            addCriterion("OBJID not between", value1, value2, "objid");
            return (Criteria) this;
        }

        public Criteria andZsAaaIsNull() {
            addCriterion("ZS_AAA is null");
            return (Criteria) this;
        }

        public Criteria andZsAaaIsNotNull() {
            addCriterion("ZS_AAA is not null");
            return (Criteria) this;
        }

        public Criteria andZsAaaEqualTo(String value) {
            addCriterion("ZS_AAA =", value, "zsAaa");
            return (Criteria) this;
        }

        public Criteria andZsAaaNotEqualTo(String value) {
            addCriterion("ZS_AAA <>", value, "zsAaa");
            return (Criteria) this;
        }

        public Criteria andZsAaaGreaterThan(String value) {
            addCriterion("ZS_AAA >", value, "zsAaa");
            return (Criteria) this;
        }

        public Criteria andZsAaaGreaterThanOrEqualTo(String value) {
            addCriterion("ZS_AAA >=", value, "zsAaa");
            return (Criteria) this;
        }

        public Criteria andZsAaaLessThan(String value) {
            addCriterion("ZS_AAA <", value, "zsAaa");
            return (Criteria) this;
        }

        public Criteria andZsAaaLessThanOrEqualTo(String value) {
            addCriterion("ZS_AAA <=", value, "zsAaa");
            return (Criteria) this;
        }

        public Criteria andZsAaaLike(String value) {
            addCriterion("ZS_AAA like", value, "zsAaa");
            return (Criteria) this;
        }

        public Criteria andZsAaaNotLike(String value) {
            addCriterion("ZS_AAA not like", value, "zsAaa");
            return (Criteria) this;
        }

        public Criteria andZsAaaIn(List<String> values) {
            addCriterion("ZS_AAA in", values, "zsAaa");
            return (Criteria) this;
        }

        public Criteria andZsAaaNotIn(List<String> values) {
            addCriterion("ZS_AAA not in", values, "zsAaa");
            return (Criteria) this;
        }

        public Criteria andZsAaaBetween(String value1, String value2) {
            addCriterion("ZS_AAA between", value1, value2, "zsAaa");
            return (Criteria) this;
        }

        public Criteria andZsAaaNotBetween(String value1, String value2) {
            addCriterion("ZS_AAA not between", value1, value2, "zsAaa");
            return (Criteria) this;
        }

        public Criteria andSzBbbIsNull() {
            addCriterion("SZ_BBB is null");
            return (Criteria) this;
        }

        public Criteria andSzBbbIsNotNull() {
            addCriterion("SZ_BBB is not null");
            return (Criteria) this;
        }

        public Criteria andSzBbbEqualTo(String value) {
            addCriterion("SZ_BBB =", value, "szBbb");
            return (Criteria) this;
        }

        public Criteria andSzBbbNotEqualTo(String value) {
            addCriterion("SZ_BBB <>", value, "szBbb");
            return (Criteria) this;
        }

        public Criteria andSzBbbGreaterThan(String value) {
            addCriterion("SZ_BBB >", value, "szBbb");
            return (Criteria) this;
        }

        public Criteria andSzBbbGreaterThanOrEqualTo(String value) {
            addCriterion("SZ_BBB >=", value, "szBbb");
            return (Criteria) this;
        }

        public Criteria andSzBbbLessThan(String value) {
            addCriterion("SZ_BBB <", value, "szBbb");
            return (Criteria) this;
        }

        public Criteria andSzBbbLessThanOrEqualTo(String value) {
            addCriterion("SZ_BBB <=", value, "szBbb");
            return (Criteria) this;
        }

        public Criteria andSzBbbLike(String value) {
            addCriterion("SZ_BBB like", value, "szBbb");
            return (Criteria) this;
        }

        public Criteria andSzBbbNotLike(String value) {
            addCriterion("SZ_BBB not like", value, "szBbb");
            return (Criteria) this;
        }

        public Criteria andSzBbbIn(List<String> values) {
            addCriterion("SZ_BBB in", values, "szBbb");
            return (Criteria) this;
        }

        public Criteria andSzBbbNotIn(List<String> values) {
            addCriterion("SZ_BBB not in", values, "szBbb");
            return (Criteria) this;
        }

        public Criteria andSzBbbBetween(String value1, String value2) {
            addCriterion("SZ_BBB between", value1, value2, "szBbb");
            return (Criteria) this;
        }

        public Criteria andSzBbbNotBetween(String value1, String value2) {
            addCriterion("SZ_BBB not between", value1, value2, "szBbb");
            return (Criteria) this;
        }

        public Criteria andXcCccIsNull() {
            addCriterion("XC_CCC is null");
            return (Criteria) this;
        }

        public Criteria andXcCccIsNotNull() {
            addCriterion("XC_CCC is not null");
            return (Criteria) this;
        }

        public Criteria andXcCccEqualTo(String value) {
            addCriterion("XC_CCC =", value, "xcCcc");
            return (Criteria) this;
        }

        public Criteria andXcCccNotEqualTo(String value) {
            addCriterion("XC_CCC <>", value, "xcCcc");
            return (Criteria) this;
        }

        public Criteria andXcCccGreaterThan(String value) {
            addCriterion("XC_CCC >", value, "xcCcc");
            return (Criteria) this;
        }

        public Criteria andXcCccGreaterThanOrEqualTo(String value) {
            addCriterion("XC_CCC >=", value, "xcCcc");
            return (Criteria) this;
        }

        public Criteria andXcCccLessThan(String value) {
            addCriterion("XC_CCC <", value, "xcCcc");
            return (Criteria) this;
        }

        public Criteria andXcCccLessThanOrEqualTo(String value) {
            addCriterion("XC_CCC <=", value, "xcCcc");
            return (Criteria) this;
        }

        public Criteria andXcCccLike(String value) {
            addCriterion("XC_CCC like", value, "xcCcc");
            return (Criteria) this;
        }

        public Criteria andXcCccNotLike(String value) {
            addCriterion("XC_CCC not like", value, "xcCcc");
            return (Criteria) this;
        }

        public Criteria andXcCccIn(List<String> values) {
            addCriterion("XC_CCC in", values, "xcCcc");
            return (Criteria) this;
        }

        public Criteria andXcCccNotIn(List<String> values) {
            addCriterion("XC_CCC not in", values, "xcCcc");
            return (Criteria) this;
        }

        public Criteria andXcCccBetween(String value1, String value2) {
            addCriterion("XC_CCC between", value1, value2, "xcCcc");
            return (Criteria) this;
        }

        public Criteria andXcCccNotBetween(String value1, String value2) {
            addCriterion("XC_CCC not between", value1, value2, "xcCcc");
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
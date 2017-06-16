package com.yhb.bean.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityAdminSendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityAdminSendExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProductidIsNull() {
            addCriterion("productId is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("productId is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(String value) {
            addCriterion("productId =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(String value) {
            addCriterion("productId <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(String value) {
            addCriterion("productId >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(String value) {
            addCriterion("productId >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(String value) {
            addCriterion("productId <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(String value) {
            addCriterion("productId <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLike(String value) {
            addCriterion("productId like", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotLike(String value) {
            addCriterion("productId not like", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<String> values) {
            addCriterion("productId in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<String> values) {
            addCriterion("productId not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(String value1, String value2) {
            addCriterion("productId between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(String value1, String value2) {
            addCriterion("productId not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andRedruleIsNull() {
            addCriterion("redRule is null");
            return (Criteria) this;
        }

        public Criteria andRedruleIsNotNull() {
            addCriterion("redRule is not null");
            return (Criteria) this;
        }

        public Criteria andRedruleEqualTo(Integer value) {
            addCriterion("redRule =", value, "redrule");
            return (Criteria) this;
        }

        public Criteria andRedruleNotEqualTo(Integer value) {
            addCriterion("redRule <>", value, "redrule");
            return (Criteria) this;
        }

        public Criteria andRedruleGreaterThan(Integer value) {
            addCriterion("redRule >", value, "redrule");
            return (Criteria) this;
        }

        public Criteria andRedruleGreaterThanOrEqualTo(Integer value) {
            addCriterion("redRule >=", value, "redrule");
            return (Criteria) this;
        }

        public Criteria andRedruleLessThan(Integer value) {
            addCriterion("redRule <", value, "redrule");
            return (Criteria) this;
        }

        public Criteria andRedruleLessThanOrEqualTo(Integer value) {
            addCriterion("redRule <=", value, "redrule");
            return (Criteria) this;
        }

        public Criteria andRedruleIn(List<Integer> values) {
            addCriterion("redRule in", values, "redrule");
            return (Criteria) this;
        }

        public Criteria andRedruleNotIn(List<Integer> values) {
            addCriterion("redRule not in", values, "redrule");
            return (Criteria) this;
        }

        public Criteria andRedruleBetween(Integer value1, Integer value2) {
            addCriterion("redRule between", value1, value2, "redrule");
            return (Criteria) this;
        }

        public Criteria andRedruleNotBetween(Integer value1, Integer value2) {
            addCriterion("redRule not between", value1, value2, "redrule");
            return (Criteria) this;
        }

        public Criteria andRednameIsNull() {
            addCriterion("redName is null");
            return (Criteria) this;
        }

        public Criteria andRednameIsNotNull() {
            addCriterion("redName is not null");
            return (Criteria) this;
        }

        public Criteria andRednameEqualTo(String value) {
            addCriterion("redName =", value, "redname");
            return (Criteria) this;
        }

        public Criteria andRednameNotEqualTo(String value) {
            addCriterion("redName <>", value, "redname");
            return (Criteria) this;
        }

        public Criteria andRednameGreaterThan(String value) {
            addCriterion("redName >", value, "redname");
            return (Criteria) this;
        }

        public Criteria andRednameGreaterThanOrEqualTo(String value) {
            addCriterion("redName >=", value, "redname");
            return (Criteria) this;
        }

        public Criteria andRednameLessThan(String value) {
            addCriterion("redName <", value, "redname");
            return (Criteria) this;
        }

        public Criteria andRednameLessThanOrEqualTo(String value) {
            addCriterion("redName <=", value, "redname");
            return (Criteria) this;
        }

        public Criteria andRednameLike(String value) {
            addCriterion("redName like", value, "redname");
            return (Criteria) this;
        }

        public Criteria andRednameNotLike(String value) {
            addCriterion("redName not like", value, "redname");
            return (Criteria) this;
        }

        public Criteria andRednameIn(List<String> values) {
            addCriterion("redName in", values, "redname");
            return (Criteria) this;
        }

        public Criteria andRednameNotIn(List<String> values) {
            addCriterion("redName not in", values, "redname");
            return (Criteria) this;
        }

        public Criteria andRednameBetween(String value1, String value2) {
            addCriterion("redName between", value1, value2, "redname");
            return (Criteria) this;
        }

        public Criteria andRednameNotBetween(String value1, String value2) {
            addCriterion("redName not between", value1, value2, "redname");
            return (Criteria) this;
        }

        public Criteria andRedmoneyIsNull() {
            addCriterion("redMoney is null");
            return (Criteria) this;
        }

        public Criteria andRedmoneyIsNotNull() {
            addCriterion("redMoney is not null");
            return (Criteria) this;
        }

        public Criteria andRedmoneyEqualTo(Long value) {
            addCriterion("redMoney =", value, "redmoney");
            return (Criteria) this;
        }

        public Criteria andRedmoneyNotEqualTo(Long value) {
            addCriterion("redMoney <>", value, "redmoney");
            return (Criteria) this;
        }

        public Criteria andRedmoneyGreaterThan(Long value) {
            addCriterion("redMoney >", value, "redmoney");
            return (Criteria) this;
        }

        public Criteria andRedmoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("redMoney >=", value, "redmoney");
            return (Criteria) this;
        }

        public Criteria andRedmoneyLessThan(Long value) {
            addCriterion("redMoney <", value, "redmoney");
            return (Criteria) this;
        }

        public Criteria andRedmoneyLessThanOrEqualTo(Long value) {
            addCriterion("redMoney <=", value, "redmoney");
            return (Criteria) this;
        }

        public Criteria andRedmoneyIn(List<Long> values) {
            addCriterion("redMoney in", values, "redmoney");
            return (Criteria) this;
        }

        public Criteria andRedmoneyNotIn(List<Long> values) {
            addCriterion("redMoney not in", values, "redmoney");
            return (Criteria) this;
        }

        public Criteria andRedmoneyBetween(Long value1, Long value2) {
            addCriterion("redMoney between", value1, value2, "redmoney");
            return (Criteria) this;
        }

        public Criteria andRedmoneyNotBetween(Long value1, Long value2) {
            addCriterion("redMoney not between", value1, value2, "redmoney");
            return (Criteria) this;
        }

        public Criteria andRedlasttimeIsNull() {
            addCriterion("redLasttime is null");
            return (Criteria) this;
        }

        public Criteria andRedlasttimeIsNotNull() {
            addCriterion("redLasttime is not null");
            return (Criteria) this;
        }

        public Criteria andRedlasttimeEqualTo(Date value) {
            addCriterion("redLasttime =", value, "redlasttime");
            return (Criteria) this;
        }

        public Criteria andRedlasttimeNotEqualTo(Date value) {
            addCriterion("redLasttime <>", value, "redlasttime");
            return (Criteria) this;
        }

        public Criteria andRedlasttimeGreaterThan(Date value) {
            addCriterion("redLasttime >", value, "redlasttime");
            return (Criteria) this;
        }

        public Criteria andRedlasttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("redLasttime >=", value, "redlasttime");
            return (Criteria) this;
        }

        public Criteria andRedlasttimeLessThan(Date value) {
            addCriterion("redLasttime <", value, "redlasttime");
            return (Criteria) this;
        }

        public Criteria andRedlasttimeLessThanOrEqualTo(Date value) {
            addCriterion("redLasttime <=", value, "redlasttime");
            return (Criteria) this;
        }

        public Criteria andRedlasttimeIn(List<Date> values) {
            addCriterion("redLasttime in", values, "redlasttime");
            return (Criteria) this;
        }

        public Criteria andRedlasttimeNotIn(List<Date> values) {
            addCriterion("redLasttime not in", values, "redlasttime");
            return (Criteria) this;
        }

        public Criteria andRedlasttimeBetween(Date value1, Date value2) {
            addCriterion("redLasttime between", value1, value2, "redlasttime");
            return (Criteria) this;
        }

        public Criteria andRedlasttimeNotBetween(Date value1, Date value2) {
            addCriterion("redLasttime not between", value1, value2, "redlasttime");
            return (Criteria) this;
        }

        public Criteria andRedmarkIsNull() {
            addCriterion("redMark is null");
            return (Criteria) this;
        }

        public Criteria andRedmarkIsNotNull() {
            addCriterion("redMark is not null");
            return (Criteria) this;
        }

        public Criteria andRedmarkEqualTo(String value) {
            addCriterion("redMark =", value, "redmark");
            return (Criteria) this;
        }

        public Criteria andRedmarkNotEqualTo(String value) {
            addCriterion("redMark <>", value, "redmark");
            return (Criteria) this;
        }

        public Criteria andRedmarkGreaterThan(String value) {
            addCriterion("redMark >", value, "redmark");
            return (Criteria) this;
        }

        public Criteria andRedmarkGreaterThanOrEqualTo(String value) {
            addCriterion("redMark >=", value, "redmark");
            return (Criteria) this;
        }

        public Criteria andRedmarkLessThan(String value) {
            addCriterion("redMark <", value, "redmark");
            return (Criteria) this;
        }

        public Criteria andRedmarkLessThanOrEqualTo(String value) {
            addCriterion("redMark <=", value, "redmark");
            return (Criteria) this;
        }

        public Criteria andRedmarkLike(String value) {
            addCriterion("redMark like", value, "redmark");
            return (Criteria) this;
        }

        public Criteria andRedmarkNotLike(String value) {
            addCriterion("redMark not like", value, "redmark");
            return (Criteria) this;
        }

        public Criteria andRedmarkIn(List<String> values) {
            addCriterion("redMark in", values, "redmark");
            return (Criteria) this;
        }

        public Criteria andRedmarkNotIn(List<String> values) {
            addCriterion("redMark not in", values, "redmark");
            return (Criteria) this;
        }

        public Criteria andRedmarkBetween(String value1, String value2) {
            addCriterion("redMark between", value1, value2, "redmark");
            return (Criteria) this;
        }

        public Criteria andRedmarkNotBetween(String value1, String value2) {
            addCriterion("redMark not between", value1, value2, "redmark");
            return (Criteria) this;
        }

        public Criteria andRedcreatetimeIsNull() {
            addCriterion("redCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andRedcreatetimeIsNotNull() {
            addCriterion("redCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andRedcreatetimeEqualTo(Date value) {
            addCriterion("redCreateTime =", value, "redcreatetime");
            return (Criteria) this;
        }

        public Criteria andRedcreatetimeNotEqualTo(Date value) {
            addCriterion("redCreateTime <>", value, "redcreatetime");
            return (Criteria) this;
        }

        public Criteria andRedcreatetimeGreaterThan(Date value) {
            addCriterion("redCreateTime >", value, "redcreatetime");
            return (Criteria) this;
        }

        public Criteria andRedcreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("redCreateTime >=", value, "redcreatetime");
            return (Criteria) this;
        }

        public Criteria andRedcreatetimeLessThan(Date value) {
            addCriterion("redCreateTime <", value, "redcreatetime");
            return (Criteria) this;
        }

        public Criteria andRedcreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("redCreateTime <=", value, "redcreatetime");
            return (Criteria) this;
        }

        public Criteria andRedcreatetimeIn(List<Date> values) {
            addCriterion("redCreateTime in", values, "redcreatetime");
            return (Criteria) this;
        }

        public Criteria andRedcreatetimeNotIn(List<Date> values) {
            addCriterion("redCreateTime not in", values, "redcreatetime");
            return (Criteria) this;
        }

        public Criteria andRedcreatetimeBetween(Date value1, Date value2) {
            addCriterion("redCreateTime between", value1, value2, "redcreatetime");
            return (Criteria) this;
        }

        public Criteria andRedcreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("redCreateTime not between", value1, value2, "redcreatetime");
            return (Criteria) this;
        }

        public Criteria andRedsendcountIsNull() {
            addCriterion("redSendCount is null");
            return (Criteria) this;
        }

        public Criteria andRedsendcountIsNotNull() {
            addCriterion("redSendCount is not null");
            return (Criteria) this;
        }

        public Criteria andRedsendcountEqualTo(Integer value) {
            addCriterion("redSendCount =", value, "redsendcount");
            return (Criteria) this;
        }

        public Criteria andRedsendcountNotEqualTo(Integer value) {
            addCriterion("redSendCount <>", value, "redsendcount");
            return (Criteria) this;
        }

        public Criteria andRedsendcountGreaterThan(Integer value) {
            addCriterion("redSendCount >", value, "redsendcount");
            return (Criteria) this;
        }

        public Criteria andRedsendcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("redSendCount >=", value, "redsendcount");
            return (Criteria) this;
        }

        public Criteria andRedsendcountLessThan(Integer value) {
            addCriterion("redSendCount <", value, "redsendcount");
            return (Criteria) this;
        }

        public Criteria andRedsendcountLessThanOrEqualTo(Integer value) {
            addCriterion("redSendCount <=", value, "redsendcount");
            return (Criteria) this;
        }

        public Criteria andRedsendcountIn(List<Integer> values) {
            addCriterion("redSendCount in", values, "redsendcount");
            return (Criteria) this;
        }

        public Criteria andRedsendcountNotIn(List<Integer> values) {
            addCriterion("redSendCount not in", values, "redsendcount");
            return (Criteria) this;
        }

        public Criteria andRedsendcountBetween(Integer value1, Integer value2) {
            addCriterion("redSendCount between", value1, value2, "redsendcount");
            return (Criteria) this;
        }

        public Criteria andRedsendcountNotBetween(Integer value1, Integer value2) {
            addCriterion("redSendCount not between", value1, value2, "redsendcount");
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
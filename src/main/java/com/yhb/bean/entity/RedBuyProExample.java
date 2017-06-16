package com.yhb.bean.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RedBuyProExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RedBuyProExample() {
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

        public Criteria andRedbuyidIsNull() {
            addCriterion("redBuyId is null");
            return (Criteria) this;
        }

        public Criteria andRedbuyidIsNotNull() {
            addCriterion("redBuyId is not null");
            return (Criteria) this;
        }

        public Criteria andRedbuyidEqualTo(Integer value) {
            addCriterion("redBuyId =", value, "redbuyid");
            return (Criteria) this;
        }

        public Criteria andRedbuyidNotEqualTo(Integer value) {
            addCriterion("redBuyId <>", value, "redbuyid");
            return (Criteria) this;
        }

        public Criteria andRedbuyidGreaterThan(Integer value) {
            addCriterion("redBuyId >", value, "redbuyid");
            return (Criteria) this;
        }

        public Criteria andRedbuyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("redBuyId >=", value, "redbuyid");
            return (Criteria) this;
        }

        public Criteria andRedbuyidLessThan(Integer value) {
            addCriterion("redBuyId <", value, "redbuyid");
            return (Criteria) this;
        }

        public Criteria andRedbuyidLessThanOrEqualTo(Integer value) {
            addCriterion("redBuyId <=", value, "redbuyid");
            return (Criteria) this;
        }

        public Criteria andRedbuyidIn(List<Integer> values) {
            addCriterion("redBuyId in", values, "redbuyid");
            return (Criteria) this;
        }

        public Criteria andRedbuyidNotIn(List<Integer> values) {
            addCriterion("redBuyId not in", values, "redbuyid");
            return (Criteria) this;
        }

        public Criteria andRedbuyidBetween(Integer value1, Integer value2) {
            addCriterion("redBuyId between", value1, value2, "redbuyid");
            return (Criteria) this;
        }

        public Criteria andRedbuyidNotBetween(Integer value1, Integer value2) {
            addCriterion("redBuyId not between", value1, value2, "redbuyid");
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

        public Criteria andProfpuidIsNull() {
            addCriterion("proFpuid is null");
            return (Criteria) this;
        }

        public Criteria andProfpuidIsNotNull() {
            addCriterion("proFpuid is not null");
            return (Criteria) this;
        }

        public Criteria andProfpuidEqualTo(Integer value) {
            addCriterion("proFpuid =", value, "profpuid");
            return (Criteria) this;
        }

        public Criteria andProfpuidNotEqualTo(Integer value) {
            addCriterion("proFpuid <>", value, "profpuid");
            return (Criteria) this;
        }

        public Criteria andProfpuidGreaterThan(Integer value) {
            addCriterion("proFpuid >", value, "profpuid");
            return (Criteria) this;
        }

        public Criteria andProfpuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("proFpuid >=", value, "profpuid");
            return (Criteria) this;
        }

        public Criteria andProfpuidLessThan(Integer value) {
            addCriterion("proFpuid <", value, "profpuid");
            return (Criteria) this;
        }

        public Criteria andProfpuidLessThanOrEqualTo(Integer value) {
            addCriterion("proFpuid <=", value, "profpuid");
            return (Criteria) this;
        }

        public Criteria andProfpuidIn(List<Integer> values) {
            addCriterion("proFpuid in", values, "profpuid");
            return (Criteria) this;
        }

        public Criteria andProfpuidNotIn(List<Integer> values) {
            addCriterion("proFpuid not in", values, "profpuid");
            return (Criteria) this;
        }

        public Criteria andProfpuidBetween(Integer value1, Integer value2) {
            addCriterion("proFpuid between", value1, value2, "profpuid");
            return (Criteria) this;
        }

        public Criteria andProfpuidNotBetween(Integer value1, Integer value2) {
            addCriterion("proFpuid not between", value1, value2, "profpuid");
            return (Criteria) this;
        }

        public Criteria andRedusetimeIsNull() {
            addCriterion("redUseTime is null");
            return (Criteria) this;
        }

        public Criteria andRedusetimeIsNotNull() {
            addCriterion("redUseTime is not null");
            return (Criteria) this;
        }

        public Criteria andRedusetimeEqualTo(Date value) {
            addCriterion("redUseTime =", value, "redusetime");
            return (Criteria) this;
        }

        public Criteria andRedusetimeNotEqualTo(Date value) {
            addCriterion("redUseTime <>", value, "redusetime");
            return (Criteria) this;
        }

        public Criteria andRedusetimeGreaterThan(Date value) {
            addCriterion("redUseTime >", value, "redusetime");
            return (Criteria) this;
        }

        public Criteria andRedusetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("redUseTime >=", value, "redusetime");
            return (Criteria) this;
        }

        public Criteria andRedusetimeLessThan(Date value) {
            addCriterion("redUseTime <", value, "redusetime");
            return (Criteria) this;
        }

        public Criteria andRedusetimeLessThanOrEqualTo(Date value) {
            addCriterion("redUseTime <=", value, "redusetime");
            return (Criteria) this;
        }

        public Criteria andRedusetimeIn(List<Date> values) {
            addCriterion("redUseTime in", values, "redusetime");
            return (Criteria) this;
        }

        public Criteria andRedusetimeNotIn(List<Date> values) {
            addCriterion("redUseTime not in", values, "redusetime");
            return (Criteria) this;
        }

        public Criteria andRedusetimeBetween(Date value1, Date value2) {
            addCriterion("redUseTime between", value1, value2, "redusetime");
            return (Criteria) this;
        }

        public Criteria andRedusetimeNotBetween(Date value1, Date value2) {
            addCriterion("redUseTime not between", value1, value2, "redusetime");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andRedsendidIsNull() {
            addCriterion("redSendId is null");
            return (Criteria) this;
        }

        public Criteria andRedsendidIsNotNull() {
            addCriterion("redSendId is not null");
            return (Criteria) this;
        }

        public Criteria andRedsendidEqualTo(Integer value) {
            addCriterion("redSendId =", value, "redsendid");
            return (Criteria) this;
        }

        public Criteria andRedsendidNotEqualTo(Integer value) {
            addCriterion("redSendId <>", value, "redsendid");
            return (Criteria) this;
        }

        public Criteria andRedsendidGreaterThan(Integer value) {
            addCriterion("redSendId >", value, "redsendid");
            return (Criteria) this;
        }

        public Criteria andRedsendidGreaterThanOrEqualTo(Integer value) {
            addCriterion("redSendId >=", value, "redsendid");
            return (Criteria) this;
        }

        public Criteria andRedsendidLessThan(Integer value) {
            addCriterion("redSendId <", value, "redsendid");
            return (Criteria) this;
        }

        public Criteria andRedsendidLessThanOrEqualTo(Integer value) {
            addCriterion("redSendId <=", value, "redsendid");
            return (Criteria) this;
        }

        public Criteria andRedsendidIn(List<Integer> values) {
            addCriterion("redSendId in", values, "redsendid");
            return (Criteria) this;
        }

        public Criteria andRedsendidNotIn(List<Integer> values) {
            addCriterion("redSendId not in", values, "redsendid");
            return (Criteria) this;
        }

        public Criteria andRedsendidBetween(Integer value1, Integer value2) {
            addCriterion("redSendId between", value1, value2, "redsendid");
            return (Criteria) this;
        }

        public Criteria andRedsendidNotBetween(Integer value1, Integer value2) {
            addCriterion("redSendId not between", value1, value2, "redsendid");
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

        public Criteria andRedmoneyEqualTo(BigDecimal value) {
            addCriterion("redMoney =", value, "redmoney");
            return (Criteria) this;
        }

        public Criteria andRedmoneyNotEqualTo(BigDecimal value) {
            addCriterion("redMoney <>", value, "redmoney");
            return (Criteria) this;
        }

        public Criteria andRedmoneyGreaterThan(BigDecimal value) {
            addCriterion("redMoney >", value, "redmoney");
            return (Criteria) this;
        }

        public Criteria andRedmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("redMoney >=", value, "redmoney");
            return (Criteria) this;
        }

        public Criteria andRedmoneyLessThan(BigDecimal value) {
            addCriterion("redMoney <", value, "redmoney");
            return (Criteria) this;
        }

        public Criteria andRedmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("redMoney <=", value, "redmoney");
            return (Criteria) this;
        }

        public Criteria andRedmoneyIn(List<BigDecimal> values) {
            addCriterion("redMoney in", values, "redmoney");
            return (Criteria) this;
        }

        public Criteria andRedmoneyNotIn(List<BigDecimal> values) {
            addCriterion("redMoney not in", values, "redmoney");
            return (Criteria) this;
        }

        public Criteria andRedmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("redMoney between", value1, value2, "redmoney");
            return (Criteria) this;
        }

        public Criteria andRedmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("redMoney not between", value1, value2, "redmoney");
            return (Criteria) this;
        }

        public Criteria andRes1IsNull() {
            addCriterion("Res1 is null");
            return (Criteria) this;
        }

        public Criteria andRes1IsNotNull() {
            addCriterion("Res1 is not null");
            return (Criteria) this;
        }

        public Criteria andRes1EqualTo(String value) {
            addCriterion("Res1 =", value, "res1");
            return (Criteria) this;
        }

        public Criteria andRes1NotEqualTo(String value) {
            addCriterion("Res1 <>", value, "res1");
            return (Criteria) this;
        }

        public Criteria andRes1GreaterThan(String value) {
            addCriterion("Res1 >", value, "res1");
            return (Criteria) this;
        }

        public Criteria andRes1GreaterThanOrEqualTo(String value) {
            addCriterion("Res1 >=", value, "res1");
            return (Criteria) this;
        }

        public Criteria andRes1LessThan(String value) {
            addCriterion("Res1 <", value, "res1");
            return (Criteria) this;
        }

        public Criteria andRes1LessThanOrEqualTo(String value) {
            addCriterion("Res1 <=", value, "res1");
            return (Criteria) this;
        }

        public Criteria andRes1Like(String value) {
            addCriterion("Res1 like", value, "res1");
            return (Criteria) this;
        }

        public Criteria andRes1NotLike(String value) {
            addCriterion("Res1 not like", value, "res1");
            return (Criteria) this;
        }

        public Criteria andRes1In(List<String> values) {
            addCriterion("Res1 in", values, "res1");
            return (Criteria) this;
        }

        public Criteria andRes1NotIn(List<String> values) {
            addCriterion("Res1 not in", values, "res1");
            return (Criteria) this;
        }

        public Criteria andRes1Between(String value1, String value2) {
            addCriterion("Res1 between", value1, value2, "res1");
            return (Criteria) this;
        }

        public Criteria andRes1NotBetween(String value1, String value2) {
            addCriterion("Res1 not between", value1, value2, "res1");
            return (Criteria) this;
        }

        public Criteria andRes2IsNull() {
            addCriterion("Res2 is null");
            return (Criteria) this;
        }

        public Criteria andRes2IsNotNull() {
            addCriterion("Res2 is not null");
            return (Criteria) this;
        }

        public Criteria andRes2EqualTo(String value) {
            addCriterion("Res2 =", value, "res2");
            return (Criteria) this;
        }

        public Criteria andRes2NotEqualTo(String value) {
            addCriterion("Res2 <>", value, "res2");
            return (Criteria) this;
        }

        public Criteria andRes2GreaterThan(String value) {
            addCriterion("Res2 >", value, "res2");
            return (Criteria) this;
        }

        public Criteria andRes2GreaterThanOrEqualTo(String value) {
            addCriterion("Res2 >=", value, "res2");
            return (Criteria) this;
        }

        public Criteria andRes2LessThan(String value) {
            addCriterion("Res2 <", value, "res2");
            return (Criteria) this;
        }

        public Criteria andRes2LessThanOrEqualTo(String value) {
            addCriterion("Res2 <=", value, "res2");
            return (Criteria) this;
        }

        public Criteria andRes2Like(String value) {
            addCriterion("Res2 like", value, "res2");
            return (Criteria) this;
        }

        public Criteria andRes2NotLike(String value) {
            addCriterion("Res2 not like", value, "res2");
            return (Criteria) this;
        }

        public Criteria andRes2In(List<String> values) {
            addCriterion("Res2 in", values, "res2");
            return (Criteria) this;
        }

        public Criteria andRes2NotIn(List<String> values) {
            addCriterion("Res2 not in", values, "res2");
            return (Criteria) this;
        }

        public Criteria andRes2Between(String value1, String value2) {
            addCriterion("Res2 between", value1, value2, "res2");
            return (Criteria) this;
        }

        public Criteria andRes2NotBetween(String value1, String value2) {
            addCriterion("Res2 not between", value1, value2, "res2");
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
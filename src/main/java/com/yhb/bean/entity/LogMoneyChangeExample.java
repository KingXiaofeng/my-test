package com.yhb.bean.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogMoneyChangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogMoneyChangeExample() {
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

        public Criteria andMoneychangeidIsNull() {
            addCriterion("MoneyChangeId is null");
            return (Criteria) this;
        }

        public Criteria andMoneychangeidIsNotNull() {
            addCriterion("MoneyChangeId is not null");
            return (Criteria) this;
        }

        public Criteria andMoneychangeidEqualTo(Integer value) {
            addCriterion("MoneyChangeId =", value, "moneychangeid");
            return (Criteria) this;
        }

        public Criteria andMoneychangeidNotEqualTo(Integer value) {
            addCriterion("MoneyChangeId <>", value, "moneychangeid");
            return (Criteria) this;
        }

        public Criteria andMoneychangeidGreaterThan(Integer value) {
            addCriterion("MoneyChangeId >", value, "moneychangeid");
            return (Criteria) this;
        }

        public Criteria andMoneychangeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MoneyChangeId >=", value, "moneychangeid");
            return (Criteria) this;
        }

        public Criteria andMoneychangeidLessThan(Integer value) {
            addCriterion("MoneyChangeId <", value, "moneychangeid");
            return (Criteria) this;
        }

        public Criteria andMoneychangeidLessThanOrEqualTo(Integer value) {
            addCriterion("MoneyChangeId <=", value, "moneychangeid");
            return (Criteria) this;
        }

        public Criteria andMoneychangeidIn(List<Integer> values) {
            addCriterion("MoneyChangeId in", values, "moneychangeid");
            return (Criteria) this;
        }

        public Criteria andMoneychangeidNotIn(List<Integer> values) {
            addCriterion("MoneyChangeId not in", values, "moneychangeid");
            return (Criteria) this;
        }

        public Criteria andMoneychangeidBetween(Integer value1, Integer value2) {
            addCriterion("MoneyChangeId between", value1, value2, "moneychangeid");
            return (Criteria) this;
        }

        public Criteria andMoneychangeidNotBetween(Integer value1, Integer value2) {
            addCriterion("MoneyChangeId not between", value1, value2, "moneychangeid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("UserId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("UserId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("UserId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("UserId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("UserId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("UserId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("UserId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("UserId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("UserId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("UserId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("UserId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("UserId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("UserId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("UserName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("UserName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("UserName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("UserName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("UserName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("UserName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("UserName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("UserName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("UserName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("UserName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("UserName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("UserName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("UserName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("UserName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andChangemoneyIsNull() {
            addCriterion("ChangeMoney is null");
            return (Criteria) this;
        }

        public Criteria andChangemoneyIsNotNull() {
            addCriterion("ChangeMoney is not null");
            return (Criteria) this;
        }

        public Criteria andChangemoneyEqualTo(BigDecimal value) {
            addCriterion("ChangeMoney =", value, "changemoney");
            return (Criteria) this;
        }

        public Criteria andChangemoneyNotEqualTo(BigDecimal value) {
            addCriterion("ChangeMoney <>", value, "changemoney");
            return (Criteria) this;
        }

        public Criteria andChangemoneyGreaterThan(BigDecimal value) {
            addCriterion("ChangeMoney >", value, "changemoney");
            return (Criteria) this;
        }

        public Criteria andChangemoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ChangeMoney >=", value, "changemoney");
            return (Criteria) this;
        }

        public Criteria andChangemoneyLessThan(BigDecimal value) {
            addCriterion("ChangeMoney <", value, "changemoney");
            return (Criteria) this;
        }

        public Criteria andChangemoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ChangeMoney <=", value, "changemoney");
            return (Criteria) this;
        }

        public Criteria andChangemoneyIn(List<BigDecimal> values) {
            addCriterion("ChangeMoney in", values, "changemoney");
            return (Criteria) this;
        }

        public Criteria andChangemoneyNotIn(List<BigDecimal> values) {
            addCriterion("ChangeMoney not in", values, "changemoney");
            return (Criteria) this;
        }

        public Criteria andChangemoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ChangeMoney between", value1, value2, "changemoney");
            return (Criteria) this;
        }

        public Criteria andChangemoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ChangeMoney not between", value1, value2, "changemoney");
            return (Criteria) this;
        }

        public Criteria andPoundageIsNull() {
            addCriterion("Poundage is null");
            return (Criteria) this;
        }

        public Criteria andPoundageIsNotNull() {
            addCriterion("Poundage is not null");
            return (Criteria) this;
        }

        public Criteria andPoundageEqualTo(BigDecimal value) {
            addCriterion("Poundage =", value, "poundage");
            return (Criteria) this;
        }

        public Criteria andPoundageNotEqualTo(BigDecimal value) {
            addCriterion("Poundage <>", value, "poundage");
            return (Criteria) this;
        }

        public Criteria andPoundageGreaterThan(BigDecimal value) {
            addCriterion("Poundage >", value, "poundage");
            return (Criteria) this;
        }

        public Criteria andPoundageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Poundage >=", value, "poundage");
            return (Criteria) this;
        }

        public Criteria andPoundageLessThan(BigDecimal value) {
            addCriterion("Poundage <", value, "poundage");
            return (Criteria) this;
        }

        public Criteria andPoundageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Poundage <=", value, "poundage");
            return (Criteria) this;
        }

        public Criteria andPoundageIn(List<BigDecimal> values) {
            addCriterion("Poundage in", values, "poundage");
            return (Criteria) this;
        }

        public Criteria andPoundageNotIn(List<BigDecimal> values) {
            addCriterion("Poundage not in", values, "poundage");
            return (Criteria) this;
        }

        public Criteria andPoundageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Poundage between", value1, value2, "poundage");
            return (Criteria) this;
        }

        public Criteria andPoundageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Poundage not between", value1, value2, "poundage");
            return (Criteria) this;
        }

        public Criteria andUserbalanceIsNull() {
            addCriterion("UserBalance is null");
            return (Criteria) this;
        }

        public Criteria andUserbalanceIsNotNull() {
            addCriterion("UserBalance is not null");
            return (Criteria) this;
        }

        public Criteria andUserbalanceEqualTo(BigDecimal value) {
            addCriterion("UserBalance =", value, "userbalance");
            return (Criteria) this;
        }

        public Criteria andUserbalanceNotEqualTo(BigDecimal value) {
            addCriterion("UserBalance <>", value, "userbalance");
            return (Criteria) this;
        }

        public Criteria andUserbalanceGreaterThan(BigDecimal value) {
            addCriterion("UserBalance >", value, "userbalance");
            return (Criteria) this;
        }

        public Criteria andUserbalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UserBalance >=", value, "userbalance");
            return (Criteria) this;
        }

        public Criteria andUserbalanceLessThan(BigDecimal value) {
            addCriterion("UserBalance <", value, "userbalance");
            return (Criteria) this;
        }

        public Criteria andUserbalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UserBalance <=", value, "userbalance");
            return (Criteria) this;
        }

        public Criteria andUserbalanceIn(List<BigDecimal> values) {
            addCriterion("UserBalance in", values, "userbalance");
            return (Criteria) this;
        }

        public Criteria andUserbalanceNotIn(List<BigDecimal> values) {
            addCriterion("UserBalance not in", values, "userbalance");
            return (Criteria) this;
        }

        public Criteria andUserbalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UserBalance between", value1, value2, "userbalance");
            return (Criteria) this;
        }

        public Criteria andUserbalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UserBalance not between", value1, value2, "userbalance");
            return (Criteria) this;
        }

        public Criteria andAddorremoveIsNull() {
            addCriterion("AddOrRemove is null");
            return (Criteria) this;
        }

        public Criteria andAddorremoveIsNotNull() {
            addCriterion("AddOrRemove is not null");
            return (Criteria) this;
        }

        public Criteria andAddorremoveEqualTo(String value) {
            addCriterion("AddOrRemove =", value, "addorremove");
            return (Criteria) this;
        }

        public Criteria andAddorremoveNotEqualTo(String value) {
            addCriterion("AddOrRemove <>", value, "addorremove");
            return (Criteria) this;
        }

        public Criteria andAddorremoveGreaterThan(String value) {
            addCriterion("AddOrRemove >", value, "addorremove");
            return (Criteria) this;
        }

        public Criteria andAddorremoveGreaterThanOrEqualTo(String value) {
            addCriterion("AddOrRemove >=", value, "addorremove");
            return (Criteria) this;
        }

        public Criteria andAddorremoveLessThan(String value) {
            addCriterion("AddOrRemove <", value, "addorremove");
            return (Criteria) this;
        }

        public Criteria andAddorremoveLessThanOrEqualTo(String value) {
            addCriterion("AddOrRemove <=", value, "addorremove");
            return (Criteria) this;
        }

        public Criteria andAddorremoveLike(String value) {
            addCriterion("AddOrRemove like", value, "addorremove");
            return (Criteria) this;
        }

        public Criteria andAddorremoveNotLike(String value) {
            addCriterion("AddOrRemove not like", value, "addorremove");
            return (Criteria) this;
        }

        public Criteria andAddorremoveIn(List<String> values) {
            addCriterion("AddOrRemove in", values, "addorremove");
            return (Criteria) this;
        }

        public Criteria andAddorremoveNotIn(List<String> values) {
            addCriterion("AddOrRemove not in", values, "addorremove");
            return (Criteria) this;
        }

        public Criteria andAddorremoveBetween(String value1, String value2) {
            addCriterion("AddOrRemove between", value1, value2, "addorremove");
            return (Criteria) this;
        }

        public Criteria andAddorremoveNotBetween(String value1, String value2) {
            addCriterion("AddOrRemove not between", value1, value2, "addorremove");
            return (Criteria) this;
        }

        public Criteria andExplaindesIsNull() {
            addCriterion("ExplainDes is null");
            return (Criteria) this;
        }

        public Criteria andExplaindesIsNotNull() {
            addCriterion("ExplainDes is not null");
            return (Criteria) this;
        }

        public Criteria andExplaindesEqualTo(String value) {
            addCriterion("ExplainDes =", value, "explaindes");
            return (Criteria) this;
        }

        public Criteria andExplaindesNotEqualTo(String value) {
            addCriterion("ExplainDes <>", value, "explaindes");
            return (Criteria) this;
        }

        public Criteria andExplaindesGreaterThan(String value) {
            addCriterion("ExplainDes >", value, "explaindes");
            return (Criteria) this;
        }

        public Criteria andExplaindesGreaterThanOrEqualTo(String value) {
            addCriterion("ExplainDes >=", value, "explaindes");
            return (Criteria) this;
        }

        public Criteria andExplaindesLessThan(String value) {
            addCriterion("ExplainDes <", value, "explaindes");
            return (Criteria) this;
        }

        public Criteria andExplaindesLessThanOrEqualTo(String value) {
            addCriterion("ExplainDes <=", value, "explaindes");
            return (Criteria) this;
        }

        public Criteria andExplaindesLike(String value) {
            addCriterion("ExplainDes like", value, "explaindes");
            return (Criteria) this;
        }

        public Criteria andExplaindesNotLike(String value) {
            addCriterion("ExplainDes not like", value, "explaindes");
            return (Criteria) this;
        }

        public Criteria andExplaindesIn(List<String> values) {
            addCriterion("ExplainDes in", values, "explaindes");
            return (Criteria) this;
        }

        public Criteria andExplaindesNotIn(List<String> values) {
            addCriterion("ExplainDes not in", values, "explaindes");
            return (Criteria) this;
        }

        public Criteria andExplaindesBetween(String value1, String value2) {
            addCriterion("ExplainDes between", value1, value2, "explaindes");
            return (Criteria) this;
        }

        public Criteria andExplaindesNotBetween(String value1, String value2) {
            addCriterion("ExplainDes not between", value1, value2, "explaindes");
            return (Criteria) this;
        }

        public Criteria andSubmitdateIsNull() {
            addCriterion("SubmitDate is null");
            return (Criteria) this;
        }

        public Criteria andSubmitdateIsNotNull() {
            addCriterion("SubmitDate is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitdateEqualTo(Date value) {
            addCriterion("SubmitDate =", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateNotEqualTo(Date value) {
            addCriterion("SubmitDate <>", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateGreaterThan(Date value) {
            addCriterion("SubmitDate >", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateGreaterThanOrEqualTo(Date value) {
            addCriterion("SubmitDate >=", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateLessThan(Date value) {
            addCriterion("SubmitDate <", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateLessThanOrEqualTo(Date value) {
            addCriterion("SubmitDate <=", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateIn(List<Date> values) {
            addCriterion("SubmitDate in", values, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateNotIn(List<Date> values) {
            addCriterion("SubmitDate not in", values, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateBetween(Date value1, Date value2) {
            addCriterion("SubmitDate between", value1, value2, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateNotBetween(Date value1, Date value2) {
            addCriterion("SubmitDate not between", value1, value2, "submitdate");
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
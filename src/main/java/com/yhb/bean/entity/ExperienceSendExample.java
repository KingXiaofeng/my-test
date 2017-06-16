package com.yhb.bean.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExperienceSendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExperienceSendExample() {
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

        public Criteria andExperiencesendidIsNull() {
            addCriterion("ExperienceSendId is null");
            return (Criteria) this;
        }

        public Criteria andExperiencesendidIsNotNull() {
            addCriterion("ExperienceSendId is not null");
            return (Criteria) this;
        }

        public Criteria andExperiencesendidEqualTo(Integer value) {
            addCriterion("ExperienceSendId =", value, "experiencesendid");
            return (Criteria) this;
        }

        public Criteria andExperiencesendidNotEqualTo(Integer value) {
            addCriterion("ExperienceSendId <>", value, "experiencesendid");
            return (Criteria) this;
        }

        public Criteria andExperiencesendidGreaterThan(Integer value) {
            addCriterion("ExperienceSendId >", value, "experiencesendid");
            return (Criteria) this;
        }

        public Criteria andExperiencesendidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ExperienceSendId >=", value, "experiencesendid");
            return (Criteria) this;
        }

        public Criteria andExperiencesendidLessThan(Integer value) {
            addCriterion("ExperienceSendId <", value, "experiencesendid");
            return (Criteria) this;
        }

        public Criteria andExperiencesendidLessThanOrEqualTo(Integer value) {
            addCriterion("ExperienceSendId <=", value, "experiencesendid");
            return (Criteria) this;
        }

        public Criteria andExperiencesendidIn(List<Integer> values) {
            addCriterion("ExperienceSendId in", values, "experiencesendid");
            return (Criteria) this;
        }

        public Criteria andExperiencesendidNotIn(List<Integer> values) {
            addCriterion("ExperienceSendId not in", values, "experiencesendid");
            return (Criteria) this;
        }

        public Criteria andExperiencesendidBetween(Integer value1, Integer value2) {
            addCriterion("ExperienceSendId between", value1, value2, "experiencesendid");
            return (Criteria) this;
        }

        public Criteria andExperiencesendidNotBetween(Integer value1, Integer value2) {
            addCriterion("ExperienceSendId not between", value1, value2, "experiencesendid");
            return (Criteria) this;
        }

        public Criteria andFpidIsNull() {
            addCriterion("fPid is null");
            return (Criteria) this;
        }

        public Criteria andFpidIsNotNull() {
            addCriterion("fPid is not null");
            return (Criteria) this;
        }

        public Criteria andFpidEqualTo(String value) {
            addCriterion("fPid =", value, "fpid");
            return (Criteria) this;
        }

        public Criteria andFpidNotEqualTo(String value) {
            addCriterion("fPid <>", value, "fpid");
            return (Criteria) this;
        }

        public Criteria andFpidGreaterThan(String value) {
            addCriterion("fPid >", value, "fpid");
            return (Criteria) this;
        }

        public Criteria andFpidGreaterThanOrEqualTo(String value) {
            addCriterion("fPid >=", value, "fpid");
            return (Criteria) this;
        }

        public Criteria andFpidLessThan(String value) {
            addCriterion("fPid <", value, "fpid");
            return (Criteria) this;
        }

        public Criteria andFpidLessThanOrEqualTo(String value) {
            addCriterion("fPid <=", value, "fpid");
            return (Criteria) this;
        }

        public Criteria andFpidLike(String value) {
            addCriterion("fPid like", value, "fpid");
            return (Criteria) this;
        }

        public Criteria andFpidNotLike(String value) {
            addCriterion("fPid not like", value, "fpid");
            return (Criteria) this;
        }

        public Criteria andFpidIn(List<String> values) {
            addCriterion("fPid in", values, "fpid");
            return (Criteria) this;
        }

        public Criteria andFpidNotIn(List<String> values) {
            addCriterion("fPid not in", values, "fpid");
            return (Criteria) this;
        }

        public Criteria andFpidBetween(String value1, String value2) {
            addCriterion("fPid between", value1, value2, "fpid");
            return (Criteria) this;
        }

        public Criteria andFpidNotBetween(String value1, String value2) {
            addCriterion("fPid not between", value1, value2, "fpid");
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

        public Criteria andExperienceidIsNull() {
            addCriterion("ExperienceId is null");
            return (Criteria) this;
        }

        public Criteria andExperienceidIsNotNull() {
            addCriterion("ExperienceId is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceidEqualTo(Integer value) {
            addCriterion("ExperienceId =", value, "experienceid");
            return (Criteria) this;
        }

        public Criteria andExperienceidNotEqualTo(Integer value) {
            addCriterion("ExperienceId <>", value, "experienceid");
            return (Criteria) this;
        }

        public Criteria andExperienceidGreaterThan(Integer value) {
            addCriterion("ExperienceId >", value, "experienceid");
            return (Criteria) this;
        }

        public Criteria andExperienceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ExperienceId >=", value, "experienceid");
            return (Criteria) this;
        }

        public Criteria andExperienceidLessThan(Integer value) {
            addCriterion("ExperienceId <", value, "experienceid");
            return (Criteria) this;
        }

        public Criteria andExperienceidLessThanOrEqualTo(Integer value) {
            addCriterion("ExperienceId <=", value, "experienceid");
            return (Criteria) this;
        }

        public Criteria andExperienceidIn(List<Integer> values) {
            addCriterion("ExperienceId in", values, "experienceid");
            return (Criteria) this;
        }

        public Criteria andExperienceidNotIn(List<Integer> values) {
            addCriterion("ExperienceId not in", values, "experienceid");
            return (Criteria) this;
        }

        public Criteria andExperienceidBetween(Integer value1, Integer value2) {
            addCriterion("ExperienceId between", value1, value2, "experienceid");
            return (Criteria) this;
        }

        public Criteria andExperienceidNotBetween(Integer value1, Integer value2) {
            addCriterion("ExperienceId not between", value1, value2, "experienceid");
            return (Criteria) this;
        }

        public Criteria andExperiencesendtimeIsNull() {
            addCriterion("ExperienceSendTime is null");
            return (Criteria) this;
        }

        public Criteria andExperiencesendtimeIsNotNull() {
            addCriterion("ExperienceSendTime is not null");
            return (Criteria) this;
        }

        public Criteria andExperiencesendtimeEqualTo(Date value) {
            addCriterion("ExperienceSendTime =", value, "experiencesendtime");
            return (Criteria) this;
        }

        public Criteria andExperiencesendtimeNotEqualTo(Date value) {
            addCriterion("ExperienceSendTime <>", value, "experiencesendtime");
            return (Criteria) this;
        }

        public Criteria andExperiencesendtimeGreaterThan(Date value) {
            addCriterion("ExperienceSendTime >", value, "experiencesendtime");
            return (Criteria) this;
        }

        public Criteria andExperiencesendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ExperienceSendTime >=", value, "experiencesendtime");
            return (Criteria) this;
        }

        public Criteria andExperiencesendtimeLessThan(Date value) {
            addCriterion("ExperienceSendTime <", value, "experiencesendtime");
            return (Criteria) this;
        }

        public Criteria andExperiencesendtimeLessThanOrEqualTo(Date value) {
            addCriterion("ExperienceSendTime <=", value, "experiencesendtime");
            return (Criteria) this;
        }

        public Criteria andExperiencesendtimeIn(List<Date> values) {
            addCriterion("ExperienceSendTime in", values, "experiencesendtime");
            return (Criteria) this;
        }

        public Criteria andExperiencesendtimeNotIn(List<Date> values) {
            addCriterion("ExperienceSendTime not in", values, "experiencesendtime");
            return (Criteria) this;
        }

        public Criteria andExperiencesendtimeBetween(Date value1, Date value2) {
            addCriterion("ExperienceSendTime between", value1, value2, "experiencesendtime");
            return (Criteria) this;
        }

        public Criteria andExperiencesendtimeNotBetween(Date value1, Date value2) {
            addCriterion("ExperienceSendTime not between", value1, value2, "experiencesendtime");
            return (Criteria) this;
        }

        public Criteria andExperiencesendisuseIsNull() {
            addCriterion("ExperienceSendIsUse is null");
            return (Criteria) this;
        }

        public Criteria andExperiencesendisuseIsNotNull() {
            addCriterion("ExperienceSendIsUse is not null");
            return (Criteria) this;
        }

        public Criteria andExperiencesendisuseEqualTo(Integer value) {
            addCriterion("ExperienceSendIsUse =", value, "experiencesendisuse");
            return (Criteria) this;
        }

        public Criteria andExperiencesendisuseNotEqualTo(Integer value) {
            addCriterion("ExperienceSendIsUse <>", value, "experiencesendisuse");
            return (Criteria) this;
        }

        public Criteria andExperiencesendisuseGreaterThan(Integer value) {
            addCriterion("ExperienceSendIsUse >", value, "experiencesendisuse");
            return (Criteria) this;
        }

        public Criteria andExperiencesendisuseGreaterThanOrEqualTo(Integer value) {
            addCriterion("ExperienceSendIsUse >=", value, "experiencesendisuse");
            return (Criteria) this;
        }

        public Criteria andExperiencesendisuseLessThan(Integer value) {
            addCriterion("ExperienceSendIsUse <", value, "experiencesendisuse");
            return (Criteria) this;
        }

        public Criteria andExperiencesendisuseLessThanOrEqualTo(Integer value) {
            addCriterion("ExperienceSendIsUse <=", value, "experiencesendisuse");
            return (Criteria) this;
        }

        public Criteria andExperiencesendisuseIn(List<Integer> values) {
            addCriterion("ExperienceSendIsUse in", values, "experiencesendisuse");
            return (Criteria) this;
        }

        public Criteria andExperiencesendisuseNotIn(List<Integer> values) {
            addCriterion("ExperienceSendIsUse not in", values, "experiencesendisuse");
            return (Criteria) this;
        }

        public Criteria andExperiencesendisuseBetween(Integer value1, Integer value2) {
            addCriterion("ExperienceSendIsUse between", value1, value2, "experiencesendisuse");
            return (Criteria) this;
        }

        public Criteria andExperiencesendisuseNotBetween(Integer value1, Integer value2) {
            addCriterion("ExperienceSendIsUse not between", value1, value2, "experiencesendisuse");
            return (Criteria) this;
        }

        public Criteria andExperiencesendusetimeIsNull() {
            addCriterion("ExperienceSendUseTime is null");
            return (Criteria) this;
        }

        public Criteria andExperiencesendusetimeIsNotNull() {
            addCriterion("ExperienceSendUseTime is not null");
            return (Criteria) this;
        }

        public Criteria andExperiencesendusetimeEqualTo(Date value) {
            addCriterion("ExperienceSendUseTime =", value, "experiencesendusetime");
            return (Criteria) this;
        }

        public Criteria andExperiencesendusetimeNotEqualTo(Date value) {
            addCriterion("ExperienceSendUseTime <>", value, "experiencesendusetime");
            return (Criteria) this;
        }

        public Criteria andExperiencesendusetimeGreaterThan(Date value) {
            addCriterion("ExperienceSendUseTime >", value, "experiencesendusetime");
            return (Criteria) this;
        }

        public Criteria andExperiencesendusetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ExperienceSendUseTime >=", value, "experiencesendusetime");
            return (Criteria) this;
        }

        public Criteria andExperiencesendusetimeLessThan(Date value) {
            addCriterion("ExperienceSendUseTime <", value, "experiencesendusetime");
            return (Criteria) this;
        }

        public Criteria andExperiencesendusetimeLessThanOrEqualTo(Date value) {
            addCriterion("ExperienceSendUseTime <=", value, "experiencesendusetime");
            return (Criteria) this;
        }

        public Criteria andExperiencesendusetimeIn(List<Date> values) {
            addCriterion("ExperienceSendUseTime in", values, "experiencesendusetime");
            return (Criteria) this;
        }

        public Criteria andExperiencesendusetimeNotIn(List<Date> values) {
            addCriterion("ExperienceSendUseTime not in", values, "experiencesendusetime");
            return (Criteria) this;
        }

        public Criteria andExperiencesendusetimeBetween(Date value1, Date value2) {
            addCriterion("ExperienceSendUseTime between", value1, value2, "experiencesendusetime");
            return (Criteria) this;
        }

        public Criteria andExperiencesendusetimeNotBetween(Date value1, Date value2) {
            addCriterion("ExperienceSendUseTime not between", value1, value2, "experiencesendusetime");
            return (Criteria) this;
        }

        public Criteria andExperiencerateIsNull() {
            addCriterion("ExperienceRate is null");
            return (Criteria) this;
        }

        public Criteria andExperiencerateIsNotNull() {
            addCriterion("ExperienceRate is not null");
            return (Criteria) this;
        }

        public Criteria andExperiencerateEqualTo(BigDecimal value) {
            addCriterion("ExperienceRate =", value, "experiencerate");
            return (Criteria) this;
        }

        public Criteria andExperiencerateNotEqualTo(BigDecimal value) {
            addCriterion("ExperienceRate <>", value, "experiencerate");
            return (Criteria) this;
        }

        public Criteria andExperiencerateGreaterThan(BigDecimal value) {
            addCriterion("ExperienceRate >", value, "experiencerate");
            return (Criteria) this;
        }

        public Criteria andExperiencerateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ExperienceRate >=", value, "experiencerate");
            return (Criteria) this;
        }

        public Criteria andExperiencerateLessThan(BigDecimal value) {
            addCriterion("ExperienceRate <", value, "experiencerate");
            return (Criteria) this;
        }

        public Criteria andExperiencerateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ExperienceRate <=", value, "experiencerate");
            return (Criteria) this;
        }

        public Criteria andExperiencerateIn(List<BigDecimal> values) {
            addCriterion("ExperienceRate in", values, "experiencerate");
            return (Criteria) this;
        }

        public Criteria andExperiencerateNotIn(List<BigDecimal> values) {
            addCriterion("ExperienceRate not in", values, "experiencerate");
            return (Criteria) this;
        }

        public Criteria andExperiencerateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ExperienceRate between", value1, value2, "experiencerate");
            return (Criteria) this;
        }

        public Criteria andExperiencerateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ExperienceRate not between", value1, value2, "experiencerate");
            return (Criteria) this;
        }

        public Criteria andExperiencesendmoneyIsNull() {
            addCriterion("ExperienceSendMoney is null");
            return (Criteria) this;
        }

        public Criteria andExperiencesendmoneyIsNotNull() {
            addCriterion("ExperienceSendMoney is not null");
            return (Criteria) this;
        }

        public Criteria andExperiencesendmoneyEqualTo(BigDecimal value) {
            addCriterion("ExperienceSendMoney =", value, "experiencesendmoney");
            return (Criteria) this;
        }

        public Criteria andExperiencesendmoneyNotEqualTo(BigDecimal value) {
            addCriterion("ExperienceSendMoney <>", value, "experiencesendmoney");
            return (Criteria) this;
        }

        public Criteria andExperiencesendmoneyGreaterThan(BigDecimal value) {
            addCriterion("ExperienceSendMoney >", value, "experiencesendmoney");
            return (Criteria) this;
        }

        public Criteria andExperiencesendmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ExperienceSendMoney >=", value, "experiencesendmoney");
            return (Criteria) this;
        }

        public Criteria andExperiencesendmoneyLessThan(BigDecimal value) {
            addCriterion("ExperienceSendMoney <", value, "experiencesendmoney");
            return (Criteria) this;
        }

        public Criteria andExperiencesendmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ExperienceSendMoney <=", value, "experiencesendmoney");
            return (Criteria) this;
        }

        public Criteria andExperiencesendmoneyIn(List<BigDecimal> values) {
            addCriterion("ExperienceSendMoney in", values, "experiencesendmoney");
            return (Criteria) this;
        }

        public Criteria andExperiencesendmoneyNotIn(List<BigDecimal> values) {
            addCriterion("ExperienceSendMoney not in", values, "experiencesendmoney");
            return (Criteria) this;
        }

        public Criteria andExperiencesendmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ExperienceSendMoney between", value1, value2, "experiencesendmoney");
            return (Criteria) this;
        }

        public Criteria andExperiencesendmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ExperienceSendMoney not between", value1, value2, "experiencesendmoney");
            return (Criteria) this;
        }

        public Criteria andChangecodeIsNull() {
            addCriterion("changeCode is null");
            return (Criteria) this;
        }

        public Criteria andChangecodeIsNotNull() {
            addCriterion("changeCode is not null");
            return (Criteria) this;
        }

        public Criteria andChangecodeEqualTo(String value) {
            addCriterion("changeCode =", value, "changecode");
            return (Criteria) this;
        }

        public Criteria andChangecodeNotEqualTo(String value) {
            addCriterion("changeCode <>", value, "changecode");
            return (Criteria) this;
        }

        public Criteria andChangecodeGreaterThan(String value) {
            addCriterion("changeCode >", value, "changecode");
            return (Criteria) this;
        }

        public Criteria andChangecodeGreaterThanOrEqualTo(String value) {
            addCriterion("changeCode >=", value, "changecode");
            return (Criteria) this;
        }

        public Criteria andChangecodeLessThan(String value) {
            addCriterion("changeCode <", value, "changecode");
            return (Criteria) this;
        }

        public Criteria andChangecodeLessThanOrEqualTo(String value) {
            addCriterion("changeCode <=", value, "changecode");
            return (Criteria) this;
        }

        public Criteria andChangecodeLike(String value) {
            addCriterion("changeCode like", value, "changecode");
            return (Criteria) this;
        }

        public Criteria andChangecodeNotLike(String value) {
            addCriterion("changeCode not like", value, "changecode");
            return (Criteria) this;
        }

        public Criteria andChangecodeIn(List<String> values) {
            addCriterion("changeCode in", values, "changecode");
            return (Criteria) this;
        }

        public Criteria andChangecodeNotIn(List<String> values) {
            addCriterion("changeCode not in", values, "changecode");
            return (Criteria) this;
        }

        public Criteria andChangecodeBetween(String value1, String value2) {
            addCriterion("changeCode between", value1, value2, "changecode");
            return (Criteria) this;
        }

        public Criteria andChangecodeNotBetween(String value1, String value2) {
            addCriterion("changeCode not between", value1, value2, "changecode");
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
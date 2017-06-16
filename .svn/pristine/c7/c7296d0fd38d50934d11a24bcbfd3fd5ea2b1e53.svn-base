package com.yhb.bean.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DailyRevenueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DailyRevenueExample() {
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRevenueIsNull() {
            addCriterion("Revenue is null");
            return (Criteria) this;
        }

        public Criteria andRevenueIsNotNull() {
            addCriterion("Revenue is not null");
            return (Criteria) this;
        }

        public Criteria andRevenueEqualTo(Float value) {
            addCriterion("Revenue =", value, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueNotEqualTo(Float value) {
            addCriterion("Revenue <>", value, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueGreaterThan(Float value) {
            addCriterion("Revenue >", value, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueGreaterThanOrEqualTo(Float value) {
            addCriterion("Revenue >=", value, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueLessThan(Float value) {
            addCriterion("Revenue <", value, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueLessThanOrEqualTo(Float value) {
            addCriterion("Revenue <=", value, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueIn(List<Float> values) {
            addCriterion("Revenue in", values, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueNotIn(List<Float> values) {
            addCriterion("Revenue not in", values, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueBetween(Float value1, Float value2) {
            addCriterion("Revenue between", value1, value2, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueNotBetween(Float value1, Float value2) {
            addCriterion("Revenue not between", value1, value2, "revenue");
            return (Criteria) this;
        }

        public Criteria andRecedateIsNull() {
            addCriterion("ReceDate is null");
            return (Criteria) this;
        }

        public Criteria andRecedateIsNotNull() {
            addCriterion("ReceDate is not null");
            return (Criteria) this;
        }

        public Criteria andRecedateEqualTo(Date value) {
            addCriterion("ReceDate =", value, "recedate");
            return (Criteria) this;
        }

        public Criteria andRecedateNotEqualTo(Date value) {
            addCriterion("ReceDate <>", value, "recedate");
            return (Criteria) this;
        }

        public Criteria andRecedateGreaterThan(Date value) {
            addCriterion("ReceDate >", value, "recedate");
            return (Criteria) this;
        }

        public Criteria andRecedateGreaterThanOrEqualTo(Date value) {
            addCriterion("ReceDate >=", value, "recedate");
            return (Criteria) this;
        }

        public Criteria andRecedateLessThan(Date value) {
            addCriterion("ReceDate <", value, "recedate");
            return (Criteria) this;
        }

        public Criteria andRecedateLessThanOrEqualTo(Date value) {
            addCriterion("ReceDate <=", value, "recedate");
            return (Criteria) this;
        }

        public Criteria andRecedateIn(List<Date> values) {
            addCriterion("ReceDate in", values, "recedate");
            return (Criteria) this;
        }

        public Criteria andRecedateNotIn(List<Date> values) {
            addCriterion("ReceDate not in", values, "recedate");
            return (Criteria) this;
        }

        public Criteria andRecedateBetween(Date value1, Date value2) {
            addCriterion("ReceDate between", value1, value2, "recedate");
            return (Criteria) this;
        }

        public Criteria andRecedateNotBetween(Date value1, Date value2) {
            addCriterion("ReceDate not between", value1, value2, "recedate");
            return (Criteria) this;
        }

        public Criteria andMangetypeIsNull() {
            addCriterion("MangeType is null");
            return (Criteria) this;
        }

        public Criteria andMangetypeIsNotNull() {
            addCriterion("MangeType is not null");
            return (Criteria) this;
        }

        public Criteria andMangetypeEqualTo(String value) {
            addCriterion("MangeType =", value, "mangetype");
            return (Criteria) this;
        }

        public Criteria andMangetypeNotEqualTo(String value) {
            addCriterion("MangeType <>", value, "mangetype");
            return (Criteria) this;
        }

        public Criteria andMangetypeGreaterThan(String value) {
            addCriterion("MangeType >", value, "mangetype");
            return (Criteria) this;
        }

        public Criteria andMangetypeGreaterThanOrEqualTo(String value) {
            addCriterion("MangeType >=", value, "mangetype");
            return (Criteria) this;
        }

        public Criteria andMangetypeLessThan(String value) {
            addCriterion("MangeType <", value, "mangetype");
            return (Criteria) this;
        }

        public Criteria andMangetypeLessThanOrEqualTo(String value) {
            addCriterion("MangeType <=", value, "mangetype");
            return (Criteria) this;
        }

        public Criteria andMangetypeLike(String value) {
            addCriterion("MangeType like", value, "mangetype");
            return (Criteria) this;
        }

        public Criteria andMangetypeNotLike(String value) {
            addCriterion("MangeType not like", value, "mangetype");
            return (Criteria) this;
        }

        public Criteria andMangetypeIn(List<String> values) {
            addCriterion("MangeType in", values, "mangetype");
            return (Criteria) this;
        }

        public Criteria andMangetypeNotIn(List<String> values) {
            addCriterion("MangeType not in", values, "mangetype");
            return (Criteria) this;
        }

        public Criteria andMangetypeBetween(String value1, String value2) {
            addCriterion("MangeType between", value1, value2, "mangetype");
            return (Criteria) this;
        }

        public Criteria andMangetypeNotBetween(String value1, String value2) {
            addCriterion("MangeType not between", value1, value2, "mangetype");
            return (Criteria) this;
        }

        public Criteria andManageidIsNull() {
            addCriterion("ManageId is null");
            return (Criteria) this;
        }

        public Criteria andManageidIsNotNull() {
            addCriterion("ManageId is not null");
            return (Criteria) this;
        }

        public Criteria andManageidEqualTo(String value) {
            addCriterion("ManageId =", value, "manageid");
            return (Criteria) this;
        }

        public Criteria andManageidNotEqualTo(String value) {
            addCriterion("ManageId <>", value, "manageid");
            return (Criteria) this;
        }

        public Criteria andManageidGreaterThan(String value) {
            addCriterion("ManageId >", value, "manageid");
            return (Criteria) this;
        }

        public Criteria andManageidGreaterThanOrEqualTo(String value) {
            addCriterion("ManageId >=", value, "manageid");
            return (Criteria) this;
        }

        public Criteria andManageidLessThan(String value) {
            addCriterion("ManageId <", value, "manageid");
            return (Criteria) this;
        }

        public Criteria andManageidLessThanOrEqualTo(String value) {
            addCriterion("ManageId <=", value, "manageid");
            return (Criteria) this;
        }

        public Criteria andManageidLike(String value) {
            addCriterion("ManageId like", value, "manageid");
            return (Criteria) this;
        }

        public Criteria andManageidNotLike(String value) {
            addCriterion("ManageId not like", value, "manageid");
            return (Criteria) this;
        }

        public Criteria andManageidIn(List<String> values) {
            addCriterion("ManageId in", values, "manageid");
            return (Criteria) this;
        }

        public Criteria andManageidNotIn(List<String> values) {
            addCriterion("ManageId not in", values, "manageid");
            return (Criteria) this;
        }

        public Criteria andManageidBetween(String value1, String value2) {
            addCriterion("ManageId between", value1, value2, "manageid");
            return (Criteria) this;
        }

        public Criteria andManageidNotBetween(String value1, String value2) {
            addCriterion("ManageId not between", value1, value2, "manageid");
            return (Criteria) this;
        }

        public Criteria andMnglevelIsNull() {
            addCriterion("MngLevel is null");
            return (Criteria) this;
        }

        public Criteria andMnglevelIsNotNull() {
            addCriterion("MngLevel is not null");
            return (Criteria) this;
        }

        public Criteria andMnglevelEqualTo(Integer value) {
            addCriterion("MngLevel =", value, "mnglevel");
            return (Criteria) this;
        }

        public Criteria andMnglevelNotEqualTo(Integer value) {
            addCriterion("MngLevel <>", value, "mnglevel");
            return (Criteria) this;
        }

        public Criteria andMnglevelGreaterThan(Integer value) {
            addCriterion("MngLevel >", value, "mnglevel");
            return (Criteria) this;
        }

        public Criteria andMnglevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("MngLevel >=", value, "mnglevel");
            return (Criteria) this;
        }

        public Criteria andMnglevelLessThan(Integer value) {
            addCriterion("MngLevel <", value, "mnglevel");
            return (Criteria) this;
        }

        public Criteria andMnglevelLessThanOrEqualTo(Integer value) {
            addCriterion("MngLevel <=", value, "mnglevel");
            return (Criteria) this;
        }

        public Criteria andMnglevelIn(List<Integer> values) {
            addCriterion("MngLevel in", values, "mnglevel");
            return (Criteria) this;
        }

        public Criteria andMnglevelNotIn(List<Integer> values) {
            addCriterion("MngLevel not in", values, "mnglevel");
            return (Criteria) this;
        }

        public Criteria andMnglevelBetween(Integer value1, Integer value2) {
            addCriterion("MngLevel between", value1, value2, "mnglevel");
            return (Criteria) this;
        }

        public Criteria andMnglevelNotBetween(Integer value1, Integer value2) {
            addCriterion("MngLevel not between", value1, value2, "mnglevel");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("Remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("Remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("Remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("Remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("Remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("Remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("Remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("Remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("Remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("Remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("Remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("Remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("Remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andLastrevenueIsNull() {
            addCriterion("LastRevenue is null");
            return (Criteria) this;
        }

        public Criteria andLastrevenueIsNotNull() {
            addCriterion("LastRevenue is not null");
            return (Criteria) this;
        }

        public Criteria andLastrevenueEqualTo(String value) {
            addCriterion("LastRevenue =", value, "lastrevenue");
            return (Criteria) this;
        }

        public Criteria andLastrevenueNotEqualTo(String value) {
            addCriterion("LastRevenue <>", value, "lastrevenue");
            return (Criteria) this;
        }

        public Criteria andLastrevenueGreaterThan(String value) {
            addCriterion("LastRevenue >", value, "lastrevenue");
            return (Criteria) this;
        }

        public Criteria andLastrevenueGreaterThanOrEqualTo(String value) {
            addCriterion("LastRevenue >=", value, "lastrevenue");
            return (Criteria) this;
        }

        public Criteria andLastrevenueLessThan(String value) {
            addCriterion("LastRevenue <", value, "lastrevenue");
            return (Criteria) this;
        }

        public Criteria andLastrevenueLessThanOrEqualTo(String value) {
            addCriterion("LastRevenue <=", value, "lastrevenue");
            return (Criteria) this;
        }

        public Criteria andLastrevenueLike(String value) {
            addCriterion("LastRevenue like", value, "lastrevenue");
            return (Criteria) this;
        }

        public Criteria andLastrevenueNotLike(String value) {
            addCriterion("LastRevenue not like", value, "lastrevenue");
            return (Criteria) this;
        }

        public Criteria andLastrevenueIn(List<String> values) {
            addCriterion("LastRevenue in", values, "lastrevenue");
            return (Criteria) this;
        }

        public Criteria andLastrevenueNotIn(List<String> values) {
            addCriterion("LastRevenue not in", values, "lastrevenue");
            return (Criteria) this;
        }

        public Criteria andLastrevenueBetween(String value1, String value2) {
            addCriterion("LastRevenue between", value1, value2, "lastrevenue");
            return (Criteria) this;
        }

        public Criteria andLastrevenueNotBetween(String value1, String value2) {
            addCriterion("LastRevenue not between", value1, value2, "lastrevenue");
            return (Criteria) this;
        }

        public Criteria andLastrecedateIsNull() {
            addCriterion("LastReceDate is null");
            return (Criteria) this;
        }

        public Criteria andLastrecedateIsNotNull() {
            addCriterion("LastReceDate is not null");
            return (Criteria) this;
        }

        public Criteria andLastrecedateEqualTo(String value) {
            addCriterion("LastReceDate =", value, "lastrecedate");
            return (Criteria) this;
        }

        public Criteria andLastrecedateNotEqualTo(String value) {
            addCriterion("LastReceDate <>", value, "lastrecedate");
            return (Criteria) this;
        }

        public Criteria andLastrecedateGreaterThan(String value) {
            addCriterion("LastReceDate >", value, "lastrecedate");
            return (Criteria) this;
        }

        public Criteria andLastrecedateGreaterThanOrEqualTo(String value) {
            addCriterion("LastReceDate >=", value, "lastrecedate");
            return (Criteria) this;
        }

        public Criteria andLastrecedateLessThan(String value) {
            addCriterion("LastReceDate <", value, "lastrecedate");
            return (Criteria) this;
        }

        public Criteria andLastrecedateLessThanOrEqualTo(String value) {
            addCriterion("LastReceDate <=", value, "lastrecedate");
            return (Criteria) this;
        }

        public Criteria andLastrecedateLike(String value) {
            addCriterion("LastReceDate like", value, "lastrecedate");
            return (Criteria) this;
        }

        public Criteria andLastrecedateNotLike(String value) {
            addCriterion("LastReceDate not like", value, "lastrecedate");
            return (Criteria) this;
        }

        public Criteria andLastrecedateIn(List<String> values) {
            addCriterion("LastReceDate in", values, "lastrecedate");
            return (Criteria) this;
        }

        public Criteria andLastrecedateNotIn(List<String> values) {
            addCriterion("LastReceDate not in", values, "lastrecedate");
            return (Criteria) this;
        }

        public Criteria andLastrecedateBetween(String value1, String value2) {
            addCriterion("LastReceDate between", value1, value2, "lastrecedate");
            return (Criteria) this;
        }

        public Criteria andLastrecedateNotBetween(String value1, String value2) {
            addCriterion("LastReceDate not between", value1, value2, "lastrecedate");
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
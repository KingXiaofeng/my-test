package com.yhb.bean.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProfitTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProfitTableExample() {
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

        public Criteria andProducttotalIsNull() {
            addCriterion("productTotal is null");
            return (Criteria) this;
        }

        public Criteria andProducttotalIsNotNull() {
            addCriterion("productTotal is not null");
            return (Criteria) this;
        }

        public Criteria andProducttotalEqualTo(BigDecimal value) {
            addCriterion("productTotal =", value, "producttotal");
            return (Criteria) this;
        }

        public Criteria andProducttotalNotEqualTo(BigDecimal value) {
            addCriterion("productTotal <>", value, "producttotal");
            return (Criteria) this;
        }

        public Criteria andProducttotalGreaterThan(BigDecimal value) {
            addCriterion("productTotal >", value, "producttotal");
            return (Criteria) this;
        }

        public Criteria andProducttotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("productTotal >=", value, "producttotal");
            return (Criteria) this;
        }

        public Criteria andProducttotalLessThan(BigDecimal value) {
            addCriterion("productTotal <", value, "producttotal");
            return (Criteria) this;
        }

        public Criteria andProducttotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("productTotal <=", value, "producttotal");
            return (Criteria) this;
        }

        public Criteria andProducttotalIn(List<BigDecimal> values) {
            addCriterion("productTotal in", values, "producttotal");
            return (Criteria) this;
        }

        public Criteria andProducttotalNotIn(List<BigDecimal> values) {
            addCriterion("productTotal not in", values, "producttotal");
            return (Criteria) this;
        }

        public Criteria andProducttotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("productTotal between", value1, value2, "producttotal");
            return (Criteria) this;
        }

        public Criteria andProducttotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("productTotal not between", value1, value2, "producttotal");
            return (Criteria) this;
        }

        public Criteria andExperiencetotalIsNull() {
            addCriterion("experienceTotal is null");
            return (Criteria) this;
        }

        public Criteria andExperiencetotalIsNotNull() {
            addCriterion("experienceTotal is not null");
            return (Criteria) this;
        }

        public Criteria andExperiencetotalEqualTo(BigDecimal value) {
            addCriterion("experienceTotal =", value, "experiencetotal");
            return (Criteria) this;
        }

        public Criteria andExperiencetotalNotEqualTo(BigDecimal value) {
            addCriterion("experienceTotal <>", value, "experiencetotal");
            return (Criteria) this;
        }

        public Criteria andExperiencetotalGreaterThan(BigDecimal value) {
            addCriterion("experienceTotal >", value, "experiencetotal");
            return (Criteria) this;
        }

        public Criteria andExperiencetotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("experienceTotal >=", value, "experiencetotal");
            return (Criteria) this;
        }

        public Criteria andExperiencetotalLessThan(BigDecimal value) {
            addCriterion("experienceTotal <", value, "experiencetotal");
            return (Criteria) this;
        }

        public Criteria andExperiencetotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("experienceTotal <=", value, "experiencetotal");
            return (Criteria) this;
        }

        public Criteria andExperiencetotalIn(List<BigDecimal> values) {
            addCriterion("experienceTotal in", values, "experiencetotal");
            return (Criteria) this;
        }

        public Criteria andExperiencetotalNotIn(List<BigDecimal> values) {
            addCriterion("experienceTotal not in", values, "experiencetotal");
            return (Criteria) this;
        }

        public Criteria andExperiencetotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("experienceTotal between", value1, value2, "experiencetotal");
            return (Criteria) this;
        }

        public Criteria andExperiencetotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("experienceTotal not between", value1, value2, "experiencetotal");
            return (Criteria) this;
        }

        public Criteria andRaisetotalIsNull() {
            addCriterion("raiseTotal is null");
            return (Criteria) this;
        }

        public Criteria andRaisetotalIsNotNull() {
            addCriterion("raiseTotal is not null");
            return (Criteria) this;
        }

        public Criteria andRaisetotalEqualTo(BigDecimal value) {
            addCriterion("raiseTotal =", value, "raisetotal");
            return (Criteria) this;
        }

        public Criteria andRaisetotalNotEqualTo(BigDecimal value) {
            addCriterion("raiseTotal <>", value, "raisetotal");
            return (Criteria) this;
        }

        public Criteria andRaisetotalGreaterThan(BigDecimal value) {
            addCriterion("raiseTotal >", value, "raisetotal");
            return (Criteria) this;
        }

        public Criteria andRaisetotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("raiseTotal >=", value, "raisetotal");
            return (Criteria) this;
        }

        public Criteria andRaisetotalLessThan(BigDecimal value) {
            addCriterion("raiseTotal <", value, "raisetotal");
            return (Criteria) this;
        }

        public Criteria andRaisetotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("raiseTotal <=", value, "raisetotal");
            return (Criteria) this;
        }

        public Criteria andRaisetotalIn(List<BigDecimal> values) {
            addCriterion("raiseTotal in", values, "raisetotal");
            return (Criteria) this;
        }

        public Criteria andRaisetotalNotIn(List<BigDecimal> values) {
            addCriterion("raiseTotal not in", values, "raisetotal");
            return (Criteria) this;
        }

        public Criteria andRaisetotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("raiseTotal between", value1, value2, "raisetotal");
            return (Criteria) this;
        }

        public Criteria andRaisetotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("raiseTotal not between", value1, value2, "raisetotal");
            return (Criteria) this;
        }

        public Criteria andHbtotalIsNull() {
            addCriterion("hbTotal is null");
            return (Criteria) this;
        }

        public Criteria andHbtotalIsNotNull() {
            addCriterion("hbTotal is not null");
            return (Criteria) this;
        }

        public Criteria andHbtotalEqualTo(BigDecimal value) {
            addCriterion("hbTotal =", value, "hbtotal");
            return (Criteria) this;
        }

        public Criteria andHbtotalNotEqualTo(BigDecimal value) {
            addCriterion("hbTotal <>", value, "hbtotal");
            return (Criteria) this;
        }

        public Criteria andHbtotalGreaterThan(BigDecimal value) {
            addCriterion("hbTotal >", value, "hbtotal");
            return (Criteria) this;
        }

        public Criteria andHbtotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hbTotal >=", value, "hbtotal");
            return (Criteria) this;
        }

        public Criteria andHbtotalLessThan(BigDecimal value) {
            addCriterion("hbTotal <", value, "hbtotal");
            return (Criteria) this;
        }

        public Criteria andHbtotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hbTotal <=", value, "hbtotal");
            return (Criteria) this;
        }

        public Criteria andHbtotalIn(List<BigDecimal> values) {
            addCriterion("hbTotal in", values, "hbtotal");
            return (Criteria) this;
        }

        public Criteria andHbtotalNotIn(List<BigDecimal> values) {
            addCriterion("hbTotal not in", values, "hbtotal");
            return (Criteria) this;
        }

        public Criteria andHbtotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hbTotal between", value1, value2, "hbtotal");
            return (Criteria) this;
        }

        public Criteria andHbtotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hbTotal not between", value1, value2, "hbtotal");
            return (Criteria) this;
        }

        public Criteria andSharingtotalIsNull() {
            addCriterion("sharingTotal is null");
            return (Criteria) this;
        }

        public Criteria andSharingtotalIsNotNull() {
            addCriterion("sharingTotal is not null");
            return (Criteria) this;
        }

        public Criteria andSharingtotalEqualTo(BigDecimal value) {
            addCriterion("sharingTotal =", value, "sharingtotal");
            return (Criteria) this;
        }

        public Criteria andSharingtotalNotEqualTo(BigDecimal value) {
            addCriterion("sharingTotal <>", value, "sharingtotal");
            return (Criteria) this;
        }

        public Criteria andSharingtotalGreaterThan(BigDecimal value) {
            addCriterion("sharingTotal >", value, "sharingtotal");
            return (Criteria) this;
        }

        public Criteria andSharingtotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sharingTotal >=", value, "sharingtotal");
            return (Criteria) this;
        }

        public Criteria andSharingtotalLessThan(BigDecimal value) {
            addCriterion("sharingTotal <", value, "sharingtotal");
            return (Criteria) this;
        }

        public Criteria andSharingtotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sharingTotal <=", value, "sharingtotal");
            return (Criteria) this;
        }

        public Criteria andSharingtotalIn(List<BigDecimal> values) {
            addCriterion("sharingTotal in", values, "sharingtotal");
            return (Criteria) this;
        }

        public Criteria andSharingtotalNotIn(List<BigDecimal> values) {
            addCriterion("sharingTotal not in", values, "sharingtotal");
            return (Criteria) this;
        }

        public Criteria andSharingtotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sharingTotal between", value1, value2, "sharingtotal");
            return (Criteria) this;
        }

        public Criteria andSharingtotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sharingTotal not between", value1, value2, "sharingtotal");
            return (Criteria) this;
        }

        public Criteria andProfittotalIsNull() {
            addCriterion("profitTotal is null");
            return (Criteria) this;
        }

        public Criteria andProfittotalIsNotNull() {
            addCriterion("profitTotal is not null");
            return (Criteria) this;
        }

        public Criteria andProfittotalEqualTo(BigDecimal value) {
            addCriterion("profitTotal =", value, "profittotal");
            return (Criteria) this;
        }

        public Criteria andProfittotalNotEqualTo(BigDecimal value) {
            addCriterion("profitTotal <>", value, "profittotal");
            return (Criteria) this;
        }

        public Criteria andProfittotalGreaterThan(BigDecimal value) {
            addCriterion("profitTotal >", value, "profittotal");
            return (Criteria) this;
        }

        public Criteria andProfittotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("profitTotal >=", value, "profittotal");
            return (Criteria) this;
        }

        public Criteria andProfittotalLessThan(BigDecimal value) {
            addCriterion("profitTotal <", value, "profittotal");
            return (Criteria) this;
        }

        public Criteria andProfittotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("profitTotal <=", value, "profittotal");
            return (Criteria) this;
        }

        public Criteria andProfittotalIn(List<BigDecimal> values) {
            addCriterion("profitTotal in", values, "profittotal");
            return (Criteria) this;
        }

        public Criteria andProfittotalNotIn(List<BigDecimal> values) {
            addCriterion("profitTotal not in", values, "profittotal");
            return (Criteria) this;
        }

        public Criteria andProfittotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profitTotal between", value1, value2, "profittotal");
            return (Criteria) this;
        }

        public Criteria andProfittotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profitTotal not between", value1, value2, "profittotal");
            return (Criteria) this;
        }

        public Criteria andTodayProducttotalIsNull() {
            addCriterion("today_productTotal is null");
            return (Criteria) this;
        }

        public Criteria andTodayProducttotalIsNotNull() {
            addCriterion("today_productTotal is not null");
            return (Criteria) this;
        }

        public Criteria andTodayProducttotalEqualTo(BigDecimal value) {
            addCriterion("today_productTotal =", value, "todayProducttotal");
            return (Criteria) this;
        }

        public Criteria andTodayProducttotalNotEqualTo(BigDecimal value) {
            addCriterion("today_productTotal <>", value, "todayProducttotal");
            return (Criteria) this;
        }

        public Criteria andTodayProducttotalGreaterThan(BigDecimal value) {
            addCriterion("today_productTotal >", value, "todayProducttotal");
            return (Criteria) this;
        }

        public Criteria andTodayProducttotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("today_productTotal >=", value, "todayProducttotal");
            return (Criteria) this;
        }

        public Criteria andTodayProducttotalLessThan(BigDecimal value) {
            addCriterion("today_productTotal <", value, "todayProducttotal");
            return (Criteria) this;
        }

        public Criteria andTodayProducttotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("today_productTotal <=", value, "todayProducttotal");
            return (Criteria) this;
        }

        public Criteria andTodayProducttotalIn(List<BigDecimal> values) {
            addCriterion("today_productTotal in", values, "todayProducttotal");
            return (Criteria) this;
        }

        public Criteria andTodayProducttotalNotIn(List<BigDecimal> values) {
            addCriterion("today_productTotal not in", values, "todayProducttotal");
            return (Criteria) this;
        }

        public Criteria andTodayProducttotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("today_productTotal between", value1, value2, "todayProducttotal");
            return (Criteria) this;
        }

        public Criteria andTodayProducttotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("today_productTotal not between", value1, value2, "todayProducttotal");
            return (Criteria) this;
        }

        public Criteria andTodayExperiencetotalIsNull() {
            addCriterion("today_experienceTotal is null");
            return (Criteria) this;
        }

        public Criteria andTodayExperiencetotalIsNotNull() {
            addCriterion("today_experienceTotal is not null");
            return (Criteria) this;
        }

        public Criteria andTodayExperiencetotalEqualTo(BigDecimal value) {
            addCriterion("today_experienceTotal =", value, "todayExperiencetotal");
            return (Criteria) this;
        }

        public Criteria andTodayExperiencetotalNotEqualTo(BigDecimal value) {
            addCriterion("today_experienceTotal <>", value, "todayExperiencetotal");
            return (Criteria) this;
        }

        public Criteria andTodayExperiencetotalGreaterThan(BigDecimal value) {
            addCriterion("today_experienceTotal >", value, "todayExperiencetotal");
            return (Criteria) this;
        }

        public Criteria andTodayExperiencetotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("today_experienceTotal >=", value, "todayExperiencetotal");
            return (Criteria) this;
        }

        public Criteria andTodayExperiencetotalLessThan(BigDecimal value) {
            addCriterion("today_experienceTotal <", value, "todayExperiencetotal");
            return (Criteria) this;
        }

        public Criteria andTodayExperiencetotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("today_experienceTotal <=", value, "todayExperiencetotal");
            return (Criteria) this;
        }

        public Criteria andTodayExperiencetotalIn(List<BigDecimal> values) {
            addCriterion("today_experienceTotal in", values, "todayExperiencetotal");
            return (Criteria) this;
        }

        public Criteria andTodayExperiencetotalNotIn(List<BigDecimal> values) {
            addCriterion("today_experienceTotal not in", values, "todayExperiencetotal");
            return (Criteria) this;
        }

        public Criteria andTodayExperiencetotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("today_experienceTotal between", value1, value2, "todayExperiencetotal");
            return (Criteria) this;
        }

        public Criteria andTodayExperiencetotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("today_experienceTotal not between", value1, value2, "todayExperiencetotal");
            return (Criteria) this;
        }

        public Criteria andTodayRaisetotalIsNull() {
            addCriterion("today_raiseTotal is null");
            return (Criteria) this;
        }

        public Criteria andTodayRaisetotalIsNotNull() {
            addCriterion("today_raiseTotal is not null");
            return (Criteria) this;
        }

        public Criteria andTodayRaisetotalEqualTo(BigDecimal value) {
            addCriterion("today_raiseTotal =", value, "todayRaisetotal");
            return (Criteria) this;
        }

        public Criteria andTodayRaisetotalNotEqualTo(BigDecimal value) {
            addCriterion("today_raiseTotal <>", value, "todayRaisetotal");
            return (Criteria) this;
        }

        public Criteria andTodayRaisetotalGreaterThan(BigDecimal value) {
            addCriterion("today_raiseTotal >", value, "todayRaisetotal");
            return (Criteria) this;
        }

        public Criteria andTodayRaisetotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("today_raiseTotal >=", value, "todayRaisetotal");
            return (Criteria) this;
        }

        public Criteria andTodayRaisetotalLessThan(BigDecimal value) {
            addCriterion("today_raiseTotal <", value, "todayRaisetotal");
            return (Criteria) this;
        }

        public Criteria andTodayRaisetotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("today_raiseTotal <=", value, "todayRaisetotal");
            return (Criteria) this;
        }

        public Criteria andTodayRaisetotalIn(List<BigDecimal> values) {
            addCriterion("today_raiseTotal in", values, "todayRaisetotal");
            return (Criteria) this;
        }

        public Criteria andTodayRaisetotalNotIn(List<BigDecimal> values) {
            addCriterion("today_raiseTotal not in", values, "todayRaisetotal");
            return (Criteria) this;
        }

        public Criteria andTodayRaisetotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("today_raiseTotal between", value1, value2, "todayRaisetotal");
            return (Criteria) this;
        }

        public Criteria andTodayRaisetotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("today_raiseTotal not between", value1, value2, "todayRaisetotal");
            return (Criteria) this;
        }

        public Criteria andTodayHbtotalIsNull() {
            addCriterion("today_hbTotal is null");
            return (Criteria) this;
        }

        public Criteria andTodayHbtotalIsNotNull() {
            addCriterion("today_hbTotal is not null");
            return (Criteria) this;
        }

        public Criteria andTodayHbtotalEqualTo(BigDecimal value) {
            addCriterion("today_hbTotal =", value, "todayHbtotal");
            return (Criteria) this;
        }

        public Criteria andTodayHbtotalNotEqualTo(BigDecimal value) {
            addCriterion("today_hbTotal <>", value, "todayHbtotal");
            return (Criteria) this;
        }

        public Criteria andTodayHbtotalGreaterThan(BigDecimal value) {
            addCriterion("today_hbTotal >", value, "todayHbtotal");
            return (Criteria) this;
        }

        public Criteria andTodayHbtotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("today_hbTotal >=", value, "todayHbtotal");
            return (Criteria) this;
        }

        public Criteria andTodayHbtotalLessThan(BigDecimal value) {
            addCriterion("today_hbTotal <", value, "todayHbtotal");
            return (Criteria) this;
        }

        public Criteria andTodayHbtotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("today_hbTotal <=", value, "todayHbtotal");
            return (Criteria) this;
        }

        public Criteria andTodayHbtotalIn(List<BigDecimal> values) {
            addCriterion("today_hbTotal in", values, "todayHbtotal");
            return (Criteria) this;
        }

        public Criteria andTodayHbtotalNotIn(List<BigDecimal> values) {
            addCriterion("today_hbTotal not in", values, "todayHbtotal");
            return (Criteria) this;
        }

        public Criteria andTodayHbtotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("today_hbTotal between", value1, value2, "todayHbtotal");
            return (Criteria) this;
        }

        public Criteria andTodayHbtotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("today_hbTotal not between", value1, value2, "todayHbtotal");
            return (Criteria) this;
        }

        public Criteria andTodaySharingtotalIsNull() {
            addCriterion("today_sharingTotal is null");
            return (Criteria) this;
        }

        public Criteria andTodaySharingtotalIsNotNull() {
            addCriterion("today_sharingTotal is not null");
            return (Criteria) this;
        }

        public Criteria andTodaySharingtotalEqualTo(BigDecimal value) {
            addCriterion("today_sharingTotal =", value, "todaySharingtotal");
            return (Criteria) this;
        }

        public Criteria andTodaySharingtotalNotEqualTo(BigDecimal value) {
            addCriterion("today_sharingTotal <>", value, "todaySharingtotal");
            return (Criteria) this;
        }

        public Criteria andTodaySharingtotalGreaterThan(BigDecimal value) {
            addCriterion("today_sharingTotal >", value, "todaySharingtotal");
            return (Criteria) this;
        }

        public Criteria andTodaySharingtotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("today_sharingTotal >=", value, "todaySharingtotal");
            return (Criteria) this;
        }

        public Criteria andTodaySharingtotalLessThan(BigDecimal value) {
            addCriterion("today_sharingTotal <", value, "todaySharingtotal");
            return (Criteria) this;
        }

        public Criteria andTodaySharingtotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("today_sharingTotal <=", value, "todaySharingtotal");
            return (Criteria) this;
        }

        public Criteria andTodaySharingtotalIn(List<BigDecimal> values) {
            addCriterion("today_sharingTotal in", values, "todaySharingtotal");
            return (Criteria) this;
        }

        public Criteria andTodaySharingtotalNotIn(List<BigDecimal> values) {
            addCriterion("today_sharingTotal not in", values, "todaySharingtotal");
            return (Criteria) this;
        }

        public Criteria andTodaySharingtotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("today_sharingTotal between", value1, value2, "todaySharingtotal");
            return (Criteria) this;
        }

        public Criteria andTodaySharingtotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("today_sharingTotal not between", value1, value2, "todaySharingtotal");
            return (Criteria) this;
        }

        public Criteria andTotayProfittotalIsNull() {
            addCriterion("totay_profitTotal is null");
            return (Criteria) this;
        }

        public Criteria andTotayProfittotalIsNotNull() {
            addCriterion("totay_profitTotal is not null");
            return (Criteria) this;
        }

        public Criteria andTotayProfittotalEqualTo(BigDecimal value) {
            addCriterion("totay_profitTotal =", value, "totayProfittotal");
            return (Criteria) this;
        }

        public Criteria andTotayProfittotalNotEqualTo(BigDecimal value) {
            addCriterion("totay_profitTotal <>", value, "totayProfittotal");
            return (Criteria) this;
        }

        public Criteria andTotayProfittotalGreaterThan(BigDecimal value) {
            addCriterion("totay_profitTotal >", value, "totayProfittotal");
            return (Criteria) this;
        }

        public Criteria andTotayProfittotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("totay_profitTotal >=", value, "totayProfittotal");
            return (Criteria) this;
        }

        public Criteria andTotayProfittotalLessThan(BigDecimal value) {
            addCriterion("totay_profitTotal <", value, "totayProfittotal");
            return (Criteria) this;
        }

        public Criteria andTotayProfittotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("totay_profitTotal <=", value, "totayProfittotal");
            return (Criteria) this;
        }

        public Criteria andTotayProfittotalIn(List<BigDecimal> values) {
            addCriterion("totay_profitTotal in", values, "totayProfittotal");
            return (Criteria) this;
        }

        public Criteria andTotayProfittotalNotIn(List<BigDecimal> values) {
            addCriterion("totay_profitTotal not in", values, "totayProfittotal");
            return (Criteria) this;
        }

        public Criteria andTotayProfittotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totay_profitTotal between", value1, value2, "totayProfittotal");
            return (Criteria) this;
        }

        public Criteria andTotayProfittotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totay_profitTotal not between", value1, value2, "totayProfittotal");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeIsNull() {
            addCriterion("lastupdateTime is null");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeIsNotNull() {
            addCriterion("lastupdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeEqualTo(Date value) {
            addCriterion("lastupdateTime =", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeNotEqualTo(Date value) {
            addCriterion("lastupdateTime <>", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeGreaterThan(Date value) {
            addCriterion("lastupdateTime >", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastupdateTime >=", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeLessThan(Date value) {
            addCriterion("lastupdateTime <", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("lastupdateTime <=", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeIn(List<Date> values) {
            addCriterion("lastupdateTime in", values, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeNotIn(List<Date> values) {
            addCriterion("lastupdateTime not in", values, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeBetween(Date value1, Date value2) {
            addCriterion("lastupdateTime between", value1, value2, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("lastupdateTime not between", value1, value2, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andShareAwardstotalIsNull() {
            addCriterion("share_awardsTotal is null");
            return (Criteria) this;
        }

        public Criteria andShareAwardstotalIsNotNull() {
            addCriterion("share_awardsTotal is not null");
            return (Criteria) this;
        }

        public Criteria andShareAwardstotalEqualTo(BigDecimal value) {
            addCriterion("share_awardsTotal =", value, "shareAwardstotal");
            return (Criteria) this;
        }

        public Criteria andShareAwardstotalNotEqualTo(BigDecimal value) {
            addCriterion("share_awardsTotal <>", value, "shareAwardstotal");
            return (Criteria) this;
        }

        public Criteria andShareAwardstotalGreaterThan(BigDecimal value) {
            addCriterion("share_awardsTotal >", value, "shareAwardstotal");
            return (Criteria) this;
        }

        public Criteria andShareAwardstotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("share_awardsTotal >=", value, "shareAwardstotal");
            return (Criteria) this;
        }

        public Criteria andShareAwardstotalLessThan(BigDecimal value) {
            addCriterion("share_awardsTotal <", value, "shareAwardstotal");
            return (Criteria) this;
        }

        public Criteria andShareAwardstotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("share_awardsTotal <=", value, "shareAwardstotal");
            return (Criteria) this;
        }

        public Criteria andShareAwardstotalIn(List<BigDecimal> values) {
            addCriterion("share_awardsTotal in", values, "shareAwardstotal");
            return (Criteria) this;
        }

        public Criteria andShareAwardstotalNotIn(List<BigDecimal> values) {
            addCriterion("share_awardsTotal not in", values, "shareAwardstotal");
            return (Criteria) this;
        }

        public Criteria andShareAwardstotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("share_awardsTotal between", value1, value2, "shareAwardstotal");
            return (Criteria) this;
        }

        public Criteria andShareAwardstotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("share_awardsTotal not between", value1, value2, "shareAwardstotal");
            return (Criteria) this;
        }

        public Criteria andTodayShareAwardstotalIsNull() {
            addCriterion("today_share_awardsTotal is null");
            return (Criteria) this;
        }

        public Criteria andTodayShareAwardstotalIsNotNull() {
            addCriterion("today_share_awardsTotal is not null");
            return (Criteria) this;
        }

        public Criteria andTodayShareAwardstotalEqualTo(BigDecimal value) {
            addCriterion("today_share_awardsTotal =", value, "todayShareAwardstotal");
            return (Criteria) this;
        }

        public Criteria andTodayShareAwardstotalNotEqualTo(BigDecimal value) {
            addCriterion("today_share_awardsTotal <>", value, "todayShareAwardstotal");
            return (Criteria) this;
        }

        public Criteria andTodayShareAwardstotalGreaterThan(BigDecimal value) {
            addCriterion("today_share_awardsTotal >", value, "todayShareAwardstotal");
            return (Criteria) this;
        }

        public Criteria andTodayShareAwardstotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("today_share_awardsTotal >=", value, "todayShareAwardstotal");
            return (Criteria) this;
        }

        public Criteria andTodayShareAwardstotalLessThan(BigDecimal value) {
            addCriterion("today_share_awardsTotal <", value, "todayShareAwardstotal");
            return (Criteria) this;
        }

        public Criteria andTodayShareAwardstotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("today_share_awardsTotal <=", value, "todayShareAwardstotal");
            return (Criteria) this;
        }

        public Criteria andTodayShareAwardstotalIn(List<BigDecimal> values) {
            addCriterion("today_share_awardsTotal in", values, "todayShareAwardstotal");
            return (Criteria) this;
        }

        public Criteria andTodayShareAwardstotalNotIn(List<BigDecimal> values) {
            addCriterion("today_share_awardsTotal not in", values, "todayShareAwardstotal");
            return (Criteria) this;
        }

        public Criteria andTodayShareAwardstotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("today_share_awardsTotal between", value1, value2, "todayShareAwardstotal");
            return (Criteria) this;
        }

        public Criteria andTodayShareAwardstotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("today_share_awardsTotal not between", value1, value2, "todayShareAwardstotal");
            return (Criteria) this;
        }

        public Criteria andRedtotalIsNull() {
            addCriterion("redTotal is null");
            return (Criteria) this;
        }

        public Criteria andRedtotalIsNotNull() {
            addCriterion("redTotal is not null");
            return (Criteria) this;
        }

        public Criteria andRedtotalEqualTo(BigDecimal value) {
            addCriterion("redTotal =", value, "redtotal");
            return (Criteria) this;
        }

        public Criteria andRedtotalNotEqualTo(BigDecimal value) {
            addCriterion("redTotal <>", value, "redtotal");
            return (Criteria) this;
        }

        public Criteria andRedtotalGreaterThan(BigDecimal value) {
            addCriterion("redTotal >", value, "redtotal");
            return (Criteria) this;
        }

        public Criteria andRedtotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("redTotal >=", value, "redtotal");
            return (Criteria) this;
        }

        public Criteria andRedtotalLessThan(BigDecimal value) {
            addCriterion("redTotal <", value, "redtotal");
            return (Criteria) this;
        }

        public Criteria andRedtotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("redTotal <=", value, "redtotal");
            return (Criteria) this;
        }

        public Criteria andRedtotalIn(List<BigDecimal> values) {
            addCriterion("redTotal in", values, "redtotal");
            return (Criteria) this;
        }

        public Criteria andRedtotalNotIn(List<BigDecimal> values) {
            addCriterion("redTotal not in", values, "redtotal");
            return (Criteria) this;
        }

        public Criteria andRedtotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("redTotal between", value1, value2, "redtotal");
            return (Criteria) this;
        }

        public Criteria andRedtotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("redTotal not between", value1, value2, "redtotal");
            return (Criteria) this;
        }

        public Criteria andTodayRedtotalIsNull() {
            addCriterion("today_redTotal is null");
            return (Criteria) this;
        }

        public Criteria andTodayRedtotalIsNotNull() {
            addCriterion("today_redTotal is not null");
            return (Criteria) this;
        }

        public Criteria andTodayRedtotalEqualTo(BigDecimal value) {
            addCriterion("today_redTotal =", value, "todayRedtotal");
            return (Criteria) this;
        }

        public Criteria andTodayRedtotalNotEqualTo(BigDecimal value) {
            addCriterion("today_redTotal <>", value, "todayRedtotal");
            return (Criteria) this;
        }

        public Criteria andTodayRedtotalGreaterThan(BigDecimal value) {
            addCriterion("today_redTotal >", value, "todayRedtotal");
            return (Criteria) this;
        }

        public Criteria andTodayRedtotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("today_redTotal >=", value, "todayRedtotal");
            return (Criteria) this;
        }

        public Criteria andTodayRedtotalLessThan(BigDecimal value) {
            addCriterion("today_redTotal <", value, "todayRedtotal");
            return (Criteria) this;
        }

        public Criteria andTodayRedtotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("today_redTotal <=", value, "todayRedtotal");
            return (Criteria) this;
        }

        public Criteria andTodayRedtotalIn(List<BigDecimal> values) {
            addCriterion("today_redTotal in", values, "todayRedtotal");
            return (Criteria) this;
        }

        public Criteria andTodayRedtotalNotIn(List<BigDecimal> values) {
            addCriterion("today_redTotal not in", values, "todayRedtotal");
            return (Criteria) this;
        }

        public Criteria andTodayRedtotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("today_redTotal between", value1, value2, "todayRedtotal");
            return (Criteria) this;
        }

        public Criteria andTodayRedtotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("today_redTotal not between", value1, value2, "todayRedtotal");
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
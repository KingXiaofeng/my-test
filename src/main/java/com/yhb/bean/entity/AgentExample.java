package com.yhb.bean.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AgentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AgentExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("UserID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("UserID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("UserID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("UserID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("UserID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("UserID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("UserID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("UserID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("UserID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("UserID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("UserID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("UserID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("UserID not between", value1, value2, "userid");
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

        public Criteria andParentidIsNull() {
            addCriterion("ParentID is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("ParentID is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(String value) {
            addCriterion("ParentID =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(String value) {
            addCriterion("ParentID <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(String value) {
            addCriterion("ParentID >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(String value) {
            addCriterion("ParentID >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(String value) {
            addCriterion("ParentID <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(String value) {
            addCriterion("ParentID <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLike(String value) {
            addCriterion("ParentID like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotLike(String value) {
            addCriterion("ParentID not like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<String> values) {
            addCriterion("ParentID in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<String> values) {
            addCriterion("ParentID not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(String value1, String value2) {
            addCriterion("ParentID between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(String value1, String value2) {
            addCriterion("ParentID not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andCardidIsNull() {
            addCriterion("CardID is null");
            return (Criteria) this;
        }

        public Criteria andCardidIsNotNull() {
            addCriterion("CardID is not null");
            return (Criteria) this;
        }

        public Criteria andCardidEqualTo(String value) {
            addCriterion("CardID =", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotEqualTo(String value) {
            addCriterion("CardID <>", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidGreaterThan(String value) {
            addCriterion("CardID >", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidGreaterThanOrEqualTo(String value) {
            addCriterion("CardID >=", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidLessThan(String value) {
            addCriterion("CardID <", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidLessThanOrEqualTo(String value) {
            addCriterion("CardID <=", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidLike(String value) {
            addCriterion("CardID like", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotLike(String value) {
            addCriterion("CardID not like", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidIn(List<String> values) {
            addCriterion("CardID in", values, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotIn(List<String> values) {
            addCriterion("CardID not in", values, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidBetween(String value1, String value2) {
            addCriterion("CardID between", value1, value2, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotBetween(String value1, String value2) {
            addCriterion("CardID not between", value1, value2, "cardid");
            return (Criteria) this;
        }

        public Criteria andActivityIsNull() {
            addCriterion("Activity is null");
            return (Criteria) this;
        }

        public Criteria andActivityIsNotNull() {
            addCriterion("Activity is not null");
            return (Criteria) this;
        }

        public Criteria andActivityEqualTo(Integer value) {
            addCriterion("Activity =", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotEqualTo(Integer value) {
            addCriterion("Activity <>", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityGreaterThan(Integer value) {
            addCriterion("Activity >", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityGreaterThanOrEqualTo(Integer value) {
            addCriterion("Activity >=", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityLessThan(Integer value) {
            addCriterion("Activity <", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityLessThanOrEqualTo(Integer value) {
            addCriterion("Activity <=", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityIn(List<Integer> values) {
            addCriterion("Activity in", values, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotIn(List<Integer> values) {
            addCriterion("Activity not in", values, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityBetween(Integer value1, Integer value2) {
            addCriterion("Activity between", value1, value2, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotBetween(Integer value1, Integer value2) {
            addCriterion("Activity not between", value1, value2, "activity");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("Password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("Password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("Password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("Password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("Password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("Password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("Password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("Password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("Password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("Password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("Password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("Password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("Password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUserstateIsNull() {
            addCriterion("UserState is null");
            return (Criteria) this;
        }

        public Criteria andUserstateIsNotNull() {
            addCriterion("UserState is not null");
            return (Criteria) this;
        }

        public Criteria andUserstateEqualTo(Integer value) {
            addCriterion("UserState =", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotEqualTo(Integer value) {
            addCriterion("UserState <>", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateGreaterThan(Integer value) {
            addCriterion("UserState >", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserState >=", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateLessThan(Integer value) {
            addCriterion("UserState <", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateLessThanOrEqualTo(Integer value) {
            addCriterion("UserState <=", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateIn(List<Integer> values) {
            addCriterion("UserState in", values, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotIn(List<Integer> values) {
            addCriterion("UserState not in", values, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateBetween(Integer value1, Integer value2) {
            addCriterion("UserState between", value1, value2, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotBetween(Integer value1, Integer value2) {
            addCriterion("UserState not between", value1, value2, "userstate");
            return (Criteria) this;
        }

        public Criteria andLosttimeIsNull() {
            addCriterion("LostTime is null");
            return (Criteria) this;
        }

        public Criteria andLosttimeIsNotNull() {
            addCriterion("LostTime is not null");
            return (Criteria) this;
        }

        public Criteria andLosttimeEqualTo(Date value) {
            addCriterion("LostTime =", value, "losttime");
            return (Criteria) this;
        }

        public Criteria andLosttimeNotEqualTo(Date value) {
            addCriterion("LostTime <>", value, "losttime");
            return (Criteria) this;
        }

        public Criteria andLosttimeGreaterThan(Date value) {
            addCriterion("LostTime >", value, "losttime");
            return (Criteria) this;
        }

        public Criteria andLosttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LostTime >=", value, "losttime");
            return (Criteria) this;
        }

        public Criteria andLosttimeLessThan(Date value) {
            addCriterion("LostTime <", value, "losttime");
            return (Criteria) this;
        }

        public Criteria andLosttimeLessThanOrEqualTo(Date value) {
            addCriterion("LostTime <=", value, "losttime");
            return (Criteria) this;
        }

        public Criteria andLosttimeIn(List<Date> values) {
            addCriterion("LostTime in", values, "losttime");
            return (Criteria) this;
        }

        public Criteria andLosttimeNotIn(List<Date> values) {
            addCriterion("LostTime not in", values, "losttime");
            return (Criteria) this;
        }

        public Criteria andLosttimeBetween(Date value1, Date value2) {
            addCriterion("LostTime between", value1, value2, "losttime");
            return (Criteria) this;
        }

        public Criteria andLosttimeNotBetween(Date value1, Date value2) {
            addCriterion("LostTime not between", value1, value2, "losttime");
            return (Criteria) this;
        }

        public Criteria andCityidIsNull() {
            addCriterion("CityID is null");
            return (Criteria) this;
        }

        public Criteria andCityidIsNotNull() {
            addCriterion("CityID is not null");
            return (Criteria) this;
        }

        public Criteria andCityidEqualTo(Integer value) {
            addCriterion("CityID =", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotEqualTo(Integer value) {
            addCriterion("CityID <>", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThan(Integer value) {
            addCriterion("CityID >", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CityID >=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThan(Integer value) {
            addCriterion("CityID <", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThanOrEqualTo(Integer value) {
            addCriterion("CityID <=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidIn(List<Integer> values) {
            addCriterion("CityID in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotIn(List<Integer> values) {
            addCriterion("CityID not in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidBetween(Integer value1, Integer value2) {
            addCriterion("CityID between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotBetween(Integer value1, Integer value2) {
            addCriterion("CityID not between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andLvlidIsNull() {
            addCriterion("LvlID is null");
            return (Criteria) this;
        }

        public Criteria andLvlidIsNotNull() {
            addCriterion("LvlID is not null");
            return (Criteria) this;
        }

        public Criteria andLvlidEqualTo(Integer value) {
            addCriterion("LvlID =", value, "lvlid");
            return (Criteria) this;
        }

        public Criteria andLvlidNotEqualTo(Integer value) {
            addCriterion("LvlID <>", value, "lvlid");
            return (Criteria) this;
        }

        public Criteria andLvlidGreaterThan(Integer value) {
            addCriterion("LvlID >", value, "lvlid");
            return (Criteria) this;
        }

        public Criteria andLvlidGreaterThanOrEqualTo(Integer value) {
            addCriterion("LvlID >=", value, "lvlid");
            return (Criteria) this;
        }

        public Criteria andLvlidLessThan(Integer value) {
            addCriterion("LvlID <", value, "lvlid");
            return (Criteria) this;
        }

        public Criteria andLvlidLessThanOrEqualTo(Integer value) {
            addCriterion("LvlID <=", value, "lvlid");
            return (Criteria) this;
        }

        public Criteria andLvlidIn(List<Integer> values) {
            addCriterion("LvlID in", values, "lvlid");
            return (Criteria) this;
        }

        public Criteria andLvlidNotIn(List<Integer> values) {
            addCriterion("LvlID not in", values, "lvlid");
            return (Criteria) this;
        }

        public Criteria andLvlidBetween(Integer value1, Integer value2) {
            addCriterion("LvlID between", value1, value2, "lvlid");
            return (Criteria) this;
        }

        public Criteria andLvlidNotBetween(Integer value1, Integer value2) {
            addCriterion("LvlID not between", value1, value2, "lvlid");
            return (Criteria) this;
        }

        public Criteria andCommissionBalanceIsNull() {
            addCriterion("Commission_Balance is null");
            return (Criteria) this;
        }

        public Criteria andCommissionBalanceIsNotNull() {
            addCriterion("Commission_Balance is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionBalanceEqualTo(BigDecimal value) {
            addCriterion("Commission_Balance =", value, "commissionBalance");
            return (Criteria) this;
        }

        public Criteria andCommissionBalanceNotEqualTo(BigDecimal value) {
            addCriterion("Commission_Balance <>", value, "commissionBalance");
            return (Criteria) this;
        }

        public Criteria andCommissionBalanceGreaterThan(BigDecimal value) {
            addCriterion("Commission_Balance >", value, "commissionBalance");
            return (Criteria) this;
        }

        public Criteria andCommissionBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Commission_Balance >=", value, "commissionBalance");
            return (Criteria) this;
        }

        public Criteria andCommissionBalanceLessThan(BigDecimal value) {
            addCriterion("Commission_Balance <", value, "commissionBalance");
            return (Criteria) this;
        }

        public Criteria andCommissionBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Commission_Balance <=", value, "commissionBalance");
            return (Criteria) this;
        }

        public Criteria andCommissionBalanceIn(List<BigDecimal> values) {
            addCriterion("Commission_Balance in", values, "commissionBalance");
            return (Criteria) this;
        }

        public Criteria andCommissionBalanceNotIn(List<BigDecimal> values) {
            addCriterion("Commission_Balance not in", values, "commissionBalance");
            return (Criteria) this;
        }

        public Criteria andCommissionBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Commission_Balance between", value1, value2, "commissionBalance");
            return (Criteria) this;
        }

        public Criteria andCommissionBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Commission_Balance not between", value1, value2, "commissionBalance");
            return (Criteria) this;
        }

        public Criteria andNotreceivedcommissionIsNull() {
            addCriterion("NotReceivedCommission is null");
            return (Criteria) this;
        }

        public Criteria andNotreceivedcommissionIsNotNull() {
            addCriterion("NotReceivedCommission is not null");
            return (Criteria) this;
        }

        public Criteria andNotreceivedcommissionEqualTo(BigDecimal value) {
            addCriterion("NotReceivedCommission =", value, "notreceivedcommission");
            return (Criteria) this;
        }

        public Criteria andNotreceivedcommissionNotEqualTo(BigDecimal value) {
            addCriterion("NotReceivedCommission <>", value, "notreceivedcommission");
            return (Criteria) this;
        }

        public Criteria andNotreceivedcommissionGreaterThan(BigDecimal value) {
            addCriterion("NotReceivedCommission >", value, "notreceivedcommission");
            return (Criteria) this;
        }

        public Criteria andNotreceivedcommissionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NotReceivedCommission >=", value, "notreceivedcommission");
            return (Criteria) this;
        }

        public Criteria andNotreceivedcommissionLessThan(BigDecimal value) {
            addCriterion("NotReceivedCommission <", value, "notreceivedcommission");
            return (Criteria) this;
        }

        public Criteria andNotreceivedcommissionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NotReceivedCommission <=", value, "notreceivedcommission");
            return (Criteria) this;
        }

        public Criteria andNotreceivedcommissionIn(List<BigDecimal> values) {
            addCriterion("NotReceivedCommission in", values, "notreceivedcommission");
            return (Criteria) this;
        }

        public Criteria andNotreceivedcommissionNotIn(List<BigDecimal> values) {
            addCriterion("NotReceivedCommission not in", values, "notreceivedcommission");
            return (Criteria) this;
        }

        public Criteria andNotreceivedcommissionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NotReceivedCommission between", value1, value2, "notreceivedcommission");
            return (Criteria) this;
        }

        public Criteria andNotreceivedcommissionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NotReceivedCommission not between", value1, value2, "notreceivedcommission");
            return (Criteria) this;
        }

        public Criteria andReceivedcommissionIsNull() {
            addCriterion("ReceivedCommission is null");
            return (Criteria) this;
        }

        public Criteria andReceivedcommissionIsNotNull() {
            addCriterion("ReceivedCommission is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedcommissionEqualTo(BigDecimal value) {
            addCriterion("ReceivedCommission =", value, "receivedcommission");
            return (Criteria) this;
        }

        public Criteria andReceivedcommissionNotEqualTo(BigDecimal value) {
            addCriterion("ReceivedCommission <>", value, "receivedcommission");
            return (Criteria) this;
        }

        public Criteria andReceivedcommissionGreaterThan(BigDecimal value) {
            addCriterion("ReceivedCommission >", value, "receivedcommission");
            return (Criteria) this;
        }

        public Criteria andReceivedcommissionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ReceivedCommission >=", value, "receivedcommission");
            return (Criteria) this;
        }

        public Criteria andReceivedcommissionLessThan(BigDecimal value) {
            addCriterion("ReceivedCommission <", value, "receivedcommission");
            return (Criteria) this;
        }

        public Criteria andReceivedcommissionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ReceivedCommission <=", value, "receivedcommission");
            return (Criteria) this;
        }

        public Criteria andReceivedcommissionIn(List<BigDecimal> values) {
            addCriterion("ReceivedCommission in", values, "receivedcommission");
            return (Criteria) this;
        }

        public Criteria andReceivedcommissionNotIn(List<BigDecimal> values) {
            addCriterion("ReceivedCommission not in", values, "receivedcommission");
            return (Criteria) this;
        }

        public Criteria andReceivedcommissionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ReceivedCommission between", value1, value2, "receivedcommission");
            return (Criteria) this;
        }

        public Criteria andReceivedcommissionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ReceivedCommission not between", value1, value2, "receivedcommission");
            return (Criteria) this;
        }

        public Criteria andSignshareIsNull() {
            addCriterion("signShare is null");
            return (Criteria) this;
        }

        public Criteria andSignshareIsNotNull() {
            addCriterion("signShare is not null");
            return (Criteria) this;
        }

        public Criteria andSignshareEqualTo(BigDecimal value) {
            addCriterion("signShare =", value, "signshare");
            return (Criteria) this;
        }

        public Criteria andSignshareNotEqualTo(BigDecimal value) {
            addCriterion("signShare <>", value, "signshare");
            return (Criteria) this;
        }

        public Criteria andSignshareGreaterThan(BigDecimal value) {
            addCriterion("signShare >", value, "signshare");
            return (Criteria) this;
        }

        public Criteria andSignshareGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("signShare >=", value, "signshare");
            return (Criteria) this;
        }

        public Criteria andSignshareLessThan(BigDecimal value) {
            addCriterion("signShare <", value, "signshare");
            return (Criteria) this;
        }

        public Criteria andSignshareLessThanOrEqualTo(BigDecimal value) {
            addCriterion("signShare <=", value, "signshare");
            return (Criteria) this;
        }

        public Criteria andSignshareIn(List<BigDecimal> values) {
            addCriterion("signShare in", values, "signshare");
            return (Criteria) this;
        }

        public Criteria andSignshareNotIn(List<BigDecimal> values) {
            addCriterion("signShare not in", values, "signshare");
            return (Criteria) this;
        }

        public Criteria andSignshareBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("signShare between", value1, value2, "signshare");
            return (Criteria) this;
        }

        public Criteria andSignshareNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("signShare not between", value1, value2, "signshare");
            return (Criteria) this;
        }

        public Criteria andSignstateIsNull() {
            addCriterion("signState is null");
            return (Criteria) this;
        }

        public Criteria andSignstateIsNotNull() {
            addCriterion("signState is not null");
            return (Criteria) this;
        }

        public Criteria andSignstateEqualTo(Integer value) {
            addCriterion("signState =", value, "signstate");
            return (Criteria) this;
        }

        public Criteria andSignstateNotEqualTo(Integer value) {
            addCriterion("signState <>", value, "signstate");
            return (Criteria) this;
        }

        public Criteria andSignstateGreaterThan(Integer value) {
            addCriterion("signState >", value, "signstate");
            return (Criteria) this;
        }

        public Criteria andSignstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("signState >=", value, "signstate");
            return (Criteria) this;
        }

        public Criteria andSignstateLessThan(Integer value) {
            addCriterion("signState <", value, "signstate");
            return (Criteria) this;
        }

        public Criteria andSignstateLessThanOrEqualTo(Integer value) {
            addCriterion("signState <=", value, "signstate");
            return (Criteria) this;
        }

        public Criteria andSignstateIn(List<Integer> values) {
            addCriterion("signState in", values, "signstate");
            return (Criteria) this;
        }

        public Criteria andSignstateNotIn(List<Integer> values) {
            addCriterion("signState not in", values, "signstate");
            return (Criteria) this;
        }

        public Criteria andSignstateBetween(Integer value1, Integer value2) {
            addCriterion("signState between", value1, value2, "signstate");
            return (Criteria) this;
        }

        public Criteria andSignstateNotBetween(Integer value1, Integer value2) {
            addCriterion("signState not between", value1, value2, "signstate");
            return (Criteria) this;
        }

        public Criteria andWinxinimgIsNull() {
            addCriterion("winxinImg is null");
            return (Criteria) this;
        }

        public Criteria andWinxinimgIsNotNull() {
            addCriterion("winxinImg is not null");
            return (Criteria) this;
        }

        public Criteria andWinxinimgEqualTo(String value) {
            addCriterion("winxinImg =", value, "winxinimg");
            return (Criteria) this;
        }

        public Criteria andWinxinimgNotEqualTo(String value) {
            addCriterion("winxinImg <>", value, "winxinimg");
            return (Criteria) this;
        }

        public Criteria andWinxinimgGreaterThan(String value) {
            addCriterion("winxinImg >", value, "winxinimg");
            return (Criteria) this;
        }

        public Criteria andWinxinimgGreaterThanOrEqualTo(String value) {
            addCriterion("winxinImg >=", value, "winxinimg");
            return (Criteria) this;
        }

        public Criteria andWinxinimgLessThan(String value) {
            addCriterion("winxinImg <", value, "winxinimg");
            return (Criteria) this;
        }

        public Criteria andWinxinimgLessThanOrEqualTo(String value) {
            addCriterion("winxinImg <=", value, "winxinimg");
            return (Criteria) this;
        }

        public Criteria andWinxinimgLike(String value) {
            addCriterion("winxinImg like", value, "winxinimg");
            return (Criteria) this;
        }

        public Criteria andWinxinimgNotLike(String value) {
            addCriterion("winxinImg not like", value, "winxinimg");
            return (Criteria) this;
        }

        public Criteria andWinxinimgIn(List<String> values) {
            addCriterion("winxinImg in", values, "winxinimg");
            return (Criteria) this;
        }

        public Criteria andWinxinimgNotIn(List<String> values) {
            addCriterion("winxinImg not in", values, "winxinimg");
            return (Criteria) this;
        }

        public Criteria andWinxinimgBetween(String value1, String value2) {
            addCriterion("winxinImg between", value1, value2, "winxinimg");
            return (Criteria) this;
        }

        public Criteria andWinxinimgNotBetween(String value1, String value2) {
            addCriterion("winxinImg not between", value1, value2, "winxinimg");
            return (Criteria) this;
        }

        public Criteria andEmk1IsNull() {
            addCriterion("emk1 is null");
            return (Criteria) this;
        }

        public Criteria andEmk1IsNotNull() {
            addCriterion("emk1 is not null");
            return (Criteria) this;
        }

        public Criteria andEmk1EqualTo(String value) {
            addCriterion("emk1 =", value, "emk1");
            return (Criteria) this;
        }

        public Criteria andEmk1NotEqualTo(String value) {
            addCriterion("emk1 <>", value, "emk1");
            return (Criteria) this;
        }

        public Criteria andEmk1GreaterThan(String value) {
            addCriterion("emk1 >", value, "emk1");
            return (Criteria) this;
        }

        public Criteria andEmk1GreaterThanOrEqualTo(String value) {
            addCriterion("emk1 >=", value, "emk1");
            return (Criteria) this;
        }

        public Criteria andEmk1LessThan(String value) {
            addCriterion("emk1 <", value, "emk1");
            return (Criteria) this;
        }

        public Criteria andEmk1LessThanOrEqualTo(String value) {
            addCriterion("emk1 <=", value, "emk1");
            return (Criteria) this;
        }

        public Criteria andEmk1Like(String value) {
            addCriterion("emk1 like", value, "emk1");
            return (Criteria) this;
        }

        public Criteria andEmk1NotLike(String value) {
            addCriterion("emk1 not like", value, "emk1");
            return (Criteria) this;
        }

        public Criteria andEmk1In(List<String> values) {
            addCriterion("emk1 in", values, "emk1");
            return (Criteria) this;
        }

        public Criteria andEmk1NotIn(List<String> values) {
            addCriterion("emk1 not in", values, "emk1");
            return (Criteria) this;
        }

        public Criteria andEmk1Between(String value1, String value2) {
            addCriterion("emk1 between", value1, value2, "emk1");
            return (Criteria) this;
        }

        public Criteria andEmk1NotBetween(String value1, String value2) {
            addCriterion("emk1 not between", value1, value2, "emk1");
            return (Criteria) this;
        }

        public Criteria andEmk2IsNull() {
            addCriterion("emk2 is null");
            return (Criteria) this;
        }

        public Criteria andEmk2IsNotNull() {
            addCriterion("emk2 is not null");
            return (Criteria) this;
        }

        public Criteria andEmk2EqualTo(String value) {
            addCriterion("emk2 =", value, "emk2");
            return (Criteria) this;
        }

        public Criteria andEmk2NotEqualTo(String value) {
            addCriterion("emk2 <>", value, "emk2");
            return (Criteria) this;
        }

        public Criteria andEmk2GreaterThan(String value) {
            addCriterion("emk2 >", value, "emk2");
            return (Criteria) this;
        }

        public Criteria andEmk2GreaterThanOrEqualTo(String value) {
            addCriterion("emk2 >=", value, "emk2");
            return (Criteria) this;
        }

        public Criteria andEmk2LessThan(String value) {
            addCriterion("emk2 <", value, "emk2");
            return (Criteria) this;
        }

        public Criteria andEmk2LessThanOrEqualTo(String value) {
            addCriterion("emk2 <=", value, "emk2");
            return (Criteria) this;
        }

        public Criteria andEmk2Like(String value) {
            addCriterion("emk2 like", value, "emk2");
            return (Criteria) this;
        }

        public Criteria andEmk2NotLike(String value) {
            addCriterion("emk2 not like", value, "emk2");
            return (Criteria) this;
        }

        public Criteria andEmk2In(List<String> values) {
            addCriterion("emk2 in", values, "emk2");
            return (Criteria) this;
        }

        public Criteria andEmk2NotIn(List<String> values) {
            addCriterion("emk2 not in", values, "emk2");
            return (Criteria) this;
        }

        public Criteria andEmk2Between(String value1, String value2) {
            addCriterion("emk2 between", value1, value2, "emk2");
            return (Criteria) this;
        }

        public Criteria andEmk2NotBetween(String value1, String value2) {
            addCriterion("emk2 not between", value1, value2, "emk2");
            return (Criteria) this;
        }

        public Criteria andEmk3IsNull() {
            addCriterion("emk3 is null");
            return (Criteria) this;
        }

        public Criteria andEmk3IsNotNull() {
            addCriterion("emk3 is not null");
            return (Criteria) this;
        }

        public Criteria andEmk3EqualTo(String value) {
            addCriterion("emk3 =", value, "emk3");
            return (Criteria) this;
        }

        public Criteria andEmk3NotEqualTo(String value) {
            addCriterion("emk3 <>", value, "emk3");
            return (Criteria) this;
        }

        public Criteria andEmk3GreaterThan(String value) {
            addCriterion("emk3 >", value, "emk3");
            return (Criteria) this;
        }

        public Criteria andEmk3GreaterThanOrEqualTo(String value) {
            addCriterion("emk3 >=", value, "emk3");
            return (Criteria) this;
        }

        public Criteria andEmk3LessThan(String value) {
            addCriterion("emk3 <", value, "emk3");
            return (Criteria) this;
        }

        public Criteria andEmk3LessThanOrEqualTo(String value) {
            addCriterion("emk3 <=", value, "emk3");
            return (Criteria) this;
        }

        public Criteria andEmk3Like(String value) {
            addCriterion("emk3 like", value, "emk3");
            return (Criteria) this;
        }

        public Criteria andEmk3NotLike(String value) {
            addCriterion("emk3 not like", value, "emk3");
            return (Criteria) this;
        }

        public Criteria andEmk3In(List<String> values) {
            addCriterion("emk3 in", values, "emk3");
            return (Criteria) this;
        }

        public Criteria andEmk3NotIn(List<String> values) {
            addCriterion("emk3 not in", values, "emk3");
            return (Criteria) this;
        }

        public Criteria andEmk3Between(String value1, String value2) {
            addCriterion("emk3 between", value1, value2, "emk3");
            return (Criteria) this;
        }

        public Criteria andEmk3NotBetween(String value1, String value2) {
            addCriterion("emk3 not between", value1, value2, "emk3");
            return (Criteria) this;
        }

        public Criteria andEmk4IsNull() {
            addCriterion("emk4 is null");
            return (Criteria) this;
        }

        public Criteria andEmk4IsNotNull() {
            addCriterion("emk4 is not null");
            return (Criteria) this;
        }

        public Criteria andEmk4EqualTo(String value) {
            addCriterion("emk4 =", value, "emk4");
            return (Criteria) this;
        }

        public Criteria andEmk4NotEqualTo(String value) {
            addCriterion("emk4 <>", value, "emk4");
            return (Criteria) this;
        }

        public Criteria andEmk4GreaterThan(String value) {
            addCriterion("emk4 >", value, "emk4");
            return (Criteria) this;
        }

        public Criteria andEmk4GreaterThanOrEqualTo(String value) {
            addCriterion("emk4 >=", value, "emk4");
            return (Criteria) this;
        }

        public Criteria andEmk4LessThan(String value) {
            addCriterion("emk4 <", value, "emk4");
            return (Criteria) this;
        }

        public Criteria andEmk4LessThanOrEqualTo(String value) {
            addCriterion("emk4 <=", value, "emk4");
            return (Criteria) this;
        }

        public Criteria andEmk4Like(String value) {
            addCriterion("emk4 like", value, "emk4");
            return (Criteria) this;
        }

        public Criteria andEmk4NotLike(String value) {
            addCriterion("emk4 not like", value, "emk4");
            return (Criteria) this;
        }

        public Criteria andEmk4In(List<String> values) {
            addCriterion("emk4 in", values, "emk4");
            return (Criteria) this;
        }

        public Criteria andEmk4NotIn(List<String> values) {
            addCriterion("emk4 not in", values, "emk4");
            return (Criteria) this;
        }

        public Criteria andEmk4Between(String value1, String value2) {
            addCriterion("emk4 between", value1, value2, "emk4");
            return (Criteria) this;
        }

        public Criteria andEmk4NotBetween(String value1, String value2) {
            addCriterion("emk4 not between", value1, value2, "emk4");
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
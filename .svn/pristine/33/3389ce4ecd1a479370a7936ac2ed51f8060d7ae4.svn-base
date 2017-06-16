package com.yhb.bean.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseBankcardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseBankcardExample() {
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

        public Criteria andBankcardidIsNull() {
            addCriterion("BankCardID is null");
            return (Criteria) this;
        }

        public Criteria andBankcardidIsNotNull() {
            addCriterion("BankCardID is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardidEqualTo(Integer value) {
            addCriterion("BankCardID =", value, "bankcardid");
            return (Criteria) this;
        }

        public Criteria andBankcardidNotEqualTo(Integer value) {
            addCriterion("BankCardID <>", value, "bankcardid");
            return (Criteria) this;
        }

        public Criteria andBankcardidGreaterThan(Integer value) {
            addCriterion("BankCardID >", value, "bankcardid");
            return (Criteria) this;
        }

        public Criteria andBankcardidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BankCardID >=", value, "bankcardid");
            return (Criteria) this;
        }

        public Criteria andBankcardidLessThan(Integer value) {
            addCriterion("BankCardID <", value, "bankcardid");
            return (Criteria) this;
        }

        public Criteria andBankcardidLessThanOrEqualTo(Integer value) {
            addCriterion("BankCardID <=", value, "bankcardid");
            return (Criteria) this;
        }

        public Criteria andBankcardidIn(List<Integer> values) {
            addCriterion("BankCardID in", values, "bankcardid");
            return (Criteria) this;
        }

        public Criteria andBankcardidNotIn(List<Integer> values) {
            addCriterion("BankCardID not in", values, "bankcardid");
            return (Criteria) this;
        }

        public Criteria andBankcardidBetween(Integer value1, Integer value2) {
            addCriterion("BankCardID between", value1, value2, "bankcardid");
            return (Criteria) this;
        }

        public Criteria andBankcardidNotBetween(Integer value1, Integer value2) {
            addCriterion("BankCardID not between", value1, value2, "bankcardid");
            return (Criteria) this;
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

        public Criteria andBanknameIsNull() {
            addCriterion("BankName is null");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNotNull() {
            addCriterion("BankName is not null");
            return (Criteria) this;
        }

        public Criteria andBanknameEqualTo(String value) {
            addCriterion("BankName =", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotEqualTo(String value) {
            addCriterion("BankName <>", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThan(String value) {
            addCriterion("BankName >", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThanOrEqualTo(String value) {
            addCriterion("BankName >=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThan(String value) {
            addCriterion("BankName <", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThanOrEqualTo(String value) {
            addCriterion("BankName <=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLike(String value) {
            addCriterion("BankName like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotLike(String value) {
            addCriterion("BankName not like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameIn(List<String> values) {
            addCriterion("BankName in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotIn(List<String> values) {
            addCriterion("BankName not in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameBetween(String value1, String value2) {
            addCriterion("BankName between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotBetween(String value1, String value2) {
            addCriterion("BankName not between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andBankaddressIsNull() {
            addCriterion("BankAddress is null");
            return (Criteria) this;
        }

        public Criteria andBankaddressIsNotNull() {
            addCriterion("BankAddress is not null");
            return (Criteria) this;
        }

        public Criteria andBankaddressEqualTo(String value) {
            addCriterion("BankAddress =", value, "bankaddress");
            return (Criteria) this;
        }

        public Criteria andBankaddressNotEqualTo(String value) {
            addCriterion("BankAddress <>", value, "bankaddress");
            return (Criteria) this;
        }

        public Criteria andBankaddressGreaterThan(String value) {
            addCriterion("BankAddress >", value, "bankaddress");
            return (Criteria) this;
        }

        public Criteria andBankaddressGreaterThanOrEqualTo(String value) {
            addCriterion("BankAddress >=", value, "bankaddress");
            return (Criteria) this;
        }

        public Criteria andBankaddressLessThan(String value) {
            addCriterion("BankAddress <", value, "bankaddress");
            return (Criteria) this;
        }

        public Criteria andBankaddressLessThanOrEqualTo(String value) {
            addCriterion("BankAddress <=", value, "bankaddress");
            return (Criteria) this;
        }

        public Criteria andBankaddressLike(String value) {
            addCriterion("BankAddress like", value, "bankaddress");
            return (Criteria) this;
        }

        public Criteria andBankaddressNotLike(String value) {
            addCriterion("BankAddress not like", value, "bankaddress");
            return (Criteria) this;
        }

        public Criteria andBankaddressIn(List<String> values) {
            addCriterion("BankAddress in", values, "bankaddress");
            return (Criteria) this;
        }

        public Criteria andBankaddressNotIn(List<String> values) {
            addCriterion("BankAddress not in", values, "bankaddress");
            return (Criteria) this;
        }

        public Criteria andBankaddressBetween(String value1, String value2) {
            addCriterion("BankAddress between", value1, value2, "bankaddress");
            return (Criteria) this;
        }

        public Criteria andBankaddressNotBetween(String value1, String value2) {
            addCriterion("BankAddress not between", value1, value2, "bankaddress");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberIsNull() {
            addCriterion("BankCardNumber is null");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberIsNotNull() {
            addCriterion("BankCardNumber is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberEqualTo(String value) {
            addCriterion("BankCardNumber =", value, "bankcardnumber");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberNotEqualTo(String value) {
            addCriterion("BankCardNumber <>", value, "bankcardnumber");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberGreaterThan(String value) {
            addCriterion("BankCardNumber >", value, "bankcardnumber");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberGreaterThanOrEqualTo(String value) {
            addCriterion("BankCardNumber >=", value, "bankcardnumber");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberLessThan(String value) {
            addCriterion("BankCardNumber <", value, "bankcardnumber");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberLessThanOrEqualTo(String value) {
            addCriterion("BankCardNumber <=", value, "bankcardnumber");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberLike(String value) {
            addCriterion("BankCardNumber like", value, "bankcardnumber");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberNotLike(String value) {
            addCriterion("BankCardNumber not like", value, "bankcardnumber");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberIn(List<String> values) {
            addCriterion("BankCardNumber in", values, "bankcardnumber");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberNotIn(List<String> values) {
            addCriterion("BankCardNumber not in", values, "bankcardnumber");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberBetween(String value1, String value2) {
            addCriterion("BankCardNumber between", value1, value2, "bankcardnumber");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberNotBetween(String value1, String value2) {
            addCriterion("BankCardNumber not between", value1, value2, "bankcardnumber");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("Province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("Province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("Province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("Province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("Province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("Province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("Province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("Province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("Province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("Province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("Province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("Province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("Province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("Province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("City is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("City is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("City =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("City <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("City >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("City >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("City <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("City <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("City like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("City not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("City in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("City not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("City between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("City not between", value1, value2, "city");
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

        public Criteria andIspassIsNull() {
            addCriterion("IsPass is null");
            return (Criteria) this;
        }

        public Criteria andIspassIsNotNull() {
            addCriterion("IsPass is not null");
            return (Criteria) this;
        }

        public Criteria andIspassEqualTo(Integer value) {
            addCriterion("IsPass =", value, "ispass");
            return (Criteria) this;
        }

        public Criteria andIspassNotEqualTo(Integer value) {
            addCriterion("IsPass <>", value, "ispass");
            return (Criteria) this;
        }

        public Criteria andIspassGreaterThan(Integer value) {
            addCriterion("IsPass >", value, "ispass");
            return (Criteria) this;
        }

        public Criteria andIspassGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsPass >=", value, "ispass");
            return (Criteria) this;
        }

        public Criteria andIspassLessThan(Integer value) {
            addCriterion("IsPass <", value, "ispass");
            return (Criteria) this;
        }

        public Criteria andIspassLessThanOrEqualTo(Integer value) {
            addCriterion("IsPass <=", value, "ispass");
            return (Criteria) this;
        }

        public Criteria andIspassIn(List<Integer> values) {
            addCriterion("IsPass in", values, "ispass");
            return (Criteria) this;
        }

        public Criteria andIspassNotIn(List<Integer> values) {
            addCriterion("IsPass not in", values, "ispass");
            return (Criteria) this;
        }

        public Criteria andIspassBetween(Integer value1, Integer value2) {
            addCriterion("IsPass between", value1, value2, "ispass");
            return (Criteria) this;
        }

        public Criteria andIspassNotBetween(Integer value1, Integer value2) {
            addCriterion("IsPass not between", value1, value2, "ispass");
            return (Criteria) this;
        }

        public Criteria andIsusedIsNull() {
            addCriterion("IsUsed is null");
            return (Criteria) this;
        }

        public Criteria andIsusedIsNotNull() {
            addCriterion("IsUsed is not null");
            return (Criteria) this;
        }

        public Criteria andIsusedEqualTo(Boolean value) {
            addCriterion("IsUsed =", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedNotEqualTo(Boolean value) {
            addCriterion("IsUsed <>", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedGreaterThan(Boolean value) {
            addCriterion("IsUsed >", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsUsed >=", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedLessThan(Boolean value) {
            addCriterion("IsUsed <", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedLessThanOrEqualTo(Boolean value) {
            addCriterion("IsUsed <=", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedIn(List<Boolean> values) {
            addCriterion("IsUsed in", values, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedNotIn(List<Boolean> values) {
            addCriterion("IsUsed not in", values, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedBetween(Boolean value1, Boolean value2) {
            addCriterion("IsUsed between", value1, value2, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsUsed not between", value1, value2, "isused");
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

        public Criteria andBelongIsNull() {
            addCriterion("belong is null");
            return (Criteria) this;
        }

        public Criteria andBelongIsNotNull() {
            addCriterion("belong is not null");
            return (Criteria) this;
        }

        public Criteria andBelongEqualTo(Integer value) {
            addCriterion("belong =", value, "belong");
            return (Criteria) this;
        }

        public Criteria andBelongNotEqualTo(Integer value) {
            addCriterion("belong <>", value, "belong");
            return (Criteria) this;
        }

        public Criteria andBelongGreaterThan(Integer value) {
            addCriterion("belong >", value, "belong");
            return (Criteria) this;
        }

        public Criteria andBelongGreaterThanOrEqualTo(Integer value) {
            addCriterion("belong >=", value, "belong");
            return (Criteria) this;
        }

        public Criteria andBelongLessThan(Integer value) {
            addCriterion("belong <", value, "belong");
            return (Criteria) this;
        }

        public Criteria andBelongLessThanOrEqualTo(Integer value) {
            addCriterion("belong <=", value, "belong");
            return (Criteria) this;
        }

        public Criteria andBelongIn(List<Integer> values) {
            addCriterion("belong in", values, "belong");
            return (Criteria) this;
        }

        public Criteria andBelongNotIn(List<Integer> values) {
            addCriterion("belong not in", values, "belong");
            return (Criteria) this;
        }

        public Criteria andBelongBetween(Integer value1, Integer value2) {
            addCriterion("belong between", value1, value2, "belong");
            return (Criteria) this;
        }

        public Criteria andBelongNotBetween(Integer value1, Integer value2) {
            addCriterion("belong not between", value1, value2, "belong");
            return (Criteria) this;
        }

        public Criteria andBankaddress2IsNull() {
            addCriterion("BankAddress2 is null");
            return (Criteria) this;
        }

        public Criteria andBankaddress2IsNotNull() {
            addCriterion("BankAddress2 is not null");
            return (Criteria) this;
        }

        public Criteria andBankaddress2EqualTo(String value) {
            addCriterion("BankAddress2 =", value, "bankaddress2");
            return (Criteria) this;
        }

        public Criteria andBankaddress2NotEqualTo(String value) {
            addCriterion("BankAddress2 <>", value, "bankaddress2");
            return (Criteria) this;
        }

        public Criteria andBankaddress2GreaterThan(String value) {
            addCriterion("BankAddress2 >", value, "bankaddress2");
            return (Criteria) this;
        }

        public Criteria andBankaddress2GreaterThanOrEqualTo(String value) {
            addCriterion("BankAddress2 >=", value, "bankaddress2");
            return (Criteria) this;
        }

        public Criteria andBankaddress2LessThan(String value) {
            addCriterion("BankAddress2 <", value, "bankaddress2");
            return (Criteria) this;
        }

        public Criteria andBankaddress2LessThanOrEqualTo(String value) {
            addCriterion("BankAddress2 <=", value, "bankaddress2");
            return (Criteria) this;
        }

        public Criteria andBankaddress2Like(String value) {
            addCriterion("BankAddress2 like", value, "bankaddress2");
            return (Criteria) this;
        }

        public Criteria andBankaddress2NotLike(String value) {
            addCriterion("BankAddress2 not like", value, "bankaddress2");
            return (Criteria) this;
        }

        public Criteria andBankaddress2In(List<String> values) {
            addCriterion("BankAddress2 in", values, "bankaddress2");
            return (Criteria) this;
        }

        public Criteria andBankaddress2NotIn(List<String> values) {
            addCriterion("BankAddress2 not in", values, "bankaddress2");
            return (Criteria) this;
        }

        public Criteria andBankaddress2Between(String value1, String value2) {
            addCriterion("BankAddress2 between", value1, value2, "bankaddress2");
            return (Criteria) this;
        }

        public Criteria andBankaddress2NotBetween(String value1, String value2) {
            addCriterion("BankAddress2 not between", value1, value2, "bankaddress2");
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
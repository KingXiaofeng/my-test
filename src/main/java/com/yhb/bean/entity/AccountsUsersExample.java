package com.yhb.bean.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountsUsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountsUsersExample() {
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

        public Criteria andUserpasswordIsNull() {
            addCriterion("UserPassword is null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNotNull() {
            addCriterion("UserPassword is not null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordEqualTo(String value) {
            addCriterion("UserPassword =", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotEqualTo(String value) {
            addCriterion("UserPassword <>", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThan(String value) {
            addCriterion("UserPassword >", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("UserPassword >=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThan(String value) {
            addCriterion("UserPassword <", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThanOrEqualTo(String value) {
            addCriterion("UserPassword <=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLike(String value) {
            addCriterion("UserPassword like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotLike(String value) {
            addCriterion("UserPassword not like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIn(List<String> values) {
            addCriterion("UserPassword in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotIn(List<String> values) {
            addCriterion("UserPassword not in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordBetween(String value1, String value2) {
            addCriterion("UserPassword between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotBetween(String value1, String value2) {
            addCriterion("UserPassword not between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andCheckpasswordIsNull() {
            addCriterion("CheckPassword is null");
            return (Criteria) this;
        }

        public Criteria andCheckpasswordIsNotNull() {
            addCriterion("CheckPassword is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpasswordEqualTo(String value) {
            addCriterion("CheckPassword =", value, "checkpassword");
            return (Criteria) this;
        }

        public Criteria andCheckpasswordNotEqualTo(String value) {
            addCriterion("CheckPassword <>", value, "checkpassword");
            return (Criteria) this;
        }

        public Criteria andCheckpasswordGreaterThan(String value) {
            addCriterion("CheckPassword >", value, "checkpassword");
            return (Criteria) this;
        }

        public Criteria andCheckpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("CheckPassword >=", value, "checkpassword");
            return (Criteria) this;
        }

        public Criteria andCheckpasswordLessThan(String value) {
            addCriterion("CheckPassword <", value, "checkpassword");
            return (Criteria) this;
        }

        public Criteria andCheckpasswordLessThanOrEqualTo(String value) {
            addCriterion("CheckPassword <=", value, "checkpassword");
            return (Criteria) this;
        }

        public Criteria andCheckpasswordLike(String value) {
            addCriterion("CheckPassword like", value, "checkpassword");
            return (Criteria) this;
        }

        public Criteria andCheckpasswordNotLike(String value) {
            addCriterion("CheckPassword not like", value, "checkpassword");
            return (Criteria) this;
        }

        public Criteria andCheckpasswordIn(List<String> values) {
            addCriterion("CheckPassword in", values, "checkpassword");
            return (Criteria) this;
        }

        public Criteria andCheckpasswordNotIn(List<String> values) {
            addCriterion("CheckPassword not in", values, "checkpassword");
            return (Criteria) this;
        }

        public Criteria andCheckpasswordBetween(String value1, String value2) {
            addCriterion("CheckPassword between", value1, value2, "checkpassword");
            return (Criteria) this;
        }

        public Criteria andCheckpasswordNotBetween(String value1, String value2) {
            addCriterion("CheckPassword not between", value1, value2, "checkpassword");
            return (Criteria) this;
        }

        public Criteria andTruenameIsNull() {
            addCriterion("TrueName is null");
            return (Criteria) this;
        }

        public Criteria andTruenameIsNotNull() {
            addCriterion("TrueName is not null");
            return (Criteria) this;
        }

        public Criteria andTruenameEqualTo(String value) {
            addCriterion("TrueName =", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotEqualTo(String value) {
            addCriterion("TrueName <>", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameGreaterThan(String value) {
            addCriterion("TrueName >", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameGreaterThanOrEqualTo(String value) {
            addCriterion("TrueName >=", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameLessThan(String value) {
            addCriterion("TrueName <", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameLessThanOrEqualTo(String value) {
            addCriterion("TrueName <=", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameLike(String value) {
            addCriterion("TrueName like", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotLike(String value) {
            addCriterion("TrueName not like", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameIn(List<String> values) {
            addCriterion("TrueName in", values, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotIn(List<String> values) {
            addCriterion("TrueName not in", values, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameBetween(String value1, String value2) {
            addCriterion("TrueName between", value1, value2, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotBetween(String value1, String value2) {
            addCriterion("TrueName not between", value1, value2, "truename");
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

        public Criteria andCompanynameIsNull() {
            addCriterion("CompanyName is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("CompanyName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("CompanyName =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("CompanyName <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("CompanyName >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("CompanyName >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("CompanyName <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("CompanyName <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("CompanyName like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("CompanyName not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("CompanyName in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("CompanyName not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("CompanyName between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("CompanyName not between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressIsNull() {
            addCriterion("CompanyAddress is null");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressIsNotNull() {
            addCriterion("CompanyAddress is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressEqualTo(String value) {
            addCriterion("CompanyAddress =", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressNotEqualTo(String value) {
            addCriterion("CompanyAddress <>", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressGreaterThan(String value) {
            addCriterion("CompanyAddress >", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressGreaterThanOrEqualTo(String value) {
            addCriterion("CompanyAddress >=", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressLessThan(String value) {
            addCriterion("CompanyAddress <", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressLessThanOrEqualTo(String value) {
            addCriterion("CompanyAddress <=", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressLike(String value) {
            addCriterion("CompanyAddress like", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressNotLike(String value) {
            addCriterion("CompanyAddress not like", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressIn(List<String> values) {
            addCriterion("CompanyAddress in", values, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressNotIn(List<String> values) {
            addCriterion("CompanyAddress not in", values, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressBetween(String value1, String value2) {
            addCriterion("CompanyAddress between", value1, value2, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressNotBetween(String value1, String value2) {
            addCriterion("CompanyAddress not between", value1, value2, "companyaddress");
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

        public Criteria andActivityEqualTo(Boolean value) {
            addCriterion("Activity =", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotEqualTo(Boolean value) {
            addCriterion("Activity <>", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityGreaterThan(Boolean value) {
            addCriterion("Activity >", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Activity >=", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityLessThan(Boolean value) {
            addCriterion("Activity <", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityLessThanOrEqualTo(Boolean value) {
            addCriterion("Activity <=", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityIn(List<Boolean> values) {
            addCriterion("Activity in", values, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotIn(List<Boolean> values) {
            addCriterion("Activity not in", values, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityBetween(Boolean value1, Boolean value2) {
            addCriterion("Activity between", value1, value2, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Activity not between", value1, value2, "activity");
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

        public Criteria andIsagentIsNull() {
            addCriterion("IsAgent is null");
            return (Criteria) this;
        }

        public Criteria andIsagentIsNotNull() {
            addCriterion("IsAgent is not null");
            return (Criteria) this;
        }

        public Criteria andIsagentEqualTo(Boolean value) {
            addCriterion("IsAgent =", value, "isagent");
            return (Criteria) this;
        }

        public Criteria andIsagentNotEqualTo(Boolean value) {
            addCriterion("IsAgent <>", value, "isagent");
            return (Criteria) this;
        }

        public Criteria andIsagentGreaterThan(Boolean value) {
            addCriterion("IsAgent >", value, "isagent");
            return (Criteria) this;
        }

        public Criteria andIsagentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsAgent >=", value, "isagent");
            return (Criteria) this;
        }

        public Criteria andIsagentLessThan(Boolean value) {
            addCriterion("IsAgent <", value, "isagent");
            return (Criteria) this;
        }

        public Criteria andIsagentLessThanOrEqualTo(Boolean value) {
            addCriterion("IsAgent <=", value, "isagent");
            return (Criteria) this;
        }

        public Criteria andIsagentIn(List<Boolean> values) {
            addCriterion("IsAgent in", values, "isagent");
            return (Criteria) this;
        }

        public Criteria andIsagentNotIn(List<Boolean> values) {
            addCriterion("IsAgent not in", values, "isagent");
            return (Criteria) this;
        }

        public Criteria andIsagentBetween(Boolean value1, Boolean value2) {
            addCriterion("IsAgent between", value1, value2, "isagent");
            return (Criteria) this;
        }

        public Criteria andIsagentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsAgent not between", value1, value2, "isagent");
            return (Criteria) this;
        }

        public Criteria andLinecountIsNull() {
            addCriterion("LineCount is null");
            return (Criteria) this;
        }

        public Criteria andLinecountIsNotNull() {
            addCriterion("LineCount is not null");
            return (Criteria) this;
        }

        public Criteria andLinecountEqualTo(Integer value) {
            addCriterion("LineCount =", value, "linecount");
            return (Criteria) this;
        }

        public Criteria andLinecountNotEqualTo(Integer value) {
            addCriterion("LineCount <>", value, "linecount");
            return (Criteria) this;
        }

        public Criteria andLinecountGreaterThan(Integer value) {
            addCriterion("LineCount >", value, "linecount");
            return (Criteria) this;
        }

        public Criteria andLinecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("LineCount >=", value, "linecount");
            return (Criteria) this;
        }

        public Criteria andLinecountLessThan(Integer value) {
            addCriterion("LineCount <", value, "linecount");
            return (Criteria) this;
        }

        public Criteria andLinecountLessThanOrEqualTo(Integer value) {
            addCriterion("LineCount <=", value, "linecount");
            return (Criteria) this;
        }

        public Criteria andLinecountIn(List<Integer> values) {
            addCriterion("LineCount in", values, "linecount");
            return (Criteria) this;
        }

        public Criteria andLinecountNotIn(List<Integer> values) {
            addCriterion("LineCount not in", values, "linecount");
            return (Criteria) this;
        }

        public Criteria andLinecountBetween(Integer value1, Integer value2) {
            addCriterion("LineCount between", value1, value2, "linecount");
            return (Criteria) this;
        }

        public Criteria andLinecountNotBetween(Integer value1, Integer value2) {
            addCriterion("LineCount not between", value1, value2, "linecount");
            return (Criteria) this;
        }

        public Criteria andIsaudituserIsNull() {
            addCriterion("IsAuditUser is null");
            return (Criteria) this;
        }

        public Criteria andIsaudituserIsNotNull() {
            addCriterion("IsAuditUser is not null");
            return (Criteria) this;
        }

        public Criteria andIsaudituserEqualTo(Boolean value) {
            addCriterion("IsAuditUser =", value, "isaudituser");
            return (Criteria) this;
        }

        public Criteria andIsaudituserNotEqualTo(Boolean value) {
            addCriterion("IsAuditUser <>", value, "isaudituser");
            return (Criteria) this;
        }

        public Criteria andIsaudituserGreaterThan(Boolean value) {
            addCriterion("IsAuditUser >", value, "isaudituser");
            return (Criteria) this;
        }

        public Criteria andIsaudituserGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsAuditUser >=", value, "isaudituser");
            return (Criteria) this;
        }

        public Criteria andIsaudituserLessThan(Boolean value) {
            addCriterion("IsAuditUser <", value, "isaudituser");
            return (Criteria) this;
        }

        public Criteria andIsaudituserLessThanOrEqualTo(Boolean value) {
            addCriterion("IsAuditUser <=", value, "isaudituser");
            return (Criteria) this;
        }

        public Criteria andIsaudituserIn(List<Boolean> values) {
            addCriterion("IsAuditUser in", values, "isaudituser");
            return (Criteria) this;
        }

        public Criteria andIsaudituserNotIn(List<Boolean> values) {
            addCriterion("IsAuditUser not in", values, "isaudituser");
            return (Criteria) this;
        }

        public Criteria andIsaudituserBetween(Boolean value1, Boolean value2) {
            addCriterion("IsAuditUser between", value1, value2, "isaudituser");
            return (Criteria) this;
        }

        public Criteria andIsaudituserNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsAuditUser not between", value1, value2, "isaudituser");
            return (Criteria) this;
        }

        public Criteria andStyleIsNull() {
            addCriterion("Style is null");
            return (Criteria) this;
        }

        public Criteria andStyleIsNotNull() {
            addCriterion("Style is not null");
            return (Criteria) this;
        }

        public Criteria andStyleEqualTo(Integer value) {
            addCriterion("Style =", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotEqualTo(Integer value) {
            addCriterion("Style <>", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleGreaterThan(Integer value) {
            addCriterion("Style >", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleGreaterThanOrEqualTo(Integer value) {
            addCriterion("Style >=", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLessThan(Integer value) {
            addCriterion("Style <", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLessThanOrEqualTo(Integer value) {
            addCriterion("Style <=", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleIn(List<Integer> values) {
            addCriterion("Style in", values, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotIn(List<Integer> values) {
            addCriterion("Style not in", values, "style");
            return (Criteria) this;
        }

        public Criteria andStyleBetween(Integer value1, Integer value2) {
            addCriterion("Style between", value1, value2, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotBetween(Integer value1, Integer value2) {
            addCriterion("Style not between", value1, value2, "style");
            return (Criteria) this;
        }

        public Criteria andUserlevelIsNull() {
            addCriterion("UserLevel is null");
            return (Criteria) this;
        }

        public Criteria andUserlevelIsNotNull() {
            addCriterion("UserLevel is not null");
            return (Criteria) this;
        }

        public Criteria andUserlevelEqualTo(Integer value) {
            addCriterion("UserLevel =", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelNotEqualTo(Integer value) {
            addCriterion("UserLevel <>", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelGreaterThan(Integer value) {
            addCriterion("UserLevel >", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserLevel >=", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelLessThan(Integer value) {
            addCriterion("UserLevel <", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelLessThanOrEqualTo(Integer value) {
            addCriterion("UserLevel <=", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelIn(List<Integer> values) {
            addCriterion("UserLevel in", values, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelNotIn(List<Integer> values) {
            addCriterion("UserLevel not in", values, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelBetween(Integer value1, Integer value2) {
            addCriterion("UserLevel between", value1, value2, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelNotBetween(Integer value1, Integer value2) {
            addCriterion("UserLevel not between", value1, value2, "userlevel");
            return (Criteria) this;
        }

        public Criteria andPaynameIsNull() {
            addCriterion("PayName is null");
            return (Criteria) this;
        }

        public Criteria andPaynameIsNotNull() {
            addCriterion("PayName is not null");
            return (Criteria) this;
        }

        public Criteria andPaynameEqualTo(String value) {
            addCriterion("PayName =", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameNotEqualTo(String value) {
            addCriterion("PayName <>", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameGreaterThan(String value) {
            addCriterion("PayName >", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameGreaterThanOrEqualTo(String value) {
            addCriterion("PayName >=", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameLessThan(String value) {
            addCriterion("PayName <", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameLessThanOrEqualTo(String value) {
            addCriterion("PayName <=", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameLike(String value) {
            addCriterion("PayName like", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameNotLike(String value) {
            addCriterion("PayName not like", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameIn(List<String> values) {
            addCriterion("PayName in", values, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameNotIn(List<String> values) {
            addCriterion("PayName not in", values, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameBetween(String value1, String value2) {
            addCriterion("PayName between", value1, value2, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameNotBetween(String value1, String value2) {
            addCriterion("PayName not between", value1, value2, "payname");
            return (Criteria) this;
        }

        public Criteria andPaybankIsNull() {
            addCriterion("PayBank is null");
            return (Criteria) this;
        }

        public Criteria andPaybankIsNotNull() {
            addCriterion("PayBank is not null");
            return (Criteria) this;
        }

        public Criteria andPaybankEqualTo(String value) {
            addCriterion("PayBank =", value, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankNotEqualTo(String value) {
            addCriterion("PayBank <>", value, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankGreaterThan(String value) {
            addCriterion("PayBank >", value, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankGreaterThanOrEqualTo(String value) {
            addCriterion("PayBank >=", value, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankLessThan(String value) {
            addCriterion("PayBank <", value, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankLessThanOrEqualTo(String value) {
            addCriterion("PayBank <=", value, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankLike(String value) {
            addCriterion("PayBank like", value, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankNotLike(String value) {
            addCriterion("PayBank not like", value, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankIn(List<String> values) {
            addCriterion("PayBank in", values, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankNotIn(List<String> values) {
            addCriterion("PayBank not in", values, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankBetween(String value1, String value2) {
            addCriterion("PayBank between", value1, value2, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankNotBetween(String value1, String value2) {
            addCriterion("PayBank not between", value1, value2, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankaddressIsNull() {
            addCriterion("PayBankAddress is null");
            return (Criteria) this;
        }

        public Criteria andPaybankaddressIsNotNull() {
            addCriterion("PayBankAddress is not null");
            return (Criteria) this;
        }

        public Criteria andPaybankaddressEqualTo(String value) {
            addCriterion("PayBankAddress =", value, "paybankaddress");
            return (Criteria) this;
        }

        public Criteria andPaybankaddressNotEqualTo(String value) {
            addCriterion("PayBankAddress <>", value, "paybankaddress");
            return (Criteria) this;
        }

        public Criteria andPaybankaddressGreaterThan(String value) {
            addCriterion("PayBankAddress >", value, "paybankaddress");
            return (Criteria) this;
        }

        public Criteria andPaybankaddressGreaterThanOrEqualTo(String value) {
            addCriterion("PayBankAddress >=", value, "paybankaddress");
            return (Criteria) this;
        }

        public Criteria andPaybankaddressLessThan(String value) {
            addCriterion("PayBankAddress <", value, "paybankaddress");
            return (Criteria) this;
        }

        public Criteria andPaybankaddressLessThanOrEqualTo(String value) {
            addCriterion("PayBankAddress <=", value, "paybankaddress");
            return (Criteria) this;
        }

        public Criteria andPaybankaddressLike(String value) {
            addCriterion("PayBankAddress like", value, "paybankaddress");
            return (Criteria) this;
        }

        public Criteria andPaybankaddressNotLike(String value) {
            addCriterion("PayBankAddress not like", value, "paybankaddress");
            return (Criteria) this;
        }

        public Criteria andPaybankaddressIn(List<String> values) {
            addCriterion("PayBankAddress in", values, "paybankaddress");
            return (Criteria) this;
        }

        public Criteria andPaybankaddressNotIn(List<String> values) {
            addCriterion("PayBankAddress not in", values, "paybankaddress");
            return (Criteria) this;
        }

        public Criteria andPaybankaddressBetween(String value1, String value2) {
            addCriterion("PayBankAddress between", value1, value2, "paybankaddress");
            return (Criteria) this;
        }

        public Criteria andPaybankaddressNotBetween(String value1, String value2) {
            addCriterion("PayBankAddress not between", value1, value2, "paybankaddress");
            return (Criteria) this;
        }

        public Criteria andPaybankcardnumberIsNull() {
            addCriterion("PayBankCardNumber is null");
            return (Criteria) this;
        }

        public Criteria andPaybankcardnumberIsNotNull() {
            addCriterion("PayBankCardNumber is not null");
            return (Criteria) this;
        }

        public Criteria andPaybankcardnumberEqualTo(String value) {
            addCriterion("PayBankCardNumber =", value, "paybankcardnumber");
            return (Criteria) this;
        }

        public Criteria andPaybankcardnumberNotEqualTo(String value) {
            addCriterion("PayBankCardNumber <>", value, "paybankcardnumber");
            return (Criteria) this;
        }

        public Criteria andPaybankcardnumberGreaterThan(String value) {
            addCriterion("PayBankCardNumber >", value, "paybankcardnumber");
            return (Criteria) this;
        }

        public Criteria andPaybankcardnumberGreaterThanOrEqualTo(String value) {
            addCriterion("PayBankCardNumber >=", value, "paybankcardnumber");
            return (Criteria) this;
        }

        public Criteria andPaybankcardnumberLessThan(String value) {
            addCriterion("PayBankCardNumber <", value, "paybankcardnumber");
            return (Criteria) this;
        }

        public Criteria andPaybankcardnumberLessThanOrEqualTo(String value) {
            addCriterion("PayBankCardNumber <=", value, "paybankcardnumber");
            return (Criteria) this;
        }

        public Criteria andPaybankcardnumberLike(String value) {
            addCriterion("PayBankCardNumber like", value, "paybankcardnumber");
            return (Criteria) this;
        }

        public Criteria andPaybankcardnumberNotLike(String value) {
            addCriterion("PayBankCardNumber not like", value, "paybankcardnumber");
            return (Criteria) this;
        }

        public Criteria andPaybankcardnumberIn(List<String> values) {
            addCriterion("PayBankCardNumber in", values, "paybankcardnumber");
            return (Criteria) this;
        }

        public Criteria andPaybankcardnumberNotIn(List<String> values) {
            addCriterion("PayBankCardNumber not in", values, "paybankcardnumber");
            return (Criteria) this;
        }

        public Criteria andPaybankcardnumberBetween(String value1, String value2) {
            addCriterion("PayBankCardNumber between", value1, value2, "paybankcardnumber");
            return (Criteria) this;
        }

        public Criteria andPaybankcardnumberNotBetween(String value1, String value2) {
            addCriterion("PayBankCardNumber not between", value1, value2, "paybankcardnumber");
            return (Criteria) this;
        }

        public Criteria andUserquestionIsNull() {
            addCriterion("UserQuestion is null");
            return (Criteria) this;
        }

        public Criteria andUserquestionIsNotNull() {
            addCriterion("UserQuestion is not null");
            return (Criteria) this;
        }

        public Criteria andUserquestionEqualTo(String value) {
            addCriterion("UserQuestion =", value, "userquestion");
            return (Criteria) this;
        }

        public Criteria andUserquestionNotEqualTo(String value) {
            addCriterion("UserQuestion <>", value, "userquestion");
            return (Criteria) this;
        }

        public Criteria andUserquestionGreaterThan(String value) {
            addCriterion("UserQuestion >", value, "userquestion");
            return (Criteria) this;
        }

        public Criteria andUserquestionGreaterThanOrEqualTo(String value) {
            addCriterion("UserQuestion >=", value, "userquestion");
            return (Criteria) this;
        }

        public Criteria andUserquestionLessThan(String value) {
            addCriterion("UserQuestion <", value, "userquestion");
            return (Criteria) this;
        }

        public Criteria andUserquestionLessThanOrEqualTo(String value) {
            addCriterion("UserQuestion <=", value, "userquestion");
            return (Criteria) this;
        }

        public Criteria andUserquestionLike(String value) {
            addCriterion("UserQuestion like", value, "userquestion");
            return (Criteria) this;
        }

        public Criteria andUserquestionNotLike(String value) {
            addCriterion("UserQuestion not like", value, "userquestion");
            return (Criteria) this;
        }

        public Criteria andUserquestionIn(List<String> values) {
            addCriterion("UserQuestion in", values, "userquestion");
            return (Criteria) this;
        }

        public Criteria andUserquestionNotIn(List<String> values) {
            addCriterion("UserQuestion not in", values, "userquestion");
            return (Criteria) this;
        }

        public Criteria andUserquestionBetween(String value1, String value2) {
            addCriterion("UserQuestion between", value1, value2, "userquestion");
            return (Criteria) this;
        }

        public Criteria andUserquestionNotBetween(String value1, String value2) {
            addCriterion("UserQuestion not between", value1, value2, "userquestion");
            return (Criteria) this;
        }

        public Criteria andUseranswerIsNull() {
            addCriterion("UserAnswer is null");
            return (Criteria) this;
        }

        public Criteria andUseranswerIsNotNull() {
            addCriterion("UserAnswer is not null");
            return (Criteria) this;
        }

        public Criteria andUseranswerEqualTo(String value) {
            addCriterion("UserAnswer =", value, "useranswer");
            return (Criteria) this;
        }

        public Criteria andUseranswerNotEqualTo(String value) {
            addCriterion("UserAnswer <>", value, "useranswer");
            return (Criteria) this;
        }

        public Criteria andUseranswerGreaterThan(String value) {
            addCriterion("UserAnswer >", value, "useranswer");
            return (Criteria) this;
        }

        public Criteria andUseranswerGreaterThanOrEqualTo(String value) {
            addCriterion("UserAnswer >=", value, "useranswer");
            return (Criteria) this;
        }

        public Criteria andUseranswerLessThan(String value) {
            addCriterion("UserAnswer <", value, "useranswer");
            return (Criteria) this;
        }

        public Criteria andUseranswerLessThanOrEqualTo(String value) {
            addCriterion("UserAnswer <=", value, "useranswer");
            return (Criteria) this;
        }

        public Criteria andUseranswerLike(String value) {
            addCriterion("UserAnswer like", value, "useranswer");
            return (Criteria) this;
        }

        public Criteria andUseranswerNotLike(String value) {
            addCriterion("UserAnswer not like", value, "useranswer");
            return (Criteria) this;
        }

        public Criteria andUseranswerIn(List<String> values) {
            addCriterion("UserAnswer in", values, "useranswer");
            return (Criteria) this;
        }

        public Criteria andUseranswerNotIn(List<String> values) {
            addCriterion("UserAnswer not in", values, "useranswer");
            return (Criteria) this;
        }

        public Criteria andUseranswerBetween(String value1, String value2) {
            addCriterion("UserAnswer between", value1, value2, "useranswer");
            return (Criteria) this;
        }

        public Criteria andUseranswerNotBetween(String value1, String value2) {
            addCriterion("UserAnswer not between", value1, value2, "useranswer");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("QQ is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("QQ is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("QQ =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("QQ <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("QQ >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("QQ >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("QQ <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("QQ <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("QQ like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("QQ not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("QQ in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("QQ not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("QQ between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("QQ not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNull() {
            addCriterion("Telphone is null");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNotNull() {
            addCriterion("Telphone is not null");
            return (Criteria) this;
        }

        public Criteria andTelphoneEqualTo(String value) {
            addCriterion("Telphone =", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotEqualTo(String value) {
            addCriterion("Telphone <>", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThan(String value) {
            addCriterion("Telphone >", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThanOrEqualTo(String value) {
            addCriterion("Telphone >=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThan(String value) {
            addCriterion("Telphone <", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThanOrEqualTo(String value) {
            addCriterion("Telphone <=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLike(String value) {
            addCriterion("Telphone like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotLike(String value) {
            addCriterion("Telphone not like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneIn(List<String> values) {
            addCriterion("Telphone in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotIn(List<String> values) {
            addCriterion("Telphone not in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneBetween(String value1, String value2) {
            addCriterion("Telphone between", value1, value2, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotBetween(String value1, String value2) {
            addCriterion("Telphone not between", value1, value2, "telphone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("Email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("Email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("Email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("Email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("Email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("Email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("Email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("Email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("Email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("Email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("Email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("Email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("Email not between", value1, value2, "email");
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

        public Criteria andPlatidIsNull() {
            addCriterion("PlatID is null");
            return (Criteria) this;
        }

        public Criteria andPlatidIsNotNull() {
            addCriterion("PlatID is not null");
            return (Criteria) this;
        }

        public Criteria andPlatidEqualTo(String value) {
            addCriterion("PlatID =", value, "platid");
            return (Criteria) this;
        }

        public Criteria andPlatidNotEqualTo(String value) {
            addCriterion("PlatID <>", value, "platid");
            return (Criteria) this;
        }

        public Criteria andPlatidGreaterThan(String value) {
            addCriterion("PlatID >", value, "platid");
            return (Criteria) this;
        }

        public Criteria andPlatidGreaterThanOrEqualTo(String value) {
            addCriterion("PlatID >=", value, "platid");
            return (Criteria) this;
        }

        public Criteria andPlatidLessThan(String value) {
            addCriterion("PlatID <", value, "platid");
            return (Criteria) this;
        }

        public Criteria andPlatidLessThanOrEqualTo(String value) {
            addCriterion("PlatID <=", value, "platid");
            return (Criteria) this;
        }

        public Criteria andPlatidLike(String value) {
            addCriterion("PlatID like", value, "platid");
            return (Criteria) this;
        }

        public Criteria andPlatidNotLike(String value) {
            addCriterion("PlatID not like", value, "platid");
            return (Criteria) this;
        }

        public Criteria andPlatidIn(List<String> values) {
            addCriterion("PlatID in", values, "platid");
            return (Criteria) this;
        }

        public Criteria andPlatidNotIn(List<String> values) {
            addCriterion("PlatID not in", values, "platid");
            return (Criteria) this;
        }

        public Criteria andPlatidBetween(String value1, String value2) {
            addCriterion("PlatID between", value1, value2, "platid");
            return (Criteria) this;
        }

        public Criteria andPlatidNotBetween(String value1, String value2) {
            addCriterion("PlatID not between", value1, value2, "platid");
            return (Criteria) this;
        }

        public Criteria andOpenmoneyIsNull() {
            addCriterion("OpenMoney is null");
            return (Criteria) this;
        }

        public Criteria andOpenmoneyIsNotNull() {
            addCriterion("OpenMoney is not null");
            return (Criteria) this;
        }

        public Criteria andOpenmoneyEqualTo(BigDecimal value) {
            addCriterion("OpenMoney =", value, "openmoney");
            return (Criteria) this;
        }

        public Criteria andOpenmoneyNotEqualTo(BigDecimal value) {
            addCriterion("OpenMoney <>", value, "openmoney");
            return (Criteria) this;
        }

        public Criteria andOpenmoneyGreaterThan(BigDecimal value) {
            addCriterion("OpenMoney >", value, "openmoney");
            return (Criteria) this;
        }

        public Criteria andOpenmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OpenMoney >=", value, "openmoney");
            return (Criteria) this;
        }

        public Criteria andOpenmoneyLessThan(BigDecimal value) {
            addCriterion("OpenMoney <", value, "openmoney");
            return (Criteria) this;
        }

        public Criteria andOpenmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OpenMoney <=", value, "openmoney");
            return (Criteria) this;
        }

        public Criteria andOpenmoneyIn(List<BigDecimal> values) {
            addCriterion("OpenMoney in", values, "openmoney");
            return (Criteria) this;
        }

        public Criteria andOpenmoneyNotIn(List<BigDecimal> values) {
            addCriterion("OpenMoney not in", values, "openmoney");
            return (Criteria) this;
        }

        public Criteria andOpenmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OpenMoney between", value1, value2, "openmoney");
            return (Criteria) this;
        }

        public Criteria andOpenmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OpenMoney not between", value1, value2, "openmoney");
            return (Criteria) this;
        }

        public Criteria andPayfeeuserinIsNull() {
            addCriterion("PayFeeUserIn is null");
            return (Criteria) this;
        }

        public Criteria andPayfeeuserinIsNotNull() {
            addCriterion("PayFeeUserIn is not null");
            return (Criteria) this;
        }

        public Criteria andPayfeeuserinEqualTo(BigDecimal value) {
            addCriterion("PayFeeUserIn =", value, "payfeeuserin");
            return (Criteria) this;
        }

        public Criteria andPayfeeuserinNotEqualTo(BigDecimal value) {
            addCriterion("PayFeeUserIn <>", value, "payfeeuserin");
            return (Criteria) this;
        }

        public Criteria andPayfeeuserinGreaterThan(BigDecimal value) {
            addCriterion("PayFeeUserIn >", value, "payfeeuserin");
            return (Criteria) this;
        }

        public Criteria andPayfeeuserinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PayFeeUserIn >=", value, "payfeeuserin");
            return (Criteria) this;
        }

        public Criteria andPayfeeuserinLessThan(BigDecimal value) {
            addCriterion("PayFeeUserIn <", value, "payfeeuserin");
            return (Criteria) this;
        }

        public Criteria andPayfeeuserinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PayFeeUserIn <=", value, "payfeeuserin");
            return (Criteria) this;
        }

        public Criteria andPayfeeuserinIn(List<BigDecimal> values) {
            addCriterion("PayFeeUserIn in", values, "payfeeuserin");
            return (Criteria) this;
        }

        public Criteria andPayfeeuserinNotIn(List<BigDecimal> values) {
            addCriterion("PayFeeUserIn not in", values, "payfeeuserin");
            return (Criteria) this;
        }

        public Criteria andPayfeeuserinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PayFeeUserIn between", value1, value2, "payfeeuserin");
            return (Criteria) this;
        }

        public Criteria andPayfeeuserinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PayFeeUserIn not between", value1, value2, "payfeeuserin");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyIsNull() {
            addCriterion("MaxMoney is null");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyIsNotNull() {
            addCriterion("MaxMoney is not null");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyEqualTo(BigDecimal value) {
            addCriterion("MaxMoney =", value, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyNotEqualTo(BigDecimal value) {
            addCriterion("MaxMoney <>", value, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyGreaterThan(BigDecimal value) {
            addCriterion("MaxMoney >", value, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MaxMoney >=", value, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyLessThan(BigDecimal value) {
            addCriterion("MaxMoney <", value, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MaxMoney <=", value, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyIn(List<BigDecimal> values) {
            addCriterion("MaxMoney in", values, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyNotIn(List<BigDecimal> values) {
            addCriterion("MaxMoney not in", values, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MaxMoney between", value1, value2, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MaxMoney not between", value1, value2, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andRptemailIsNull() {
            addCriterion("RptEmail is null");
            return (Criteria) this;
        }

        public Criteria andRptemailIsNotNull() {
            addCriterion("RptEmail is not null");
            return (Criteria) this;
        }

        public Criteria andRptemailEqualTo(String value) {
            addCriterion("RptEmail =", value, "rptemail");
            return (Criteria) this;
        }

        public Criteria andRptemailNotEqualTo(String value) {
            addCriterion("RptEmail <>", value, "rptemail");
            return (Criteria) this;
        }

        public Criteria andRptemailGreaterThan(String value) {
            addCriterion("RptEmail >", value, "rptemail");
            return (Criteria) this;
        }

        public Criteria andRptemailGreaterThanOrEqualTo(String value) {
            addCriterion("RptEmail >=", value, "rptemail");
            return (Criteria) this;
        }

        public Criteria andRptemailLessThan(String value) {
            addCriterion("RptEmail <", value, "rptemail");
            return (Criteria) this;
        }

        public Criteria andRptemailLessThanOrEqualTo(String value) {
            addCriterion("RptEmail <=", value, "rptemail");
            return (Criteria) this;
        }

        public Criteria andRptemailLike(String value) {
            addCriterion("RptEmail like", value, "rptemail");
            return (Criteria) this;
        }

        public Criteria andRptemailNotLike(String value) {
            addCriterion("RptEmail not like", value, "rptemail");
            return (Criteria) this;
        }

        public Criteria andRptemailIn(List<String> values) {
            addCriterion("RptEmail in", values, "rptemail");
            return (Criteria) this;
        }

        public Criteria andRptemailNotIn(List<String> values) {
            addCriterion("RptEmail not in", values, "rptemail");
            return (Criteria) this;
        }

        public Criteria andRptemailBetween(String value1, String value2) {
            addCriterion("RptEmail between", value1, value2, "rptemail");
            return (Criteria) this;
        }

        public Criteria andRptemailNotBetween(String value1, String value2) {
            addCriterion("RptEmail not between", value1, value2, "rptemail");
            return (Criteria) this;
        }

        public Criteria andIdntfcodeIsNull() {
            addCriterion("IdntfCode is null");
            return (Criteria) this;
        }

        public Criteria andIdntfcodeIsNotNull() {
            addCriterion("IdntfCode is not null");
            return (Criteria) this;
        }

        public Criteria andIdntfcodeEqualTo(Integer value) {
            addCriterion("IdntfCode =", value, "idntfcode");
            return (Criteria) this;
        }

        public Criteria andIdntfcodeNotEqualTo(Integer value) {
            addCriterion("IdntfCode <>", value, "idntfcode");
            return (Criteria) this;
        }

        public Criteria andIdntfcodeGreaterThan(Integer value) {
            addCriterion("IdntfCode >", value, "idntfcode");
            return (Criteria) this;
        }

        public Criteria andIdntfcodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("IdntfCode >=", value, "idntfcode");
            return (Criteria) this;
        }

        public Criteria andIdntfcodeLessThan(Integer value) {
            addCriterion("IdntfCode <", value, "idntfcode");
            return (Criteria) this;
        }

        public Criteria andIdntfcodeLessThanOrEqualTo(Integer value) {
            addCriterion("IdntfCode <=", value, "idntfcode");
            return (Criteria) this;
        }

        public Criteria andIdntfcodeIn(List<Integer> values) {
            addCriterion("IdntfCode in", values, "idntfcode");
            return (Criteria) this;
        }

        public Criteria andIdntfcodeNotIn(List<Integer> values) {
            addCriterion("IdntfCode not in", values, "idntfcode");
            return (Criteria) this;
        }

        public Criteria andIdntfcodeBetween(Integer value1, Integer value2) {
            addCriterion("IdntfCode between", value1, value2, "idntfcode");
            return (Criteria) this;
        }

        public Criteria andIdntfcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("IdntfCode not between", value1, value2, "idntfcode");
            return (Criteria) this;
        }

        public Criteria andIdntfcodecrtimeIsNull() {
            addCriterion("IdntfCodeCrTime is null");
            return (Criteria) this;
        }

        public Criteria andIdntfcodecrtimeIsNotNull() {
            addCriterion("IdntfCodeCrTime is not null");
            return (Criteria) this;
        }

        public Criteria andIdntfcodecrtimeEqualTo(Date value) {
            addCriterion("IdntfCodeCrTime =", value, "idntfcodecrtime");
            return (Criteria) this;
        }

        public Criteria andIdntfcodecrtimeNotEqualTo(Date value) {
            addCriterion("IdntfCodeCrTime <>", value, "idntfcodecrtime");
            return (Criteria) this;
        }

        public Criteria andIdntfcodecrtimeGreaterThan(Date value) {
            addCriterion("IdntfCodeCrTime >", value, "idntfcodecrtime");
            return (Criteria) this;
        }

        public Criteria andIdntfcodecrtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("IdntfCodeCrTime >=", value, "idntfcodecrtime");
            return (Criteria) this;
        }

        public Criteria andIdntfcodecrtimeLessThan(Date value) {
            addCriterion("IdntfCodeCrTime <", value, "idntfcodecrtime");
            return (Criteria) this;
        }

        public Criteria andIdntfcodecrtimeLessThanOrEqualTo(Date value) {
            addCriterion("IdntfCodeCrTime <=", value, "idntfcodecrtime");
            return (Criteria) this;
        }

        public Criteria andIdntfcodecrtimeIn(List<Date> values) {
            addCriterion("IdntfCodeCrTime in", values, "idntfcodecrtime");
            return (Criteria) this;
        }

        public Criteria andIdntfcodecrtimeNotIn(List<Date> values) {
            addCriterion("IdntfCodeCrTime not in", values, "idntfcodecrtime");
            return (Criteria) this;
        }

        public Criteria andIdntfcodecrtimeBetween(Date value1, Date value2) {
            addCriterion("IdntfCodeCrTime between", value1, value2, "idntfcodecrtime");
            return (Criteria) this;
        }

        public Criteria andIdntfcodecrtimeNotBetween(Date value1, Date value2) {
            addCriterion("IdntfCodeCrTime not between", value1, value2, "idntfcodecrtime");
            return (Criteria) this;
        }

        public Criteria andYbalanceIsNull() {
            addCriterion("YBalance is null");
            return (Criteria) this;
        }

        public Criteria andYbalanceIsNotNull() {
            addCriterion("YBalance is not null");
            return (Criteria) this;
        }

        public Criteria andYbalanceEqualTo(BigDecimal value) {
            addCriterion("YBalance =", value, "ybalance");
            return (Criteria) this;
        }

        public Criteria andYbalanceNotEqualTo(BigDecimal value) {
            addCriterion("YBalance <>", value, "ybalance");
            return (Criteria) this;
        }

        public Criteria andYbalanceGreaterThan(BigDecimal value) {
            addCriterion("YBalance >", value, "ybalance");
            return (Criteria) this;
        }

        public Criteria andYbalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YBalance >=", value, "ybalance");
            return (Criteria) this;
        }

        public Criteria andYbalanceLessThan(BigDecimal value) {
            addCriterion("YBalance <", value, "ybalance");
            return (Criteria) this;
        }

        public Criteria andYbalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YBalance <=", value, "ybalance");
            return (Criteria) this;
        }

        public Criteria andYbalanceIn(List<BigDecimal> values) {
            addCriterion("YBalance in", values, "ybalance");
            return (Criteria) this;
        }

        public Criteria andYbalanceNotIn(List<BigDecimal> values) {
            addCriterion("YBalance not in", values, "ybalance");
            return (Criteria) this;
        }

        public Criteria andYbalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YBalance between", value1, value2, "ybalance");
            return (Criteria) this;
        }

        public Criteria andYbalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YBalance not between", value1, value2, "ybalance");
            return (Criteria) this;
        }

        public Criteria andIsmemberIsNull() {
            addCriterion("IsMember is null");
            return (Criteria) this;
        }

        public Criteria andIsmemberIsNotNull() {
            addCriterion("IsMember is not null");
            return (Criteria) this;
        }

        public Criteria andIsmemberEqualTo(Boolean value) {
            addCriterion("IsMember =", value, "ismember");
            return (Criteria) this;
        }

        public Criteria andIsmemberNotEqualTo(Boolean value) {
            addCriterion("IsMember <>", value, "ismember");
            return (Criteria) this;
        }

        public Criteria andIsmemberGreaterThan(Boolean value) {
            addCriterion("IsMember >", value, "ismember");
            return (Criteria) this;
        }

        public Criteria andIsmemberGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsMember >=", value, "ismember");
            return (Criteria) this;
        }

        public Criteria andIsmemberLessThan(Boolean value) {
            addCriterion("IsMember <", value, "ismember");
            return (Criteria) this;
        }

        public Criteria andIsmemberLessThanOrEqualTo(Boolean value) {
            addCriterion("IsMember <=", value, "ismember");
            return (Criteria) this;
        }

        public Criteria andIsmemberIn(List<Boolean> values) {
            addCriterion("IsMember in", values, "ismember");
            return (Criteria) this;
        }

        public Criteria andIsmemberNotIn(List<Boolean> values) {
            addCriterion("IsMember not in", values, "ismember");
            return (Criteria) this;
        }

        public Criteria andIsmemberBetween(Boolean value1, Boolean value2) {
            addCriterion("IsMember between", value1, value2, "ismember");
            return (Criteria) this;
        }

        public Criteria andIsmemberNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsMember not between", value1, value2, "ismember");
            return (Criteria) this;
        }

        public Criteria andIpsIdIsNull() {
            addCriterion("Ips_Id is null");
            return (Criteria) this;
        }

        public Criteria andIpsIdIsNotNull() {
            addCriterion("Ips_Id is not null");
            return (Criteria) this;
        }

        public Criteria andIpsIdEqualTo(String value) {
            addCriterion("Ips_Id =", value, "ipsId");
            return (Criteria) this;
        }

        public Criteria andIpsIdNotEqualTo(String value) {
            addCriterion("Ips_Id <>", value, "ipsId");
            return (Criteria) this;
        }

        public Criteria andIpsIdGreaterThan(String value) {
            addCriterion("Ips_Id >", value, "ipsId");
            return (Criteria) this;
        }

        public Criteria andIpsIdGreaterThanOrEqualTo(String value) {
            addCriterion("Ips_Id >=", value, "ipsId");
            return (Criteria) this;
        }

        public Criteria andIpsIdLessThan(String value) {
            addCriterion("Ips_Id <", value, "ipsId");
            return (Criteria) this;
        }

        public Criteria andIpsIdLessThanOrEqualTo(String value) {
            addCriterion("Ips_Id <=", value, "ipsId");
            return (Criteria) this;
        }

        public Criteria andIpsIdLike(String value) {
            addCriterion("Ips_Id like", value, "ipsId");
            return (Criteria) this;
        }

        public Criteria andIpsIdNotLike(String value) {
            addCriterion("Ips_Id not like", value, "ipsId");
            return (Criteria) this;
        }

        public Criteria andIpsIdIn(List<String> values) {
            addCriterion("Ips_Id in", values, "ipsId");
            return (Criteria) this;
        }

        public Criteria andIpsIdNotIn(List<String> values) {
            addCriterion("Ips_Id not in", values, "ipsId");
            return (Criteria) this;
        }

        public Criteria andIpsIdBetween(String value1, String value2) {
            addCriterion("Ips_Id between", value1, value2, "ipsId");
            return (Criteria) this;
        }

        public Criteria andIpsIdNotBetween(String value1, String value2) {
            addCriterion("Ips_Id not between", value1, value2, "ipsId");
            return (Criteria) this;
        }

        public Criteria andIpsUsrcustidIsNull() {
            addCriterion("Ips_usrCustId is null");
            return (Criteria) this;
        }

        public Criteria andIpsUsrcustidIsNotNull() {
            addCriterion("Ips_usrCustId is not null");
            return (Criteria) this;
        }

        public Criteria andIpsUsrcustidEqualTo(String value) {
            addCriterion("Ips_usrCustId =", value, "ipsUsrcustid");
            return (Criteria) this;
        }

        public Criteria andIpsUsrcustidNotEqualTo(String value) {
            addCriterion("Ips_usrCustId <>", value, "ipsUsrcustid");
            return (Criteria) this;
        }

        public Criteria andIpsUsrcustidGreaterThan(String value) {
            addCriterion("Ips_usrCustId >", value, "ipsUsrcustid");
            return (Criteria) this;
        }

        public Criteria andIpsUsrcustidGreaterThanOrEqualTo(String value) {
            addCriterion("Ips_usrCustId >=", value, "ipsUsrcustid");
            return (Criteria) this;
        }

        public Criteria andIpsUsrcustidLessThan(String value) {
            addCriterion("Ips_usrCustId <", value, "ipsUsrcustid");
            return (Criteria) this;
        }

        public Criteria andIpsUsrcustidLessThanOrEqualTo(String value) {
            addCriterion("Ips_usrCustId <=", value, "ipsUsrcustid");
            return (Criteria) this;
        }

        public Criteria andIpsUsrcustidLike(String value) {
            addCriterion("Ips_usrCustId like", value, "ipsUsrcustid");
            return (Criteria) this;
        }

        public Criteria andIpsUsrcustidNotLike(String value) {
            addCriterion("Ips_usrCustId not like", value, "ipsUsrcustid");
            return (Criteria) this;
        }

        public Criteria andIpsUsrcustidIn(List<String> values) {
            addCriterion("Ips_usrCustId in", values, "ipsUsrcustid");
            return (Criteria) this;
        }

        public Criteria andIpsUsrcustidNotIn(List<String> values) {
            addCriterion("Ips_usrCustId not in", values, "ipsUsrcustid");
            return (Criteria) this;
        }

        public Criteria andIpsUsrcustidBetween(String value1, String value2) {
            addCriterion("Ips_usrCustId between", value1, value2, "ipsUsrcustid");
            return (Criteria) this;
        }

        public Criteria andIpsUsrcustidNotBetween(String value1, String value2) {
            addCriterion("Ips_usrCustId not between", value1, value2, "ipsUsrcustid");
            return (Criteria) this;
        }

        public Criteria andDevicetokenIsNull() {
            addCriterion("DeviceToken is null");
            return (Criteria) this;
        }

        public Criteria andDevicetokenIsNotNull() {
            addCriterion("DeviceToken is not null");
            return (Criteria) this;
        }

        public Criteria andDevicetokenEqualTo(String value) {
            addCriterion("DeviceToken =", value, "devicetoken");
            return (Criteria) this;
        }

        public Criteria andDevicetokenNotEqualTo(String value) {
            addCriterion("DeviceToken <>", value, "devicetoken");
            return (Criteria) this;
        }

        public Criteria andDevicetokenGreaterThan(String value) {
            addCriterion("DeviceToken >", value, "devicetoken");
            return (Criteria) this;
        }

        public Criteria andDevicetokenGreaterThanOrEqualTo(String value) {
            addCriterion("DeviceToken >=", value, "devicetoken");
            return (Criteria) this;
        }

        public Criteria andDevicetokenLessThan(String value) {
            addCriterion("DeviceToken <", value, "devicetoken");
            return (Criteria) this;
        }

        public Criteria andDevicetokenLessThanOrEqualTo(String value) {
            addCriterion("DeviceToken <=", value, "devicetoken");
            return (Criteria) this;
        }

        public Criteria andDevicetokenLike(String value) {
            addCriterion("DeviceToken like", value, "devicetoken");
            return (Criteria) this;
        }

        public Criteria andDevicetokenNotLike(String value) {
            addCriterion("DeviceToken not like", value, "devicetoken");
            return (Criteria) this;
        }

        public Criteria andDevicetokenIn(List<String> values) {
            addCriterion("DeviceToken in", values, "devicetoken");
            return (Criteria) this;
        }

        public Criteria andDevicetokenNotIn(List<String> values) {
            addCriterion("DeviceToken not in", values, "devicetoken");
            return (Criteria) this;
        }

        public Criteria andDevicetokenBetween(String value1, String value2) {
            addCriterion("DeviceToken between", value1, value2, "devicetoken");
            return (Criteria) this;
        }

        public Criteria andDevicetokenNotBetween(String value1, String value2) {
            addCriterion("DeviceToken not between", value1, value2, "devicetoken");
            return (Criteria) this;
        }

        public Criteria andFreewithdrawalsIsNull() {
            addCriterion("FreeWithdrawals is null");
            return (Criteria) this;
        }

        public Criteria andFreewithdrawalsIsNotNull() {
            addCriterion("FreeWithdrawals is not null");
            return (Criteria) this;
        }

        public Criteria andFreewithdrawalsEqualTo(Integer value) {
            addCriterion("FreeWithdrawals =", value, "freewithdrawals");
            return (Criteria) this;
        }

        public Criteria andFreewithdrawalsNotEqualTo(Integer value) {
            addCriterion("FreeWithdrawals <>", value, "freewithdrawals");
            return (Criteria) this;
        }

        public Criteria andFreewithdrawalsGreaterThan(Integer value) {
            addCriterion("FreeWithdrawals >", value, "freewithdrawals");
            return (Criteria) this;
        }

        public Criteria andFreewithdrawalsGreaterThanOrEqualTo(Integer value) {
            addCriterion("FreeWithdrawals >=", value, "freewithdrawals");
            return (Criteria) this;
        }

        public Criteria andFreewithdrawalsLessThan(Integer value) {
            addCriterion("FreeWithdrawals <", value, "freewithdrawals");
            return (Criteria) this;
        }

        public Criteria andFreewithdrawalsLessThanOrEqualTo(Integer value) {
            addCriterion("FreeWithdrawals <=", value, "freewithdrawals");
            return (Criteria) this;
        }

        public Criteria andFreewithdrawalsIn(List<Integer> values) {
            addCriterion("FreeWithdrawals in", values, "freewithdrawals");
            return (Criteria) this;
        }

        public Criteria andFreewithdrawalsNotIn(List<Integer> values) {
            addCriterion("FreeWithdrawals not in", values, "freewithdrawals");
            return (Criteria) this;
        }

        public Criteria andFreewithdrawalsBetween(Integer value1, Integer value2) {
            addCriterion("FreeWithdrawals between", value1, value2, "freewithdrawals");
            return (Criteria) this;
        }

        public Criteria andFreewithdrawalsNotBetween(Integer value1, Integer value2) {
            addCriterion("FreeWithdrawals not between", value1, value2, "freewithdrawals");
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
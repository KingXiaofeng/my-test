package com.yhb.bean.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FinanceproductsUsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinanceproductsUsersExample() {
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

        public Criteria andFpuidIsNull() {
            addCriterion("FPUID is null");
            return (Criteria) this;
        }

        public Criteria andFpuidIsNotNull() {
            addCriterion("FPUID is not null");
            return (Criteria) this;
        }

        public Criteria andFpuidEqualTo(Integer value) {
            addCriterion("FPUID =", value, "fpuid");
            return (Criteria) this;
        }

        public Criteria andFpuidNotEqualTo(Integer value) {
            addCriterion("FPUID <>", value, "fpuid");
            return (Criteria) this;
        }

        public Criteria andFpuidGreaterThan(Integer value) {
            addCriterion("FPUID >", value, "fpuid");
            return (Criteria) this;
        }

        public Criteria andFpuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FPUID >=", value, "fpuid");
            return (Criteria) this;
        }

        public Criteria andFpuidLessThan(Integer value) {
            addCriterion("FPUID <", value, "fpuid");
            return (Criteria) this;
        }

        public Criteria andFpuidLessThanOrEqualTo(Integer value) {
            addCriterion("FPUID <=", value, "fpuid");
            return (Criteria) this;
        }

        public Criteria andFpuidIn(List<Integer> values) {
            addCriterion("FPUID in", values, "fpuid");
            return (Criteria) this;
        }

        public Criteria andFpuidNotIn(List<Integer> values) {
            addCriterion("FPUID not in", values, "fpuid");
            return (Criteria) this;
        }

        public Criteria andFpuidBetween(Integer value1, Integer value2) {
            addCriterion("FPUID between", value1, value2, "fpuid");
            return (Criteria) this;
        }

        public Criteria andFpuidNotBetween(Integer value1, Integer value2) {
            addCriterion("FPUID not between", value1, value2, "fpuid");
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

        public Criteria andFpidIsNull() {
            addCriterion("FPid is null");
            return (Criteria) this;
        }

        public Criteria andFpidIsNotNull() {
            addCriterion("FPid is not null");
            return (Criteria) this;
        }

        public Criteria andFpidEqualTo(Integer value) {
            addCriterion("FPid =", value, "fpid");
            return (Criteria) this;
        }

        public Criteria andFpidNotEqualTo(Integer value) {
            addCriterion("FPid <>", value, "fpid");
            return (Criteria) this;
        }

        public Criteria andFpidGreaterThan(Integer value) {
            addCriterion("FPid >", value, "fpid");
            return (Criteria) this;
        }

        public Criteria andFpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FPid >=", value, "fpid");
            return (Criteria) this;
        }

        public Criteria andFpidLessThan(Integer value) {
            addCriterion("FPid <", value, "fpid");
            return (Criteria) this;
        }

        public Criteria andFpidLessThanOrEqualTo(Integer value) {
            addCriterion("FPid <=", value, "fpid");
            return (Criteria) this;
        }

        public Criteria andFpidIn(List<Integer> values) {
            addCriterion("FPid in", values, "fpid");
            return (Criteria) this;
        }

        public Criteria andFpidNotIn(List<Integer> values) {
            addCriterion("FPid not in", values, "fpid");
            return (Criteria) this;
        }

        public Criteria andFpidBetween(Integer value1, Integer value2) {
            addCriterion("FPid between", value1, value2, "fpid");
            return (Criteria) this;
        }

        public Criteria andFpidNotBetween(Integer value1, Integer value2) {
            addCriterion("FPid not between", value1, value2, "fpid");
            return (Criteria) this;
        }

        public Criteria andFproductsnameIsNull() {
            addCriterion("FProductsName is null");
            return (Criteria) this;
        }

        public Criteria andFproductsnameIsNotNull() {
            addCriterion("FProductsName is not null");
            return (Criteria) this;
        }

        public Criteria andFproductsnameEqualTo(String value) {
            addCriterion("FProductsName =", value, "fproductsname");
            return (Criteria) this;
        }

        public Criteria andFproductsnameNotEqualTo(String value) {
            addCriterion("FProductsName <>", value, "fproductsname");
            return (Criteria) this;
        }

        public Criteria andFproductsnameGreaterThan(String value) {
            addCriterion("FProductsName >", value, "fproductsname");
            return (Criteria) this;
        }

        public Criteria andFproductsnameGreaterThanOrEqualTo(String value) {
            addCriterion("FProductsName >=", value, "fproductsname");
            return (Criteria) this;
        }

        public Criteria andFproductsnameLessThan(String value) {
            addCriterion("FProductsName <", value, "fproductsname");
            return (Criteria) this;
        }

        public Criteria andFproductsnameLessThanOrEqualTo(String value) {
            addCriterion("FProductsName <=", value, "fproductsname");
            return (Criteria) this;
        }

        public Criteria andFproductsnameLike(String value) {
            addCriterion("FProductsName like", value, "fproductsname");
            return (Criteria) this;
        }

        public Criteria andFproductsnameNotLike(String value) {
            addCriterion("FProductsName not like", value, "fproductsname");
            return (Criteria) this;
        }

        public Criteria andFproductsnameIn(List<String> values) {
            addCriterion("FProductsName in", values, "fproductsname");
            return (Criteria) this;
        }

        public Criteria andFproductsnameNotIn(List<String> values) {
            addCriterion("FProductsName not in", values, "fproductsname");
            return (Criteria) this;
        }

        public Criteria andFproductsnameBetween(String value1, String value2) {
            addCriterion("FProductsName between", value1, value2, "fproductsname");
            return (Criteria) this;
        }

        public Criteria andFproductsnameNotBetween(String value1, String value2) {
            addCriterion("FProductsName not between", value1, value2, "fproductsname");
            return (Criteria) this;
        }

        public Criteria andFproductsratesIsNull() {
            addCriterion("FProductsRates is null");
            return (Criteria) this;
        }

        public Criteria andFproductsratesIsNotNull() {
            addCriterion("FProductsRates is not null");
            return (Criteria) this;
        }

        public Criteria andFproductsratesEqualTo(Float value) {
            addCriterion("FProductsRates =", value, "fproductsrates");
            return (Criteria) this;
        }

        public Criteria andFproductsratesNotEqualTo(Float value) {
            addCriterion("FProductsRates <>", value, "fproductsrates");
            return (Criteria) this;
        }

        public Criteria andFproductsratesGreaterThan(Float value) {
            addCriterion("FProductsRates >", value, "fproductsrates");
            return (Criteria) this;
        }

        public Criteria andFproductsratesGreaterThanOrEqualTo(Float value) {
            addCriterion("FProductsRates >=", value, "fproductsrates");
            return (Criteria) this;
        }

        public Criteria andFproductsratesLessThan(Float value) {
            addCriterion("FProductsRates <", value, "fproductsrates");
            return (Criteria) this;
        }

        public Criteria andFproductsratesLessThanOrEqualTo(Float value) {
            addCriterion("FProductsRates <=", value, "fproductsrates");
            return (Criteria) this;
        }

        public Criteria andFproductsratesIn(List<Float> values) {
            addCriterion("FProductsRates in", values, "fproductsrates");
            return (Criteria) this;
        }

        public Criteria andFproductsratesNotIn(List<Float> values) {
            addCriterion("FProductsRates not in", values, "fproductsrates");
            return (Criteria) this;
        }

        public Criteria andFproductsratesBetween(Float value1, Float value2) {
            addCriterion("FProductsRates between", value1, value2, "fproductsrates");
            return (Criteria) this;
        }

        public Criteria andFproductsratesNotBetween(Float value1, Float value2) {
            addCriterion("FProductsRates not between", value1, value2, "fproductsrates");
            return (Criteria) this;
        }

        public Criteria andFproductsbuymoneyIsNull() {
            addCriterion("FProductsBuyMoney is null");
            return (Criteria) this;
        }

        public Criteria andFproductsbuymoneyIsNotNull() {
            addCriterion("FProductsBuyMoney is not null");
            return (Criteria) this;
        }

        public Criteria andFproductsbuymoneyEqualTo(BigDecimal value) {
            addCriterion("FProductsBuyMoney =", value, "fproductsbuymoney");
            return (Criteria) this;
        }

        public Criteria andFproductsbuymoneyNotEqualTo(BigDecimal value) {
            addCriterion("FProductsBuyMoney <>", value, "fproductsbuymoney");
            return (Criteria) this;
        }

        public Criteria andFproductsbuymoneyGreaterThan(BigDecimal value) {
            addCriterion("FProductsBuyMoney >", value, "fproductsbuymoney");
            return (Criteria) this;
        }

        public Criteria andFproductsbuymoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FProductsBuyMoney >=", value, "fproductsbuymoney");
            return (Criteria) this;
        }

        public Criteria andFproductsbuymoneyLessThan(BigDecimal value) {
            addCriterion("FProductsBuyMoney <", value, "fproductsbuymoney");
            return (Criteria) this;
        }

        public Criteria andFproductsbuymoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FProductsBuyMoney <=", value, "fproductsbuymoney");
            return (Criteria) this;
        }

        public Criteria andFproductsbuymoneyIn(List<BigDecimal> values) {
            addCriterion("FProductsBuyMoney in", values, "fproductsbuymoney");
            return (Criteria) this;
        }

        public Criteria andFproductsbuymoneyNotIn(List<BigDecimal> values) {
            addCriterion("FProductsBuyMoney not in", values, "fproductsbuymoney");
            return (Criteria) this;
        }

        public Criteria andFproductsbuymoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FProductsBuyMoney between", value1, value2, "fproductsbuymoney");
            return (Criteria) this;
        }

        public Criteria andFproductsbuymoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FProductsBuyMoney not between", value1, value2, "fproductsbuymoney");
            return (Criteria) this;
        }

        public Criteria andFproductsbuytimeIsNull() {
            addCriterion("FProductsBuyTime is null");
            return (Criteria) this;
        }

        public Criteria andFproductsbuytimeIsNotNull() {
            addCriterion("FProductsBuyTime is not null");
            return (Criteria) this;
        }

        public Criteria andFproductsbuytimeEqualTo(Date value) {
            addCriterion("FProductsBuyTime =", value, "fproductsbuytime");
            return (Criteria) this;
        }

        public Criteria andFproductsbuytimeNotEqualTo(Date value) {
            addCriterion("FProductsBuyTime <>", value, "fproductsbuytime");
            return (Criteria) this;
        }

        public Criteria andFproductsbuytimeGreaterThan(Date value) {
            addCriterion("FProductsBuyTime >", value, "fproductsbuytime");
            return (Criteria) this;
        }

        public Criteria andFproductsbuytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FProductsBuyTime >=", value, "fproductsbuytime");
            return (Criteria) this;
        }

        public Criteria andFproductsbuytimeLessThan(Date value) {
            addCriterion("FProductsBuyTime <", value, "fproductsbuytime");
            return (Criteria) this;
        }

        public Criteria andFproductsbuytimeLessThanOrEqualTo(Date value) {
            addCriterion("FProductsBuyTime <=", value, "fproductsbuytime");
            return (Criteria) this;
        }

        public Criteria andFproductsbuytimeIn(List<Date> values) {
            addCriterion("FProductsBuyTime in", values, "fproductsbuytime");
            return (Criteria) this;
        }

        public Criteria andFproductsbuytimeNotIn(List<Date> values) {
            addCriterion("FProductsBuyTime not in", values, "fproductsbuytime");
            return (Criteria) this;
        }

        public Criteria andFproductsbuytimeBetween(Date value1, Date value2) {
            addCriterion("FProductsBuyTime between", value1, value2, "fproductsbuytime");
            return (Criteria) this;
        }

        public Criteria andFproductsbuytimeNotBetween(Date value1, Date value2) {
            addCriterion("FProductsBuyTime not between", value1, value2, "fproductsbuytime");
            return (Criteria) this;
        }

        public Criteria andFproductsrateinnumIsNull() {
            addCriterion("FProductsRateInNum is null");
            return (Criteria) this;
        }

        public Criteria andFproductsrateinnumIsNotNull() {
            addCriterion("FProductsRateInNum is not null");
            return (Criteria) this;
        }

        public Criteria andFproductsrateinnumEqualTo(Integer value) {
            addCriterion("FProductsRateInNum =", value, "fproductsrateinnum");
            return (Criteria) this;
        }

        public Criteria andFproductsrateinnumNotEqualTo(Integer value) {
            addCriterion("FProductsRateInNum <>", value, "fproductsrateinnum");
            return (Criteria) this;
        }

        public Criteria andFproductsrateinnumGreaterThan(Integer value) {
            addCriterion("FProductsRateInNum >", value, "fproductsrateinnum");
            return (Criteria) this;
        }

        public Criteria andFproductsrateinnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("FProductsRateInNum >=", value, "fproductsrateinnum");
            return (Criteria) this;
        }

        public Criteria andFproductsrateinnumLessThan(Integer value) {
            addCriterion("FProductsRateInNum <", value, "fproductsrateinnum");
            return (Criteria) this;
        }

        public Criteria andFproductsrateinnumLessThanOrEqualTo(Integer value) {
            addCriterion("FProductsRateInNum <=", value, "fproductsrateinnum");
            return (Criteria) this;
        }

        public Criteria andFproductsrateinnumIn(List<Integer> values) {
            addCriterion("FProductsRateInNum in", values, "fproductsrateinnum");
            return (Criteria) this;
        }

        public Criteria andFproductsrateinnumNotIn(List<Integer> values) {
            addCriterion("FProductsRateInNum not in", values, "fproductsrateinnum");
            return (Criteria) this;
        }

        public Criteria andFproductsrateinnumBetween(Integer value1, Integer value2) {
            addCriterion("FProductsRateInNum between", value1, value2, "fproductsrateinnum");
            return (Criteria) this;
        }

        public Criteria andFproductsrateinnumNotBetween(Integer value1, Integer value2) {
            addCriterion("FProductsRateInNum not between", value1, value2, "fproductsrateinnum");
            return (Criteria) this;
        }

        public Criteria andFproductsextractnumIsNull() {
            addCriterion("FProductsExtractNum is null");
            return (Criteria) this;
        }

        public Criteria andFproductsextractnumIsNotNull() {
            addCriterion("FProductsExtractNum is not null");
            return (Criteria) this;
        }

        public Criteria andFproductsextractnumEqualTo(Integer value) {
            addCriterion("FProductsExtractNum =", value, "fproductsextractnum");
            return (Criteria) this;
        }

        public Criteria andFproductsextractnumNotEqualTo(Integer value) {
            addCriterion("FProductsExtractNum <>", value, "fproductsextractnum");
            return (Criteria) this;
        }

        public Criteria andFproductsextractnumGreaterThan(Integer value) {
            addCriterion("FProductsExtractNum >", value, "fproductsextractnum");
            return (Criteria) this;
        }

        public Criteria andFproductsextractnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("FProductsExtractNum >=", value, "fproductsextractnum");
            return (Criteria) this;
        }

        public Criteria andFproductsextractnumLessThan(Integer value) {
            addCriterion("FProductsExtractNum <", value, "fproductsextractnum");
            return (Criteria) this;
        }

        public Criteria andFproductsextractnumLessThanOrEqualTo(Integer value) {
            addCriterion("FProductsExtractNum <=", value, "fproductsextractnum");
            return (Criteria) this;
        }

        public Criteria andFproductsextractnumIn(List<Integer> values) {
            addCriterion("FProductsExtractNum in", values, "fproductsextractnum");
            return (Criteria) this;
        }

        public Criteria andFproductsextractnumNotIn(List<Integer> values) {
            addCriterion("FProductsExtractNum not in", values, "fproductsextractnum");
            return (Criteria) this;
        }

        public Criteria andFproductsextractnumBetween(Integer value1, Integer value2) {
            addCriterion("FProductsExtractNum between", value1, value2, "fproductsextractnum");
            return (Criteria) this;
        }

        public Criteria andFproductsextractnumNotBetween(Integer value1, Integer value2) {
            addCriterion("FProductsExtractNum not between", value1, value2, "fproductsextractnum");
            return (Criteria) this;
        }

        public Criteria andFproductsoutmoneyIsNull() {
            addCriterion("FProductsOutMoney is null");
            return (Criteria) this;
        }

        public Criteria andFproductsoutmoneyIsNotNull() {
            addCriterion("FProductsOutMoney is not null");
            return (Criteria) this;
        }

        public Criteria andFproductsoutmoneyEqualTo(Float value) {
            addCriterion("FProductsOutMoney =", value, "fproductsoutmoney");
            return (Criteria) this;
        }

        public Criteria andFproductsoutmoneyNotEqualTo(Float value) {
            addCriterion("FProductsOutMoney <>", value, "fproductsoutmoney");
            return (Criteria) this;
        }

        public Criteria andFproductsoutmoneyGreaterThan(Float value) {
            addCriterion("FProductsOutMoney >", value, "fproductsoutmoney");
            return (Criteria) this;
        }

        public Criteria andFproductsoutmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("FProductsOutMoney >=", value, "fproductsoutmoney");
            return (Criteria) this;
        }

        public Criteria andFproductsoutmoneyLessThan(Float value) {
            addCriterion("FProductsOutMoney <", value, "fproductsoutmoney");
            return (Criteria) this;
        }

        public Criteria andFproductsoutmoneyLessThanOrEqualTo(Float value) {
            addCriterion("FProductsOutMoney <=", value, "fproductsoutmoney");
            return (Criteria) this;
        }

        public Criteria andFproductsoutmoneyIn(List<Float> values) {
            addCriterion("FProductsOutMoney in", values, "fproductsoutmoney");
            return (Criteria) this;
        }

        public Criteria andFproductsoutmoneyNotIn(List<Float> values) {
            addCriterion("FProductsOutMoney not in", values, "fproductsoutmoney");
            return (Criteria) this;
        }

        public Criteria andFproductsoutmoneyBetween(Float value1, Float value2) {
            addCriterion("FProductsOutMoney between", value1, value2, "fproductsoutmoney");
            return (Criteria) this;
        }

        public Criteria andFproductsoutmoneyNotBetween(Float value1, Float value2) {
            addCriterion("FProductsOutMoney not between", value1, value2, "fproductsoutmoney");
            return (Criteria) this;
        }

        public Criteria andFproductscountnumIsNull() {
            addCriterion("FProductsCountNum is null");
            return (Criteria) this;
        }

        public Criteria andFproductscountnumIsNotNull() {
            addCriterion("FProductsCountNum is not null");
            return (Criteria) this;
        }

        public Criteria andFproductscountnumEqualTo(Integer value) {
            addCriterion("FProductsCountNum =", value, "fproductscountnum");
            return (Criteria) this;
        }

        public Criteria andFproductscountnumNotEqualTo(Integer value) {
            addCriterion("FProductsCountNum <>", value, "fproductscountnum");
            return (Criteria) this;
        }

        public Criteria andFproductscountnumGreaterThan(Integer value) {
            addCriterion("FProductsCountNum >", value, "fproductscountnum");
            return (Criteria) this;
        }

        public Criteria andFproductscountnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("FProductsCountNum >=", value, "fproductscountnum");
            return (Criteria) this;
        }

        public Criteria andFproductscountnumLessThan(Integer value) {
            addCriterion("FProductsCountNum <", value, "fproductscountnum");
            return (Criteria) this;
        }

        public Criteria andFproductscountnumLessThanOrEqualTo(Integer value) {
            addCriterion("FProductsCountNum <=", value, "fproductscountnum");
            return (Criteria) this;
        }

        public Criteria andFproductscountnumIn(List<Integer> values) {
            addCriterion("FProductsCountNum in", values, "fproductscountnum");
            return (Criteria) this;
        }

        public Criteria andFproductscountnumNotIn(List<Integer> values) {
            addCriterion("FProductsCountNum not in", values, "fproductscountnum");
            return (Criteria) this;
        }

        public Criteria andFproductscountnumBetween(Integer value1, Integer value2) {
            addCriterion("FProductsCountNum between", value1, value2, "fproductscountnum");
            return (Criteria) this;
        }

        public Criteria andFproductscountnumNotBetween(Integer value1, Integer value2) {
            addCriterion("FProductsCountNum not between", value1, value2, "fproductscountnum");
            return (Criteria) this;
        }

        public Criteria andFproductsratemoneyIsNull() {
            addCriterion("FProductsRateMoney is null");
            return (Criteria) this;
        }

        public Criteria andFproductsratemoneyIsNotNull() {
            addCriterion("FProductsRateMoney is not null");
            return (Criteria) this;
        }

        public Criteria andFproductsratemoneyEqualTo(BigDecimal value) {
            addCriterion("FProductsRateMoney =", value, "fproductsratemoney");
            return (Criteria) this;
        }

        public Criteria andFproductsratemoneyNotEqualTo(BigDecimal value) {
            addCriterion("FProductsRateMoney <>", value, "fproductsratemoney");
            return (Criteria) this;
        }

        public Criteria andFproductsratemoneyGreaterThan(BigDecimal value) {
            addCriterion("FProductsRateMoney >", value, "fproductsratemoney");
            return (Criteria) this;
        }

        public Criteria andFproductsratemoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FProductsRateMoney >=", value, "fproductsratemoney");
            return (Criteria) this;
        }

        public Criteria andFproductsratemoneyLessThan(BigDecimal value) {
            addCriterion("FProductsRateMoney <", value, "fproductsratemoney");
            return (Criteria) this;
        }

        public Criteria andFproductsratemoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FProductsRateMoney <=", value, "fproductsratemoney");
            return (Criteria) this;
        }

        public Criteria andFproductsratemoneyIn(List<BigDecimal> values) {
            addCriterion("FProductsRateMoney in", values, "fproductsratemoney");
            return (Criteria) this;
        }

        public Criteria andFproductsratemoneyNotIn(List<BigDecimal> values) {
            addCriterion("FProductsRateMoney not in", values, "fproductsratemoney");
            return (Criteria) this;
        }

        public Criteria andFproductsratemoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FProductsRateMoney between", value1, value2, "fproductsratemoney");
            return (Criteria) this;
        }

        public Criteria andFproductsratemoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FProductsRateMoney not between", value1, value2, "fproductsratemoney");
            return (Criteria) this;
        }

        public Criteria andFproductscountratemoneyIsNull() {
            addCriterion("FProductsCountRateMoney is null");
            return (Criteria) this;
        }

        public Criteria andFproductscountratemoneyIsNotNull() {
            addCriterion("FProductsCountRateMoney is not null");
            return (Criteria) this;
        }

        public Criteria andFproductscountratemoneyEqualTo(BigDecimal value) {
            addCriterion("FProductsCountRateMoney =", value, "fproductscountratemoney");
            return (Criteria) this;
        }

        public Criteria andFproductscountratemoneyNotEqualTo(BigDecimal value) {
            addCriterion("FProductsCountRateMoney <>", value, "fproductscountratemoney");
            return (Criteria) this;
        }

        public Criteria andFproductscountratemoneyGreaterThan(BigDecimal value) {
            addCriterion("FProductsCountRateMoney >", value, "fproductscountratemoney");
            return (Criteria) this;
        }

        public Criteria andFproductscountratemoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FProductsCountRateMoney >=", value, "fproductscountratemoney");
            return (Criteria) this;
        }

        public Criteria andFproductscountratemoneyLessThan(BigDecimal value) {
            addCriterion("FProductsCountRateMoney <", value, "fproductscountratemoney");
            return (Criteria) this;
        }

        public Criteria andFproductscountratemoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FProductsCountRateMoney <=", value, "fproductscountratemoney");
            return (Criteria) this;
        }

        public Criteria andFproductscountratemoneyIn(List<BigDecimal> values) {
            addCriterion("FProductsCountRateMoney in", values, "fproductscountratemoney");
            return (Criteria) this;
        }

        public Criteria andFproductscountratemoneyNotIn(List<BigDecimal> values) {
            addCriterion("FProductsCountRateMoney not in", values, "fproductscountratemoney");
            return (Criteria) this;
        }

        public Criteria andFproductscountratemoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FProductsCountRateMoney between", value1, value2, "fproductscountratemoney");
            return (Criteria) this;
        }

        public Criteria andFproductscountratemoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FProductsCountRateMoney not between", value1, value2, "fproductscountratemoney");
            return (Criteria) this;
        }

        public Criteria andMemberratesIsNull() {
            addCriterion("MemberRates is null");
            return (Criteria) this;
        }

        public Criteria andMemberratesIsNotNull() {
            addCriterion("MemberRates is not null");
            return (Criteria) this;
        }

        public Criteria andMemberratesEqualTo(Float value) {
            addCriterion("MemberRates =", value, "memberrates");
            return (Criteria) this;
        }

        public Criteria andMemberratesNotEqualTo(Float value) {
            addCriterion("MemberRates <>", value, "memberrates");
            return (Criteria) this;
        }

        public Criteria andMemberratesGreaterThan(Float value) {
            addCriterion("MemberRates >", value, "memberrates");
            return (Criteria) this;
        }

        public Criteria andMemberratesGreaterThanOrEqualTo(Float value) {
            addCriterion("MemberRates >=", value, "memberrates");
            return (Criteria) this;
        }

        public Criteria andMemberratesLessThan(Float value) {
            addCriterion("MemberRates <", value, "memberrates");
            return (Criteria) this;
        }

        public Criteria andMemberratesLessThanOrEqualTo(Float value) {
            addCriterion("MemberRates <=", value, "memberrates");
            return (Criteria) this;
        }

        public Criteria andMemberratesIn(List<Float> values) {
            addCriterion("MemberRates in", values, "memberrates");
            return (Criteria) this;
        }

        public Criteria andMemberratesNotIn(List<Float> values) {
            addCriterion("MemberRates not in", values, "memberrates");
            return (Criteria) this;
        }

        public Criteria andMemberratesBetween(Float value1, Float value2) {
            addCriterion("MemberRates between", value1, value2, "memberrates");
            return (Criteria) this;
        }

        public Criteria andMemberratesNotBetween(Float value1, Float value2) {
            addCriterion("MemberRates not between", value1, value2, "memberrates");
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
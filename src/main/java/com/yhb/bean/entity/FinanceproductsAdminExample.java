package com.yhb.bean.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FinanceproductsAdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinanceproductsAdminExample() {
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

        public Criteria andFproductsmaxmoneyIsNull() {
            addCriterion("FProductsMaxMoney is null");
            return (Criteria) this;
        }

        public Criteria andFproductsmaxmoneyIsNotNull() {
            addCriterion("FProductsMaxMoney is not null");
            return (Criteria) this;
        }

        public Criteria andFproductsmaxmoneyEqualTo(BigDecimal value) {
            addCriterion("FProductsMaxMoney =", value, "fproductsmaxmoney");
            return (Criteria) this;
        }

        public Criteria andFproductsmaxmoneyNotEqualTo(BigDecimal value) {
            addCriterion("FProductsMaxMoney <>", value, "fproductsmaxmoney");
            return (Criteria) this;
        }

        public Criteria andFproductsmaxmoneyGreaterThan(BigDecimal value) {
            addCriterion("FProductsMaxMoney >", value, "fproductsmaxmoney");
            return (Criteria) this;
        }

        public Criteria andFproductsmaxmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FProductsMaxMoney >=", value, "fproductsmaxmoney");
            return (Criteria) this;
        }

        public Criteria andFproductsmaxmoneyLessThan(BigDecimal value) {
            addCriterion("FProductsMaxMoney <", value, "fproductsmaxmoney");
            return (Criteria) this;
        }

        public Criteria andFproductsmaxmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FProductsMaxMoney <=", value, "fproductsmaxmoney");
            return (Criteria) this;
        }

        public Criteria andFproductsmaxmoneyIn(List<BigDecimal> values) {
            addCriterion("FProductsMaxMoney in", values, "fproductsmaxmoney");
            return (Criteria) this;
        }

        public Criteria andFproductsmaxmoneyNotIn(List<BigDecimal> values) {
            addCriterion("FProductsMaxMoney not in", values, "fproductsmaxmoney");
            return (Criteria) this;
        }

        public Criteria andFproductsmaxmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FProductsMaxMoney between", value1, value2, "fproductsmaxmoney");
            return (Criteria) this;
        }

        public Criteria andFproductsmaxmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FProductsMaxMoney not between", value1, value2, "fproductsmaxmoney");
            return (Criteria) this;
        }

        public Criteria andFproductsmaxwithdrawIsNull() {
            addCriterion("FProductsMaxWithdraw is null");
            return (Criteria) this;
        }

        public Criteria andFproductsmaxwithdrawIsNotNull() {
            addCriterion("FProductsMaxWithdraw is not null");
            return (Criteria) this;
        }

        public Criteria andFproductsmaxwithdrawEqualTo(Float value) {
            addCriterion("FProductsMaxWithdraw =", value, "fproductsmaxwithdraw");
            return (Criteria) this;
        }

        public Criteria andFproductsmaxwithdrawNotEqualTo(Float value) {
            addCriterion("FProductsMaxWithdraw <>", value, "fproductsmaxwithdraw");
            return (Criteria) this;
        }

        public Criteria andFproductsmaxwithdrawGreaterThan(Float value) {
            addCriterion("FProductsMaxWithdraw >", value, "fproductsmaxwithdraw");
            return (Criteria) this;
        }

        public Criteria andFproductsmaxwithdrawGreaterThanOrEqualTo(Float value) {
            addCriterion("FProductsMaxWithdraw >=", value, "fproductsmaxwithdraw");
            return (Criteria) this;
        }

        public Criteria andFproductsmaxwithdrawLessThan(Float value) {
            addCriterion("FProductsMaxWithdraw <", value, "fproductsmaxwithdraw");
            return (Criteria) this;
        }

        public Criteria andFproductsmaxwithdrawLessThanOrEqualTo(Float value) {
            addCriterion("FProductsMaxWithdraw <=", value, "fproductsmaxwithdraw");
            return (Criteria) this;
        }

        public Criteria andFproductsmaxwithdrawIn(List<Float> values) {
            addCriterion("FProductsMaxWithdraw in", values, "fproductsmaxwithdraw");
            return (Criteria) this;
        }

        public Criteria andFproductsmaxwithdrawNotIn(List<Float> values) {
            addCriterion("FProductsMaxWithdraw not in", values, "fproductsmaxwithdraw");
            return (Criteria) this;
        }

        public Criteria andFproductsmaxwithdrawBetween(Float value1, Float value2) {
            addCriterion("FProductsMaxWithdraw between", value1, value2, "fproductsmaxwithdraw");
            return (Criteria) this;
        }

        public Criteria andFproductsmaxwithdrawNotBetween(Float value1, Float value2) {
            addCriterion("FProductsMaxWithdraw not between", value1, value2, "fproductsmaxwithdraw");
            return (Criteria) this;
        }

        public Criteria andFproductsmaxdateIsNull() {
            addCriterion("FProductsMaxDate is null");
            return (Criteria) this;
        }

        public Criteria andFproductsmaxdateIsNotNull() {
            addCriterion("FProductsMaxDate is not null");
            return (Criteria) this;
        }

        public Criteria andFproductsmaxdateEqualTo(Integer value) {
            addCriterion("FProductsMaxDate =", value, "fproductsmaxdate");
            return (Criteria) this;
        }

        public Criteria andFproductsmaxdateNotEqualTo(Integer value) {
            addCriterion("FProductsMaxDate <>", value, "fproductsmaxdate");
            return (Criteria) this;
        }

        public Criteria andFproductsmaxdateGreaterThan(Integer value) {
            addCriterion("FProductsMaxDate >", value, "fproductsmaxdate");
            return (Criteria) this;
        }

        public Criteria andFproductsmaxdateGreaterThanOrEqualTo(Integer value) {
            addCriterion("FProductsMaxDate >=", value, "fproductsmaxdate");
            return (Criteria) this;
        }

        public Criteria andFproductsmaxdateLessThan(Integer value) {
            addCriterion("FProductsMaxDate <", value, "fproductsmaxdate");
            return (Criteria) this;
        }

        public Criteria andFproductsmaxdateLessThanOrEqualTo(Integer value) {
            addCriterion("FProductsMaxDate <=", value, "fproductsmaxdate");
            return (Criteria) this;
        }

        public Criteria andFproductsmaxdateIn(List<Integer> values) {
            addCriterion("FProductsMaxDate in", values, "fproductsmaxdate");
            return (Criteria) this;
        }

        public Criteria andFproductsmaxdateNotIn(List<Integer> values) {
            addCriterion("FProductsMaxDate not in", values, "fproductsmaxdate");
            return (Criteria) this;
        }

        public Criteria andFproductsmaxdateBetween(Integer value1, Integer value2) {
            addCriterion("FProductsMaxDate between", value1, value2, "fproductsmaxdate");
            return (Criteria) this;
        }

        public Criteria andFproductsmaxdateNotBetween(Integer value1, Integer value2) {
            addCriterion("FProductsMaxDate not between", value1, value2, "fproductsmaxdate");
            return (Criteria) this;
        }

        public Criteria andFproductstimesIsNull() {
            addCriterion("FProductsTimes is null");
            return (Criteria) this;
        }

        public Criteria andFproductstimesIsNotNull() {
            addCriterion("FProductsTimes is not null");
            return (Criteria) this;
        }

        public Criteria andFproductstimesEqualTo(Date value) {
            addCriterion("FProductsTimes =", value, "fproductstimes");
            return (Criteria) this;
        }

        public Criteria andFproductstimesNotEqualTo(Date value) {
            addCriterion("FProductsTimes <>", value, "fproductstimes");
            return (Criteria) this;
        }

        public Criteria andFproductstimesGreaterThan(Date value) {
            addCriterion("FProductsTimes >", value, "fproductstimes");
            return (Criteria) this;
        }

        public Criteria andFproductstimesGreaterThanOrEqualTo(Date value) {
            addCriterion("FProductsTimes >=", value, "fproductstimes");
            return (Criteria) this;
        }

        public Criteria andFproductstimesLessThan(Date value) {
            addCriterion("FProductsTimes <", value, "fproductstimes");
            return (Criteria) this;
        }

        public Criteria andFproductstimesLessThanOrEqualTo(Date value) {
            addCriterion("FProductsTimes <=", value, "fproductstimes");
            return (Criteria) this;
        }

        public Criteria andFproductstimesIn(List<Date> values) {
            addCriterion("FProductsTimes in", values, "fproductstimes");
            return (Criteria) this;
        }

        public Criteria andFproductstimesNotIn(List<Date> values) {
            addCriterion("FProductsTimes not in", values, "fproductstimes");
            return (Criteria) this;
        }

        public Criteria andFproductstimesBetween(Date value1, Date value2) {
            addCriterion("FProductsTimes between", value1, value2, "fproductstimes");
            return (Criteria) this;
        }

        public Criteria andFproductstimesNotBetween(Date value1, Date value2) {
            addCriterion("FProductsTimes not between", value1, value2, "fproductstimes");
            return (Criteria) this;
        }

        public Criteria andFproductsstateIsNull() {
            addCriterion("FProductsState is null");
            return (Criteria) this;
        }

        public Criteria andFproductsstateIsNotNull() {
            addCriterion("FProductsState is not null");
            return (Criteria) this;
        }

        public Criteria andFproductsstateEqualTo(Integer value) {
            addCriterion("FProductsState =", value, "fproductsstate");
            return (Criteria) this;
        }

        public Criteria andFproductsstateNotEqualTo(Integer value) {
            addCriterion("FProductsState <>", value, "fproductsstate");
            return (Criteria) this;
        }

        public Criteria andFproductsstateGreaterThan(Integer value) {
            addCriterion("FProductsState >", value, "fproductsstate");
            return (Criteria) this;
        }

        public Criteria andFproductsstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("FProductsState >=", value, "fproductsstate");
            return (Criteria) this;
        }

        public Criteria andFproductsstateLessThan(Integer value) {
            addCriterion("FProductsState <", value, "fproductsstate");
            return (Criteria) this;
        }

        public Criteria andFproductsstateLessThanOrEqualTo(Integer value) {
            addCriterion("FProductsState <=", value, "fproductsstate");
            return (Criteria) this;
        }

        public Criteria andFproductsstateIn(List<Integer> values) {
            addCriterion("FProductsState in", values, "fproductsstate");
            return (Criteria) this;
        }

        public Criteria andFproductsstateNotIn(List<Integer> values) {
            addCriterion("FProductsState not in", values, "fproductsstate");
            return (Criteria) this;
        }

        public Criteria andFproductsstateBetween(Integer value1, Integer value2) {
            addCriterion("FProductsState between", value1, value2, "fproductsstate");
            return (Criteria) this;
        }

        public Criteria andFproductsstateNotBetween(Integer value1, Integer value2) {
            addCriterion("FProductsState not between", value1, value2, "fproductsstate");
            return (Criteria) this;
        }

        public Criteria andFproductsadminmoneyIsNull() {
            addCriterion("FProductsAdminMoney is null");
            return (Criteria) this;
        }

        public Criteria andFproductsadminmoneyIsNotNull() {
            addCriterion("FProductsAdminMoney is not null");
            return (Criteria) this;
        }

        public Criteria andFproductsadminmoneyEqualTo(BigDecimal value) {
            addCriterion("FProductsAdminMoney =", value, "fproductsadminmoney");
            return (Criteria) this;
        }

        public Criteria andFproductsadminmoneyNotEqualTo(BigDecimal value) {
            addCriterion("FProductsAdminMoney <>", value, "fproductsadminmoney");
            return (Criteria) this;
        }

        public Criteria andFproductsadminmoneyGreaterThan(BigDecimal value) {
            addCriterion("FProductsAdminMoney >", value, "fproductsadminmoney");
            return (Criteria) this;
        }

        public Criteria andFproductsadminmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FProductsAdminMoney >=", value, "fproductsadminmoney");
            return (Criteria) this;
        }

        public Criteria andFproductsadminmoneyLessThan(BigDecimal value) {
            addCriterion("FProductsAdminMoney <", value, "fproductsadminmoney");
            return (Criteria) this;
        }

        public Criteria andFproductsadminmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FProductsAdminMoney <=", value, "fproductsadminmoney");
            return (Criteria) this;
        }

        public Criteria andFproductsadminmoneyIn(List<BigDecimal> values) {
            addCriterion("FProductsAdminMoney in", values, "fproductsadminmoney");
            return (Criteria) this;
        }

        public Criteria andFproductsadminmoneyNotIn(List<BigDecimal> values) {
            addCriterion("FProductsAdminMoney not in", values, "fproductsadminmoney");
            return (Criteria) this;
        }

        public Criteria andFproductsadminmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FProductsAdminMoney between", value1, value2, "fproductsadminmoney");
            return (Criteria) this;
        }

        public Criteria andFproductsadminmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FProductsAdminMoney not between", value1, value2, "fproductsadminmoney");
            return (Criteria) this;
        }

        public Criteria andFproductssortIsNull() {
            addCriterion("FProductsSort is null");
            return (Criteria) this;
        }

        public Criteria andFproductssortIsNotNull() {
            addCriterion("FProductsSort is not null");
            return (Criteria) this;
        }

        public Criteria andFproductssortEqualTo(Integer value) {
            addCriterion("FProductsSort =", value, "fproductssort");
            return (Criteria) this;
        }

        public Criteria andFproductssortNotEqualTo(Integer value) {
            addCriterion("FProductsSort <>", value, "fproductssort");
            return (Criteria) this;
        }

        public Criteria andFproductssortGreaterThan(Integer value) {
            addCriterion("FProductsSort >", value, "fproductssort");
            return (Criteria) this;
        }

        public Criteria andFproductssortGreaterThanOrEqualTo(Integer value) {
            addCriterion("FProductsSort >=", value, "fproductssort");
            return (Criteria) this;
        }

        public Criteria andFproductssortLessThan(Integer value) {
            addCriterion("FProductsSort <", value, "fproductssort");
            return (Criteria) this;
        }

        public Criteria andFproductssortLessThanOrEqualTo(Integer value) {
            addCriterion("FProductsSort <=", value, "fproductssort");
            return (Criteria) this;
        }

        public Criteria andFproductssortIn(List<Integer> values) {
            addCriterion("FProductsSort in", values, "fproductssort");
            return (Criteria) this;
        }

        public Criteria andFproductssortNotIn(List<Integer> values) {
            addCriterion("FProductsSort not in", values, "fproductssort");
            return (Criteria) this;
        }

        public Criteria andFproductssortBetween(Integer value1, Integer value2) {
            addCriterion("FProductsSort between", value1, value2, "fproductssort");
            return (Criteria) this;
        }

        public Criteria andFproductssortNotBetween(Integer value1, Integer value2) {
            addCriterion("FProductsSort not between", value1, value2, "fproductssort");
            return (Criteria) this;
        }

        public Criteria andFproductsisdeleteIsNull() {
            addCriterion("FProductsIsDelete is null");
            return (Criteria) this;
        }

        public Criteria andFproductsisdeleteIsNotNull() {
            addCriterion("FProductsIsDelete is not null");
            return (Criteria) this;
        }

        public Criteria andFproductsisdeleteEqualTo(Integer value) {
            addCriterion("FProductsIsDelete =", value, "fproductsisdelete");
            return (Criteria) this;
        }

        public Criteria andFproductsisdeleteNotEqualTo(Integer value) {
            addCriterion("FProductsIsDelete <>", value, "fproductsisdelete");
            return (Criteria) this;
        }

        public Criteria andFproductsisdeleteGreaterThan(Integer value) {
            addCriterion("FProductsIsDelete >", value, "fproductsisdelete");
            return (Criteria) this;
        }

        public Criteria andFproductsisdeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("FProductsIsDelete >=", value, "fproductsisdelete");
            return (Criteria) this;
        }

        public Criteria andFproductsisdeleteLessThan(Integer value) {
            addCriterion("FProductsIsDelete <", value, "fproductsisdelete");
            return (Criteria) this;
        }

        public Criteria andFproductsisdeleteLessThanOrEqualTo(Integer value) {
            addCriterion("FProductsIsDelete <=", value, "fproductsisdelete");
            return (Criteria) this;
        }

        public Criteria andFproductsisdeleteIn(List<Integer> values) {
            addCriterion("FProductsIsDelete in", values, "fproductsisdelete");
            return (Criteria) this;
        }

        public Criteria andFproductsisdeleteNotIn(List<Integer> values) {
            addCriterion("FProductsIsDelete not in", values, "fproductsisdelete");
            return (Criteria) this;
        }

        public Criteria andFproductsisdeleteBetween(Integer value1, Integer value2) {
            addCriterion("FProductsIsDelete between", value1, value2, "fproductsisdelete");
            return (Criteria) this;
        }

        public Criteria andFproductsisdeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("FProductsIsDelete not between", value1, value2, "fproductsisdelete");
            return (Criteria) this;
        }

        public Criteria andFproductsdowntimeIsNull() {
            addCriterion("FProductsDownTime is null");
            return (Criteria) this;
        }

        public Criteria andFproductsdowntimeIsNotNull() {
            addCriterion("FProductsDownTime is not null");
            return (Criteria) this;
        }

        public Criteria andFproductsdowntimeEqualTo(Date value) {
            addCriterion("FProductsDownTime =", value, "fproductsdowntime");
            return (Criteria) this;
        }

        public Criteria andFproductsdowntimeNotEqualTo(Date value) {
            addCriterion("FProductsDownTime <>", value, "fproductsdowntime");
            return (Criteria) this;
        }

        public Criteria andFproductsdowntimeGreaterThan(Date value) {
            addCriterion("FProductsDownTime >", value, "fproductsdowntime");
            return (Criteria) this;
        }

        public Criteria andFproductsdowntimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FProductsDownTime >=", value, "fproductsdowntime");
            return (Criteria) this;
        }

        public Criteria andFproductsdowntimeLessThan(Date value) {
            addCriterion("FProductsDownTime <", value, "fproductsdowntime");
            return (Criteria) this;
        }

        public Criteria andFproductsdowntimeLessThanOrEqualTo(Date value) {
            addCriterion("FProductsDownTime <=", value, "fproductsdowntime");
            return (Criteria) this;
        }

        public Criteria andFproductsdowntimeIn(List<Date> values) {
            addCriterion("FProductsDownTime in", values, "fproductsdowntime");
            return (Criteria) this;
        }

        public Criteria andFproductsdowntimeNotIn(List<Date> values) {
            addCriterion("FProductsDownTime not in", values, "fproductsdowntime");
            return (Criteria) this;
        }

        public Criteria andFproductsdowntimeBetween(Date value1, Date value2) {
            addCriterion("FProductsDownTime between", value1, value2, "fproductsdowntime");
            return (Criteria) this;
        }

        public Criteria andFproductsdowntimeNotBetween(Date value1, Date value2) {
            addCriterion("FProductsDownTime not between", value1, value2, "fproductsdowntime");
            return (Criteria) this;
        }

        public Criteria andFproductsgranttimeIsNull() {
            addCriterion("FProductsGrantTime is null");
            return (Criteria) this;
        }

        public Criteria andFproductsgranttimeIsNotNull() {
            addCriterion("FProductsGrantTime is not null");
            return (Criteria) this;
        }

        public Criteria andFproductsgranttimeEqualTo(Date value) {
            addCriterion("FProductsGrantTime =", value, "fproductsgranttime");
            return (Criteria) this;
        }

        public Criteria andFproductsgranttimeNotEqualTo(Date value) {
            addCriterion("FProductsGrantTime <>", value, "fproductsgranttime");
            return (Criteria) this;
        }

        public Criteria andFproductsgranttimeGreaterThan(Date value) {
            addCriterion("FProductsGrantTime >", value, "fproductsgranttime");
            return (Criteria) this;
        }

        public Criteria andFproductsgranttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FProductsGrantTime >=", value, "fproductsgranttime");
            return (Criteria) this;
        }

        public Criteria andFproductsgranttimeLessThan(Date value) {
            addCriterion("FProductsGrantTime <", value, "fproductsgranttime");
            return (Criteria) this;
        }

        public Criteria andFproductsgranttimeLessThanOrEqualTo(Date value) {
            addCriterion("FProductsGrantTime <=", value, "fproductsgranttime");
            return (Criteria) this;
        }

        public Criteria andFproductsgranttimeIn(List<Date> values) {
            addCriterion("FProductsGrantTime in", values, "fproductsgranttime");
            return (Criteria) this;
        }

        public Criteria andFproductsgranttimeNotIn(List<Date> values) {
            addCriterion("FProductsGrantTime not in", values, "fproductsgranttime");
            return (Criteria) this;
        }

        public Criteria andFproductsgranttimeBetween(Date value1, Date value2) {
            addCriterion("FProductsGrantTime between", value1, value2, "fproductsgranttime");
            return (Criteria) this;
        }

        public Criteria andFproductsgranttimeNotBetween(Date value1, Date value2) {
            addCriterion("FProductsGrantTime not between", value1, value2, "fproductsgranttime");
            return (Criteria) this;
        }

        public Criteria andFproductsusersmoneyIsNull() {
            addCriterion("FProductsUsersMoney is null");
            return (Criteria) this;
        }

        public Criteria andFproductsusersmoneyIsNotNull() {
            addCriterion("FProductsUsersMoney is not null");
            return (Criteria) this;
        }

        public Criteria andFproductsusersmoneyEqualTo(BigDecimal value) {
            addCriterion("FProductsUsersMoney =", value, "fproductsusersmoney");
            return (Criteria) this;
        }

        public Criteria andFproductsusersmoneyNotEqualTo(BigDecimal value) {
            addCriterion("FProductsUsersMoney <>", value, "fproductsusersmoney");
            return (Criteria) this;
        }

        public Criteria andFproductsusersmoneyGreaterThan(BigDecimal value) {
            addCriterion("FProductsUsersMoney >", value, "fproductsusersmoney");
            return (Criteria) this;
        }

        public Criteria andFproductsusersmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FProductsUsersMoney >=", value, "fproductsusersmoney");
            return (Criteria) this;
        }

        public Criteria andFproductsusersmoneyLessThan(BigDecimal value) {
            addCriterion("FProductsUsersMoney <", value, "fproductsusersmoney");
            return (Criteria) this;
        }

        public Criteria andFproductsusersmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FProductsUsersMoney <=", value, "fproductsusersmoney");
            return (Criteria) this;
        }

        public Criteria andFproductsusersmoneyIn(List<BigDecimal> values) {
            addCriterion("FProductsUsersMoney in", values, "fproductsusersmoney");
            return (Criteria) this;
        }

        public Criteria andFproductsusersmoneyNotIn(List<BigDecimal> values) {
            addCriterion("FProductsUsersMoney not in", values, "fproductsusersmoney");
            return (Criteria) this;
        }

        public Criteria andFproductsusersmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FProductsUsersMoney between", value1, value2, "fproductsusersmoney");
            return (Criteria) this;
        }

        public Criteria andFproductsusersmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FProductsUsersMoney not between", value1, value2, "fproductsusersmoney");
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

        public Criteria andRolloutwaringsIsNull() {
            addCriterion("rollOutWarings is null");
            return (Criteria) this;
        }

        public Criteria andRolloutwaringsIsNotNull() {
            addCriterion("rollOutWarings is not null");
            return (Criteria) this;
        }

        public Criteria andRolloutwaringsEqualTo(String value) {
            addCriterion("rollOutWarings =", value, "rolloutwarings");
            return (Criteria) this;
        }

        public Criteria andRolloutwaringsNotEqualTo(String value) {
            addCriterion("rollOutWarings <>", value, "rolloutwarings");
            return (Criteria) this;
        }

        public Criteria andRolloutwaringsGreaterThan(String value) {
            addCriterion("rollOutWarings >", value, "rolloutwarings");
            return (Criteria) this;
        }

        public Criteria andRolloutwaringsGreaterThanOrEqualTo(String value) {
            addCriterion("rollOutWarings >=", value, "rolloutwarings");
            return (Criteria) this;
        }

        public Criteria andRolloutwaringsLessThan(String value) {
            addCriterion("rollOutWarings <", value, "rolloutwarings");
            return (Criteria) this;
        }

        public Criteria andRolloutwaringsLessThanOrEqualTo(String value) {
            addCriterion("rollOutWarings <=", value, "rolloutwarings");
            return (Criteria) this;
        }

        public Criteria andRolloutwaringsLike(String value) {
            addCriterion("rollOutWarings like", value, "rolloutwarings");
            return (Criteria) this;
        }

        public Criteria andRolloutwaringsNotLike(String value) {
            addCriterion("rollOutWarings not like", value, "rolloutwarings");
            return (Criteria) this;
        }

        public Criteria andRolloutwaringsIn(List<String> values) {
            addCriterion("rollOutWarings in", values, "rolloutwarings");
            return (Criteria) this;
        }

        public Criteria andRolloutwaringsNotIn(List<String> values) {
            addCriterion("rollOutWarings not in", values, "rolloutwarings");
            return (Criteria) this;
        }

        public Criteria andRolloutwaringsBetween(String value1, String value2) {
            addCriterion("rollOutWarings between", value1, value2, "rolloutwarings");
            return (Criteria) this;
        }

        public Criteria andRolloutwaringsNotBetween(String value1, String value2) {
            addCriterion("rollOutWarings not between", value1, value2, "rolloutwarings");
            return (Criteria) this;
        }

        public Criteria andProtocalIsNull() {
            addCriterion("protocal is null");
            return (Criteria) this;
        }

        public Criteria andProtocalIsNotNull() {
            addCriterion("protocal is not null");
            return (Criteria) this;
        }

        public Criteria andProtocalEqualTo(String value) {
            addCriterion("protocal =", value, "protocal");
            return (Criteria) this;
        }

        public Criteria andProtocalNotEqualTo(String value) {
            addCriterion("protocal <>", value, "protocal");
            return (Criteria) this;
        }

        public Criteria andProtocalGreaterThan(String value) {
            addCriterion("protocal >", value, "protocal");
            return (Criteria) this;
        }

        public Criteria andProtocalGreaterThanOrEqualTo(String value) {
            addCriterion("protocal >=", value, "protocal");
            return (Criteria) this;
        }

        public Criteria andProtocalLessThan(String value) {
            addCriterion("protocal <", value, "protocal");
            return (Criteria) this;
        }

        public Criteria andProtocalLessThanOrEqualTo(String value) {
            addCriterion("protocal <=", value, "protocal");
            return (Criteria) this;
        }

        public Criteria andProtocalLike(String value) {
            addCriterion("protocal like", value, "protocal");
            return (Criteria) this;
        }

        public Criteria andProtocalNotLike(String value) {
            addCriterion("protocal not like", value, "protocal");
            return (Criteria) this;
        }

        public Criteria andProtocalIn(List<String> values) {
            addCriterion("protocal in", values, "protocal");
            return (Criteria) this;
        }

        public Criteria andProtocalNotIn(List<String> values) {
            addCriterion("protocal not in", values, "protocal");
            return (Criteria) this;
        }

        public Criteria andProtocalBetween(String value1, String value2) {
            addCriterion("protocal between", value1, value2, "protocal");
            return (Criteria) this;
        }

        public Criteria andProtocalNotBetween(String value1, String value2) {
            addCriterion("protocal not between", value1, value2, "protocal");
            return (Criteria) this;
        }

        public Criteria andDebtorIsNull() {
            addCriterion("debtor is null");
            return (Criteria) this;
        }

        public Criteria andDebtorIsNotNull() {
            addCriterion("debtor is not null");
            return (Criteria) this;
        }

        public Criteria andDebtorEqualTo(String value) {
            addCriterion("debtor =", value, "debtor");
            return (Criteria) this;
        }

        public Criteria andDebtorNotEqualTo(String value) {
            addCriterion("debtor <>", value, "debtor");
            return (Criteria) this;
        }

        public Criteria andDebtorGreaterThan(String value) {
            addCriterion("debtor >", value, "debtor");
            return (Criteria) this;
        }

        public Criteria andDebtorGreaterThanOrEqualTo(String value) {
            addCriterion("debtor >=", value, "debtor");
            return (Criteria) this;
        }

        public Criteria andDebtorLessThan(String value) {
            addCriterion("debtor <", value, "debtor");
            return (Criteria) this;
        }

        public Criteria andDebtorLessThanOrEqualTo(String value) {
            addCriterion("debtor <=", value, "debtor");
            return (Criteria) this;
        }

        public Criteria andDebtorLike(String value) {
            addCriterion("debtor like", value, "debtor");
            return (Criteria) this;
        }

        public Criteria andDebtorNotLike(String value) {
            addCriterion("debtor not like", value, "debtor");
            return (Criteria) this;
        }

        public Criteria andDebtorIn(List<String> values) {
            addCriterion("debtor in", values, "debtor");
            return (Criteria) this;
        }

        public Criteria andDebtorNotIn(List<String> values) {
            addCriterion("debtor not in", values, "debtor");
            return (Criteria) this;
        }

        public Criteria andDebtorBetween(String value1, String value2) {
            addCriterion("debtor between", value1, value2, "debtor");
            return (Criteria) this;
        }

        public Criteria andDebtorNotBetween(String value1, String value2) {
            addCriterion("debtor not between", value1, value2, "debtor");
            return (Criteria) this;
        }

        public Criteria andUsageforIsNull() {
            addCriterion("usageFor is null");
            return (Criteria) this;
        }

        public Criteria andUsageforIsNotNull() {
            addCriterion("usageFor is not null");
            return (Criteria) this;
        }

        public Criteria andUsageforEqualTo(String value) {
            addCriterion("usageFor =", value, "usagefor");
            return (Criteria) this;
        }

        public Criteria andUsageforNotEqualTo(String value) {
            addCriterion("usageFor <>", value, "usagefor");
            return (Criteria) this;
        }

        public Criteria andUsageforGreaterThan(String value) {
            addCriterion("usageFor >", value, "usagefor");
            return (Criteria) this;
        }

        public Criteria andUsageforGreaterThanOrEqualTo(String value) {
            addCriterion("usageFor >=", value, "usagefor");
            return (Criteria) this;
        }

        public Criteria andUsageforLessThan(String value) {
            addCriterion("usageFor <", value, "usagefor");
            return (Criteria) this;
        }

        public Criteria andUsageforLessThanOrEqualTo(String value) {
            addCriterion("usageFor <=", value, "usagefor");
            return (Criteria) this;
        }

        public Criteria andUsageforLike(String value) {
            addCriterion("usageFor like", value, "usagefor");
            return (Criteria) this;
        }

        public Criteria andUsageforNotLike(String value) {
            addCriterion("usageFor not like", value, "usagefor");
            return (Criteria) this;
        }

        public Criteria andUsageforIn(List<String> values) {
            addCriterion("usageFor in", values, "usagefor");
            return (Criteria) this;
        }

        public Criteria andUsageforNotIn(List<String> values) {
            addCriterion("usageFor not in", values, "usagefor");
            return (Criteria) this;
        }

        public Criteria andUsageforBetween(String value1, String value2) {
            addCriterion("usageFor between", value1, value2, "usagefor");
            return (Criteria) this;
        }

        public Criteria andUsageforNotBetween(String value1, String value2) {
            addCriterion("usageFor not between", value1, value2, "usagefor");
            return (Criteria) this;
        }

        public Criteria andChangestateIsNull() {
            addCriterion("changeState is null");
            return (Criteria) this;
        }

        public Criteria andChangestateIsNotNull() {
            addCriterion("changeState is not null");
            return (Criteria) this;
        }

        public Criteria andChangestateEqualTo(Integer value) {
            addCriterion("changeState =", value, "changestate");
            return (Criteria) this;
        }

        public Criteria andChangestateNotEqualTo(Integer value) {
            addCriterion("changeState <>", value, "changestate");
            return (Criteria) this;
        }

        public Criteria andChangestateGreaterThan(Integer value) {
            addCriterion("changeState >", value, "changestate");
            return (Criteria) this;
        }

        public Criteria andChangestateGreaterThanOrEqualTo(Integer value) {
            addCriterion("changeState >=", value, "changestate");
            return (Criteria) this;
        }

        public Criteria andChangestateLessThan(Integer value) {
            addCriterion("changeState <", value, "changestate");
            return (Criteria) this;
        }

        public Criteria andChangestateLessThanOrEqualTo(Integer value) {
            addCriterion("changeState <=", value, "changestate");
            return (Criteria) this;
        }

        public Criteria andChangestateIn(List<Integer> values) {
            addCriterion("changeState in", values, "changestate");
            return (Criteria) this;
        }

        public Criteria andChangestateNotIn(List<Integer> values) {
            addCriterion("changeState not in", values, "changestate");
            return (Criteria) this;
        }

        public Criteria andChangestateBetween(Integer value1, Integer value2) {
            addCriterion("changeState between", value1, value2, "changestate");
            return (Criteria) this;
        }

        public Criteria andChangestateNotBetween(Integer value1, Integer value2) {
            addCriterion("changeState not between", value1, value2, "changestate");
            return (Criteria) this;
        }

        public Criteria andAllseestateIsNull() {
            addCriterion("AllseeState is null");
            return (Criteria) this;
        }

        public Criteria andAllseestateIsNotNull() {
            addCriterion("AllseeState is not null");
            return (Criteria) this;
        }

        public Criteria andAllseestateEqualTo(Integer value) {
            addCriterion("AllseeState =", value, "allseestate");
            return (Criteria) this;
        }

        public Criteria andAllseestateNotEqualTo(Integer value) {
            addCriterion("AllseeState <>", value, "allseestate");
            return (Criteria) this;
        }

        public Criteria andAllseestateGreaterThan(Integer value) {
            addCriterion("AllseeState >", value, "allseestate");
            return (Criteria) this;
        }

        public Criteria andAllseestateGreaterThanOrEqualTo(Integer value) {
            addCriterion("AllseeState >=", value, "allseestate");
            return (Criteria) this;
        }

        public Criteria andAllseestateLessThan(Integer value) {
            addCriterion("AllseeState <", value, "allseestate");
            return (Criteria) this;
        }

        public Criteria andAllseestateLessThanOrEqualTo(Integer value) {
            addCriterion("AllseeState <=", value, "allseestate");
            return (Criteria) this;
        }

        public Criteria andAllseestateIn(List<Integer> values) {
            addCriterion("AllseeState in", values, "allseestate");
            return (Criteria) this;
        }

        public Criteria andAllseestateNotIn(List<Integer> values) {
            addCriterion("AllseeState not in", values, "allseestate");
            return (Criteria) this;
        }

        public Criteria andAllseestateBetween(Integer value1, Integer value2) {
            addCriterion("AllseeState between", value1, value2, "allseestate");
            return (Criteria) this;
        }

        public Criteria andAllseestateNotBetween(Integer value1, Integer value2) {
            addCriterion("AllseeState not between", value1, value2, "allseestate");
            return (Criteria) this;
        }

        public Criteria andCompanysealIsNull() {
            addCriterion("companySeal is null");
            return (Criteria) this;
        }

        public Criteria andCompanysealIsNotNull() {
            addCriterion("companySeal is not null");
            return (Criteria) this;
        }

        public Criteria andCompanysealEqualTo(String value) {
            addCriterion("companySeal =", value, "companyseal");
            return (Criteria) this;
        }

        public Criteria andCompanysealNotEqualTo(String value) {
            addCriterion("companySeal <>", value, "companyseal");
            return (Criteria) this;
        }

        public Criteria andCompanysealGreaterThan(String value) {
            addCriterion("companySeal >", value, "companyseal");
            return (Criteria) this;
        }

        public Criteria andCompanysealGreaterThanOrEqualTo(String value) {
            addCriterion("companySeal >=", value, "companyseal");
            return (Criteria) this;
        }

        public Criteria andCompanysealLessThan(String value) {
            addCriterion("companySeal <", value, "companyseal");
            return (Criteria) this;
        }

        public Criteria andCompanysealLessThanOrEqualTo(String value) {
            addCriterion("companySeal <=", value, "companyseal");
            return (Criteria) this;
        }

        public Criteria andCompanysealLike(String value) {
            addCriterion("companySeal like", value, "companyseal");
            return (Criteria) this;
        }

        public Criteria andCompanysealNotLike(String value) {
            addCriterion("companySeal not like", value, "companyseal");
            return (Criteria) this;
        }

        public Criteria andCompanysealIn(List<String> values) {
            addCriterion("companySeal in", values, "companyseal");
            return (Criteria) this;
        }

        public Criteria andCompanysealNotIn(List<String> values) {
            addCriterion("companySeal not in", values, "companyseal");
            return (Criteria) this;
        }

        public Criteria andCompanysealBetween(String value1, String value2) {
            addCriterion("companySeal between", value1, value2, "companyseal");
            return (Criteria) this;
        }

        public Criteria andCompanysealNotBetween(String value1, String value2) {
            addCriterion("companySeal not between", value1, value2, "companyseal");
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
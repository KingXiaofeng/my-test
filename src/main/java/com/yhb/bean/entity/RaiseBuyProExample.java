package com.yhb.bean.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RaiseBuyProExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RaiseBuyProExample() {
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

        public Criteria andRaisebuyidIsNull() {
            addCriterion("raiseBuyId is null");
            return (Criteria) this;
        }

        public Criteria andRaisebuyidIsNotNull() {
            addCriterion("raiseBuyId is not null");
            return (Criteria) this;
        }

        public Criteria andRaisebuyidEqualTo(Integer value) {
            addCriterion("raiseBuyId =", value, "raisebuyid");
            return (Criteria) this;
        }

        public Criteria andRaisebuyidNotEqualTo(Integer value) {
            addCriterion("raiseBuyId <>", value, "raisebuyid");
            return (Criteria) this;
        }

        public Criteria andRaisebuyidGreaterThan(Integer value) {
            addCriterion("raiseBuyId >", value, "raisebuyid");
            return (Criteria) this;
        }

        public Criteria andRaisebuyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("raiseBuyId >=", value, "raisebuyid");
            return (Criteria) this;
        }

        public Criteria andRaisebuyidLessThan(Integer value) {
            addCriterion("raiseBuyId <", value, "raisebuyid");
            return (Criteria) this;
        }

        public Criteria andRaisebuyidLessThanOrEqualTo(Integer value) {
            addCriterion("raiseBuyId <=", value, "raisebuyid");
            return (Criteria) this;
        }

        public Criteria andRaisebuyidIn(List<Integer> values) {
            addCriterion("raiseBuyId in", values, "raisebuyid");
            return (Criteria) this;
        }

        public Criteria andRaisebuyidNotIn(List<Integer> values) {
            addCriterion("raiseBuyId not in", values, "raisebuyid");
            return (Criteria) this;
        }

        public Criteria andRaisebuyidBetween(Integer value1, Integer value2) {
            addCriterion("raiseBuyId between", value1, value2, "raisebuyid");
            return (Criteria) this;
        }

        public Criteria andRaisebuyidNotBetween(Integer value1, Integer value2) {
            addCriterion("raiseBuyId not between", value1, value2, "raisebuyid");
            return (Criteria) this;
        }

        public Criteria andRaisenameIsNull() {
            addCriterion("raiseName is null");
            return (Criteria) this;
        }

        public Criteria andRaisenameIsNotNull() {
            addCriterion("raiseName is not null");
            return (Criteria) this;
        }

        public Criteria andRaisenameEqualTo(String value) {
            addCriterion("raiseName =", value, "raisename");
            return (Criteria) this;
        }

        public Criteria andRaisenameNotEqualTo(String value) {
            addCriterion("raiseName <>", value, "raisename");
            return (Criteria) this;
        }

        public Criteria andRaisenameGreaterThan(String value) {
            addCriterion("raiseName >", value, "raisename");
            return (Criteria) this;
        }

        public Criteria andRaisenameGreaterThanOrEqualTo(String value) {
            addCriterion("raiseName >=", value, "raisename");
            return (Criteria) this;
        }

        public Criteria andRaisenameLessThan(String value) {
            addCriterion("raiseName <", value, "raisename");
            return (Criteria) this;
        }

        public Criteria andRaisenameLessThanOrEqualTo(String value) {
            addCriterion("raiseName <=", value, "raisename");
            return (Criteria) this;
        }

        public Criteria andRaisenameLike(String value) {
            addCriterion("raiseName like", value, "raisename");
            return (Criteria) this;
        }

        public Criteria andRaisenameNotLike(String value) {
            addCriterion("raiseName not like", value, "raisename");
            return (Criteria) this;
        }

        public Criteria andRaisenameIn(List<String> values) {
            addCriterion("raiseName in", values, "raisename");
            return (Criteria) this;
        }

        public Criteria andRaisenameNotIn(List<String> values) {
            addCriterion("raiseName not in", values, "raisename");
            return (Criteria) this;
        }

        public Criteria andRaisenameBetween(String value1, String value2) {
            addCriterion("raiseName between", value1, value2, "raisename");
            return (Criteria) this;
        }

        public Criteria andRaisenameNotBetween(String value1, String value2) {
            addCriterion("raiseName not between", value1, value2, "raisename");
            return (Criteria) this;
        }

        public Criteria andRaisesendidIsNull() {
            addCriterion("raiseSendId is null");
            return (Criteria) this;
        }

        public Criteria andRaisesendidIsNotNull() {
            addCriterion("raiseSendId is not null");
            return (Criteria) this;
        }

        public Criteria andRaisesendidEqualTo(Integer value) {
            addCriterion("raiseSendId =", value, "raisesendid");
            return (Criteria) this;
        }

        public Criteria andRaisesendidNotEqualTo(Integer value) {
            addCriterion("raiseSendId <>", value, "raisesendid");
            return (Criteria) this;
        }

        public Criteria andRaisesendidGreaterThan(Integer value) {
            addCriterion("raiseSendId >", value, "raisesendid");
            return (Criteria) this;
        }

        public Criteria andRaisesendidGreaterThanOrEqualTo(Integer value) {
            addCriterion("raiseSendId >=", value, "raisesendid");
            return (Criteria) this;
        }

        public Criteria andRaisesendidLessThan(Integer value) {
            addCriterion("raiseSendId <", value, "raisesendid");
            return (Criteria) this;
        }

        public Criteria andRaisesendidLessThanOrEqualTo(Integer value) {
            addCriterion("raiseSendId <=", value, "raisesendid");
            return (Criteria) this;
        }

        public Criteria andRaisesendidIn(List<Integer> values) {
            addCriterion("raiseSendId in", values, "raisesendid");
            return (Criteria) this;
        }

        public Criteria andRaisesendidNotIn(List<Integer> values) {
            addCriterion("raiseSendId not in", values, "raisesendid");
            return (Criteria) this;
        }

        public Criteria andRaisesendidBetween(Integer value1, Integer value2) {
            addCriterion("raiseSendId between", value1, value2, "raisesendid");
            return (Criteria) this;
        }

        public Criteria andRaisesendidNotBetween(Integer value1, Integer value2) {
            addCriterion("raiseSendId not between", value1, value2, "raisesendid");
            return (Criteria) this;
        }

        public Criteria andRaisebuyfpuidIsNull() {
            addCriterion("raiseBuyFpuId is null");
            return (Criteria) this;
        }

        public Criteria andRaisebuyfpuidIsNotNull() {
            addCriterion("raiseBuyFpuId is not null");
            return (Criteria) this;
        }

        public Criteria andRaisebuyfpuidEqualTo(Integer value) {
            addCriterion("raiseBuyFpuId =", value, "raisebuyfpuid");
            return (Criteria) this;
        }

        public Criteria andRaisebuyfpuidNotEqualTo(Integer value) {
            addCriterion("raiseBuyFpuId <>", value, "raisebuyfpuid");
            return (Criteria) this;
        }

        public Criteria andRaisebuyfpuidGreaterThan(Integer value) {
            addCriterion("raiseBuyFpuId >", value, "raisebuyfpuid");
            return (Criteria) this;
        }

        public Criteria andRaisebuyfpuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("raiseBuyFpuId >=", value, "raisebuyfpuid");
            return (Criteria) this;
        }

        public Criteria andRaisebuyfpuidLessThan(Integer value) {
            addCriterion("raiseBuyFpuId <", value, "raisebuyfpuid");
            return (Criteria) this;
        }

        public Criteria andRaisebuyfpuidLessThanOrEqualTo(Integer value) {
            addCriterion("raiseBuyFpuId <=", value, "raisebuyfpuid");
            return (Criteria) this;
        }

        public Criteria andRaisebuyfpuidIn(List<Integer> values) {
            addCriterion("raiseBuyFpuId in", values, "raisebuyfpuid");
            return (Criteria) this;
        }

        public Criteria andRaisebuyfpuidNotIn(List<Integer> values) {
            addCriterion("raiseBuyFpuId not in", values, "raisebuyfpuid");
            return (Criteria) this;
        }

        public Criteria andRaisebuyfpuidBetween(Integer value1, Integer value2) {
            addCriterion("raiseBuyFpuId between", value1, value2, "raisebuyfpuid");
            return (Criteria) this;
        }

        public Criteria andRaisebuyfpuidNotBetween(Integer value1, Integer value2) {
            addCriterion("raiseBuyFpuId not between", value1, value2, "raisebuyfpuid");
            return (Criteria) this;
        }

        public Criteria andRaiseusetimeIsNull() {
            addCriterion("raiseUseTime is null");
            return (Criteria) this;
        }

        public Criteria andRaiseusetimeIsNotNull() {
            addCriterion("raiseUseTime is not null");
            return (Criteria) this;
        }

        public Criteria andRaiseusetimeEqualTo(Date value) {
            addCriterion("raiseUseTime =", value, "raiseusetime");
            return (Criteria) this;
        }

        public Criteria andRaiseusetimeNotEqualTo(Date value) {
            addCriterion("raiseUseTime <>", value, "raiseusetime");
            return (Criteria) this;
        }

        public Criteria andRaiseusetimeGreaterThan(Date value) {
            addCriterion("raiseUseTime >", value, "raiseusetime");
            return (Criteria) this;
        }

        public Criteria andRaiseusetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("raiseUseTime >=", value, "raiseusetime");
            return (Criteria) this;
        }

        public Criteria andRaiseusetimeLessThan(Date value) {
            addCriterion("raiseUseTime <", value, "raiseusetime");
            return (Criteria) this;
        }

        public Criteria andRaiseusetimeLessThanOrEqualTo(Date value) {
            addCriterion("raiseUseTime <=", value, "raiseusetime");
            return (Criteria) this;
        }

        public Criteria andRaiseusetimeIn(List<Date> values) {
            addCriterion("raiseUseTime in", values, "raiseusetime");
            return (Criteria) this;
        }

        public Criteria andRaiseusetimeNotIn(List<Date> values) {
            addCriterion("raiseUseTime not in", values, "raiseusetime");
            return (Criteria) this;
        }

        public Criteria andRaiseusetimeBetween(Date value1, Date value2) {
            addCriterion("raiseUseTime between", value1, value2, "raiseusetime");
            return (Criteria) this;
        }

        public Criteria andRaiseusetimeNotBetween(Date value1, Date value2) {
            addCriterion("raiseUseTime not between", value1, value2, "raiseusetime");
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

        public Criteria andRaisesizeIsNull() {
            addCriterion("raiseSize is null");
            return (Criteria) this;
        }

        public Criteria andRaisesizeIsNotNull() {
            addCriterion("raiseSize is not null");
            return (Criteria) this;
        }

        public Criteria andRaisesizeEqualTo(BigDecimal value) {
            addCriterion("raiseSize =", value, "raisesize");
            return (Criteria) this;
        }

        public Criteria andRaisesizeNotEqualTo(BigDecimal value) {
            addCriterion("raiseSize <>", value, "raisesize");
            return (Criteria) this;
        }

        public Criteria andRaisesizeGreaterThan(BigDecimal value) {
            addCriterion("raiseSize >", value, "raisesize");
            return (Criteria) this;
        }

        public Criteria andRaisesizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("raiseSize >=", value, "raisesize");
            return (Criteria) this;
        }

        public Criteria andRaisesizeLessThan(BigDecimal value) {
            addCriterion("raiseSize <", value, "raisesize");
            return (Criteria) this;
        }

        public Criteria andRaisesizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("raiseSize <=", value, "raisesize");
            return (Criteria) this;
        }

        public Criteria andRaisesizeIn(List<BigDecimal> values) {
            addCriterion("raiseSize in", values, "raisesize");
            return (Criteria) this;
        }

        public Criteria andRaisesizeNotIn(List<BigDecimal> values) {
            addCriterion("raiseSize not in", values, "raisesize");
            return (Criteria) this;
        }

        public Criteria andRaisesizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("raiseSize between", value1, value2, "raisesize");
            return (Criteria) this;
        }

        public Criteria andRaisesizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("raiseSize not between", value1, value2, "raisesize");
            return (Criteria) this;
        }

        public Criteria andRaisecountnumIsNull() {
            addCriterion("raiseCountNum is null");
            return (Criteria) this;
        }

        public Criteria andRaisecountnumIsNotNull() {
            addCriterion("raiseCountNum is not null");
            return (Criteria) this;
        }

        public Criteria andRaisecountnumEqualTo(Integer value) {
            addCriterion("raiseCountNum =", value, "raisecountnum");
            return (Criteria) this;
        }

        public Criteria andRaisecountnumNotEqualTo(Integer value) {
            addCriterion("raiseCountNum <>", value, "raisecountnum");
            return (Criteria) this;
        }

        public Criteria andRaisecountnumGreaterThan(Integer value) {
            addCriterion("raiseCountNum >", value, "raisecountnum");
            return (Criteria) this;
        }

        public Criteria andRaisecountnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("raiseCountNum >=", value, "raisecountnum");
            return (Criteria) this;
        }

        public Criteria andRaisecountnumLessThan(Integer value) {
            addCriterion("raiseCountNum <", value, "raisecountnum");
            return (Criteria) this;
        }

        public Criteria andRaisecountnumLessThanOrEqualTo(Integer value) {
            addCriterion("raiseCountNum <=", value, "raisecountnum");
            return (Criteria) this;
        }

        public Criteria andRaisecountnumIn(List<Integer> values) {
            addCriterion("raiseCountNum in", values, "raisecountnum");
            return (Criteria) this;
        }

        public Criteria andRaisecountnumNotIn(List<Integer> values) {
            addCriterion("raiseCountNum not in", values, "raisecountnum");
            return (Criteria) this;
        }

        public Criteria andRaisecountnumBetween(Integer value1, Integer value2) {
            addCriterion("raiseCountNum between", value1, value2, "raisecountnum");
            return (Criteria) this;
        }

        public Criteria andRaisecountnumNotBetween(Integer value1, Integer value2) {
            addCriterion("raiseCountNum not between", value1, value2, "raisecountnum");
            return (Criteria) this;
        }

        public Criteria andRaiserateinnumIsNull() {
            addCriterion("raiseRateInNum is null");
            return (Criteria) this;
        }

        public Criteria andRaiserateinnumIsNotNull() {
            addCriterion("raiseRateInNum is not null");
            return (Criteria) this;
        }

        public Criteria andRaiserateinnumEqualTo(Integer value) {
            addCriterion("raiseRateInNum =", value, "raiserateinnum");
            return (Criteria) this;
        }

        public Criteria andRaiserateinnumNotEqualTo(Integer value) {
            addCriterion("raiseRateInNum <>", value, "raiserateinnum");
            return (Criteria) this;
        }

        public Criteria andRaiserateinnumGreaterThan(Integer value) {
            addCriterion("raiseRateInNum >", value, "raiserateinnum");
            return (Criteria) this;
        }

        public Criteria andRaiserateinnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("raiseRateInNum >=", value, "raiserateinnum");
            return (Criteria) this;
        }

        public Criteria andRaiserateinnumLessThan(Integer value) {
            addCriterion("raiseRateInNum <", value, "raiserateinnum");
            return (Criteria) this;
        }

        public Criteria andRaiserateinnumLessThanOrEqualTo(Integer value) {
            addCriterion("raiseRateInNum <=", value, "raiserateinnum");
            return (Criteria) this;
        }

        public Criteria andRaiserateinnumIn(List<Integer> values) {
            addCriterion("raiseRateInNum in", values, "raiserateinnum");
            return (Criteria) this;
        }

        public Criteria andRaiserateinnumNotIn(List<Integer> values) {
            addCriterion("raiseRateInNum not in", values, "raiserateinnum");
            return (Criteria) this;
        }

        public Criteria andRaiserateinnumBetween(Integer value1, Integer value2) {
            addCriterion("raiseRateInNum between", value1, value2, "raiserateinnum");
            return (Criteria) this;
        }

        public Criteria andRaiserateinnumNotBetween(Integer value1, Integer value2) {
            addCriterion("raiseRateInNum not between", value1, value2, "raiserateinnum");
            return (Criteria) this;
        }

        public Criteria andRaiseovertimeIsNull() {
            addCriterion("raiseOverTime is null");
            return (Criteria) this;
        }

        public Criteria andRaiseovertimeIsNotNull() {
            addCriterion("raiseOverTime is not null");
            return (Criteria) this;
        }

        public Criteria andRaiseovertimeEqualTo(Date value) {
            addCriterion("raiseOverTime =", value, "raiseovertime");
            return (Criteria) this;
        }

        public Criteria andRaiseovertimeNotEqualTo(Date value) {
            addCriterion("raiseOverTime <>", value, "raiseovertime");
            return (Criteria) this;
        }

        public Criteria andRaiseovertimeGreaterThan(Date value) {
            addCriterion("raiseOverTime >", value, "raiseovertime");
            return (Criteria) this;
        }

        public Criteria andRaiseovertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("raiseOverTime >=", value, "raiseovertime");
            return (Criteria) this;
        }

        public Criteria andRaiseovertimeLessThan(Date value) {
            addCriterion("raiseOverTime <", value, "raiseovertime");
            return (Criteria) this;
        }

        public Criteria andRaiseovertimeLessThanOrEqualTo(Date value) {
            addCriterion("raiseOverTime <=", value, "raiseovertime");
            return (Criteria) this;
        }

        public Criteria andRaiseovertimeIn(List<Date> values) {
            addCriterion("raiseOverTime in", values, "raiseovertime");
            return (Criteria) this;
        }

        public Criteria andRaiseovertimeNotIn(List<Date> values) {
            addCriterion("raiseOverTime not in", values, "raiseovertime");
            return (Criteria) this;
        }

        public Criteria andRaiseovertimeBetween(Date value1, Date value2) {
            addCriterion("raiseOverTime between", value1, value2, "raiseovertime");
            return (Criteria) this;
        }

        public Criteria andRaiseovertimeNotBetween(Date value1, Date value2) {
            addCriterion("raiseOverTime not between", value1, value2, "raiseovertime");
            return (Criteria) this;
        }

        public Criteria andRaiseisoverIsNull() {
            addCriterion("raiseIsOver is null");
            return (Criteria) this;
        }

        public Criteria andRaiseisoverIsNotNull() {
            addCriterion("raiseIsOver is not null");
            return (Criteria) this;
        }

        public Criteria andRaiseisoverEqualTo(Integer value) {
            addCriterion("raiseIsOver =", value, "raiseisover");
            return (Criteria) this;
        }

        public Criteria andRaiseisoverNotEqualTo(Integer value) {
            addCriterion("raiseIsOver <>", value, "raiseisover");
            return (Criteria) this;
        }

        public Criteria andRaiseisoverGreaterThan(Integer value) {
            addCriterion("raiseIsOver >", value, "raiseisover");
            return (Criteria) this;
        }

        public Criteria andRaiseisoverGreaterThanOrEqualTo(Integer value) {
            addCriterion("raiseIsOver >=", value, "raiseisover");
            return (Criteria) this;
        }

        public Criteria andRaiseisoverLessThan(Integer value) {
            addCriterion("raiseIsOver <", value, "raiseisover");
            return (Criteria) this;
        }

        public Criteria andRaiseisoverLessThanOrEqualTo(Integer value) {
            addCriterion("raiseIsOver <=", value, "raiseisover");
            return (Criteria) this;
        }

        public Criteria andRaiseisoverIn(List<Integer> values) {
            addCriterion("raiseIsOver in", values, "raiseisover");
            return (Criteria) this;
        }

        public Criteria andRaiseisoverNotIn(List<Integer> values) {
            addCriterion("raiseIsOver not in", values, "raiseisover");
            return (Criteria) this;
        }

        public Criteria andRaiseisoverBetween(Integer value1, Integer value2) {
            addCriterion("raiseIsOver between", value1, value2, "raiseisover");
            return (Criteria) this;
        }

        public Criteria andRaiseisoverNotBetween(Integer value1, Integer value2) {
            addCriterion("raiseIsOver not between", value1, value2, "raiseisover");
            return (Criteria) this;
        }

        public Criteria andRaisecountmoneyIsNull() {
            addCriterion("raiseCountMoney is null");
            return (Criteria) this;
        }

        public Criteria andRaisecountmoneyIsNotNull() {
            addCriterion("raiseCountMoney is not null");
            return (Criteria) this;
        }

        public Criteria andRaisecountmoneyEqualTo(BigDecimal value) {
            addCriterion("raiseCountMoney =", value, "raisecountmoney");
            return (Criteria) this;
        }

        public Criteria andRaisecountmoneyNotEqualTo(BigDecimal value) {
            addCriterion("raiseCountMoney <>", value, "raisecountmoney");
            return (Criteria) this;
        }

        public Criteria andRaisecountmoneyGreaterThan(BigDecimal value) {
            addCriterion("raiseCountMoney >", value, "raisecountmoney");
            return (Criteria) this;
        }

        public Criteria andRaisecountmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("raiseCountMoney >=", value, "raisecountmoney");
            return (Criteria) this;
        }

        public Criteria andRaisecountmoneyLessThan(BigDecimal value) {
            addCriterion("raiseCountMoney <", value, "raisecountmoney");
            return (Criteria) this;
        }

        public Criteria andRaisecountmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("raiseCountMoney <=", value, "raisecountmoney");
            return (Criteria) this;
        }

        public Criteria andRaisecountmoneyIn(List<BigDecimal> values) {
            addCriterion("raiseCountMoney in", values, "raisecountmoney");
            return (Criteria) this;
        }

        public Criteria andRaisecountmoneyNotIn(List<BigDecimal> values) {
            addCriterion("raiseCountMoney not in", values, "raisecountmoney");
            return (Criteria) this;
        }

        public Criteria andRaisecountmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("raiseCountMoney between", value1, value2, "raisecountmoney");
            return (Criteria) this;
        }

        public Criteria andRaisecountmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("raiseCountMoney not between", value1, value2, "raisecountmoney");
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
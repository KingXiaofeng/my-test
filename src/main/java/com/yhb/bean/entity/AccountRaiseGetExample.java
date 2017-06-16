package com.yhb.bean.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountRaiseGetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountRaiseGetExample() {
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

        public Criteria andRaiseidIsNull() {
            addCriterion("raiseId is null");
            return (Criteria) this;
        }

        public Criteria andRaiseidIsNotNull() {
            addCriterion("raiseId is not null");
            return (Criteria) this;
        }

        public Criteria andRaiseidEqualTo(Integer value) {
            addCriterion("raiseId =", value, "raiseid");
            return (Criteria) this;
        }

        public Criteria andRaiseidNotEqualTo(Integer value) {
            addCriterion("raiseId <>", value, "raiseid");
            return (Criteria) this;
        }

        public Criteria andRaiseidGreaterThan(Integer value) {
            addCriterion("raiseId >", value, "raiseid");
            return (Criteria) this;
        }

        public Criteria andRaiseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("raiseId >=", value, "raiseid");
            return (Criteria) this;
        }

        public Criteria andRaiseidLessThan(Integer value) {
            addCriterion("raiseId <", value, "raiseid");
            return (Criteria) this;
        }

        public Criteria andRaiseidLessThanOrEqualTo(Integer value) {
            addCriterion("raiseId <=", value, "raiseid");
            return (Criteria) this;
        }

        public Criteria andRaiseidIn(List<Integer> values) {
            addCriterion("raiseId in", values, "raiseid");
            return (Criteria) this;
        }

        public Criteria andRaiseidNotIn(List<Integer> values) {
            addCriterion("raiseId not in", values, "raiseid");
            return (Criteria) this;
        }

        public Criteria andRaiseidBetween(Integer value1, Integer value2) {
            addCriterion("raiseId between", value1, value2, "raiseid");
            return (Criteria) this;
        }

        public Criteria andRaiseidNotBetween(Integer value1, Integer value2) {
            addCriterion("raiseId not between", value1, value2, "raiseid");
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

        public Criteria andProductidIsNull() {
            addCriterion("productId is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("productId is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(String value) {
            addCriterion("productId =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(String value) {
            addCriterion("productId <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(String value) {
            addCriterion("productId >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(String value) {
            addCriterion("productId >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(String value) {
            addCriterion("productId <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(String value) {
            addCriterion("productId <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLike(String value) {
            addCriterion("productId like", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotLike(String value) {
            addCriterion("productId not like", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<String> values) {
            addCriterion("productId in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<String> values) {
            addCriterion("productId not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(String value1, String value2) {
            addCriterion("productId between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(String value1, String value2) {
            addCriterion("productId not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andRaisenoIsNull() {
            addCriterion("raiseNo is null");
            return (Criteria) this;
        }

        public Criteria andRaisenoIsNotNull() {
            addCriterion("raiseNo is not null");
            return (Criteria) this;
        }

        public Criteria andRaisenoEqualTo(String value) {
            addCriterion("raiseNo =", value, "raiseno");
            return (Criteria) this;
        }

        public Criteria andRaisenoNotEqualTo(String value) {
            addCriterion("raiseNo <>", value, "raiseno");
            return (Criteria) this;
        }

        public Criteria andRaisenoGreaterThan(String value) {
            addCriterion("raiseNo >", value, "raiseno");
            return (Criteria) this;
        }

        public Criteria andRaisenoGreaterThanOrEqualTo(String value) {
            addCriterion("raiseNo >=", value, "raiseno");
            return (Criteria) this;
        }

        public Criteria andRaisenoLessThan(String value) {
            addCriterion("raiseNo <", value, "raiseno");
            return (Criteria) this;
        }

        public Criteria andRaisenoLessThanOrEqualTo(String value) {
            addCriterion("raiseNo <=", value, "raiseno");
            return (Criteria) this;
        }

        public Criteria andRaisenoLike(String value) {
            addCriterion("raiseNo like", value, "raiseno");
            return (Criteria) this;
        }

        public Criteria andRaisenoNotLike(String value) {
            addCriterion("raiseNo not like", value, "raiseno");
            return (Criteria) this;
        }

        public Criteria andRaisenoIn(List<String> values) {
            addCriterion("raiseNo in", values, "raiseno");
            return (Criteria) this;
        }

        public Criteria andRaisenoNotIn(List<String> values) {
            addCriterion("raiseNo not in", values, "raiseno");
            return (Criteria) this;
        }

        public Criteria andRaisenoBetween(String value1, String value2) {
            addCriterion("raiseNo between", value1, value2, "raiseno");
            return (Criteria) this;
        }

        public Criteria andRaisenoNotBetween(String value1, String value2) {
            addCriterion("raiseNo not between", value1, value2, "raiseno");
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

        public Criteria andRaisesizeEqualTo(Double value) {
            addCriterion("raiseSize =", value, "raisesize");
            return (Criteria) this;
        }

        public Criteria andRaisesizeNotEqualTo(Double value) {
            addCriterion("raiseSize <>", value, "raisesize");
            return (Criteria) this;
        }

        public Criteria andRaisesizeGreaterThan(Double value) {
            addCriterion("raiseSize >", value, "raisesize");
            return (Criteria) this;
        }

        public Criteria andRaisesizeGreaterThanOrEqualTo(Double value) {
            addCriterion("raiseSize >=", value, "raisesize");
            return (Criteria) this;
        }

        public Criteria andRaisesizeLessThan(Double value) {
            addCriterion("raiseSize <", value, "raisesize");
            return (Criteria) this;
        }

        public Criteria andRaisesizeLessThanOrEqualTo(Double value) {
            addCriterion("raiseSize <=", value, "raisesize");
            return (Criteria) this;
        }

        public Criteria andRaisesizeIn(List<Double> values) {
            addCriterion("raiseSize in", values, "raisesize");
            return (Criteria) this;
        }

        public Criteria andRaisesizeNotIn(List<Double> values) {
            addCriterion("raiseSize not in", values, "raisesize");
            return (Criteria) this;
        }

        public Criteria andRaisesizeBetween(Double value1, Double value2) {
            addCriterion("raiseSize between", value1, value2, "raisesize");
            return (Criteria) this;
        }

        public Criteria andRaisesizeNotBetween(Double value1, Double value2) {
            addCriterion("raiseSize not between", value1, value2, "raisesize");
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

        public Criteria andRaisegettimeIsNull() {
            addCriterion("raiseGetTime is null");
            return (Criteria) this;
        }

        public Criteria andRaisegettimeIsNotNull() {
            addCriterion("raiseGetTime is not null");
            return (Criteria) this;
        }

        public Criteria andRaisegettimeEqualTo(Date value) {
            addCriterion("raiseGetTime =", value, "raisegettime");
            return (Criteria) this;
        }

        public Criteria andRaisegettimeNotEqualTo(Date value) {
            addCriterion("raiseGetTime <>", value, "raisegettime");
            return (Criteria) this;
        }

        public Criteria andRaisegettimeGreaterThan(Date value) {
            addCriterion("raiseGetTime >", value, "raisegettime");
            return (Criteria) this;
        }

        public Criteria andRaisegettimeGreaterThanOrEqualTo(Date value) {
            addCriterion("raiseGetTime >=", value, "raisegettime");
            return (Criteria) this;
        }

        public Criteria andRaisegettimeLessThan(Date value) {
            addCriterion("raiseGetTime <", value, "raisegettime");
            return (Criteria) this;
        }

        public Criteria andRaisegettimeLessThanOrEqualTo(Date value) {
            addCriterion("raiseGetTime <=", value, "raisegettime");
            return (Criteria) this;
        }

        public Criteria andRaisegettimeIn(List<Date> values) {
            addCriterion("raiseGetTime in", values, "raisegettime");
            return (Criteria) this;
        }

        public Criteria andRaisegettimeNotIn(List<Date> values) {
            addCriterion("raiseGetTime not in", values, "raisegettime");
            return (Criteria) this;
        }

        public Criteria andRaisegettimeBetween(Date value1, Date value2) {
            addCriterion("raiseGetTime between", value1, value2, "raisegettime");
            return (Criteria) this;
        }

        public Criteria andRaisegettimeNotBetween(Date value1, Date value2) {
            addCriterion("raiseGetTime not between", value1, value2, "raisegettime");
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

        public Criteria andRaiseusetimeIsNull() {
            addCriterion("raiseUseTime is null");
            return (Criteria) this;
        }

        public Criteria andRaiseusetimeIsNotNull() {
            addCriterion("raiseUseTime is not null");
            return (Criteria) this;
        }

        public Criteria andRaiseusetimeEqualTo(String value) {
            addCriterion("raiseUseTime =", value, "raiseusetime");
            return (Criteria) this;
        }

        public Criteria andRaiseusetimeNotEqualTo(String value) {
            addCriterion("raiseUseTime <>", value, "raiseusetime");
            return (Criteria) this;
        }

        public Criteria andRaiseusetimeGreaterThan(String value) {
            addCriterion("raiseUseTime >", value, "raiseusetime");
            return (Criteria) this;
        }

        public Criteria andRaiseusetimeGreaterThanOrEqualTo(String value) {
            addCriterion("raiseUseTime >=", value, "raiseusetime");
            return (Criteria) this;
        }

        public Criteria andRaiseusetimeLessThan(String value) {
            addCriterion("raiseUseTime <", value, "raiseusetime");
            return (Criteria) this;
        }

        public Criteria andRaiseusetimeLessThanOrEqualTo(String value) {
            addCriterion("raiseUseTime <=", value, "raiseusetime");
            return (Criteria) this;
        }

        public Criteria andRaiseusetimeLike(String value) {
            addCriterion("raiseUseTime like", value, "raiseusetime");
            return (Criteria) this;
        }

        public Criteria andRaiseusetimeNotLike(String value) {
            addCriterion("raiseUseTime not like", value, "raiseusetime");
            return (Criteria) this;
        }

        public Criteria andRaiseusetimeIn(List<String> values) {
            addCriterion("raiseUseTime in", values, "raiseusetime");
            return (Criteria) this;
        }

        public Criteria andRaiseusetimeNotIn(List<String> values) {
            addCriterion("raiseUseTime not in", values, "raiseusetime");
            return (Criteria) this;
        }

        public Criteria andRaiseusetimeBetween(String value1, String value2) {
            addCriterion("raiseUseTime between", value1, value2, "raiseusetime");
            return (Criteria) this;
        }

        public Criteria andRaiseusetimeNotBetween(String value1, String value2) {
            addCriterion("raiseUseTime not between", value1, value2, "raiseusetime");
            return (Criteria) this;
        }

        public Criteria andRaisemarkIsNull() {
            addCriterion("raiseMark is null");
            return (Criteria) this;
        }

        public Criteria andRaisemarkIsNotNull() {
            addCriterion("raiseMark is not null");
            return (Criteria) this;
        }

        public Criteria andRaisemarkEqualTo(String value) {
            addCriterion("raiseMark =", value, "raisemark");
            return (Criteria) this;
        }

        public Criteria andRaisemarkNotEqualTo(String value) {
            addCriterion("raiseMark <>", value, "raisemark");
            return (Criteria) this;
        }

        public Criteria andRaisemarkGreaterThan(String value) {
            addCriterion("raiseMark >", value, "raisemark");
            return (Criteria) this;
        }

        public Criteria andRaisemarkGreaterThanOrEqualTo(String value) {
            addCriterion("raiseMark >=", value, "raisemark");
            return (Criteria) this;
        }

        public Criteria andRaisemarkLessThan(String value) {
            addCriterion("raiseMark <", value, "raisemark");
            return (Criteria) this;
        }

        public Criteria andRaisemarkLessThanOrEqualTo(String value) {
            addCriterion("raiseMark <=", value, "raisemark");
            return (Criteria) this;
        }

        public Criteria andRaisemarkLike(String value) {
            addCriterion("raiseMark like", value, "raisemark");
            return (Criteria) this;
        }

        public Criteria andRaisemarkNotLike(String value) {
            addCriterion("raiseMark not like", value, "raisemark");
            return (Criteria) this;
        }

        public Criteria andRaisemarkIn(List<String> values) {
            addCriterion("raiseMark in", values, "raisemark");
            return (Criteria) this;
        }

        public Criteria andRaisemarkNotIn(List<String> values) {
            addCriterion("raiseMark not in", values, "raisemark");
            return (Criteria) this;
        }

        public Criteria andRaisemarkBetween(String value1, String value2) {
            addCriterion("raiseMark between", value1, value2, "raisemark");
            return (Criteria) this;
        }

        public Criteria andRaisemarkNotBetween(String value1, String value2) {
            addCriterion("raiseMark not between", value1, value2, "raisemark");
            return (Criteria) this;
        }

        public Criteria andRaisestateIsNull() {
            addCriterion("raiseState is null");
            return (Criteria) this;
        }

        public Criteria andRaisestateIsNotNull() {
            addCriterion("raiseState is not null");
            return (Criteria) this;
        }

        public Criteria andRaisestateEqualTo(Integer value) {
            addCriterion("raiseState =", value, "raisestate");
            return (Criteria) this;
        }

        public Criteria andRaisestateNotEqualTo(Integer value) {
            addCriterion("raiseState <>", value, "raisestate");
            return (Criteria) this;
        }

        public Criteria andRaisestateGreaterThan(Integer value) {
            addCriterion("raiseState >", value, "raisestate");
            return (Criteria) this;
        }

        public Criteria andRaisestateGreaterThanOrEqualTo(Integer value) {
            addCriterion("raiseState >=", value, "raisestate");
            return (Criteria) this;
        }

        public Criteria andRaisestateLessThan(Integer value) {
            addCriterion("raiseState <", value, "raisestate");
            return (Criteria) this;
        }

        public Criteria andRaisestateLessThanOrEqualTo(Integer value) {
            addCriterion("raiseState <=", value, "raisestate");
            return (Criteria) this;
        }

        public Criteria andRaisestateIn(List<Integer> values) {
            addCriterion("raiseState in", values, "raisestate");
            return (Criteria) this;
        }

        public Criteria andRaisestateNotIn(List<Integer> values) {
            addCriterion("raiseState not in", values, "raisestate");
            return (Criteria) this;
        }

        public Criteria andRaisestateBetween(Integer value1, Integer value2) {
            addCriterion("raiseState between", value1, value2, "raisestate");
            return (Criteria) this;
        }

        public Criteria andRaisestateNotBetween(Integer value1, Integer value2) {
            addCriterion("raiseState not between", value1, value2, "raisestate");
            return (Criteria) this;
        }

        public Criteria andRaiseoldmoneyIsNull() {
            addCriterion("raiseOldMoney is null");
            return (Criteria) this;
        }

        public Criteria andRaiseoldmoneyIsNotNull() {
            addCriterion("raiseOldMoney is not null");
            return (Criteria) this;
        }

        public Criteria andRaiseoldmoneyEqualTo(Long value) {
            addCriterion("raiseOldMoney =", value, "raiseoldmoney");
            return (Criteria) this;
        }

        public Criteria andRaiseoldmoneyNotEqualTo(Long value) {
            addCriterion("raiseOldMoney <>", value, "raiseoldmoney");
            return (Criteria) this;
        }

        public Criteria andRaiseoldmoneyGreaterThan(Long value) {
            addCriterion("raiseOldMoney >", value, "raiseoldmoney");
            return (Criteria) this;
        }

        public Criteria andRaiseoldmoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("raiseOldMoney >=", value, "raiseoldmoney");
            return (Criteria) this;
        }

        public Criteria andRaiseoldmoneyLessThan(Long value) {
            addCriterion("raiseOldMoney <", value, "raiseoldmoney");
            return (Criteria) this;
        }

        public Criteria andRaiseoldmoneyLessThanOrEqualTo(Long value) {
            addCriterion("raiseOldMoney <=", value, "raiseoldmoney");
            return (Criteria) this;
        }

        public Criteria andRaiseoldmoneyIn(List<Long> values) {
            addCriterion("raiseOldMoney in", values, "raiseoldmoney");
            return (Criteria) this;
        }

        public Criteria andRaiseoldmoneyNotIn(List<Long> values) {
            addCriterion("raiseOldMoney not in", values, "raiseoldmoney");
            return (Criteria) this;
        }

        public Criteria andRaiseoldmoneyBetween(Long value1, Long value2) {
            addCriterion("raiseOldMoney between", value1, value2, "raiseoldmoney");
            return (Criteria) this;
        }

        public Criteria andRaiseoldmoneyNotBetween(Long value1, Long value2) {
            addCriterion("raiseOldMoney not between", value1, value2, "raiseoldmoney");
            return (Criteria) this;
        }

        public Criteria andRaisedatenumIsNull() {
            addCriterion("raiseDateNum is null");
            return (Criteria) this;
        }

        public Criteria andRaisedatenumIsNotNull() {
            addCriterion("raiseDateNum is not null");
            return (Criteria) this;
        }

        public Criteria andRaisedatenumEqualTo(Integer value) {
            addCriterion("raiseDateNum =", value, "raisedatenum");
            return (Criteria) this;
        }

        public Criteria andRaisedatenumNotEqualTo(Integer value) {
            addCriterion("raiseDateNum <>", value, "raisedatenum");
            return (Criteria) this;
        }

        public Criteria andRaisedatenumGreaterThan(Integer value) {
            addCriterion("raiseDateNum >", value, "raisedatenum");
            return (Criteria) this;
        }

        public Criteria andRaisedatenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("raiseDateNum >=", value, "raisedatenum");
            return (Criteria) this;
        }

        public Criteria andRaisedatenumLessThan(Integer value) {
            addCriterion("raiseDateNum <", value, "raisedatenum");
            return (Criteria) this;
        }

        public Criteria andRaisedatenumLessThanOrEqualTo(Integer value) {
            addCriterion("raiseDateNum <=", value, "raisedatenum");
            return (Criteria) this;
        }

        public Criteria andRaisedatenumIn(List<Integer> values) {
            addCriterion("raiseDateNum in", values, "raisedatenum");
            return (Criteria) this;
        }

        public Criteria andRaisedatenumNotIn(List<Integer> values) {
            addCriterion("raiseDateNum not in", values, "raisedatenum");
            return (Criteria) this;
        }

        public Criteria andRaisedatenumBetween(Integer value1, Integer value2) {
            addCriterion("raiseDateNum between", value1, value2, "raisedatenum");
            return (Criteria) this;
        }

        public Criteria andRaisedatenumNotBetween(Integer value1, Integer value2) {
            addCriterion("raiseDateNum not between", value1, value2, "raisedatenum");
            return (Criteria) this;
        }

        public Criteria andRaisedatepastIsNull() {
            addCriterion("raiseDatePast is null");
            return (Criteria) this;
        }

        public Criteria andRaisedatepastIsNotNull() {
            addCriterion("raiseDatePast is not null");
            return (Criteria) this;
        }

        public Criteria andRaisedatepastEqualTo(Integer value) {
            addCriterion("raiseDatePast =", value, "raisedatepast");
            return (Criteria) this;
        }

        public Criteria andRaisedatepastNotEqualTo(Integer value) {
            addCriterion("raiseDatePast <>", value, "raisedatepast");
            return (Criteria) this;
        }

        public Criteria andRaisedatepastGreaterThan(Integer value) {
            addCriterion("raiseDatePast >", value, "raisedatepast");
            return (Criteria) this;
        }

        public Criteria andRaisedatepastGreaterThanOrEqualTo(Integer value) {
            addCriterion("raiseDatePast >=", value, "raisedatepast");
            return (Criteria) this;
        }

        public Criteria andRaisedatepastLessThan(Integer value) {
            addCriterion("raiseDatePast <", value, "raisedatepast");
            return (Criteria) this;
        }

        public Criteria andRaisedatepastLessThanOrEqualTo(Integer value) {
            addCriterion("raiseDatePast <=", value, "raisedatepast");
            return (Criteria) this;
        }

        public Criteria andRaisedatepastIn(List<Integer> values) {
            addCriterion("raiseDatePast in", values, "raisedatepast");
            return (Criteria) this;
        }

        public Criteria andRaisedatepastNotIn(List<Integer> values) {
            addCriterion("raiseDatePast not in", values, "raisedatepast");
            return (Criteria) this;
        }

        public Criteria andRaisedatepastBetween(Integer value1, Integer value2) {
            addCriterion("raiseDatePast between", value1, value2, "raisedatepast");
            return (Criteria) this;
        }

        public Criteria andRaisedatepastNotBetween(Integer value1, Integer value2) {
            addCriterion("raiseDatePast not between", value1, value2, "raisedatepast");
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
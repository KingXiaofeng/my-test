package com.yhb.bean.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SystemLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SystemLogExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andTruenameIsNull() {
            addCriterion("trueName is null");
            return (Criteria) this;
        }

        public Criteria andTruenameIsNotNull() {
            addCriterion("trueName is not null");
            return (Criteria) this;
        }

        public Criteria andTruenameEqualTo(String value) {
            addCriterion("trueName =", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotEqualTo(String value) {
            addCriterion("trueName <>", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameGreaterThan(String value) {
            addCriterion("trueName >", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameGreaterThanOrEqualTo(String value) {
            addCriterion("trueName >=", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameLessThan(String value) {
            addCriterion("trueName <", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameLessThanOrEqualTo(String value) {
            addCriterion("trueName <=", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameLike(String value) {
            addCriterion("trueName like", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotLike(String value) {
            addCriterion("trueName not like", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameIn(List<String> values) {
            addCriterion("trueName in", values, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotIn(List<String> values) {
            addCriterion("trueName not in", values, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameBetween(String value1, String value2) {
            addCriterion("trueName between", value1, value2, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotBetween(String value1, String value2) {
            addCriterion("trueName not between", value1, value2, "truename");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andIsfallorokIsNull() {
            addCriterion("isFallOrOk is null");
            return (Criteria) this;
        }

        public Criteria andIsfallorokIsNotNull() {
            addCriterion("isFallOrOk is not null");
            return (Criteria) this;
        }

        public Criteria andIsfallorokEqualTo(Integer value) {
            addCriterion("isFallOrOk =", value, "isfallorok");
            return (Criteria) this;
        }

        public Criteria andIsfallorokNotEqualTo(Integer value) {
            addCriterion("isFallOrOk <>", value, "isfallorok");
            return (Criteria) this;
        }

        public Criteria andIsfallorokGreaterThan(Integer value) {
            addCriterion("isFallOrOk >", value, "isfallorok");
            return (Criteria) this;
        }

        public Criteria andIsfallorokGreaterThanOrEqualTo(Integer value) {
            addCriterion("isFallOrOk >=", value, "isfallorok");
            return (Criteria) this;
        }

        public Criteria andIsfallorokLessThan(Integer value) {
            addCriterion("isFallOrOk <", value, "isfallorok");
            return (Criteria) this;
        }

        public Criteria andIsfallorokLessThanOrEqualTo(Integer value) {
            addCriterion("isFallOrOk <=", value, "isfallorok");
            return (Criteria) this;
        }

        public Criteria andIsfallorokIn(List<Integer> values) {
            addCriterion("isFallOrOk in", values, "isfallorok");
            return (Criteria) this;
        }

        public Criteria andIsfallorokNotIn(List<Integer> values) {
            addCriterion("isFallOrOk not in", values, "isfallorok");
            return (Criteria) this;
        }

        public Criteria andIsfallorokBetween(Integer value1, Integer value2) {
            addCriterion("isFallOrOk between", value1, value2, "isfallorok");
            return (Criteria) this;
        }

        public Criteria andIsfallorokNotBetween(Integer value1, Integer value2) {
            addCriterion("isFallOrOk not between", value1, value2, "isfallorok");
            return (Criteria) this;
        }

        public Criteria andOldmoneyIsNull() {
            addCriterion("oldMoney is null");
            return (Criteria) this;
        }

        public Criteria andOldmoneyIsNotNull() {
            addCriterion("oldMoney is not null");
            return (Criteria) this;
        }

        public Criteria andOldmoneyEqualTo(BigDecimal value) {
            addCriterion("oldMoney =", value, "oldmoney");
            return (Criteria) this;
        }

        public Criteria andOldmoneyNotEqualTo(BigDecimal value) {
            addCriterion("oldMoney <>", value, "oldmoney");
            return (Criteria) this;
        }

        public Criteria andOldmoneyGreaterThan(BigDecimal value) {
            addCriterion("oldMoney >", value, "oldmoney");
            return (Criteria) this;
        }

        public Criteria andOldmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("oldMoney >=", value, "oldmoney");
            return (Criteria) this;
        }

        public Criteria andOldmoneyLessThan(BigDecimal value) {
            addCriterion("oldMoney <", value, "oldmoney");
            return (Criteria) this;
        }

        public Criteria andOldmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("oldMoney <=", value, "oldmoney");
            return (Criteria) this;
        }

        public Criteria andOldmoneyIn(List<BigDecimal> values) {
            addCriterion("oldMoney in", values, "oldmoney");
            return (Criteria) this;
        }

        public Criteria andOldmoneyNotIn(List<BigDecimal> values) {
            addCriterion("oldMoney not in", values, "oldmoney");
            return (Criteria) this;
        }

        public Criteria andOldmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("oldMoney between", value1, value2, "oldmoney");
            return (Criteria) this;
        }

        public Criteria andOldmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("oldMoney not between", value1, value2, "oldmoney");
            return (Criteria) this;
        }

        public Criteria andChangemoneyIsNull() {
            addCriterion("changeMoney is null");
            return (Criteria) this;
        }

        public Criteria andChangemoneyIsNotNull() {
            addCriterion("changeMoney is not null");
            return (Criteria) this;
        }

        public Criteria andChangemoneyEqualTo(BigDecimal value) {
            addCriterion("changeMoney =", value, "changemoney");
            return (Criteria) this;
        }

        public Criteria andChangemoneyNotEqualTo(BigDecimal value) {
            addCriterion("changeMoney <>", value, "changemoney");
            return (Criteria) this;
        }

        public Criteria andChangemoneyGreaterThan(BigDecimal value) {
            addCriterion("changeMoney >", value, "changemoney");
            return (Criteria) this;
        }

        public Criteria andChangemoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("changeMoney >=", value, "changemoney");
            return (Criteria) this;
        }

        public Criteria andChangemoneyLessThan(BigDecimal value) {
            addCriterion("changeMoney <", value, "changemoney");
            return (Criteria) this;
        }

        public Criteria andChangemoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("changeMoney <=", value, "changemoney");
            return (Criteria) this;
        }

        public Criteria andChangemoneyIn(List<BigDecimal> values) {
            addCriterion("changeMoney in", values, "changemoney");
            return (Criteria) this;
        }

        public Criteria andChangemoneyNotIn(List<BigDecimal> values) {
            addCriterion("changeMoney not in", values, "changemoney");
            return (Criteria) this;
        }

        public Criteria andChangemoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("changeMoney between", value1, value2, "changemoney");
            return (Criteria) this;
        }

        public Criteria andChangemoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("changeMoney not between", value1, value2, "changemoney");
            return (Criteria) this;
        }

        public Criteria andNewmoneyIsNull() {
            addCriterion("newMoney is null");
            return (Criteria) this;
        }

        public Criteria andNewmoneyIsNotNull() {
            addCriterion("newMoney is not null");
            return (Criteria) this;
        }

        public Criteria andNewmoneyEqualTo(BigDecimal value) {
            addCriterion("newMoney =", value, "newmoney");
            return (Criteria) this;
        }

        public Criteria andNewmoneyNotEqualTo(BigDecimal value) {
            addCriterion("newMoney <>", value, "newmoney");
            return (Criteria) this;
        }

        public Criteria andNewmoneyGreaterThan(BigDecimal value) {
            addCriterion("newMoney >", value, "newmoney");
            return (Criteria) this;
        }

        public Criteria andNewmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("newMoney >=", value, "newmoney");
            return (Criteria) this;
        }

        public Criteria andNewmoneyLessThan(BigDecimal value) {
            addCriterion("newMoney <", value, "newmoney");
            return (Criteria) this;
        }

        public Criteria andNewmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("newMoney <=", value, "newmoney");
            return (Criteria) this;
        }

        public Criteria andNewmoneyIn(List<BigDecimal> values) {
            addCriterion("newMoney in", values, "newmoney");
            return (Criteria) this;
        }

        public Criteria andNewmoneyNotIn(List<BigDecimal> values) {
            addCriterion("newMoney not in", values, "newmoney");
            return (Criteria) this;
        }

        public Criteria andNewmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("newMoney between", value1, value2, "newmoney");
            return (Criteria) this;
        }

        public Criteria andNewmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("newMoney not between", value1, value2, "newmoney");
            return (Criteria) this;
        }

        public Criteria andDescribeeIsNull() {
            addCriterion("describee is null");
            return (Criteria) this;
        }

        public Criteria andDescribeeIsNotNull() {
            addCriterion("describee is not null");
            return (Criteria) this;
        }

        public Criteria andDescribeeEqualTo(String value) {
            addCriterion("describee =", value, "describee");
            return (Criteria) this;
        }

        public Criteria andDescribeeNotEqualTo(String value) {
            addCriterion("describee <>", value, "describee");
            return (Criteria) this;
        }

        public Criteria andDescribeeGreaterThan(String value) {
            addCriterion("describee >", value, "describee");
            return (Criteria) this;
        }

        public Criteria andDescribeeGreaterThanOrEqualTo(String value) {
            addCriterion("describee >=", value, "describee");
            return (Criteria) this;
        }

        public Criteria andDescribeeLessThan(String value) {
            addCriterion("describee <", value, "describee");
            return (Criteria) this;
        }

        public Criteria andDescribeeLessThanOrEqualTo(String value) {
            addCriterion("describee <=", value, "describee");
            return (Criteria) this;
        }

        public Criteria andDescribeeLike(String value) {
            addCriterion("describee like", value, "describee");
            return (Criteria) this;
        }

        public Criteria andDescribeeNotLike(String value) {
            addCriterion("describee not like", value, "describee");
            return (Criteria) this;
        }

        public Criteria andDescribeeIn(List<String> values) {
            addCriterion("describee in", values, "describee");
            return (Criteria) this;
        }

        public Criteria andDescribeeNotIn(List<String> values) {
            addCriterion("describee not in", values, "describee");
            return (Criteria) this;
        }

        public Criteria andDescribeeBetween(String value1, String value2) {
            addCriterion("describee between", value1, value2, "describee");
            return (Criteria) this;
        }

        public Criteria andDescribeeNotBetween(String value1, String value2) {
            addCriterion("describee not between", value1, value2, "describee");
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
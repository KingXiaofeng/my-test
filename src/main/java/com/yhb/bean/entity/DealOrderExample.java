package com.yhb.bean.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DealOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DealOrderExample() {
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

        public Criteria andOrdernumberIsNull() {
            addCriterion("OrderNumber is null");
            return (Criteria) this;
        }

        public Criteria andOrdernumberIsNotNull() {
            addCriterion("OrderNumber is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernumberEqualTo(String value) {
            addCriterion("OrderNumber =", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotEqualTo(String value) {
            addCriterion("OrderNumber <>", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberGreaterThan(String value) {
            addCriterion("OrderNumber >", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberGreaterThanOrEqualTo(String value) {
            addCriterion("OrderNumber >=", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberLessThan(String value) {
            addCriterion("OrderNumber <", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberLessThanOrEqualTo(String value) {
            addCriterion("OrderNumber <=", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberLike(String value) {
            addCriterion("OrderNumber like", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotLike(String value) {
            addCriterion("OrderNumber not like", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberIn(List<String> values) {
            addCriterion("OrderNumber in", values, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotIn(List<String> values) {
            addCriterion("OrderNumber not in", values, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberBetween(String value1, String value2) {
            addCriterion("OrderNumber between", value1, value2, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotBetween(String value1, String value2) {
            addCriterion("OrderNumber not between", value1, value2, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNull() {
            addCriterion("OrderID is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("OrderID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("OrderID =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("OrderID <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("OrderID >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("OrderID >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("OrderID <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("OrderID <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("OrderID like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("OrderID not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("OrderID in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("OrderID not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("OrderID between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("OrderID not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrdermoneyIsNull() {
            addCriterion("OrderMoney is null");
            return (Criteria) this;
        }

        public Criteria andOrdermoneyIsNotNull() {
            addCriterion("OrderMoney is not null");
            return (Criteria) this;
        }

        public Criteria andOrdermoneyEqualTo(BigDecimal value) {
            addCriterion("OrderMoney =", value, "ordermoney");
            return (Criteria) this;
        }

        public Criteria andOrdermoneyNotEqualTo(BigDecimal value) {
            addCriterion("OrderMoney <>", value, "ordermoney");
            return (Criteria) this;
        }

        public Criteria andOrdermoneyGreaterThan(BigDecimal value) {
            addCriterion("OrderMoney >", value, "ordermoney");
            return (Criteria) this;
        }

        public Criteria andOrdermoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OrderMoney >=", value, "ordermoney");
            return (Criteria) this;
        }

        public Criteria andOrdermoneyLessThan(BigDecimal value) {
            addCriterion("OrderMoney <", value, "ordermoney");
            return (Criteria) this;
        }

        public Criteria andOrdermoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OrderMoney <=", value, "ordermoney");
            return (Criteria) this;
        }

        public Criteria andOrdermoneyIn(List<BigDecimal> values) {
            addCriterion("OrderMoney in", values, "ordermoney");
            return (Criteria) this;
        }

        public Criteria andOrdermoneyNotIn(List<BigDecimal> values) {
            addCriterion("OrderMoney not in", values, "ordermoney");
            return (Criteria) this;
        }

        public Criteria andOrdermoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OrderMoney between", value1, value2, "ordermoney");
            return (Criteria) this;
        }

        public Criteria andOrdermoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OrderMoney not between", value1, value2, "ordermoney");
            return (Criteria) this;
        }

        public Criteria andOrderstateIsNull() {
            addCriterion("OrderState is null");
            return (Criteria) this;
        }

        public Criteria andOrderstateIsNotNull() {
            addCriterion("OrderState is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstateEqualTo(Integer value) {
            addCriterion("OrderState =", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotEqualTo(Integer value) {
            addCriterion("OrderState <>", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateGreaterThan(Integer value) {
            addCriterion("OrderState >", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderState >=", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateLessThan(Integer value) {
            addCriterion("OrderState <", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateLessThanOrEqualTo(Integer value) {
            addCriterion("OrderState <=", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateIn(List<Integer> values) {
            addCriterion("OrderState in", values, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotIn(List<Integer> values) {
            addCriterion("OrderState not in", values, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateBetween(Integer value1, Integer value2) {
            addCriterion("OrderState between", value1, value2, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderState not between", value1, value2, "orderstate");
            return (Criteria) this;
        }

        public Criteria andChannelidIsNull() {
            addCriterion("ChannelID is null");
            return (Criteria) this;
        }

        public Criteria andChannelidIsNotNull() {
            addCriterion("ChannelID is not null");
            return (Criteria) this;
        }

        public Criteria andChannelidEqualTo(Integer value) {
            addCriterion("ChannelID =", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidNotEqualTo(Integer value) {
            addCriterion("ChannelID <>", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidGreaterThan(Integer value) {
            addCriterion("ChannelID >", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ChannelID >=", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidLessThan(Integer value) {
            addCriterion("ChannelID <", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidLessThanOrEqualTo(Integer value) {
            addCriterion("ChannelID <=", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidIn(List<Integer> values) {
            addCriterion("ChannelID in", values, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidNotIn(List<Integer> values) {
            addCriterion("ChannelID not in", values, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidBetween(Integer value1, Integer value2) {
            addCriterion("ChannelID between", value1, value2, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidNotBetween(Integer value1, Integer value2) {
            addCriterion("ChannelID not between", value1, value2, "channelid");
            return (Criteria) this;
        }

        public Criteria andInterfacepercentageIsNull() {
            addCriterion("InterfacePercentage is null");
            return (Criteria) this;
        }

        public Criteria andInterfacepercentageIsNotNull() {
            addCriterion("InterfacePercentage is not null");
            return (Criteria) this;
        }

        public Criteria andInterfacepercentageEqualTo(BigDecimal value) {
            addCriterion("InterfacePercentage =", value, "interfacepercentage");
            return (Criteria) this;
        }

        public Criteria andInterfacepercentageNotEqualTo(BigDecimal value) {
            addCriterion("InterfacePercentage <>", value, "interfacepercentage");
            return (Criteria) this;
        }

        public Criteria andInterfacepercentageGreaterThan(BigDecimal value) {
            addCriterion("InterfacePercentage >", value, "interfacepercentage");
            return (Criteria) this;
        }

        public Criteria andInterfacepercentageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("InterfacePercentage >=", value, "interfacepercentage");
            return (Criteria) this;
        }

        public Criteria andInterfacepercentageLessThan(BigDecimal value) {
            addCriterion("InterfacePercentage <", value, "interfacepercentage");
            return (Criteria) this;
        }

        public Criteria andInterfacepercentageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("InterfacePercentage <=", value, "interfacepercentage");
            return (Criteria) this;
        }

        public Criteria andInterfacepercentageIn(List<BigDecimal> values) {
            addCriterion("InterfacePercentage in", values, "interfacepercentage");
            return (Criteria) this;
        }

        public Criteria andInterfacepercentageNotIn(List<BigDecimal> values) {
            addCriterion("InterfacePercentage not in", values, "interfacepercentage");
            return (Criteria) this;
        }

        public Criteria andInterfacepercentageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("InterfacePercentage between", value1, value2, "interfacepercentage");
            return (Criteria) this;
        }

        public Criteria andInterfacepercentageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("InterfacePercentage not between", value1, value2, "interfacepercentage");
            return (Criteria) this;
        }

        public Criteria andInterfacenameIsNull() {
            addCriterion("InterfaceName is null");
            return (Criteria) this;
        }

        public Criteria andInterfacenameIsNotNull() {
            addCriterion("InterfaceName is not null");
            return (Criteria) this;
        }

        public Criteria andInterfacenameEqualTo(String value) {
            addCriterion("InterfaceName =", value, "interfacename");
            return (Criteria) this;
        }

        public Criteria andInterfacenameNotEqualTo(String value) {
            addCriterion("InterfaceName <>", value, "interfacename");
            return (Criteria) this;
        }

        public Criteria andInterfacenameGreaterThan(String value) {
            addCriterion("InterfaceName >", value, "interfacename");
            return (Criteria) this;
        }

        public Criteria andInterfacenameGreaterThanOrEqualTo(String value) {
            addCriterion("InterfaceName >=", value, "interfacename");
            return (Criteria) this;
        }

        public Criteria andInterfacenameLessThan(String value) {
            addCriterion("InterfaceName <", value, "interfacename");
            return (Criteria) this;
        }

        public Criteria andInterfacenameLessThanOrEqualTo(String value) {
            addCriterion("InterfaceName <=", value, "interfacename");
            return (Criteria) this;
        }

        public Criteria andInterfacenameLike(String value) {
            addCriterion("InterfaceName like", value, "interfacename");
            return (Criteria) this;
        }

        public Criteria andInterfacenameNotLike(String value) {
            addCriterion("InterfaceName not like", value, "interfacename");
            return (Criteria) this;
        }

        public Criteria andInterfacenameIn(List<String> values) {
            addCriterion("InterfaceName in", values, "interfacename");
            return (Criteria) this;
        }

        public Criteria andInterfacenameNotIn(List<String> values) {
            addCriterion("InterfaceName not in", values, "interfacename");
            return (Criteria) this;
        }

        public Criteria andInterfacenameBetween(String value1, String value2) {
            addCriterion("InterfaceName between", value1, value2, "interfacename");
            return (Criteria) this;
        }

        public Criteria andInterfacenameNotBetween(String value1, String value2) {
            addCriterion("InterfaceName not between", value1, value2, "interfacename");
            return (Criteria) this;
        }

        public Criteria andChannelpercentageIsNull() {
            addCriterion("ChannelPercentage is null");
            return (Criteria) this;
        }

        public Criteria andChannelpercentageIsNotNull() {
            addCriterion("ChannelPercentage is not null");
            return (Criteria) this;
        }

        public Criteria andChannelpercentageEqualTo(BigDecimal value) {
            addCriterion("ChannelPercentage =", value, "channelpercentage");
            return (Criteria) this;
        }

        public Criteria andChannelpercentageNotEqualTo(BigDecimal value) {
            addCriterion("ChannelPercentage <>", value, "channelpercentage");
            return (Criteria) this;
        }

        public Criteria andChannelpercentageGreaterThan(BigDecimal value) {
            addCriterion("ChannelPercentage >", value, "channelpercentage");
            return (Criteria) this;
        }

        public Criteria andChannelpercentageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ChannelPercentage >=", value, "channelpercentage");
            return (Criteria) this;
        }

        public Criteria andChannelpercentageLessThan(BigDecimal value) {
            addCriterion("ChannelPercentage <", value, "channelpercentage");
            return (Criteria) this;
        }

        public Criteria andChannelpercentageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ChannelPercentage <=", value, "channelpercentage");
            return (Criteria) this;
        }

        public Criteria andChannelpercentageIn(List<BigDecimal> values) {
            addCriterion("ChannelPercentage in", values, "channelpercentage");
            return (Criteria) this;
        }

        public Criteria andChannelpercentageNotIn(List<BigDecimal> values) {
            addCriterion("ChannelPercentage not in", values, "channelpercentage");
            return (Criteria) this;
        }

        public Criteria andChannelpercentageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ChannelPercentage between", value1, value2, "channelpercentage");
            return (Criteria) this;
        }

        public Criteria andChannelpercentageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ChannelPercentage not between", value1, value2, "channelpercentage");
            return (Criteria) this;
        }

        public Criteria andChannelnameIsNull() {
            addCriterion("ChannelName is null");
            return (Criteria) this;
        }

        public Criteria andChannelnameIsNotNull() {
            addCriterion("ChannelName is not null");
            return (Criteria) this;
        }

        public Criteria andChannelnameEqualTo(String value) {
            addCriterion("ChannelName =", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameNotEqualTo(String value) {
            addCriterion("ChannelName <>", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameGreaterThan(String value) {
            addCriterion("ChannelName >", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameGreaterThanOrEqualTo(String value) {
            addCriterion("ChannelName >=", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameLessThan(String value) {
            addCriterion("ChannelName <", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameLessThanOrEqualTo(String value) {
            addCriterion("ChannelName <=", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameLike(String value) {
            addCriterion("ChannelName like", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameNotLike(String value) {
            addCriterion("ChannelName not like", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameIn(List<String> values) {
            addCriterion("ChannelName in", values, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameNotIn(List<String> values) {
            addCriterion("ChannelName not in", values, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameBetween(String value1, String value2) {
            addCriterion("ChannelName between", value1, value2, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameNotBetween(String value1, String value2) {
            addCriterion("ChannelName not between", value1, value2, "channelname");
            return (Criteria) this;
        }

        public Criteria andPayitemIsNull() {
            addCriterion("PayItem is null");
            return (Criteria) this;
        }

        public Criteria andPayitemIsNotNull() {
            addCriterion("PayItem is not null");
            return (Criteria) this;
        }

        public Criteria andPayitemEqualTo(String value) {
            addCriterion("PayItem =", value, "payitem");
            return (Criteria) this;
        }

        public Criteria andPayitemNotEqualTo(String value) {
            addCriterion("PayItem <>", value, "payitem");
            return (Criteria) this;
        }

        public Criteria andPayitemGreaterThan(String value) {
            addCriterion("PayItem >", value, "payitem");
            return (Criteria) this;
        }

        public Criteria andPayitemGreaterThanOrEqualTo(String value) {
            addCriterion("PayItem >=", value, "payitem");
            return (Criteria) this;
        }

        public Criteria andPayitemLessThan(String value) {
            addCriterion("PayItem <", value, "payitem");
            return (Criteria) this;
        }

        public Criteria andPayitemLessThanOrEqualTo(String value) {
            addCriterion("PayItem <=", value, "payitem");
            return (Criteria) this;
        }

        public Criteria andPayitemLike(String value) {
            addCriterion("PayItem like", value, "payitem");
            return (Criteria) this;
        }

        public Criteria andPayitemNotLike(String value) {
            addCriterion("PayItem not like", value, "payitem");
            return (Criteria) this;
        }

        public Criteria andPayitemIn(List<String> values) {
            addCriterion("PayItem in", values, "payitem");
            return (Criteria) this;
        }

        public Criteria andPayitemNotIn(List<String> values) {
            addCriterion("PayItem not in", values, "payitem");
            return (Criteria) this;
        }

        public Criteria andPayitemBetween(String value1, String value2) {
            addCriterion("PayItem between", value1, value2, "payitem");
            return (Criteria) this;
        }

        public Criteria andPayitemNotBetween(String value1, String value2) {
            addCriterion("PayItem not between", value1, value2, "payitem");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIsNull() {
            addCriterion("EmployeeID is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIsNotNull() {
            addCriterion("EmployeeID is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeidEqualTo(String value) {
            addCriterion("EmployeeID =", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotEqualTo(String value) {
            addCriterion("EmployeeID <>", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidGreaterThan(String value) {
            addCriterion("EmployeeID >", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidGreaterThanOrEqualTo(String value) {
            addCriterion("EmployeeID >=", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidLessThan(String value) {
            addCriterion("EmployeeID <", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidLessThanOrEqualTo(String value) {
            addCriterion("EmployeeID <=", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidLike(String value) {
            addCriterion("EmployeeID like", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotLike(String value) {
            addCriterion("EmployeeID not like", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIn(List<String> values) {
            addCriterion("EmployeeID in", values, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotIn(List<String> values) {
            addCriterion("EmployeeID not in", values, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidBetween(String value1, String value2) {
            addCriterion("EmployeeID between", value1, value2, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotBetween(String value1, String value2) {
            addCriterion("EmployeeID not between", value1, value2, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeepercentageIsNull() {
            addCriterion("EmployeePercentage is null");
            return (Criteria) this;
        }

        public Criteria andEmployeepercentageIsNotNull() {
            addCriterion("EmployeePercentage is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeepercentageEqualTo(BigDecimal value) {
            addCriterion("EmployeePercentage =", value, "employeepercentage");
            return (Criteria) this;
        }

        public Criteria andEmployeepercentageNotEqualTo(BigDecimal value) {
            addCriterion("EmployeePercentage <>", value, "employeepercentage");
            return (Criteria) this;
        }

        public Criteria andEmployeepercentageGreaterThan(BigDecimal value) {
            addCriterion("EmployeePercentage >", value, "employeepercentage");
            return (Criteria) this;
        }

        public Criteria andEmployeepercentageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EmployeePercentage >=", value, "employeepercentage");
            return (Criteria) this;
        }

        public Criteria andEmployeepercentageLessThan(BigDecimal value) {
            addCriterion("EmployeePercentage <", value, "employeepercentage");
            return (Criteria) this;
        }

        public Criteria andEmployeepercentageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EmployeePercentage <=", value, "employeepercentage");
            return (Criteria) this;
        }

        public Criteria andEmployeepercentageIn(List<BigDecimal> values) {
            addCriterion("EmployeePercentage in", values, "employeepercentage");
            return (Criteria) this;
        }

        public Criteria andEmployeepercentageNotIn(List<BigDecimal> values) {
            addCriterion("EmployeePercentage not in", values, "employeepercentage");
            return (Criteria) this;
        }

        public Criteria andEmployeepercentageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EmployeePercentage between", value1, value2, "employeepercentage");
            return (Criteria) this;
        }

        public Criteria andEmployeepercentageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EmployeePercentage not between", value1, value2, "employeepercentage");
            return (Criteria) this;
        }

        public Criteria andOthermoneyIsNull() {
            addCriterion("OtherMoney is null");
            return (Criteria) this;
        }

        public Criteria andOthermoneyIsNotNull() {
            addCriterion("OtherMoney is not null");
            return (Criteria) this;
        }

        public Criteria andOthermoneyEqualTo(BigDecimal value) {
            addCriterion("OtherMoney =", value, "othermoney");
            return (Criteria) this;
        }

        public Criteria andOthermoneyNotEqualTo(BigDecimal value) {
            addCriterion("OtherMoney <>", value, "othermoney");
            return (Criteria) this;
        }

        public Criteria andOthermoneyGreaterThan(BigDecimal value) {
            addCriterion("OtherMoney >", value, "othermoney");
            return (Criteria) this;
        }

        public Criteria andOthermoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OtherMoney >=", value, "othermoney");
            return (Criteria) this;
        }

        public Criteria andOthermoneyLessThan(BigDecimal value) {
            addCriterion("OtherMoney <", value, "othermoney");
            return (Criteria) this;
        }

        public Criteria andOthermoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OtherMoney <=", value, "othermoney");
            return (Criteria) this;
        }

        public Criteria andOthermoneyIn(List<BigDecimal> values) {
            addCriterion("OtherMoney in", values, "othermoney");
            return (Criteria) this;
        }

        public Criteria andOthermoneyNotIn(List<BigDecimal> values) {
            addCriterion("OtherMoney not in", values, "othermoney");
            return (Criteria) this;
        }

        public Criteria andOthermoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OtherMoney between", value1, value2, "othermoney");
            return (Criteria) this;
        }

        public Criteria andOthermoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OtherMoney not between", value1, value2, "othermoney");
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

        public Criteria andChecktimeIsNull() {
            addCriterion("CheckTime is null");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNotNull() {
            addCriterion("CheckTime is not null");
            return (Criteria) this;
        }

        public Criteria andChecktimeEqualTo(Date value) {
            addCriterion("CheckTime =", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotEqualTo(Date value) {
            addCriterion("CheckTime <>", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThan(Date value) {
            addCriterion("CheckTime >", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CheckTime >=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThan(Date value) {
            addCriterion("CheckTime <", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThanOrEqualTo(Date value) {
            addCriterion("CheckTime <=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeIn(List<Date> values) {
            addCriterion("CheckTime in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotIn(List<Date> values) {
            addCriterion("CheckTime not in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeBetween(Date value1, Date value2) {
            addCriterion("CheckTime between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotBetween(Date value1, Date value2) {
            addCriterion("CheckTime not between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andCheckidIsNull() {
            addCriterion("CheckID is null");
            return (Criteria) this;
        }

        public Criteria andCheckidIsNotNull() {
            addCriterion("CheckID is not null");
            return (Criteria) this;
        }

        public Criteria andCheckidEqualTo(String value) {
            addCriterion("CheckID =", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidNotEqualTo(String value) {
            addCriterion("CheckID <>", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidGreaterThan(String value) {
            addCriterion("CheckID >", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidGreaterThanOrEqualTo(String value) {
            addCriterion("CheckID >=", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidLessThan(String value) {
            addCriterion("CheckID <", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidLessThanOrEqualTo(String value) {
            addCriterion("CheckID <=", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidLike(String value) {
            addCriterion("CheckID like", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidNotLike(String value) {
            addCriterion("CheckID not like", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidIn(List<String> values) {
            addCriterion("CheckID in", values, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidNotIn(List<String> values) {
            addCriterion("CheckID not in", values, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidBetween(String value1, String value2) {
            addCriterion("CheckID between", value1, value2, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidNotBetween(String value1, String value2) {
            addCriterion("CheckID not between", value1, value2, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckorderidIsNull() {
            addCriterion("CheckOrderID is null");
            return (Criteria) this;
        }

        public Criteria andCheckorderidIsNotNull() {
            addCriterion("CheckOrderID is not null");
            return (Criteria) this;
        }

        public Criteria andCheckorderidEqualTo(String value) {
            addCriterion("CheckOrderID =", value, "checkorderid");
            return (Criteria) this;
        }

        public Criteria andCheckorderidNotEqualTo(String value) {
            addCriterion("CheckOrderID <>", value, "checkorderid");
            return (Criteria) this;
        }

        public Criteria andCheckorderidGreaterThan(String value) {
            addCriterion("CheckOrderID >", value, "checkorderid");
            return (Criteria) this;
        }

        public Criteria andCheckorderidGreaterThanOrEqualTo(String value) {
            addCriterion("CheckOrderID >=", value, "checkorderid");
            return (Criteria) this;
        }

        public Criteria andCheckorderidLessThan(String value) {
            addCriterion("CheckOrderID <", value, "checkorderid");
            return (Criteria) this;
        }

        public Criteria andCheckorderidLessThanOrEqualTo(String value) {
            addCriterion("CheckOrderID <=", value, "checkorderid");
            return (Criteria) this;
        }

        public Criteria andCheckorderidLike(String value) {
            addCriterion("CheckOrderID like", value, "checkorderid");
            return (Criteria) this;
        }

        public Criteria andCheckorderidNotLike(String value) {
            addCriterion("CheckOrderID not like", value, "checkorderid");
            return (Criteria) this;
        }

        public Criteria andCheckorderidIn(List<String> values) {
            addCriterion("CheckOrderID in", values, "checkorderid");
            return (Criteria) this;
        }

        public Criteria andCheckorderidNotIn(List<String> values) {
            addCriterion("CheckOrderID not in", values, "checkorderid");
            return (Criteria) this;
        }

        public Criteria andCheckorderidBetween(String value1, String value2) {
            addCriterion("CheckOrderID between", value1, value2, "checkorderid");
            return (Criteria) this;
        }

        public Criteria andCheckorderidNotBetween(String value1, String value2) {
            addCriterion("CheckOrderID not between", value1, value2, "checkorderid");
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

        public Criteria andReturntimeIsNull() {
            addCriterion("ReturnTime is null");
            return (Criteria) this;
        }

        public Criteria andReturntimeIsNotNull() {
            addCriterion("ReturnTime is not null");
            return (Criteria) this;
        }

        public Criteria andReturntimeEqualTo(Date value) {
            addCriterion("ReturnTime =", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeNotEqualTo(Date value) {
            addCriterion("ReturnTime <>", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeGreaterThan(Date value) {
            addCriterion("ReturnTime >", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ReturnTime >=", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeLessThan(Date value) {
            addCriterion("ReturnTime <", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeLessThanOrEqualTo(Date value) {
            addCriterion("ReturnTime <=", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeIn(List<Date> values) {
            addCriterion("ReturnTime in", values, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeNotIn(List<Date> values) {
            addCriterion("ReturnTime not in", values, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeBetween(Date value1, Date value2) {
            addCriterion("ReturnTime between", value1, value2, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeNotBetween(Date value1, Date value2) {
            addCriterion("ReturnTime not between", value1, value2, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturninterfaceordernumberIsNull() {
            addCriterion("ReturnInterfaceOrderNumber is null");
            return (Criteria) this;
        }

        public Criteria andReturninterfaceordernumberIsNotNull() {
            addCriterion("ReturnInterfaceOrderNumber is not null");
            return (Criteria) this;
        }

        public Criteria andReturninterfaceordernumberEqualTo(String value) {
            addCriterion("ReturnInterfaceOrderNumber =", value, "returninterfaceordernumber");
            return (Criteria) this;
        }

        public Criteria andReturninterfaceordernumberNotEqualTo(String value) {
            addCriterion("ReturnInterfaceOrderNumber <>", value, "returninterfaceordernumber");
            return (Criteria) this;
        }

        public Criteria andReturninterfaceordernumberGreaterThan(String value) {
            addCriterion("ReturnInterfaceOrderNumber >", value, "returninterfaceordernumber");
            return (Criteria) this;
        }

        public Criteria andReturninterfaceordernumberGreaterThanOrEqualTo(String value) {
            addCriterion("ReturnInterfaceOrderNumber >=", value, "returninterfaceordernumber");
            return (Criteria) this;
        }

        public Criteria andReturninterfaceordernumberLessThan(String value) {
            addCriterion("ReturnInterfaceOrderNumber <", value, "returninterfaceordernumber");
            return (Criteria) this;
        }

        public Criteria andReturninterfaceordernumberLessThanOrEqualTo(String value) {
            addCriterion("ReturnInterfaceOrderNumber <=", value, "returninterfaceordernumber");
            return (Criteria) this;
        }

        public Criteria andReturninterfaceordernumberLike(String value) {
            addCriterion("ReturnInterfaceOrderNumber like", value, "returninterfaceordernumber");
            return (Criteria) this;
        }

        public Criteria andReturninterfaceordernumberNotLike(String value) {
            addCriterion("ReturnInterfaceOrderNumber not like", value, "returninterfaceordernumber");
            return (Criteria) this;
        }

        public Criteria andReturninterfaceordernumberIn(List<String> values) {
            addCriterion("ReturnInterfaceOrderNumber in", values, "returninterfaceordernumber");
            return (Criteria) this;
        }

        public Criteria andReturninterfaceordernumberNotIn(List<String> values) {
            addCriterion("ReturnInterfaceOrderNumber not in", values, "returninterfaceordernumber");
            return (Criteria) this;
        }

        public Criteria andReturninterfaceordernumberBetween(String value1, String value2) {
            addCriterion("ReturnInterfaceOrderNumber between", value1, value2, "returninterfaceordernumber");
            return (Criteria) this;
        }

        public Criteria andReturninterfaceordernumberNotBetween(String value1, String value2) {
            addCriterion("ReturnInterfaceOrderNumber not between", value1, value2, "returninterfaceordernumber");
            return (Criteria) this;
        }

        public Criteria andReturnbankordernumberIsNull() {
            addCriterion("ReturnBankOrderNumber is null");
            return (Criteria) this;
        }

        public Criteria andReturnbankordernumberIsNotNull() {
            addCriterion("ReturnBankOrderNumber is not null");
            return (Criteria) this;
        }

        public Criteria andReturnbankordernumberEqualTo(String value) {
            addCriterion("ReturnBankOrderNumber =", value, "returnbankordernumber");
            return (Criteria) this;
        }

        public Criteria andReturnbankordernumberNotEqualTo(String value) {
            addCriterion("ReturnBankOrderNumber <>", value, "returnbankordernumber");
            return (Criteria) this;
        }

        public Criteria andReturnbankordernumberGreaterThan(String value) {
            addCriterion("ReturnBankOrderNumber >", value, "returnbankordernumber");
            return (Criteria) this;
        }

        public Criteria andReturnbankordernumberGreaterThanOrEqualTo(String value) {
            addCriterion("ReturnBankOrderNumber >=", value, "returnbankordernumber");
            return (Criteria) this;
        }

        public Criteria andReturnbankordernumberLessThan(String value) {
            addCriterion("ReturnBankOrderNumber <", value, "returnbankordernumber");
            return (Criteria) this;
        }

        public Criteria andReturnbankordernumberLessThanOrEqualTo(String value) {
            addCriterion("ReturnBankOrderNumber <=", value, "returnbankordernumber");
            return (Criteria) this;
        }

        public Criteria andReturnbankordernumberLike(String value) {
            addCriterion("ReturnBankOrderNumber like", value, "returnbankordernumber");
            return (Criteria) this;
        }

        public Criteria andReturnbankordernumberNotLike(String value) {
            addCriterion("ReturnBankOrderNumber not like", value, "returnbankordernumber");
            return (Criteria) this;
        }

        public Criteria andReturnbankordernumberIn(List<String> values) {
            addCriterion("ReturnBankOrderNumber in", values, "returnbankordernumber");
            return (Criteria) this;
        }

        public Criteria andReturnbankordernumberNotIn(List<String> values) {
            addCriterion("ReturnBankOrderNumber not in", values, "returnbankordernumber");
            return (Criteria) this;
        }

        public Criteria andReturnbankordernumberBetween(String value1, String value2) {
            addCriterion("ReturnBankOrderNumber between", value1, value2, "returnbankordernumber");
            return (Criteria) this;
        }

        public Criteria andReturnbankordernumberNotBetween(String value1, String value2) {
            addCriterion("ReturnBankOrderNumber not between", value1, value2, "returnbankordernumber");
            return (Criteria) this;
        }

        public Criteria andReturnmessageIsNull() {
            addCriterion("ReturnMessage is null");
            return (Criteria) this;
        }

        public Criteria andReturnmessageIsNotNull() {
            addCriterion("ReturnMessage is not null");
            return (Criteria) this;
        }

        public Criteria andReturnmessageEqualTo(String value) {
            addCriterion("ReturnMessage =", value, "returnmessage");
            return (Criteria) this;
        }

        public Criteria andReturnmessageNotEqualTo(String value) {
            addCriterion("ReturnMessage <>", value, "returnmessage");
            return (Criteria) this;
        }

        public Criteria andReturnmessageGreaterThan(String value) {
            addCriterion("ReturnMessage >", value, "returnmessage");
            return (Criteria) this;
        }

        public Criteria andReturnmessageGreaterThanOrEqualTo(String value) {
            addCriterion("ReturnMessage >=", value, "returnmessage");
            return (Criteria) this;
        }

        public Criteria andReturnmessageLessThan(String value) {
            addCriterion("ReturnMessage <", value, "returnmessage");
            return (Criteria) this;
        }

        public Criteria andReturnmessageLessThanOrEqualTo(String value) {
            addCriterion("ReturnMessage <=", value, "returnmessage");
            return (Criteria) this;
        }

        public Criteria andReturnmessageLike(String value) {
            addCriterion("ReturnMessage like", value, "returnmessage");
            return (Criteria) this;
        }

        public Criteria andReturnmessageNotLike(String value) {
            addCriterion("ReturnMessage not like", value, "returnmessage");
            return (Criteria) this;
        }

        public Criteria andReturnmessageIn(List<String> values) {
            addCriterion("ReturnMessage in", values, "returnmessage");
            return (Criteria) this;
        }

        public Criteria andReturnmessageNotIn(List<String> values) {
            addCriterion("ReturnMessage not in", values, "returnmessage");
            return (Criteria) this;
        }

        public Criteria andReturnmessageBetween(String value1, String value2) {
            addCriterion("ReturnMessage between", value1, value2, "returnmessage");
            return (Criteria) this;
        }

        public Criteria andReturnmessageNotBetween(String value1, String value2) {
            addCriterion("ReturnMessage not between", value1, value2, "returnmessage");
            return (Criteria) this;
        }

        public Criteria andPlatidIsNull() {
            addCriterion("platID is null");
            return (Criteria) this;
        }

        public Criteria andPlatidIsNotNull() {
            addCriterion("platID is not null");
            return (Criteria) this;
        }

        public Criteria andPlatidEqualTo(String value) {
            addCriterion("platID =", value, "platid");
            return (Criteria) this;
        }

        public Criteria andPlatidNotEqualTo(String value) {
            addCriterion("platID <>", value, "platid");
            return (Criteria) this;
        }

        public Criteria andPlatidGreaterThan(String value) {
            addCriterion("platID >", value, "platid");
            return (Criteria) this;
        }

        public Criteria andPlatidGreaterThanOrEqualTo(String value) {
            addCriterion("platID >=", value, "platid");
            return (Criteria) this;
        }

        public Criteria andPlatidLessThan(String value) {
            addCriterion("platID <", value, "platid");
            return (Criteria) this;
        }

        public Criteria andPlatidLessThanOrEqualTo(String value) {
            addCriterion("platID <=", value, "platid");
            return (Criteria) this;
        }

        public Criteria andPlatidLike(String value) {
            addCriterion("platID like", value, "platid");
            return (Criteria) this;
        }

        public Criteria andPlatidNotLike(String value) {
            addCriterion("platID not like", value, "platid");
            return (Criteria) this;
        }

        public Criteria andPlatidIn(List<String> values) {
            addCriterion("platID in", values, "platid");
            return (Criteria) this;
        }

        public Criteria andPlatidNotIn(List<String> values) {
            addCriterion("platID not in", values, "platid");
            return (Criteria) this;
        }

        public Criteria andPlatidBetween(String value1, String value2) {
            addCriterion("platID between", value1, value2, "platid");
            return (Criteria) this;
        }

        public Criteria andPlatidNotBetween(String value1, String value2) {
            addCriterion("platID not between", value1, value2, "platid");
            return (Criteria) this;
        }

        public Criteria andLiftcycleIsNull() {
            addCriterion("LiftCycle is null");
            return (Criteria) this;
        }

        public Criteria andLiftcycleIsNotNull() {
            addCriterion("LiftCycle is not null");
            return (Criteria) this;
        }

        public Criteria andLiftcycleEqualTo(String value) {
            addCriterion("LiftCycle =", value, "liftcycle");
            return (Criteria) this;
        }

        public Criteria andLiftcycleNotEqualTo(String value) {
            addCriterion("LiftCycle <>", value, "liftcycle");
            return (Criteria) this;
        }

        public Criteria andLiftcycleGreaterThan(String value) {
            addCriterion("LiftCycle >", value, "liftcycle");
            return (Criteria) this;
        }

        public Criteria andLiftcycleGreaterThanOrEqualTo(String value) {
            addCriterion("LiftCycle >=", value, "liftcycle");
            return (Criteria) this;
        }

        public Criteria andLiftcycleLessThan(String value) {
            addCriterion("LiftCycle <", value, "liftcycle");
            return (Criteria) this;
        }

        public Criteria andLiftcycleLessThanOrEqualTo(String value) {
            addCriterion("LiftCycle <=", value, "liftcycle");
            return (Criteria) this;
        }

        public Criteria andLiftcycleLike(String value) {
            addCriterion("LiftCycle like", value, "liftcycle");
            return (Criteria) this;
        }

        public Criteria andLiftcycleNotLike(String value) {
            addCriterion("LiftCycle not like", value, "liftcycle");
            return (Criteria) this;
        }

        public Criteria andLiftcycleIn(List<String> values) {
            addCriterion("LiftCycle in", values, "liftcycle");
            return (Criteria) this;
        }

        public Criteria andLiftcycleNotIn(List<String> values) {
            addCriterion("LiftCycle not in", values, "liftcycle");
            return (Criteria) this;
        }

        public Criteria andLiftcycleBetween(String value1, String value2) {
            addCriterion("LiftCycle between", value1, value2, "liftcycle");
            return (Criteria) this;
        }

        public Criteria andLiftcycleNotBetween(String value1, String value2) {
            addCriterion("LiftCycle not between", value1, value2, "liftcycle");
            return (Criteria) this;
        }

        public Criteria andLifttimeIsNull() {
            addCriterion("LiftTime is null");
            return (Criteria) this;
        }

        public Criteria andLifttimeIsNotNull() {
            addCriterion("LiftTime is not null");
            return (Criteria) this;
        }

        public Criteria andLifttimeEqualTo(String value) {
            addCriterion("LiftTime =", value, "lifttime");
            return (Criteria) this;
        }

        public Criteria andLifttimeNotEqualTo(String value) {
            addCriterion("LiftTime <>", value, "lifttime");
            return (Criteria) this;
        }

        public Criteria andLifttimeGreaterThan(String value) {
            addCriterion("LiftTime >", value, "lifttime");
            return (Criteria) this;
        }

        public Criteria andLifttimeGreaterThanOrEqualTo(String value) {
            addCriterion("LiftTime >=", value, "lifttime");
            return (Criteria) this;
        }

        public Criteria andLifttimeLessThan(String value) {
            addCriterion("LiftTime <", value, "lifttime");
            return (Criteria) this;
        }

        public Criteria andLifttimeLessThanOrEqualTo(String value) {
            addCriterion("LiftTime <=", value, "lifttime");
            return (Criteria) this;
        }

        public Criteria andLifttimeLike(String value) {
            addCriterion("LiftTime like", value, "lifttime");
            return (Criteria) this;
        }

        public Criteria andLifttimeNotLike(String value) {
            addCriterion("LiftTime not like", value, "lifttime");
            return (Criteria) this;
        }

        public Criteria andLifttimeIn(List<String> values) {
            addCriterion("LiftTime in", values, "lifttime");
            return (Criteria) this;
        }

        public Criteria andLifttimeNotIn(List<String> values) {
            addCriterion("LiftTime not in", values, "lifttime");
            return (Criteria) this;
        }

        public Criteria andLifttimeBetween(String value1, String value2) {
            addCriterion("LiftTime between", value1, value2, "lifttime");
            return (Criteria) this;
        }

        public Criteria andLifttimeNotBetween(String value1, String value2) {
            addCriterion("LiftTime not between", value1, value2, "lifttime");
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
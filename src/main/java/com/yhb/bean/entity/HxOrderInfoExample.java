package com.yhb.bean.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HxOrderInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HxOrderInfoExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsrCustidIsNull() {
            addCriterion("usr_custId is null");
            return (Criteria) this;
        }

        public Criteria andUsrCustidIsNotNull() {
            addCriterion("usr_custId is not null");
            return (Criteria) this;
        }

        public Criteria andUsrCustidEqualTo(String value) {
            addCriterion("usr_custId =", value, "usrCustid");
            return (Criteria) this;
        }

        public Criteria andUsrCustidNotEqualTo(String value) {
            addCriterion("usr_custId <>", value, "usrCustid");
            return (Criteria) this;
        }

        public Criteria andUsrCustidGreaterThan(String value) {
            addCriterion("usr_custId >", value, "usrCustid");
            return (Criteria) this;
        }

        public Criteria andUsrCustidGreaterThanOrEqualTo(String value) {
            addCriterion("usr_custId >=", value, "usrCustid");
            return (Criteria) this;
        }

        public Criteria andUsrCustidLessThan(String value) {
            addCriterion("usr_custId <", value, "usrCustid");
            return (Criteria) this;
        }

        public Criteria andUsrCustidLessThanOrEqualTo(String value) {
            addCriterion("usr_custId <=", value, "usrCustid");
            return (Criteria) this;
        }

        public Criteria andUsrCustidLike(String value) {
            addCriterion("usr_custId like", value, "usrCustid");
            return (Criteria) this;
        }

        public Criteria andUsrCustidNotLike(String value) {
            addCriterion("usr_custId not like", value, "usrCustid");
            return (Criteria) this;
        }

        public Criteria andUsrCustidIn(List<String> values) {
            addCriterion("usr_custId in", values, "usrCustid");
            return (Criteria) this;
        }

        public Criteria andUsrCustidNotIn(List<String> values) {
            addCriterion("usr_custId not in", values, "usrCustid");
            return (Criteria) this;
        }

        public Criteria andUsrCustidBetween(String value1, String value2) {
            addCriterion("usr_custId between", value1, value2, "usrCustid");
            return (Criteria) this;
        }

        public Criteria andUsrCustidNotBetween(String value1, String value2) {
            addCriterion("usr_custId not between", value1, value2, "usrCustid");
            return (Criteria) this;
        }

        public Criteria andIpsBillnoIsNull() {
            addCriterion("ips_billNo is null");
            return (Criteria) this;
        }

        public Criteria andIpsBillnoIsNotNull() {
            addCriterion("ips_billNo is not null");
            return (Criteria) this;
        }

        public Criteria andIpsBillnoEqualTo(String value) {
            addCriterion("ips_billNo =", value, "ipsBillno");
            return (Criteria) this;
        }

        public Criteria andIpsBillnoNotEqualTo(String value) {
            addCriterion("ips_billNo <>", value, "ipsBillno");
            return (Criteria) this;
        }

        public Criteria andIpsBillnoGreaterThan(String value) {
            addCriterion("ips_billNo >", value, "ipsBillno");
            return (Criteria) this;
        }

        public Criteria andIpsBillnoGreaterThanOrEqualTo(String value) {
            addCriterion("ips_billNo >=", value, "ipsBillno");
            return (Criteria) this;
        }

        public Criteria andIpsBillnoLessThan(String value) {
            addCriterion("ips_billNo <", value, "ipsBillno");
            return (Criteria) this;
        }

        public Criteria andIpsBillnoLessThanOrEqualTo(String value) {
            addCriterion("ips_billNo <=", value, "ipsBillno");
            return (Criteria) this;
        }

        public Criteria andIpsBillnoLike(String value) {
            addCriterion("ips_billNo like", value, "ipsBillno");
            return (Criteria) this;
        }

        public Criteria andIpsBillnoNotLike(String value) {
            addCriterion("ips_billNo not like", value, "ipsBillno");
            return (Criteria) this;
        }

        public Criteria andIpsBillnoIn(List<String> values) {
            addCriterion("ips_billNo in", values, "ipsBillno");
            return (Criteria) this;
        }

        public Criteria andIpsBillnoNotIn(List<String> values) {
            addCriterion("ips_billNo not in", values, "ipsBillno");
            return (Criteria) this;
        }

        public Criteria andIpsBillnoBetween(String value1, String value2) {
            addCriterion("ips_billNo between", value1, value2, "ipsBillno");
            return (Criteria) this;
        }

        public Criteria andIpsBillnoNotBetween(String value1, String value2) {
            addCriterion("ips_billNo not between", value1, value2, "ipsBillno");
            return (Criteria) this;
        }

        public Criteria andActNameIsNull() {
            addCriterion("act_name is null");
            return (Criteria) this;
        }

        public Criteria andActNameIsNotNull() {
            addCriterion("act_name is not null");
            return (Criteria) this;
        }

        public Criteria andActNameEqualTo(String value) {
            addCriterion("act_name =", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameNotEqualTo(String value) {
            addCriterion("act_name <>", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameGreaterThan(String value) {
            addCriterion("act_name >", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameGreaterThanOrEqualTo(String value) {
            addCriterion("act_name >=", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameLessThan(String value) {
            addCriterion("act_name <", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameLessThanOrEqualTo(String value) {
            addCriterion("act_name <=", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameLike(String value) {
            addCriterion("act_name like", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameNotLike(String value) {
            addCriterion("act_name not like", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameIn(List<String> values) {
            addCriterion("act_name in", values, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameNotIn(List<String> values) {
            addCriterion("act_name not in", values, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameBetween(String value1, String value2) {
            addCriterion("act_name between", value1, value2, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameNotBetween(String value1, String value2) {
            addCriterion("act_name not between", value1, value2, "actName");
            return (Criteria) this;
        }

        public Criteria andExtendFieldIsNull() {
            addCriterion("extend_field is null");
            return (Criteria) this;
        }

        public Criteria andExtendFieldIsNotNull() {
            addCriterion("extend_field is not null");
            return (Criteria) this;
        }

        public Criteria andExtendFieldEqualTo(String value) {
            addCriterion("extend_field =", value, "extendField");
            return (Criteria) this;
        }

        public Criteria andExtendFieldNotEqualTo(String value) {
            addCriterion("extend_field <>", value, "extendField");
            return (Criteria) this;
        }

        public Criteria andExtendFieldGreaterThan(String value) {
            addCriterion("extend_field >", value, "extendField");
            return (Criteria) this;
        }

        public Criteria andExtendFieldGreaterThanOrEqualTo(String value) {
            addCriterion("extend_field >=", value, "extendField");
            return (Criteria) this;
        }

        public Criteria andExtendFieldLessThan(String value) {
            addCriterion("extend_field <", value, "extendField");
            return (Criteria) this;
        }

        public Criteria andExtendFieldLessThanOrEqualTo(String value) {
            addCriterion("extend_field <=", value, "extendField");
            return (Criteria) this;
        }

        public Criteria andExtendFieldLike(String value) {
            addCriterion("extend_field like", value, "extendField");
            return (Criteria) this;
        }

        public Criteria andExtendFieldNotLike(String value) {
            addCriterion("extend_field not like", value, "extendField");
            return (Criteria) this;
        }

        public Criteria andExtendFieldIn(List<String> values) {
            addCriterion("extend_field in", values, "extendField");
            return (Criteria) this;
        }

        public Criteria andExtendFieldNotIn(List<String> values) {
            addCriterion("extend_field not in", values, "extendField");
            return (Criteria) this;
        }

        public Criteria andExtendFieldBetween(String value1, String value2) {
            addCriterion("extend_field between", value1, value2, "extendField");
            return (Criteria) this;
        }

        public Criteria andExtendFieldNotBetween(String value1, String value2) {
            addCriterion("extend_field not between", value1, value2, "extendField");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeIsNull() {
            addCriterion("return_time is null");
            return (Criteria) this;
        }

        public Criteria andReturnTimeIsNotNull() {
            addCriterion("return_time is not null");
            return (Criteria) this;
        }

        public Criteria andReturnTimeEqualTo(Date value) {
            addCriterion("return_time =", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeNotEqualTo(Date value) {
            addCriterion("return_time <>", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeGreaterThan(Date value) {
            addCriterion("return_time >", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("return_time >=", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeLessThan(Date value) {
            addCriterion("return_time <", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeLessThanOrEqualTo(Date value) {
            addCriterion("return_time <=", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeIn(List<Date> values) {
            addCriterion("return_time in", values, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeNotIn(List<Date> values) {
            addCriterion("return_time not in", values, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeBetween(Date value1, Date value2) {
            addCriterion("return_time between", value1, value2, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeNotBetween(Date value1, Date value2) {
            addCriterion("return_time not between", value1, value2, "returnTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeIsNull() {
            addCriterion("notify_time is null");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeIsNotNull() {
            addCriterion("notify_time is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeEqualTo(Date value) {
            addCriterion("notify_time =", value, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeNotEqualTo(Date value) {
            addCriterion("notify_time <>", value, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeGreaterThan(Date value) {
            addCriterion("notify_time >", value, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("notify_time >=", value, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeLessThan(Date value) {
            addCriterion("notify_time <", value, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("notify_time <=", value, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeIn(List<Date> values) {
            addCriterion("notify_time in", values, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeNotIn(List<Date> values) {
            addCriterion("notify_time not in", values, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeBetween(Date value1, Date value2) {
            addCriterion("notify_time between", value1, value2, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("notify_time not between", value1, value2, "notifyTime");
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
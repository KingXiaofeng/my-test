package com.yhb.bean.entity;

import java.util.ArrayList;
import java.util.List;

public class BaseInterfaceBankExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseInterfaceBankExample() {
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

        public Criteria andInterfaceidIsNull() {
            addCriterion("InterfaceID is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceidIsNotNull() {
            addCriterion("InterfaceID is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceidEqualTo(String value) {
            addCriterion("InterfaceID =", value, "interfaceid");
            return (Criteria) this;
        }

        public Criteria andInterfaceidNotEqualTo(String value) {
            addCriterion("InterfaceID <>", value, "interfaceid");
            return (Criteria) this;
        }

        public Criteria andInterfaceidGreaterThan(String value) {
            addCriterion("InterfaceID >", value, "interfaceid");
            return (Criteria) this;
        }

        public Criteria andInterfaceidGreaterThanOrEqualTo(String value) {
            addCriterion("InterfaceID >=", value, "interfaceid");
            return (Criteria) this;
        }

        public Criteria andInterfaceidLessThan(String value) {
            addCriterion("InterfaceID <", value, "interfaceid");
            return (Criteria) this;
        }

        public Criteria andInterfaceidLessThanOrEqualTo(String value) {
            addCriterion("InterfaceID <=", value, "interfaceid");
            return (Criteria) this;
        }

        public Criteria andInterfaceidLike(String value) {
            addCriterion("InterfaceID like", value, "interfaceid");
            return (Criteria) this;
        }

        public Criteria andInterfaceidNotLike(String value) {
            addCriterion("InterfaceID not like", value, "interfaceid");
            return (Criteria) this;
        }

        public Criteria andInterfaceidIn(List<String> values) {
            addCriterion("InterfaceID in", values, "interfaceid");
            return (Criteria) this;
        }

        public Criteria andInterfaceidNotIn(List<String> values) {
            addCriterion("InterfaceID not in", values, "interfaceid");
            return (Criteria) this;
        }

        public Criteria andInterfaceidBetween(String value1, String value2) {
            addCriterion("InterfaceID between", value1, value2, "interfaceid");
            return (Criteria) this;
        }

        public Criteria andInterfaceidNotBetween(String value1, String value2) {
            addCriterion("InterfaceID not between", value1, value2, "interfaceid");
            return (Criteria) this;
        }

        public Criteria andBanknumIsNull() {
            addCriterion("banknum is null");
            return (Criteria) this;
        }

        public Criteria andBanknumIsNotNull() {
            addCriterion("banknum is not null");
            return (Criteria) this;
        }

        public Criteria andBanknumEqualTo(String value) {
            addCriterion("banknum =", value, "banknum");
            return (Criteria) this;
        }

        public Criteria andBanknumNotEqualTo(String value) {
            addCriterion("banknum <>", value, "banknum");
            return (Criteria) this;
        }

        public Criteria andBanknumGreaterThan(String value) {
            addCriterion("banknum >", value, "banknum");
            return (Criteria) this;
        }

        public Criteria andBanknumGreaterThanOrEqualTo(String value) {
            addCriterion("banknum >=", value, "banknum");
            return (Criteria) this;
        }

        public Criteria andBanknumLessThan(String value) {
            addCriterion("banknum <", value, "banknum");
            return (Criteria) this;
        }

        public Criteria andBanknumLessThanOrEqualTo(String value) {
            addCriterion("banknum <=", value, "banknum");
            return (Criteria) this;
        }

        public Criteria andBanknumLike(String value) {
            addCriterion("banknum like", value, "banknum");
            return (Criteria) this;
        }

        public Criteria andBanknumNotLike(String value) {
            addCriterion("banknum not like", value, "banknum");
            return (Criteria) this;
        }

        public Criteria andBanknumIn(List<String> values) {
            addCriterion("banknum in", values, "banknum");
            return (Criteria) this;
        }

        public Criteria andBanknumNotIn(List<String> values) {
            addCriterion("banknum not in", values, "banknum");
            return (Criteria) this;
        }

        public Criteria andBanknumBetween(String value1, String value2) {
            addCriterion("banknum between", value1, value2, "banknum");
            return (Criteria) this;
        }

        public Criteria andBanknumNotBetween(String value1, String value2) {
            addCriterion("banknum not between", value1, value2, "banknum");
            return (Criteria) this;
        }

        public Criteria andIsopenIsNull() {
            addCriterion("isopen is null");
            return (Criteria) this;
        }

        public Criteria andIsopenIsNotNull() {
            addCriterion("isopen is not null");
            return (Criteria) this;
        }

        public Criteria andIsopenEqualTo(Boolean value) {
            addCriterion("isopen =", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenNotEqualTo(Boolean value) {
            addCriterion("isopen <>", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenGreaterThan(Boolean value) {
            addCriterion("isopen >", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isopen >=", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenLessThan(Boolean value) {
            addCriterion("isopen <", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenLessThanOrEqualTo(Boolean value) {
            addCriterion("isopen <=", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenIn(List<Boolean> values) {
            addCriterion("isopen in", values, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenNotIn(List<Boolean> values) {
            addCriterion("isopen not in", values, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenBetween(Boolean value1, Boolean value2) {
            addCriterion("isopen between", value1, value2, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isopen not between", value1, value2, "isopen");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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

        public Criteria andCardtypeIsNull() {
            addCriterion("CardType is null");
            return (Criteria) this;
        }

        public Criteria andCardtypeIsNotNull() {
            addCriterion("CardType is not null");
            return (Criteria) this;
        }

        public Criteria andCardtypeEqualTo(String value) {
            addCriterion("CardType =", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotEqualTo(String value) {
            addCriterion("CardType <>", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeGreaterThan(String value) {
            addCriterion("CardType >", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeGreaterThanOrEqualTo(String value) {
            addCriterion("CardType >=", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeLessThan(String value) {
            addCriterion("CardType <", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeLessThanOrEqualTo(String value) {
            addCriterion("CardType <=", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeLike(String value) {
            addCriterion("CardType like", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotLike(String value) {
            addCriterion("CardType not like", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeIn(List<String> values) {
            addCriterion("CardType in", values, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotIn(List<String> values) {
            addCriterion("CardType not in", values, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeBetween(String value1, String value2) {
            addCriterion("CardType between", value1, value2, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotBetween(String value1, String value2) {
            addCriterion("CardType not between", value1, value2, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardbankcolorimgIsNull() {
            addCriterion("cardBankColorImg is null");
            return (Criteria) this;
        }

        public Criteria andCardbankcolorimgIsNotNull() {
            addCriterion("cardBankColorImg is not null");
            return (Criteria) this;
        }

        public Criteria andCardbankcolorimgEqualTo(String value) {
            addCriterion("cardBankColorImg =", value, "cardbankcolorimg");
            return (Criteria) this;
        }

        public Criteria andCardbankcolorimgNotEqualTo(String value) {
            addCriterion("cardBankColorImg <>", value, "cardbankcolorimg");
            return (Criteria) this;
        }

        public Criteria andCardbankcolorimgGreaterThan(String value) {
            addCriterion("cardBankColorImg >", value, "cardbankcolorimg");
            return (Criteria) this;
        }

        public Criteria andCardbankcolorimgGreaterThanOrEqualTo(String value) {
            addCriterion("cardBankColorImg >=", value, "cardbankcolorimg");
            return (Criteria) this;
        }

        public Criteria andCardbankcolorimgLessThan(String value) {
            addCriterion("cardBankColorImg <", value, "cardbankcolorimg");
            return (Criteria) this;
        }

        public Criteria andCardbankcolorimgLessThanOrEqualTo(String value) {
            addCriterion("cardBankColorImg <=", value, "cardbankcolorimg");
            return (Criteria) this;
        }

        public Criteria andCardbankcolorimgLike(String value) {
            addCriterion("cardBankColorImg like", value, "cardbankcolorimg");
            return (Criteria) this;
        }

        public Criteria andCardbankcolorimgNotLike(String value) {
            addCriterion("cardBankColorImg not like", value, "cardbankcolorimg");
            return (Criteria) this;
        }

        public Criteria andCardbankcolorimgIn(List<String> values) {
            addCriterion("cardBankColorImg in", values, "cardbankcolorimg");
            return (Criteria) this;
        }

        public Criteria andCardbankcolorimgNotIn(List<String> values) {
            addCriterion("cardBankColorImg not in", values, "cardbankcolorimg");
            return (Criteria) this;
        }

        public Criteria andCardbankcolorimgBetween(String value1, String value2) {
            addCriterion("cardBankColorImg between", value1, value2, "cardbankcolorimg");
            return (Criteria) this;
        }

        public Criteria andCardbankcolorimgNotBetween(String value1, String value2) {
            addCriterion("cardBankColorImg not between", value1, value2, "cardbankcolorimg");
            return (Criteria) this;
        }

        public Criteria andCradbanklogimgIsNull() {
            addCriterion("cradBankLogImg is null");
            return (Criteria) this;
        }

        public Criteria andCradbanklogimgIsNotNull() {
            addCriterion("cradBankLogImg is not null");
            return (Criteria) this;
        }

        public Criteria andCradbanklogimgEqualTo(String value) {
            addCriterion("cradBankLogImg =", value, "cradbanklogimg");
            return (Criteria) this;
        }

        public Criteria andCradbanklogimgNotEqualTo(String value) {
            addCriterion("cradBankLogImg <>", value, "cradbanklogimg");
            return (Criteria) this;
        }

        public Criteria andCradbanklogimgGreaterThan(String value) {
            addCriterion("cradBankLogImg >", value, "cradbanklogimg");
            return (Criteria) this;
        }

        public Criteria andCradbanklogimgGreaterThanOrEqualTo(String value) {
            addCriterion("cradBankLogImg >=", value, "cradbanklogimg");
            return (Criteria) this;
        }

        public Criteria andCradbanklogimgLessThan(String value) {
            addCriterion("cradBankLogImg <", value, "cradbanklogimg");
            return (Criteria) this;
        }

        public Criteria andCradbanklogimgLessThanOrEqualTo(String value) {
            addCriterion("cradBankLogImg <=", value, "cradbanklogimg");
            return (Criteria) this;
        }

        public Criteria andCradbanklogimgLike(String value) {
            addCriterion("cradBankLogImg like", value, "cradbanklogimg");
            return (Criteria) this;
        }

        public Criteria andCradbanklogimgNotLike(String value) {
            addCriterion("cradBankLogImg not like", value, "cradbanklogimg");
            return (Criteria) this;
        }

        public Criteria andCradbanklogimgIn(List<String> values) {
            addCriterion("cradBankLogImg in", values, "cradbanklogimg");
            return (Criteria) this;
        }

        public Criteria andCradbanklogimgNotIn(List<String> values) {
            addCriterion("cradBankLogImg not in", values, "cradbanklogimg");
            return (Criteria) this;
        }

        public Criteria andCradbanklogimgBetween(String value1, String value2) {
            addCriterion("cradBankLogImg between", value1, value2, "cradbanklogimg");
            return (Criteria) this;
        }

        public Criteria andCradbanklogimgNotBetween(String value1, String value2) {
            addCriterion("cradBankLogImg not between", value1, value2, "cradbanklogimg");
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
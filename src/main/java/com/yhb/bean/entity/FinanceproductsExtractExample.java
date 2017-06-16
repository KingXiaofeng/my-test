package com.yhb.bean.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FinanceproductsExtractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinanceproductsExtractExample() {
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

        public Criteria andFpeidIsNull() {
            addCriterion("FPEID is null");
            return (Criteria) this;
        }

        public Criteria andFpeidIsNotNull() {
            addCriterion("FPEID is not null");
            return (Criteria) this;
        }

        public Criteria andFpeidEqualTo(Integer value) {
            addCriterion("FPEID =", value, "fpeid");
            return (Criteria) this;
        }

        public Criteria andFpeidNotEqualTo(Integer value) {
            addCriterion("FPEID <>", value, "fpeid");
            return (Criteria) this;
        }

        public Criteria andFpeidGreaterThan(Integer value) {
            addCriterion("FPEID >", value, "fpeid");
            return (Criteria) this;
        }

        public Criteria andFpeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FPEID >=", value, "fpeid");
            return (Criteria) this;
        }

        public Criteria andFpeidLessThan(Integer value) {
            addCriterion("FPEID <", value, "fpeid");
            return (Criteria) this;
        }

        public Criteria andFpeidLessThanOrEqualTo(Integer value) {
            addCriterion("FPEID <=", value, "fpeid");
            return (Criteria) this;
        }

        public Criteria andFpeidIn(List<Integer> values) {
            addCriterion("FPEID in", values, "fpeid");
            return (Criteria) this;
        }

        public Criteria andFpeidNotIn(List<Integer> values) {
            addCriterion("FPEID not in", values, "fpeid");
            return (Criteria) this;
        }

        public Criteria andFpeidBetween(Integer value1, Integer value2) {
            addCriterion("FPEID between", value1, value2, "fpeid");
            return (Criteria) this;
        }

        public Criteria andFpeidNotBetween(Integer value1, Integer value2) {
            addCriterion("FPEID not between", value1, value2, "fpeid");
            return (Criteria) this;
        }

        public Criteria andExtractmoneyIsNull() {
            addCriterion("ExtractMoney is null");
            return (Criteria) this;
        }

        public Criteria andExtractmoneyIsNotNull() {
            addCriterion("ExtractMoney is not null");
            return (Criteria) this;
        }

        public Criteria andExtractmoneyEqualTo(BigDecimal value) {
            addCriterion("ExtractMoney =", value, "extractmoney");
            return (Criteria) this;
        }

        public Criteria andExtractmoneyNotEqualTo(BigDecimal value) {
            addCriterion("ExtractMoney <>", value, "extractmoney");
            return (Criteria) this;
        }

        public Criteria andExtractmoneyGreaterThan(BigDecimal value) {
            addCriterion("ExtractMoney >", value, "extractmoney");
            return (Criteria) this;
        }

        public Criteria andExtractmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ExtractMoney >=", value, "extractmoney");
            return (Criteria) this;
        }

        public Criteria andExtractmoneyLessThan(BigDecimal value) {
            addCriterion("ExtractMoney <", value, "extractmoney");
            return (Criteria) this;
        }

        public Criteria andExtractmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ExtractMoney <=", value, "extractmoney");
            return (Criteria) this;
        }

        public Criteria andExtractmoneyIn(List<BigDecimal> values) {
            addCriterion("ExtractMoney in", values, "extractmoney");
            return (Criteria) this;
        }

        public Criteria andExtractmoneyNotIn(List<BigDecimal> values) {
            addCriterion("ExtractMoney not in", values, "extractmoney");
            return (Criteria) this;
        }

        public Criteria andExtractmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ExtractMoney between", value1, value2, "extractmoney");
            return (Criteria) this;
        }

        public Criteria andExtractmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ExtractMoney not between", value1, value2, "extractmoney");
            return (Criteria) this;
        }

        public Criteria andExtractxmoneyIsNull() {
            addCriterion("ExtractXMoney is null");
            return (Criteria) this;
        }

        public Criteria andExtractxmoneyIsNotNull() {
            addCriterion("ExtractXMoney is not null");
            return (Criteria) this;
        }

        public Criteria andExtractxmoneyEqualTo(BigDecimal value) {
            addCriterion("ExtractXMoney =", value, "extractxmoney");
            return (Criteria) this;
        }

        public Criteria andExtractxmoneyNotEqualTo(BigDecimal value) {
            addCriterion("ExtractXMoney <>", value, "extractxmoney");
            return (Criteria) this;
        }

        public Criteria andExtractxmoneyGreaterThan(BigDecimal value) {
            addCriterion("ExtractXMoney >", value, "extractxmoney");
            return (Criteria) this;
        }

        public Criteria andExtractxmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ExtractXMoney >=", value, "extractxmoney");
            return (Criteria) this;
        }

        public Criteria andExtractxmoneyLessThan(BigDecimal value) {
            addCriterion("ExtractXMoney <", value, "extractxmoney");
            return (Criteria) this;
        }

        public Criteria andExtractxmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ExtractXMoney <=", value, "extractxmoney");
            return (Criteria) this;
        }

        public Criteria andExtractxmoneyIn(List<BigDecimal> values) {
            addCriterion("ExtractXMoney in", values, "extractxmoney");
            return (Criteria) this;
        }

        public Criteria andExtractxmoneyNotIn(List<BigDecimal> values) {
            addCriterion("ExtractXMoney not in", values, "extractxmoney");
            return (Criteria) this;
        }

        public Criteria andExtractxmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ExtractXMoney between", value1, value2, "extractxmoney");
            return (Criteria) this;
        }

        public Criteria andExtractxmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ExtractXMoney not between", value1, value2, "extractxmoney");
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

        public Criteria andExtractstateIsNull() {
            addCriterion("ExtractState is null");
            return (Criteria) this;
        }

        public Criteria andExtractstateIsNotNull() {
            addCriterion("ExtractState is not null");
            return (Criteria) this;
        }

        public Criteria andExtractstateEqualTo(Integer value) {
            addCriterion("ExtractState =", value, "extractstate");
            return (Criteria) this;
        }

        public Criteria andExtractstateNotEqualTo(Integer value) {
            addCriterion("ExtractState <>", value, "extractstate");
            return (Criteria) this;
        }

        public Criteria andExtractstateGreaterThan(Integer value) {
            addCriterion("ExtractState >", value, "extractstate");
            return (Criteria) this;
        }

        public Criteria andExtractstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ExtractState >=", value, "extractstate");
            return (Criteria) this;
        }

        public Criteria andExtractstateLessThan(Integer value) {
            addCriterion("ExtractState <", value, "extractstate");
            return (Criteria) this;
        }

        public Criteria andExtractstateLessThanOrEqualTo(Integer value) {
            addCriterion("ExtractState <=", value, "extractstate");
            return (Criteria) this;
        }

        public Criteria andExtractstateIn(List<Integer> values) {
            addCriterion("ExtractState in", values, "extractstate");
            return (Criteria) this;
        }

        public Criteria andExtractstateNotIn(List<Integer> values) {
            addCriterion("ExtractState not in", values, "extractstate");
            return (Criteria) this;
        }

        public Criteria andExtractstateBetween(Integer value1, Integer value2) {
            addCriterion("ExtractState between", value1, value2, "extractstate");
            return (Criteria) this;
        }

        public Criteria andExtractstateNotBetween(Integer value1, Integer value2) {
            addCriterion("ExtractState not between", value1, value2, "extractstate");
            return (Criteria) this;
        }

        public Criteria andExtracttimesIsNull() {
            addCriterion("ExtractTimes is null");
            return (Criteria) this;
        }

        public Criteria andExtracttimesIsNotNull() {
            addCriterion("ExtractTimes is not null");
            return (Criteria) this;
        }

        public Criteria andExtracttimesEqualTo(Date value) {
            addCriterion("ExtractTimes =", value, "extracttimes");
            return (Criteria) this;
        }

        public Criteria andExtracttimesNotEqualTo(Date value) {
            addCriterion("ExtractTimes <>", value, "extracttimes");
            return (Criteria) this;
        }

        public Criteria andExtracttimesGreaterThan(Date value) {
            addCriterion("ExtractTimes >", value, "extracttimes");
            return (Criteria) this;
        }

        public Criteria andExtracttimesGreaterThanOrEqualTo(Date value) {
            addCriterion("ExtractTimes >=", value, "extracttimes");
            return (Criteria) this;
        }

        public Criteria andExtracttimesLessThan(Date value) {
            addCriterion("ExtractTimes <", value, "extracttimes");
            return (Criteria) this;
        }

        public Criteria andExtracttimesLessThanOrEqualTo(Date value) {
            addCriterion("ExtractTimes <=", value, "extracttimes");
            return (Criteria) this;
        }

        public Criteria andExtracttimesIn(List<Date> values) {
            addCriterion("ExtractTimes in", values, "extracttimes");
            return (Criteria) this;
        }

        public Criteria andExtracttimesNotIn(List<Date> values) {
            addCriterion("ExtractTimes not in", values, "extracttimes");
            return (Criteria) this;
        }

        public Criteria andExtracttimesBetween(Date value1, Date value2) {
            addCriterion("ExtractTimes between", value1, value2, "extracttimes");
            return (Criteria) this;
        }

        public Criteria andExtracttimesNotBetween(Date value1, Date value2) {
            addCriterion("ExtractTimes not between", value1, value2, "extracttimes");
            return (Criteria) this;
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

        public Criteria andExtractemK1IsNull() {
            addCriterion("ExtractEm_k1 is null");
            return (Criteria) this;
        }

        public Criteria andExtractemK1IsNotNull() {
            addCriterion("ExtractEm_k1 is not null");
            return (Criteria) this;
        }

        public Criteria andExtractemK1EqualTo(String value) {
            addCriterion("ExtractEm_k1 =", value, "extractemK1");
            return (Criteria) this;
        }

        public Criteria andExtractemK1NotEqualTo(String value) {
            addCriterion("ExtractEm_k1 <>", value, "extractemK1");
            return (Criteria) this;
        }

        public Criteria andExtractemK1GreaterThan(String value) {
            addCriterion("ExtractEm_k1 >", value, "extractemK1");
            return (Criteria) this;
        }

        public Criteria andExtractemK1GreaterThanOrEqualTo(String value) {
            addCriterion("ExtractEm_k1 >=", value, "extractemK1");
            return (Criteria) this;
        }

        public Criteria andExtractemK1LessThan(String value) {
            addCriterion("ExtractEm_k1 <", value, "extractemK1");
            return (Criteria) this;
        }

        public Criteria andExtractemK1LessThanOrEqualTo(String value) {
            addCriterion("ExtractEm_k1 <=", value, "extractemK1");
            return (Criteria) this;
        }

        public Criteria andExtractemK1Like(String value) {
            addCriterion("ExtractEm_k1 like", value, "extractemK1");
            return (Criteria) this;
        }

        public Criteria andExtractemK1NotLike(String value) {
            addCriterion("ExtractEm_k1 not like", value, "extractemK1");
            return (Criteria) this;
        }

        public Criteria andExtractemK1In(List<String> values) {
            addCriterion("ExtractEm_k1 in", values, "extractemK1");
            return (Criteria) this;
        }

        public Criteria andExtractemK1NotIn(List<String> values) {
            addCriterion("ExtractEm_k1 not in", values, "extractemK1");
            return (Criteria) this;
        }

        public Criteria andExtractemK1Between(String value1, String value2) {
            addCriterion("ExtractEm_k1 between", value1, value2, "extractemK1");
            return (Criteria) this;
        }

        public Criteria andExtractemK1NotBetween(String value1, String value2) {
            addCriterion("ExtractEm_k1 not between", value1, value2, "extractemK1");
            return (Criteria) this;
        }

        public Criteria andExtractemK2IsNull() {
            addCriterion("ExtractEm_k2 is null");
            return (Criteria) this;
        }

        public Criteria andExtractemK2IsNotNull() {
            addCriterion("ExtractEm_k2 is not null");
            return (Criteria) this;
        }

        public Criteria andExtractemK2EqualTo(String value) {
            addCriterion("ExtractEm_k2 =", value, "extractemK2");
            return (Criteria) this;
        }

        public Criteria andExtractemK2NotEqualTo(String value) {
            addCriterion("ExtractEm_k2 <>", value, "extractemK2");
            return (Criteria) this;
        }

        public Criteria andExtractemK2GreaterThan(String value) {
            addCriterion("ExtractEm_k2 >", value, "extractemK2");
            return (Criteria) this;
        }

        public Criteria andExtractemK2GreaterThanOrEqualTo(String value) {
            addCriterion("ExtractEm_k2 >=", value, "extractemK2");
            return (Criteria) this;
        }

        public Criteria andExtractemK2LessThan(String value) {
            addCriterion("ExtractEm_k2 <", value, "extractemK2");
            return (Criteria) this;
        }

        public Criteria andExtractemK2LessThanOrEqualTo(String value) {
            addCriterion("ExtractEm_k2 <=", value, "extractemK2");
            return (Criteria) this;
        }

        public Criteria andExtractemK2Like(String value) {
            addCriterion("ExtractEm_k2 like", value, "extractemK2");
            return (Criteria) this;
        }

        public Criteria andExtractemK2NotLike(String value) {
            addCriterion("ExtractEm_k2 not like", value, "extractemK2");
            return (Criteria) this;
        }

        public Criteria andExtractemK2In(List<String> values) {
            addCriterion("ExtractEm_k2 in", values, "extractemK2");
            return (Criteria) this;
        }

        public Criteria andExtractemK2NotIn(List<String> values) {
            addCriterion("ExtractEm_k2 not in", values, "extractemK2");
            return (Criteria) this;
        }

        public Criteria andExtractemK2Between(String value1, String value2) {
            addCriterion("ExtractEm_k2 between", value1, value2, "extractemK2");
            return (Criteria) this;
        }

        public Criteria andExtractemK2NotBetween(String value1, String value2) {
            addCriterion("ExtractEm_k2 not between", value1, value2, "extractemK2");
            return (Criteria) this;
        }

        public Criteria andExtractdownnumIsNull() {
            addCriterion("ExtractDownNum is null");
            return (Criteria) this;
        }

        public Criteria andExtractdownnumIsNotNull() {
            addCriterion("ExtractDownNum is not null");
            return (Criteria) this;
        }

        public Criteria andExtractdownnumEqualTo(Integer value) {
            addCriterion("ExtractDownNum =", value, "extractdownnum");
            return (Criteria) this;
        }

        public Criteria andExtractdownnumNotEqualTo(Integer value) {
            addCriterion("ExtractDownNum <>", value, "extractdownnum");
            return (Criteria) this;
        }

        public Criteria andExtractdownnumGreaterThan(Integer value) {
            addCriterion("ExtractDownNum >", value, "extractdownnum");
            return (Criteria) this;
        }

        public Criteria andExtractdownnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ExtractDownNum >=", value, "extractdownnum");
            return (Criteria) this;
        }

        public Criteria andExtractdownnumLessThan(Integer value) {
            addCriterion("ExtractDownNum <", value, "extractdownnum");
            return (Criteria) this;
        }

        public Criteria andExtractdownnumLessThanOrEqualTo(Integer value) {
            addCriterion("ExtractDownNum <=", value, "extractdownnum");
            return (Criteria) this;
        }

        public Criteria andExtractdownnumIn(List<Integer> values) {
            addCriterion("ExtractDownNum in", values, "extractdownnum");
            return (Criteria) this;
        }

        public Criteria andExtractdownnumNotIn(List<Integer> values) {
            addCriterion("ExtractDownNum not in", values, "extractdownnum");
            return (Criteria) this;
        }

        public Criteria andExtractdownnumBetween(Integer value1, Integer value2) {
            addCriterion("ExtractDownNum between", value1, value2, "extractdownnum");
            return (Criteria) this;
        }

        public Criteria andExtractdownnumNotBetween(Integer value1, Integer value2) {
            addCriterion("ExtractDownNum not between", value1, value2, "extractdownnum");
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
package com.yhb.bean.entity;

import java.util.ArrayList;
import java.util.List;

public class BaseConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseConfigExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("value is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("value is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(String value) {
            addCriterion("value =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(String value) {
            addCriterion("value <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(String value) {
            addCriterion("value >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(String value) {
            addCriterion("value >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(String value) {
            addCriterion("value <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(String value) {
            addCriterion("value <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLike(String value) {
            addCriterion("value like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotLike(String value) {
            addCriterion("value not like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<String> values) {
            addCriterion("value in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<String> values) {
            addCriterion("value not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(String value1, String value2) {
            addCriterion("value between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(String value1, String value2) {
            addCriterion("value not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueseIsNull() {
            addCriterion("valuese is null");
            return (Criteria) this;
        }

        public Criteria andValueseIsNotNull() {
            addCriterion("valuese is not null");
            return (Criteria) this;
        }

        public Criteria andValueseEqualTo(String value) {
            addCriterion("valuese =", value, "valuese");
            return (Criteria) this;
        }

        public Criteria andValueseNotEqualTo(String value) {
            addCriterion("valuese <>", value, "valuese");
            return (Criteria) this;
        }

        public Criteria andValueseGreaterThan(String value) {
            addCriterion("valuese >", value, "valuese");
            return (Criteria) this;
        }

        public Criteria andValueseGreaterThanOrEqualTo(String value) {
            addCriterion("valuese >=", value, "valuese");
            return (Criteria) this;
        }

        public Criteria andValueseLessThan(String value) {
            addCriterion("valuese <", value, "valuese");
            return (Criteria) this;
        }

        public Criteria andValueseLessThanOrEqualTo(String value) {
            addCriterion("valuese <=", value, "valuese");
            return (Criteria) this;
        }

        public Criteria andValueseLike(String value) {
            addCriterion("valuese like", value, "valuese");
            return (Criteria) this;
        }

        public Criteria andValueseNotLike(String value) {
            addCriterion("valuese not like", value, "valuese");
            return (Criteria) this;
        }

        public Criteria andValueseIn(List<String> values) {
            addCriterion("valuese in", values, "valuese");
            return (Criteria) this;
        }

        public Criteria andValueseNotIn(List<String> values) {
            addCriterion("valuese not in", values, "valuese");
            return (Criteria) this;
        }

        public Criteria andValueseBetween(String value1, String value2) {
            addCriterion("valuese between", value1, value2, "valuese");
            return (Criteria) this;
        }

        public Criteria andValueseNotBetween(String value1, String value2) {
            addCriterion("valuese not between", value1, value2, "valuese");
            return (Criteria) this;
        }

        public Criteria andDataIsNull() {
            addCriterion("data is null");
            return (Criteria) this;
        }

        public Criteria andDataIsNotNull() {
            addCriterion("data is not null");
            return (Criteria) this;
        }

        public Criteria andDataEqualTo(String value) {
            addCriterion("data =", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotEqualTo(String value) {
            addCriterion("data <>", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataGreaterThan(String value) {
            addCriterion("data >", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataGreaterThanOrEqualTo(String value) {
            addCriterion("data >=", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataLessThan(String value) {
            addCriterion("data <", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataLessThanOrEqualTo(String value) {
            addCriterion("data <=", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataLike(String value) {
            addCriterion("data like", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotLike(String value) {
            addCriterion("data not like", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataIn(List<String> values) {
            addCriterion("data in", values, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotIn(List<String> values) {
            addCriterion("data not in", values, "data");
            return (Criteria) this;
        }

        public Criteria andDataBetween(String value1, String value2) {
            addCriterion("data between", value1, value2, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotBetween(String value1, String value2) {
            addCriterion("data not between", value1, value2, "data");
            return (Criteria) this;
        }

        public Criteria andFromIsNull() {
            addCriterion("from_ is null");
            return (Criteria) this;
        }

        public Criteria andFromIsNotNull() {
            addCriterion("from_ is not null");
            return (Criteria) this;
        }

        public Criteria andFromEqualTo(String value) {
            addCriterion("from_ =", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromNotEqualTo(String value) {
            addCriterion("from_ <>", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromGreaterThan(String value) {
            addCriterion("from_ >", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromGreaterThanOrEqualTo(String value) {
            addCriterion("from_ >=", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromLessThan(String value) {
            addCriterion("from_ <", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromLessThanOrEqualTo(String value) {
            addCriterion("from_ <=", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromLike(String value) {
            addCriterion("from_ like", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromNotLike(String value) {
            addCriterion("from_ not like", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromIn(List<String> values) {
            addCriterion("from_ in", values, "from");
            return (Criteria) this;
        }

        public Criteria andFromNotIn(List<String> values) {
            addCriterion("from_ not in", values, "from");
            return (Criteria) this;
        }

        public Criteria andFromBetween(String value1, String value2) {
            addCriterion("from_ between", value1, value2, "from");
            return (Criteria) this;
        }

        public Criteria andFromNotBetween(String value1, String value2) {
            addCriterion("from_ not between", value1, value2, "from");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andOrdersIsNull() {
            addCriterion("orders is null");
            return (Criteria) this;
        }

        public Criteria andOrdersIsNotNull() {
            addCriterion("orders is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersEqualTo(Integer value) {
            addCriterion("orders =", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotEqualTo(Integer value) {
            addCriterion("orders <>", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersGreaterThan(Integer value) {
            addCriterion("orders >", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersGreaterThanOrEqualTo(Integer value) {
            addCriterion("orders >=", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersLessThan(Integer value) {
            addCriterion("orders <", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersLessThanOrEqualTo(Integer value) {
            addCriterion("orders <=", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersIn(List<Integer> values) {
            addCriterion("orders in", values, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotIn(List<Integer> values) {
            addCriterion("orders not in", values, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersBetween(Integer value1, Integer value2) {
            addCriterion("orders between", value1, value2, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotBetween(Integer value1, Integer value2) {
            addCriterion("orders not between", value1, value2, "orders");
            return (Criteria) this;
        }

        public Criteria andRes1IsNull() {
            addCriterion("res1 is null");
            return (Criteria) this;
        }

        public Criteria andRes1IsNotNull() {
            addCriterion("res1 is not null");
            return (Criteria) this;
        }

        public Criteria andRes1EqualTo(String value) {
            addCriterion("res1 =", value, "res1");
            return (Criteria) this;
        }

        public Criteria andRes1NotEqualTo(String value) {
            addCriterion("res1 <>", value, "res1");
            return (Criteria) this;
        }

        public Criteria andRes1GreaterThan(String value) {
            addCriterion("res1 >", value, "res1");
            return (Criteria) this;
        }

        public Criteria andRes1GreaterThanOrEqualTo(String value) {
            addCriterion("res1 >=", value, "res1");
            return (Criteria) this;
        }

        public Criteria andRes1LessThan(String value) {
            addCriterion("res1 <", value, "res1");
            return (Criteria) this;
        }

        public Criteria andRes1LessThanOrEqualTo(String value) {
            addCriterion("res1 <=", value, "res1");
            return (Criteria) this;
        }

        public Criteria andRes1Like(String value) {
            addCriterion("res1 like", value, "res1");
            return (Criteria) this;
        }

        public Criteria andRes1NotLike(String value) {
            addCriterion("res1 not like", value, "res1");
            return (Criteria) this;
        }

        public Criteria andRes1In(List<String> values) {
            addCriterion("res1 in", values, "res1");
            return (Criteria) this;
        }

        public Criteria andRes1NotIn(List<String> values) {
            addCriterion("res1 not in", values, "res1");
            return (Criteria) this;
        }

        public Criteria andRes1Between(String value1, String value2) {
            addCriterion("res1 between", value1, value2, "res1");
            return (Criteria) this;
        }

        public Criteria andRes1NotBetween(String value1, String value2) {
            addCriterion("res1 not between", value1, value2, "res1");
            return (Criteria) this;
        }

        public Criteria andRes2IsNull() {
            addCriterion("res2 is null");
            return (Criteria) this;
        }

        public Criteria andRes2IsNotNull() {
            addCriterion("res2 is not null");
            return (Criteria) this;
        }

        public Criteria andRes2EqualTo(String value) {
            addCriterion("res2 =", value, "res2");
            return (Criteria) this;
        }

        public Criteria andRes2NotEqualTo(String value) {
            addCriterion("res2 <>", value, "res2");
            return (Criteria) this;
        }

        public Criteria andRes2GreaterThan(String value) {
            addCriterion("res2 >", value, "res2");
            return (Criteria) this;
        }

        public Criteria andRes2GreaterThanOrEqualTo(String value) {
            addCriterion("res2 >=", value, "res2");
            return (Criteria) this;
        }

        public Criteria andRes2LessThan(String value) {
            addCriterion("res2 <", value, "res2");
            return (Criteria) this;
        }

        public Criteria andRes2LessThanOrEqualTo(String value) {
            addCriterion("res2 <=", value, "res2");
            return (Criteria) this;
        }

        public Criteria andRes2Like(String value) {
            addCriterion("res2 like", value, "res2");
            return (Criteria) this;
        }

        public Criteria andRes2NotLike(String value) {
            addCriterion("res2 not like", value, "res2");
            return (Criteria) this;
        }

        public Criteria andRes2In(List<String> values) {
            addCriterion("res2 in", values, "res2");
            return (Criteria) this;
        }

        public Criteria andRes2NotIn(List<String> values) {
            addCriterion("res2 not in", values, "res2");
            return (Criteria) this;
        }

        public Criteria andRes2Between(String value1, String value2) {
            addCriterion("res2 between", value1, value2, "res2");
            return (Criteria) this;
        }

        public Criteria andRes2NotBetween(String value1, String value2) {
            addCriterion("res2 not between", value1, value2, "res2");
            return (Criteria) this;
        }

        public Criteria andRes3IsNull() {
            addCriterion("res3 is null");
            return (Criteria) this;
        }

        public Criteria andRes3IsNotNull() {
            addCriterion("res3 is not null");
            return (Criteria) this;
        }

        public Criteria andRes3EqualTo(String value) {
            addCriterion("res3 =", value, "res3");
            return (Criteria) this;
        }

        public Criteria andRes3NotEqualTo(String value) {
            addCriterion("res3 <>", value, "res3");
            return (Criteria) this;
        }

        public Criteria andRes3GreaterThan(String value) {
            addCriterion("res3 >", value, "res3");
            return (Criteria) this;
        }

        public Criteria andRes3GreaterThanOrEqualTo(String value) {
            addCriterion("res3 >=", value, "res3");
            return (Criteria) this;
        }

        public Criteria andRes3LessThan(String value) {
            addCriterion("res3 <", value, "res3");
            return (Criteria) this;
        }

        public Criteria andRes3LessThanOrEqualTo(String value) {
            addCriterion("res3 <=", value, "res3");
            return (Criteria) this;
        }

        public Criteria andRes3Like(String value) {
            addCriterion("res3 like", value, "res3");
            return (Criteria) this;
        }

        public Criteria andRes3NotLike(String value) {
            addCriterion("res3 not like", value, "res3");
            return (Criteria) this;
        }

        public Criteria andRes3In(List<String> values) {
            addCriterion("res3 in", values, "res3");
            return (Criteria) this;
        }

        public Criteria andRes3NotIn(List<String> values) {
            addCriterion("res3 not in", values, "res3");
            return (Criteria) this;
        }

        public Criteria andRes3Between(String value1, String value2) {
            addCriterion("res3 between", value1, value2, "res3");
            return (Criteria) this;
        }

        public Criteria andRes3NotBetween(String value1, String value2) {
            addCriterion("res3 not between", value1, value2, "res3");
            return (Criteria) this;
        }

        public Criteria andRes4IsNull() {
            addCriterion("res4 is null");
            return (Criteria) this;
        }

        public Criteria andRes4IsNotNull() {
            addCriterion("res4 is not null");
            return (Criteria) this;
        }

        public Criteria andRes4EqualTo(String value) {
            addCriterion("res4 =", value, "res4");
            return (Criteria) this;
        }

        public Criteria andRes4NotEqualTo(String value) {
            addCriterion("res4 <>", value, "res4");
            return (Criteria) this;
        }

        public Criteria andRes4GreaterThan(String value) {
            addCriterion("res4 >", value, "res4");
            return (Criteria) this;
        }

        public Criteria andRes4GreaterThanOrEqualTo(String value) {
            addCriterion("res4 >=", value, "res4");
            return (Criteria) this;
        }

        public Criteria andRes4LessThan(String value) {
            addCriterion("res4 <", value, "res4");
            return (Criteria) this;
        }

        public Criteria andRes4LessThanOrEqualTo(String value) {
            addCriterion("res4 <=", value, "res4");
            return (Criteria) this;
        }

        public Criteria andRes4Like(String value) {
            addCriterion("res4 like", value, "res4");
            return (Criteria) this;
        }

        public Criteria andRes4NotLike(String value) {
            addCriterion("res4 not like", value, "res4");
            return (Criteria) this;
        }

        public Criteria andRes4In(List<String> values) {
            addCriterion("res4 in", values, "res4");
            return (Criteria) this;
        }

        public Criteria andRes4NotIn(List<String> values) {
            addCriterion("res4 not in", values, "res4");
            return (Criteria) this;
        }

        public Criteria andRes4Between(String value1, String value2) {
            addCriterion("res4 between", value1, value2, "res4");
            return (Criteria) this;
        }

        public Criteria andRes4NotBetween(String value1, String value2) {
            addCriterion("res4 not between", value1, value2, "res4");
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
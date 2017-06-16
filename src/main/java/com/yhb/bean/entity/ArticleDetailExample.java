package com.yhb.bean.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleDetailExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andSonTitleIsNull() {
            addCriterion("son_title is null");
            return (Criteria) this;
        }

        public Criteria andSonTitleIsNotNull() {
            addCriterion("son_title is not null");
            return (Criteria) this;
        }

        public Criteria andSonTitleEqualTo(String value) {
            addCriterion("son_title =", value, "sonTitle");
            return (Criteria) this;
        }

        public Criteria andSonTitleNotEqualTo(String value) {
            addCriterion("son_title <>", value, "sonTitle");
            return (Criteria) this;
        }

        public Criteria andSonTitleGreaterThan(String value) {
            addCriterion("son_title >", value, "sonTitle");
            return (Criteria) this;
        }

        public Criteria andSonTitleGreaterThanOrEqualTo(String value) {
            addCriterion("son_title >=", value, "sonTitle");
            return (Criteria) this;
        }

        public Criteria andSonTitleLessThan(String value) {
            addCriterion("son_title <", value, "sonTitle");
            return (Criteria) this;
        }

        public Criteria andSonTitleLessThanOrEqualTo(String value) {
            addCriterion("son_title <=", value, "sonTitle");
            return (Criteria) this;
        }

        public Criteria andSonTitleLike(String value) {
            addCriterion("son_title like", value, "sonTitle");
            return (Criteria) this;
        }

        public Criteria andSonTitleNotLike(String value) {
            addCriterion("son_title not like", value, "sonTitle");
            return (Criteria) this;
        }

        public Criteria andSonTitleIn(List<String> values) {
            addCriterion("son_title in", values, "sonTitle");
            return (Criteria) this;
        }

        public Criteria andSonTitleNotIn(List<String> values) {
            addCriterion("son_title not in", values, "sonTitle");
            return (Criteria) this;
        }

        public Criteria andSonTitleBetween(String value1, String value2) {
            addCriterion("son_title between", value1, value2, "sonTitle");
            return (Criteria) this;
        }

        public Criteria andSonTitleNotBetween(String value1, String value2) {
            addCriterion("son_title not between", value1, value2, "sonTitle");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Integer value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Integer value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Integer value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Integer value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Integer value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Integer> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Integer> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Integer value1, Integer value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andImgNameIsNull() {
            addCriterion("img_name is null");
            return (Criteria) this;
        }

        public Criteria andImgNameIsNotNull() {
            addCriterion("img_name is not null");
            return (Criteria) this;
        }

        public Criteria andImgNameEqualTo(String value) {
            addCriterion("img_name =", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameNotEqualTo(String value) {
            addCriterion("img_name <>", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameGreaterThan(String value) {
            addCriterion("img_name >", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameGreaterThanOrEqualTo(String value) {
            addCriterion("img_name >=", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameLessThan(String value) {
            addCriterion("img_name <", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameLessThanOrEqualTo(String value) {
            addCriterion("img_name <=", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameLike(String value) {
            addCriterion("img_name like", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameNotLike(String value) {
            addCriterion("img_name not like", value, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameIn(List<String> values) {
            addCriterion("img_name in", values, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameNotIn(List<String> values) {
            addCriterion("img_name not in", values, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameBetween(String value1, String value2) {
            addCriterion("img_name between", value1, value2, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgNameNotBetween(String value1, String value2) {
            addCriterion("img_name not between", value1, value2, "imgName");
            return (Criteria) this;
        }

        public Criteria andImgAddressIsNull() {
            addCriterion("img_address is null");
            return (Criteria) this;
        }

        public Criteria andImgAddressIsNotNull() {
            addCriterion("img_address is not null");
            return (Criteria) this;
        }

        public Criteria andImgAddressEqualTo(String value) {
            addCriterion("img_address =", value, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressNotEqualTo(String value) {
            addCriterion("img_address <>", value, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressGreaterThan(String value) {
            addCriterion("img_address >", value, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressGreaterThanOrEqualTo(String value) {
            addCriterion("img_address >=", value, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressLessThan(String value) {
            addCriterion("img_address <", value, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressLessThanOrEqualTo(String value) {
            addCriterion("img_address <=", value, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressLike(String value) {
            addCriterion("img_address like", value, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressNotLike(String value) {
            addCriterion("img_address not like", value, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressIn(List<String> values) {
            addCriterion("img_address in", values, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressNotIn(List<String> values) {
            addCriterion("img_address not in", values, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressBetween(String value1, String value2) {
            addCriterion("img_address between", value1, value2, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressNotBetween(String value1, String value2) {
            addCriterion("img_address not between", value1, value2, "imgAddress");
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

        public Criteria andVideoNameIsNull() {
            addCriterion("video_name is null");
            return (Criteria) this;
        }

        public Criteria andVideoNameIsNotNull() {
            addCriterion("video_name is not null");
            return (Criteria) this;
        }

        public Criteria andVideoNameEqualTo(String value) {
            addCriterion("video_name =", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotEqualTo(String value) {
            addCriterion("video_name <>", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameGreaterThan(String value) {
            addCriterion("video_name >", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameGreaterThanOrEqualTo(String value) {
            addCriterion("video_name >=", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLessThan(String value) {
            addCriterion("video_name <", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLessThanOrEqualTo(String value) {
            addCriterion("video_name <=", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLike(String value) {
            addCriterion("video_name like", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotLike(String value) {
            addCriterion("video_name not like", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameIn(List<String> values) {
            addCriterion("video_name in", values, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotIn(List<String> values) {
            addCriterion("video_name not in", values, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameBetween(String value1, String value2) {
            addCriterion("video_name between", value1, value2, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotBetween(String value1, String value2) {
            addCriterion("video_name not between", value1, value2, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoAddressIsNull() {
            addCriterion("video_address is null");
            return (Criteria) this;
        }

        public Criteria andVideoAddressIsNotNull() {
            addCriterion("video_address is not null");
            return (Criteria) this;
        }

        public Criteria andVideoAddressEqualTo(String value) {
            addCriterion("video_address =", value, "videoAddress");
            return (Criteria) this;
        }

        public Criteria andVideoAddressNotEqualTo(String value) {
            addCriterion("video_address <>", value, "videoAddress");
            return (Criteria) this;
        }

        public Criteria andVideoAddressGreaterThan(String value) {
            addCriterion("video_address >", value, "videoAddress");
            return (Criteria) this;
        }

        public Criteria andVideoAddressGreaterThanOrEqualTo(String value) {
            addCriterion("video_address >=", value, "videoAddress");
            return (Criteria) this;
        }

        public Criteria andVideoAddressLessThan(String value) {
            addCriterion("video_address <", value, "videoAddress");
            return (Criteria) this;
        }

        public Criteria andVideoAddressLessThanOrEqualTo(String value) {
            addCriterion("video_address <=", value, "videoAddress");
            return (Criteria) this;
        }

        public Criteria andVideoAddressLike(String value) {
            addCriterion("video_address like", value, "videoAddress");
            return (Criteria) this;
        }

        public Criteria andVideoAddressNotLike(String value) {
            addCriterion("video_address not like", value, "videoAddress");
            return (Criteria) this;
        }

        public Criteria andVideoAddressIn(List<String> values) {
            addCriterion("video_address in", values, "videoAddress");
            return (Criteria) this;
        }

        public Criteria andVideoAddressNotIn(List<String> values) {
            addCriterion("video_address not in", values, "videoAddress");
            return (Criteria) this;
        }

        public Criteria andVideoAddressBetween(String value1, String value2) {
            addCriterion("video_address between", value1, value2, "videoAddress");
            return (Criteria) this;
        }

        public Criteria andVideoAddressNotBetween(String value1, String value2) {
            addCriterion("video_address not between", value1, value2, "videoAddress");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andBrowseCountIsNull() {
            addCriterion("browse_count is null");
            return (Criteria) this;
        }

        public Criteria andBrowseCountIsNotNull() {
            addCriterion("browse_count is not null");
            return (Criteria) this;
        }

        public Criteria andBrowseCountEqualTo(Long value) {
            addCriterion("browse_count =", value, "browseCount");
            return (Criteria) this;
        }

        public Criteria andBrowseCountNotEqualTo(Long value) {
            addCriterion("browse_count <>", value, "browseCount");
            return (Criteria) this;
        }

        public Criteria andBrowseCountGreaterThan(Long value) {
            addCriterion("browse_count >", value, "browseCount");
            return (Criteria) this;
        }

        public Criteria andBrowseCountGreaterThanOrEqualTo(Long value) {
            addCriterion("browse_count >=", value, "browseCount");
            return (Criteria) this;
        }

        public Criteria andBrowseCountLessThan(Long value) {
            addCriterion("browse_count <", value, "browseCount");
            return (Criteria) this;
        }

        public Criteria andBrowseCountLessThanOrEqualTo(Long value) {
            addCriterion("browse_count <=", value, "browseCount");
            return (Criteria) this;
        }

        public Criteria andBrowseCountIn(List<Long> values) {
            addCriterion("browse_count in", values, "browseCount");
            return (Criteria) this;
        }

        public Criteria andBrowseCountNotIn(List<Long> values) {
            addCriterion("browse_count not in", values, "browseCount");
            return (Criteria) this;
        }

        public Criteria andBrowseCountBetween(Long value1, Long value2) {
            addCriterion("browse_count between", value1, value2, "browseCount");
            return (Criteria) this;
        }

        public Criteria andBrowseCountNotBetween(Long value1, Long value2) {
            addCriterion("browse_count not between", value1, value2, "browseCount");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andEmp1IsNull() {
            addCriterion("emp_1 is null");
            return (Criteria) this;
        }

        public Criteria andEmp1IsNotNull() {
            addCriterion("emp_1 is not null");
            return (Criteria) this;
        }

        public Criteria andEmp1EqualTo(Integer value) {
            addCriterion("emp_1 =", value, "emp1");
            return (Criteria) this;
        }

        public Criteria andEmp1NotEqualTo(Integer value) {
            addCriterion("emp_1 <>", value, "emp1");
            return (Criteria) this;
        }

        public Criteria andEmp1GreaterThan(Integer value) {
            addCriterion("emp_1 >", value, "emp1");
            return (Criteria) this;
        }

        public Criteria andEmp1GreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_1 >=", value, "emp1");
            return (Criteria) this;
        }

        public Criteria andEmp1LessThan(Integer value) {
            addCriterion("emp_1 <", value, "emp1");
            return (Criteria) this;
        }

        public Criteria andEmp1LessThanOrEqualTo(Integer value) {
            addCriterion("emp_1 <=", value, "emp1");
            return (Criteria) this;
        }

        public Criteria andEmp1In(List<Integer> values) {
            addCriterion("emp_1 in", values, "emp1");
            return (Criteria) this;
        }

        public Criteria andEmp1NotIn(List<Integer> values) {
            addCriterion("emp_1 not in", values, "emp1");
            return (Criteria) this;
        }

        public Criteria andEmp1Between(Integer value1, Integer value2) {
            addCriterion("emp_1 between", value1, value2, "emp1");
            return (Criteria) this;
        }

        public Criteria andEmp1NotBetween(Integer value1, Integer value2) {
            addCriterion("emp_1 not between", value1, value2, "emp1");
            return (Criteria) this;
        }

        public Criteria andEmp2IsNull() {
            addCriterion("emp_2 is null");
            return (Criteria) this;
        }

        public Criteria andEmp2IsNotNull() {
            addCriterion("emp_2 is not null");
            return (Criteria) this;
        }

        public Criteria andEmp2EqualTo(String value) {
            addCriterion("emp_2 =", value, "emp2");
            return (Criteria) this;
        }

        public Criteria andEmp2NotEqualTo(String value) {
            addCriterion("emp_2 <>", value, "emp2");
            return (Criteria) this;
        }

        public Criteria andEmp2GreaterThan(String value) {
            addCriterion("emp_2 >", value, "emp2");
            return (Criteria) this;
        }

        public Criteria andEmp2GreaterThanOrEqualTo(String value) {
            addCriterion("emp_2 >=", value, "emp2");
            return (Criteria) this;
        }

        public Criteria andEmp2LessThan(String value) {
            addCriterion("emp_2 <", value, "emp2");
            return (Criteria) this;
        }

        public Criteria andEmp2LessThanOrEqualTo(String value) {
            addCriterion("emp_2 <=", value, "emp2");
            return (Criteria) this;
        }

        public Criteria andEmp2Like(String value) {
            addCriterion("emp_2 like", value, "emp2");
            return (Criteria) this;
        }

        public Criteria andEmp2NotLike(String value) {
            addCriterion("emp_2 not like", value, "emp2");
            return (Criteria) this;
        }

        public Criteria andEmp2In(List<String> values) {
            addCriterion("emp_2 in", values, "emp2");
            return (Criteria) this;
        }

        public Criteria andEmp2NotIn(List<String> values) {
            addCriterion("emp_2 not in", values, "emp2");
            return (Criteria) this;
        }

        public Criteria andEmp2Between(String value1, String value2) {
            addCriterion("emp_2 between", value1, value2, "emp2");
            return (Criteria) this;
        }

        public Criteria andEmp2NotBetween(String value1, String value2) {
            addCriterion("emp_2 not between", value1, value2, "emp2");
            return (Criteria) this;
        }

        public Criteria andEmp3IsNull() {
            addCriterion("emp_3 is null");
            return (Criteria) this;
        }

        public Criteria andEmp3IsNotNull() {
            addCriterion("emp_3 is not null");
            return (Criteria) this;
        }

        public Criteria andEmp3EqualTo(String value) {
            addCriterion("emp_3 =", value, "emp3");
            return (Criteria) this;
        }

        public Criteria andEmp3NotEqualTo(String value) {
            addCriterion("emp_3 <>", value, "emp3");
            return (Criteria) this;
        }

        public Criteria andEmp3GreaterThan(String value) {
            addCriterion("emp_3 >", value, "emp3");
            return (Criteria) this;
        }

        public Criteria andEmp3GreaterThanOrEqualTo(String value) {
            addCriterion("emp_3 >=", value, "emp3");
            return (Criteria) this;
        }

        public Criteria andEmp3LessThan(String value) {
            addCriterion("emp_3 <", value, "emp3");
            return (Criteria) this;
        }

        public Criteria andEmp3LessThanOrEqualTo(String value) {
            addCriterion("emp_3 <=", value, "emp3");
            return (Criteria) this;
        }

        public Criteria andEmp3Like(String value) {
            addCriterion("emp_3 like", value, "emp3");
            return (Criteria) this;
        }

        public Criteria andEmp3NotLike(String value) {
            addCriterion("emp_3 not like", value, "emp3");
            return (Criteria) this;
        }

        public Criteria andEmp3In(List<String> values) {
            addCriterion("emp_3 in", values, "emp3");
            return (Criteria) this;
        }

        public Criteria andEmp3NotIn(List<String> values) {
            addCriterion("emp_3 not in", values, "emp3");
            return (Criteria) this;
        }

        public Criteria andEmp3Between(String value1, String value2) {
            addCriterion("emp_3 between", value1, value2, "emp3");
            return (Criteria) this;
        }

        public Criteria andEmp3NotBetween(String value1, String value2) {
            addCriterion("emp_3 not between", value1, value2, "emp3");
            return (Criteria) this;
        }

        public Criteria andEmp4IsNull() {
            addCriterion("emp_4 is null");
            return (Criteria) this;
        }

        public Criteria andEmp4IsNotNull() {
            addCriterion("emp_4 is not null");
            return (Criteria) this;
        }

        public Criteria andEmp4EqualTo(String value) {
            addCriterion("emp_4 =", value, "emp4");
            return (Criteria) this;
        }

        public Criteria andEmp4NotEqualTo(String value) {
            addCriterion("emp_4 <>", value, "emp4");
            return (Criteria) this;
        }

        public Criteria andEmp4GreaterThan(String value) {
            addCriterion("emp_4 >", value, "emp4");
            return (Criteria) this;
        }

        public Criteria andEmp4GreaterThanOrEqualTo(String value) {
            addCriterion("emp_4 >=", value, "emp4");
            return (Criteria) this;
        }

        public Criteria andEmp4LessThan(String value) {
            addCriterion("emp_4 <", value, "emp4");
            return (Criteria) this;
        }

        public Criteria andEmp4LessThanOrEqualTo(String value) {
            addCriterion("emp_4 <=", value, "emp4");
            return (Criteria) this;
        }

        public Criteria andEmp4Like(String value) {
            addCriterion("emp_4 like", value, "emp4");
            return (Criteria) this;
        }

        public Criteria andEmp4NotLike(String value) {
            addCriterion("emp_4 not like", value, "emp4");
            return (Criteria) this;
        }

        public Criteria andEmp4In(List<String> values) {
            addCriterion("emp_4 in", values, "emp4");
            return (Criteria) this;
        }

        public Criteria andEmp4NotIn(List<String> values) {
            addCriterion("emp_4 not in", values, "emp4");
            return (Criteria) this;
        }

        public Criteria andEmp4Between(String value1, String value2) {
            addCriterion("emp_4 between", value1, value2, "emp4");
            return (Criteria) this;
        }

        public Criteria andEmp4NotBetween(String value1, String value2) {
            addCriterion("emp_4 not between", value1, value2, "emp4");
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
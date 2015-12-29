package com.kongwu.insweb.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerAssetsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerAssetsExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRuidIsNull() {
            addCriterion("ruid is null");
            return (Criteria) this;
        }

        public Criteria andRuidIsNotNull() {
            addCriterion("ruid is not null");
            return (Criteria) this;
        }

        public Criteria andRuidEqualTo(Long value) {
            addCriterion("ruid =", value, "ruid");
            return (Criteria) this;
        }

        public Criteria andRuidNotEqualTo(Long value) {
            addCriterion("ruid <>", value, "ruid");
            return (Criteria) this;
        }

        public Criteria andRuidGreaterThan(Long value) {
            addCriterion("ruid >", value, "ruid");
            return (Criteria) this;
        }

        public Criteria andRuidGreaterThanOrEqualTo(Long value) {
            addCriterion("ruid >=", value, "ruid");
            return (Criteria) this;
        }

        public Criteria andRuidLessThan(Long value) {
            addCriterion("ruid <", value, "ruid");
            return (Criteria) this;
        }

        public Criteria andRuidLessThanOrEqualTo(Long value) {
            addCriterion("ruid <=", value, "ruid");
            return (Criteria) this;
        }

        public Criteria andRuidIn(List<Long> values) {
            addCriterion("ruid in", values, "ruid");
            return (Criteria) this;
        }

        public Criteria andRuidNotIn(List<Long> values) {
            addCriterion("ruid not in", values, "ruid");
            return (Criteria) this;
        }

        public Criteria andRuidBetween(Long value1, Long value2) {
            addCriterion("ruid between", value1, value2, "ruid");
            return (Criteria) this;
        }

        public Criteria andRuidNotBetween(Long value1, Long value2) {
            addCriterion("ruid not between", value1, value2, "ruid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Long value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Long value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Long value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Long value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Long value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Long value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Long> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Long> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Long value1, Long value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Long value1, Long value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andInstrumentIdIsNull() {
            addCriterion("instrument_id is null");
            return (Criteria) this;
        }

        public Criteria andInstrumentIdIsNotNull() {
            addCriterion("instrument_id is not null");
            return (Criteria) this;
        }

        public Criteria andInstrumentIdEqualTo(Long value) {
            addCriterion("instrument_id =", value, "instrumentId");
            return (Criteria) this;
        }

        public Criteria andInstrumentIdNotEqualTo(Long value) {
            addCriterion("instrument_id <>", value, "instrumentId");
            return (Criteria) this;
        }

        public Criteria andInstrumentIdGreaterThan(Long value) {
            addCriterion("instrument_id >", value, "instrumentId");
            return (Criteria) this;
        }

        public Criteria andInstrumentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("instrument_id >=", value, "instrumentId");
            return (Criteria) this;
        }

        public Criteria andInstrumentIdLessThan(Long value) {
            addCriterion("instrument_id <", value, "instrumentId");
            return (Criteria) this;
        }

        public Criteria andInstrumentIdLessThanOrEqualTo(Long value) {
            addCriterion("instrument_id <=", value, "instrumentId");
            return (Criteria) this;
        }

        public Criteria andInstrumentIdIn(List<Long> values) {
            addCriterion("instrument_id in", values, "instrumentId");
            return (Criteria) this;
        }

        public Criteria andInstrumentIdNotIn(List<Long> values) {
            addCriterion("instrument_id not in", values, "instrumentId");
            return (Criteria) this;
        }

        public Criteria andInstrumentIdBetween(Long value1, Long value2) {
            addCriterion("instrument_id between", value1, value2, "instrumentId");
            return (Criteria) this;
        }

        public Criteria andInstrumentIdNotBetween(Long value1, Long value2) {
            addCriterion("instrument_id not between", value1, value2, "instrumentId");
            return (Criteria) this;
        }

        public Criteria andInstrumentAssetCodeIsNull() {
            addCriterion("instrument_asset_code is null");
            return (Criteria) this;
        }

        public Criteria andInstrumentAssetCodeIsNotNull() {
            addCriterion("instrument_asset_code is not null");
            return (Criteria) this;
        }

        public Criteria andInstrumentAssetCodeEqualTo(String value) {
            addCriterion("instrument_asset_code =", value, "instrumentAssetCode");
            return (Criteria) this;
        }

        public Criteria andInstrumentAssetCodeNotEqualTo(String value) {
            addCriterion("instrument_asset_code <>", value, "instrumentAssetCode");
            return (Criteria) this;
        }

        public Criteria andInstrumentAssetCodeGreaterThan(String value) {
            addCriterion("instrument_asset_code >", value, "instrumentAssetCode");
            return (Criteria) this;
        }

        public Criteria andInstrumentAssetCodeGreaterThanOrEqualTo(String value) {
            addCriterion("instrument_asset_code >=", value, "instrumentAssetCode");
            return (Criteria) this;
        }

        public Criteria andInstrumentAssetCodeLessThan(String value) {
            addCriterion("instrument_asset_code <", value, "instrumentAssetCode");
            return (Criteria) this;
        }

        public Criteria andInstrumentAssetCodeLessThanOrEqualTo(String value) {
            addCriterion("instrument_asset_code <=", value, "instrumentAssetCode");
            return (Criteria) this;
        }

        public Criteria andInstrumentAssetCodeLike(String value) {
            addCriterion("instrument_asset_code like", value, "instrumentAssetCode");
            return (Criteria) this;
        }

        public Criteria andInstrumentAssetCodeNotLike(String value) {
            addCriterion("instrument_asset_code not like", value, "instrumentAssetCode");
            return (Criteria) this;
        }

        public Criteria andInstrumentAssetCodeIn(List<String> values) {
            addCriterion("instrument_asset_code in", values, "instrumentAssetCode");
            return (Criteria) this;
        }

        public Criteria andInstrumentAssetCodeNotIn(List<String> values) {
            addCriterion("instrument_asset_code not in", values, "instrumentAssetCode");
            return (Criteria) this;
        }

        public Criteria andInstrumentAssetCodeBetween(String value1, String value2) {
            addCriterion("instrument_asset_code between", value1, value2, "instrumentAssetCode");
            return (Criteria) this;
        }

        public Criteria andInstrumentAssetCodeNotBetween(String value1, String value2) {
            addCriterion("instrument_asset_code not between", value1, value2, "instrumentAssetCode");
            return (Criteria) this;
        }

        public Criteria andStartUseDateIsNull() {
            addCriterion("start_use_date is null");
            return (Criteria) this;
        }

        public Criteria andStartUseDateIsNotNull() {
            addCriterion("start_use_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartUseDateEqualTo(Date value) {
            addCriterion("start_use_date =", value, "startUseDate");
            return (Criteria) this;
        }

        public Criteria andStartUseDateNotEqualTo(Date value) {
            addCriterion("start_use_date <>", value, "startUseDate");
            return (Criteria) this;
        }

        public Criteria andStartUseDateGreaterThan(Date value) {
            addCriterion("start_use_date >", value, "startUseDate");
            return (Criteria) this;
        }

        public Criteria andStartUseDateGreaterThanOrEqualTo(Date value) {
            addCriterion("start_use_date >=", value, "startUseDate");
            return (Criteria) this;
        }

        public Criteria andStartUseDateLessThan(Date value) {
            addCriterion("start_use_date <", value, "startUseDate");
            return (Criteria) this;
        }

        public Criteria andStartUseDateLessThanOrEqualTo(Date value) {
            addCriterion("start_use_date <=", value, "startUseDate");
            return (Criteria) this;
        }

        public Criteria andStartUseDateIn(List<Date> values) {
            addCriterion("start_use_date in", values, "startUseDate");
            return (Criteria) this;
        }

        public Criteria andStartUseDateNotIn(List<Date> values) {
            addCriterion("start_use_date not in", values, "startUseDate");
            return (Criteria) this;
        }

        public Criteria andStartUseDateBetween(Date value1, Date value2) {
            addCriterion("start_use_date between", value1, value2, "startUseDate");
            return (Criteria) this;
        }

        public Criteria andStartUseDateNotBetween(Date value1, Date value2) {
            addCriterion("start_use_date not between", value1, value2, "startUseDate");
            return (Criteria) this;
        }

        public Criteria andDescrptionIsNull() {
            addCriterion("descrption is null");
            return (Criteria) this;
        }

        public Criteria andDescrptionIsNotNull() {
            addCriterion("descrption is not null");
            return (Criteria) this;
        }

        public Criteria andDescrptionEqualTo(String value) {
            addCriterion("descrption =", value, "descrption");
            return (Criteria) this;
        }

        public Criteria andDescrptionNotEqualTo(String value) {
            addCriterion("descrption <>", value, "descrption");
            return (Criteria) this;
        }

        public Criteria andDescrptionGreaterThan(String value) {
            addCriterion("descrption >", value, "descrption");
            return (Criteria) this;
        }

        public Criteria andDescrptionGreaterThanOrEqualTo(String value) {
            addCriterion("descrption >=", value, "descrption");
            return (Criteria) this;
        }

        public Criteria andDescrptionLessThan(String value) {
            addCriterion("descrption <", value, "descrption");
            return (Criteria) this;
        }

        public Criteria andDescrptionLessThanOrEqualTo(String value) {
            addCriterion("descrption <=", value, "descrption");
            return (Criteria) this;
        }

        public Criteria andDescrptionLike(String value) {
            addCriterion("descrption like", value, "descrption");
            return (Criteria) this;
        }

        public Criteria andDescrptionNotLike(String value) {
            addCriterion("descrption not like", value, "descrption");
            return (Criteria) this;
        }

        public Criteria andDescrptionIn(List<String> values) {
            addCriterion("descrption in", values, "descrption");
            return (Criteria) this;
        }

        public Criteria andDescrptionNotIn(List<String> values) {
            addCriterion("descrption not in", values, "descrption");
            return (Criteria) this;
        }

        public Criteria andDescrptionBetween(String value1, String value2) {
            addCriterion("descrption between", value1, value2, "descrption");
            return (Criteria) this;
        }

        public Criteria andDescrptionNotBetween(String value1, String value2) {
            addCriterion("descrption not between", value1, value2, "descrption");
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
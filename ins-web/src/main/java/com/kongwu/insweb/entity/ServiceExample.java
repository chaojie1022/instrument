package com.kongwu.insweb.entity;

import java.util.ArrayList;
import java.util.List;

public class ServiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServiceExample() {
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

        public Criteria andInstrumentIsNull() {
            addCriterion("instrument is null");
            return (Criteria) this;
        }

        public Criteria andInstrumentIsNotNull() {
            addCriterion("instrument is not null");
            return (Criteria) this;
        }

        public Criteria andInstrumentEqualTo(Long value) {
            addCriterion("instrument =", value, "instrument");
            return (Criteria) this;
        }

        public Criteria andInstrumentNotEqualTo(Long value) {
            addCriterion("instrument <>", value, "instrument");
            return (Criteria) this;
        }

        public Criteria andInstrumentGreaterThan(Long value) {
            addCriterion("instrument >", value, "instrument");
            return (Criteria) this;
        }

        public Criteria andInstrumentGreaterThanOrEqualTo(Long value) {
            addCriterion("instrument >=", value, "instrument");
            return (Criteria) this;
        }

        public Criteria andInstrumentLessThan(Long value) {
            addCriterion("instrument <", value, "instrument");
            return (Criteria) this;
        }

        public Criteria andInstrumentLessThanOrEqualTo(Long value) {
            addCriterion("instrument <=", value, "instrument");
            return (Criteria) this;
        }

        public Criteria andInstrumentIn(List<Long> values) {
            addCriterion("instrument in", values, "instrument");
            return (Criteria) this;
        }

        public Criteria andInstrumentNotIn(List<Long> values) {
            addCriterion("instrument not in", values, "instrument");
            return (Criteria) this;
        }

        public Criteria andInstrumentBetween(Long value1, Long value2) {
            addCriterion("instrument between", value1, value2, "instrument");
            return (Criteria) this;
        }

        public Criteria andInstrumentNotBetween(Long value1, Long value2) {
            addCriterion("instrument not between", value1, value2, "instrument");
            return (Criteria) this;
        }

        public Criteria andRepairPriceIsNull() {
            addCriterion("repair_price is null");
            return (Criteria) this;
        }

        public Criteria andRepairPriceIsNotNull() {
            addCriterion("repair_price is not null");
            return (Criteria) this;
        }

        public Criteria andRepairPriceEqualTo(Integer value) {
            addCriterion("repair_price =", value, "repairPrice");
            return (Criteria) this;
        }

        public Criteria andRepairPriceNotEqualTo(Integer value) {
            addCriterion("repair_price <>", value, "repairPrice");
            return (Criteria) this;
        }

        public Criteria andRepairPriceGreaterThan(Integer value) {
            addCriterion("repair_price >", value, "repairPrice");
            return (Criteria) this;
        }

        public Criteria andRepairPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("repair_price >=", value, "repairPrice");
            return (Criteria) this;
        }

        public Criteria andRepairPriceLessThan(Integer value) {
            addCriterion("repair_price <", value, "repairPrice");
            return (Criteria) this;
        }

        public Criteria andRepairPriceLessThanOrEqualTo(Integer value) {
            addCriterion("repair_price <=", value, "repairPrice");
            return (Criteria) this;
        }

        public Criteria andRepairPriceIn(List<Integer> values) {
            addCriterion("repair_price in", values, "repairPrice");
            return (Criteria) this;
        }

        public Criteria andRepairPriceNotIn(List<Integer> values) {
            addCriterion("repair_price not in", values, "repairPrice");
            return (Criteria) this;
        }

        public Criteria andRepairPriceBetween(Integer value1, Integer value2) {
            addCriterion("repair_price between", value1, value2, "repairPrice");
            return (Criteria) this;
        }

        public Criteria andRepairPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("repair_price not between", value1, value2, "repairPrice");
            return (Criteria) this;
        }

        public Criteria andUpkeepPriceIsNull() {
            addCriterion("upkeep_price is null");
            return (Criteria) this;
        }

        public Criteria andUpkeepPriceIsNotNull() {
            addCriterion("upkeep_price is not null");
            return (Criteria) this;
        }

        public Criteria andUpkeepPriceEqualTo(Integer value) {
            addCriterion("upkeep_price =", value, "upkeepPrice");
            return (Criteria) this;
        }

        public Criteria andUpkeepPriceNotEqualTo(Integer value) {
            addCriterion("upkeep_price <>", value, "upkeepPrice");
            return (Criteria) this;
        }

        public Criteria andUpkeepPriceGreaterThan(Integer value) {
            addCriterion("upkeep_price >", value, "upkeepPrice");
            return (Criteria) this;
        }

        public Criteria andUpkeepPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("upkeep_price >=", value, "upkeepPrice");
            return (Criteria) this;
        }

        public Criteria andUpkeepPriceLessThan(Integer value) {
            addCriterion("upkeep_price <", value, "upkeepPrice");
            return (Criteria) this;
        }

        public Criteria andUpkeepPriceLessThanOrEqualTo(Integer value) {
            addCriterion("upkeep_price <=", value, "upkeepPrice");
            return (Criteria) this;
        }

        public Criteria andUpkeepPriceIn(List<Integer> values) {
            addCriterion("upkeep_price in", values, "upkeepPrice");
            return (Criteria) this;
        }

        public Criteria andUpkeepPriceNotIn(List<Integer> values) {
            addCriterion("upkeep_price not in", values, "upkeepPrice");
            return (Criteria) this;
        }

        public Criteria andUpkeepPriceBetween(Integer value1, Integer value2) {
            addCriterion("upkeep_price between", value1, value2, "upkeepPrice");
            return (Criteria) this;
        }

        public Criteria andUpkeepPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("upkeep_price not between", value1, value2, "upkeepPrice");
            return (Criteria) this;
        }

        public Criteria andMaintainingPriceIsNull() {
            addCriterion("maintaining_price is null");
            return (Criteria) this;
        }

        public Criteria andMaintainingPriceIsNotNull() {
            addCriterion("maintaining_price is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainingPriceEqualTo(Integer value) {
            addCriterion("maintaining_price =", value, "maintainingPrice");
            return (Criteria) this;
        }

        public Criteria andMaintainingPriceNotEqualTo(Integer value) {
            addCriterion("maintaining_price <>", value, "maintainingPrice");
            return (Criteria) this;
        }

        public Criteria andMaintainingPriceGreaterThan(Integer value) {
            addCriterion("maintaining_price >", value, "maintainingPrice");
            return (Criteria) this;
        }

        public Criteria andMaintainingPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("maintaining_price >=", value, "maintainingPrice");
            return (Criteria) this;
        }

        public Criteria andMaintainingPriceLessThan(Integer value) {
            addCriterion("maintaining_price <", value, "maintainingPrice");
            return (Criteria) this;
        }

        public Criteria andMaintainingPriceLessThanOrEqualTo(Integer value) {
            addCriterion("maintaining_price <=", value, "maintainingPrice");
            return (Criteria) this;
        }

        public Criteria andMaintainingPriceIn(List<Integer> values) {
            addCriterion("maintaining_price in", values, "maintainingPrice");
            return (Criteria) this;
        }

        public Criteria andMaintainingPriceNotIn(List<Integer> values) {
            addCriterion("maintaining_price not in", values, "maintainingPrice");
            return (Criteria) this;
        }

        public Criteria andMaintainingPriceBetween(Integer value1, Integer value2) {
            addCriterion("maintaining_price between", value1, value2, "maintainingPrice");
            return (Criteria) this;
        }

        public Criteria andMaintainingPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("maintaining_price not between", value1, value2, "maintainingPrice");
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
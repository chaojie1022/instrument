package com.kongwu.insweb.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Long value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Long value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Long value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Long value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Long value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Long> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Long> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Long value1, Long value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Long value1, Long value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andServerTypeIsNull() {
            addCriterion("server_type is null");
            return (Criteria) this;
        }

        public Criteria andServerTypeIsNotNull() {
            addCriterion("server_type is not null");
            return (Criteria) this;
        }

        public Criteria andServerTypeEqualTo(String value) {
            addCriterion("server_type =", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeNotEqualTo(String value) {
            addCriterion("server_type <>", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeGreaterThan(String value) {
            addCriterion("server_type >", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("server_type >=", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeLessThan(String value) {
            addCriterion("server_type <", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeLessThanOrEqualTo(String value) {
            addCriterion("server_type <=", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeLike(String value) {
            addCriterion("server_type like", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeNotLike(String value) {
            addCriterion("server_type not like", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeIn(List<String> values) {
            addCriterion("server_type in", values, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeNotIn(List<String> values) {
            addCriterion("server_type not in", values, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeBetween(String value1, String value2) {
            addCriterion("server_type between", value1, value2, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeNotBetween(String value1, String value2) {
            addCriterion("server_type not between", value1, value2, "serverType");
            return (Criteria) this;
        }

        public Criteria andIsRelateAssetsIsNull() {
            addCriterion("is_relate_assets is null");
            return (Criteria) this;
        }

        public Criteria andIsRelateAssetsIsNotNull() {
            addCriterion("is_relate_assets is not null");
            return (Criteria) this;
        }

        public Criteria andIsRelateAssetsEqualTo(Integer value) {
            addCriterion("is_relate_assets =", value, "isRelateAssets");
            return (Criteria) this;
        }

        public Criteria andIsRelateAssetsNotEqualTo(Integer value) {
            addCriterion("is_relate_assets <>", value, "isRelateAssets");
            return (Criteria) this;
        }

        public Criteria andIsRelateAssetsGreaterThan(Integer value) {
            addCriterion("is_relate_assets >", value, "isRelateAssets");
            return (Criteria) this;
        }

        public Criteria andIsRelateAssetsGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_relate_assets >=", value, "isRelateAssets");
            return (Criteria) this;
        }

        public Criteria andIsRelateAssetsLessThan(Integer value) {
            addCriterion("is_relate_assets <", value, "isRelateAssets");
            return (Criteria) this;
        }

        public Criteria andIsRelateAssetsLessThanOrEqualTo(Integer value) {
            addCriterion("is_relate_assets <=", value, "isRelateAssets");
            return (Criteria) this;
        }

        public Criteria andIsRelateAssetsIn(List<Integer> values) {
            addCriterion("is_relate_assets in", values, "isRelateAssets");
            return (Criteria) this;
        }

        public Criteria andIsRelateAssetsNotIn(List<Integer> values) {
            addCriterion("is_relate_assets not in", values, "isRelateAssets");
            return (Criteria) this;
        }

        public Criteria andIsRelateAssetsBetween(Integer value1, Integer value2) {
            addCriterion("is_relate_assets between", value1, value2, "isRelateAssets");
            return (Criteria) this;
        }

        public Criteria andIsRelateAssetsNotBetween(Integer value1, Integer value2) {
            addCriterion("is_relate_assets not between", value1, value2, "isRelateAssets");
            return (Criteria) this;
        }

        public Criteria andEngineerIdIsNull() {
            addCriterion("engineer_id is null");
            return (Criteria) this;
        }

        public Criteria andEngineerIdIsNotNull() {
            addCriterion("engineer_id is not null");
            return (Criteria) this;
        }

        public Criteria andEngineerIdEqualTo(Long value) {
            addCriterion("engineer_id =", value, "engineerId");
            return (Criteria) this;
        }

        public Criteria andEngineerIdNotEqualTo(Long value) {
            addCriterion("engineer_id <>", value, "engineerId");
            return (Criteria) this;
        }

        public Criteria andEngineerIdGreaterThan(Long value) {
            addCriterion("engineer_id >", value, "engineerId");
            return (Criteria) this;
        }

        public Criteria andEngineerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("engineer_id >=", value, "engineerId");
            return (Criteria) this;
        }

        public Criteria andEngineerIdLessThan(Long value) {
            addCriterion("engineer_id <", value, "engineerId");
            return (Criteria) this;
        }

        public Criteria andEngineerIdLessThanOrEqualTo(Long value) {
            addCriterion("engineer_id <=", value, "engineerId");
            return (Criteria) this;
        }

        public Criteria andEngineerIdIn(List<Long> values) {
            addCriterion("engineer_id in", values, "engineerId");
            return (Criteria) this;
        }

        public Criteria andEngineerIdNotIn(List<Long> values) {
            addCriterion("engineer_id not in", values, "engineerId");
            return (Criteria) this;
        }

        public Criteria andEngineerIdBetween(Long value1, Long value2) {
            addCriterion("engineer_id between", value1, value2, "engineerId");
            return (Criteria) this;
        }

        public Criteria andEngineerIdNotBetween(Long value1, Long value2) {
            addCriterion("engineer_id not between", value1, value2, "engineerId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIsNull() {
            addCriterion("enterprise_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIsNotNull() {
            addCriterion("enterprise_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdEqualTo(Long value) {
            addCriterion("enterprise_id =", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotEqualTo(Long value) {
            addCriterion("enterprise_id <>", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdGreaterThan(Long value) {
            addCriterion("enterprise_id >", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("enterprise_id >=", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLessThan(Long value) {
            addCriterion("enterprise_id <", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLessThanOrEqualTo(Long value) {
            addCriterion("enterprise_id <=", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIn(List<Long> values) {
            addCriterion("enterprise_id in", values, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotIn(List<Long> values) {
            addCriterion("enterprise_id not in", values, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdBetween(Long value1, Long value2) {
            addCriterion("enterprise_id between", value1, value2, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotBetween(Long value1, Long value2) {
            addCriterion("enterprise_id not between", value1, value2, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmployeesIsNull() {
            addCriterion("enterprise_employees is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmployeesIsNotNull() {
            addCriterion("enterprise_employees is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmployeesEqualTo(String value) {
            addCriterion("enterprise_employees =", value, "enterpriseEmployees");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmployeesNotEqualTo(String value) {
            addCriterion("enterprise_employees <>", value, "enterpriseEmployees");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmployeesGreaterThan(String value) {
            addCriterion("enterprise_employees >", value, "enterpriseEmployees");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmployeesGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_employees >=", value, "enterpriseEmployees");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmployeesLessThan(String value) {
            addCriterion("enterprise_employees <", value, "enterpriseEmployees");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmployeesLessThanOrEqualTo(String value) {
            addCriterion("enterprise_employees <=", value, "enterpriseEmployees");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmployeesLike(String value) {
            addCriterion("enterprise_employees like", value, "enterpriseEmployees");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmployeesNotLike(String value) {
            addCriterion("enterprise_employees not like", value, "enterpriseEmployees");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmployeesIn(List<String> values) {
            addCriterion("enterprise_employees in", values, "enterpriseEmployees");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmployeesNotIn(List<String> values) {
            addCriterion("enterprise_employees not in", values, "enterpriseEmployees");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmployeesBetween(String value1, String value2) {
            addCriterion("enterprise_employees between", value1, value2, "enterpriseEmployees");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmployeesNotBetween(String value1, String value2) {
            addCriterion("enterprise_employees not between", value1, value2, "enterpriseEmployees");
            return (Criteria) this;
        }

        public Criteria andIfUsePartsIsNull() {
            addCriterion("if_use_parts is null");
            return (Criteria) this;
        }

        public Criteria andIfUsePartsIsNotNull() {
            addCriterion("if_use_parts is not null");
            return (Criteria) this;
        }

        public Criteria andIfUsePartsEqualTo(Integer value) {
            addCriterion("if_use_parts =", value, "ifUseParts");
            return (Criteria) this;
        }

        public Criteria andIfUsePartsNotEqualTo(Integer value) {
            addCriterion("if_use_parts <>", value, "ifUseParts");
            return (Criteria) this;
        }

        public Criteria andIfUsePartsGreaterThan(Integer value) {
            addCriterion("if_use_parts >", value, "ifUseParts");
            return (Criteria) this;
        }

        public Criteria andIfUsePartsGreaterThanOrEqualTo(Integer value) {
            addCriterion("if_use_parts >=", value, "ifUseParts");
            return (Criteria) this;
        }

        public Criteria andIfUsePartsLessThan(Integer value) {
            addCriterion("if_use_parts <", value, "ifUseParts");
            return (Criteria) this;
        }

        public Criteria andIfUsePartsLessThanOrEqualTo(Integer value) {
            addCriterion("if_use_parts <=", value, "ifUseParts");
            return (Criteria) this;
        }

        public Criteria andIfUsePartsIn(List<Integer> values) {
            addCriterion("if_use_parts in", values, "ifUseParts");
            return (Criteria) this;
        }

        public Criteria andIfUsePartsNotIn(List<Integer> values) {
            addCriterion("if_use_parts not in", values, "ifUseParts");
            return (Criteria) this;
        }

        public Criteria andIfUsePartsBetween(Integer value1, Integer value2) {
            addCriterion("if_use_parts between", value1, value2, "ifUseParts");
            return (Criteria) this;
        }

        public Criteria andIfUsePartsNotBetween(Integer value1, Integer value2) {
            addCriterion("if_use_parts not between", value1, value2, "ifUseParts");
            return (Criteria) this;
        }

        public Criteria andEstimateServiceCostIsNull() {
            addCriterion("estimate_service_cost is null");
            return (Criteria) this;
        }

        public Criteria andEstimateServiceCostIsNotNull() {
            addCriterion("estimate_service_cost is not null");
            return (Criteria) this;
        }

        public Criteria andEstimateServiceCostEqualTo(Long value) {
            addCriterion("estimate_service_cost =", value, "estimateServiceCost");
            return (Criteria) this;
        }

        public Criteria andEstimateServiceCostNotEqualTo(Long value) {
            addCriterion("estimate_service_cost <>", value, "estimateServiceCost");
            return (Criteria) this;
        }

        public Criteria andEstimateServiceCostGreaterThan(Long value) {
            addCriterion("estimate_service_cost >", value, "estimateServiceCost");
            return (Criteria) this;
        }

        public Criteria andEstimateServiceCostGreaterThanOrEqualTo(Long value) {
            addCriterion("estimate_service_cost >=", value, "estimateServiceCost");
            return (Criteria) this;
        }

        public Criteria andEstimateServiceCostLessThan(Long value) {
            addCriterion("estimate_service_cost <", value, "estimateServiceCost");
            return (Criteria) this;
        }

        public Criteria andEstimateServiceCostLessThanOrEqualTo(Long value) {
            addCriterion("estimate_service_cost <=", value, "estimateServiceCost");
            return (Criteria) this;
        }

        public Criteria andEstimateServiceCostIn(List<Long> values) {
            addCriterion("estimate_service_cost in", values, "estimateServiceCost");
            return (Criteria) this;
        }

        public Criteria andEstimateServiceCostNotIn(List<Long> values) {
            addCriterion("estimate_service_cost not in", values, "estimateServiceCost");
            return (Criteria) this;
        }

        public Criteria andEstimateServiceCostBetween(Long value1, Long value2) {
            addCriterion("estimate_service_cost between", value1, value2, "estimateServiceCost");
            return (Criteria) this;
        }

        public Criteria andEstimateServiceCostNotBetween(Long value1, Long value2) {
            addCriterion("estimate_service_cost not between", value1, value2, "estimateServiceCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostIsNull() {
            addCriterion("total_cost is null");
            return (Criteria) this;
        }

        public Criteria andTotalCostIsNotNull() {
            addCriterion("total_cost is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCostEqualTo(Long value) {
            addCriterion("total_cost =", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotEqualTo(Long value) {
            addCriterion("total_cost <>", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostGreaterThan(Long value) {
            addCriterion("total_cost >", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostGreaterThanOrEqualTo(Long value) {
            addCriterion("total_cost >=", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostLessThan(Long value) {
            addCriterion("total_cost <", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostLessThanOrEqualTo(Long value) {
            addCriterion("total_cost <=", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostIn(List<Long> values) {
            addCriterion("total_cost in", values, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotIn(List<Long> values) {
            addCriterion("total_cost not in", values, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostBetween(Long value1, Long value2) {
            addCriterion("total_cost between", value1, value2, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotBetween(Long value1, Long value2) {
            addCriterion("total_cost not between", value1, value2, "totalCost");
            return (Criteria) this;
        }

        public Criteria andRepairCostIsNull() {
            addCriterion("repair_cost is null");
            return (Criteria) this;
        }

        public Criteria andRepairCostIsNotNull() {
            addCriterion("repair_cost is not null");
            return (Criteria) this;
        }

        public Criteria andRepairCostEqualTo(Long value) {
            addCriterion("repair_cost =", value, "repairCost");
            return (Criteria) this;
        }

        public Criteria andRepairCostNotEqualTo(Long value) {
            addCriterion("repair_cost <>", value, "repairCost");
            return (Criteria) this;
        }

        public Criteria andRepairCostGreaterThan(Long value) {
            addCriterion("repair_cost >", value, "repairCost");
            return (Criteria) this;
        }

        public Criteria andRepairCostGreaterThanOrEqualTo(Long value) {
            addCriterion("repair_cost >=", value, "repairCost");
            return (Criteria) this;
        }

        public Criteria andRepairCostLessThan(Long value) {
            addCriterion("repair_cost <", value, "repairCost");
            return (Criteria) this;
        }

        public Criteria andRepairCostLessThanOrEqualTo(Long value) {
            addCriterion("repair_cost <=", value, "repairCost");
            return (Criteria) this;
        }

        public Criteria andRepairCostIn(List<Long> values) {
            addCriterion("repair_cost in", values, "repairCost");
            return (Criteria) this;
        }

        public Criteria andRepairCostNotIn(List<Long> values) {
            addCriterion("repair_cost not in", values, "repairCost");
            return (Criteria) this;
        }

        public Criteria andRepairCostBetween(Long value1, Long value2) {
            addCriterion("repair_cost between", value1, value2, "repairCost");
            return (Criteria) this;
        }

        public Criteria andRepairCostNotBetween(Long value1, Long value2) {
            addCriterion("repair_cost not between", value1, value2, "repairCost");
            return (Criteria) this;
        }

        public Criteria andPartsCostIsNull() {
            addCriterion("parts_cost is null");
            return (Criteria) this;
        }

        public Criteria andPartsCostIsNotNull() {
            addCriterion("parts_cost is not null");
            return (Criteria) this;
        }

        public Criteria andPartsCostEqualTo(Long value) {
            addCriterion("parts_cost =", value, "partsCost");
            return (Criteria) this;
        }

        public Criteria andPartsCostNotEqualTo(Long value) {
            addCriterion("parts_cost <>", value, "partsCost");
            return (Criteria) this;
        }

        public Criteria andPartsCostGreaterThan(Long value) {
            addCriterion("parts_cost >", value, "partsCost");
            return (Criteria) this;
        }

        public Criteria andPartsCostGreaterThanOrEqualTo(Long value) {
            addCriterion("parts_cost >=", value, "partsCost");
            return (Criteria) this;
        }

        public Criteria andPartsCostLessThan(Long value) {
            addCriterion("parts_cost <", value, "partsCost");
            return (Criteria) this;
        }

        public Criteria andPartsCostLessThanOrEqualTo(Long value) {
            addCriterion("parts_cost <=", value, "partsCost");
            return (Criteria) this;
        }

        public Criteria andPartsCostIn(List<Long> values) {
            addCriterion("parts_cost in", values, "partsCost");
            return (Criteria) this;
        }

        public Criteria andPartsCostNotIn(List<Long> values) {
            addCriterion("parts_cost not in", values, "partsCost");
            return (Criteria) this;
        }

        public Criteria andPartsCostBetween(Long value1, Long value2) {
            addCriterion("parts_cost between", value1, value2, "partsCost");
            return (Criteria) this;
        }

        public Criteria andPartsCostNotBetween(Long value1, Long value2) {
            addCriterion("parts_cost not between", value1, value2, "partsCost");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusIsNull() {
            addCriterion("settlement_status is null");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusIsNotNull() {
            addCriterion("settlement_status is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusEqualTo(String value) {
            addCriterion("settlement_status =", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusNotEqualTo(String value) {
            addCriterion("settlement_status <>", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusGreaterThan(String value) {
            addCriterion("settlement_status >", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusGreaterThanOrEqualTo(String value) {
            addCriterion("settlement_status >=", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusLessThan(String value) {
            addCriterion("settlement_status <", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusLessThanOrEqualTo(String value) {
            addCriterion("settlement_status <=", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusLike(String value) {
            addCriterion("settlement_status like", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusNotLike(String value) {
            addCriterion("settlement_status not like", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusIn(List<String> values) {
            addCriterion("settlement_status in", values, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusNotIn(List<String> values) {
            addCriterion("settlement_status not in", values, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusBetween(String value1, String value2) {
            addCriterion("settlement_status between", value1, value2, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusNotBetween(String value1, String value2) {
            addCriterion("settlement_status not between", value1, value2, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andPayedIsNull() {
            addCriterion("payed is null");
            return (Criteria) this;
        }

        public Criteria andPayedIsNotNull() {
            addCriterion("payed is not null");
            return (Criteria) this;
        }

        public Criteria andPayedEqualTo(Long value) {
            addCriterion("payed =", value, "payed");
            return (Criteria) this;
        }

        public Criteria andPayedNotEqualTo(Long value) {
            addCriterion("payed <>", value, "payed");
            return (Criteria) this;
        }

        public Criteria andPayedGreaterThan(Long value) {
            addCriterion("payed >", value, "payed");
            return (Criteria) this;
        }

        public Criteria andPayedGreaterThanOrEqualTo(Long value) {
            addCriterion("payed >=", value, "payed");
            return (Criteria) this;
        }

        public Criteria andPayedLessThan(Long value) {
            addCriterion("payed <", value, "payed");
            return (Criteria) this;
        }

        public Criteria andPayedLessThanOrEqualTo(Long value) {
            addCriterion("payed <=", value, "payed");
            return (Criteria) this;
        }

        public Criteria andPayedIn(List<Long> values) {
            addCriterion("payed in", values, "payed");
            return (Criteria) this;
        }

        public Criteria andPayedNotIn(List<Long> values) {
            addCriterion("payed not in", values, "payed");
            return (Criteria) this;
        }

        public Criteria andPayedBetween(Long value1, Long value2) {
            addCriterion("payed between", value1, value2, "payed");
            return (Criteria) this;
        }

        public Criteria andPayedNotBetween(Long value1, Long value2) {
            addCriterion("payed not between", value1, value2, "payed");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andServiceCycleIsNull() {
            addCriterion("service_cycle is null");
            return (Criteria) this;
        }

        public Criteria andServiceCycleIsNotNull() {
            addCriterion("service_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCycleEqualTo(Integer value) {
            addCriterion("service_cycle =", value, "serviceCycle");
            return (Criteria) this;
        }

        public Criteria andServiceCycleNotEqualTo(Integer value) {
            addCriterion("service_cycle <>", value, "serviceCycle");
            return (Criteria) this;
        }

        public Criteria andServiceCycleGreaterThan(Integer value) {
            addCriterion("service_cycle >", value, "serviceCycle");
            return (Criteria) this;
        }

        public Criteria andServiceCycleGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_cycle >=", value, "serviceCycle");
            return (Criteria) this;
        }

        public Criteria andServiceCycleLessThan(Integer value) {
            addCriterion("service_cycle <", value, "serviceCycle");
            return (Criteria) this;
        }

        public Criteria andServiceCycleLessThanOrEqualTo(Integer value) {
            addCriterion("service_cycle <=", value, "serviceCycle");
            return (Criteria) this;
        }

        public Criteria andServiceCycleIn(List<Integer> values) {
            addCriterion("service_cycle in", values, "serviceCycle");
            return (Criteria) this;
        }

        public Criteria andServiceCycleNotIn(List<Integer> values) {
            addCriterion("service_cycle not in", values, "serviceCycle");
            return (Criteria) this;
        }

        public Criteria andServiceCycleBetween(Integer value1, Integer value2) {
            addCriterion("service_cycle between", value1, value2, "serviceCycle");
            return (Criteria) this;
        }

        public Criteria andServiceCycleNotBetween(Integer value1, Integer value2) {
            addCriterion("service_cycle not between", value1, value2, "serviceCycle");
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

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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
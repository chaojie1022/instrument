package insweb.entity;

import java.util.Date;

public class Order {
    private Long id;

    private Long customerId;

    private String serverType;

    private Integer isRelateAssets;

    private Long engineerId;

    private Long enterpriseId;

    private String enterpriseEmployees;

    private Integer ifUseParts;

    private Long estimateServiceCost;

    private Long totalCost;

    private Long repairCost;

    private Long partsCost;

    private String settlementStatus;

    private Long payed;

    private String status;

    private Integer serviceCycle;

    private String type;

    private String remark;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getServerType() {
        return serverType;
    }

    public void setServerType(String serverType) {
        this.serverType = serverType == null ? null : serverType.trim();
    }

    public Integer getIsRelateAssets() {
        return isRelateAssets;
    }

    public void setIsRelateAssets(Integer isRelateAssets) {
        this.isRelateAssets = isRelateAssets;
    }

    public Long getEngineerId() {
        return engineerId;
    }

    public void setEngineerId(Long engineerId) {
        this.engineerId = engineerId;
    }

    public Long getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getEnterpriseEmployees() {
        return enterpriseEmployees;
    }

    public void setEnterpriseEmployees(String enterpriseEmployees) {
        this.enterpriseEmployees = enterpriseEmployees == null ? null : enterpriseEmployees.trim();
    }

    public Integer getIfUseParts() {
        return ifUseParts;
    }

    public void setIfUseParts(Integer ifUseParts) {
        this.ifUseParts = ifUseParts;
    }

    public Long getEstimateServiceCost() {
        return estimateServiceCost;
    }

    public void setEstimateServiceCost(Long estimateServiceCost) {
        this.estimateServiceCost = estimateServiceCost;
    }

    public Long getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Long totalCost) {
        this.totalCost = totalCost;
    }

    public Long getRepairCost() {
        return repairCost;
    }

    public void setRepairCost(Long repairCost) {
        this.repairCost = repairCost;
    }

    public Long getPartsCost() {
        return partsCost;
    }

    public void setPartsCost(Long partsCost) {
        this.partsCost = partsCost;
    }

    public String getSettlementStatus() {
        return settlementStatus;
    }

    public void setSettlementStatus(String settlementStatus) {
        this.settlementStatus = settlementStatus == null ? null : settlementStatus.trim();
    }

    public Long getPayed() {
        return payed;
    }

    public void setPayed(Long payed) {
        this.payed = payed;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getServiceCycle() {
        return serviceCycle;
    }

    public void setServiceCycle(Integer serviceCycle) {
        this.serviceCycle = serviceCycle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
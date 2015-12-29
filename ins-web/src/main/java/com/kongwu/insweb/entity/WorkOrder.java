package com.kongwu.insweb.entity;

public class WorkOrder {
    private Long id;

    private Long orderId;

    private Long customerRuid;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getCustomerRuid() {
        return customerRuid;
    }

    public void setCustomerRuid(Long customerRuid) {
        this.customerRuid = customerRuid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}
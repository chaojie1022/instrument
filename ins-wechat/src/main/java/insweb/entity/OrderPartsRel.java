package insweb.entity;

public class OrderPartsRel {
    private Long id;

    private Long orderId;

    private Long partsId;

    private Long instrumentId;

    private Long customerAssetId;

    private Integer amount;

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

    public Long getPartsId() {
        return partsId;
    }

    public void setPartsId(Long partsId) {
        this.partsId = partsId;
    }

    public Long getInstrumentId() {
        return instrumentId;
    }

    public void setInstrumentId(Long instrumentId) {
        this.instrumentId = instrumentId;
    }

    public Long getCustomerAssetId() {
        return customerAssetId;
    }

    public void setCustomerAssetId(Long customerAssetId) {
        this.customerAssetId = customerAssetId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
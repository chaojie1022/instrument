package com.kongwu.insweb.entity;

public class Service {
    private Long id;

    private Long instrument;

    private Integer repairPrice;

    private Integer upkeepPrice;

    private Integer maintainingPrice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getInstrument() {
        return instrument;
    }

    public void setInstrument(Long instrument) {
        this.instrument = instrument;
    }

    public Integer getRepairPrice() {
        return repairPrice;
    }

    public void setRepairPrice(Integer repairPrice) {
        this.repairPrice = repairPrice;
    }

    public Integer getUpkeepPrice() {
        return upkeepPrice;
    }

    public void setUpkeepPrice(Integer upkeepPrice) {
        this.upkeepPrice = upkeepPrice;
    }

    public Integer getMaintainingPrice() {
        return maintainingPrice;
    }

    public void setMaintainingPrice(Integer maintainingPrice) {
        this.maintainingPrice = maintainingPrice;
    }
}
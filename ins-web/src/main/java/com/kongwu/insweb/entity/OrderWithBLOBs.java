package com.kongwu.insweb.entity;

public class OrderWithBLOBs extends Order {
    private String instruments;

    private String partsList;

    public String getInstruments() {
        return instruments;
    }

    public void setInstruments(String instruments) {
        this.instruments = instruments == null ? null : instruments.trim();
    }

    public String getPartsList() {
        return partsList;
    }

    public void setPartsList(String partsList) {
        this.partsList = partsList == null ? null : partsList.trim();
    }
}
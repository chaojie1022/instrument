package com.kongwu.insweb.entity;

import java.util.Date;

public class InstrumentParts {
    private Long id;

    private String code;

    private Long categoryId;

    private String name;

    private String title;

    private String image;

    private Integer sort;

    private String description;

    private Integer price;

    private String adaptInstrument;

    private String adaptInstrumentDesc;

    private String status;

    private Date createTime;

    private Date updateTime;

    private String detail;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getAdaptInstrument() {
        return adaptInstrument;
    }

    public void setAdaptInstrument(String adaptInstrument) {
        this.adaptInstrument = adaptInstrument == null ? null : adaptInstrument.trim();
    }

    public String getAdaptInstrumentDesc() {
        return adaptInstrumentDesc;
    }

    public void setAdaptInstrumentDesc(String adaptInstrumentDesc) {
        this.adaptInstrumentDesc = adaptInstrumentDesc == null ? null : adaptInstrumentDesc.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }
}
package com.kongwu.insweb.entity;

import java.util.Date;

public class UserEngineer {
    private Long id;

    private Long ruid;

    private Long uid;

    private String code;

    private String name;

    private String identity;

    private String identityFrontImage;

    private String identityBackImage;

    private String qualificationCertificateImages;

    private String introduction;

    private String contact;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRuid() {
        return ruid;
    }

    public void setRuid(Long ruid) {
        this.ruid = ruid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity == null ? null : identity.trim();
    }

    public String getIdentityFrontImage() {
        return identityFrontImage;
    }

    public void setIdentityFrontImage(String identityFrontImage) {
        this.identityFrontImage = identityFrontImage == null ? null : identityFrontImage.trim();
    }

    public String getIdentityBackImage() {
        return identityBackImage;
    }

    public void setIdentityBackImage(String identityBackImage) {
        this.identityBackImage = identityBackImage == null ? null : identityBackImage.trim();
    }

    public String getQualificationCertificateImages() {
        return qualificationCertificateImages;
    }

    public void setQualificationCertificateImages(String qualificationCertificateImages) {
        this.qualificationCertificateImages = qualificationCertificateImages == null ? null : qualificationCertificateImages.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
package com.kongwu.insweb.entity;

import java.util.Date;

public class UserServiceEnterprise {
    private Long id;

    private Long ruid;

    private Long uid;

    private String code;

    private String name;

    private String businessLicenseCode;

    private String businessLicenseImage;

    private String legalPersonName;

    private String legalPersonIdentity;

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

    public String getBusinessLicenseCode() {
        return businessLicenseCode;
    }

    public void setBusinessLicenseCode(String businessLicenseCode) {
        this.businessLicenseCode = businessLicenseCode == null ? null : businessLicenseCode.trim();
    }

    public String getBusinessLicenseImage() {
        return businessLicenseImage;
    }

    public void setBusinessLicenseImage(String businessLicenseImage) {
        this.businessLicenseImage = businessLicenseImage == null ? null : businessLicenseImage.trim();
    }

    public String getLegalPersonName() {
        return legalPersonName;
    }

    public void setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName == null ? null : legalPersonName.trim();
    }

    public String getLegalPersonIdentity() {
        return legalPersonIdentity;
    }

    public void setLegalPersonIdentity(String legalPersonIdentity) {
        this.legalPersonIdentity = legalPersonIdentity == null ? null : legalPersonIdentity.trim();
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
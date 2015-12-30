package insweb.entity;

import java.util.Date;

public class CustomerAssets {
    private Long id;

    private Long ruid;

    private Long uid;

    private Long instrumentId;

    private String instrumentAssetCode;

    private Date startUseDate;

    private String descrption;

    private String maintainingRecord;

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

    public Long getInstrumentId() {
        return instrumentId;
    }

    public void setInstrumentId(Long instrumentId) {
        this.instrumentId = instrumentId;
    }

    public String getInstrumentAssetCode() {
        return instrumentAssetCode;
    }

    public void setInstrumentAssetCode(String instrumentAssetCode) {
        this.instrumentAssetCode = instrumentAssetCode == null ? null : instrumentAssetCode.trim();
    }

    public Date getStartUseDate() {
        return startUseDate;
    }

    public void setStartUseDate(Date startUseDate) {
        this.startUseDate = startUseDate;
    }

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption == null ? null : descrption.trim();
    }

    public String getMaintainingRecord() {
        return maintainingRecord;
    }

    public void setMaintainingRecord(String maintainingRecord) {
        this.maintainingRecord = maintainingRecord == null ? null : maintainingRecord.trim();
    }
}
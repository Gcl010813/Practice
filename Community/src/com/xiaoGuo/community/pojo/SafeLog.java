package com.xiaoGuo.community.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class SafeLog implements Serializable {
    private int id;
    private String safeName;
    private String ownName;
    private String ownPhone;
    private String comAddress;
    private String houseNumber;
    private String notes;
    private String ownSignature;
    private int isPass;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date safeTime;

    public SafeLog() {}

    public SafeLog(String safeName, String ownName, String ownPhone, String comAddress, String houseNumber, String notes, String ownSignature, int isPass, Date safeTime) {
        this.safeName = safeName;
        this.ownName = ownName;
        this.ownPhone = ownPhone;
        this.comAddress = comAddress;
        this.houseNumber = houseNumber;
        this.notes = notes;
        this.ownSignature = ownSignature;
        this.isPass = isPass;
        this.safeTime = safeTime;
    }

    public SafeLog(int id, String safeName, String ownName, String ownPhone, String comAddress, String houseNumber, String notes, String ownSignature, int isPass, Date safeTime) {
        this.id = id;
        this.safeName = safeName;
        this.ownName = ownName;
        this.ownPhone = ownPhone;
        this.comAddress = comAddress;
        this.houseNumber = houseNumber;
        this.notes = notes;
        this.ownSignature = ownSignature;
        this.isPass = isPass;
        this.safeTime = safeTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSafeName() {
        return safeName;
    }

    public void setSafeName(String safeName) {
        this.safeName = safeName;
    }

    public String getOwnName() {
        return ownName;
    }

    public void setOwnName(String ownName) {
        this.ownName = ownName;
    }

    public String getOwnPhone() {
        return ownPhone;
    }

    public void setOwnPhone(String ownPhone) {
        this.ownPhone = ownPhone;
    }

    public String getComAddress() {
        return comAddress;
    }

    public void setComAddress(String comAddress) {
        this.comAddress = comAddress;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getOwnSignature() {
        return ownSignature;
    }

    public void setOwnSignature(String ownSignature) {
        this.ownSignature = ownSignature;
    }

    public int getIsPass() {
        return isPass;
    }

    public void setIsPass(int isPass) {
        this.isPass = isPass;
    }

    public Date getSafeTime() {
        return safeTime;
    }

    public void setSafeTime(Date safeTime) {
        this.safeTime = safeTime;
    }

    @Override
    public String toString() {
        return "SafeLog{" +
                "id=" + id +
                ", safeName='" + safeName + '\'' +
                ", ownName='" + ownName + '\'' +
                ", ownPhone='" + ownPhone + '\'' +
                ", comAddress='" + comAddress + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", notes='" + notes + '\'' +
                ", ownSignature='" + ownSignature + '\'' +
                ", isPass=" + isPass +
                ", safeTime=" + safeTime +
                '}';
    }
}

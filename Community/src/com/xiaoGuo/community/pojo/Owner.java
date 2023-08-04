package com.xiaoGuo.community.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class Owner implements Serializable {
    private int id;
    private String ownName;
    private String ownPhone;
    private String comAddress;
    private String houseNumber;
    private int peopleCount;
    private int isSafe;
    private int isCheck;
    private int houseCount;
    private int sort;
    private String notes;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updateTime;

    public Owner() {}

    //无创建 更新使用
    public Owner(int id,String ownName, String ownPhone, String comAddress, String houseNumber, int peopleCount, int isSafe, int isCheck, int houseCount, int sort, String notes, Date updateTime) {
        this.id=id;
        this.ownName = ownName;
        this.ownPhone = ownPhone;
        this.comAddress = comAddress;
        this.houseNumber = houseNumber;
        this.peopleCount = peopleCount;
        this.isSafe = isSafe;
        this.isCheck = isCheck;
        this.houseCount = houseCount;
        this.sort = sort;
        this.notes = notes;
        this.updateTime = updateTime;
    }

    //无id 新增使用
    public Owner(String ownName, String ownPhone, String comAddress, String houseNumber, int peopleCount, int isSafe, int isCheck, int houseCount, int sort, String notes, Date createTime, Date updateTime) {
        this.ownName = ownName;
        this.ownPhone = ownPhone;
        this.comAddress = comAddress;
        this.houseNumber = houseNumber;
        this.peopleCount = peopleCount;
        this.isSafe = isSafe;
        this.isCheck = isCheck;
        this.houseCount = houseCount;
        this.sort = sort;
        this.notes = notes;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    //全部
    public Owner(int id, String ownName, String ownPhone, String comAddress, String houseNumber, int peopleCount, int isSafe, int isCheck, int houseCount, int sort, String notes, Date createTime, Date updateTime) {
        this.id = id;
        this.ownName = ownName;
        this.ownPhone = ownPhone;
        this.comAddress = comAddress;
        this.houseNumber = houseNumber;
        this.peopleCount = peopleCount;
        this.isSafe = isSafe;
        this.isCheck = isCheck;
        this.houseCount = houseCount;
        this.sort = sort;
        this.notes = notes;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }

    public int getIsSafe() {
        return isSafe;
    }

    public void setIsSafe(int isSafe) {
        this.isSafe = isSafe;
    }

    public int getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(int isCheck) {
        this.isCheck = isCheck;
    }

    public int getHouseCount() {
        return houseCount;
    }

    public void setHouseCount(int houseCount) {
        this.houseCount = houseCount;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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

    @Override
    public String toString() {
        return "owner{" +
                "id=" + id +
                ", ownName='" + ownName + '\'' +
                ", ownPhone='" + ownPhone + '\'' +
                ", comAddress='" + comAddress + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", peopleCount=" + peopleCount +
                ", isSafe=" + isSafe +
                ", isCheck=" + isCheck +
                ", houseCount=" + houseCount +
                ", sort=" + sort +
                ", notes='" + notes + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}

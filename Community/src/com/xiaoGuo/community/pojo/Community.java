package com.xiaoGuo.community.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class Community implements Serializable {
    private int id;
    private String comName;
    private String comType;
    private String safePerson;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updateTime;

    public Community() {}

    //搜索使用
    public Community(int id, String comName, String comType) {
        this.id = id;
        this.comName = comName;
        this.comType = comType;
    }

    //无创建时间 更新使用
    public Community(int id,String comName, String comType, String safePerson, Date updateTime) {
        this.id=id;
        this.comName = comName;
        this.comType = comType;
        this.safePerson = safePerson;
        this.updateTime = updateTime;
    }

    //无id 增加使用
    public Community(String comName, String comType, String safePerson, Date createTime, Date updateTime) {
        this.comName = comName;
        this.comType = comType;
        this.safePerson = safePerson;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    //全参
    public Community(int id, String comName, String comType, String safePerson, Date createTime, Date updateTime) {
        this.id = id;
        this.comName = comName;
        this.comType = comType;
        this.safePerson = safePerson;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public String getComType() {
        return comType;
    }

    public void setComType(String comType) {
        this.comType = comType;
    }

    public String getSafePerson() {
        return safePerson;
    }

    public void setSafePerson(String safePerson) {
        this.safePerson = safePerson;
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
        return "Community{" +
                "id=" + id +
                ", comName='" + comName + '\'' +
                ", comType='" + comType + '\'' +
                ", safePerson='" + safePerson + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}

package com.xiaoGuo.community.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class SafePerson implements Serializable {
    private int id;
    private String safeNick;
    private String safeName;

    private String safePhone;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updateTime;
    private int status;

    public SafePerson() {}

    //无id 添加使用
    public SafePerson(String safeNick, String safeName, String safePhone, Date createTime, Date updateTime, int status) {
        this.safeNick = safeNick;
        this.safeName = safeName;
        this.safePhone = safePhone;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.status = status;
    }

    //无createTime 更新使用
    public SafePerson(int id,String safeNick, String safeName, String safePhone, Date updateTime, int status) {
        this.id=id;
        this.safeNick = safeNick;
        this.safeName = safeName;
        this.safePhone = safePhone;
        this.updateTime = updateTime;
        this.status = status;
    }
    //全参
    public SafePerson(int id, String safeNick, String safeName, String safePhone, Date createTime, Date updateTime, int status) {
        this.id = id;
        this.safeNick = safeNick;
        this.safeName = safeName;
        this.safePhone = safePhone;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSafeNick() {
        return safeNick;
    }

    public void setSafeNick(String safeNick) {
        this.safeNick = safeNick;
    }

    public String getSafeName() {
        return safeName;
    }

    public void setSafeName(String safeName) {
        this.safeName = safeName;
    }

    public String getSafePhone() {
        return safePhone;
    }

    public void setSafePhone(String safePhone) {
        this.safePhone = safePhone;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SafePerson{" +
                "id=" + id +
                ", safeNick='" + safeNick + '\'' +
                ", safeName='" + safeName + '\'' +
                ", safePhone='" + safePhone + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", status=" + status +
                '}';
    }
}

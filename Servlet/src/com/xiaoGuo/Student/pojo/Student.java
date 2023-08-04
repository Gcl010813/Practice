/**
 * author: xiaoGuo
 * Date: 2023-07-26 16:47:33
 */
package com.xiaoGuo.Student.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {
    private int id;
    private String nickName;
    private String name;
    private String mobile;
    private int gender;
    private Double balance;
    private int status;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;

    public Student() {}

    public Student(String nickName, String name, String mobile) {
        this.nickName = nickName;
        this.name = name;
        this.mobile = mobile;
    }

    public Student(String nickName, String name, String mobile, int gender, Double balance, int status, Date createTime) {
        this.nickName = nickName;
        this.name = name;
        this.mobile = mobile;
        this.gender = gender;
        this.balance = balance;
        this.status = status;
        this.createTime = createTime;
    }

    public Student(int id, String nickName, String name, String mobile, int gender, Double balance, int status, Date createTime) {
        this.id = id;
        this.nickName = nickName;
        this.name = name;
        this.mobile = mobile;
        this.gender = gender;
        this.balance = balance;
        this.status = status;
        this.createTime = createTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", nickName='" + nickName + '\'' +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", gender=" + gender +
                ", balance=" + balance +
                ", status=" + status +
                ", createTime=" + createTime +
                '}';
    }
}

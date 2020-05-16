package com.lff.demo.entity;

import java.math.BigInteger;

public class Student {

    private Integer stuId;

    private String stuName;

    private BigInteger stuNo;

    private Boolean isVip;

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public BigInteger getStuNo() {
        return stuNo;
    }

    public void setStuNo(BigInteger stuNo) {
        this.stuNo = stuNo;
    }

    public Boolean getVip() {
        return isVip;
    }

    public void setVip(Boolean vip) {
        isVip = vip;
    }
}

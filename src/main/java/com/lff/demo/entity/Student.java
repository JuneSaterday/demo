package com.lff.demo.entity;


import java.io.Serializable;
import java.math.BigInteger;

public class Student implements Serializable {

    private Integer stuId;

    private String stuName;

    private BigInteger stuNo;

    private int stuLevel;

    private Boolean isVip;

    private Boolean isDeleted;

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

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

    public Boolean getIsVip() {
        return isVip;
    }

    public void setIsVip(Boolean vip) {
        isVip = vip;
    }

    public int getStuLevel() {
        return stuLevel;
    }

    public void setStuLevel(int stuLevel) {
        this.stuLevel = stuLevel;
    }
}

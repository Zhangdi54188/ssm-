package com.model;

public class User {
    private Long id;

    private String userId;

    private String userName;

    private String zjm;

    private String y11;

    private String y12;

    private String y13;

    private Integer isDelete;

    private Integer userPass;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getZjm() {
        return zjm;
    }

    public void setZjm(String zjm) {
        this.zjm = zjm;
    }

    public String getY11() {
        return y11;
    }

    public void setY11(String y11) {
        this.y11 = y11;
    }

    public String getY12() {
        return y12;
    }

    public void setY12(String y12) {
        this.y12 = y12;
    }

    public String getY13() {
        return y13;
    }

    public void setY13(String y13) {
        this.y13 = y13;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getUserPass() {
        return userPass;
    }

    public void setUserPass(Integer userPass) {
        this.userPass = userPass;
    }
}
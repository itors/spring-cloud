package com.itors.eshop.pojo;

import java.util.Date;

public class UserInfo {
    private Integer userId;//用户ID

    private String userName;//用户名

    private Integer userRole;//用户角色 1:普通用户 2：管理员

    private String phoneNum;//电话号码

    private String userRelaName;//用户真实姓名

    private Integer createUser;//创建人

    private Date createDt;//创建时间

    private Integer userState;//0:有效 1失效

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getUserRole() {
        return userRole;
    }

    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
    }

    public String getUserRelaName() {
        return userRelaName;
    }

    public void setUserRelaName(String userRelaName) {
        this.userRelaName = userRelaName == null ? null : userRelaName.trim();
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    public Integer getUserStatee() {
        return userState;
    }

    public void setUserStatee(Integer userState) {
        this.userState = userState;
    }
}
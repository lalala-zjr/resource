package com.example.server.model;

import org.springframework.stereotype.Repository;

import java.sql.Time;

@Repository
public class User {
    private String userName;
    private String userPassword;
    private String userPhone;
    private Time userMath;
    private Time userEnglish;
    private Time userPolicy;
    private Time userCourse;

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public Time getUserCourse() {
        return userCourse;
    }

    public Time getUserEnglish() {
        return userEnglish;
    }

    public Time getUserMath() {
        return userMath;
    }

    public Time getUserPolicy() {
        return userPolicy;
    }

    public void setUserCourse(Time userCourse) {
        this.userCourse = userCourse;
    }

    public void setUserEnglish(Time userEnglish) {
        this.userEnglish = userEnglish;
    }

    public void setUserMath(Time userMath) {
        this.userMath = userMath;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public void setUserPolicy(Time userPolicy) {
        this.userPolicy = userPolicy;
    }
}

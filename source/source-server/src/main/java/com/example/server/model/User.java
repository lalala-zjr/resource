package com.example.server.model;

import org.springframework.stereotype.Repository;

import java.sql.Time;

@Repository
public class User {
    private String user_name;
    private String user_password;
    private String user_phone;
    private Time user_math;
    private Time user_english;
    private Time user_policy;
    private Time user_course;

    public Time getUser_english(){
        return user_english;
    }

    public Time getUser_policy(){
        return user_policy;
    }

    public Time getUser_course() {
        return user_course;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public Time getUser_math() {
        return user_math;
    }

    public void setUser_course(Time user_course) {
        this.user_course = user_course;
    }

    public void setUser_english(Time user_english) {
        this.user_english = user_english;
    }

    public void setUser_math(Time user_math) {
        this.user_math = user_math;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public void setUser_policy(Time user_policy) {
        this.user_policy = user_policy;
    }
}

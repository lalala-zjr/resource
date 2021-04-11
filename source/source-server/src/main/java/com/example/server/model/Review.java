package com.example.server.model;

import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;

@Repository
public class Review {
    private int review_id;
    private String user_phone;
    private SimpleDateFormat review_time;
    private String review_content;
    private int review_good;

    public int getReview_good() {
        return review_good;
    }

    public int getReview_id() {
        return review_id;
    }

    public SimpleDateFormat getReview_time() {
        return review_time;
    }

    public String getReview_content() {
        return review_content;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public void setReview_content(String review_content) {
        this.review_content = review_content;
    }

    public void setReview_good(int review_good) {
        this.review_good = review_good;
    }

    public void setReview_id(int review_id) {
        this.review_id = review_id;
    }

    public void setReview_time(SimpleDateFormat review_time) {
        this.review_time = review_time;
    }
}

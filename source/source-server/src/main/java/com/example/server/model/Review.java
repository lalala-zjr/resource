package com.example.server.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

@Repository
public class Review {
    private String userPhone;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date reviewTime;
    private int reviewId;
    private String reviewContent;
    private int reviewSee;
    private int reviewGood;
    private String userName;
    private String reviewTitle;

    public int getReviewSee(){
        return reviewSee;
    }

    public String getUserName() {
        return userName;
    }

    public String getReviewTitle() {
        return reviewTitle;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setReviewTitle(String reviewTitle) {
        this.reviewTitle = reviewTitle;
    }

    public void setReviewSee(int reviewSee){
        this.reviewSee = reviewSee;
    }

    public int getReviewGood() {
        return reviewGood;
    }

    public int getReviewId() {
        return reviewId;
    }

    public Date getReviewTime() {
        return reviewTime;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public void setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent;
    }

    public void setReviewGood(int reviewGood) {
        this.reviewGood = reviewGood;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public void setReview_time(Date reviewTime) {
        this.reviewTime = reviewTime;
    }
}

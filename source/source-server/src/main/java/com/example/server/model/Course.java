package com.example.server.model;

import org.springframework.stereotype.Repository;

import java.sql.Time;

@Repository
public class Course {
    private int courseId;
    private String courseName;
    private String courseType;
    private int courseSee;
    private int courseGood;
    private int courseReview;

    public int getCourseGood() {
        return courseGood;
    }

    public int getCourseId() {
        return courseId;
    }

    public int getCourseReview() {
        return courseReview;
    }

    public int getCourseSee() {
        return courseSee;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseGood(int courseGood) {
        this.courseGood = courseGood;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseReview(int courseReview) {
        this.courseReview = courseReview;
    }

    public void setCourseSee(int courseSee) {
        this.courseSee = courseSee;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }
}

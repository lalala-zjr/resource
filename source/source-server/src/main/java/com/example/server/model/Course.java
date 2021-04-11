package com.example.server.model;

import org.springframework.stereotype.Repository;

import java.sql.Time;

@Repository
public class Course {
    private int course_id;
    private String course_name;
    private String course_type;
    private Time course_time;
    private int course_see;
    private int course_good;
    private int course_review;

    public int getCourse_id(){
        return course_id;
    }

    public int getCourse_good() {
        return course_good;
    }

    public int getCourse_review() {
        return course_review;
    }

    public int getCourse_see() {
        return course_see;
    }

    public String getCourse_name() {
        return course_name;
    }

    public String getCourse_type() {
        return course_type;
    }

    public Time getCourse_time() {
        return course_time;
    }

    public void setCourse_good(int course_good) {
        this.course_good = course_good;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public void setCourse_review(int course_review) {
        this.course_review = course_review;
    }

    public void setCourse_see(int course_see) {
        this.course_see = course_see;
    }

    public void setCourse_time(Time course_time) {
        this.course_time = course_time;
    }

    public void setCourse_type(String course_type) {
        this.course_type = course_type;
    }
}

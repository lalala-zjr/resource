package com.example.server.service;

import com.example.server.mapper.CourseMapping;
import com.example.server.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexBookService {
    @Autowired
    private CourseMapping courseMapping;
    //    首页的书籍信息展示
    public List <Course> simplyBookMath() {
        return courseMapping.simplyMath();
    }
    public List <Course> simplyBookEnglish() {
        return courseMapping.simplyEnglish();
    }
    public List <Course> simplyBookPolicy() {
        return courseMapping.simplyPolicy();
    }
}

package com.example.server.mapper;

import com.example.server.model.Course;
import com.example.server.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
@Mapper
public interface CourseMapping {

    @Select("select courseName from course where courseType='math' limit 3")
    List <Course> simplyMath();

    @Select("select courseName from course where courseType='english' limit 3")
    List <Course> simplyEnglish();

    @Select("select courseName from course where courseType='policy' limit 3")
    List <Course> simplyPolicy();
}

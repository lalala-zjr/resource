package com.example.server.mapper;

import com.example.server.model.Review;
import com.example.server.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface ReviewMapping {

    @Select("select * from review")
    List<Review> allIn();
}

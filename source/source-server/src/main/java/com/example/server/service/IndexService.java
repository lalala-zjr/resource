package com.example.server.service;

import com.example.server.mapper.ReviewMapping;
import com.example.server.mapper.UserMapping;
import com.example.server.model.Review;
import com.example.server.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexService {

    @Autowired
    private ReviewMapping reviewMapping;
    //    首页的基本信息展示
    public List <Review> allInformation() {
        return reviewMapping.allIn();
    }
}

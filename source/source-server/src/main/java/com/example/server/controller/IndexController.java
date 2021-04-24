package com.example.server.controller;

import com.example.server.model.Course;
import com.example.server.model.Review;
import com.example.server.service.IndexBookService;
import com.example.server.service.IndexService;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
public class IndexController {
    @Resource
    private JdbcTemplate jdbcTemplate;
    @Autowired  //与service层进行交互
    private IndexService indexService;
    @Autowired
    private IndexBookService indexBookService;
    @PostMapping("/index")
    @Reference
    public String index(Model model) throws JsonProcessingException {
        //  调用service层的方法获取交流中心参数
        List<Review> re = indexService.allInformation();
        System.out.println(re.get(0).getReviewTime());
        //  获取书籍分类信息
        List<Course> english = indexBookService.simplyBookEnglish();
        List<Course> math = indexBookService.simplyBookMath();
        List<Course> policy = indexBookService.simplyBookPolicy();
        model.addAttribute("review", re);
        model.addAttribute("english", english);
        model.addAttribute("math", math);
        model.addAttribute("policy", policy);
        ObjectMapper mapper =  new ObjectMapper();
        String str = mapper.writeValueAsString(model);
        return str;
    }
}

package com.example.server.controller;

import com.example.server.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class LoginController {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/login")

    public String login(String user_phone,String user_password, Model model){
        User user = new User();
        user.setUser_phone(user_phone);
        user.setUser_password(user_password);
        String sql = "select * from User";
        List<Map<String,Object>> list = jdbcTemplate.queryForList(sql);
        return "ok";
    }
}

package com.example.server.controller;

import com.example.server.model.User;
import com.example.server.service.LoginService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class LoginController {

    @Resource
    private JdbcTemplate jdbcTemplate;
    @Autowired  //与service层进行交互
    private LoginService loginService;

    @PostMapping  ("/login")
    @Reference
    public Boolean login(@Param("phone") String phone, @Param("password") String password){
        Boolean b = loginService.find(phone, password);  //调用service层的方法
        return b;
    }
}

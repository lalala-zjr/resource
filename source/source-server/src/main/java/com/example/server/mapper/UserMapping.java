package com.example.server.mapper;


import com.example.server.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper

@Repository

public interface UserMapping {

    @Select("select userPhone from user where userPhone = #{phone} and userPassword = #{password}")
    List <User> login(String phone, String password);

}

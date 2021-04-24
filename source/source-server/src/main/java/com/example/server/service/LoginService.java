package com.example.server.service;


import com.example.server.mapper.UserMapping;
import com.example.server.model.User;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LoginService {

    @Autowired
    private UserMapping userMapping;
    public Boolean find(String phone, String password) {
        try{
            List <User>  user = userMapping.login(phone, password);
            if(user.size() == 0){
                return false;
            }else{
                return true;
            }
        }catch (Exception e) {
                return false;
        }
    }
}

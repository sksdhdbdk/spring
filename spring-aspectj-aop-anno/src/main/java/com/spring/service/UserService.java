package com.spring.service;

import org.springframework.stereotype.Service;
@Service
public class UserService {
    public void login(){
        System.out.println("系统身份认证...");
    }

    public void logout(){
        System.out.println("退出系统");
    }
}

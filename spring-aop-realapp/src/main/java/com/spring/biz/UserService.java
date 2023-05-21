package com.spring.biz;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void saveUser(){
        System.out.println("增加用户");
    }
}

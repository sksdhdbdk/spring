package com.spring.service;

import org.springframework.stereotype.Service;

@Service
public class AccountService {
    public void transfer(){
        System.out.println("银行账户转账....");
    }
    public void withdraw(){
        System.out.println("正在取款...");
    }
}

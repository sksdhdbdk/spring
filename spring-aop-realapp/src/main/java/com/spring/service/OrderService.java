package com.spring.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public void generate(){
        System.out.println("生成订单....");
    }
    public void cancel(){
        System.out.println("订单已取消....");
    }
}

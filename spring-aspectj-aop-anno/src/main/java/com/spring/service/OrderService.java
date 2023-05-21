package com.spring.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public void generate(){
        System.out.println("生成订单....");
        /*if (1==1){
            throw new RuntimeException("运行时异常");
        }*/
    }
}

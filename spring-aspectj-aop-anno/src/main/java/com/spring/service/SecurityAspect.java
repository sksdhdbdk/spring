package com.spring.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)//给切面排序
public class SecurityAspect {
    @Before("com.spring.service.LogAspect.pointCut()")
    public void before(){
        System.out.println("安全前置通知");
    }
}

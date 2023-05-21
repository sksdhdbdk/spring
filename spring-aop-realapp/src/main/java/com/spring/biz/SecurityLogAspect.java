package com.spring.biz;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
@Component
@Aspect
public class SecurityLogAspect {
    @Before("execution(* com.spring.biz..*(..))")
    public void beforeAdvice(JoinPoint joinPoint){
        SimpleDateFormat format = new SimpleDateFormat();
        String now = format.format(new Date());
        System.out.println(now+"tom:"+joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());
    }
}

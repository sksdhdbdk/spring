package com.spring.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect//切面类用该标注
@Order(2)
public class LogAspect {//切面,=通知+连接点
        //通知就是具体的增强代码
    @Pointcut("execution(* com.spring.service..*(..))")
    public void pointCut(){
        //定义通用表达式

    }
    @Before("pointCut()")
    public void BeforeAdvice(JoinPoint joinPoint){
        System.out.println("前置通知");
        /*Signature signature = joinPoint.getSignature();获取方法签名*/
        //获取方法名
        System.out.println("目标方法的方法名"+joinPoint.getSignature().getName());
    }
    @AfterReturning("pointCut()")
    public void afterReturningAdvice(){
        System.out.println("后置通知");
    }
    @Around("pointCut()")
    //环绕范围最大
    public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("前环绕");
        joinPoint.proceed();
        System.out.println("后环绕");

    }

    @AfterThrowing("pointCut()")
    public void AfterThrowing(){
        System.out.println("异常通知");
    }

    @After("pointCut()")
    public void AfterAdvice(){
        System.out.println("最终通知");
    }

}

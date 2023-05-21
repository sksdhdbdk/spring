package com.spring.proxy.service;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class TimerMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        long begin = System.currentTimeMillis();
        Object retValue = proxy.invokeSuper(obj, args);
        long after=System.currentTimeMillis();
        System.out.println("耗时"+(begin-after)+"毫秒");
        return retValue;
    }
}

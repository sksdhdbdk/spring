package com.spring.proxy.util;

import com.spring.proxy.service.OrderService;
import com.spring.proxy.service.TimerInvocationHandler;

import java.lang.reflect.Proxy;

public class proxyUtil {
    public static Object newProxyInstance(Object target){
        return  Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new TimerInvocationHandler(target));


    }
}

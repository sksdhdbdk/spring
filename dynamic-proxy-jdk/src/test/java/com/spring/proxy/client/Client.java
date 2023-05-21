package com.spring.proxy.client;

import com.spring.proxy.service.OrderService;
import com.spring.proxy.service.OrderServiceImpl;
import com.spring.proxy.service.TimerInvocationHandler;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        OrderService orderService=new OrderServiceImpl();
        OrderService orderService1 = (OrderService) Proxy.newProxyInstance(orderService.getClass().getClassLoader(), orderService.getClass().getInterfaces(), new TimerInvocationHandler(orderService));
        orderService1.getName();


    }

}

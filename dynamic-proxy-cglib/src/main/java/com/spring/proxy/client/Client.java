package com.spring.proxy.client;

import com.spring.proxy.service.TimerMethodInterceptor;
import com.spring.proxy.service.UserService;
import org.springframework.cglib.proxy.Enhancer;

public class Client {
    public static void main(String[] args) {
        //创建字节码增强器对象
        //这是cglib的核心对象,用它生成代理类
        Enhancer enhancer=new Enhancer();

        //告诉cglib父类和目标类
        enhancer.setSuperclass(UserService.class);
        //设置回调,相当于invocationHandler
        enhancer.setCallback(new TimerMethodInterceptor());
        //创建代理对象
        UserService userService = (UserService) enhancer.create();

        boolean success = userService.login("admin", "123");
        System.out.println(success ? "登录成功":"登录失败");
        userService.logout();
    }

}

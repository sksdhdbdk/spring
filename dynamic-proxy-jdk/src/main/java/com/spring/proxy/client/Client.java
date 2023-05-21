package com.spring.proxy.client;

import com.spring.proxy.service.OrderService;
import com.spring.proxy.service.OrderServiceImpl;
import com.spring.proxy.service.TimerInvocationHandler;
import com.spring.proxy.util.proxyUtil;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        //创建目标对象
        OrderService target=new OrderServiceImpl();
        //创建代理对象
        /*newProxyInstance():创建代理对象
        1:在内存中动态的生成了一个代理类字节码class
        2:new对象了,通过内存中生成的代理类实例化代理对象

        newProxyInstance()参数
            ClassLoader loader
                类加载器,目标类的类加载器和代理类加载器使用同一个
            Class<?>[] interfaces
                代理类和目标类实现同一个或同一些接口
            InvocationHandler h
                调用处理器,在调用处理器接口写增强代码
                是接口就要写接口的实现类

            代理对象和目标对象实现的接口一样,可以向下转型
        * */
        /*OrderService proxyObj =(OrderService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                                                 target.getClass().getInterfaces(),
                                                   new TimerInvocationHandler(target));*/
        OrderService proxyObj = (OrderService) proxyUtil.newProxyInstance(target);
        //调用代理对象的代理方法
        proxyObj.generate();
        proxyObj.modify();
        proxyObj.detail();
        String name = proxyObj.getName();
        System.out.println(name);
    }
}

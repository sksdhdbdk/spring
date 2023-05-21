package com.spring.reflect;

import com.spring.reflect.SomeService;

public class Test {
    public static void main(String[] args) {
        //不使用反射机制
        SomeService someService = new SomeService();
        someService.doSome();
        /*调用方法四要素:
        * 第一:调用哪个对象
        * 第二:调用哪个方法
        * 第三:调方法传什么参数
        * 第四:方法结束返回什么结果*/
        String s1=someService.doSome("张三");
        System.out.println(s1);
        String s2=someService.doSome("李四",250);
        System.out.println(s2);
    }
}

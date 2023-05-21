package com.spring.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test2 {
    public static void main(String[] args) throws Exception{
        //获取类
        Class<?> clazz = Class.forName("com.spring.reflect.SomeService");
        //获取方法
        Method doSome = clazz.getDeclaredMethod("doSome", String.class, int.class);
        //调用方法
        Object o = clazz.newInstance();
        Object o1 = doSome.invoke(o, "李四", 250);
        System.out.println(o1);


    }
}

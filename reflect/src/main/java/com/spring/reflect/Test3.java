package com.spring.reflect;

import java.lang.reflect.Method;

public class Test3 {
    public static void main(String[] args) throws Exception{
        Class<?> aClass = Class.forName("com.spring.reflect.SomeService");
        Method doSome = aClass.getDeclaredMethod("doSome");
        Object o = aClass.newInstance();
        doSome.invoke(o);
    }

}

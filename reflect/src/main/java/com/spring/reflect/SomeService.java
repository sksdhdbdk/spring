package com.spring.reflect;

public class SomeService {
    public void doSome(){
        System.out.println("执行public void doSome()");
    }
    public String doSome(String s){
        System.out.println("执行public String doSome(String s)");
        return s;
    }
    public String doSome(String s,int i){
        System.out.println("执行public String doSome(String s,int i)");
        return s+i;
    }
}

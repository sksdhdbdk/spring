package com.spring.proxy.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimerInvocationHandler implements InvocationHandler {
    private Object target;
    public TimerInvocationHandler(Object target) {
        this.target=target;
    }
    /*实现 InvocationHandler接口后必须调用invoke(),jdk在底层已经写好了调用invoke的程序
    *代理对象调用代理方法时,InvocationHandler的invoke()被调用 */
    
    /*invoke()的三个参数
    * Object proxy 代理对象的引用,使用较少
    * Method method 目标对象的目标方法(要执行的方法)
    * Object[] args 目标方法的实参
    *
    * invoke执行过程中,使用method调用目标对象的目标方法*/
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        /*System.out.println("增强1");*/
        long begin = System.currentTimeMillis();
        //调用目标对象的目标方法
        Object retValue = method.invoke(target,args);
        /*System.out.println("增强2");*/
        long end=System.currentTimeMillis();
        System.out.println("耗时"+(end-begin)+"毫秒");
        return retValue;
    }
}

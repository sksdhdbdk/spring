package com.spring.demo01;

public class Client {
    public static void main(String[] args) {
        //房东租房子
        Host1 host=new Host1();
        //代理,中介帮房东租房子,代理角色一般会有一些附属操作
        Proxy proxy = new Proxy(host);

        proxy.rent();
    }
}

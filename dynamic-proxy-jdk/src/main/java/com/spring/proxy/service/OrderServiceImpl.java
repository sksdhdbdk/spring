package com.spring.proxy.service;

public class OrderServiceImpl implements OrderService{
    @Override
    public String getName() {
        System.out.println("getName()执行");
        return "张三";
    }

    @Override
    public void generate() {
        try {
            Thread.sleep(1234);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("订单已生成");
    }

    @Override
    public void modify() {
        try {
            Thread.sleep(424);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("订单已修改");
    }

    @Override
    public void detail() {
        try {
            Thread.sleep(442);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("订单已查询");
    }
}

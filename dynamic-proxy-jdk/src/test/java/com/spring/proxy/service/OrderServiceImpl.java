package com.spring.proxy.service;

public class OrderServiceImpl implements OrderService{
    @Override
    public String getName() {
        System.out.println("getName()");
        return "tom";
    }

    @Override
    public void generate() {
        try {
            Thread.sleep(123);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("generate()");
    }

    @Override
    public void modify() {
        try {
            Thread.sleep(123);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("modify()");
    }

    @Override
    public void detail() {
        try {
            Thread.sleep(123);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("detail()");
    }
    }


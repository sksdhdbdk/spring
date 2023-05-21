package com.Spring.bean;

import org.springframework.beans.factory.FactoryBean;
//工厂Bean,可以获取一个普通Bean
public class PersonFactoryBean implements FactoryBean<Person>{
    @Override
    public Person getObject() throws Exception {
        return new Person();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    //默认返回true,标识单例
    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}

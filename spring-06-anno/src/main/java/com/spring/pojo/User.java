package com.spring.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
//等价于<bean id="user" class="com.spring.pojo.User"/>
public class User {
    @Value("tom")
    public String name;
}

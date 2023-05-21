package com.spring.test;

import com.spring.service.OrderService;
import com.spring.service.UserService;
import com.spring.service.springConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class aopTest {
    @Test
    public void testBefore(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
       /* UserService userService = context.getBean("userService", UserService.class);
        userService.login();
        userService.logout();*/

        OrderService orderService = context.getBean("orderService", OrderService.class);
        orderService.generate();
    }
    @Test
    public void TestNoXml(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(springConfig.class);
        OrderService orderService = context.getBean("orderService", OrderService.class);
        orderService.generate();
    }
}

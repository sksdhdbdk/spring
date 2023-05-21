package com.bank;

import com.bank.service.AccounntService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SMTest {
    @Test
    public void testSM(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        AccounntService accountService = context.getBean("accountService", AccounntService.class);
        try {
            accountService.transfer("act_001","act_002",10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

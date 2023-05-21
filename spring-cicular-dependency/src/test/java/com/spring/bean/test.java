package com.spring.bean;

import com.spring.bean.Husband;
import com.spring.bean.Wife;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Husband husband=context.getBean("husbandBean", Husband.class);
        System.out.println(husband);
        Wife wife = context.getBean("wifeBean", Wife.class);
        System.out.println(wife);

    }
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
        Husband husband=context.getBean("h", Husband.class);
        System.out.println(husband);
        Wife wife = context.getBean("w", Wife.class);
        System.out.println(wife);
    }
}

import com.spring.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class test {
    @Autowired
    private User user;
    @Test
    public void testUser1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.getName());
    }

    @Test
    public void testUser2(){
       /* ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        User user = context.getBean("user", User.class);*/
        System.out.println(user.getName());
    }
}

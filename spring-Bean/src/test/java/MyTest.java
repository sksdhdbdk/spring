import com.Spring.bean.Gun;
import com.Spring.bean.Person;
import com.Spring.bean.Star;
import com.Spring.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Star star = context.getBean("star", Star.class);
        System.out.println(star);
    }
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Gun gun = context.getBean("gun", Gun.class);
        System.out.println(gun);
    }
    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }

    @Test
    public void testDate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }
}

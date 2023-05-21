import com.spring.bean.Student;
import com.spring.bean.User;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void testBeanLifecycle(){
        /*spring容器只负责对singleton的bean进行完整的生命周期
        * 如果是prototype作用域的bean,spring容器之负责将该bean初始化完毕.客户端接收到该bean后,则spring容器就不再管理该bean的生命周期*/
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        User user = context.getBean("user", User.class);
        System.out.println("第四步:使用bean:"+user);
        //必须手动关闭spring容器,spring容器才会销毁bean
        context.close();
    }
    @Test
    public void testRegisterBean(){
        Student student=new Student();
        System.out.println(student);
        //将自己new的对象纳入spring管理
        DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
        factory.registerSingleton("studentBean",student);
        //从spring容器中获取
        Object studentBean = factory.getBean("studentBean");
        System.out.println(studentBean);
    }
}

import com.spring.biz.UserService;
import com.spring.biz.VipService;
import com.spring.service.AccountService;
import com.spring.service.OrderService;
import com.spring.service.spring;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
    @Test
    public void testTransaction(){
        ApplicationContext context = new AnnotationConfigApplicationContext(spring.class);
        AccountService account = context.getBean("accountService", AccountService.class);
        account.transfer();

        OrderService orderService = context.getBean("orderService", OrderService.class);
        orderService.generate();
    }
    @Test
    public void testSecurity(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.spring.biz.spring.class);
        UserService userService = context.getBean("userService", UserService.class);
        VipService vipService = context.getBean("vipService", VipService.class);
        userService.saveUser();
        vipService.saveVip();
    }
}

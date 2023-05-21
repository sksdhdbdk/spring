import com.bank.pojo.Account;
import com.bank.service.AccountService;
import com.bank.service.impl.isolationService1;
import com.bank.service.impl.isolationService2;
import com.bank.service.impl.isolationService3;
import com.bank.service.impl.isolationService4;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

public class test {
    @Test
    public void testPropagation(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountService = context.getBean("accountService", AccountService.class);
        Account act=new Account("act_005",1000.0);
        accountService.save(act);

    }
    @Test
    public void testSpringTx(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountService = context.getBean("accountService", AccountService.class);
        try {
            accountService.transfer("act_001","act_002",10000);
            System.out.println("转账成功");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testIsolation1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        isolationService1 isolationService1 = context.getBean("isolationService1", isolationService1.class);
        isolationService1.getByActNo("act_004");
    }

    @Test
    public void testIsolation2() throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        isolationService2 isolationService2 = context.getBean("isolationService2", isolationService2.class);
        isolationService2.save(new Account("act_005",1000.0));

    }
    @Test
    public void testIsolation3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        isolationService3 isolationService3 = context.getBean("isolationService3", isolationService3.class);
        isolationService3.up("act_004",2000.0);

    }
    @Test
    public void testIsolation4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        isolationService4 isolationService4 = context.getBean("isolationService4", isolationService4.class);
        List<Account> list = isolationService4.GetAllAct();

    }
}

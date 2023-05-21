package com.bank.service.impl;

import com.bank.dao.AccountDao;
import com.bank.pojo.Account;
import com.bank.service.AccountService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
//@Transactional
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Resource(name = "accountDao")
    private AccountDao accountDao;
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public void transfer(String fromActno, String toActno, double money) {
        //1.开启事务
        //2.执行核心业务逻辑
        //查询转出账户余额
        Account fromAct = accountDao.selectByActno(fromActno);
        if (fromAct.getBalance()<money){
            throw new RuntimeException("余额不足!!");
        }
        //余额充足
        Account toAct = accountDao.selectByActno(toActno);
        //修改内存中两个对象的余额
        fromAct.setBalance(fromAct.getBalance()-money);
        toAct.setBalance(toAct.getBalance()+money);
        //更新数据库
        int count = accountDao.update(fromAct);
        //模拟异常
       /* String s=null;
        s.toString();*/
        count += accountDao.update(toAct);

        if (count != 2) {
            throw new RuntimeException("转账失败!!");
        }
        //3.提交事务
        //4.遇到异常回滚事务
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void withdraw(){}
    @Resource(name = "accountService2")
    private AccountService accountService;
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void save(Account act) {
        accountDao.insert(act);
       /* Account act2=new Account("act_004",1000.0);
        accountService.save(act2);
*/
    }
}

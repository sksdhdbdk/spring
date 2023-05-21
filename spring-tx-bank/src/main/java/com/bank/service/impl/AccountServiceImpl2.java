package com.bank.service.impl;

import com.bank.dao.AccountDao;
import com.bank.pojo.Account;
import com.bank.service.AccountService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("accountService2")
public class AccountServiceImpl2 implements AccountService {
    @Resource(name = "accountDao")
    private AccountDao accountDao;
    @Override
    public void transfer(String fromActno, String toActno, double money) {

    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void save(Account act) {
        accountDao.insert(act);
        /*String s=null;
        s.toString();*/

    }
}

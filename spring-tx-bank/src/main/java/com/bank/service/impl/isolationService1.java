package com.bank.service.impl;

import com.bank.dao.AccountDao;
import com.bank.pojo.Account;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class isolationService1 {
    @Resource(name = "accountDao")
    private AccountDao accountDao;
    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public void getByActNo(String actno){
        Account account=accountDao.selectByActno(actno);
        System.out.println("账户信息"+account);
        try {
            Thread.sleep(1000*10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Account account2=accountDao.selectByActno(actno);
        System.out.println("账户信息"+account2);
    }
}

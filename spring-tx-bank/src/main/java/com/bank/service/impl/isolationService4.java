package com.bank.service.impl;

import com.bank.dao.AccountDao;
import com.bank.pojo.Account;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class isolationService4 {
    @Resource(name = "accountDao")
    private AccountDao accountDao;
    @Transactional(isolation = Isolation.SERIALIZABLE,readOnly = true)
    public List<Account> GetAllAct() {
        List<Account> list = accountDao.selectAllActno();
        System.out.println(list);

        try {
            Thread.sleep(1000*10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        List<Account> list1 = accountDao.selectAllActno();
        System.out.println(list1);
        return null;

    }


}

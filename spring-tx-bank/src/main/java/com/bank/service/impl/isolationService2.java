package com.bank.service.impl;

import com.bank.dao.AccountDao;
import com.bank.pojo.Account;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

@Service
public class isolationService2 {
    @Resource(name = "accountDao")
    private AccountDao accountDao;

    @Transactional(timeout = 10,noRollbackFor = RuntimeException.class)
    public void save(Account act) throws IOException {
        accountDao.insert(act);
        /*try {
            Thread.sleep(1000*15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

       /* if (1==1){
            *//*throw new IOException();*//*
            throw new RuntimeException();
        }*/
        System.out.println("保存成功");

    }
}

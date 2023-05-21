package com.bank.service.impl;

import com.bank.dao.AccountDao;
import com.bank.pojo.Account;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class isolationService3 {
    @Resource(name = "accountDao")
    private AccountDao accountDao;
    @Transactional
    public void up(String actno,  double money){
        Account act=new Account();
        act.setActno(actno);
        act.setBalance(money);
        accountDao.update(act);
        System.out.println("修改成功");

    }

}

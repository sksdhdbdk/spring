package com.bank.service;

import com.bank.pojo.Account;

public interface AccountService {
    void transfer(String fromActno,String toActno,double money);

    void save(Account act);
}

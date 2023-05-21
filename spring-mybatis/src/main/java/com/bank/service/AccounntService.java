package com.bank.service;

import com.bank.pojo.Account;

import java.util.List;

public interface  AccounntService {
    int save(Account account);
    int deleteByActno(String actno);
    int modify(Account account);
    Account getByActno(String actno);
    List<Account> getAll();
    void transfer(String fromActno,String toActno,double money);


}

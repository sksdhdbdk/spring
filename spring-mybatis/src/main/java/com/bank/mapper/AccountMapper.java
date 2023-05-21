package com.bank.mapper;

import com.bank.pojo.Account;

import java.util.List;

public interface AccountMapper {//mybatis会通过动态代理类生成实现类
    int insert(Account account);
    int deleteByActno(String Actno);
    int update(Account account);
    Account selectByActno(String Actno);
    List<Account> selectAll();
}

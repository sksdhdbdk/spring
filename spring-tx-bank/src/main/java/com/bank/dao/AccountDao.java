package com.bank.dao;

import com.bank.pojo.Account;

import java.util.List;

public interface AccountDao {
    Account selectByActno(String actno);

    int update(Account act);

    int insert(Account act);

    List<Account> selectAllActno();


}

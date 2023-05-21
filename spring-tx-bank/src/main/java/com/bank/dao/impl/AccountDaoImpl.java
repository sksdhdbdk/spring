package com.bank.dao.impl;

import com.bank.dao.AccountDao;
import com.bank.pojo.Account;
import jakarta.annotation.Resource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.Collections;
import java.util.List;

@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {
    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;
    @Override
    public Account selectByActno(String actno) {
        String sql="select actno,balance from t_act where actno=?";
        Account account = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Account.class), actno);
        return account;
    }

    @Override
    public int update(Account act) {
        String sql="update t_act set balance = ? where actno = ?";
        int count = jdbcTemplate.update(sql, act.getBalance(), act.getActno());
        return count;
    }

    @Override
    public int insert(Account act) {
        String sql="insert into t_act values (?,?)";
        return jdbcTemplate.update(sql,act.getActno(),act.getBalance());
    }

    @Override
    public List<Account> selectAllActno() {
        String sql="select * from t_act";
        List<Account> accounts=jdbcTemplate.query(sql, new BeanPropertyRowMapper<Account>(Account.class));
        return accounts;
    }


}

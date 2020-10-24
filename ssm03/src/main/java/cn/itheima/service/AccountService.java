package cn.itheima.service;

import cn.itheima.domain.Account;

import java.util.List;

public interface AccountService {
    //查询所有
    public List<Account> findAll();

    //添加
    public void saveAccount(Account account);
}

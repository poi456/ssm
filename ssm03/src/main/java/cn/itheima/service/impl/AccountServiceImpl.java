package cn.itheima.service.impl;

import cn.itheima.domain.Account;
import cn.itheima.dao.AccountDao;
import cn.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountDao accountDao;
    @Override
    public List<Account> findAll() {
        System.out.println("业务成跑一下子查询");

        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层添加");

        accountDao.saveAccount(account);
    }
}

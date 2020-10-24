package cn.itheima.dao;

import cn.itheima.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountDao {
    //    写两个方法查询跟添加
    //查询所有
    @Select("select * from account")
    public List<Account> findAll();

    //添加
    @Insert("insert into account(name,money) values(#{name},#{money})")
    public void saveAccount(Account account);
}


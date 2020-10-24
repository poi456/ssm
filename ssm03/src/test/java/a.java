import cn.itheima.dao.AccountDao;
import cn.itheima.domain.Account;
import cn.itheima.service.AccountService;
import cn.itheima.service.impl.AccountServiceImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class a {
    @Test
    public void select() throws Exception {
        //找导配置文件
        InputStream in = Resources.getResourceAsStream("mybatis.xml");
        //创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        AccountDao mapper = session.getMapper(AccountDao.class);
        List<Account> all = mapper.findAll();
        for (Account a:all){
            System.out.println(a);
        }
        session.close();
        in.close();
    }
    @Test
    public void insert() throws Exception {
        Account account=new Account();
        account.setId(5);
        account.setName("小强");
        account.setMoney(123.1);
        //找到配置文件
        InputStream in = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        AccountDao mapper = session.getMapper(AccountDao.class);
        mapper.saveAccount(account);
        session.commit();
        session.close();
        in.close();
    }
    @Test
    public void ss() throws IOException {
        //找到xml文件
     ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService as = (AccountService)ac.getBean("accountService");
        as.findAll();
    }


}

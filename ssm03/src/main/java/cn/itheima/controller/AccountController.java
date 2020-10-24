package cn.itheima.controller;

import cn.itheima.domain.Account;
import cn.itheima.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("account")
public class AccountController {
    //依赖注入一下子通过注解
    @Autowired
    private AccountService accountService;
    @RequestMapping("finAll")
    public String cc(Model model){
        System.out.println("springmvc 前端");
        List<Account> all = accountService.findAll();
        model.addAttribute("list",all);
        return "list";
    }

    @RequestMapping("insert")
    public String cca(Account account){
        System.out.println("springmvc 前端");
        accountService.saveAccount(account);
        System.out.println("添加成功");
        return "list";
    }
}

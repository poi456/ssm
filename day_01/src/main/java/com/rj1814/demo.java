package com.rj1814;

import com.pojo.Account;
import com.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/demo")
public class demo {
    @RequestMapping("/de")
    public String de(String name){
        System.out.println(name);
        return "filea";
    }

    @RequestMapping(value = "demo1",method = {RequestMethod.POST})
    public String dem(User user){
        System.out.println(user);
        return "filea";
    }

    @RequestMapping(value = "demo2",method = {RequestMethod.POST})
    public String demo2(Account account){
        System.out.println(account);
        return "filea";
    }
}

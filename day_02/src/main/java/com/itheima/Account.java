package com.itheima;

import com.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class Account {
    @RequestMapping("/demo1")
    public String account(Model model){
        User user=new User();
        user.setName("小王");
        user.setAge("19");
        user.setMony(16);
        model.addAttribute("user",user);
        return "success";
    }

    @RequestMapping("/demo2")
    public @ResponseBody User account1(@RequestBody User user){
        System.out.println(user);
        return user;
    }
}

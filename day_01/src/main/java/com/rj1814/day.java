package com.rj1814;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/day")
public class day {
    @RequestMapping(value = "/day1",method = {RequestMethod.POST})
    public String day(){
        System.out.println("小王");
        return "filea";
    }
}

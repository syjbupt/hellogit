package com.syj.risk.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * Created by sunyijia on 16/2/28.
 */
@Controller
public class HelloController {

    @RequestMapping({"/hello", "/"})
    public String hello(String username, Model model){
        System.out.println("hello,");
        System.out.println(username);
        model.addAttribute("name", username);
        return "hello";
    }

    @RequestMapping("/welcome2")
    public String welcome(){
        System.out.println("welcome-patern-2");
        return "welcome2";
    }
}

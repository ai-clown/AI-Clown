package com.hd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "/index";
    }
    @RequestMapping("/login")
    public String login(){
        return "/index";
    }


}

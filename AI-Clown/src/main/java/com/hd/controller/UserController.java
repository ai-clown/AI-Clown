package com.hd.controller;

import com.hd.entity.User;
import com.hd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestParam("userName")String userName,
                        @RequestParam("password")String password, HttpServletResponse response){
        User user=userService.findUserByUserName(userName);
        if (user.getPassword().equals(password)){
            Cookie cookie=new Cookie("userName",userName);
            response.addCookie(cookie);
            return "redirect:/user/index";
        }
        return "redirect:/user/toLogin";
    }


}

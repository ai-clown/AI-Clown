package com.hd.handle;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserHandleConfig implements HandlerInterceptor{
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Cookie[] cookies=request.getCookies();
        if(cookies!=null){
            for (Cookie cookie :cookies) {
                if(cookie.getName().equals("userName")){
                    System.out.println(cookie.getValue());
                    request.getSession().setAttribute("userName",cookie.getValue());
                    return true;
                }
            }
        }
        request.setAttribute("msg","请登录!");
        request.getRequestDispatcher("/").forward(request,response);
        return false;
    }
}

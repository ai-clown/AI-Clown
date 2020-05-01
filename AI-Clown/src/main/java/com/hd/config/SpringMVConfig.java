package com.hd.config;


import com.hd.handle.UserHandleConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpringMVConfig {
    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
         WebMvcConfigurer webMvcConfigurer=new WebMvcConfigurer() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("Login");
                registry.addViewController("/user/toLogin").setViewName("Login");
                registry.addViewController("/user/index").setViewName("index");
            }
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(new UserHandleConfig()).addPathPatterns("**").excludePathPatterns("/","/user/toLogin","/user/login");
             }
         };
         return webMvcConfigurer;
    }
}

package com.joe.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 如果你请求的地址是 /api/oldLogin 则跳转到 /api/login
 */
@Component
public class OldLoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("OldLoginInterceptor-prehandle-进入");
        System.out.println("OldLoginInterceptor-prehandle-请求uri:"+request.getRequestURI());
        response.sendRedirect("/api/login");

        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("OldLoginInterceptor-postHandle-进入");
        System.out.println("OldLoginInterceptor-postHandle-请求uri:"+request.getRequestURI());
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("OldLoginInterceptor-afterCompletion-进入");
        System.out.println("OldLoginInterceptor-afterCompletion-请求uri:"+request.getRequestURI());
    }
}

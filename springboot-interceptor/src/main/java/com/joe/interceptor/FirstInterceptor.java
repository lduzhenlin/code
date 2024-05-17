package com.joe.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class FirstInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("FirstInterceptor-prehandle-进入");
        System.out.println("FirstInterceptor-prehandle-请求uri:"+request.getRequestURI());
        request.setAttribute("start",System.currentTimeMillis());

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("FirstInterceptor-postHandle-进入");
        System.out.println("FirstInterceptor-postHandle-请求uri:"+request.getRequestURI());

        Long start= (Long) request.getAttribute("start");
        Long end=System.currentTimeMillis();
        System.out.println("请求执行时间："+(end-start));
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
        System.out.println("FirstInterceptor-afterCompletion-进入");

    }
}

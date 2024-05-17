package com.joe.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class FirstFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);

        System.out.println("初始化firstFilter.............");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //执行之前进行的操作
        HttpServletRequest request=(HttpServletRequest) servletRequest;
        String uri=request.getRequestURI();
        System.out.println("firstFilter请求之前，请求uri:"+uri);
        Long start=System.currentTimeMillis();

//        servletResponse.getWriter().println("exit");

        //执行用户请求
        filterChain.doFilter(servletRequest,servletResponse);

        //执行完请求之后进行的操作

        Long end=System.currentTimeMillis();
        System.out.println("firstFilter请求之后，请求执行时间："+(end-start));

    }

    @Override
    public void destroy() {
        Filter.super.destroy();

        System.out.println("销毁过滤器.................");
    }
}

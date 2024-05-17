package com.joe.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.tomcat.util.http.ResponseUtil;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@WebFilter(filterName = "secondFilter",urlPatterns = "/api/*")
public class SecondFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
        System.out.println("初始化secondFilter。。。。。");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("secondFilter请求之前");

        filterChain.doFilter(servletRequest,servletResponse);

        System.out.println("secondFilter请求之后");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();

        System.out.println("secondFilter销毁。。。。。");
    }
}

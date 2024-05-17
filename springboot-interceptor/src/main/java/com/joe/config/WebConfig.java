package com.joe.config;

import com.joe.interceptor.FirstInterceptor;
import com.joe.interceptor.OldLoginInterceptor;
import com.joe.interceptor.SecondInterceptor;
import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Data
@Component
public class WebConfig implements WebMvcConfigurer {

    private final FirstInterceptor firstInterceptor;
    private final SecondInterceptor secondInterceptor;
    private final OldLoginInterceptor oldLoginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(firstInterceptor).addPathPatterns("/api/*");
        registry.addInterceptor(secondInterceptor).addPathPatterns("/api/*");
        registry.addInterceptor(oldLoginInterceptor).addPathPatterns("/api/oldLogin");
    }
}

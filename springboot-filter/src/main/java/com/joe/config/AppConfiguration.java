package com.joe.config;

import com.joe.filter.FirstFilter;
import jakarta.servlet.FilterRegistration;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class AppConfiguration {

    private final FirstFilter firstFilter;


    @Bean
    public FilterRegistrationBean firstFilter1(){
        FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean();
        filterRegistrationBean.setFilter(firstFilter);
        filterRegistrationBean.addUrlPatterns("/api/*");

        return filterRegistrationBean;
    }


}

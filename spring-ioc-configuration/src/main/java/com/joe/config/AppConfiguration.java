package com.joe.config;

import com.joe.service.OrderDao;
import com.joe.service.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * appliction.xml 文件
 */
@Configuration
public class AppConfiguration {


    @Bean
    public OrderDao orderDao(){
        return new OrderDao();
    }


    @Bean
    public OrderService orderService(OrderDao orderDao){
        return new OrderService(orderDao);
    }
}

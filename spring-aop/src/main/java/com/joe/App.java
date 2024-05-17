package com.joe;

import com.joe.service.OrderService;
import com.joe.test.TestService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext("com.joe");
        OrderService orderService=context.getBean(OrderService.class);
        orderService.print();


//        TestService testService=context.getBean(TestService.class);
//        testService.pirnt();
    }
}

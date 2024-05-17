package com.joe;

import com.joe.order.OrderService;
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
        System.out.println( "Hello World!" );


        ApplicationContext context=new AnnotationConfigApplicationContext("com.joe");
        OrderService orderService=context.getBean("orderService",OrderService.class);
        orderService.print();
    }
}

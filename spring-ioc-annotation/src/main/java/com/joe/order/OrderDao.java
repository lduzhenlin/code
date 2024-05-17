package com.joe.order;

import org.springframework.stereotype.Repository;

//OrderDao orderDao=new OrderDao()
@Repository
public class OrderDao {

    public void print(){
        System.out.println("打印订单。。。。");
    }
}

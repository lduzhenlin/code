package com.joe.service;

public class OrderService {

    private OrderDao orderDao;

    public OrderService(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void print(){
        orderDao.print();
    }
}

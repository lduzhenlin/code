package com.joe.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public void print(){
        System.out.println("打印订单。。。。。");

    }

    public void print1(){
        System.out.println("打印订单1。。。。。");

    }

    public void saveLog(){
        System.out.println("保存订单日志。。。");
    }
}

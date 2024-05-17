package com.joe.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {


    @RequestMapping("/hello")
    public Object hello() throws InterruptedException {
        Thread.sleep(2000);

        return "hello";
    }

    @RequestMapping("/login")
    public Object login()  {


        return "login page";
    }

    @RequestMapping("/oldLogin")
    public Object oldLogin() {

        return "oldLogin page";
    }
}

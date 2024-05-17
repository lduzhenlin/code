package com.joe.instance;

public class StaticFactoryMethodService {

    private static StaticFactoryMethodService staticFactoryMethodService=new StaticFactoryMethodService();

    public static StaticFactoryMethodService createInstance(){
        return staticFactoryMethodService;
    }

    public void print(){
        System.out.println("通过静态工厂方法方式创建实例");
    }


}

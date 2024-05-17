package com.joe;

import com.joe.di.constructor.Example;
import com.joe.di.constructor.Thing;
import com.joe.di.setter.ExampleBean;
import com.joe.instance.ConstructorService;
import com.joe.instance.InstanceFactoryMethodService;
import com.joe.instance.ObjService;
import com.joe.instance.StaticFactoryMethodService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        /**
         * IOC 控制反转
         * DI
         * 自己new一个对象 控制权是在你自己手里
         *
         * IOC控制反转 就是new一个对象不用你自己来new，创建对象的过程由spring 来进行创建，你只需要使用即可
         *
         */


        /**
         * 通过构造函数进行实例化
         */
        ApplicationContext  context=new ClassPathXmlApplicationContext("application.xml");
        ConstructorService constructorService=context.getBean("constructorService", ConstructorService.class);
        constructorService.pirnt();

        /**
         * 通过静态工厂方法方式创建实例
         */
        StaticFactoryMethodService staticFactoryMethodService= context.getBean("staticFactoryMethodService", StaticFactoryMethodService.class);
        staticFactoryMethodService.print();

        /**
         * 通过实例工厂方法方式创建实例
         */
        ObjService objService=context.getBean("objService", ObjService.class);
        objService.print();


        /**
         * 依赖注入
         */

        System.out.println("------------------通过构造器进行依赖注入-------------------");
        Example example=context.getBean("example",Example.class);
        System.out.println(example.getName());

        Thing thing=context.getBean("thing", Thing.class);
        System.out.println(thing.toString());

        System.out.println("-------------------通过setter方式进行依赖注入-------------------");
        ExampleBean exampleBean=context.getBean("exampleBean", ExampleBean.class);
        System.out.println(exampleBean.toString());
    }
}

package com.joe.aspect;


import com.joe.service.OrderService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 保存日志增强
 */

@Component
@Aspect
public class LogAdvice {

    /**
     *
     * jonit point :所有可以执行的方法
     *
     * point cut : 是符合定义了一些规则的方法
     *
     */

    @Pointcut("execution(* com.joe.service..*.*(..))")
    public void pointcut(){

    }

    @Before("pointcut()")
    public void beforeAdvice(){
        System.out.println("前置增强。。。。");
    }

    @AfterReturning("pointcut()")
    public void  afterReturn(){
        System.out.println("后置增强--正常返回");
    }

    @AfterThrowing("pointcut()")
    public void afterThrowing(){
        System.out.println("后置增强--异常返回");
    }

    @After("pointcut()")
    public void after(){
        System.out.println("后置增强--最终返回");
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("连接点之前----方法执行之前");

        Object obj=joinPoint.proceed();
        //OrderService.print()
        System.out.println("连接点之后----方法执行之后");

        return obj;
    }
}

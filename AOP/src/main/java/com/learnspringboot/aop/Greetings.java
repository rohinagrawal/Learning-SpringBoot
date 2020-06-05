package com.learnspringboot.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Greetings {

    @Before("execution(public void show())")
    public void hello(){
        System.out.println("Hello");
    }

    @After("execution(public void show())")
    public void bye(){
        System.out.println("Bye");
    }
}

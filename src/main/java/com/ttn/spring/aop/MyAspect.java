package com.ttn.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

    @Before("execution(public void display())")
       public void beforeAdvice(){
            System.out.println("Before");
        }

}

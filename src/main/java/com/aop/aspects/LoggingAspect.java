package com.aop.aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggingAspect {

//    @Before("execution(public String getName())")--->for all class
//    public void loggingAdvice(){
//        System.out.println("Logging Before-Advice has been called");
//    }

//    @Before("execution(public String com.aop.model.Triangle.getName())") //for particular class
//    public void loggingAdvice(){
//        System.out.println("Logging Before-Advice has been called");
//    }

    //Wildcards
//    @After("allGetters()")
//    public void loggingAdvice(JoinPoint joinPoint){
//      System.out.println("Logging Before-Advice has been called :" +joinPoint);
//        System.out.println(joinPoint.toString());
//      System.out.println(joinPoint.getTarget()+ " --- " +joinPoint.getSignature());
//
//        System.out.println("String arguments............");
//    }

//    @After("allGetters() && allCircleMethod()")
//    public void secondLoggingAdvice(){
//        System.out.println("Second Logging Before-Advice has been called");
//    }

//    @Before("allCircleMethod()")
//    public void thirdLoggingAdvice(){
//        System.out.println("Within Logging Before-Advice has been called");
//    }

    @Pointcut("execution(* get*())")
    public void allGetters() {
    }


    @Pointcut("within(com.aop.model.Circle)")
    public void allCircleMethod() {
    }


//    @Pointcut("args(name)")
//    public void stringArg(String name){
//        System.out.println("All String ..." +name);
//    }

//    @AfterReturning("args(name)")
//    public void afterReturning(String name){
//        System.out.println("After returning call...");
//    }

    @AfterReturning(pointcut = "args(name)", returning = "returnString")
    public void afterReturning(String name, String returnString) {
        System.out.println(name + " After returning call... " + returnString);
    }

    @AfterThrowing("args(name)")
    public void afterThrowing(String name) {
        System.out.println("After Throwing  call...");
    }
//
//    @Before("this(com.aop.model.Circle)")
//    public void argsThis(){
//        System.out.println("Args of circle method ...");
//    }

    @Before("bean(circle)")
    public void bean() {
        System.out.println("from bean point cut..");
    }


}

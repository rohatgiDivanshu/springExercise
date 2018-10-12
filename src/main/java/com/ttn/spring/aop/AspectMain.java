package com.ttn.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectMain {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-event-exercise.xml");

        AopDummy aspect = applicationContext.getBean(AopDummy.class);
        aspect.display();

    }
}

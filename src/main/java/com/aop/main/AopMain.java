package com.aop.main;

import com.aop.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        ShapeService shapeService = context.getBean(ShapeService.class);
//        shapeService.getCircle().setName("Divanshu");
//        shapeService.getCircle().strAndReturn("Divanshu");
        shapeService.getCircle().getName();
//        shapeService.getCircle().setName("D");
    }
}

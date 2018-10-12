package com.ttn.spring.com.ttn.spring.exercise_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-event-exercise.xml");

//        Database database = applicationContext.getBean(Database.class);
//        System.out.println(database);

        ((ClassPathXmlApplicationContext) applicationContext).start();


//        Database database = applicationContext.getBean(Database.class);
//        database.connect();



        ((ClassPathXmlApplicationContext) applicationContext).stop();
        ((ClassPathXmlApplicationContext) applicationContext).close();


    }

}

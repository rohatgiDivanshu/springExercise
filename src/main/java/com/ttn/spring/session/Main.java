package com.ttn.spring.session;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        /*Database database = applicationContext.getBean(Database.class);
        System.out.println(database);*/

        /*Complex complex = applicationContext.getBean(Complex.class);
        System.out.println(complex);*/

        Restaurant restaurant = applicationContext.getBean("teaRestaurant",Restaurant.class);
        Restaurant restaurant2 = applicationContext.getBean("expressTeaRestaurant",Restaurant.class);
//        Restaurant restaurant3 = applicationContext.getBean("restaurant",Restaurant.class);
//        restaurant3.getHotDrink().prepareDrink();

        restaurant.getHotDrink().prepareDrink();
        restaurant2.getHotDrink().prepareDrink();

        System.out.println(restaurant.equals(restaurant2));

    }

}

package com.ttn.spring.core;

import com.ttn.spring.events.DummyClass;
import com.ttn.spring.events.MyListener;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

//        Database database = applicationContext.getBean(Database.class);
//        System.out.println(database);

//        Complex complex = applicationContext.getBean(Complex.class);
//        System.out.println(complex);

//        Restaurant restaurant = applicationContext.getBean("teaRestaurant",Restaurant.class);
//        restaurant.getHotDrink().prepareDrink();
        Restaurant restaurant2 = applicationContext.getBean(Restaurant.class);
        restaurant2.getHotDrink().prepareDrink();
//        Restaurant restaurant3 = applicationContext.getBean("restaurant",Restaurant.class);
//        restaurant3.getHotDrink().prepareDrink();


//        System.out.println(restaurant.equals(restaurant2));

//            Restaurant restaurant = applicationContext.getBean(Restaurant.class);
//            restaurant.getHotDrink().prepareDrink();



//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
//        ((ClassPathXmlApplicationContext) applicationContext).start();

//        DummyClass dummyClass = applicationContext.getBean(DummyClass.class);
//        dummyClass.display();

//        ((ClassPathXmlApplicationContext) applicationContext).stop();
//        ((ClassPathXmlApplicationContext) applicationContext).close();

      //  MyListener myListener = applicationContext.getBean(MyListener.class);


    }

}

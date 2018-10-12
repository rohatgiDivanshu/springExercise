package com.ttn.spring.com.ttn.spring.exercise_1;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class DummyExercise implements ApplicationEventPublisherAware {

    ApplicationEventPublisher applicationEventPublisher;


    public void display(){

//        CustomEvent customEvent = new CustomEvent(this);
//        applicationEventPublisher.publishEvent(customEvent);
        System.out.println("Display Called");

    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}

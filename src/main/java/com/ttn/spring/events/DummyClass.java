package com.ttn.spring.events;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class DummyClass implements ApplicationEventPublisherAware {

    ApplicationEventPublisher applicationEventPublisher;

    public void display(){
        CustomListener event = new CustomListener(this);
        applicationEventPublisher.publishEvent(event);
        System.out.println("Display method called: >>>>>"+event);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}

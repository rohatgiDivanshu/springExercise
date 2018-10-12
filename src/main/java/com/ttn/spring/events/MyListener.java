package com.ttn.spring.events;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;

public class MyListener {

    @EventListener(ContextStartedEvent.class)
    void start(){
        System.out.println("Started");
    }

    @EventListener(ContextStoppedEvent.class)
    void stop(){

        System.out.println("Stopped");
    }
}

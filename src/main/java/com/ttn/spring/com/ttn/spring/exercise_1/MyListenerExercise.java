package com.ttn.spring.com.ttn.spring.exercise_1;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;

public class MyListenerExercise{

    @EventListener(ContextStartedEvent.class)
    void start(){
        System.out.println("Start");
    }

    @EventListener(ContextStoppedEvent.class)
    void stop(){
        System.out.println("Stopped");
    }


    @EventListener(ContextClosedEvent.class)
    void close(){
        System.out.println("Closed");
    }


}

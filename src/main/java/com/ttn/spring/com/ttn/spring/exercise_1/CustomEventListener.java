package com.ttn.spring.com.ttn.spring.exercise_1;

import org.springframework.context.ApplicationListener;

public class CustomEventListener implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println("Custom Event from exercise 1>>>"+event.getSource());
    }
}

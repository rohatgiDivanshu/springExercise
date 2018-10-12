package com.ttn.spring.events;

import org.springframework.context.ApplicationListener;

public class CustomEventListener implements ApplicationListener<CustomListener> {

    @Override
    public void onApplicationEvent(CustomListener event) {

        System.out.println("Custom Event: >>>>>"+event.getSource());
    }
}

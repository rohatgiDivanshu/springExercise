package com.ttn.spring.core;

import org.springframework.stereotype.Component;

@Component
public class Tea implements HotDrink {

    @Override
    public void prepareDrink() {
        System.out.println("Preparing tea");
    }
}

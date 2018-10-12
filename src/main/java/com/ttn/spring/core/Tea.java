package com.ttn.spring.core;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

//@Service
@Component
public class Tea implements HotDrink {

    @Override
    public void prepareDrink() {
        System.out.println("Preparing tea");
    }
}

package com.ttn.spring.core;

import org.springframework.stereotype.Component;

@Component
public class ExpressTea implements HotDrink {

    @Override
    public void prepareDrink() {
        System.out.println("Preparing ExpressTea");
    }
}

package com.ttn.spring.session;

public class Tea implements HotDrink {

    @Override
    public void prepareDrink() {
        System.out.println("Preparing tea");
    }
}

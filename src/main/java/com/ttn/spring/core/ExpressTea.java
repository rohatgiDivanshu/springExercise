package com.ttn.spring.core;

public class ExpressTea implements HotDrink {

    @Override
    public void prepareDrink() {
        System.out.println("Preparing ExpressTea");
    }
}

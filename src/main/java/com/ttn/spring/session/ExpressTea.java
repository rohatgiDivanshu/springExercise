package com.ttn.spring.session;

public class ExpressTea implements HotDrink {

    @Override
    public void prepareDrink() {
        System.out.println("Preparing ExpressTea");
    }
}

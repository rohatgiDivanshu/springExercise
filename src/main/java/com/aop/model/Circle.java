package com.aop.model;

import org.springframework.stereotype.Component;

@Component
public class Circle {


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Circle setter called");
//        throw(new RuntimeException());
    }

    public String strAndReturn(String name) {
        System.out.println("This is from strAndReturn method");
        return name;
    }
}

package com.divanshu.rest.rest.with.spring.entity;

public class StudentVersion2 {

    private Name name;

    public StudentVersion2(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
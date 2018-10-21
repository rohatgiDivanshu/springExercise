package com.aop.service;

import com.aop.model.Circle;
import com.aop.model.Triangle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShapeService {

    @Autowired
    private Circle circle;

    @Autowired
    private Triangle triangle;

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        System.out.println("This is Circle Setter");
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        System.out.println("This is Triangle Setter");
    }
}

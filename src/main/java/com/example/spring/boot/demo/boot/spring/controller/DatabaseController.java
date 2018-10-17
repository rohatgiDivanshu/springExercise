package com.example.spring.boot.demo.boot.spring.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DatabaseController {

    @Value("${database.name}")
    String name;

    @Value("${database.port}")
    int port;


    @RequestMapping("/database")
    @ResponseBody
    public String getDatabase() {
        return name + " " + port;
    }
}

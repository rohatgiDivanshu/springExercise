package com.example.spring.boot.demo.boot.spring.controller;


import com.example.spring.boot.demo.boot.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {


    @Autowired
    User user;


    @GetMapping("/user")
    @ResponseBody
    public User getUser() {

        User user = new User();
        user.setAge(23);
        user.setName("Divanshu");

        return user;
    }
}

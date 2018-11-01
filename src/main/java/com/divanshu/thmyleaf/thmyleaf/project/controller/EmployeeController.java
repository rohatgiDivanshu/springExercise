package com.divanshu.thmyleaf.thmyleaf.project.controller;

import com.divanshu.thmyleaf.thmyleaf.project.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    private Employee employee;

    @GetMapping("/question1")
    public String alertThrowing() {
        return "layouts/exercise";
    }

    @GetMapping("/register")
    public String employeeRegister(Employee employee) {
        return "layouts/register";
    }


    @PostMapping("/employeesubmit")
    public String getEmployeedetails(@ModelAttribute("employee") Employee employee) {

        System.out.println("-----------------------");
        System.out.println(employee);
        System.out.println("-----------------------");

        return "layouts/employee";
    }

    @GetMapping("/loader")
    public String register(Employee employee) {
        return "layouts/loader";
    }

    @GetMapping("/serverTime")
    public String showServerTime() {
        return "layouts/serverTime";
    }

    @GetMapping("/currentTime")
    @ResponseBody
    public String currentTime() {
        return LocalDateTime.now().toString();
    }
}
package com.example.spring.boot.demo.boot.spring.controller;


import com.example.spring.boot.demo.boot.spring.model.Student;
import com.example.spring.boot.demo.boot.spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getStudents() {

        return studentService.getStudents();
    }

}

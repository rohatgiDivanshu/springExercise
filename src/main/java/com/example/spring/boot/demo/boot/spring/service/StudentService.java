package com.example.spring.boot.demo.boot.spring.service;


import com.example.spring.boot.demo.boot.spring.model.Student;
import com.example.spring.boot.demo.boot.spring.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getStudents() {

        List<Student> student = new ArrayList<>();
        Iterator<Student> studentIterator = studentRepository.findAll().iterator();
        studentIterator.forEachRemaining(student::add);

//        Arrays.asList(
//          new Student(1,"Student 1",25),
//          new Student(2,"Student 2",22),
//          new Student(3,"Student 3",18),
//          new Student(4,"Student 4",20)
//        );

        return student;
    }
}

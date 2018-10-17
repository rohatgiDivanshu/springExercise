package com.example.spring.boot.demo.boot.spring.event;


import com.example.spring.boot.demo.boot.spring.model.Student;
import com.example.spring.boot.demo.boot.spring.repository.StudentRepository;
import com.sun.org.apache.bcel.internal.generic.INEG;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Iterator;

@Component
public class Bootstrap {

    @Autowired
    StudentRepository studentRepository;


    @EventListener(ApplicationStartedEvent.class)
    public void init() {

        Iterator<Student> studentIterator = studentRepository.findAll().iterator();
        if (!studentIterator.hasNext()) {
            for (int i = 1; i <= 10; i++) {
                Student student = new Student(i, "Student " + i, i);
                studentRepository.save(student);
                System.out.println("Student " + i + " Created");
            }
        }

        System.out.println("Your application is up and running");
    }

}

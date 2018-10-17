package com.example.spring.boot.demo.boot.spring.repository;

import com.example.spring.boot.demo.boot.spring.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}

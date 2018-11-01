package com.divanshu.rest.rest.with.spring.repository;

import com.divanshu.rest.rest.with.spring.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Integer> {
}

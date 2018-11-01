package com.divanshu.rest.rest.with.spring.service;

import com.divanshu.rest.rest.with.spring.entity.Student;
import com.divanshu.rest.rest.with.spring.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;


@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return (List<Student>)studentRepository.findAll();
    }

    public Student update(Student student) {
        Iterator<Student> iterator = studentRepository.findAll().iterator();
        if (!iterator.hasNext()) {
            for (int i = 1; i < 8; i++) {
                student = new Student("Sam",26);
                studentRepository.save(student);
            }
        }
        else {
            studentRepository.save(student);
        }
        return student;
    }

    /*TODO:
     * Create a Customise Exception Handler.*/
    public Optional<Student> getStudentById(Integer id){
        return studentRepository.findById(id);
    }

}

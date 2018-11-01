package com.divanshu.rest.rest.with.spring.controller;

import com.divanshu.rest.rest.with.spring.entity.*;
import com.divanshu.rest.rest.with.spring.exceptions.StudentNotFoundException;
import com.divanshu.rest.rest.with.spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Locale;
import java.util.Optional;


@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @Autowired
    MessageSource messageSource;

    @GetMapping("/update")
    Student updateStudents(Student student){
        return studentService.update(student);
    }

    @GetMapping("/")
    List<Student> getStudents() {

        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    Student getStudentById(@PathVariable Integer id) {
        Student student = studentService.getStudentById(id).get();
        if (student == null) {
            throw new StudentNotFoundException("Student not found!!");
        }
        return studentService.getStudentById(id).get();
    }


    /*TODO:
     * 3) Print the Validation Messages of student Entity in response.*/

    @PostMapping("/students")
    ResponseEntity<Student> saveStudent(@Valid @RequestBody Student student) {
        studentService.update(student);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("{id}").buildAndExpand(student.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @GetMapping("/students")
    String helloWorld(@RequestHeader(name = "Accept-Language", required = false) Locale locale) {
        System.out.println("hello world");
        System.out.println(locale.getLanguage());
        return messageSource.getMessage("good.morning.message", null, locale);
    }

    //URI Versioning

    @GetMapping("/students/V1")
    StudentVersion1 getPersonV1() {
        return new StudentVersion1("Peter Parker");
    }

    @GetMapping("/students/V2")
    StudentVersion2 getPersonV2() {
        return new StudentVersion2(new Name("Peter", "Parker"));
    }

    //Parameter Versioning
    // /users/param?version=1
    @GetMapping(value = "/students/param", params = "version=1")
    StudentVersion1 getPersonParam1() {
        return new StudentVersion1("Peter Parker");
    }

    @GetMapping(value = "/students/param", params = "version=2")
    StudentVersion2 getPersonParam2() {
        return new StudentVersion2(new Name("Peter", "Parker"));
    }


    //Header Versioning
    //API-VERSION 1 header required with request
    @GetMapping(value = "/users/header", headers = "API-VERSION=1")
    StudentVersion1 getPersonHeader1() {
        return new StudentVersion1("Peter Parker");
    }

    @GetMapping(value = "/users/header", headers = "API-VERSION=2")
    StudentVersion2 getPersonHeader2() {
        return new StudentVersion2(new Name("Peter", "Parker"));
    }

    /*TODO:
    * Perform CRUD operations on the resource below using   RestTemplate
      https://jsonplaceholder.typicode.com/posts   (2 Marks)*/

    @GetMapping("/post")
    public String getPost(){
        RestTemplate restTemplate = new RestTemplate();
        String url="https://jsonplaceholder.typicode.com/posts/1";
        ResponseEntity<String> response = restTemplate.getForEntity(url,String.class);
        System.out.println(response.getStatusCode().toString());
        System.out.println(response.getHeaders().toString());
        return response.getBody();
    }

    @PostMapping("/createPost")
    public ResponseEntity<Post> createPost(){
        String url="https://jsonplaceholder.typicode.com/posts";
        RestTemplate restTemplate= new RestTemplate();
        HttpHeaders httpHeaders= new HttpHeaders();
        httpHeaders.add("Content-type","application/json; charset=UTF-8");
        HttpEntity<Post> request=new HttpEntity<>(new Post(10000,10000,"title1","description1"),httpHeaders);
        Post post=restTemplate.postForObject(url,request,Post.class);
        System.out.println(post);
        return new ResponseEntity<Post>(post, HttpStatus.CREATED);
    }

    @PutMapping("/updatePost")
    public ResponseEntity<Post> updatePost(){
        String url="https://jsonplaceholder.typicode.com/posts/1";
        RestTemplate restTemplate= new RestTemplate();
        HttpHeaders httpHeaders= new HttpHeaders();
        httpHeaders.add("Content-type","application/json; charset=UTF-8");
        HttpEntity<Post> request=new HttpEntity<>(new Post(111,10000,"title1","description1"),httpHeaders);
        return restTemplate.exchange(url, HttpMethod.PUT,request,Post.class);
    }

    @DeleteMapping("/deletePost")
    public void deletePost(){
        String url="https://jsonplaceholder.typicode.com/posts/1";
        RestTemplate restTemplate= new RestTemplate();
        HttpHeaders httpHeaders= new HttpHeaders();
        httpHeaders.add("Content-type","application/json; charset=UTF-8");
        HttpEntity<Post> request=new HttpEntity<>(httpHeaders);
        restTemplate.exchange(url,HttpMethod.DELETE,request,Post.class);
    }


}

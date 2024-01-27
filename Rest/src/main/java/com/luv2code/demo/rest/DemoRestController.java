package com.luv2code.demo.rest;

import com.luv2code.demo.entity.Home;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class DemoRestController {

    List<Home> theHome;

    @PostConstruct
    public void homeData() {
        theHome = new ArrayList<>();
        theHome.add(new Home("Rest API - View All", "Go to '/api/students' to view list of students data"));
        theHome.add(new Home("Rest API - Retrieve single entity", "Go to '/api/students{student_index}' to retrieve student"));
    }

    @GetMapping({"/","/home"})
    public List<Home> home() {

        return theHome;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }
}

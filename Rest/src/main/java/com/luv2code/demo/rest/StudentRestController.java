package com.luv2code.demo.rest;

import com.luv2code.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudent;

    @PostConstruct
    public void loadData() {
        theStudent = new ArrayList<>();
        theStudent.add(new Student("JaiShree", "Ram"));
        theStudent.add(new Student("Mario", "Rossi"));
        theStudent.add(new Student("Krishna", "Kesav"));
        theStudent.add(new Student("Harhar", "Mahadev"));
    }

    // define endpoint for "/students" - return a list of student
    @GetMapping("/students")
    public List<Student> getStudents() {
        return theStudent;
    }

    // define endpoint for "/students/{studentId}" - return student at index
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {

        if((studentId >= theStudent.size()) || (studentId < 0)) {
            throw new StudentNotFoundException("Student not found: " + studentId);
        }

        return theStudent.get(studentId);
    }

}








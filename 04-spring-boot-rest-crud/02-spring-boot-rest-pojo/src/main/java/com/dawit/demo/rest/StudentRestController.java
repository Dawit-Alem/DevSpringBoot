package com.dawit.demo.rest;

import com.dawit.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    // define endpoint for "/students" - return a list of students

    @GetMapping("/students")
    public List<Student> getStudent(){

        List<Student> theStudents = new ArrayList<>();

        theStudents.add(new Student("Dawit", "Alem"));
        theStudents.add(new Student("Amanuel", "Takele"));
        theStudents.add(new Student("Ati", "Mekonnen"));

        return theStudents;
    }

}

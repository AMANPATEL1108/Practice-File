package com.example.SecDBConnectionExample.api.controller;

import com.example.SecDBConnectionExample.api.Service.StudentService;
import com.example.SecDBConnectionExample.api.model.Invertory;
import com.example.SecDBConnectionExample.api.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addstudent")
    public String addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

}

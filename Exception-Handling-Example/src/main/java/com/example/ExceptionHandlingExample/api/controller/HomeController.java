package com.example.ExceptionHandlingExample.api.controller;


import com.example.ExceptionHandlingExample.api.entities.Student;
import com.example.ExceptionHandlingExample.api.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private StudentService studentService;


    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }


    @GetMapping("/getStudentsById/{id}")
    public Optional<?> findByID(@PathVariable Integer id) {
        return Optional.ofNullable(studentService.findStudentById(id));
    }

    @DeleteMapping("/deleteStudent/{id}")
    public String deleteById(@PathVariable Integer id) {
        return studentService.deleteStudenntById(id);
    }


}

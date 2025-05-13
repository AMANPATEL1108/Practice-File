package com.example.RequestResponsBody.api.controller;

import com.example.RequestResponsBody.api.entities.Student;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestContoller {

    @ResponseBody
    @PostMapping("/student/details")
    public Student studentDetails(@RequestBody Student student){
        System.out.println(student);
        return student;
    }

}

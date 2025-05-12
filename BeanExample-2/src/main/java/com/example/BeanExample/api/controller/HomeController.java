package com.example.BeanExample.api.controller;


import com.example.BeanExample.api.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @Autowired
    @Qualifier("sec")
    private Student s;

    @GetMapping("/getdata")
    public Student getdata(){
        System.out.println(s.getId());
        System.out.println(s.getName());
        System.out.println(s.getEmail());
        return s;
    }

}

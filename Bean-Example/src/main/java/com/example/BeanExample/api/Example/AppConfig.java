package com.example.BeanExample.api.Example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    @Qualifier("student1")
    public StudentBean studentBean1() {
        System.out.println("Called a Bean method................................");
        StudentBean student = new StudentBean();
        student.setName("Aman");
        student.setId(1);
        student.setCourse("Computer Science");
        student.setRoll(101);
        return student;
    }

    @Bean
    @Qualifier("student2")
    public StudentBean studentBean2() {
        StudentBean student = new StudentBean();
        student.setName("Rahul");
        student.setId(2);
        student.setCourse("Electrical Engineering");
        student.setRoll(102);
        return student;
    }

    @Bean
    @Qualifier("student3")
    public StudentBean studentBean3() {
        StudentBean student = new StudentBean();
        student.setName("Ap");
        student.setId(3);
        student.setCourse("Comp Eng");
        student.setRoll(103);
        return student;
    }
}
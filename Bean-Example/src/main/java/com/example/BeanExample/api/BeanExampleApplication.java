package com.example.BeanExample.api;

import com.example.BeanExample.api.Example.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class BeanExampleApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BeanExampleApplication.class, args);

        Test test = context.getBean(Test.class);
        test.printAllStudents();
    }

}

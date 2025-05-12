package com.example.BeanExample.api.config;


import com.example.BeanExample.api.model.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    @Qualifier("first")
    public Student student() {

        Student student1 = new Student();
        student1.setId("1");
        student1.setName("aman");
        student1.setEmail("aman@gmail.com");
        return student1;
    }
    @Bean
    @Qualifier("sec")
    public Student student2() {

        Student student2 = new Student();
        student2.setId("2");
        student2.setName("aman2");
        student2.setEmail("aman2@gmail.com");
        return student2;
    }

}

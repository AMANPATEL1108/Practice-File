package com.example.BeanExample.api.Example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class Test {

    private final List<StudentBean> students;

    @Autowired
    public Test(@Qualifier("student1") StudentBean student1,
                @Qualifier("student2") StudentBean student2
            , @Qualifier("student3") StudentBean student3) {
        this.students = Arrays.asList(student1, student2, student3);
    }

    public void printAllStudents() {
        System.out.println("All Students:");
        students.forEach(student -> {
            System.out.println("\nName: " + student.getName());
            System.out.println("ID: " + student.getId());
            System.out.println("Course: " + student.getCourse());
            System.out.println("Roll: " + student.getRoll());
        });
    }
}
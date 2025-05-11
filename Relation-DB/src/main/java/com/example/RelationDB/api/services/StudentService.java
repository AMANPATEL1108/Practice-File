package com.example.RelationDB.api.services;

import com.example.RelationDB.api.Model.Laptop;
import com.example.RelationDB.api.Model.Student;
import com.example.RelationDB.api.Repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Transactional
    public String addStudent() {
        // Create student
        Student student = new Student();
        student.setId(1);
        student.setStudentName("Aman");
        student.setAbout("Bayad");

        // Create laptop
        Laptop laptop = new Laptop();
        laptop.setLaptopId(1);
        laptop.setModelNumber("456M");
        laptop.setBrand("Asus");

        // Set bidirectional relationship
        laptop.setStudent(student);
        student.setLaptop(laptop);

        // Save student (cascade will save laptop)
        studentRepository.save(student);

        return "Student created successfully";
    }
}
package com.example.SecDBConnectionExample.api.Service;

import com.example.SecDBConnectionExample.api.Repository.StudentRepository;
import com.example.SecDBConnectionExample.api.Repository.UserRepository;
import com.example.SecDBConnectionExample.api.model.Invertory;
import com.example.SecDBConnectionExample.api.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public  String addStudent(Student student){

        for (Invertory invertory : student.getInvertory()) {
            invertory.setStudent(student);
        }

        studentRepository.save(student);

        return "Student added Successfully";
    }

}

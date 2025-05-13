package com.example.ExceptionHandlingExample.api.services;

import com.example.ExceptionHandlingExample.api.Exception.ErrorResponse;
import com.example.ExceptionHandlingExample.api.Exception.ProductNotFoundException;
import com.example.ExceptionHandlingExample.api.Exception.StudentNotFound;
import com.example.ExceptionHandlingExample.api.Repository.StudentRepository;
import com.example.ExceptionHandlingExample.api.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.swing.text.html.Option;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Optional<?> findStudentById(Integer id) {
        return studentRepository.findById(id);
        //way-1-----------------------Exception Handle \
//        try {
//            return studentRepository.findById(id);
//        } catch (Exception e) {
//            ErrorResponse studentNotFound = new ErrorResponse(LocalDateTime.now(), e.getMessage(), "Student Not Found this");
//            return Optional.of(new ResponseEntity<>(studentNotFound, HttpStatus.NOT_FOUND));
//        }
        //way-2--part-1-------------------------------------Exception Handle \
//        Student student = studentRepository.findById(id)
//                .orElseThrow(() -> new StudentNotFound("Student not found with ID: " + id));
//
//        return new ResponseEntity<>(student, HttpStatus.OK); // return student if found

    }


    public String deleteStudenntById(Integer id) {
        studentRepository.deleteById(id);
        return "Student Deleted SUccesfully";
    }


    //way-2--part-2-------------------------------------Exception Handle \
//    @ExceptionHandler(StudentNotFound.class)
//    public ResponseEntity<?> handleStudentNotFound(StudentNotFound studentNotFound) {
//        ErrorResponse s = new ErrorResponse(LocalDateTime.now(), studentNotFound.getMessage(), "Student Not Found this");
//        return new ResponseEntity<>(s, HttpStatus.NOT_FOUND);
//    }


}

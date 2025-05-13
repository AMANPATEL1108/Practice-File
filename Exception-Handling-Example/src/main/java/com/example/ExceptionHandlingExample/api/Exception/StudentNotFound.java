package com.example.ExceptionHandlingExample.api.Exception;


public class StudentNotFound extends RuntimeException {
    public StudentNotFound(String message) {
        super(message);
    }


}


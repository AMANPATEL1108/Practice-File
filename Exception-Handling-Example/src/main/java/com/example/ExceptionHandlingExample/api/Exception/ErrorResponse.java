package com.example.ExceptionHandlingExample.api.Exception;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ErrorResponse {

    private LocalDateTime timestemp;
    private String message;
    private String details;

    public ErrorResponse(LocalDateTime timestemp, String message, String details) {
        this.timestemp = timestemp;
        this.message = message;
        this.details = details;
    }
}

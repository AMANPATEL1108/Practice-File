package com.example.RequestResponsBody.api.entities;


import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Data
public class Student {

    private Integer id;

    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

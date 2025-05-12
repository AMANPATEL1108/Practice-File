package com.example.BeanExample.api.Example;

import lombok.Data;

import java.io.Serializable;


//if i have parameterized Constructor then we can not empty any parameter then using bean that we can add we want
// which method i want to add and where to use
@Data
public class StudentBean implements Serializable {
    private String name;
    private int id;
    private String course;
    private int roll;
}

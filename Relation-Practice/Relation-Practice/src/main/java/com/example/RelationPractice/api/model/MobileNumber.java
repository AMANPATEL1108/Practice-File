package com.example.RelationPractice.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "mobile_number")
public class MobileNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mobileNum1;
    private String mobileNum2;
}
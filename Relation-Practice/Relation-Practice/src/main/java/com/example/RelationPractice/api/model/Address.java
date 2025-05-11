package com.example.RelationPractice.api.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "user_address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String address1;
    private String address2;
}

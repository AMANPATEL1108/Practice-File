package com.example.crud.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cars_details")
@Getter
@Setter
public class Car {


    @Id
    @GeneratedValue
    private Integer id;

    private String company;
    private String version;
    private String name;
    private Integer price;


}

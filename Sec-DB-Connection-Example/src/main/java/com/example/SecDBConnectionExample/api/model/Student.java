package com.example.SecDBConnectionExample.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.concurrent.Callable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer sid;
    private String name;


    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private List<Invertory> invertory;

}

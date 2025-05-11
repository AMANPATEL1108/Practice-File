package com.example.RelationDB.api.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "laptop")
@AllArgsConstructor
@NoArgsConstructor
public class Laptop {

    @Id
    private Integer laptopId;
    private String modelNumber;
    private String brand;

    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;
}
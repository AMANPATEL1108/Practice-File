package com.example.SecDBConnectionExample.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "inventory")
@Data
public class Invertory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer iId;

    private String pen;
    private String pencil;
    private String eraser;
    private String sharpner;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

}

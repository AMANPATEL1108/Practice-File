package com.example.SecDBConnectionExample.api.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cid;

    private String Mobile;
    private String laptop;
    private String electronic;
    private String speaker;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Product> products = new ArrayList<>();


}

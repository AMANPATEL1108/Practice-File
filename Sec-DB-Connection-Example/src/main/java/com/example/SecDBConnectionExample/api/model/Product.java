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
@Table(name = "products")
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer pId;

    private String name;
    private String price;

    @ManyToMany(mappedBy = "products")
    private List<Category> categories = new ArrayList<>();


}

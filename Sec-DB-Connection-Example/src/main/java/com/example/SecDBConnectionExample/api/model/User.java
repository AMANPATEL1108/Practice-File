package com.example.SecDBConnectionExample.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "user_table")
public class User {

    @Id
    private Integer uid;
    private String name;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private ContactDetails contactDetails;


}

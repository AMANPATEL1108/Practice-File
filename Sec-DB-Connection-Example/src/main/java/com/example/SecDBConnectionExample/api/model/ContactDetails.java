package com.example.SecDBConnectionExample.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "contact_number")
public class ContactNumber {

    @Id
    private Integer contactId;
    private String number;
    private String address;


    @OneToOne
    @JoinColumn(name = "student_Id")
    private User user;

}

package com.example.SecDBConnectionExample.api.Repository;

import com.example.SecDBConnectionExample.api.model.ContactDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContactNumberRepository  extends JpaRepository<ContactDetails,Integer> {

}

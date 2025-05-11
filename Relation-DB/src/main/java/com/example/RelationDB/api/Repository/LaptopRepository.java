package com.example.RelationDB.api.Repository;

import com.example.RelationDB.api.Model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop, Integer> {
}

package com.example.SecDBConnectionExample.api.Repository;

import com.example.SecDBConnectionExample.api.model.Invertory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvertoryRepository extends JpaRepository<Invertory,Integer> {
}

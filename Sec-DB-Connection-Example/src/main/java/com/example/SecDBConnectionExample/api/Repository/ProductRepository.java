package com.example.SecDBConnectionExample.api.Repository;

import com.example.SecDBConnectionExample.api.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}

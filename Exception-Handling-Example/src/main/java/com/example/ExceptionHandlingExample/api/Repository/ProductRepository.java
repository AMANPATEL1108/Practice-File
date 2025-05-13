package com.example.ExceptionHandlingExample.api.Repository;

import com.example.ExceptionHandlingExample.api.entities.Product;
import com.example.ExceptionHandlingExample.api.services.ProductService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {


}

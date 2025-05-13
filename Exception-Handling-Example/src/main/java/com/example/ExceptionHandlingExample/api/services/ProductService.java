package com.example.ExceptionHandlingExample.api.services;

import com.example.ExceptionHandlingExample.api.Exception.ErrorResponse;
import com.example.ExceptionHandlingExample.api.Exception.ProductNotFoundException;
import com.example.ExceptionHandlingExample.api.Repository.ProductRepository;
import com.example.ExceptionHandlingExample.api.Repository.StudentRepository;
import com.example.ExceptionHandlingExample.api.entities.Product;
import com.example.ExceptionHandlingExample.api.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public ResponseEntity<?> findProductById(Integer id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product not found with ID: " + id));
        //way-3 using Global Exception-part-1--------------------\
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    public String deleteProductsById(Integer id) {
        productRepository.deleteById(id);
        return "Product Deleted Succesfully";
    }


}

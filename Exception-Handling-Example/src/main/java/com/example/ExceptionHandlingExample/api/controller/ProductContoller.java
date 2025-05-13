package com.example.ExceptionHandlingExample.api.controller;


import com.example.ExceptionHandlingExample.api.entities.Product;
import com.example.ExceptionHandlingExample.api.entities.Student;
import com.example.ExceptionHandlingExample.api.services.ProductService;
import com.example.ExceptionHandlingExample.api.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.geom.RectangularShape;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductContoller {


    @Autowired
    private ProductService productService;


    @PostMapping("/addProduct")
    public Product addStudent(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @GetMapping("/getProduct/{id}")
    public ResponseEntity<?> findByID(@PathVariable Integer id) {
        return productService.findProductById(id);
    }

    @DeleteMapping("/deleteProduct/{id}")
    public String deleteById(@PathVariable Integer id) {
        return productService.deleteProductsById(id);
    }

}

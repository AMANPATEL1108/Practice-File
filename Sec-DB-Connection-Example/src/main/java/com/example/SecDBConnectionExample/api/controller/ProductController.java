package com.example.SecDBConnectionExample.api.controller;

import com.example.SecDBConnectionExample.api.Service.ProductService;
import com.example.SecDBConnectionExample.api.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {


    @Autowired
    private ProductService productService;


    @PostMapping("/addproduct")
    public String addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

}

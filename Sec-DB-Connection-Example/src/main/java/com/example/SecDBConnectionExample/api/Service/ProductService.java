package com.example.SecDBConnectionExample.api.Service;

import com.example.SecDBConnectionExample.api.Repository.CategoryRepository;
import com.example.SecDBConnectionExample.api.Repository.ProductRepository;
import com.example.SecDBConnectionExample.api.model.Category;
import com.example.SecDBConnectionExample.api.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {


    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;


    public String addProduct(Product product){

        for(Category category:product.getCategories()){
            category.getProducts().add(product);
            categoryRepository.save(category);
        }
        productRepository.save(product);


        return "Product and categories added successfully";
    }

}

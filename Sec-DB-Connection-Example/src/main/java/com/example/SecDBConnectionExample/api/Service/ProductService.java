package com.example.SecDBConnectionExample.api.Service;

import com.example.SecDBConnectionExample.api.Repository.CategoryRepository;
import com.example.SecDBConnectionExample.api.model.Category;
import com.example.SecDBConnectionExample.api.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {


    @Autowired
    private CategoryRepository categoryRepository;




    public String addProduct(Category category, Product product){

        for (Category category1:product.getCategories()){
            category1.setProducts(product);
        }

        categoryRepository.save(category);

        return "added Category";
    }

}

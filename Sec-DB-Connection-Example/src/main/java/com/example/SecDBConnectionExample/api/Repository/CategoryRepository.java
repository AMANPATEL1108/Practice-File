package com.example.SecDBConnectionExample.api.Repository;

import com.example.SecDBConnectionExample.api.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}

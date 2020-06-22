package com.example.reviewsite.demo;

import com.example.reviewsite.demo.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Category findCategoryByName(String categoryName);
}


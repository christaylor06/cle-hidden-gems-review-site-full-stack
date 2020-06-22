package com.example.reviewsite.demo.repositories;

import com.example.reviewsite.demo.models.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Category findCategory(String categoryName);

}


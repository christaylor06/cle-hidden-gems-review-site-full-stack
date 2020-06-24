package com.example.reviewsite.demo.controllers;

import com.example.reviewsite.demo.repositories.CategoryRepository;
import com.example.reviewsite.demo.models.Category;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class CategoryController {

    @Resource
    private CategoryRepository categoryRepo;

    @RequestMapping({"/categories", "/", "" })
    public String displayCategories(Model model){
        model.addAttribute("categories", categoryRepo.findAll());
        return "categoriesView";
    }

    @GetMapping("/categories/{categoryName}")
    public String displaySingleCategory(@PathVariable String categoryName, Model model) {
        Category retrievedCategory = categoryRepo.findCategoryByCategoryName(categoryName);
        model.addAttribute("category",retrievedCategory);
        return "categoryView";
    }
}


package com.example.reviewsite.demo;

import com.example.reviewsite.demo.Category;
import com.example.reviewsite.demo.CategoryRepository;
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

    @RequestMapping({"/categories", "category", })
    public String displayCampuses(Model model){
        model.addAttribute("categories", categoryRepo.findAll());
        return "categoriesView";
    }

    @GetMapping("/categories/{categoryName}")
    public String displaySingleCategory(@PathVariable String categoryName, Model model) {
        Category retrievedCategory = categoryRepo.findCategoryByName(categoryName);
        model.addAttribute("category",retrievedCategory);
        return "categoryView";
    }
}


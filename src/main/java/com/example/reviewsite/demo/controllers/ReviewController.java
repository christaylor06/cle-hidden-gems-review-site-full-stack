package com.example.reviewsite.demo.controllers;

import com.example.reviewsite.demo.ReviewNotFoundException;
import com.example.reviewsite.demo.models.Review;
import com.example.reviewsite.demo.repositories.ReviewRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.Optional;

@Controller
public class ReviewController {

    @Resource
    private ReviewRepository reviewRepo;

    @RequestMapping("/reviews")
    public String finalAllReviews(Model model) {
        model.addAttribute("reviewsModel", reviewRepo.findAll());
        return "homeTemplate";
    }

    @RequestMapping("/reviews/{id}")
    public String findOneReview(@PathVariable long id, Model model)  {
        Optional<Review> retrievedReview = reviewRepo.findById(id);
        Review foundReview = retrievedReview.get();
        model.addAttribute("reviewModel", foundReview);
        return "reviewTemplate";

//       throws ReviewNotFoundException
//       if(foundReview == null) {
//            throw new ReviewNotFoundException();
//        }

    }
//if(reviewRepo.findOneReview
}

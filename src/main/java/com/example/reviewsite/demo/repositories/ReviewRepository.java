package com.example.reviewsite.demo.repositories;

import com.example.reviewsite.demo.models.Review;
import org.springframework.data.repository.CrudRepository;

public interface ReviewRepository extends CrudRepository<Review, Long> {
}

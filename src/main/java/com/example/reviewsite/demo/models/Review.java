package com.example.reviewsite.demo.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Review {

    @Id
    @GeneratedValue
    private long id;
    private String reviewTitle;
    private String imageUrl;
    @Column(length = 3000)
    private String reviewContent;
    @ManyToMany
    private Collection<Category> categories;

    public Long getId() {
        return id;
    }


    public String getReviewTitle() {
        return reviewTitle;
    }


    public String getImageUrl() {
        return imageUrl;
    }


    public Collection<Category> getReviewCategories() {
        return categories;
    }


    public String getReviewContent() {
        return reviewContent;
    }


    public Review() {
    }

    public Review(Long id, String reviewTitle, String imageUrl, String reviewContent, Category... categories) {
        this.id = id;
        this.reviewTitle = reviewTitle;
        this.imageUrl = imageUrl;
        this.reviewContent = reviewContent;
        this.categories = new ArrayList<>(Arrays.asList(categories));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review review = (Review) o;
        return Objects.equals(id, review.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}


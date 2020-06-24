package com.example.reviewsite.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Category {

    @Id
    @GeneratedValue
    private Long id;
    private String categoryName;
    @ManyToMany(mappedBy = "categories")
    private Collection<Review> reviews;

    public Category(){}

    public Category(String categoryName) {
        this.categoryName = categoryName;
//        this.reviews = reviews;
    }

    public Long getId() {
        return id;
    }

    public String getCategoryName() {
        return categoryName;
    }
    public Collection<Review> getReviews() {
        return reviews;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return id == category.id &&
        Objects.equals(categoryName, category.categoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

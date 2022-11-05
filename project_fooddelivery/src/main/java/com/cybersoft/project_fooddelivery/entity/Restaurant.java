package com.cybersoft.project_fooddelivery.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity(name = "restaurant")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "image")
    private String image;
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "restaurant")
    private List<RestaurantReview> restaurantReviewList;

    @JsonIgnore
    @OneToMany(mappedBy = "restaurant")
    private Set<Food> food;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<RestaurantReview> getRestaurantReviewList() {
        return restaurantReviewList;
    }

    public void setRestaurantReviewList(List<RestaurantReview> restaurantReviewList) {
        this.restaurantReviewList = restaurantReviewList;
    }

    public Set<Food> getFood() {
        return food;
    }

    public void setFood(Set<Food> food) {
        this.food = food;
    }
}

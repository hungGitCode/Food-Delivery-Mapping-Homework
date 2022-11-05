package com.cybersoft.project_fooddelivery.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "food")
public class Food {
//    id int auto_increment,
//    name varchar(255),
//    image text,
//    price int,jobs
//    id_category int,
//    id_restaurant int,
//
//    primary key(id),
//    foreign key(id_category) references category(id),
//    foreign key(id_restaurant) references restaurant(id)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "image")
    private String image;
    @Column(name = "price")
    private int price;

    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "id_restaurant")
    private Restaurant restaurant;
    @JsonIgnore
    @OneToOne(mappedBy = "food")
    private FoodDetail foodDetail;

    @JsonIgnore
    @OneToMany(mappedBy = "foodReview")
    private Set<FoodReview> foodReviews;

    @JsonIgnore
    @OneToMany(mappedBy = "foodAddon")
    private Set<FoodAddon> foodAddons;


    @OneToMany(mappedBy = "foodMaterial")
    private Set<FoodMaterial> foodMaterials;

    @JsonIgnore
    @OneToMany(mappedBy = "foodOrder")
    private Set<FoodOrder> foodOrders;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public FoodDetail getFoodDetail() {
        return foodDetail;
    }

    public void setFoodDetail(FoodDetail foodDetail) {
        this.foodDetail = foodDetail;
    }

    public Set<FoodReview> getFoodReviews() {
        return foodReviews;
    }

    public void setFoodReviews(Set<FoodReview> foodReviews) {
        this.foodReviews = foodReviews;
    }

    public Set<FoodAddon> getFoodAddons() {
        return foodAddons;
    }

    public void setFoodAddons(Set<FoodAddon> foodAddons) {
        this.foodAddons = foodAddons;
    }

    public Set<FoodMaterial> getFoodMaterials() {
        return foodMaterials;
    }

    public void setFoodMaterials(Set<FoodMaterial> foodMaterials) {
        this.foodMaterials = foodMaterials;
    }

    public Set<FoodOrder> getFoodOrders() {
        return foodOrders;
    }

    public void setFoodOrders(Set<FoodOrder> foodOrders) {
        this.foodOrders = foodOrders;
    }
}

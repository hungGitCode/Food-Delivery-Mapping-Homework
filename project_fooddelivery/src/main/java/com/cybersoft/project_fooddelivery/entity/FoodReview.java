package com.cybersoft.project_fooddelivery.entity;

import javax.persistence.*;

@Entity(name = "food_review")
public class FoodReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "content")
    private String content;
    @Column(name = "create_date")
    private String createDate;
    @Column(name = "rate")
    private String rate;
    @ManyToOne
    @JoinColumn(name = "id_food")
    private Food foodReview;
    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public Food getFoodReview() {
        return foodReview;
    }

    public void setFoodReview(Food foodReview) {
        this.foodReview = foodReview;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

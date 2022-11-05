package com.cybersoft.project_fooddelivery.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "image")
    private String image;
    @Column(name = "name")
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "category")
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


    public Set<Food> getFood() {
        return food;
    }

    public void setFood(Set<Food> food) {
        this.food = food;
    }
}

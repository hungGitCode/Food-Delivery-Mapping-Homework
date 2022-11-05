package com.cybersoft.project_fooddelivery.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "material")
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @JsonIgnore
    @OneToMany(mappedBy = "material")
    private Set<FoodMaterial> foodMaterials;

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

    public Set<FoodMaterial> getFoodMaterials() {
        return foodMaterials;
    }

    public void setFoodMaterials(Set<FoodMaterial> foodMaterials) {
        this.foodMaterials = foodMaterials;
    }
}

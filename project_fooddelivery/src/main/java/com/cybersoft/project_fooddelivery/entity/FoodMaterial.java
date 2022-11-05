package com.cybersoft.project_fooddelivery.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "food_material")
@IdClass(FoodMaterial.class)
public class FoodMaterial implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_food")
    private Food foodMaterial;
    @ManyToOne
    @JoinColumn(name = "id_material")
    private Material material;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Food getFoodMaterial() {
        return foodMaterial;
    }

    public void setFoodMaterial(Food foodMaterial) {
        this.foodMaterial = foodMaterial;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

}

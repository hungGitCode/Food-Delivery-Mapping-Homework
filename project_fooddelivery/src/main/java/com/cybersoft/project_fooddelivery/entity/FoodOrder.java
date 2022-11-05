package com.cybersoft.project_fooddelivery.entity;

import javax.persistence.*;

@Entity(name = "food_order")
public class FoodOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "price")
    private float price;
    @Column(name = "quality")
    private int quality;
    @Column(name = "id_promo")
    private int idPromo;
    @ManyToOne
    @JoinColumn(name = "id_order")
    private Torder torderformFoodOrder;
    @ManyToOne
    @JoinColumn(name = "id_food")
    private Food foodOrder;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getIdPromo() {
        return idPromo;
    }

    public void setIdPromo(int idPromo) {
        this.idPromo = idPromo;
    }

    public Torder getTorderformFoodOrder() {
        return torderformFoodOrder;
    }

    public void setTorderformFoodOrder(Torder torderformFoodOrder) {
        this.torderformFoodOrder = torderformFoodOrder;
    }

    public Food getFoodOrder() {
        return foodOrder;
    }

    public void setFoodOrder(Food foodOrder) {
        this.foodOrder = foodOrder;
    }
}

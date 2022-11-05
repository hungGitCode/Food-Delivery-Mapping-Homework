package com.cybersoft.project_fooddelivery.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "t_order")
public class Torder {
//    id int auto_increment,
//    id_user int,
//    estimate_ship timestamp,
//    deliver_address text,
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "estimate_ship")
    private String estimateShip;
    @Column(name = "deliver_address")
    private String deliverAddress;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User userTorder;
    @JsonIgnore
    @OneToMany(mappedBy = "torder")
    private Set<OrderStatus> orderStatuses;
    @JsonIgnore
    @OneToMany(mappedBy = "torderformFoodOrder")
    private Set<FoodOrder> foodOrders;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstimateShip() {
        return estimateShip;
    }

    public void setEstimateShip(String estimateShip) {
        this.estimateShip = estimateShip;
    }

    public String getDeliverAddress() {
        return deliverAddress;
    }

    public void setDeliverAddress(String deliverAddress) {
        this.deliverAddress = deliverAddress;
    }

    public User getUserTorder() {
        return userTorder;
    }

    public void setUserTorder(User userTorder) {
        this.userTorder = userTorder;
    }

    public Set<OrderStatus> getOrderStatuses() {
        return orderStatuses;
    }

    public void setOrderStatuses(Set<OrderStatus> orderStatuses) {
        this.orderStatuses = orderStatuses;
    }

    public Set<FoodOrder> getFoodOrders() {
        return foodOrders;
    }

    public void setFoodOrders(Set<FoodOrder> foodOrders) {
        this.foodOrders = foodOrders;
    }
}

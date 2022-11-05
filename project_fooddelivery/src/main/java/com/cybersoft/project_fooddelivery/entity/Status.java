package com.cybersoft.project_fooddelivery.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "status")
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @JsonIgnore
    @OneToMany(mappedBy = "status")
    private Set<OrderStatus> orderStatuses;

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

    public Set<OrderStatus> getOrderStatuses() {
        return orderStatuses;
    }

    public void setOrderStatuses(Set<OrderStatus> orderStatuses) {
        this.orderStatuses = orderStatuses;
    }
}

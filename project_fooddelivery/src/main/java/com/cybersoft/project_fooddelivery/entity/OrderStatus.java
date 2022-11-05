package com.cybersoft.project_fooddelivery.entity;

import javax.persistence.*;

@Entity(name = "order_status")
public class OrderStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "id_order")
    private Torder torder;
    @ManyToOne
    @JoinColumn(name = "id_status")
    private Status status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Torder getTorder() {
        return torder;
    }

    public void setTorder(Torder torder) {
        this.torder = torder;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}

package com.cybersoft.project_fooddelivery.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity(name = "user_detail")
public class UserDetail {
//    id_user int,
//    address varchar(255),
//    mobile_phone varchar(12),
//    state varchar(255),
//    city varchar(255),
//    street varchar(255),
//
//    primary key(id_user),
//    foreign key(id_user) references user(id)
    @Id
    @Column(name = "id_user")
    private int idUser;
    @Column(name = "address")
    private String address;
    @Column(name = "mobile_phone")
    private String mobilePhone;
    @Column(name = "state")
    private String state;
    @Column(name = "city")
    private String city;
    @Column(name = "street")
    private String street;
    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "id_user")
    private User user;

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

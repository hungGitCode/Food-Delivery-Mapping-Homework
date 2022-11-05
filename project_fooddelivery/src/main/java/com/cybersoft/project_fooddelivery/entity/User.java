package com.cybersoft.project_fooddelivery.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "user")
public class User {
//    id int auto_increment,
//    email varchar(255),
//    password varchar(255),
//    fullname varchar(100),
//    token varchar(100),
//    type_token varchar(10),
//    phone_number varchar(12),
//    verify_code varchar(12),
//    verify_code_expired timestamp,
//    is_active boolean default false,
//
//    primary key(id)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "fullname")
    private String fullname;
    @Column(name = "token")
    private String token;
    @Column(name = "type_token")
    private String typeToken;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "verify_code")
    private String verifyCode;
    @Column(name = "verify_code_expired")
    private String verifyCodeExpired;
    @Column(name = "is_active")
    private boolean isActive;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTypeToken() {
        return typeToken;
    }

    public void setTypeToken(String typeToken) {
        this.typeToken = typeToken;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public String getVerifyCodeExpired() {
        return verifyCodeExpired;
    }

    public void setVerifyCodeExpired(String verifyCodeExpired) {
        this.verifyCodeExpired = verifyCodeExpired;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @OneToOne(mappedBy = "user")
    private UserDetail userDetail;
    @JsonIgnore
    @OneToMany(mappedBy = "userTorder")
    Set<Torder> torders;

    public UserDetail getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(UserDetail userDetail) {
        this.userDetail = userDetail;
    }

    public Set<Torder> getTorders() {
        return torders;
    }

    public void setTorders(Set<Torder> torders) {
        this.torders = torders;
    }
}

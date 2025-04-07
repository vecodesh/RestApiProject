package com.prjgrp.artf.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class UserProfile {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String phone;
    private String address;
    private String gender;

    @OneToOne(mappedBy = "userProfile")
    @JsonBackReference
    private User user;

    public UserProfile() {}

    public UserProfile(String phone, String address, String gender, User user) {
        this.phone = phone;
        this.address = address;
        this.gender = gender;
        this.user = user;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
}

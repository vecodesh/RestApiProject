package com.prjgrp.artf.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.*;

@Entity
public class DietChart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String mealTime;  // Example: Breakfast, Lunch, Dinner
    private String foodItems; // Example: Rice, Chicken, Vegetables

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonBackReference  // Prevents infinite loop
    private User user;

    public DietChart(){
        
    }

    public DietChart(String mealTime, String foodItems){
        this.mealTime = mealTime;
        this.foodItems = foodItems;
    }

    // ✅ Add the missing setter method
    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    // Getters and Setters for other fields
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setmealTime(String mealTime) { this.mealTime = mealTime; }
    public String getmealTime() { return mealTime; }

    public void setfoodItems(String foodItems) { this.foodItems = foodItems; }
    public String getfoodItems() { return foodItems; }
}

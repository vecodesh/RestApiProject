package com.prjgrp.artf.entity;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
    private String goals;
    private int age;
    private String email;
    private int streak;
    private int weight;

   
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_id", referencedColumnName = "id")
    @JsonManagedReference
    private UserProfile
     userProfile;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<DietChart> dietCharts;
    
    public User() {}

    public User(String username, String password, String goals, int age, String email, int streak, int weight) {
        this.username = username;
        this.password = password;
        this.goals = goals;
        this.age = age;
        this.email = email;
        this.streak = streak;
        this.weight = weight;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getGoals() { return goals; }
    public void setGoals(String goals) { this.goals = goals; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public int getStreak() { return streak; }
    public void setStreak(int streak) { this.streak = streak; }

    public int getWeight() { return weight; }
    public void setWeight(int weight) { this.weight = weight; }

    public UserProfile getUserProfile() { return userProfile; }
    public void setUserProfile(UserProfile userProfile) { this.userProfile = userProfile; }
}

package com.prjgrp.artf.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idt;
    private String name;
    private int exp;
    private String email;
    public Trainer(){
        
    }

    public Trainer(int idt,String name,int exp,String email){
        this.idt=idt;
        this.name=name;
        this.exp=exp;
        this.email=email;
    }

    public void setTrainer(int idt){
        this.idt=idt;
    }

    public int getTrainer(){
        return idt;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }
    
    public void setExp(int exp){
        this.exp=exp;
    }
    
    public int getExp(){
        return exp;
    }
    
    public void setEmail(String email){
        this.email=email;
    }

    public String getEmail(){
        return email;
    }


    
}
